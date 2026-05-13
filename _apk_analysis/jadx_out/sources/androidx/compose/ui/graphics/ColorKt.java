package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.util.MathHelpersKt;
import bn.m;
import io.appmetrica.analytics.impl.A2;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: Color.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u0014\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\u001a>\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\f\u001a\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000e\u001a4\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000f\u001a-\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a!\u0010\u0019\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a1\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0000H\u0082\b\u001a\u0019\u0010#\u001a\u00020 *\u00020\u0007H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"\u001a\u0019\u0010&\u001a\u00020\u0000*\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%\u001a\u0010\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0000H\u0002\u001a\u0019\u0010+\u001a\u00020\n*\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u001a+\u00100\u001a\u00020\u0007*\u00020\u00072\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070,H\u0086\bø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b.\u0010/\"\"\u00106\u001a\u000201*\u00020\u00078Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b4\u00105\u001a\u0004\b2\u00103\"\"\u00109\u001a\u000201*\u00020\u00078Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b8\u00105\u001a\u0004\b7\u00103\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006:"}, d2 = {"", "red", "green", "blue", "alpha", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "Landroidx/compose/ui/graphics/Color;", "Color", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "", "color", "(I)J", "", "(J)J", "(IIII)J", "start", "stop", "fraction", "lerp-jxsXWHM", "(JJF)J", "lerp", A2.f64965g, "compositeOver--OWjLjI", "(JJ)J", "compositeOver", "fgC", "bgC", "fgA", "bgA", "a", "compositeComponent", "", "getComponents-8_81llA", "(J)[F", "getComponents", "luminance-8_81llA", "(J)F", "luminance", "v", "saturate", "toArgb-8_81llA", "(J)I", "toArgb", "Lkotlin/Function0;", "block", "takeOrElse-DxMtmZc", "(JLsn/a;)J", "takeOrElse", "", "isSpecified-8_81llA", "(J)Z", "isSpecified-8_81llA$annotations", "(J)V", "isSpecified", "isUnspecified-8_81llA", "isUnspecified-8_81llA$annotations", "isUnspecified", "ui-graphics_release"}, k = 2, mv = {1, 6, 0})
public final class ColorKt {
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    @androidx.compose.runtime.Stable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long Color(float r9, float r10, float r11, float r12, @org.jetbrains.annotations.NotNull androidx.compose.ui.graphics.colorspace.ColorSpace r13) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.ColorKt.Color(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
    }

    @Stable
    public static final long Color(int i10) {
        return Color.m1615constructorimpl(m.b(m.b(i10) << 32));
    }

    @Stable
    public static final long Color(int i10, int i11, int i12, int i13) {
        return Color(((i10 & 255) << 16) | ((i13 & 255) << 24) | ((i11 & 255) << 8) | (i12 & 255));
    }

    @Stable
    public static final long Color(long j10) {
        return Color.m1615constructorimpl(m.b(m.b(m.b(j10) & 4294967295L) << 32));
    }

    public static /* synthetic */ long Color$default(float f10, float f11, float f12, float f13, ColorSpace colorSpace, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            f13 = 1.0f;
        }
        if ((i10 & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return Color(f10, f11, f12, f13, colorSpace);
    }

    public static /* synthetic */ long Color$default(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i13 = 255;
        }
        return Color(i10, i11, i12, i13);
    }

    private static final float compositeComponent(float f10, float f11, float f12, float f13, float f14) {
        if (f14 == 0.0f) {
            return 0.0f;
        }
        return ((f10 * f12) + ((f11 * f13) * (1.0f - f12))) / f14;
    }

    @Stable
    /* JADX INFO: renamed from: compositeOver--OWjLjI, reason: not valid java name */
    public static final long m1665compositeOverOWjLjI(long j10, long j11) {
        long jM1616convertvNxB06k = Color.m1616convertvNxB06k(j10, Color.m1623getColorSpaceimpl(j11));
        float fM1621getAlphaimpl = Color.m1621getAlphaimpl(j11);
        float fM1621getAlphaimpl2 = Color.m1621getAlphaimpl(jM1616convertvNxB06k);
        float f10 = 1.0f - fM1621getAlphaimpl2;
        float f11 = (fM1621getAlphaimpl * f10) + fM1621getAlphaimpl2;
        return Color((f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1)) == 0 ? 0.0f : ((Color.m1625getRedimpl(jM1616convertvNxB06k) * fM1621getAlphaimpl2) + ((Color.m1625getRedimpl(j11) * fM1621getAlphaimpl) * f10)) / f11, (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1)) == 0 ? 0.0f : ((Color.m1624getGreenimpl(jM1616convertvNxB06k) * fM1621getAlphaimpl2) + ((Color.m1624getGreenimpl(j11) * fM1621getAlphaimpl) * f10)) / f11, f11 == 0.0f ? 0.0f : ((Color.m1622getBlueimpl(jM1616convertvNxB06k) * fM1621getAlphaimpl2) + ((Color.m1622getBlueimpl(j11) * fM1621getAlphaimpl) * f10)) / f11, f11, Color.m1623getColorSpaceimpl(j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getComponents-8_81llA, reason: not valid java name */
    public static final float[] m1666getComponents8_81llA(long j10) {
        return new float[]{Color.m1625getRedimpl(j10), Color.m1624getGreenimpl(j10), Color.m1622getBlueimpl(j10), Color.m1621getAlphaimpl(j10)};
    }

    /* JADX INFO: renamed from: isSpecified-8_81llA, reason: not valid java name */
    public static final boolean m1667isSpecified8_81llA(long j10) {
        return j10 != Color.INSTANCE.m1655getUnspecified0d7_KjU();
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m1668isSpecified8_81llA$annotations(long j10) {
    }

    /* JADX INFO: renamed from: isUnspecified-8_81llA, reason: not valid java name */
    public static final boolean m1669isUnspecified8_81llA(long j10) {
        return j10 == Color.INSTANCE.m1655getUnspecified0d7_KjU();
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m1670isUnspecified8_81llA$annotations(long j10) {
    }

    @Stable
    /* JADX INFO: renamed from: lerp-jxsXWHM, reason: not valid java name */
    public static final long m1671lerpjxsXWHM(long j10, long j11, float f10) {
        ColorSpace oklab = ColorSpaces.INSTANCE.getOklab();
        long jM1616convertvNxB06k = Color.m1616convertvNxB06k(j10, oklab);
        long jM1616convertvNxB06k2 = Color.m1616convertvNxB06k(j11, oklab);
        float fM1621getAlphaimpl = Color.m1621getAlphaimpl(jM1616convertvNxB06k);
        float fM1625getRedimpl = Color.m1625getRedimpl(jM1616convertvNxB06k);
        float fM1624getGreenimpl = Color.m1624getGreenimpl(jM1616convertvNxB06k);
        float fM1622getBlueimpl = Color.m1622getBlueimpl(jM1616convertvNxB06k);
        float fM1621getAlphaimpl2 = Color.m1621getAlphaimpl(jM1616convertvNxB06k2);
        float fM1625getRedimpl2 = Color.m1625getRedimpl(jM1616convertvNxB06k2);
        float fM1624getGreenimpl2 = Color.m1624getGreenimpl(jM1616convertvNxB06k2);
        float fM1622getBlueimpl2 = Color.m1622getBlueimpl(jM1616convertvNxB06k2);
        return Color.m1616convertvNxB06k(Color(MathHelpersKt.lerp(fM1625getRedimpl, fM1625getRedimpl2, f10), MathHelpersKt.lerp(fM1624getGreenimpl, fM1624getGreenimpl2, f10), MathHelpersKt.lerp(fM1622getBlueimpl, fM1622getBlueimpl2, f10), MathHelpersKt.lerp(fM1621getAlphaimpl, fM1621getAlphaimpl2, f10), oklab), Color.m1623getColorSpaceimpl(j11));
    }

    @Stable
    /* JADX INFO: renamed from: luminance-8_81llA, reason: not valid java name */
    public static final float m1672luminance8_81llA(long j10) {
        ColorSpace colorSpaceM1623getColorSpaceimpl = Color.m1623getColorSpaceimpl(j10);
        if (ColorModel.m1977equalsimpl0(colorSpaceM1623getColorSpaceimpl.getModel(), ColorModel.INSTANCE.m1984getRgbxdoWZVw())) {
            l<Double, Double> eotf = ((Rgb) colorSpaceM1623getColorSpaceimpl).getEotf();
            return saturate((float) ((eotf.invoke(Double.valueOf(Color.m1625getRedimpl(j10))).doubleValue() * 0.2126d) + (eotf.invoke(Double.valueOf(Color.m1624getGreenimpl(j10))).doubleValue() * 0.7152d) + (eotf.invoke(Double.valueOf(Color.m1622getBlueimpl(j10))).doubleValue() * 0.0722d)));
        }
        throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) ColorModel.m1980toStringimpl(colorSpaceM1623getColorSpaceimpl.getModel()))).toString());
    }

    private static final float saturate(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        return f10;
    }

    /* JADX INFO: renamed from: takeOrElse-DxMtmZc, reason: not valid java name */
    public static final long m1673takeOrElseDxMtmZc(long j10, @NotNull sn.a<Color> aVar) {
        p.k(aVar, "block");
        return (j10 > Color.INSTANCE.m1655getUnspecified0d7_KjU() ? 1 : (j10 == Color.INSTANCE.m1655getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j10 : aVar.invoke().m1629unboximpl();
    }

    @Stable
    /* JADX INFO: renamed from: toArgb-8_81llA, reason: not valid java name */
    public static final int m1674toArgb8_81llA(long j10) {
        ColorSpace colorSpaceM1623getColorSpaceimpl = Color.m1623getColorSpaceimpl(j10);
        if (colorSpaceM1623getColorSpaceimpl.getIsSrgb()) {
            return (int) m.b(j10 >>> 32);
        }
        float[] fArrM1666getComponents8_81llA = m1666getComponents8_81llA(j10);
        ColorSpaceKt.m1988connectYBCOT_4$default(colorSpaceM1623getColorSpaceimpl, null, 0, 3, null).transform(fArrM1666getComponents8_81llA);
        return ((int) ((fArrM1666getComponents8_81llA[2] * 255.0f) + 0.5f)) | (((int) ((fArrM1666getComponents8_81llA[3] * 255.0f) + 0.5f)) << 24) | (((int) ((fArrM1666getComponents8_81llA[0] * 255.0f) + 0.5f)) << 16) | (((int) ((fArrM1666getComponents8_81llA[1] * 255.0f) + 0.5f)) << 8);
    }
}
