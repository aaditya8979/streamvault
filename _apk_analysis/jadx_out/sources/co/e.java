package co;

import java.util.concurrent.TimeUnit;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: DurationUnitJvm.kt */
/* JADX INFO: loaded from: classes6.dex */
public class e {
    public static final double a(double d10, @NotNull DurationUnit durationUnit, @NotNull DurationUnit durationUnit2) {
        p.k(durationUnit, "sourceUnit");
        p.k(durationUnit2, "targetUnit");
        long jConvert = durationUnit2.getTimeUnit$kotlin_stdlib().convert(1L, durationUnit.getTimeUnit$kotlin_stdlib());
        return jConvert > 0 ? d10 * jConvert : d10 / durationUnit.getTimeUnit$kotlin_stdlib().convert(1L, durationUnit2.getTimeUnit$kotlin_stdlib());
    }

    public static final long b(long j10, @NotNull DurationUnit durationUnit, @NotNull DurationUnit durationUnit2) {
        p.k(durationUnit, "sourceUnit");
        p.k(durationUnit2, "targetUnit");
        return durationUnit2.getTimeUnit$kotlin_stdlib().convert(j10, durationUnit.getTimeUnit$kotlin_stdlib());
    }

    public static final long c(long j10, @NotNull DurationUnit durationUnit, @NotNull DurationUnit durationUnit2) {
        p.k(durationUnit, "sourceUnit");
        p.k(durationUnit2, "targetUnit");
        return durationUnit2.getTimeUnit$kotlin_stdlib().convert(j10, durationUnit.getTimeUnit$kotlin_stdlib());
    }

    @NotNull
    public static final TimeUnit d(@NotNull DurationUnit durationUnit) {
        p.k(durationUnit, "<this>");
        return durationUnit.getTimeUnit$kotlin_stdlib();
    }
}
