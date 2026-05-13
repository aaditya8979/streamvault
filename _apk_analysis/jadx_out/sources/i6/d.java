package i6;

import i6.z;

/* JADX INFO: compiled from: ConstantBitrateSeekMap.java */
/* JADX INFO: loaded from: classes4.dex */
public class d implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f63857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f63858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f63859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f63860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f63861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f63862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f63863g;

    public d(long j10, long j11, int i10, int i11, boolean z10) {
        this.f63857a = j10;
        this.f63858b = j11;
        this.f63859c = i11 == -1 ? 1 : i11;
        this.f63861e = i10;
        this.f63863g = z10;
        if (j10 == -1) {
            this.f63860d = -1L;
            this.f63862f = -9223372036854775807L;
        } else {
            this.f63860d = j10 - j11;
            this.f63862f = c(j10, j11, i10);
        }
    }

    public static long c(long j10, long j11, int i10) {
        return ((Math.max(0L, j10 - j11) * 8) * 1000000) / ((long) i10);
    }

    public final long a(long j10) {
        long j11 = (j10 * ((long) this.f63861e)) / 8000000;
        int i10 = this.f63859c;
        long jMin = (j11 / ((long) i10)) * ((long) i10);
        long j12 = this.f63860d;
        if (j12 != -1) {
            jMin = Math.min(jMin, j12 - ((long) i10));
        }
        return this.f63858b + Math.max(jMin, 0L);
    }

    public long b(long j10) {
        return c(j10, this.f63858b, this.f63861e);
    }

    @Override // i6.z
    public long getDurationUs() {
        return this.f63862f;
    }

    @Override // i6.z
    public z.a getSeekPoints(long j10) {
        if (this.f63860d == -1 && !this.f63863g) {
            return new z.a(new a0(0L, this.f63858b));
        }
        long jA = a(j10);
        long jB = b(jA);
        a0 a0Var = new a0(jB, jA);
        if (this.f63860d != -1 && jB < j10) {
            int i10 = this.f63859c;
            if (((long) i10) + jA < this.f63857a) {
                long j11 = jA + ((long) i10);
                return new z.a(a0Var, new a0(b(j11), j11));
            }
        }
        return new z.a(a0Var);
    }

    @Override // i6.z
    public boolean isSeekable() {
        return this.f63860d != -1 || this.f63863g;
    }
}
