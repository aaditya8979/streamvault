package i6;

import d6.x0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import s7.m0;

/* JADX INFO: compiled from: DefaultExtractorInput.java */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r7.f f63869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f63870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f63871d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f63873f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f63874g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f63872e = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f63868a = new byte[4096];

    static {
        x0.a("goog.exo.extractor");
    }

    public e(r7.f fVar, long j10, long j11) {
        this.f63869b = fVar;
        this.f63871d = j10;
        this.f63870c = j11;
    }

    @Override // i6.l
    public void advancePeekPosition(int i10) throws IOException {
        advancePeekPosition(i10, false);
    }

    @Override // i6.l
    public boolean advancePeekPosition(int i10, boolean z10) throws IOException {
        d(i10);
        int iF = this.f63874g - this.f63873f;
        while (iF < i10) {
            iF = f(this.f63872e, this.f63873f, i10, iF, z10);
            if (iF == -1) {
                return false;
            }
            this.f63874g = this.f63873f + iF;
        }
        this.f63873f += i10;
        return true;
    }

    public final void c(int i10) {
        if (i10 != -1) {
            this.f63871d += (long) i10;
        }
    }

    public final void d(int i10) {
        int i11 = this.f63873f + i10;
        byte[] bArr = this.f63872e;
        if (i11 > bArr.length) {
            this.f63872e = Arrays.copyOf(this.f63872e, m0.p(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    public final int e(byte[] bArr, int i10, int i11) {
        int i12 = this.f63874g;
        if (i12 == 0) {
            return 0;
        }
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f63872e, 0, bArr, i10, iMin);
        i(iMin);
        return iMin;
    }

    public final int f(byte[] bArr, int i10, int i11, int i12, boolean z10) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i13 = this.f63869b.read(bArr, i10 + i12, i11 - i12);
        if (i13 != -1) {
            return i12 + i13;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    public final int g(int i10) {
        int iMin = Math.min(this.f63874g, i10);
        i(iMin);
        return iMin;
    }

    @Override // i6.l
    public long getLength() {
        return this.f63870c;
    }

    @Override // i6.l
    public long getPeekPosition() {
        return this.f63871d + ((long) this.f63873f);
    }

    @Override // i6.l
    public long getPosition() {
        return this.f63871d;
    }

    public boolean h(int i10, boolean z10) throws IOException {
        int iG = g(i10);
        while (iG < i10 && iG != -1) {
            iG = f(this.f63868a, -iG, Math.min(i10, this.f63868a.length + iG), iG, z10);
        }
        c(iG);
        return iG != -1;
    }

    public final void i(int i10) {
        int i11 = this.f63874g - i10;
        this.f63874g = i11;
        this.f63873f = 0;
        byte[] bArr = this.f63872e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f63872e = bArr2;
    }

    @Override // i6.l
    public int peek(byte[] bArr, int i10, int i11) throws IOException {
        int iMin;
        d(i11);
        int i12 = this.f63874g;
        int i13 = this.f63873f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            iMin = f(this.f63872e, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f63874g += iMin;
        } else {
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(this.f63872e, this.f63873f, bArr, i10, iMin);
        this.f63873f += iMin;
        return iMin;
    }

    @Override // i6.l
    public void peekFully(byte[] bArr, int i10, int i11) throws IOException {
        peekFully(bArr, i10, i11, false);
    }

    @Override // i6.l
    public boolean peekFully(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        if (!advancePeekPosition(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f63872e, this.f63873f - i11, bArr, i10, i11);
        return true;
    }

    @Override // i6.l, r7.f
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int iE = e(bArr, i10, i11);
        if (iE == 0) {
            iE = f(bArr, i10, i11, 0, true);
        }
        c(iE);
        return iE;
    }

    @Override // i6.l
    public void readFully(byte[] bArr, int i10, int i11) throws IOException {
        readFully(bArr, i10, i11, false);
    }

    @Override // i6.l
    public boolean readFully(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        int iE = e(bArr, i10, i11);
        while (iE < i11 && iE != -1) {
            iE = f(bArr, i10, i11, iE, z10);
        }
        c(iE);
        return iE != -1;
    }

    @Override // i6.l
    public void resetPeekPosition() {
        this.f63873f = 0;
    }

    @Override // i6.l
    public int skip(int i10) throws IOException {
        int iG = g(i10);
        if (iG == 0) {
            byte[] bArr = this.f63868a;
            iG = f(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        c(iG);
        return iG;
    }

    @Override // i6.l
    public void skipFully(int i10) throws IOException {
        h(i10, false);
    }
}
