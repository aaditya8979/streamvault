package k4;

import a6.k0;
import k4.s;

/* JADX INFO: compiled from: ConstantBitrateSeekMap.java */
/* JADX INFO: loaded from: classes.dex */
public class c implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f72873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f72874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f72875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f72876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f72877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f72878f;

    public c(long j10, long j11, int i10, int i11) {
        this.f72873a = j10;
        this.f72874b = j11;
        this.f72875c = i11 == -1 ? 1 : i11;
        this.f72877e = i10;
        if (j10 == -1) {
            this.f72876d = -1L;
            this.f72878f = -9223372036854775807L;
        } else {
            this.f72876d = j10 - j11;
            this.f72878f = c(j10, j11, i10);
        }
    }

    public static long c(long j10, long j11, int i10) {
        return ((Math.max(0L, j10 - j11) * 8) * 1000000) / ((long) i10);
    }

    public final long a(long j10) {
        long j11 = (j10 * ((long) this.f72877e)) / 8000000;
        int i10 = this.f72875c;
        return this.f72874b + k0.r((j11 / ((long) i10)) * ((long) i10), 0L, this.f72876d - ((long) i10));
    }

    public long b(long j10) {
        return c(j10, this.f72874b, this.f72877e);
    }

    @Override // k4.s
    public long getDurationUs() {
        return this.f72878f;
    }

    @Override // k4.s
    public s.a getSeekPoints(long j10) {
        if (this.f72876d == -1) {
            return new s.a(new t(0L, this.f72874b));
        }
        long jA = a(j10);
        long jB = b(jA);
        t tVar = new t(jB, jA);
        if (jB < j10) {
            int i10 = this.f72875c;
            if (((long) i10) + jA < this.f72873a) {
                long j11 = jA + ((long) i10);
                return new s.a(tVar, new t(b(j11), j11));
            }
        }
        return new s.a(tVar);
    }

    @Override // k4.s
    public boolean isSeekable() {
        return this.f72876d != -1;
    }
}
