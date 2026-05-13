package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JQ\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u0019H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 Jo\u0010!\u001a\u00020\"2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010#\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010$\u001a\u00020\u00192\b\b\u0002\u0010%\u001a\u00020\u00192\b\b\u0002\u0010&\u001a\u00020\u00192\b\b\u0002\u0010'\u001a\u00020\u0019H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)JQ\u0010*\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u0019H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010 Jo\u0010,\u001a\u00020\"2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010#\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010$\u001a\u00020\u00192\b\b\u0002\u0010%\u001a\u00020\u00192\b\b\u0002\u0010&\u001a\u00020\u00192\b\b\u0002\u0010'\u001a\u00020\u0019H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010)R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\tR\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0011\u0010\tR\u0011\u0010\u0012\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/material/ChipDefaults;", "", "()V", "ContentOpacity", "", "LeadingIconOpacity", "LeadingIconSize", "Landroidx/compose/ui/unit/Dp;", "getLeadingIconSize-D9Ej5fM", "()F", "F", "MinHeight", "getMinHeight-D9Ej5fM", "OutlinedBorderOpacity", "OutlinedBorderSize", "getOutlinedBorderSize-D9Ej5fM", "SelectedIconSize", "getSelectedIconSize-D9Ej5fM", "outlinedBorder", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "chipColors", "Landroidx/compose/material/ChipColors;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "leadingIconContentColor", "disabledBackgroundColor", "disabledContentColor", "disabledLeadingIconContentColor", "chipColors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ChipColors;", "filterChipColors", "Landroidx/compose/material/SelectableChipColors;", "leadingIconColor", "disabledLeadingIconColor", "selectedBackgroundColor", "selectedContentColor", "selectedLeadingIconColor", "filterChipColors-J08w3-E", "(JJJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/SelectableChipColors;", "outlinedChipColors", "outlinedChipColors-5tl4gsc", "outlinedFilterChipColors", "outlinedFilterChipColors-J08w3-E", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@ExperimentalMaterialApi
public final class ChipDefaults {
    public static final int $stable = 0;
    public static final float ContentOpacity = 0.87f;
    public static final float LeadingIconOpacity = 0.54f;
    public static final float OutlinedBorderOpacity = 0.12f;

    @NotNull
    public static final ChipDefaults INSTANCE = new ChipDefaults();
    private static final float MinHeight = Dp.m3826constructorimpl(32);
    private static final float OutlinedBorderSize = Dp.m3826constructorimpl(1);
    private static final float LeadingIconSize = Dp.m3826constructorimpl(20);
    private static final float SelectedIconSize = Dp.m3826constructorimpl(18);

    private ChipDefaults() {
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: chipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m947chipColors5tl4gsc(long j10, long j11, long j12, long j13, long j14, long j15, @Nullable Composer composer, int i10, int i11) {
        long jM1665compositeOverOWjLjI;
        long jM1665compositeOverOWjLjI2;
        composer.startReplaceableGroup(1838505436);
        if ((i11 & 1) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            jM1665compositeOverOWjLjI = ColorKt.m1665compositeOverOWjLjI(Color.m1618copywmQWz5c$default(materialTheme.getColors(composer, 6).m966getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m971getSurface0d7_KjU());
        } else {
            jM1665compositeOverOWjLjI = j10;
        }
        long jM1618copywmQWz5c$default = (i11 & 2) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m966getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jM1618copywmQWz5c$default2 = (i11 & 4) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        if ((i11 & 8) != 0) {
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            jM1665compositeOverOWjLjI2 = ColorKt.m1665compositeOverOWjLjI(Color.m1618copywmQWz5c$default(materialTheme2.getColors(composer, 6).m966getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme2.getColors(composer, 6).m971getSurface0d7_KjU());
        } else {
            jM1665compositeOverOWjLjI2 = j13;
        }
        DefaultChipColors defaultChipColors = new DefaultChipColors(jM1665compositeOverOWjLjI, jM1618copywmQWz5c$default, jM1618copywmQWz5c$default2, jM1665compositeOverOWjLjI2, (i11 & 16) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j14, (i11 & 32) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j15, null);
        composer.endReplaceableGroup();
        return defaultChipColors;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: filterChipColors-J08w3-E, reason: not valid java name */
    public final SelectableChipColors m948filterChipColorsJ08w3E(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, @Nullable Composer composer, int i10, int i11) {
        long jM1665compositeOverOWjLjI;
        long jM1665compositeOverOWjLjI2;
        composer.startReplaceableGroup(830140629);
        if ((i11 & 1) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            jM1665compositeOverOWjLjI = ColorKt.m1665compositeOverOWjLjI(Color.m1618copywmQWz5c$default(materialTheme.getColors(composer, 6).m966getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m971getSurface0d7_KjU());
        } else {
            jM1665compositeOverOWjLjI = j10;
        }
        long jM1618copywmQWz5c$default = (i11 & 2) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m966getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jM1618copywmQWz5c$default2 = (i11 & 4) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        if ((i11 & 8) != 0) {
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            jM1665compositeOverOWjLjI2 = ColorKt.m1665compositeOverOWjLjI(Color.m1618copywmQWz5c$default(materialTheme2.getColors(composer, 6).m966getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme2.getColors(composer, 6).m971getSurface0d7_KjU());
        } else {
            jM1665compositeOverOWjLjI2 = j13;
        }
        DefaultSelectableChipColors defaultSelectableChipColors = new DefaultSelectableChipColors(jM1665compositeOverOWjLjI, jM1618copywmQWz5c$default, jM1618copywmQWz5c$default2, jM1665compositeOverOWjLjI2, (i11 & 16) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j14, (i11 & 32) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j15, (i11 & 64) != 0 ? ColorKt.m1665compositeOverOWjLjI(Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m966getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), jM1665compositeOverOWjLjI) : j16, (i11 & 128) != 0 ? ColorKt.m1665compositeOverOWjLjI(Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m966getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), jM1618copywmQWz5c$default) : j17, (i11 & 256) != 0 ? ColorKt.m1665compositeOverOWjLjI(Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m966getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), jM1618copywmQWz5c$default2) : j18, null);
        composer.endReplaceableGroup();
        return defaultSelectableChipColors;
    }

    /* JADX INFO: renamed from: getLeadingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m949getLeadingIconSizeD9Ej5fM() {
        return LeadingIconSize;
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m950getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    @Composable
    @NotNull
    public final BorderStroke getOutlinedBorder(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1650225597);
        BorderStroke borderStrokeM178BorderStrokecXLIe8U = BorderStrokeKt.m178BorderStrokecXLIe8U(OutlinedBorderSize, Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m966getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        composer.endReplaceableGroup();
        return borderStrokeM178BorderStrokecXLIe8U;
    }

    /* JADX INFO: renamed from: getOutlinedBorderSize-D9Ej5fM, reason: not valid java name */
    public final float m951getOutlinedBorderSizeD9Ej5fM() {
        return OutlinedBorderSize;
    }

    /* JADX INFO: renamed from: getSelectedIconSize-D9Ej5fM, reason: not valid java name */
    public final float m952getSelectedIconSizeD9Ej5fM() {
        return SelectedIconSize;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: outlinedChipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m953outlinedChipColors5tl4gsc(long j10, long j11, long j12, long j13, long j14, long j15, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-1763922662);
        long jM971getSurface0d7_KjU = (i11 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m971getSurface0d7_KjU() : j10;
        long jM1618copywmQWz5c$default = (i11 & 2) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m966getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jM1618copywmQWz5c$default2 = (i11 & 4) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        ChipColors chipColorsM947chipColors5tl4gsc = m947chipColors5tl4gsc(jM971getSurface0d7_KjU, jM1618copywmQWz5c$default, jM1618copywmQWz5c$default2, (i11 & 8) != 0 ? jM971getSurface0d7_KjU : j13, (i11 & 16) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j14, (i11 & 32) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j15, composer, (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (i10 & 3670016), 0);
        composer.endReplaceableGroup();
        return chipColorsM947chipColors5tl4gsc;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: outlinedFilterChipColors-J08w3-E, reason: not valid java name */
    public final SelectableChipColors m954outlinedFilterChipColorsJ08w3E(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(346878099);
        long jM971getSurface0d7_KjU = (i11 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m971getSurface0d7_KjU() : j10;
        long jM1618copywmQWz5c$default = (i11 & 2) != 0 ? Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m966getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jM1618copywmQWz5c$default2 = (i11 & 4) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        DefaultSelectableChipColors defaultSelectableChipColors = new DefaultSelectableChipColors(jM971getSurface0d7_KjU, jM1618copywmQWz5c$default, jM1618copywmQWz5c$default2, (i11 & 8) != 0 ? jM971getSurface0d7_KjU : j13, (i11 & 16) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j14, (i11 & 32) != 0 ? Color.m1618copywmQWz5c$default(jM1618copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j15, (i11 & 64) != 0 ? ColorKt.m1665compositeOverOWjLjI(Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m966getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), jM971getSurface0d7_KjU) : j16, (i11 & 128) != 0 ? ColorKt.m1665compositeOverOWjLjI(Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m966getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), jM1618copywmQWz5c$default) : j17, (i11 & 256) != 0 ? ColorKt.m1665compositeOverOWjLjI(Color.m1618copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m966getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), jM1618copywmQWz5c$default2) : j18, null);
        composer.endReplaceableGroup();
        return defaultSelectableChipColors;
    }
}
