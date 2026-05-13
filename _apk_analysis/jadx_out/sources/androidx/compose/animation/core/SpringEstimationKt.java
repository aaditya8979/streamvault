package androidx.compose.animation.core;

import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import sn.l;

/* JADX INFO: compiled from: SpringEstimation.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u000b\u001a4\u0010\f\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\u001a<\u0010\u0012\u001a\u00020\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\u001a4\u0010\u0014\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\u001a4\u0010\u0015\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\u001a9\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0019H\u0082\b\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0003H\u0082\b¨\u0006\u001d"}, d2 = {"estimateAnimationDurationMillis", "", "stiffness", "", "dampingRatio", "initialVelocity", "initialDisplacement", "delta", "springConstant", "dampingCoefficient", "mass", "", "estimateCriticallyDamped", "roots", "Lkotlin/Pair;", "Landroidx/compose/animation/core/ComplexDouble;", "p0", "v0", "estimateDurationInternal", "initialPosition", "estimateOverDamped", "estimateUnderDamped", "iterateNewtonsMethod", VastAttributes.HORIZONTAL_POSITION, "fn", "Lkotlin/Function1;", "fnPrime", "isNotFinite", "", "animation-core_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class SpringEstimationKt {
    public static final long estimateAnimationDurationMillis(double d10, double d11, double d12, double d13, double d14) {
        return estimateDurationInternal(ComplexDoubleKt.complexQuadraticFormula(1.0d, 2.0d * d11 * Math.sqrt(d10), d10), d11, d12, d13, d14);
    }

    public static final long estimateAnimationDurationMillis(double d10, double d11, double d12, double d13, double d14, double d15) {
        return estimateDurationInternal(ComplexDoubleKt.complexQuadraticFormula(d12, d11, d10), d11 / (Math.sqrt(d10 * d12) * 2.0d), d13, d14, d15);
    }

    public static final long estimateAnimationDurationMillis(float f10, float f11, float f12, float f13, float f14) {
        return estimateAnimationDurationMillis(f10, f11, f12, f13, f14);
    }

    private static final double estimateCriticallyDamped(Pair<ComplexDouble, ComplexDouble> pair, final double d10, double d11, double d12) {
        double d13;
        final double d14;
        final double real = pair.getFirst().getReal();
        double d15 = real * d10;
        final double d16 = d11 - d15;
        double dLog = Math.log(Math.abs(d12 / d10)) / real;
        double dEstimateCriticallyDamped$t2Iterate = estimateCriticallyDamped$t2Iterate(Math.log(Math.abs(d12 / d16)), real) / real;
        int i10 = 0;
        if (!((Double.isInfinite(dLog) || Double.isNaN(dLog)) ? false : true)) {
            d13 = dEstimateCriticallyDamped$t2Iterate;
        } else {
            if (!(!((Double.isInfinite(dEstimateCriticallyDamped$t2Iterate) || Double.isNaN(dEstimateCriticallyDamped$t2Iterate)) ? false : true))) {
                dLog = Math.max(dLog, dEstimateCriticallyDamped$t2Iterate);
            }
            d13 = dLog;
        }
        double d17 = (-(d15 + d16)) / (real * d16);
        if (Double.isNaN(d17) || d17 <= 0.0d) {
            d14 = -d12;
        } else if (d17 <= 0.0d || (-estimateCriticallyDamped$xInflection(d10, real, d17, d16)) >= d12) {
            d13 = (-(2.0d / real)) - (d10 / d16);
            d14 = d12;
        } else {
            if (d16 < 0.0d && d10 > 0.0d) {
                d13 = 0.0d;
            }
            d14 = -d12;
        }
        l<Double, Double> lVar = new l<Double, Double>() { // from class: androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fn$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @NotNull
            public final Double invoke(double d18) {
                return Double.valueOf(((d10 + (d16 * d18)) * Math.exp(real * d18)) + d14);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ Double invoke(Double d18) {
                return invoke(d18.doubleValue());
            }
        };
        l<Double, Double> lVar2 = new l<Double, Double>() { // from class: androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fnPrime$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @NotNull
            public final Double invoke(double d18) {
                double d19 = d16;
                double d20 = real;
                return Double.valueOf(((d19 * ((d20 * d18) + ((double) 1))) + (d10 * d20)) * Math.exp(d20 * d18));
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ Double invoke(Double d18) {
                return invoke(d18.doubleValue());
            }
        };
        double d18 = Double.MAX_VALUE;
        while (d18 > 0.001d && i10 < 100) {
            i10++;
            double dDoubleValue = d13 - (lVar.invoke(Double.valueOf(d13)).doubleValue() / lVar2.invoke(Double.valueOf(d13)).doubleValue());
            double dAbs = Math.abs(d13 - dDoubleValue);
            d13 = dDoubleValue;
            d18 = dAbs;
        }
        return d13;
    }

    private static final double estimateCriticallyDamped$t2Iterate(double d10, double d11) {
        double dLog = d10;
        for (int i10 = 0; i10 < 6; i10++) {
            dLog = d10 - Math.log(Math.abs(dLog / d11));
        }
        return dLog;
    }

    private static final double estimateCriticallyDamped$xInflection(double d10, double d11, double d12, double d13) {
        double d14 = d11 * d12;
        return (d10 * Math.exp(d14)) + (d13 * d12 * Math.exp(d14));
    }

    private static final long estimateDurationInternal(Pair<ComplexDouble, ComplexDouble> pair, double d10, double d11, double d12, double d13) {
        if (d12 == 0.0d) {
            if (d11 == 0.0d) {
                return 0L;
            }
        }
        if (d12 < 0.0d) {
            d11 = -d11;
        }
        double d14 = d11;
        double dAbs = Math.abs(d12);
        return (long) ((d10 > 1.0d ? estimateOverDamped(pair, dAbs, d14, d13) : d10 < 1.0d ? estimateUnderDamped(pair, dAbs, d14, d13) : estimateCriticallyDamped(pair, dAbs, d14, d13)) * 1000.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final double estimateOverDamped(kotlin.Pair<androidx.compose.animation.core.ComplexDouble, androidx.compose.animation.core.ComplexDouble> r31, double r32, double r34, double r36) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SpringEstimationKt.estimateOverDamped(kotlin.Pair, double, double, double):double");
    }

    /* JADX INFO: renamed from: estimateOverDamped$xInflection-0, reason: not valid java name */
    private static final double m117estimateOverDamped$xInflection0(double d10, double d11, double d12, double d13, double d14) {
        return (d10 * Math.exp(d11 * d12)) + (d13 * Math.exp(d14 * d12));
    }

    private static final double estimateUnderDamped(Pair<ComplexDouble, ComplexDouble> pair, double d10, double d11, double d12) {
        double real = pair.getFirst().getReal();
        double imaginary = (d11 - (real * d10)) / pair.getFirst().getImaginary();
        return Math.log(d12 / Math.sqrt((d10 * d10) + (imaginary * imaginary))) / real;
    }

    private static final boolean isNotFinite(double d10) {
        return !((Double.isInfinite(d10) || Double.isNaN(d10)) ? false : true);
    }

    private static final double iterateNewtonsMethod(double d10, l<? super Double, Double> lVar, l<? super Double, Double> lVar2) {
        return d10 - (lVar.invoke(Double.valueOf(d10)).doubleValue() / lVar2.invoke(Double.valueOf(d10)).doubleValue());
    }
}
