package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class ld0 implements nq0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l30 f91936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f91937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f91938d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f91940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f91941g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f91939e = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f91935a = new byte[4096];

    static {
        ho0.a("goog.exo.extractor");
    }

    public ld0(p30 p30Var, long j10, long j11) {
        this.f91936b = p30Var;
        this.f91938d = j10;
        this.f91937c = j11;
    }

    public final int a(byte[] bArr, int i10, int i11, int i12, boolean z10) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i13 = this.f91936b.read(bArr, i10 + i12, i11 - i12);
        if (i13 != -1) {
            return i12 + i13;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // yads.nq0
    public final long a() {
        return this.f91938d;
    }

    @Override // yads.nq0
    public final void a(int i10) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f91941g, i10);
        d(iMin);
        int iA = iMin;
        while (iA < i10 && iA != -1) {
            iA = a(this.f91935a, -iA, Math.min(i10, this.f91935a.length + iA), iA, false);
        }
        if (iA != -1) {
            this.f91938d += (long) iA;
        }
    }

    @Override // yads.nq0
    public final void a(byte[] bArr, int i10, int i11) {
        b(bArr, i10, i11, false);
    }

    public final boolean a(boolean z10, int i10) throws EOFException, InterruptedIOException {
        int i11 = this.f91940f + i10;
        byte[] bArr = this.f91939e;
        if (i11 > bArr.length) {
            int i12 = ib3.f90737a;
            this.f91939e = Arrays.copyOf(this.f91939e, Math.max(65536 + i11, Math.min(bArr.length * 2, i11 + 524288)));
        }
        int iA = this.f91941g - this.f91940f;
        while (iA < i10) {
            iA = a(this.f91939e, this.f91940f, i10, iA, z10);
            if (iA == -1) {
                return false;
            }
            this.f91941g = this.f91940f + iA;
        }
        this.f91940f += i10;
        return true;
    }

    @Override // yads.nq0
    public final boolean a(byte[] bArr, int i10, int i11, boolean z10) throws EOFException, InterruptedIOException {
        int iA;
        int i12 = this.f91941g;
        if (i12 == 0) {
            iA = 0;
        } else {
            int iMin = Math.min(i12, i11);
            System.arraycopy(this.f91939e, 0, bArr, i10, iMin);
            d(iMin);
            iA = iMin;
        }
        while (iA < i11 && iA != -1) {
            iA = a(bArr, i10, i11, iA, z10);
        }
        if (iA != -1) {
            this.f91938d += (long) iA;
        }
        return iA != -1;
    }

    public final int b(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        int iMin;
        int i12 = this.f91940f + i11;
        byte[] bArr2 = this.f91939e;
        if (i12 > bArr2.length) {
            int i13 = ib3.f90737a;
            this.f91939e = Arrays.copyOf(this.f91939e, Math.max(65536 + i12, Math.min(bArr2.length * 2, i12 + 524288)));
        }
        int i14 = this.f91941g;
        int i15 = this.f91940f;
        int i16 = i14 - i15;
        if (i16 == 0) {
            iMin = a(this.f91939e, i15, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f91941g += iMin;
        } else {
            iMin = Math.min(i11, i16);
        }
        System.arraycopy(this.f91939e, this.f91940f, bArr, i10, iMin);
        this.f91940f += iMin;
        return iMin;
    }

    @Override // yads.nq0
    public final void b() {
        this.f91940f = 0;
    }

    @Override // yads.nq0
    public final void b(int i10) throws EOFException, InterruptedIOException {
        a(false, i10);
    }

    @Override // yads.nq0
    public final boolean b(byte[] bArr, int i10, int i11, boolean z10) {
        if (!a(z10, i11)) {
            return false;
        }
        System.arraycopy(this.f91939e, this.f91940f - i11, bArr, i10, i11);
        return true;
    }

    public final int c(int i10) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f91941g, i10);
        d(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f91935a;
            iMin = a(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        if (iMin != -1) {
            this.f91938d += (long) iMin;
        }
        return iMin;
    }

    @Override // yads.nq0
    public final long c() {
        return this.f91938d + ((long) this.f91940f);
    }

    public final void d(int i10) {
        int i11 = this.f91941g - i10;
        this.f91941g = i11;
        this.f91940f = 0;
        byte[] bArr = this.f91939e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f91939e = bArr2;
    }

    @Override // yads.nq0
    public final long getLength() {
        return this.f91937c;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        int i12 = this.f91941g;
        int iA = 0;
        if (i12 != 0) {
            int iMin = Math.min(i12, i11);
            System.arraycopy(this.f91939e, 0, bArr, i10, iMin);
            d(iMin);
            iA = iMin;
        }
        if (iA == 0) {
            iA = a(bArr, i10, i11, 0, true);
        }
        if (iA != -1) {
            this.f91938d += (long) iA;
        }
        return iA;
    }

    @Override // yads.nq0
    public final void readFully(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        a(bArr, i10, i11, false);
    }
}
