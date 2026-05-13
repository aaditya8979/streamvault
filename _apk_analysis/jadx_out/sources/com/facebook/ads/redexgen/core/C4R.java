package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4R, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C4R {
    public long A00;
    public long A01;
    public long A02;
    public final ThreadLocal<Long> A03 = new ThreadLocal<>();

    public C4R(long j10) {
        A07(j10);
    }

    public static long A00(long j10) {
        return (1000000 * j10) / 90000;
    }

    public static long A01(long j10) {
        return (90000 * j10) / 1000000;
    }

    public final synchronized long A02() {
        return (this.A00 == Long.MAX_VALUE || this.A00 == 9223372036854775806L) ? -9223372036854775807L : this.A00;
    }

    public final synchronized long A03() {
        return this.A01 != -9223372036854775807L ? this.A01 + this.A02 : A02();
    }

    public final synchronized long A04() {
        return this.A02;
    }

    public final synchronized long A05(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.A02 == -9223372036854775807L) {
            this.A02 = (this.A00 == 9223372036854775806L ? ((Long) C3M.A01(this.A03.get())).longValue() : this.A00) - j10;
            notifyAll();
        }
        this.A01 = j10;
        return this.A02 + j10;
    }

    public final synchronized long A06(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.A01 != -9223372036854775807L) {
            long jA01 = A01(this.A01);
            long j11 = (4294967296L + jA01) / 8589934592L;
            long j12 = ((j11 - 1) * 8589934592L) + j10;
            long j13 = (8589934592L * j11) + j10;
            if (Math.abs(j12 - jA01) >= Math.abs(j13 - jA01)) {
                j12 = j13;
            }
            j10 = j12;
        }
        return A05(A00(j10));
    }

    public final synchronized void A07(long j10) {
        this.A00 = j10;
        this.A02 = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.A01 = -9223372036854775807L;
    }
}
