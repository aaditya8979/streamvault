package co;

import co.b;
import com.ironsource.Ne;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: longSaturatedMath.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class g {
    public static final long a(long j10) {
        return j10 < 0 ? b.f6773c.b() : b.f6773c.a();
    }

    public static final long b(long j10, long j11, @NotNull DurationUnit durationUnit) {
        p.k(durationUnit, Ne.f29954n1);
        return ((1 | (j11 - 1)) > Long.MAX_VALUE ? 1 : ((1 | (j11 - 1)) == Long.MAX_VALUE ? 0 : -1)) == 0 ? b.N(a(j11)) : c(j10, j11, durationUnit);
    }

    public static final long c(long j10, long j11, DurationUnit durationUnit) {
        long j12 = j10 - j11;
        if (((j12 ^ j10) & (~(j12 ^ j11))) >= 0) {
            return d.t(j12, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return b.N(a(j12));
        }
        long jB = e.b(1L, durationUnit2, durationUnit);
        long j13 = (j10 / jB) - (j11 / jB);
        long j14 = (j10 % jB) - (j11 % jB);
        b.a aVar = b.f6773c;
        return b.H(d.t(j13, durationUnit2), d.t(j14, durationUnit));
    }

    public static final long d(long j10, long j11, @NotNull DurationUnit durationUnit) {
        p.k(durationUnit, Ne.f29954n1);
        if (((j11 - 1) | 1) == Long.MAX_VALUE) {
            return j10 == j11 ? b.f6773c.c() : b.N(a(j11));
        }
        return (1 | (j10 - 1)) == Long.MAX_VALUE ? a(j10) : c(j10, j11, durationUnit);
    }
}
