package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Switch.kt */
/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jy\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/SwitchDefaults;", "", "()V", "colors", "Landroidx/compose/material/SwitchColors;", "checkedThumbColor", "Landroidx/compose/ui/graphics/Color;", "checkedTrackColor", "checkedTrackAlpha", "", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedTrackAlpha", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "colors-SQMK_m0", "(JJFJJFJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material/SwitchColors;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SwitchDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final SwitchDefaults INSTANCE = new SwitchDefaults();

    private SwitchDefaults() {
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: colors-SQMK_m0, reason: not valid java name */
    public final SwitchColors m1175colorsSQMK_m0(long j10, long j11, float f10, long j12, long j13, float f11, long j14, long j15, long j16, long j17, @Nullable Composer composer, int i10, int i11, int i12) {
        long j18;
        long jM1665compositeOverOWjLjI;
        float f12;
        long jM1665compositeOverOWjLjI2;
        long j19;
        int i13;
        long jM1665compositeOverOWjLjI3;
        composer.startReplaceableGroup(-1032127534);
        long jM970getSecondaryVariant0d7_KjU = (i12 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m970getSecondaryVariant0d7_KjU() : j10;
        long j20 = (i12 & 2) != 0 ? jM970getSecondaryVariant0d7_KjU : j11;
        float f13 = (i12 & 4) != 0 ? 0.54f : f10;
        long jM971getSurface0d7_KjU = (i12 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m971getSurface0d7_KjU() : j12;
        long jM966getOnSurface0d7_KjU = (i12 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m966getOnSurface0d7_KjU() : j13;
        float f14 = (i12 & 32) != 0 ? 0.38f : f11;
        if ((i12 & 64) != 0) {
            j18 = jM970getSecondaryVariant0d7_KjU;
            jM1665compositeOverOWjLjI = ColorKt.m1665compositeOverOWjLjI(Color.m1618copywmQWz5c$default(jM970getSecondaryVariant0d7_KjU, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m971getSurface0d7_KjU());
        } else {
            j18 = jM970getSecondaryVariant0d7_KjU;
            jM1665compositeOverOWjLjI = j14;
        }
        if ((i12 & 128) != 0) {
            f12 = f14;
            jM1665compositeOverOWjLjI2 = ColorKt.m1665compositeOverOWjLjI(Color.m1618copywmQWz5c$default(j20, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m971getSurface0d7_KjU());
        } else {
            f12 = f14;
            jM1665compositeOverOWjLjI2 = j15;
        }
        if ((i12 & 256) != 0) {
            j19 = jM1665compositeOverOWjLjI;
            i13 = 6;
            jM1665compositeOverOWjLjI3 = ColorKt.m1665compositeOverOWjLjI(Color.m1618copywmQWz5c$default(jM971getSurface0d7_KjU, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m971getSurface0d7_KjU());
        } else {
            j19 = jM1665compositeOverOWjLjI;
            i13 = 6;
            jM1665compositeOverOWjLjI3 = j16;
        }
        DefaultSwitchColors defaultSwitchColors = new DefaultSwitchColors(j18, Color.m1618copywmQWz5c$default(j20, f13, 0.0f, 0.0f, 0.0f, 14, null), jM971getSurface0d7_KjU, Color.m1618copywmQWz5c$default(jM966getOnSurface0d7_KjU, f12, 0.0f, 0.0f, 0.0f, 14, null), j19, Color.m1618copywmQWz5c$default(jM1665compositeOverOWjLjI2, f13, 0.0f, 0.0f, 0.0f, 14, null), jM1665compositeOverOWjLjI3, Color.m1618copywmQWz5c$default((i12 & 512) != 0 ? ColorKt.m1665compositeOverOWjLjI(Color.m1618copywmQWz5c$default(jM966getOnSurface0d7_KjU, ContentAlpha.INSTANCE.getDisabled(composer, i13), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m971getSurface0d7_KjU()) : j17, f12, 0.0f, 0.0f, 0.0f, 14, null), null);
        composer.endReplaceableGroup();
        return defaultSwitchColors;
    }
}
