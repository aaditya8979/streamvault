package p6;

import androidx.annotation.Nullable;
import f6.u;
import i6.z;
import s7.a0;
import s7.m0;
import s7.q;

/* JADX INFO: compiled from: XingSeeker.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f77085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f77087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f77088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f77089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final long[] f77090f;

    public i(long j10, int i10, long j11) {
        this(j10, i10, j11, -1L, null);
    }

    public i(long j10, int i10, long j11, long j12, @Nullable long[] jArr) {
        this.f77085a = j10;
        this.f77086b = i10;
        this.f77087c = j11;
        this.f77090f = jArr;
        this.f77088d = j12;
        this.f77089e = j12 != -1 ? j10 + j12 : -1L;
    }

    @Nullable
    public static i a(long j10, long j11, u.a aVar, a0 a0Var) {
        int iH;
        int i10 = aVar.f61555g;
        int i11 = aVar.f61552d;
        int iN = a0Var.n();
        if ((iN & 1) != 1 || (iH = a0Var.H()) == 0) {
            return null;
        }
        long jF0 = m0.F0(iH, ((long) i10) * 1000000, i11);
        if ((iN & 6) != 6) {
            return new i(j11, aVar.f61551c, jF0);
        }
        long jF = a0Var.F();
        long[] jArr = new long[100];
        for (int i12 = 0; i12 < 100; i12++) {
            jArr[i12] = a0Var.D();
        }
        if (j10 != -1) {
            long j12 = j11 + jF;
            if (j10 != j12) {
                q.i("XingSeeker", "XING data size mismatch: " + j10 + ", " + j12);
            }
        }
        return new i(j11, aVar.f61551c, jF0, jF, jArr);
    }

    public final long b(int i10) {
        return (this.f77087c * ((long) i10)) / 100;
    }

    @Override // p6.g
    public long getDataEndPosition() {
        return this.f77089e;
    }

    @Override // i6.z
    public long getDurationUs() {
        return this.f77087c;
    }

    @Override // i6.z
    public z.a getSeekPoints(long j10) {
        if (!isSeekable()) {
            return new z.a(new i6.a0(0L, this.f77085a + ((long) this.f77086b)));
        }
        long jQ = m0.q(j10, 0L, this.f77087c);
        double d10 = (jQ * 100.0d) / this.f77087c;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                double d12 = ((long[]) s7.a.i(this.f77090f))[i10];
                d11 = d12 + ((d10 - ((double) i10)) * ((i10 == 99 ? 256.0d : r3[i10 + 1]) - d12));
            }
        }
        return new z.a(new i6.a0(jQ, this.f77085a + m0.q(Math.round((d11 / 256.0d) * this.f77088d), this.f77086b, this.f77088d - 1)));
    }

    @Override // p6.g
    public long getTimeUs(long j10) {
        long j11 = j10 - this.f77085a;
        if (!isSeekable() || j11 <= this.f77086b) {
            return 0L;
        }
        long[] jArr = (long[]) s7.a.i(this.f77090f);
        double d10 = (j11 * 256.0d) / this.f77088d;
        int i10 = m0.i(jArr, (long) d10, true, true);
        long jB = b(i10);
        long j12 = jArr[i10];
        int i11 = i10 + 1;
        long jB2 = b(i11);
        return jB + Math.round((j12 == (i10 == 99 ? 256L : jArr[i11]) ? 0.0d : (d10 - j12) / (r0 - j12)) * (jB2 - jB));
    }

    @Override // i6.z
    public boolean isSeekable() {
        return this.f77090f != null;
    }
}
