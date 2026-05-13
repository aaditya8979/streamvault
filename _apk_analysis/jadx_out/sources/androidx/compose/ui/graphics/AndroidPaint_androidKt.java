package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import com.ironsource.C3978d4;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: AndroidPaint.android.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\b\u0010\u0003\u001a\u00020\u0002H\u0000\u001a%\u0010\n\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001a\u0010\r\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000\u001a\u0010\u0010\u000f\u001a\u00020\u000e*\u00060\u0002j\u0002`\u0004H\u0000\u001a\u0018\u0010\u0010\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u0006\u0010\f\u001a\u00020\u000eH\u0000\u001a\u0010\u0010\u0012\u001a\u00020\u0011*\u00060\u0002j\u0002`\u0004H\u0000\u001a\u0018\u0010\u0013\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u0006\u0010\f\u001a\u00020\u0011H\u0000\u001a\u001a\u0010\u0015\u001a\u00020\u0014*\u00060\u0002j\u0002`\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a%\u0010\u0019\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u0006\u0010\f\u001a\u00020\u0014H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a%\u0010\u001c\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u0006\u0010\f\u001a\u00020\u001aH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\t\u001a\u001a\u0010\u001d\u001a\u00020\u001a*\u00060\u0002j\u0002`\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0010\u0010\u001f\u001a\u00020\u000e*\u00060\u0002j\u0002`\u0004H\u0000\u001a\u0018\u0010 \u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u0006\u0010\f\u001a\u00020\u000eH\u0000\u001a\u001a\u0010\"\u001a\u00020!*\u00060\u0002j\u0002`\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u001e\u001a%\u0010$\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u0006\u0010\f\u001a\u00020!H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010\t\u001a\u001a\u0010&\u001a\u00020%*\u00060\u0002j\u0002`\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b&\u0010\u001e\u001a%\u0010(\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u0006\u0010\f\u001a\u00020%H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010\t\u001a\u0010\u0010)\u001a\u00020\u000e*\u00060\u0002j\u0002`\u0004H\u0000\u001a\u0018\u0010*\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u0006\u0010\f\u001a\u00020\u000eH\u0000\u001a\u001a\u0010,\u001a\u00020+*\u00060\u0002j\u0002`\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b,\u0010\u001e\u001a%\u0010.\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u0006\u0010\f\u001a\u00020+H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010\t\u001a \u00101\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\u000e\u0010\f\u001a\n\u0018\u00010/j\u0004\u0018\u0001`0H\u0000\u001a\u001a\u00103\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00042\b\u0010\f\u001a\u0004\u0018\u000102H\u0000*\n\u00104\"\u00020\u00022\u00020\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"Landroidx/compose/ui/graphics/Paint;", "Paint", "Landroid/graphics/Paint;", "makeNativePaint", "Landroidx/compose/ui/graphics/NativePaint;", "Landroidx/compose/ui/graphics/BlendMode;", C3978d4.a.f31224t, "Lbn/r;", "setNativeBlendMode-GB0RdKg", "(Landroid/graphics/Paint;I)V", "setNativeBlendMode", "Landroidx/compose/ui/graphics/ColorFilter;", "value", "setNativeColorFilter", "", "getNativeAlpha", "setNativeAlpha", "", "getNativeAntiAlias", "setNativeAntiAlias", "Landroidx/compose/ui/graphics/Color;", "getNativeColor", "(Landroid/graphics/Paint;)J", "setNativeColor-4WTKRHQ", "(Landroid/graphics/Paint;J)V", "setNativeColor", "Landroidx/compose/ui/graphics/PaintingStyle;", "setNativeStyle--5YerkU", "setNativeStyle", "getNativeStyle", "(Landroid/graphics/Paint;)I", "getNativeStrokeWidth", "setNativeStrokeWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "getNativeStrokeCap", "setNativeStrokeCap-CSYIeUk", "setNativeStrokeCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "getNativeStrokeJoin", "setNativeStrokeJoin-kLtJ_vA", "setNativeStrokeJoin", "getNativeStrokeMiterLimit", "setNativeStrokeMiterLimit", "Landroidx/compose/ui/graphics/FilterQuality;", "getNativeFilterQuality", "setNativeFilterQuality-50PEsBU", "setNativeFilterQuality", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "setNativeShader", "Landroidx/compose/ui/graphics/PathEffect;", "setNativePathEffect", "NativePaint", "ui-graphics_release"}, k = 2, mv = {1, 6, 0})
public final class AndroidPaint_androidKt {

    /* JADX INFO: compiled from: AndroidPaint.android.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            iArr[Paint.Style.STROKE.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            iArr3[Paint.Join.MITER.ordinal()] = 1;
            iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            iArr3[Paint.Join.ROUND.ordinal()] = 3;
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @NotNull
    public static final Paint Paint() {
        return new AndroidPaint();
    }

    public static final float getNativeAlpha(@NotNull android.graphics.Paint paint) {
        p.k(paint, "<this>");
        return paint.getAlpha() / 255.0f;
    }

    public static final boolean getNativeAntiAlias(@NotNull android.graphics.Paint paint) {
        p.k(paint, "<this>");
        return paint.isAntiAlias();
    }

    public static final long getNativeColor(@NotNull android.graphics.Paint paint) {
        p.k(paint, "<this>");
        return ColorKt.Color(paint.getColor());
    }

    public static final int getNativeFilterQuality(@NotNull android.graphics.Paint paint) {
        p.k(paint, "<this>");
        return !paint.isFilterBitmap() ? FilterQuality.INSTANCE.m1707getNonefv9h1I() : FilterQuality.INSTANCE.m1705getLowfv9h1I();
    }

    public static final int getNativeStrokeCap(@NotNull android.graphics.Paint paint) {
        p.k(paint, "<this>");
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i10 = strokeCap == null ? -1 : WhenMappings.$EnumSwitchMapping$1[strokeCap.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? StrokeCap.INSTANCE.m1923getButtKaPHkGw() : StrokeCap.INSTANCE.m1925getSquareKaPHkGw() : StrokeCap.INSTANCE.m1924getRoundKaPHkGw() : StrokeCap.INSTANCE.m1923getButtKaPHkGw();
    }

    public static final int getNativeStrokeJoin(@NotNull android.graphics.Paint paint) {
        p.k(paint, "<this>");
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i10 = strokeJoin == null ? -1 : WhenMappings.$EnumSwitchMapping$2[strokeJoin.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? StrokeJoin.INSTANCE.m1934getMiterLxFBmk8() : StrokeJoin.INSTANCE.m1935getRoundLxFBmk8() : StrokeJoin.INSTANCE.m1933getBevelLxFBmk8() : StrokeJoin.INSTANCE.m1934getMiterLxFBmk8();
    }

    public static final float getNativeStrokeMiterLimit(@NotNull android.graphics.Paint paint) {
        p.k(paint, "<this>");
        return paint.getStrokeMiter();
    }

    public static final float getNativeStrokeWidth(@NotNull android.graphics.Paint paint) {
        p.k(paint, "<this>");
        return paint.getStrokeWidth();
    }

    public static final int getNativeStyle(@NotNull android.graphics.Paint paint) {
        p.k(paint, "<this>");
        Paint.Style style = paint.getStyle();
        return (style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()]) == 1 ? PaintingStyle.INSTANCE.m1850getStrokeTiuSbCo() : PaintingStyle.INSTANCE.m1849getFillTiuSbCo();
    }

    @NotNull
    public static final android.graphics.Paint makeNativePaint() {
        return new android.graphics.Paint(7);
    }

    public static final void setNativeAlpha(@NotNull android.graphics.Paint paint, float f10) {
        p.k(paint, "<this>");
        paint.setAlpha((int) Math.rint(f10 * 255.0f));
    }

    public static final void setNativeAntiAlias(@NotNull android.graphics.Paint paint, boolean z10) {
        p.k(paint, "<this>");
        paint.setAntiAlias(z10);
    }

    /* JADX INFO: renamed from: setNativeBlendMode-GB0RdKg, reason: not valid java name */
    public static final void m1508setNativeBlendModeGB0RdKg(@NotNull android.graphics.Paint paint, int i10) {
        p.k(paint, "$this$setNativeBlendMode");
        if (Build.VERSION.SDK_INT >= 29) {
            WrapperVerificationHelperMethods.INSTANCE.m1973setBlendModeGB0RdKg(paint, i10);
        } else {
            paint.setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.m1476toPorterDuffModes9anfk8(i10)));
        }
    }

    /* JADX INFO: renamed from: setNativeColor-4WTKRHQ, reason: not valid java name */
    public static final void m1509setNativeColor4WTKRHQ(@NotNull android.graphics.Paint paint, long j10) {
        p.k(paint, "$this$setNativeColor");
        paint.setColor(ColorKt.m1674toArgb8_81llA(j10));
    }

    public static final void setNativeColorFilter(@NotNull android.graphics.Paint paint, @Nullable ColorFilter colorFilter) {
        p.k(paint, "<this>");
        paint.setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
    }

    /* JADX INFO: renamed from: setNativeFilterQuality-50PEsBU, reason: not valid java name */
    public static final void m1510setNativeFilterQuality50PEsBU(@NotNull android.graphics.Paint paint, int i10) {
        p.k(paint, "$this$setNativeFilterQuality");
        paint.setFilterBitmap(!FilterQuality.m1700equalsimpl0(i10, FilterQuality.INSTANCE.m1707getNonefv9h1I()));
    }

    public static final void setNativePathEffect(@NotNull android.graphics.Paint paint, @Nullable PathEffect pathEffect) {
        p.k(paint, "<this>");
        AndroidPathEffect androidPathEffect = (AndroidPathEffect) pathEffect;
        paint.setPathEffect(androidPathEffect != null ? androidPathEffect.getNativePathEffect() : null);
    }

    public static final void setNativeShader(@NotNull android.graphics.Paint paint, @Nullable Shader shader) {
        p.k(paint, "<this>");
        paint.setShader(shader);
    }

    /* JADX INFO: renamed from: setNativeStrokeCap-CSYIeUk, reason: not valid java name */
    public static final void m1511setNativeStrokeCapCSYIeUk(@NotNull android.graphics.Paint paint, int i10) {
        p.k(paint, "$this$setNativeStrokeCap");
        StrokeCap.Companion companion = StrokeCap.INSTANCE;
        paint.setStrokeCap(StrokeCap.m1919equalsimpl0(i10, companion.m1925getSquareKaPHkGw()) ? Paint.Cap.SQUARE : StrokeCap.m1919equalsimpl0(i10, companion.m1924getRoundKaPHkGw()) ? Paint.Cap.ROUND : StrokeCap.m1919equalsimpl0(i10, companion.m1923getButtKaPHkGw()) ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    /* JADX INFO: renamed from: setNativeStrokeJoin-kLtJ_vA, reason: not valid java name */
    public static final void m1512setNativeStrokeJoinkLtJ_vA(@NotNull android.graphics.Paint paint, int i10) {
        p.k(paint, "$this$setNativeStrokeJoin");
        StrokeJoin.Companion companion = StrokeJoin.INSTANCE;
        paint.setStrokeJoin(StrokeJoin.m1929equalsimpl0(i10, companion.m1934getMiterLxFBmk8()) ? Paint.Join.MITER : StrokeJoin.m1929equalsimpl0(i10, companion.m1933getBevelLxFBmk8()) ? Paint.Join.BEVEL : StrokeJoin.m1929equalsimpl0(i10, companion.m1935getRoundLxFBmk8()) ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public static final void setNativeStrokeMiterLimit(@NotNull android.graphics.Paint paint, float f10) {
        p.k(paint, "<this>");
        paint.setStrokeMiter(f10);
    }

    public static final void setNativeStrokeWidth(@NotNull android.graphics.Paint paint, float f10) {
        p.k(paint, "<this>");
        paint.setStrokeWidth(f10);
    }

    /* JADX INFO: renamed from: setNativeStyle--5YerkU, reason: not valid java name */
    public static final void m1513setNativeStyle5YerkU(@NotNull android.graphics.Paint paint, int i10) {
        p.k(paint, "$this$setNativeStyle");
        paint.setStyle(PaintingStyle.m1845equalsimpl0(i10, PaintingStyle.INSTANCE.m1850getStrokeTiuSbCo()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
