package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;
import tn.t;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes4.dex */
@Immutable
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0003\u0018\u00002\u00020\u0001BZ\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u0013\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u001d\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u001d\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001d\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001d\u0010\u0014\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001d\u0010\u0015\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u001d\u0010\u0016\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u001d\u0010\u0017\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u001d\u0010\u0018\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u001d\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u001d\u0010\u001a\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/material/DefaultSliderColors;", "Landroidx/compose/material/SliderColors;", "", "enabled", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "thumbColor", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "trackColor", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "tickColor", "", "other", "equals", "", "hashCode", "J", "disabledThumbColor", "activeTrackColor", "inactiveTrackColor", "disabledActiveTrackColor", "disabledInactiveTrackColor", "activeTickColor", "inactiveTickColor", "disabledActiveTickColor", "disabledInactiveTickColor", "<init>", "(JJJJJJJJJJLtn/i;)V", "material_release"}, k = 1, mv = {1, 6, 0})
final class DefaultSliderColors implements SliderColors {
    private final long activeTickColor;
    private final long activeTrackColor;
    private final long disabledActiveTickColor;
    private final long disabledActiveTrackColor;
    private final long disabledInactiveTickColor;
    private final long disabledInactiveTrackColor;
    private final long disabledThumbColor;
    private final long inactiveTickColor;
    private final long inactiveTrackColor;
    private final long thumbColor;

    private DefaultSliderColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        this.thumbColor = j10;
        this.disabledThumbColor = j11;
        this.activeTrackColor = j12;
        this.inactiveTrackColor = j13;
        this.disabledActiveTrackColor = j14;
        this.disabledInactiveTrackColor = j15;
        this.activeTickColor = j16;
        this.inactiveTickColor = j17;
        this.disabledActiveTickColor = j18;
        this.disabledInactiveTickColor = j19;
    }

    public /* synthetic */ DefaultSliderColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, i iVar) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !p.f(t.b(DefaultSliderColors.class), t.b(other.getClass()))) {
            return false;
        }
        DefaultSliderColors defaultSliderColors = (DefaultSliderColors) other;
        return Color.m1620equalsimpl0(this.thumbColor, defaultSliderColors.thumbColor) && Color.m1620equalsimpl0(this.disabledThumbColor, defaultSliderColors.disabledThumbColor) && Color.m1620equalsimpl0(this.activeTrackColor, defaultSliderColors.activeTrackColor) && Color.m1620equalsimpl0(this.inactiveTrackColor, defaultSliderColors.inactiveTrackColor) && Color.m1620equalsimpl0(this.disabledActiveTrackColor, defaultSliderColors.disabledActiveTrackColor) && Color.m1620equalsimpl0(this.disabledInactiveTrackColor, defaultSliderColors.disabledInactiveTrackColor) && Color.m1620equalsimpl0(this.activeTickColor, defaultSliderColors.activeTickColor) && Color.m1620equalsimpl0(this.inactiveTickColor, defaultSliderColors.inactiveTickColor) && Color.m1620equalsimpl0(this.disabledActiveTickColor, defaultSliderColors.disabledActiveTickColor) && Color.m1620equalsimpl0(this.disabledInactiveTickColor, defaultSliderColors.disabledInactiveTickColor);
    }

    public int hashCode() {
        return (((((((((((((((((Color.m1626hashCodeimpl(this.thumbColor) * 31) + Color.m1626hashCodeimpl(this.disabledThumbColor)) * 31) + Color.m1626hashCodeimpl(this.activeTrackColor)) * 31) + Color.m1626hashCodeimpl(this.inactiveTrackColor)) * 31) + Color.m1626hashCodeimpl(this.disabledActiveTrackColor)) * 31) + Color.m1626hashCodeimpl(this.disabledInactiveTrackColor)) * 31) + Color.m1626hashCodeimpl(this.activeTickColor)) * 31) + Color.m1626hashCodeimpl(this.inactiveTickColor)) * 31) + Color.m1626hashCodeimpl(this.disabledActiveTickColor)) * 31) + Color.m1626hashCodeimpl(this.disabledInactiveTickColor);
    }

    @Override // androidx.compose.material.SliderColors
    @Composable
    @NotNull
    public State<Color> thumbColor(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1733795637);
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1609boximpl(z10 ? this.thumbColor : this.disabledThumbColor), composer, 0);
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.SliderColors
    @Composable
    @NotNull
    public State<Color> tickColor(boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1491563694);
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1609boximpl(z10 ? z11 ? this.activeTickColor : this.inactiveTickColor : z11 ? this.disabledActiveTickColor : this.disabledInactiveTickColor), composer, 0);
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.SliderColors
    @Composable
    @NotNull
    public State<Color> trackColor(boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(1575395620);
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1609boximpl(z10 ? z11 ? this.activeTrackColor : this.inactiveTrackColor : z11 ? this.disabledActiveTrackColor : this.disabledInactiveTrackColor), composer, 0);
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }
}
