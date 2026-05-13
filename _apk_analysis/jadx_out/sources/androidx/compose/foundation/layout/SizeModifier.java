package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.p;
import zn.n;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BN\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001a\u0012\u0006\u0010 \u001a\u00020\u0017\u0012\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&ø\u0001\u0000¢\u0006\u0004\b*\u0010+J)\u0010\u000b\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u0010\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001c\u0010\u0012\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001c\u0010\u0014\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u000eH\u0016R\u001d\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u001d\u0010\u001e\u001a\u00020\u001a8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u001d\u0010\u001f\u001a\u00020\u001a8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0014\u0010 \u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R!\u0010%\u001a\u00020\u0006*\u00020\"8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006,"}, d2 = {"Landroidx/compose/foundation/layout/SizeModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "", "other", "", "equals", "hashCode", "Landroidx/compose/ui/unit/Dp;", "minWidth", "F", "minHeight", "maxWidth", "maxHeight", "enforceIncoming", "Z", "Landroidx/compose/ui/unit/Density;", "getTargetConstraints-OenEA2s", "(Landroidx/compose/ui/unit/Density;)J", "targetConstraints", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "Lbn/r;", "inspectorInfo", "<init>", "(FFFFZLsn/l;Ltn/i;)V", "foundation-layout_release"}, k = 1, mv = {1, 6, 0})
final class SizeModifier extends InspectorValueInfo implements LayoutModifier {
    private final boolean enforceIncoming;
    private final float maxHeight;
    private final float maxWidth;
    private final float minHeight;
    private final float minWidth;

    private SizeModifier(float f10, float f11, float f12, float f13, boolean z10, l<? super InspectorInfo, r> lVar) {
        super(lVar);
        this.minWidth = f10;
        this.minHeight = f11;
        this.maxWidth = f12;
        this.maxHeight = f13;
        this.enforceIncoming = z10;
    }

    public /* synthetic */ SizeModifier(float f10, float f11, float f12, float f13, boolean z10, l lVar, int i10, i iVar) {
        this((i10 & 1) != 0 ? Dp.INSTANCE.m3846getUnspecifiedD9Ej5fM() : f10, (i10 & 2) != 0 ? Dp.INSTANCE.m3846getUnspecifiedD9Ej5fM() : f11, (i10 & 4) != 0 ? Dp.INSTANCE.m3846getUnspecifiedD9Ej5fM() : f12, (i10 & 8) != 0 ? Dp.INSTANCE.m3846getUnspecifiedD9Ej5fM() : f13, z10, lVar, null);
    }

    public /* synthetic */ SizeModifier(float f10, float f11, float f12, float f13, boolean z10, l lVar, i iVar) {
        this(f10, f11, f12, f13, z10, lVar);
    }

    /* JADX INFO: renamed from: getTargetConstraints-OenEA2s, reason: not valid java name */
    private final long m463getTargetConstraintsOenEA2s(Density density) {
        int iE;
        int iE2;
        float f10 = this.maxWidth;
        Dp.Companion companion = Dp.INSTANCE;
        int i10 = 0;
        int iMo300roundToPx0680j_4 = !Dp.m3831equalsimpl0(f10, companion.m3846getUnspecifiedD9Ej5fM()) ? density.mo300roundToPx0680j_4(((Dp) n.g(Dp.m3824boximpl(this.maxWidth), Dp.m3824boximpl(Dp.m3826constructorimpl(0)))).m3840unboximpl()) : Integer.MAX_VALUE;
        int iMo300roundToPx0680j_42 = !Dp.m3831equalsimpl0(this.maxHeight, companion.m3846getUnspecifiedD9Ej5fM()) ? density.mo300roundToPx0680j_4(((Dp) n.g(Dp.m3824boximpl(this.maxHeight), Dp.m3824boximpl(Dp.m3826constructorimpl(0)))).m3840unboximpl()) : Integer.MAX_VALUE;
        if (Dp.m3831equalsimpl0(this.minWidth, companion.m3846getUnspecifiedD9Ej5fM()) || (iE = n.e(n.j(density.mo300roundToPx0680j_4(this.minWidth), iMo300roundToPx0680j_4), 0)) == Integer.MAX_VALUE) {
            iE = 0;
        }
        if (!Dp.m3831equalsimpl0(this.minHeight, companion.m3846getUnspecifiedD9Ej5fM()) && (iE2 = n.e(n.j(density.mo300roundToPx0680j_4(this.minHeight), iMo300roundToPx0680j_42), 0)) != Integer.MAX_VALUE) {
            i10 = iE2;
        }
        return ConstraintsKt.Constraints(iE, iMo300roundToPx0680j_4, i10, iMo300roundToPx0680j_42);
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof SizeModifier)) {
            return false;
        }
        SizeModifier sizeModifier = (SizeModifier) other;
        return Dp.m3831equalsimpl0(this.minWidth, sizeModifier.minWidth) && Dp.m3831equalsimpl0(this.minHeight, sizeModifier.minHeight) && Dp.m3831equalsimpl0(this.maxWidth, sizeModifier.maxWidth) && Dp.m3831equalsimpl0(this.maxHeight, sizeModifier.maxHeight) && this.enforceIncoming == sizeModifier.enforceIncoming;
    }

    public int hashCode() {
        return ((((((Dp.m3832hashCodeimpl(this.minWidth) * 31) + Dp.m3832hashCodeimpl(this.minHeight)) * 31) + Dp.m3832hashCodeimpl(this.maxWidth)) * 31) + Dp.m3832hashCodeimpl(this.maxHeight)) * 31;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i10) {
        p.k(intrinsicMeasureScope, "<this>");
        p.k(intrinsicMeasurable, "measurable");
        long jM463getTargetConstraintsOenEA2s = m463getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m3779getHasFixedHeightimpl(jM463getTargetConstraintsOenEA2s) ? Constraints.m3781getMaxHeightimpl(jM463getTargetConstraintsOenEA2s) : ConstraintsKt.m3795constrainHeightK40F9xA(jM463getTargetConstraintsOenEA2s, intrinsicMeasurable.maxIntrinsicHeight(i10));
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i10) {
        p.k(intrinsicMeasureScope, "<this>");
        p.k(intrinsicMeasurable, "measurable");
        long jM463getTargetConstraintsOenEA2s = m463getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m3780getHasFixedWidthimpl(jM463getTargetConstraintsOenEA2s) ? Constraints.m3782getMaxWidthimpl(jM463getTargetConstraintsOenEA2s) : ConstraintsKt.m3796constrainWidthK40F9xA(jM463getTargetConstraintsOenEA2s, intrinsicMeasurable.maxIntrinsicWidth(i10));
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo21measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j10) {
        long jConstraints;
        p.k(measureScope, "$this$measure");
        p.k(measurable, "measurable");
        long jM463getTargetConstraintsOenEA2s = m463getTargetConstraintsOenEA2s(measureScope);
        if (this.enforceIncoming) {
            jConstraints = ConstraintsKt.m3794constrainN9IONVI(j10, jM463getTargetConstraintsOenEA2s);
        } else {
            float f10 = this.minWidth;
            Dp.Companion companion = Dp.INSTANCE;
            jConstraints = ConstraintsKt.Constraints(!Dp.m3831equalsimpl0(f10, companion.m3846getUnspecifiedD9Ej5fM()) ? Constraints.m3784getMinWidthimpl(jM463getTargetConstraintsOenEA2s) : n.j(Constraints.m3784getMinWidthimpl(j10), Constraints.m3782getMaxWidthimpl(jM463getTargetConstraintsOenEA2s)), !Dp.m3831equalsimpl0(this.maxWidth, companion.m3846getUnspecifiedD9Ej5fM()) ? Constraints.m3782getMaxWidthimpl(jM463getTargetConstraintsOenEA2s) : n.e(Constraints.m3782getMaxWidthimpl(j10), Constraints.m3784getMinWidthimpl(jM463getTargetConstraintsOenEA2s)), !Dp.m3831equalsimpl0(this.minHeight, companion.m3846getUnspecifiedD9Ej5fM()) ? Constraints.m3783getMinHeightimpl(jM463getTargetConstraintsOenEA2s) : n.j(Constraints.m3783getMinHeightimpl(j10), Constraints.m3781getMaxHeightimpl(jM463getTargetConstraintsOenEA2s)), !Dp.m3831equalsimpl0(this.maxHeight, companion.m3846getUnspecifiedD9Ej5fM()) ? Constraints.m3781getMaxHeightimpl(jM463getTargetConstraintsOenEA2s) : n.e(Constraints.m3781getMaxHeightimpl(j10), Constraints.m3783getMinHeightimpl(jM463getTargetConstraintsOenEA2s)));
        }
        final Placeable placeableMo3112measureBRTryo0 = measurable.mo3112measureBRTryo0(jConstraints);
        return MeasureScope.layout$default(measureScope, placeableMo3112measureBRTryo0.getWidth(), placeableMo3112measureBRTryo0.getHeight(), null, new l<Placeable.PlacementScope, r>() { // from class: androidx.compose.foundation.layout.SizeModifier$measure$1
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                p.k(placementScope, "$this$layout");
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo3112measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i10) {
        p.k(intrinsicMeasureScope, "<this>");
        p.k(intrinsicMeasurable, "measurable");
        long jM463getTargetConstraintsOenEA2s = m463getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m3779getHasFixedHeightimpl(jM463getTargetConstraintsOenEA2s) ? Constraints.m3781getMaxHeightimpl(jM463getTargetConstraintsOenEA2s) : ConstraintsKt.m3795constrainHeightK40F9xA(jM463getTargetConstraintsOenEA2s, intrinsicMeasurable.minIntrinsicHeight(i10));
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i10) {
        p.k(intrinsicMeasureScope, "<this>");
        p.k(intrinsicMeasurable, "measurable");
        long jM463getTargetConstraintsOenEA2s = m463getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m3780getHasFixedWidthimpl(jM463getTargetConstraintsOenEA2s) ? Constraints.m3782getMaxWidthimpl(jM463getTargetConstraintsOenEA2s) : ConstraintsKt.m3796constrainWidthK40F9xA(jM463getTargetConstraintsOenEA2s, intrinsicMeasurable.minIntrinsicWidth(i10));
    }
}
