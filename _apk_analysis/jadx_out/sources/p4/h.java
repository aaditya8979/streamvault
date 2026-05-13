package p4;

import a6.k0;
import a6.m;
import a6.t;
import androidx.annotation.Nullable;
import k4.q;
import k4.s;

/* JADX INFO: compiled from: XingSeeker.java */
/* JADX INFO: loaded from: classes10.dex */
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f76988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f76989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f76990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f76991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f76992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final long[] f76993f;

    public h(long j10, int i10, long j11) {
        this(j10, i10, j11, -1L, null);
    }

    public h(long j10, int i10, long j11, long j12, @Nullable long[] jArr) {
        this.f76988a = j10;
        this.f76989b = i10;
        this.f76990c = j11;
        this.f76993f = jArr;
        this.f76991d = j12;
        this.f76992e = j12 != -1 ? j10 + j12 : -1L;
    }

    @Nullable
    public static h a(long j10, long j11, q qVar, t tVar) {
        int iC;
        int i10 = qVar.f72917g;
        int i11 = qVar.f72914d;
        int iJ = tVar.j();
        if ((iJ & 1) != 1 || (iC = tVar.C()) == 0) {
            return null;
        }
        long jY0 = k0.y0(iC, ((long) i10) * 1000000, i11);
        if ((iJ & 6) != 6) {
            return new h(j11, qVar.f72913c, jY0);
        }
        long jA = tVar.A();
        long[] jArr = new long[100];
        for (int i12 = 0; i12 < 100; i12++) {
            jArr[i12] = tVar.y();
        }
        if (j10 != -1) {
            long j12 = j11 + jA;
            if (j10 != j12) {
                m.h("XingSeeker", "XING data size mismatch: " + j10 + ", " + j12);
            }
        }
        return new h(j11, qVar.f72913c, jY0, jA, jArr);
    }

    public final long b(int i10) {
        return (this.f76990c * ((long) i10)) / 100;
    }

    @Override // p4.f
    public long getDataEndPosition() {
        return this.f76992e;
    }

    @Override // k4.s
    public long getDurationUs() {
        return this.f76990c;
    }

    @Override // k4.s
    public s.a getSeekPoints(long j10) {
        if (!isSeekable()) {
            return new s.a(new k4.t(0L, this.f76988a + ((long) this.f76989b)));
        }
        long jR = k0.r(j10, 0L, this.f76990c);
        double d10 = (jR * 100.0d) / this.f76990c;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                double d12 = ((long[]) a6.a.e(this.f76993f))[i10];
                d11 = d12 + ((d10 - ((double) i10)) * ((i10 == 99 ? 256.0d : r3[i10 + 1]) - d12));
            }
        }
        return new s.a(new k4.t(jR, this.f76988a + k0.r(Math.round((d11 / 256.0d) * this.f76991d), this.f76989b, this.f76991d - 1)));
    }

    @Override // p4.f
    public long getTimeUs(long j10) {
        long j11 = j10 - this.f76988a;
        if (!isSeekable() || j11 <= this.f76989b) {
            return 0L;
        }
        long[] jArr = (long[]) a6.a.e(this.f76993f);
        double d10 = (j11 * 256.0d) / this.f76991d;
        int iH = k0.h(jArr, (long) d10, true, true);
        long jB = b(iH);
        long j12 = jArr[iH];
        int i10 = iH + 1;
        long jB2 = b(i10);
        return jB + Math.round((j12 == (iH == 99 ? 256L : jArr[i10]) ? 0.0d : (d10 - j12) / (r0 - j12)) * (jB2 - jB));
    }

    @Override // k4.s
    public boolean isSeekable() {
        return this.f76993f != null;
    }
}
