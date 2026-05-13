package okio;

import cn.d;
import java.io.IOException;
import java.util.List;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;
import tn.i;

/* JADX INFO: compiled from: Options.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class Options extends d<ByteString> implements RandomAccess {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final ByteString[] byteStrings;

    @NotNull
    private final int[] trie;

    /* JADX INFO: compiled from: Options.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        private final void buildTrieRecursive(long j10, Buffer buffer, int i10, List<? extends ByteString> list, int i11, int i12, List<Integer> list2) throws IOException {
            int i13;
            int i14;
            int i15;
            int i16;
            Buffer buffer2;
            int i17 = i10;
            if (!(i11 < i12)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i18 = i11; i18 < i12; i18++) {
                if (!(list.get(i18).size() >= i17)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            ByteString byteString = list.get(i11);
            ByteString byteString2 = list.get(i12 - 1);
            int i19 = -1;
            if (i17 == byteString.size()) {
                int iIntValue = list2.get(i11).intValue();
                int i20 = i11 + 1;
                ByteString byteString3 = list.get(i20);
                i13 = i20;
                i14 = iIntValue;
                byteString = byteString3;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (byteString.getByte(i17) == byteString2.getByte(i17)) {
                int iMin = Math.min(byteString.size(), byteString2.size());
                int i21 = 0;
                for (int i22 = i17; i22 < iMin && byteString.getByte(i22) == byteString2.getByte(i22); i22++) {
                    i21++;
                }
                long intCount = j10 + getIntCount(buffer) + ((long) 2) + ((long) i21) + 1;
                buffer.writeInt(-i21);
                buffer.writeInt(i14);
                int i23 = i17 + i21;
                while (i17 < i23) {
                    buffer.writeInt(byteString.getByte(i17) & 255);
                    i17++;
                }
                if (i13 + 1 == i12) {
                    if (!(i23 == list.get(i13).size())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    buffer.writeInt(list2.get(i13).intValue());
                    return;
                } else {
                    Buffer buffer3 = new Buffer();
                    buffer.writeInt(((int) (getIntCount(buffer3) + intCount)) * (-1));
                    buildTrieRecursive(intCount, buffer3, i23, list, i13, i12, list2);
                    buffer.writeAll(buffer3);
                    return;
                }
            }
            int i24 = 1;
            for (int i25 = i13 + 1; i25 < i12; i25++) {
                if (list.get(i25 - 1).getByte(i17) != list.get(i25).getByte(i17)) {
                    i24++;
                }
            }
            long intCount2 = j10 + getIntCount(buffer) + ((long) 2) + ((long) (i24 * 2));
            buffer.writeInt(i24);
            buffer.writeInt(i14);
            for (int i26 = i13; i26 < i12; i26++) {
                byte b10 = list.get(i26).getByte(i17);
                if (i26 == i13 || b10 != list.get(i26 - 1).getByte(i17)) {
                    buffer.writeInt(b10 & 255);
                }
            }
            Buffer buffer4 = new Buffer();
            while (i13 < i12) {
                byte b11 = list.get(i13).getByte(i17);
                int i27 = i13 + 1;
                int i28 = i27;
                while (true) {
                    if (i28 >= i12) {
                        i15 = i12;
                        break;
                    } else {
                        if (b11 != list.get(i28).getByte(i17)) {
                            i15 = i28;
                            break;
                        }
                        i28++;
                    }
                }
                if (i27 == i15 && i17 + 1 == list.get(i13).size()) {
                    buffer.writeInt(list2.get(i13).intValue());
                    i16 = i15;
                    buffer2 = buffer4;
                } else {
                    buffer.writeInt(((int) (intCount2 + getIntCount(buffer4))) * i19);
                    i16 = i15;
                    buffer2 = buffer4;
                    buildTrieRecursive(intCount2, buffer4, i17 + 1, list, i13, i15, list2);
                }
                buffer4 = buffer2;
                i13 = i16;
                i19 = -1;
            }
            buffer.writeAll(buffer4);
        }

        public static /* synthetic */ void buildTrieRecursive$default(Companion companion, long j10, Buffer buffer, int i10, List list, int i11, int i12, List list2, int i13, Object obj) throws IOException {
            companion.buildTrieRecursive((i13 & 1) != 0 ? 0L : j10, buffer, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        private final long getIntCount(Buffer buffer) {
            return buffer.size() / ((long) 4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:54:0x00e9, code lost:
        
            continue;
         */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final okio.Options of(@org.jetbrains.annotations.NotNull okio.ByteString... r17) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 320
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.Options.Companion.of(okio.ByteString[]):okio.Options");
        }
    }

    private Options(ByteString[] byteStringArr, int[] iArr) {
        this.byteStrings = byteStringArr;
        this.trie = iArr;
    }

    public /* synthetic */ Options(ByteString[] byteStringArr, int[] iArr, i iVar) {
        this(byteStringArr, iArr);
    }

    @NotNull
    public static final Options of(@NotNull ByteString... byteStringArr) {
        return Companion.of(byteStringArr);
    }

    @Override // cn.b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return contains((ByteString) obj);
        }
        return false;
    }

    public /* bridge */ boolean contains(ByteString byteString) {
        return super.contains((Object) byteString);
    }

    @Override // cn.d, java.util.List
    @NotNull
    public ByteString get(int i10) {
        return this.byteStrings[i10];
    }

    @NotNull
    public final ByteString[] getByteStrings$okio() {
        return this.byteStrings;
    }

    @Override // cn.d, cn.b
    public int getSize() {
        return this.byteStrings.length;
    }

    @NotNull
    public final int[] getTrie$okio() {
        return this.trie;
    }

    @Override // cn.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return indexOf((ByteString) obj);
        }
        return -1;
    }

    public /* bridge */ int indexOf(ByteString byteString) {
        return super.indexOf((Object) byteString);
    }

    @Override // cn.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return lastIndexOf((ByteString) obj);
        }
        return -1;
    }

    public /* bridge */ int lastIndexOf(ByteString byteString) {
        return super.lastIndexOf((Object) byteString);
    }
}
