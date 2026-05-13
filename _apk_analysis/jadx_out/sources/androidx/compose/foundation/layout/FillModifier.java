package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;
import vn.c;
import zn.n;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u000b\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/layout/FillModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "other", "", "equals", "", "hashCode", "Landroidx/compose/foundation/layout/Direction;", "direction", "Landroidx/compose/foundation/layout/Direction;", "", "fraction", "F", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "Lbn/r;", "inspectorInfo", "<init>", "(Landroidx/compose/foundation/layout/Direction;FLsn/l;)V", "foundation-layout_release"}, k = 1, mv = {1, 6, 0})
final class FillModifier extends InspectorValueInfo implements LayoutModifier {

    @NotNull
    private final Direction direction;
    private final float fraction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FillModifier(@NotNull Direction direction, float f10, @NotNull l<? super InspectorInfo, r> lVar) {
        super(lVar);
        p.k(direction, "direction");
        p.k(lVar, "inspectorInfo");
        this.direction = direction;
        this.fraction = f10;
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof FillModifier) {
            FillModifier fillModifier = (FillModifier) other;
            if (this.direction == fillModifier.direction) {
                if (this.fraction == fillModifier.fraction) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.direction.hashCode() * 31) + Float.hashCode(this.fraction);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo21measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j10) {
        int iM3784getMinWidthimpl;
        int iM3782getMaxWidthimpl;
        int iM3781getMaxHeightimpl;
        int iN;
        p.k(measureScope, "$this$measure");
        p.k(measurable, "measurable");
        if (!Constraints.m3778getHasBoundedWidthimpl(j10) || this.direction == Direction.Vertical) {
            iM3784getMinWidthimpl = Constraints.m3784getMinWidthimpl(j10);
            iM3782getMaxWidthimpl = Constraints.m3782getMaxWidthimpl(j10);
        } else {
            iM3784getMinWidthimpl = n.n(c.d(Constraints.m3782getMaxWidthimpl(j10) * this.fraction), Constraints.m3784getMinWidthimpl(j10), Constraints.m3782getMaxWidthimpl(j10));
            iM3782getMaxWidthimpl = iM3784getMinWidthimpl;
        }
        if (!Constraints.m3777getHasBoundedHeightimpl(j10) || this.direction == Direction.Horizontal) {
            int iM3783getMinHeightimpl = Constraints.m3783getMinHeightimpl(j10);
            iM3781getMaxHeightimpl = Constraints.m3781getMaxHeightimpl(j10);
            iN = iM3783getMinHeightimpl;
        } else {
            iN = n.n(c.d(Constraints.m3781getMaxHeightimpl(j10) * this.fraction), Constraints.m3783getMinHeightimpl(j10), Constraints.m3781getMaxHeightimpl(j10));
            iM3781getMaxHeightimpl = iN;
        }
        final Placeable placeableMo3112measureBRTryo0 = measurable.mo3112measureBRTryo0(ConstraintsKt.Constraints(iM3784getMinWidthimpl, iM3782getMaxWidthimpl, iN, iM3781getMaxHeightimpl));
        return MeasureScope.layout$default(measureScope, placeableMo3112measureBRTryo0.getWidth(), placeableMo3112measureBRTryo0.getHeight(), null, new l<Placeable.PlacementScope, r>() { // from class: androidx.compose.foundation.layout.FillModifier$measure$1
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
}
