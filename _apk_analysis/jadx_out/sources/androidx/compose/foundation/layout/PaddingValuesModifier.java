package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: Padding.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u000b\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\b\u0010\r\u001a\u00020\fH\u0016J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "hashCode", "", "other", "", "equals", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "getPaddingValues", "()Landroidx/compose/foundation/layout/PaddingValues;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "Lbn/r;", "inspectorInfo", "<init>", "(Landroidx/compose/foundation/layout/PaddingValues;Lsn/l;)V", "foundation-layout_release"}, k = 1, mv = {1, 6, 0})
final class PaddingValuesModifier extends InspectorValueInfo implements LayoutModifier {

    @NotNull
    private final PaddingValues paddingValues;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaddingValuesModifier(@NotNull PaddingValues paddingValues, @NotNull l<? super InspectorInfo, r> lVar) {
        super(lVar);
        p.k(paddingValues, "paddingValues");
        p.k(lVar, "inspectorInfo");
        this.paddingValues = paddingValues;
    }

    public boolean equals(@Nullable Object other) {
        PaddingValuesModifier paddingValuesModifier = other instanceof PaddingValuesModifier ? (PaddingValuesModifier) other : null;
        if (paddingValuesModifier == null) {
            return false;
        }
        return p.f(this.paddingValues, paddingValuesModifier.paddingValues);
    }

    @NotNull
    public final PaddingValues getPaddingValues() {
        return this.paddingValues;
    }

    public int hashCode() {
        return this.paddingValues.hashCode();
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo21measure3p2s80s(@NotNull final MeasureScope measureScope, @NotNull Measurable measurable, long j10) {
        p.k(measureScope, "$this$measure");
        p.k(measurable, "measurable");
        boolean z10 = false;
        float f10 = 0;
        if (Dp.m3825compareTo0680j_4(this.paddingValues.mo392calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection()), Dp.m3826constructorimpl(f10)) >= 0 && Dp.m3825compareTo0680j_4(this.paddingValues.getTop(), Dp.m3826constructorimpl(f10)) >= 0 && Dp.m3825compareTo0680j_4(this.paddingValues.mo393calculateRightPaddingu2uoSUM(measureScope.getLayoutDirection()), Dp.m3826constructorimpl(f10)) >= 0 && Dp.m3825compareTo0680j_4(this.paddingValues.getBottom(), Dp.m3826constructorimpl(f10)) >= 0) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
        int iMo300roundToPx0680j_4 = measureScope.mo300roundToPx0680j_4(this.paddingValues.mo392calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection())) + measureScope.mo300roundToPx0680j_4(this.paddingValues.mo393calculateRightPaddingu2uoSUM(measureScope.getLayoutDirection()));
        int iMo300roundToPx0680j_42 = measureScope.mo300roundToPx0680j_4(this.paddingValues.getTop()) + measureScope.mo300roundToPx0680j_4(this.paddingValues.getBottom());
        final Placeable placeableMo3112measureBRTryo0 = measurable.mo3112measureBRTryo0(ConstraintsKt.m3798offsetNN6EwU(j10, -iMo300roundToPx0680j_4, -iMo300roundToPx0680j_42));
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m3796constrainWidthK40F9xA(j10, placeableMo3112measureBRTryo0.getWidth() + iMo300roundToPx0680j_4), ConstraintsKt.m3795constrainHeightK40F9xA(j10, placeableMo3112measureBRTryo0.getHeight() + iMo300roundToPx0680j_42), null, new l<Placeable.PlacementScope, r>() { // from class: androidx.compose.foundation.layout.PaddingValuesModifier$measure$2
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
                p.k(placementScope, "$this$layout");
                Placeable.PlacementScope.place$default(placementScope, placeableMo3112measureBRTryo0, measureScope.mo300roundToPx0680j_4(this.getPaddingValues().mo392calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection())), measureScope.mo300roundToPx0680j_4(this.getPaddingValues().getTop()), 0.0f, 4, null);
            }
        }, 4, null);
    }
}
