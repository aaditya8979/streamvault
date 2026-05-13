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
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.p;
import zn.n;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BP\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0017\u0012\u0006\u0010\u001d\u001a\u00020\f\u0012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001fø\u0001\u0000¢\u0006\u0004\b#\u0010$J)\u0010\u000b\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R)\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00178\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "other", "", "equals", "", "hashCode", "Landroidx/compose/foundation/layout/Direction;", "direction", "Landroidx/compose/foundation/layout/Direction;", "unbounded", "Z", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/IntOffset;", "alignmentCallback", "Lsn/p;", "align", "Ljava/lang/Object;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "Lbn/r;", "inspectorInfo", "<init>", "(Landroidx/compose/foundation/layout/Direction;ZLsn/p;Ljava/lang/Object;Lsn/l;)V", "foundation-layout_release"}, k = 1, mv = {1, 6, 0})
final class WrapContentModifier extends InspectorValueInfo implements LayoutModifier {

    @NotNull
    private final Object align;

    @NotNull
    private final p<IntSize, LayoutDirection, IntOffset> alignmentCallback;

    @NotNull
    private final Direction direction;
    private final boolean unbounded;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentModifier(@NotNull Direction direction, boolean z10, @NotNull p<? super IntSize, ? super LayoutDirection, IntOffset> pVar, @NotNull Object obj, @NotNull l<? super InspectorInfo, r> lVar) {
        super(lVar);
        tn.p.k(direction, "direction");
        tn.p.k(pVar, "alignmentCallback");
        tn.p.k(obj, "align");
        tn.p.k(lVar, "inspectorInfo");
        this.direction = direction;
        this.unbounded = z10;
        this.alignmentCallback = pVar;
        this.align = obj;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof WrapContentModifier)) {
            return false;
        }
        WrapContentModifier wrapContentModifier = (WrapContentModifier) other;
        return this.direction == wrapContentModifier.direction && this.unbounded == wrapContentModifier.unbounded && tn.p.f(this.align, wrapContentModifier.align);
    }

    public int hashCode() {
        return (((this.direction.hashCode() * 31) + Boolean.hashCode(this.unbounded)) * 31) + this.align.hashCode();
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo21measure3p2s80s(@NotNull final MeasureScope measureScope, @NotNull Measurable measurable, long j10) {
        tn.p.k(measureScope, "$this$measure");
        tn.p.k(measurable, "measurable");
        Direction direction = this.direction;
        Direction direction2 = Direction.Vertical;
        int iM3784getMinWidthimpl = direction != direction2 ? 0 : Constraints.m3784getMinWidthimpl(j10);
        Direction direction3 = this.direction;
        Direction direction4 = Direction.Horizontal;
        final Placeable placeableMo3112measureBRTryo0 = measurable.mo3112measureBRTryo0(ConstraintsKt.Constraints(iM3784getMinWidthimpl, (this.direction == direction2 || !this.unbounded) ? Constraints.m3782getMaxWidthimpl(j10) : Integer.MAX_VALUE, direction3 == direction4 ? Constraints.m3783getMinHeightimpl(j10) : 0, (this.direction == direction4 || !this.unbounded) ? Constraints.m3781getMaxHeightimpl(j10) : Integer.MAX_VALUE));
        final int iN = n.n(placeableMo3112measureBRTryo0.getWidth(), Constraints.m3784getMinWidthimpl(j10), Constraints.m3782getMaxWidthimpl(j10));
        final int iN2 = n.n(placeableMo3112measureBRTryo0.getHeight(), Constraints.m3783getMinHeightimpl(j10), Constraints.m3781getMaxHeightimpl(j10));
        return MeasureScope.layout$default(measureScope, iN, iN2, null, new l<Placeable.PlacementScope, r>() { // from class: androidx.compose.foundation.layout.WrapContentModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                tn.p.k(placementScope, "$this$layout");
                Placeable.PlacementScope.m3154place70tqf50$default(placementScope, placeableMo3112measureBRTryo0, ((IntOffset) this.this$0.alignmentCallback.mo2invoke(IntSize.m3978boximpl(IntSizeKt.IntSize(iN - placeableMo3112measureBRTryo0.getWidth(), iN2 - placeableMo3112measureBRTryo0.getHeight())), measureScope.getLayoutDirection())).getPackedValue(), 0.0f, 2, null);
            }
        }, 4, null);
    }
}
