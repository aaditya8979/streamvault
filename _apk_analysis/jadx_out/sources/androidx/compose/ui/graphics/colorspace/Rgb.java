package androidx.compose.ui.graphics.colorspace;

import cn.p;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.t;
import zn.n;

/* JADX INFO: compiled from: Rgb.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u0000 O2\u00020\u0001:\u0001OBu\b\u0000\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.0-\u0012\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.0-\u0012\u0006\u0010 \u001a\u00020\u000b\u0012\u0006\u0010\"\u001a\u00020\u000b\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\u0006\u0010?\u001a\u00020\t¢\u0006\u0004\b@\u0010ABA\b\u0016\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010B\u001a\u00020\u0002\u0012\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.0-\u0012\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.0-¢\u0006\u0004\b@\u0010CBY\b\u0016\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.0-\u0012\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.0-\u0012\u0006\u0010 \u001a\u00020\u000b\u0012\u0006\u0010\"\u001a\u00020\u000b¢\u0006\u0004\b@\u0010DB!\b\u0016\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010B\u001a\u00020\u0002\u0012\u0006\u0010E\u001a\u00020#¢\u0006\u0004\b@\u0010FB)\b\u0016\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010E\u001a\u00020#¢\u0006\u0004\b@\u0010GB1\b\u0010\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010E\u001a\u00020#\u0012\u0006\u0010?\u001a\u00020\t¢\u0006\u0004\b@\u0010HB!\b\u0016\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010B\u001a\u00020\u0002\u0012\u0006\u0010I\u001a\u00020.¢\u0006\u0004\b@\u0010JB)\b\u0016\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010I\u001a\u00020.¢\u0006\u0004\b@\u0010KBA\b\u0010\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010I\u001a\u00020.\u0012\u0006\u0010 \u001a\u00020\u000b\u0012\u0006\u0010\"\u001a\u00020\u000b\u0012\u0006\u0010?\u001a\u00020\t¢\u0006\u0004\b@\u0010LB!\b\u0010\u0012\u0006\u0010M\u001a\u00020\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b@\u0010NJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u001e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002J\u001e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bJ\u000e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u001a\u001a\u00020\tH\u0016R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0019\u0010$\u001a\u0004\u0018\u00010#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b+\u0010*R\u001a\u0010\b\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b,\u0010*R&\u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.0-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R#\u00103\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.0-8\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102R&\u00105\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.0-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00102R#\u00107\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.0-8\u0006¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b8\u00102R\u001a\u00109\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b9\u0010;R\u001a\u0010<\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010:\u001a\u0004\b<\u0010;¨\u0006P"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "getPrimaries", "getTransform", "getInverseTransform", "primaries", "transform", "inverseTransform", "", "component", "", "getMinValue", "getMaxValue", "r", "g", "b", "toLinear", "v", "fromLinear", "toXyz", "fromXyz", "", "other", "", "equals", "hashCode", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "whitePoint", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "getWhitePoint", "()Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "min", "F", "max", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "transferParameters", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "getTransferParameters", "()Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "[F", "getPrimaries$ui_graphics_release", "()[F", "getTransform$ui_graphics_release", "getInverseTransform$ui_graphics_release", "Lkotlin/Function1;", "", "oetfOrig", "Lsn/l;", "getOetfOrig$ui_graphics_release", "()Lsn/l;", "oetf", "getOetf", "eotfOrig", "getEotfOrig$ui_graphics_release", "eotf", "getEotf", "isWideGamut", "Z", "()Z", "isSrgb", "", "name", "id", "<init>", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;[FLsn/l;Lsn/l;FFLandroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "toXYZ", "(Ljava/lang/String;[FLsn/l;Lsn/l;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Lsn/l;Lsn/l;FF)V", "function", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "gamma", "(Ljava/lang/String;[FD)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;D)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;DFFI)V", "colorSpace", "(Landroidx/compose/ui/graphics/colorspace/Rgb;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;)V", VastTagName.COMPANION, "ui-graphics_release"}, k = 1, mv = {1, 6, 0})
public final class Rgb extends ColorSpace {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final l<Double, Double> DoubleIdentity = new l<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$DoubleIdentity$1
        @NotNull
        public final Double invoke(double d10) {
            return Double.valueOf(d10);
        }

        @Override // sn.l
        public /* bridge */ /* synthetic */ Double invoke(Double d10) {
            return invoke(d10.doubleValue());
        }
    };

    @NotNull
    private final l<Double, Double> eotf;

    @NotNull
    private final l<Double, Double> eotfOrig;

    @NotNull
    private final float[] inverseTransform;
    private final boolean isSrgb;
    private final boolean isWideGamut;
    private final float max;
    private final float min;

    @NotNull
    private final l<Double, Double> oetf;

    @NotNull
    private final l<Double, Double> oetfOrig;

    @NotNull
    private final float[] primaries;

    @Nullable
    private final TransferParameters transferParameters;

    @NotNull
    private final float[] transform;

    @NotNull
    private final WhitePoint whitePoint;

    /* JADX INFO: compiled from: Rgb.kt */
    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)JX\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002J8\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00072\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J \u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0002J\u0018\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0002H\u0002J\u0010\u0010!\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\"\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0017\u0010%\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b#\u0010$R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb$Companion;", "", "", "primaries", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "whitePoint", "Lkotlin/Function1;", "", "OETF", "EOTF", "", "min", "max", "", "id", "", "isSrgb", "point", "a", "b", "compare", "isWideGamut", "area", "ax", "ay", "bx", "by", "cross", "p1", "p2", "contains", "toXYZ", "computeWhitePoint", "xyPrimaries", "computeXYZMatrix", "computePrimaries$ui_graphics_release", "([F)[F", "computePrimaries", "DoubleIdentity", "Lsn/l;", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        private final float area(float[] primaries) {
            float f10 = primaries[0];
            float f11 = primaries[1];
            float f12 = primaries[2];
            float f13 = primaries[3];
            float f14 = primaries[4];
            float f15 = primaries[5];
            float f16 = ((((((f10 * f13) + (f11 * f14)) + (f12 * f15)) - (f13 * f14)) - (f11 * f12)) - (f10 * f15)) * 0.5f;
            return f16 < 0.0f ? -f16 : f16;
        }

        private final boolean compare(double d10, l<? super Double, Double> lVar, l<? super Double, Double> lVar2) {
            return Math.abs(lVar.invoke(Double.valueOf(d10)).doubleValue() - lVar2.invoke(Double.valueOf(d10)).doubleValue()) <= 0.001d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WhitePoint computeWhitePoint(float[] toXYZ) {
            float[] fArrMul3x3Float3 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{1.0f, 1.0f, 1.0f});
            float f10 = fArrMul3x3Float3[0];
            float f11 = fArrMul3x3Float3[1];
            float f12 = f10 + f11 + fArrMul3x3Float3[2];
            return new WhitePoint(f10 / f12, f11 / f12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] computeXYZMatrix(float[] primaries, WhitePoint whitePoint) {
            float f10 = primaries[0];
            float f11 = primaries[1];
            float f12 = primaries[2];
            float f13 = primaries[3];
            float f14 = primaries[4];
            float f15 = primaries[5];
            float x10 = whitePoint.getX();
            float y10 = whitePoint.getY();
            float f16 = 1;
            float f17 = (f16 - f10) / f11;
            float f18 = (f16 - f12) / f13;
            float f19 = (f16 - f14) / f15;
            float f20 = (f16 - x10) / y10;
            float f21 = f10 / f11;
            float f22 = (f12 / f13) - f21;
            float f23 = (x10 / y10) - f21;
            float f24 = f18 - f17;
            float f25 = (f14 / f15) - f21;
            float f26 = (((f20 - f17) * f22) - (f23 * f24)) / (((f19 - f17) * f22) - (f24 * f25));
            float f27 = (f23 - (f25 * f26)) / f22;
            float f28 = (1.0f - f27) - f26;
            float f29 = f28 / f11;
            float f30 = f27 / f13;
            float f31 = f26 / f15;
            return new float[]{f29 * f10, f28, f29 * ((1.0f - f10) - f11), f30 * f12, f27, f30 * ((1.0f - f12) - f13), f31 * f14, f26, f31 * ((1.0f - f14) - f15)};
        }

        private final boolean contains(float[] p12, float[] p22) {
            float f10 = p12[0] - p22[0];
            float f11 = p12[1] - p22[1];
            float[] fArr = {f10, f11, p12[2] - p22[2], p12[3] - p22[3], p12[4] - p22[4], p12[5] - p22[5]};
            return cross(f10, f11, p22[0] - p22[4], p22[1] - p22[5]) >= 0.0f && cross(p22[0] - p22[2], p22[1] - p22[3], fArr[0], fArr[1]) >= 0.0f && cross(fArr[2], fArr[3], p22[2] - p22[0], p22[3] - p22[1]) >= 0.0f && cross(p22[2] - p22[4], p22[3] - p22[5], fArr[2], fArr[3]) >= 0.0f && cross(fArr[4], fArr[5], p22[4] - p22[2], p22[5] - p22[3]) >= 0.0f && cross(p22[4] - p22[0], p22[5] - p22[1], fArr[4], fArr[5]) >= 0.0f;
        }

        private final float cross(float ax, float ay, float bx, float by) {
            return (ax * by) - (ay * bx);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSrgb(float[] fArr, WhitePoint whitePoint, l<? super Double, Double> lVar, l<? super Double, Double> lVar2, float f10, float f11, int i10) {
            if (i10 == 0) {
                return true;
            }
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if (!ColorSpaceKt.compare(fArr, colorSpaces.getSrgbPrimaries$ui_graphics_release()) || !ColorSpaceKt.compare(whitePoint, Illuminant.INSTANCE.getD65())) {
                return false;
            }
            if (!(f10 == 0.0f)) {
                return false;
            }
            if (!(f11 == 1.0f)) {
                return false;
            }
            Rgb srgb = colorSpaces.getSrgb();
            for (double d10 = 0.0d; d10 <= 1.0d; d10 += 0.00392156862745098d) {
                if (!compare(d10, lVar, srgb.getOetfOrig$ui_graphics_release()) || !compare(d10, lVar2, srgb.getEotfOrig$ui_graphics_release())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isWideGamut(float[] primaries, float min, float max) {
            float fArea = area(primaries);
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            return (fArea / area(colorSpaces.getNtsc1953Primaries$ui_graphics_release()) > 0.9f && contains(primaries, colorSpaces.getSrgbPrimaries$ui_graphics_release())) || (min < 0.0f && max > 1.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] xyPrimaries(float[] primaries) {
            float[] fArr = new float[6];
            if (primaries.length == 9) {
                float f10 = primaries[0];
                float f11 = primaries[1];
                float f12 = f10 + f11 + primaries[2];
                fArr[0] = f10 / f12;
                fArr[1] = f11 / f12;
                float f13 = primaries[3];
                float f14 = primaries[4];
                float f15 = f13 + f14 + primaries[5];
                fArr[2] = f13 / f15;
                fArr[3] = f14 / f15;
                float f16 = primaries[6];
                float f17 = primaries[7];
                float f18 = f16 + f17 + primaries[8];
                fArr[4] = f16 / f18;
                fArr[5] = f17 / f18;
            } else {
                p.n(primaries, fArr, 0, 0, 6, 6, null);
            }
            return fArr;
        }

        @NotNull
        public final float[] computePrimaries$ui_graphics_release(@NotNull float[] toXYZ) {
            tn.p.k(toXYZ, "toXYZ");
            float[] fArrMul3x3Float3 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{1.0f, 0.0f, 0.0f});
            float[] fArrMul3x3Float32 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{0.0f, 1.0f, 0.0f});
            float[] fArrMul3x3Float33 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{0.0f, 0.0f, 1.0f});
            float f10 = fArrMul3x3Float3[0];
            float f11 = fArrMul3x3Float3[1];
            float f12 = f10 + f11 + fArrMul3x3Float3[2];
            float f13 = fArrMul3x3Float32[0] + fArrMul3x3Float32[1] + fArrMul3x3Float32[2];
            float f14 = fArrMul3x3Float33[0] + fArrMul3x3Float33[1] + fArrMul3x3Float33[2];
            return new float[]{f10 / f12, f11 / f12, fArrMul3x3Float32[0] / f13, fArrMul3x3Float32[1] / f13, fArrMul3x3Float33[0] / f14, fArrMul3x3Float33[1] / f14};
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(@NotNull Rgb rgb, @NotNull float[] fArr, @NotNull WhitePoint whitePoint) {
        this(rgb.getName(), rgb.primaries, whitePoint, fArr, rgb.oetfOrig, rgb.eotfOrig, rgb.min, rgb.max, rgb.transferParameters, -1);
        tn.p.k(rgb, "colorSpace");
        tn.p.k(fArr, "transform");
        tn.p.k(whitePoint, "whitePoint");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(@NotNull String str, @NotNull float[] fArr, double d10) {
        tn.p.k(str, "name");
        tn.p.k(fArr, "toXYZ");
        Companion companion = INSTANCE;
        this(str, companion.computePrimaries$ui_graphics_release(fArr), companion.computeWhitePoint(fArr), d10, 0.0f, 1.0f, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(@NotNull String str, @NotNull float[] fArr, @NotNull TransferParameters transferParameters) {
        tn.p.k(str, "name");
        tn.p.k(fArr, "toXYZ");
        tn.p.k(transferParameters, "function");
        Companion companion = INSTANCE;
        this(str, companion.computePrimaries$ui_graphics_release(fArr), companion.computeWhitePoint(fArr), transferParameters, -1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(@NotNull String str, @NotNull float[] fArr, @NotNull WhitePoint whitePoint, double d10) {
        this(str, fArr, whitePoint, d10, 0.0f, 1.0f, -1);
        tn.p.k(str, "name");
        tn.p.k(fArr, "primaries");
        tn.p.k(whitePoint, "whitePoint");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(@NotNull String str, @NotNull float[] fArr, @NotNull WhitePoint whitePoint, final double d10, float f10, float f11, int i10) {
        this(str, fArr, whitePoint, null, (d10 > 1.0d ? 1 : (d10 == 1.0d ? 0 : -1)) == 0 ? DoubleIdentity : new l<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @NotNull
            public final Double invoke(double d11) {
                if (d11 < 0.0d) {
                    d11 = 0.0d;
                }
                return Double.valueOf(Math.pow(d11, 1.0d / d10));
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ Double invoke(Double d11) {
                return invoke(d11.doubleValue());
            }
        }, d10 == 1.0d ? DoubleIdentity : new l<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb.6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @NotNull
            public final Double invoke(double d11) {
                if (d11 < 0.0d) {
                    d11 = 0.0d;
                }
                return Double.valueOf(Math.pow(d11, d10));
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ Double invoke(Double d11) {
                return invoke(d11.doubleValue());
            }
        }, f10, f11, new TransferParameters(d10, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i10);
        tn.p.k(str, "name");
        tn.p.k(fArr, "primaries");
        tn.p.k(whitePoint, "whitePoint");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(@NotNull String str, @NotNull float[] fArr, @NotNull WhitePoint whitePoint, @NotNull TransferParameters transferParameters) {
        this(str, fArr, whitePoint, transferParameters, -1);
        tn.p.k(str, "name");
        tn.p.k(fArr, "primaries");
        tn.p.k(whitePoint, "whitePoint");
        tn.p.k(transferParameters, "function");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Rgb(@org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.NotNull float[] r14, @org.jetbrains.annotations.NotNull androidx.compose.ui.graphics.colorspace.WhitePoint r15, @org.jetbrains.annotations.NotNull final androidx.compose.ui.graphics.colorspace.TransferParameters r16, int r17) {
        /*
            r12 = this;
            r9 = r16
            java.lang.String r0 = "name"
            r1 = r13
            tn.p.k(r13, r0)
            java.lang.String r0 = "primaries"
            r2 = r14
            tn.p.k(r14, r0)
            java.lang.String r0 = "whitePoint"
            r3 = r15
            tn.p.k(r15, r0)
            java.lang.String r0 = "function"
            tn.p.k(r9, r0)
            double r4 = r16.getE()
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r4 = 1
            r5 = 0
            if (r0 != 0) goto L28
            r0 = r4
            goto L29
        L28:
            r0 = r5
        L29:
            if (r0 == 0) goto L3e
            double r10 = r16.getF()
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 != 0) goto L35
            r0 = r4
            goto L36
        L35:
            r0 = r5
        L36:
            if (r0 == 0) goto L3e
            androidx.compose.ui.graphics.colorspace.Rgb$1 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$1
            r0.<init>()
            goto L43
        L3e:
            androidx.compose.ui.graphics.colorspace.Rgb$2 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$2
            r0.<init>()
        L43:
            r8 = r0
            double r10 = r16.getE()
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 != 0) goto L4e
            r0 = r4
            goto L4f
        L4e:
            r0 = r5
        L4f:
            if (r0 == 0) goto L63
            double r10 = r16.getF()
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 != 0) goto L5a
            goto L5b
        L5a:
            r4 = r5
        L5b:
            if (r4 == 0) goto L63
            androidx.compose.ui.graphics.colorspace.Rgb$3 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$3
            r0.<init>()
            goto L68
        L63:
            androidx.compose.ui.graphics.colorspace.Rgb$4 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$4
            r0.<init>()
        L68:
            r6 = r0
            r7 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r5 = r8
            r8 = r10
            r9 = r16
            r10 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.WhitePoint, androidx.compose.ui.graphics.colorspace.TransferParameters, int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(@NotNull String str, @NotNull float[] fArr, @NotNull WhitePoint whitePoint, @NotNull l<? super Double, Double> lVar, @NotNull l<? super Double, Double> lVar2, float f10, float f11) {
        this(str, fArr, whitePoint, null, lVar, lVar2, f10, f11, null, -1);
        tn.p.k(str, "name");
        tn.p.k(fArr, "primaries");
        tn.p.k(whitePoint, "whitePoint");
        tn.p.k(lVar, "oetf");
        tn.p.k(lVar2, "eotf");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Rgb(@NotNull String str, @NotNull float[] fArr, @NotNull WhitePoint whitePoint, @Nullable float[] fArr2, @NotNull l<? super Double, Double> lVar, @NotNull l<? super Double, Double> lVar2, float f10, float f11, @Nullable TransferParameters transferParameters, int i10) {
        super(str, ColorModel.INSTANCE.m1984getRgbxdoWZVw(), i10, null);
        tn.p.k(str, "name");
        tn.p.k(fArr, "primaries");
        tn.p.k(whitePoint, "whitePoint");
        tn.p.k(lVar, "oetf");
        tn.p.k(lVar2, "eotf");
        this.whitePoint = whitePoint;
        this.min = f10;
        this.max = f11;
        this.transferParameters = transferParameters;
        this.oetfOrig = lVar;
        this.oetf = new l<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$oetf$1
            {
                super(1);
            }

            @NotNull
            public final Double invoke(double d10) {
                return Double.valueOf(n.l(this.this$0.getOetfOrig$ui_graphics_release().invoke(Double.valueOf(d10)).doubleValue(), this.this$0.min, this.this$0.max));
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ Double invoke(Double d10) {
                return invoke(d10.doubleValue());
            }
        };
        this.eotfOrig = lVar2;
        this.eotf = new l<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$eotf$1
            {
                super(1);
            }

            @NotNull
            public final Double invoke(double d10) {
                return this.this$0.getEotfOrig$ui_graphics_release().invoke(Double.valueOf(n.l(d10, this.this$0.min, this.this$0.max)));
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ Double invoke(Double d10) {
                return invoke(d10.doubleValue());
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f10 >= f11) {
            throw new IllegalArgumentException("Invalid range: min=" + f10 + ", max=" + f11 + "; min must be strictly < max");
        }
        Companion companion = INSTANCE;
        float[] fArrXyPrimaries = companion.xyPrimaries(fArr);
        this.primaries = fArrXyPrimaries;
        if (fArr2 == null) {
            this.transform = companion.computeXYZMatrix(fArrXyPrimaries, whitePoint);
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.transform = fArr2;
        }
        this.inverseTransform = ColorSpaceKt.inverse3x3(this.transform);
        this.isWideGamut = companion.isWideGamut(fArrXyPrimaries, f10, f11);
        this.isSrgb = companion.isSrgb(fArrXyPrimaries, whitePoint, lVar, lVar2, f10, f11, i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(@NotNull String str, @NotNull float[] fArr, @NotNull l<? super Double, Double> lVar, @NotNull l<? super Double, Double> lVar2) {
        tn.p.k(str, "name");
        tn.p.k(fArr, "toXYZ");
        tn.p.k(lVar, "oetf");
        tn.p.k(lVar2, "eotf");
        Companion companion = INSTANCE;
        this(str, companion.computePrimaries$ui_graphics_release(fArr), companion.computeWhitePoint(fArr), null, lVar, lVar2, 0.0f, 1.0f, null, -1);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !tn.p.f(t.b(Rgb.class), t.b(other.getClass())) || !super.equals(other)) {
            return false;
        }
        Rgb rgb = (Rgb) other;
        if (Float.compare(rgb.min, this.min) != 0 || Float.compare(rgb.max, this.max) != 0 || !tn.p.f(this.whitePoint, rgb.whitePoint) || !Arrays.equals(this.primaries, rgb.primaries)) {
            return false;
        }
        TransferParameters transferParameters = this.transferParameters;
        if (transferParameters != null) {
            return tn.p.f(transferParameters, rgb.transferParameters);
        }
        if (rgb.transferParameters == null) {
            return true;
        }
        if (tn.p.f(this.oetfOrig, rgb.oetfOrig)) {
            return tn.p.f(this.eotfOrig, rgb.eotfOrig);
        }
        return false;
    }

    @NotNull
    public final float[] fromLinear(float r10, float g10, float b10) {
        return fromLinear(new float[]{r10, g10, b10});
    }

    @NotNull
    public final float[] fromLinear(@NotNull float[] v10) {
        tn.p.k(v10, "v");
        v10[0] = (float) this.oetf.invoke(Double.valueOf(v10[0])).doubleValue();
        v10[1] = (float) this.oetf.invoke(Double.valueOf(v10[1])).doubleValue();
        v10[2] = (float) this.oetf.invoke(Double.valueOf(v10[2])).doubleValue();
        return v10;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] fromXyz(@NotNull float[] v10) {
        tn.p.k(v10, "v");
        ColorSpaceKt.mul3x3Float3(this.inverseTransform, v10);
        v10[0] = (float) this.oetf.invoke(Double.valueOf(v10[0])).doubleValue();
        v10[1] = (float) this.oetf.invoke(Double.valueOf(v10[1])).doubleValue();
        v10[2] = (float) this.oetf.invoke(Double.valueOf(v10[2])).doubleValue();
        return v10;
    }

    @NotNull
    public final l<Double, Double> getEotf() {
        return this.eotf;
    }

    @NotNull
    public final l<Double, Double> getEotfOrig$ui_graphics_release() {
        return this.eotfOrig;
    }

    @NotNull
    public final float[] getInverseTransform() {
        float[] fArr = this.inverseTransform;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        tn.p.j(fArrCopyOf, "copyOf(this, size)");
        return fArrCopyOf;
    }

    @NotNull
    public final float[] getInverseTransform(@NotNull float[] inverseTransform) {
        tn.p.k(inverseTransform, "inverseTransform");
        return p.n(this.inverseTransform, inverseTransform, 0, 0, 0, 14, null);
    }

    @NotNull
    /* JADX INFO: renamed from: getInverseTransform$ui_graphics_release, reason: from getter */
    public final float[] getInverseTransform() {
        return this.inverseTransform;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int component) {
        return this.max;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int component) {
        return this.min;
    }

    @NotNull
    public final l<Double, Double> getOetf() {
        return this.oetf;
    }

    @NotNull
    public final l<Double, Double> getOetfOrig$ui_graphics_release() {
        return this.oetfOrig;
    }

    @NotNull
    public final float[] getPrimaries() {
        float[] fArr = this.primaries;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        tn.p.j(fArrCopyOf, "copyOf(this, size)");
        return fArrCopyOf;
    }

    @NotNull
    public final float[] getPrimaries(@NotNull float[] primaries) {
        tn.p.k(primaries, "primaries");
        return p.n(this.primaries, primaries, 0, 0, 0, 14, null);
    }

    @NotNull
    /* JADX INFO: renamed from: getPrimaries$ui_graphics_release, reason: from getter */
    public final float[] getPrimaries() {
        return this.primaries;
    }

    @Nullable
    public final TransferParameters getTransferParameters() {
        return this.transferParameters;
    }

    @NotNull
    public final float[] getTransform() {
        float[] fArr = this.transform;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        tn.p.j(fArrCopyOf, "copyOf(this, size)");
        return fArrCopyOf;
    }

    @NotNull
    public final float[] getTransform(@NotNull float[] transform) {
        tn.p.k(transform, "transform");
        return p.n(this.transform, transform, 0, 0, 0, 14, null);
    }

    @NotNull
    /* JADX INFO: renamed from: getTransform$ui_graphics_release, reason: from getter */
    public final float[] getTransform() {
        return this.transform;
    }

    @NotNull
    public final WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 31) + this.whitePoint.hashCode()) * 31) + Arrays.hashCode(this.primaries)) * 31;
        float f10 = this.min;
        int iFloatToIntBits = (iHashCode + (!((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) == 0) ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.max;
        int iFloatToIntBits2 = (iFloatToIntBits + (!(f11 == 0.0f) ? Float.floatToIntBits(f11) : 0)) * 31;
        TransferParameters transferParameters = this.transferParameters;
        int iHashCode2 = iFloatToIntBits2 + (transferParameters != null ? transferParameters.hashCode() : 0);
        return this.transferParameters == null ? (((iHashCode2 * 31) + this.oetfOrig.hashCode()) * 31) + this.eotfOrig.hashCode() : iHashCode2;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: isSrgb, reason: from getter */
    public boolean getIsSrgb() {
        return this.isSrgb;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: isWideGamut, reason: from getter */
    public boolean getIsWideGamut() {
        return this.isWideGamut;
    }

    @NotNull
    public final float[] toLinear(float r10, float g10, float b10) {
        return toLinear(new float[]{r10, g10, b10});
    }

    @NotNull
    public final float[] toLinear(@NotNull float[] v10) {
        tn.p.k(v10, "v");
        v10[0] = (float) this.eotf.invoke(Double.valueOf(v10[0])).doubleValue();
        v10[1] = (float) this.eotf.invoke(Double.valueOf(v10[1])).doubleValue();
        v10[2] = (float) this.eotf.invoke(Double.valueOf(v10[2])).doubleValue();
        return v10;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] toXyz(@NotNull float[] v10) {
        tn.p.k(v10, "v");
        v10[0] = (float) this.eotf.invoke(Double.valueOf(v10[0])).doubleValue();
        v10[1] = (float) this.eotf.invoke(Double.valueOf(v10[1])).doubleValue();
        v10[2] = (float) this.eotf.invoke(Double.valueOf(v10[2])).doubleValue();
        return ColorSpaceKt.mul3x3Float3(this.transform, v10);
    }
}
