package jq;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: RandomAccessFileBuffer.java */
/* JADX INFO: loaded from: classes10.dex */
public class e extends hq.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RandomAccessFile f72541n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final FileChannel f72542o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f72543p;

    @Override // hq.d
    public void I(int i10, byte b10) {
        synchronized (this.f72541n) {
            try {
                try {
                    this.f72541n.seek(i10);
                    this.f72541n.writeByte(b10);
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // hq.d
    public int J(int i10, byte[] bArr, int i11, int i12) {
        int i13;
        synchronized (this.f72541n) {
            try {
                try {
                    this.f72541n.seek(i10);
                    i13 = this.f72541n.read(bArr, i11, i12);
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i13;
    }

    @Override // hq.a, hq.d
    public int M(int i10, byte[] bArr, int i11, int i12) {
        synchronized (this.f72541n) {
            try {
                try {
                    this.f72541n.seek(i10);
                    this.f72541n.write(bArr, i11, i12);
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i12;
    }

    @Override // hq.d
    public byte Q(int i10) {
        byte b10;
        synchronized (this.f72541n) {
            try {
                try {
                    this.f72541n.seek(i10);
                    b10 = this.f72541n.readByte();
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b10;
    }

    @Override // hq.d
    public byte[] W() {
        return null;
    }

    @Override // hq.a, hq.d
    public void clear() {
        try {
            synchronized (this.f72541n) {
                super.clear();
                this.f72541n.setLength(0L);
            }
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public int d(WritableByteChannel writableByteChannel, int i10, int i11) throws IOException {
        int iTransferTo;
        synchronized (this.f72541n) {
            iTransferTo = (int) this.f72542o.transferTo(i10, i11, writableByteChannel);
        }
        return iTransferTo;
    }

    @Override // hq.d
    public int e0() {
        return this.f72543p;
    }

    @Override // hq.a, hq.d
    public byte peek() {
        byte b10;
        synchronized (this.f72541n) {
            try {
                try {
                    if (this.f63579d != this.f72541n.getFilePointer()) {
                        this.f72541n.seek(this.f63579d);
                    }
                    b10 = this.f72541n.readByte();
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b10;
    }
}
