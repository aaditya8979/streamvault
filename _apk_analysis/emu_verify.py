"""
Unicorn Engine emulator for libpp_hls.so
Attempts to emulate the JNI_OnLoad and find the verify/sign function.
"""
import struct
from unicorn import *
from unicorn.arm64_const import *
from capstone import *

# Load the .so binary
SO_PATH = "extracted/lib/arm64-v8a/libpp_hls.so"
with open(SO_PATH, "rb") as f:
    so_data = f.read()

print(f"Loaded libpp_hls.so: {len(so_data)} bytes")

# Parse ELF to find loadable segments
# Simple ELF64 header parsing
assert so_data[:4] == b'\x7fELF', "Not an ELF file"
e_phoff = struct.unpack_from('<Q', so_data, 32)[0]  # Program header offset
e_phentsize = struct.unpack_from('<H', so_data, 54)[0]
e_phnum = struct.unpack_from('<H', so_data, 56)[0]

print(f"Program headers: {e_phnum} entries at offset {e_phoff}")

segments = []
for i in range(e_phnum):
    off = e_phoff + i * e_phentsize
    p_type = struct.unpack_from('<I', so_data, off)[0]
    p_flags = struct.unpack_from('<I', so_data, off + 4)[0]
    p_offset = struct.unpack_from('<Q', so_data, off + 8)[0]
    p_vaddr = struct.unpack_from('<Q', so_data, off + 16)[0]
    p_filesz = struct.unpack_from('<Q', so_data, off + 32)[0]
    p_memsz = struct.unpack_from('<Q', so_data, off + 40)[0]
    
    if p_type == 1:  # PT_LOAD
        segments.append({
            'offset': p_offset,
            'vaddr': p_vaddr,
            'filesz': p_filesz,
            'memsz': p_memsz,
            'flags': p_flags
        })
        print(f"  LOAD: vaddr=0x{p_vaddr:x} filesz=0x{p_filesz:x} memsz=0x{p_memsz:x}")

# Initialize Unicorn for AArch64
mu = Uc(UC_ARCH_ARM64, UC_MODE_ARM)

# Map the .so at a base address
BASE = 0x10000000
for seg in segments:
    addr = BASE + seg['vaddr']
    size = ((seg['memsz'] + 0xFFF) // 0x1000) * 0x1000  # Page-align
    try:
        mu.mem_map(addr, size, UC_PROT_ALL)
        mu.mem_write(addr, so_data[seg['offset']:seg['offset'] + seg['filesz']])
    except UcError:
        pass  # Already mapped (overlapping segments)

# Map stack
STACK_BASE = 0x80000000
STACK_SIZE = 0x100000
mu.mem_map(STACK_BASE, STACK_SIZE, UC_PROT_ALL)
mu.reg_write(UC_ARM64_REG_SP, STACK_BASE + STACK_SIZE - 0x100)

# Map heap for strings
HEAP_BASE = 0x90000000
HEAP_SIZE = 0x100000
mu.mem_map(HEAP_BASE, HEAP_SIZE, UC_PROT_ALL)

# Use capstone to disassemble
md = Cs(CS_ARCH_ARM64, CS_MODE_ARM)

# JNI_OnLoad is at offset 0xe7c34
JNI_ONLOAD = BASE + 0xe7c34

# Disassemble the interpreter_wrap function to understand the VM
# The interpreter is called from JNI_OnLoad at offset 0xe7c64
# Let's find what function is at the call target
INTERP_CALL = BASE + 0xe7c64

# Read the BL instruction at 0xe7c64
bl_bytes = mu.mem_read(INTERP_CALL, 4)
bl_insn = struct.unpack('<I', bytes(bl_bytes))[0]

# BL instruction: bits[25:0] is the signed offset (in words)
if (bl_insn >> 26) == 0x25:  # BL opcode
    offset = bl_insn & 0x3FFFFFF
    if offset & 0x2000000:  # Sign extend
        offset |= ~0x3FFFFFF
    target = INTERP_CALL + (offset * 4)
    print(f"\nInterpreter function at: 0x{target - BASE:x}")
    
    # Disassemble first 20 instructions of the interpreter
    interp_bytes = bytes(mu.mem_read(target, 200))
    print("Interpreter disassembly:")
    for insn in md.disasm(interp_bytes, target):
        print(f"  0x{insn.address:x}: {insn.mnemonic}\t{insn.op_str}")
else:
    print(f"Not a BL instruction at 0xe7c64: {bl_insn:08x}")

# Look for the UMD5 string in the mapped memory
print("\nSearching for UMD5 string...")
UMD5_OFFSET = 0x160ee7
umd5_area = bytes(mu.mem_read(BASE + UMD5_OFFSET - 16, 64))
print(f"Around UMD5 (0x{UMD5_OFFSET:x}):")
print(f"  {umd5_area}")

# Try to find function table entries (the obfuscated trampolines)
# Each is 0x34 bytes. Let's disassemble a few to understand the pattern
print("\nDisassembling sample trampoline functions:")
TRAMPOLINES = [0xa18d4, 0xa2fc8, 0xa340c]  # First 3 exported functions
for addr_off in TRAMPOLINES:
    addr = BASE + addr_off
    code = bytes(mu.mem_read(addr, 0x34))
    print(f"\n  Function at 0x{addr_off:x}:")
    for insn in md.disasm(code, addr):
        print(f"    0x{insn.address:x}: {insn.mnemonic}\t{insn.op_str}")
