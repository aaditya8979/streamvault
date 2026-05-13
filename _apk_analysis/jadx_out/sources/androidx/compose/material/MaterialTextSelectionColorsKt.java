package androidx.compose.material;

import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import io.appmetrica.analytics.impl.A2;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: MaterialTextSelectionColors.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a5\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a-\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0001¢\u0006\u0002\u0010\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"DefaultSelectionBackgroundAlpha", "", "DesiredContrastRatio", "MinimumSelectionBackgroundAlpha", "binarySearchForAccessibleSelectionColorAlpha", "selectionColor", "Landroidx/compose/ui/graphics/Color;", "textColor", "backgroundColor", "binarySearchForAccessibleSelectionColorAlpha-ysEtTa8", "(JJJ)F", "calculateContrastRatio", "foreground", A2.f64965g, "calculateContrastRatio--OWjLjI", "(JJ)F", "selectionColorAlpha", "calculateContrastRatio-nb2GgbA", "(JFJJ)F", "calculateSelectionBackgroundColor", "calculateSelectionBackgroundColor-ysEtTa8", "(JJJ)J", "rememberTextSelectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "colors", "Landroidx/compose/material/Colors;", "(Landroidx/compose/material/Colors;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class MaterialTextSelectionColorsKt {
    private static final float DefaultSelectionBackgroundAlpha = 0.4f;
    private static final float DesiredContrastRatio = 4.5f;
    private static final float MinimumSelectionBackgroundAlpha = 0.2f;

    /* JADX INFO: renamed from: binarySearchForAccessibleSelectionColorAlpha-ysEtTa8, reason: not valid java name */
    private static final float m1070binarySearchForAccessibleSelectionColorAlphaysEtTa8(long j10, long j11, long j12) {
        float f10 = 0.4f;
        float f11 = 0.2f;
        float f12 = 0.4f;
        for (int i10 = 0; i10 < 7; i10++) {
            float fM1072calculateContrastRationb2GgbA = (m1072calculateContrastRationb2GgbA(j10, f10, j11, j12) / DesiredContrastRatio) - 1.0f;
            if (0.0f <= fM1072calculateContrastRationb2GgbA && fM1072calculateContrastRationb2GgbA <= 0.01f) {
                break;
            }
            if (fM1072calculateContrastRationb2GgbA < 0.0f) {
                f12 = f10;
            } else {
                f11 = f10;
            }
            f10 = (f12 + f11) / 2.0f;
        }
        return f10;
    }

    /* JADX INFO: renamed from: calculateContrastRatio--OWjLjI, reason: not valid java name */
    public static final float m1071calculateContrastRatioOWjLjI(long j10, long j11) {
        float fM1672luminance8_81llA = ColorKt.m1672luminance8_81llA(j10) + 0.05f;
        float fM1672luminance8_81llA2 = ColorKt.m1672luminance8_81llA(j11) + 0.05f;
        return Math.max(fM1672luminance8_81llA, fM1672luminance8_81llA2) / Math.min(fM1672luminance8_81llA, fM1672luminance8_81llA2);
    }

    /* JADX INFO: renamed from: calculateContrastRatio-nb2GgbA, reason: not valid java name */
    private static final float m1072calculateContrastRationb2GgbA(long j10, float f10, long j11, long j12) {
        long jM1665compositeOverOWjLjI = ColorKt.m1665compositeOverOWjLjI(Color.m1618copywmQWz5c$default(j10, f10, 0.0f, 0.0f, 0.0f, 14, null), j12);
        return m1071calculateContrastRatioOWjLjI(ColorKt.m1665compositeOverOWjLjI(j11, jM1665compositeOverOWjLjI), jM1665compositeOverOWjLjI);
    }

    /* JADX INFO: renamed from: calculateSelectionBackgroundColor-ysEtTa8, reason: not valid java name */
    public static final long m1073calculateSelectionBackgroundColorysEtTa8(long j10, long j11, long j12) {
        return Color.m1618copywmQWz5c$default(j10, m1072calculateContrastRationb2GgbA(j10, 0.4f, j11, j12) >= DesiredContrastRatio ? 0.4f : m1072calculateContrastRationb2GgbA(j10, 0.2f, j11, j12) < DesiredContrastRatio ? 0.2f : m1070binarySearchForAccessibleSelectionColorAlphaysEtTa8(j10, j11, j12), 0.0f, 0.0f, 0.0f, 14, null);
    }

    @Composable
    @NotNull
    public static final SelectionColors rememberTextSelectionColors(@NotNull Colors colors, @Nullable Composer composer, int i10) {
        p.k(colors, "colors");
        composer.startReplaceableGroup(-721696685);
        long jM967getPrimary0d7_KjU = colors.m967getPrimary0d7_KjU();
        long jM960getBackground0d7_KjU = colors.m960getBackground0d7_KjU();
        composer.startReplaceableGroup(35572910);
        long jM984contentColorFor4WTKRHQ = ColorsKt.m984contentColorFor4WTKRHQ(colors, jM960getBackground0d7_KjU);
        if (!(jM984contentColorFor4WTKRHQ != Color.INSTANCE.m1655getUnspecified0d7_KjU())) {
            jM984contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m1629unboximpl();
        }
        composer.endReplaceableGroup();
        long jM1618copywmQWz5c$default = Color.m1618copywmQWz5c$default(jM984contentColorFor4WTKRHQ, ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        Color colorM1609boximpl = Color.m1609boximpl(jM967getPrimary0d7_KjU);
        Color colorM1609boximpl2 = Color.m1609boximpl(jM960getBackground0d7_KjU);
        Color colorM1609boximpl3 = Color.m1609boximpl(jM1618copywmQWz5c$default);
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(colorM1609boximpl) | composer.changed(colorM1609boximpl2) | composer.changed(colorM1609boximpl3);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new SelectionColors(colors.m967getPrimary0d7_KjU(), m1073calculateSelectionBackgroundColorysEtTa8(jM967getPrimary0d7_KjU, jM1618copywmQWz5c$default, jM960getBackground0d7_KjU), null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        SelectionColors selectionColors = (SelectionColors) objRememberedValue;
        composer.endReplaceableGroup();
        return selectionColors;
    }
}
