package androidx.compose.ui.graphics;

import androidx.core.text.util.LocalePreferences;
import bn.r;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: ColorMatrix.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0014\u0012\b\b\u0002\u0010D\u001a\u00020Cø\u0001\u0000¢\u0006\u0004\bH\u0010IJ \u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0086\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\r\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J2\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00052\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u0015H\u0082\b¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0013J5\u0010!\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010%\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b#\u0010$J-\u0010,\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0005¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b-\u0010$J\u0015\u00100\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b/\u0010$J\u0015\u00102\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b1\u0010$J\r\u00104\u001a\u00020\n¢\u0006\u0004\b3\u0010\u000fJ\r\u00106\u001a\u00020\n¢\u0006\u0004\b5\u0010\u000fJ\u0010\u0010:\u001a\u000207HÖ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010=\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b;\u0010<J\u001a\u0010B\u001a\u00020?2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b@\u0010AR\u0017\u0010D\u001a\u00020C8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\u0088\u0001D\u0092\u0001\u00020Cø\u0001\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006J"}, d2 = {"Landroidx/compose/ui/graphics/ColorMatrix;", "", "", "row", "column", "", "get-impl", "([FII)F", "get", "v", "Lbn/r;", "set-impl", "([FIIF)V", "set", "reset-impl", "([F)V", "reset", "src", "set-jHG-Opc", "([F[F)V", "degrees", "Lkotlin/Function2;", "block", "rotateInternal-impl", "([FFLsn/p;)V", "rotateInternal", "colorMatrix", "timesAssign-jHG-Opc", "timesAssign", "m1", "m2", "dot-Me4OoYI", "([F[FI[FI)F", "dot", LocalePreferences.FirstDayOfWeek.SATURDAY, "setToSaturation-impl", "([FF)V", "setToSaturation", "redScale", "greenScale", "blueScale", "alphaScale", "setToScale-impl", "([FFFFF)V", "setToScale", "setToRotateRed-impl", "setToRotateRed", "setToRotateGreen-impl", "setToRotateGreen", "setToRotateBlue-impl", "setToRotateBlue", "convertRgbToYuv-impl", "convertRgbToYuv", "convertYuvToRgb-impl", "convertYuvToRgb", "", "toString-impl", "([F)Ljava/lang/String;", "toString", "hashCode-impl", "([F)I", "hashCode", "other", "", "equals-impl", "([FLjava/lang/Object;)Z", "equals", "", "values", "[F", "getValues", "()[F", "constructor-impl", "([F)[F", "ui-graphics_release"}, k = 1, mv = {1, 6, 0})
public final class ColorMatrix {

    @NotNull
    private final float[] values;

    private /* synthetic */ ColorMatrix(float[] fArr) {
        this.values = fArr;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ColorMatrix m1675boximpl(float[] fArr) {
        return new ColorMatrix(fArr);
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static float[] m1676constructorimpl(@NotNull float[] fArr) {
        p.k(fArr, "values");
        return fArr;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ float[] m1677constructorimpl$default(float[] fArr, int i10, i iVar) {
        if ((i10 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        }
        return m1676constructorimpl(fArr);
    }

    /* JADX INFO: renamed from: convertRgbToYuv-impl, reason: not valid java name */
    public static final void m1678convertRgbToYuvimpl(float[] fArr) {
        m1685resetimpl(fArr);
        fArr[0] = 0.299f;
        fArr[1] = 0.587f;
        fArr[2] = 0.114f;
        fArr[5] = -0.16874f;
        fArr[6] = -0.33126f;
        fArr[7] = 0.5f;
        fArr[10] = 0.5f;
        fArr[11] = -0.41869f;
        fArr[12] = -0.08131f;
    }

    /* JADX INFO: renamed from: convertYuvToRgb-impl, reason: not valid java name */
    public static final void m1679convertYuvToRgbimpl(float[] fArr) {
        m1685resetimpl(fArr);
        fArr[2] = 1.402f;
        fArr[5] = 1.0f;
        fArr[6] = -0.34414f;
        fArr[7] = -0.71414f;
        fArr[10] = 1.0f;
        fArr[11] = 1.772f;
        fArr[12] = 0.0f;
    }

    /* JADX INFO: renamed from: dot-Me4OoYI, reason: not valid java name */
    private static final float m1680dotMe4OoYI(float[] fArr, float[] fArr2, int i10, float[] fArr3, int i11) {
        int i12 = i10 * 5;
        return (fArr2[i12 + 0] * fArr3[0 + i11]) + (fArr2[i12 + 1] * fArr3[5 + i11]) + (fArr2[i12 + 2] * fArr3[10 + i11]) + (fArr2[i12 + 3] * fArr3[15 + i11]);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1681equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof ColorMatrix) && p.f(fArr, ((ColorMatrix) obj).m1696unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1682equalsimpl0(float[] fArr, float[] fArr2) {
        return p.f(fArr, fArr2);
    }

    /* JADX INFO: renamed from: get-impl, reason: not valid java name */
    public static final float m1683getimpl(float[] fArr, int i10, int i11) {
        return fArr[(i10 * 5) + i11];
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1684hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* JADX INFO: renamed from: reset-impl, reason: not valid java name */
    public static final void m1685resetimpl(float[] fArr) {
        cn.p.w(fArr, 0.0f, 0, 0, 6, null);
        fArr[0] = 1.0f;
        fArr[12] = 1.0f;
        fArr[6] = 1.0f;
        fArr[18] = 1.0f;
    }

    /* JADX INFO: renamed from: rotateInternal-impl, reason: not valid java name */
    private static final void m1686rotateInternalimpl(float[] fArr, float f10, sn.p<? super Float, ? super Float, r> pVar) {
        m1685resetimpl(fArr);
        double d10 = (((double) f10) * 3.141592653589793d) / 180.0d;
        pVar.mo2invoke(Float.valueOf((float) Math.cos(d10)), Float.valueOf((float) Math.sin(d10)));
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final void m1687setimpl(float[] fArr, int i10, int i11, float f10) {
        fArr[(i10 * 5) + i11] = f10;
    }

    /* JADX INFO: renamed from: set-jHG-Opc, reason: not valid java name */
    public static final void m1688setjHGOpc(float[] fArr, @NotNull float[] fArr2) {
        p.k(fArr2, "src");
        cn.p.n(fArr2, fArr, 0, 0, 0, 14, null);
    }

    /* JADX INFO: renamed from: setToRotateBlue-impl, reason: not valid java name */
    public static final void m1689setToRotateBlueimpl(float[] fArr, float f10) {
        m1685resetimpl(fArr);
        double d10 = (((double) f10) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        fArr[6] = fCos;
        fArr[0] = fCos;
        fArr[1] = fSin;
        fArr[5] = -fSin;
    }

    /* JADX INFO: renamed from: setToRotateGreen-impl, reason: not valid java name */
    public static final void m1690setToRotateGreenimpl(float[] fArr, float f10) {
        m1685resetimpl(fArr);
        double d10 = (((double) f10) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        fArr[12] = fCos;
        fArr[0] = fCos;
        fArr[2] = -fSin;
        fArr[10] = fSin;
    }

    /* JADX INFO: renamed from: setToRotateRed-impl, reason: not valid java name */
    public static final void m1691setToRotateRedimpl(float[] fArr, float f10) {
        m1685resetimpl(fArr);
        double d10 = (((double) f10) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        fArr[12] = fCos;
        fArr[6] = fCos;
        fArr[7] = fSin;
        fArr[11] = -fSin;
    }

    /* JADX INFO: renamed from: setToSaturation-impl, reason: not valid java name */
    public static final void m1692setToSaturationimpl(float[] fArr, float f10) {
        m1685resetimpl(fArr);
        float f11 = 1 - f10;
        float f12 = 0.213f * f11;
        float f13 = 0.715f * f11;
        float f14 = f11 * 0.072f;
        fArr[0] = f12 + f10;
        fArr[1] = f13;
        fArr[2] = f14;
        fArr[5] = f12;
        fArr[6] = f13 + f10;
        fArr[7] = f14;
        fArr[10] = f12;
        fArr[11] = f13;
        fArr[12] = f14 + f10;
    }

    /* JADX INFO: renamed from: setToScale-impl, reason: not valid java name */
    public static final void m1693setToScaleimpl(float[] fArr, float f10, float f11, float f12, float f13) {
        m1685resetimpl(fArr);
        fArr[0] = f10;
        fArr[6] = f11;
        fArr[12] = f12;
        fArr[18] = f13;
    }

    /* JADX INFO: renamed from: timesAssign-jHG-Opc, reason: not valid java name */
    public static final void m1694timesAssignjHGOpc(float[] fArr, @NotNull float[] fArr2) {
        p.k(fArr2, "colorMatrix");
        float fM1680dotMe4OoYI = m1680dotMe4OoYI(fArr, fArr, 0, fArr2, 0);
        float fM1680dotMe4OoYI2 = m1680dotMe4OoYI(fArr, fArr, 0, fArr2, 1);
        float fM1680dotMe4OoYI3 = m1680dotMe4OoYI(fArr, fArr, 0, fArr2, 2);
        float fM1680dotMe4OoYI4 = m1680dotMe4OoYI(fArr, fArr, 0, fArr2, 3);
        float f10 = (fArr[0] * fArr2[4]) + (fArr[1] * fArr2[9]) + (fArr[2] * fArr2[14]) + (fArr[3] * fArr2[19]) + fArr[4];
        float fM1680dotMe4OoYI5 = m1680dotMe4OoYI(fArr, fArr, 1, fArr2, 0);
        float fM1680dotMe4OoYI6 = m1680dotMe4OoYI(fArr, fArr, 1, fArr2, 1);
        float fM1680dotMe4OoYI7 = m1680dotMe4OoYI(fArr, fArr, 1, fArr2, 2);
        float fM1680dotMe4OoYI8 = m1680dotMe4OoYI(fArr, fArr, 1, fArr2, 3);
        float f11 = (fArr[5] * fArr2[4]) + (fArr[6] * fArr2[9]) + (fArr[7] * fArr2[14]) + (fArr[8] * fArr2[19]) + fArr[9];
        float fM1680dotMe4OoYI9 = m1680dotMe4OoYI(fArr, fArr, 2, fArr2, 0);
        float fM1680dotMe4OoYI10 = m1680dotMe4OoYI(fArr, fArr, 2, fArr2, 1);
        float fM1680dotMe4OoYI11 = m1680dotMe4OoYI(fArr, fArr, 2, fArr2, 2);
        float fM1680dotMe4OoYI12 = m1680dotMe4OoYI(fArr, fArr, 2, fArr2, 3);
        float f12 = (fArr[10] * fArr2[4]) + (fArr[11] * fArr2[9]) + (fArr[12] * fArr2[14]) + (fArr[13] * fArr2[19]) + fArr[14];
        float fM1680dotMe4OoYI13 = m1680dotMe4OoYI(fArr, fArr, 3, fArr2, 0);
        float fM1680dotMe4OoYI14 = m1680dotMe4OoYI(fArr, fArr, 3, fArr2, 1);
        float fM1680dotMe4OoYI15 = m1680dotMe4OoYI(fArr, fArr, 3, fArr2, 2);
        float fM1680dotMe4OoYI16 = m1680dotMe4OoYI(fArr, fArr, 3, fArr2, 3);
        float f13 = (fArr[15] * fArr2[4]) + (fArr[16] * fArr2[9]) + (fArr[17] * fArr2[14]) + (fArr[18] * fArr2[19]) + fArr[19];
        fArr[0] = fM1680dotMe4OoYI;
        fArr[1] = fM1680dotMe4OoYI2;
        fArr[2] = fM1680dotMe4OoYI3;
        fArr[3] = fM1680dotMe4OoYI4;
        fArr[4] = f10;
        fArr[5] = fM1680dotMe4OoYI5;
        fArr[6] = fM1680dotMe4OoYI6;
        fArr[7] = fM1680dotMe4OoYI7;
        fArr[8] = fM1680dotMe4OoYI8;
        fArr[9] = f11;
        fArr[10] = fM1680dotMe4OoYI9;
        fArr[11] = fM1680dotMe4OoYI10;
        fArr[12] = fM1680dotMe4OoYI11;
        fArr[13] = fM1680dotMe4OoYI12;
        fArr[14] = f12;
        fArr[15] = fM1680dotMe4OoYI13;
        fArr[16] = fM1680dotMe4OoYI14;
        fArr[17] = fM1680dotMe4OoYI15;
        fArr[18] = fM1680dotMe4OoYI16;
        fArr[19] = f13;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1695toStringimpl(float[] fArr) {
        return "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
    }

    public boolean equals(Object obj) {
        return m1681equalsimpl(this.values, obj);
    }

    @NotNull
    public final float[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return m1684hashCodeimpl(this.values);
    }

    public String toString() {
        return m1695toStringimpl(this.values);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float[] m1696unboximpl() {
        return this.values;
    }
}
