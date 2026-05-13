package a6;

/* JADX INFO: compiled from: TimestampAdjuster.java */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f3548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f3550c = -9223372036854775807L;

    public g0(long j10) {
        h(j10);
    }

    public static long f(long j10) {
        return (j10 * 1000000) / 90000;
    }

    public static long i(long j10) {
        return (j10 * 90000) / 1000000;
    }

    public long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f3550c != -9223372036854775807L) {
            this.f3550c = j10;
        } else {
            long j11 = this.f3548a;
            if (j11 != Long.MAX_VALUE) {
                this.f3549b = j11 - j10;
            }
            synchronized (this) {
                this.f3550c = j10;
                notifyAll();
            }
        }
        return j10 + this.f3549b;
    }

    public long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f3550c != -9223372036854775807L) {
            long jI = i(this.f3550c);
            long j11 = (4294967296L + jI) / 8589934592L;
            long j12 = ((j11 - 1) * 8589934592L) + j10;
            j10 += j11 * 8589934592L;
            if (Math.abs(j12 - jI) < Math.abs(j10 - jI)) {
                j10 = j12;
            }
        }
        return a(f(j10));
    }

    public long c() {
        return this.f3548a;
    }

    public long d() {
        if (this.f3550c != -9223372036854775807L) {
            return this.f3549b + this.f3550c;
        }
        long j10 = this.f3548a;
        if (j10 != Long.MAX_VALUE) {
            return j10;
        }
        return -9223372036854775807L;
    }

    public long e() {
        if (this.f3548a == Long.MAX_VALUE) {
            return 0L;
        }
        if (this.f3550c == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f3549b;
    }

    public void g() {
        this.f3550c = -9223372036854775807L;
    }

    public synchronized void h(long j10) {
        a.f(this.f3550c == -9223372036854775807L);
        this.f3548a = j10;
    }

    public synchronized void j() throws InterruptedException {
        while (this.f3550c == -9223372036854775807L) {
            wait();
        }
    }
}
