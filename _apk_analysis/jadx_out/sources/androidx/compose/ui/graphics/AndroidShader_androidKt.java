package androidx.compose.ui.graphics;

import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.geometry.Offset;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import cn.f0;
import cn.w;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: AndroidShader.android.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\u000e\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001aO\u0010\u0013\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a?\u0010\u0016\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000f\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a1\u0010\u001d\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0019\u0010\u001f\u001a\u00020\u001e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001ø\u0001\u0000\u001a!\u0010\"\u001a\u00020!2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010 \u001a\u00020\u001eH\u0001ø\u0001\u0000\u001a3\u0010%\u001a\u0004\u0018\u00010$2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010 \u001a\u00020\u001eH\u0001ø\u0001\u0000\u001a)\u0010'\u001a\u00020&2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0002ø\u0001\u0000*\n\u0010(\"\u00020\n2\u00020\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "", "Landroidx/compose/ui/graphics/Color;", "colors", "", "colorStops", "Landroidx/compose/ui/graphics/TileMode;", "tileMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "ActualLinearGradientShader-VjE6UOU", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualLinearGradientShader", "center", "radius", "ActualRadialGradientShader-8uybcMk", "(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualRadialGradientShader", "ActualSweepGradientShader-9KIMszo", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "ActualSweepGradientShader", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "tileModeX", "tileModeY", "ActualImageShader-F49vj9s", "(Landroidx/compose/ui/graphics/ImageBitmap;II)Landroid/graphics/Shader;", "ActualImageShader", "", "countTransparentColors", "numTransparentColors", "", "makeTransparentColors", "stops", "", "makeTransparentStops", "Lbn/r;", "validateColorStops", "Shader", "ui-graphics_release"}, k = 2, mv = {1, 6, 0})
public final class AndroidShader_androidKt {
    @NotNull
    /* JADX INFO: renamed from: ActualImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m1521ActualImageShaderF49vj9s(@NotNull ImageBitmap imageBitmap, int i10, int i11) {
        p.k(imageBitmap, "image");
        return new BitmapShader(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap), AndroidTileMode_androidKt.m1526toAndroidTileMode0vamqd0(i10), AndroidTileMode_androidKt.m1526toAndroidTileMode0vamqd0(i11));
    }

    @NotNull
    /* JADX INFO: renamed from: ActualLinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m1522ActualLinearGradientShaderVjE6UOU(long j10, long j11, @NotNull List<Color> list, @Nullable List<Float> list2, int i10) {
        p.k(list, "colors");
        validateColorStops(list, list2);
        int iCountTransparentColors = countTransparentColors(list);
        return new android.graphics.LinearGradient(Offset.m1383getXimpl(j10), Offset.m1384getYimpl(j10), Offset.m1383getXimpl(j11), Offset.m1384getYimpl(j11), makeTransparentColors(list, iCountTransparentColors), makeTransparentStops(list2, list, iCountTransparentColors), AndroidTileMode_androidKt.m1526toAndroidTileMode0vamqd0(i10));
    }

    @NotNull
    /* JADX INFO: renamed from: ActualRadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m1523ActualRadialGradientShader8uybcMk(long j10, float f10, @NotNull List<Color> list, @Nullable List<Float> list2, int i10) {
        p.k(list, "colors");
        validateColorStops(list, list2);
        int iCountTransparentColors = countTransparentColors(list);
        return new android.graphics.RadialGradient(Offset.m1383getXimpl(j10), Offset.m1384getYimpl(j10), f10, makeTransparentColors(list, iCountTransparentColors), makeTransparentStops(list2, list, iCountTransparentColors), AndroidTileMode_androidKt.m1526toAndroidTileMode0vamqd0(i10));
    }

    @NotNull
    /* JADX INFO: renamed from: ActualSweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m1524ActualSweepGradientShader9KIMszo(long j10, @NotNull List<Color> list, @Nullable List<Float> list2) {
        p.k(list, "colors");
        validateColorStops(list, list2);
        int iCountTransparentColors = countTransparentColors(list);
        return new android.graphics.SweepGradient(Offset.m1383getXimpl(j10), Offset.m1384getYimpl(j10), makeTransparentColors(list, iCountTransparentColors), makeTransparentStops(list2, list, iCountTransparentColors));
    }

    @VisibleForTesting
    public static final int countTransparentColors(@NotNull List<Color> list) {
        p.k(list, "colors");
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int iO = w.o(list);
        int i10 = 0;
        for (int i11 = 1; i11 < iO; i11++) {
            if (Color.m1621getAlphaimpl(list.get(i11).m1629unboximpl()) == 0.0f) {
                i10++;
            }
        }
        return i10;
    }

    @VisibleForTesting
    @NotNull
    public static final int[] makeTransparentColors(@NotNull List<Color> list, int i10) {
        int i11;
        p.k(list, "colors");
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            for (int i12 = 0; i12 < size; i12++) {
                iArr[i12] = ColorKt.m1674toArgb8_81llA(list.get(i12).m1629unboximpl());
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i10];
        int iO = w.o(list);
        int size2 = list.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size2; i14++) {
            long jM1629unboximpl = list.get(i14).m1629unboximpl();
            if (Color.m1621getAlphaimpl(jM1629unboximpl) == 0.0f) {
                if (i14 == 0) {
                    i11 = i13 + 1;
                    iArr2[i13] = ColorKt.m1674toArgb8_81llA(Color.m1618copywmQWz5c$default(list.get(1).m1629unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else if (i14 == iO) {
                    i11 = i13 + 1;
                    iArr2[i13] = ColorKt.m1674toArgb8_81llA(Color.m1618copywmQWz5c$default(list.get(i14 - 1).m1629unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else {
                    int i15 = i13 + 1;
                    iArr2[i13] = ColorKt.m1674toArgb8_81llA(Color.m1618copywmQWz5c$default(list.get(i14 - 1).m1629unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                    i13 = i15 + 1;
                    iArr2[i15] = ColorKt.m1674toArgb8_81llA(Color.m1618copywmQWz5c$default(list.get(i14 + 1).m1629unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                }
                i13 = i11;
            } else {
                iArr2[i13] = ColorKt.m1674toArgb8_81llA(jM1629unboximpl);
                i13++;
            }
        }
        return iArr2;
    }

    @VisibleForTesting
    @Nullable
    public static final float[] makeTransparentStops(@Nullable List<Float> list, @NotNull List<Color> list2, int i10) {
        p.k(list2, "colors");
        if (i10 == 0) {
            if (list != null) {
                return f0.d1(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i10];
        fArr[0] = list != null ? list.get(0).floatValue() : 0.0f;
        int iO = w.o(list2);
        int i11 = 1;
        for (int i12 = 1; i12 < iO; i12++) {
            long jM1629unboximpl = list2.get(i12).m1629unboximpl();
            float fFloatValue = list != null ? list.get(i12).floatValue() : i12 / w.o(list2);
            int i13 = i11 + 1;
            fArr[i11] = fFloatValue;
            if (Color.m1621getAlphaimpl(jM1629unboximpl) == 0.0f) {
                i11 = i13 + 1;
                fArr[i13] = fFloatValue;
            } else {
                i11 = i13;
            }
        }
        fArr[i11] = list != null ? list.get(w.o(list2)).floatValue() : 1.0f;
        return fArr;
    }

    private static final void validateColorStops(List<Color> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
