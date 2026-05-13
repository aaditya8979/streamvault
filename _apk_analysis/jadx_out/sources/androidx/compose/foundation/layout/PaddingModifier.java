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
import tn.i;
import tn.p;

/* JADX INFO: compiled from: Padding.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BN\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0012\u0012\u0006\u0010\u001d\u001a\u00020\u0010\u0012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!ø\u0001\u0000¢\u0006\u0004\b%\u0010&J)\u0010\u000b\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\b\u0010\r\u001a\u00020\fH\u0016J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002R \u0010\u0013\u001a\u00020\u00128\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u00020\u00128\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R \u0010\u0019\u001a\u00020\u00128\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R \u0010\u001b\u001a\u00020\u00128\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/foundation/layout/PaddingModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "hashCode", "", "other", "", "equals", "Landroidx/compose/ui/unit/Dp;", "start", "F", "getStart-D9Ej5fM", "()F", "top", "getTop-D9Ej5fM", "end", "getEnd-D9Ej5fM", "bottom", "getBottom-D9Ej5fM", "rtlAware", "Z", "getRtlAware", "()Z", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "Lbn/r;", "inspectorInfo", "<init>", "(FFFFZLsn/l;Ltn/i;)V", "foundation-layout_release"}, k = 1, mv = {1, 6, 0})
final class PaddingModifier extends InspectorValueInfo implements LayoutModifier {
    private final float bottom;
    private final float end;
    private final boolean rtlAware;
    private final float start;
    private final float top;

    private PaddingModifier(float f10, float f11, float f12, float f13, boolean z10, l<? super InspectorInfo, r> lVar) {
        super(lVar);
        this.start = f10;
        this.top = f11;
        this.end = f12;
        this.bottom = f13;
        this.rtlAware = z10;
        if (!((f10 >= 0.0f || Dp.m3831equalsimpl0(f10, Dp.INSTANCE.m3846getUnspecifiedD9Ej5fM())) && (f11 >= 0.0f || Dp.m3831equalsimpl0(f11, Dp.INSTANCE.m3846getUnspecifiedD9Ej5fM())) && ((f12 >= 0.0f || Dp.m3831equalsimpl0(f12, Dp.INSTANCE.m3846getUnspecifiedD9Ej5fM())) && (f13 >= 0.0f || Dp.m3831equalsimpl0(f13, Dp.INSTANCE.m3846getUnspecifiedD9Ej5fM()))))) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
    }

    public /* synthetic */ PaddingModifier(float f10, float f11, float f12, float f13, boolean z10, l lVar, int i10, i iVar) {
        this((i10 & 1) != 0 ? Dp.m3826constructorimpl(0) : f10, (i10 & 2) != 0 ? Dp.m3826constructorimpl(0) : f11, (i10 & 4) != 0 ? Dp.m3826constructorimpl(0) : f12, (i10 & 8) != 0 ? Dp.m3826constructorimpl(0) : f13, z10, lVar, null);
    }

    public /* synthetic */ PaddingModifier(float f10, float f11, float f12, float f13, boolean z10, l lVar, i iVar) {
        this(f10, f11, f12, f13, z10, lVar);
    }

    public boolean equals(@Nullable Object other) {
        PaddingModifier paddingModifier = other instanceof PaddingModifier ? (PaddingModifier) other : null;
        return paddingModifier != null && Dp.m3831equalsimpl0(this.start, paddingModifier.start) && Dp.m3831equalsimpl0(this.top, paddingModifier.top) && Dp.m3831equalsimpl0(this.end, paddingModifier.end) && Dp.m3831equalsimpl0(this.bottom, paddingModifier.bottom) && this.rtlAware == paddingModifier.rtlAware;
    }

    /* JADX INFO: renamed from: getBottom-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: getEnd-D9Ej5fM, reason: not valid java name and from getter */
    public final float getEnd() {
        return this.end;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* JADX INFO: renamed from: getStart-D9Ej5fM, reason: not valid java name and from getter */
    public final float getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: getTop-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTop() {
        return this.top;
    }

    public int hashCode() {
        return (((((((Dp.m3832hashCodeimpl(this.start) * 31) + Dp.m3832hashCodeimpl(this.top)) * 31) + Dp.m3832hashCodeimpl(this.end)) * 31) + Dp.m3832hashCodeimpl(this.bottom)) * 31) + Boolean.hashCode(this.rtlAware);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo21measure3p2s80s(@NotNull final MeasureScope measureScope, @NotNull Measurable measurable, long j10) {
        p.k(measureScope, "$this$measure");
        p.k(measurable, "measurable");
        int iMo300roundToPx0680j_4 = measureScope.mo300roundToPx0680j_4(this.start) + measureScope.mo300roundToPx0680j_4(this.end);
        int iMo300roundToPx0680j_42 = measureScope.mo300roundToPx0680j_4(this.top) + measureScope.mo300roundToPx0680j_4(this.bottom);
        final Placeable placeableMo3112measureBRTryo0 = measurable.mo3112measureBRTryo0(ConstraintsKt.m3798offsetNN6EwU(j10, -iMo300roundToPx0680j_4, -iMo300roundToPx0680j_42));
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m3796constrainWidthK40F9xA(j10, placeableMo3112measureBRTryo0.getWidth() + iMo300roundToPx0680j_4), ConstraintsKt.m3795constrainHeightK40F9xA(j10, placeableMo3112measureBRTryo0.getHeight() + iMo300roundToPx0680j_42), null, new l<Placeable.PlacementScope, r>() { // from class: androidx.compose.foundation.layout.PaddingModifier$measure$1
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
                if (this.this$0.getRtlAware()) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo3112measureBRTryo0, measureScope.mo300roundToPx0680j_4(this.this$0.getStart()), measureScope.mo300roundToPx0680j_4(this.this$0.getTop()), 0.0f, 4, null);
                } else {
                    Placeable.PlacementScope.place$default(placementScope, placeableMo3112measureBRTryo0, measureScope.mo300roundToPx0680j_4(this.this$0.getStart()), measureScope.mo300roundToPx0680j_4(this.this$0.getTop()), 0.0f, 4, null);
                }
            }
        }, 4, null);
    }
}
