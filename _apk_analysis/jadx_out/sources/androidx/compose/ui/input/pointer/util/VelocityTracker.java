package androidx.compose.ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.unit.VelocityKt;
import cn.p;
import com.ironsource.C3978d4;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: VelocityTracker.kt */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0005\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0002J#\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0011\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u0006\u0010\u0012\u001a\u00020\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "", "Landroidx/compose/ui/unit/Velocity;", "getImpulseVelocity-9UxMQ8M", "()J", "getImpulseVelocity", "Landroidx/compose/ui/input/pointer/util/VelocityEstimate;", "getLsq2VelocityEstimate", "", "timeMillis", "Landroidx/compose/ui/geometry/Offset;", C3978d4.i.L, "Lbn/r;", "addPosition-Uv8p0NA", "(JJ)V", "addPosition", "calculateVelocity-9UxMQ8M", "calculateVelocity", "resetTracking", "", "Landroidx/compose/ui/input/pointer/util/PointAtTime;", "samples", "[Landroidx/compose/ui/input/pointer/util/PointAtTime;", "", "index", "I", "", "useImpulse", "Z", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 6, 0})
public final class VelocityTracker {
    public static final int $stable = 8;
    private int index;

    @NotNull
    private final PointAtTime[] samples;
    private final boolean useImpulse;

    public VelocityTracker() {
        PointAtTime[] pointAtTimeArr = new PointAtTime[20];
        for (int i10 = 0; i10 < 20; i10++) {
            pointAtTimeArr[i10] = null;
        }
        this.samples = pointAtTimeArr;
        this.useImpulse = true;
    }

    /* JADX INFO: renamed from: getImpulseVelocity-9UxMQ8M, reason: not valid java name */
    private final long m3086getImpulseVelocity9UxMQ8M() {
        PointAtTime pointAtTime = this.samples[this.index];
        if (pointAtTime == null) {
            return VelocityKt.Velocity(0.0f, 0.0f);
        }
        ImpulseCalculator impulseCalculator = new ImpulseCalculator();
        ImpulseCalculator impulseCalculator2 = new ImpulseCalculator();
        int i10 = this.index;
        int i11 = 0;
        PointAtTime pointAtTime2 = pointAtTime;
        do {
            i10 = (i10 + 1) % 20;
            PointAtTime pointAtTime3 = this.samples[i10];
            if (pointAtTime3 != null) {
                long time = pointAtTime.getTime() - pointAtTime3.getTime();
                long jAbs = Math.abs(pointAtTime3.getTime() - pointAtTime2.getTime());
                if (time <= 100) {
                    if (jAbs > 40) {
                        impulseCalculator.reset();
                        impulseCalculator2.reset();
                    }
                    long j10 = -time;
                    impulseCalculator.addPosition(j10, Offset.m1383getXimpl(pointAtTime3.m3079getPointF1C5BW0()));
                    impulseCalculator2.addPosition(j10, Offset.m1384getYimpl(pointAtTime3.m3079getPointF1C5BW0()));
                    i11++;
                }
                pointAtTime2 = pointAtTime;
            }
            if (i10 == this.index) {
                break;
            }
        } while (i11 < 20);
        return i11 < 3 ? VelocityKt.Velocity(0.0f, 0.0f) : VelocityKt.Velocity(impulseCalculator.getVelocity(), impulseCalculator2.getVelocity());
    }

    private final VelocityEstimate getLsq2VelocityEstimate() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i10 = this.index;
        PointAtTime pointAtTime = this.samples[i10];
        if (pointAtTime == null) {
            return VelocityEstimate.INSTANCE.getNone();
        }
        int i11 = 0;
        PointAtTime pointAtTime2 = pointAtTime;
        while (true) {
            PointAtTime pointAtTime3 = this.samples[i10];
            if (pointAtTime3 == null) {
                break;
            }
            float time = pointAtTime.getTime() - pointAtTime3.getTime();
            float fAbs = Math.abs(pointAtTime3.getTime() - pointAtTime2.getTime());
            if (time > 100.0f || fAbs > 40.0f) {
                break;
            }
            long jM3079getPointF1C5BW0 = pointAtTime3.m3079getPointF1C5BW0();
            arrayList.add(Float.valueOf(Offset.m1383getXimpl(jM3079getPointF1C5BW0)));
            arrayList2.add(Float.valueOf(Offset.m1384getYimpl(jM3079getPointF1C5BW0)));
            arrayList3.add(Float.valueOf(-time));
            if (i10 == 0) {
                i10 = 20;
            }
            i10--;
            i11++;
            if (i11 >= 20) {
                pointAtTime2 = pointAtTime3;
                break;
            }
            pointAtTime2 = pointAtTime3;
        }
        if (i11 < 3) {
            return new VelocityEstimate(Offset.INSTANCE.m1399getZeroF1C5BW0(), 1.0f, pointAtTime.getTime() - pointAtTime2.getTime(), Offset.m1387minusMKHz9U(pointAtTime.m3079getPointF1C5BW0(), pointAtTime2.m3079getPointF1C5BW0()), null);
        }
        try {
            PolynomialFit polynomialFitPolyFitLeastSquares = VelocityTrackerKt.polyFitLeastSquares(arrayList3, arrayList, 2);
            PolynomialFit polynomialFitPolyFitLeastSquares2 = VelocityTrackerKt.polyFitLeastSquares(arrayList3, arrayList2, 2);
            float f10 = 1000;
            return new VelocityEstimate(OffsetKt.Offset(polynomialFitPolyFitLeastSquares.getCoefficients().get(1).floatValue() * f10, polynomialFitPolyFitLeastSquares2.getCoefficients().get(1).floatValue() * f10), polynomialFitPolyFitLeastSquares.getConfidence() * polynomialFitPolyFitLeastSquares2.getConfidence(), pointAtTime.getTime() - pointAtTime2.getTime(), Offset.m1387minusMKHz9U(pointAtTime.m3079getPointF1C5BW0(), pointAtTime2.m3079getPointF1C5BW0()), null);
        } catch (IllegalArgumentException unused) {
            return VelocityEstimate.INSTANCE.getNone();
        }
    }

    /* JADX INFO: renamed from: addPosition-Uv8p0NA, reason: not valid java name */
    public final void m3087addPositionUv8p0NA(long timeMillis, long position) {
        int i10 = (this.index + 1) % 20;
        this.index = i10;
        this.samples[i10] = new PointAtTime(position, timeMillis, null);
    }

    /* JADX INFO: renamed from: calculateVelocity-9UxMQ8M, reason: not valid java name */
    public final long m3088calculateVelocity9UxMQ8M() {
        if (this.useImpulse) {
            return m3086getImpulseVelocity9UxMQ8M();
        }
        long jM3085getPixelsPerSecondF1C5BW0 = getLsq2VelocityEstimate().m3085getPixelsPerSecondF1C5BW0();
        return VelocityKt.Velocity(Offset.m1383getXimpl(jM3085getPixelsPerSecondF1C5BW0), Offset.m1384getYimpl(jM3085getPixelsPerSecondF1C5BW0));
    }

    public final void resetTracking() {
        p.y(this.samples, null, 0, 0, 6, null);
    }
}
