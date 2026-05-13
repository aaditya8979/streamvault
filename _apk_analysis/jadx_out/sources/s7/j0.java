package s7;

import androidx.annotation.GuardedBy;

/* JADX INFO: compiled from: TimestampAdjuster.java */
/* JADX INFO: loaded from: classes10.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @GuardedBy("this")
    public long f79479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    public long f79480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("this")
    public long f79481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal<Long> f79482d = new ThreadLocal<>();

    public j0(long j10) {
        g(j10);
    }

    public static long f(long j10) {
        return (j10 * 1000000) / 90000;
    }

    public static long h(long j10) {
        return (j10 * 90000) / 1000000;
    }

    public synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f79480b == -9223372036854775807L) {
            long jLongValue = this.f79479a;
            if (jLongValue == 9223372036854775806L) {
                jLongValue = ((Long) a.e(this.f79482d.get())).longValue();
            }
            this.f79480b = jLongValue - j10;
            notifyAll();
        }
        this.f79481c = j10;
        return j10 + this.f79480b;
    }

    public synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = this.f79481c;
        if (j11 != -9223372036854775807L) {
            long jH = h(j11);
            long j12 = (4294967296L + jH) / 8589934592L;
            long j13 = ((j12 - 1) * 8589934592L) + j10;
            j10 += j12 * 8589934592L;
            if (Math.abs(j13 - jH) < Math.abs(j10 - jH)) {
                j10 = j13;
            }
        }
        return a(f(j10));
    }

    public synchronized long c() {
        long j10;
        j10 = this.f79479a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = -9223372036854775807L;
        }
        return j10;
    }

    public synchronized long d() {
        long j10;
        j10 = this.f79481c;
        return j10 != -9223372036854775807L ? j10 + this.f79480b : c();
    }

    public synchronized long e() {
        return this.f79480b;
    }

    public synchronized void g(long j10) {
        this.f79479a = j10;
        this.f79480b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f79481c = -9223372036854775807L;
    }
}
