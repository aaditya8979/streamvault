package k4;

import a6.k0;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: DefaultExtractorInput.java */
/* JADX INFO: loaded from: classes.dex */
public final class d implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer.upstream.a f72880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f72881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f72882d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f72884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f72885g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f72883e = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f72879a = new byte[4096];

    public d(com.google.android.exoplayer.upstream.a aVar, long j10, long j11) {
        this.f72880b = aVar;
        this.f72882d = j10;
        this.f72881c = j11;
    }

    public final void a(int i10) {
        if (i10 != -1) {
            this.f72882d += (long) i10;
        }
    }

    @Override // k4.h
    public void advancePeekPosition(int i10) throws InterruptedException, IOException {
        advancePeekPosition(i10, false);
    }

    @Override // k4.h
    public boolean advancePeekPosition(int i10, boolean z10) throws InterruptedException, IOException {
        b(i10);
        int iC = this.f72885g - this.f72884f;
        while (iC < i10) {
            iC = c(this.f72883e, this.f72884f, i10, iC, z10);
            if (iC == -1) {
                return false;
            }
            this.f72885g = this.f72884f + iC;
        }
        this.f72884f += i10;
        return true;
    }

    public final void b(int i10) {
        int i11 = this.f72884f + i10;
        byte[] bArr = this.f72883e;
        if (i11 > bArr.length) {
            this.f72883e = Arrays.copyOf(this.f72883e, k0.q(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    public final int c(byte[] bArr, int i10, int i11, int i12, boolean z10) throws InterruptedException, IOException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int i13 = this.f72880b.read(bArr, i10 + i12, i11 - i12);
        if (i13 != -1) {
            return i12 + i13;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    public final int d(byte[] bArr, int i10, int i11) {
        int i12 = this.f72885g;
        if (i12 == 0) {
            return 0;
        }
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f72883e, 0, bArr, i10, iMin);
        g(iMin);
        return iMin;
    }

    public final int e(int i10) {
        int iMin = Math.min(this.f72885g, i10);
        g(iMin);
        return iMin;
    }

    public boolean f(int i10, boolean z10) throws InterruptedException, IOException {
        int iE = e(i10);
        while (iE < i10 && iE != -1) {
            iE = c(this.f72879a, -iE, Math.min(i10, this.f72879a.length + iE), iE, z10);
        }
        a(iE);
        return iE != -1;
    }

    public final void g(int i10) {
        int i11 = this.f72885g - i10;
        this.f72885g = i11;
        this.f72884f = 0;
        byte[] bArr = this.f72883e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f72883e = bArr2;
    }

    @Override // k4.h
    public long getLength() {
        return this.f72881c;
    }

    @Override // k4.h
    public long getPeekPosition() {
        return this.f72882d + ((long) this.f72884f);
    }

    @Override // k4.h
    public long getPosition() {
        return this.f72882d;
    }

    @Override // k4.h
    public int peek(byte[] bArr, int i10, int i11) throws InterruptedException, IOException {
        int iMin;
        b(i11);
        int i12 = this.f72885g;
        int i13 = this.f72884f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            iMin = c(this.f72883e, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f72885g += iMin;
        } else {
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(this.f72883e, this.f72884f, bArr, i10, iMin);
        this.f72884f += iMin;
        return iMin;
    }

    @Override // k4.h
    public void peekFully(byte[] bArr, int i10, int i11) throws InterruptedException, IOException {
        peekFully(bArr, i10, i11, false);
    }

    @Override // k4.h
    public boolean peekFully(byte[] bArr, int i10, int i11, boolean z10) throws InterruptedException, IOException {
        if (!advancePeekPosition(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f72883e, this.f72884f - i11, bArr, i10, i11);
        return true;
    }

    @Override // k4.h
    public int read(byte[] bArr, int i10, int i11) throws InterruptedException, IOException {
        int iD = d(bArr, i10, i11);
        if (iD == 0) {
            iD = c(bArr, i10, i11, 0, true);
        }
        a(iD);
        return iD;
    }

    @Override // k4.h
    public void readFully(byte[] bArr, int i10, int i11) throws InterruptedException, IOException {
        readFully(bArr, i10, i11, false);
    }

    @Override // k4.h
    public boolean readFully(byte[] bArr, int i10, int i11, boolean z10) throws InterruptedException, IOException {
        int iD = d(bArr, i10, i11);
        while (iD < i11 && iD != -1) {
            iD = c(bArr, i10, i11, iD, z10);
        }
        a(iD);
        return iD != -1;
    }

    @Override // k4.h
    public void resetPeekPosition() {
        this.f72884f = 0;
    }

    @Override // k4.h
    public int skip(int i10) throws InterruptedException, IOException {
        int iE = e(i10);
        if (iE == 0) {
            byte[] bArr = this.f72879a;
            iE = c(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        a(iE);
        return iE;
    }

    @Override // k4.h
    public void skipFully(int i10) throws InterruptedException, IOException {
        f(i10, false);
    }
}
