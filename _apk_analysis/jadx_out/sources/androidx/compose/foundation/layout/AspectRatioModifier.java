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
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;
import vn.c;

/* JADX INFO: compiled from: AspectRatio.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010/\u001a\u00020\b\u0012\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020503¢\u0006\u0004\b7\u00108J\u0019\u0010\u0007\u001a\u00020\u0004*\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u0004*\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\u0004*\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000bJ#\u0010\u0010\u001a\u00020\u0004*\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ#\u0010\u0012\u001a\u00020\u0004*\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ)\u0010\u001a\u001a\u00020\u0017*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001f\u001a\u00020\u001d*\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u001c\u0010 \u001a\u00020\u001d*\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u001c\u0010\"\u001a\u00020\u001d*\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001dH\u0016J\u001c\u0010#\u001a\u00020\u001d*\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001dH\u0016J\u0013\u0010&\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010'\u001a\u00020\u001dH\u0016J\b\u0010)\u001a\u00020(H\u0016R\u0017\u0010+\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010/\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/unit/IntSize;", "findSize-ToXhtMw", "(J)J", "findSize", "", "enforceConstraints", "tryMaxWidth-JN-0ABg", "(JZ)J", "tryMaxWidth", "tryMaxHeight-JN-0ABg", "tryMaxHeight", "tryMinWidth-JN-0ABg", "tryMinWidth", "tryMinHeight-JN-0ABg", "tryMinHeight", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "", "other", "equals", "hashCode", "", "toString", "", "aspectRatio", "F", "getAspectRatio", "()F", "matchHeightConstraintsFirst", "Z", "getMatchHeightConstraintsFirst", "()Z", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "Lbn/r;", "inspectorInfo", "<init>", "(FZLsn/l;)V", "foundation-layout_release"}, k = 1, mv = {1, 6, 0})
final class AspectRatioModifier extends InspectorValueInfo implements LayoutModifier {
    private final float aspectRatio;
    private final boolean matchHeightConstraintsFirst;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectRatioModifier(float f10, boolean z10, @NotNull l<? super InspectorInfo, r> lVar) {
        super(lVar);
        p.k(lVar, "inspectorInfo");
        this.aspectRatio = f10;
        this.matchHeightConstraintsFirst = z10;
        if (f10 > 0.0f) {
            return;
        }
        throw new IllegalArgumentException(("aspectRatio " + f10 + " must be > 0").toString());
    }

    /* JADX INFO: renamed from: findSize-ToXhtMw, reason: not valid java name */
    private final long m373findSizeToXhtMw(long j10) {
        if (this.matchHeightConstraintsFirst) {
            long jM375tryMaxHeightJN0ABg$default = m375tryMaxHeightJN0ABg$default(this, j10, false, 1, null);
            IntSize.Companion companion = IntSize.INSTANCE;
            if (!IntSize.m3984equalsimpl0(jM375tryMaxHeightJN0ABg$default, companion.m3991getZeroYbymL2g())) {
                return jM375tryMaxHeightJN0ABg$default;
            }
            long jM377tryMaxWidthJN0ABg$default = m377tryMaxWidthJN0ABg$default(this, j10, false, 1, null);
            if (!IntSize.m3984equalsimpl0(jM377tryMaxWidthJN0ABg$default, companion.m3991getZeroYbymL2g())) {
                return jM377tryMaxWidthJN0ABg$default;
            }
            long jM379tryMinHeightJN0ABg$default = m379tryMinHeightJN0ABg$default(this, j10, false, 1, null);
            if (!IntSize.m3984equalsimpl0(jM379tryMinHeightJN0ABg$default, companion.m3991getZeroYbymL2g())) {
                return jM379tryMinHeightJN0ABg$default;
            }
            long jM381tryMinWidthJN0ABg$default = m381tryMinWidthJN0ABg$default(this, j10, false, 1, null);
            if (!IntSize.m3984equalsimpl0(jM381tryMinWidthJN0ABg$default, companion.m3991getZeroYbymL2g())) {
                return jM381tryMinWidthJN0ABg$default;
            }
            long jM374tryMaxHeightJN0ABg = m374tryMaxHeightJN0ABg(j10, false);
            if (!IntSize.m3984equalsimpl0(jM374tryMaxHeightJN0ABg, companion.m3991getZeroYbymL2g())) {
                return jM374tryMaxHeightJN0ABg;
            }
            long jM376tryMaxWidthJN0ABg = m376tryMaxWidthJN0ABg(j10, false);
            if (!IntSize.m3984equalsimpl0(jM376tryMaxWidthJN0ABg, companion.m3991getZeroYbymL2g())) {
                return jM376tryMaxWidthJN0ABg;
            }
            long jM378tryMinHeightJN0ABg = m378tryMinHeightJN0ABg(j10, false);
            if (!IntSize.m3984equalsimpl0(jM378tryMinHeightJN0ABg, companion.m3991getZeroYbymL2g())) {
                return jM378tryMinHeightJN0ABg;
            }
            long jM380tryMinWidthJN0ABg = m380tryMinWidthJN0ABg(j10, false);
            if (!IntSize.m3984equalsimpl0(jM380tryMinWidthJN0ABg, companion.m3991getZeroYbymL2g())) {
                return jM380tryMinWidthJN0ABg;
            }
        } else {
            long jM377tryMaxWidthJN0ABg$default2 = m377tryMaxWidthJN0ABg$default(this, j10, false, 1, null);
            IntSize.Companion companion2 = IntSize.INSTANCE;
            if (!IntSize.m3984equalsimpl0(jM377tryMaxWidthJN0ABg$default2, companion2.m3991getZeroYbymL2g())) {
                return jM377tryMaxWidthJN0ABg$default2;
            }
            long jM375tryMaxHeightJN0ABg$default2 = m375tryMaxHeightJN0ABg$default(this, j10, false, 1, null);
            if (!IntSize.m3984equalsimpl0(jM375tryMaxHeightJN0ABg$default2, companion2.m3991getZeroYbymL2g())) {
                return jM375tryMaxHeightJN0ABg$default2;
            }
            long jM381tryMinWidthJN0ABg$default2 = m381tryMinWidthJN0ABg$default(this, j10, false, 1, null);
            if (!IntSize.m3984equalsimpl0(jM381tryMinWidthJN0ABg$default2, companion2.m3991getZeroYbymL2g())) {
                return jM381tryMinWidthJN0ABg$default2;
            }
            long jM379tryMinHeightJN0ABg$default2 = m379tryMinHeightJN0ABg$default(this, j10, false, 1, null);
            if (!IntSize.m3984equalsimpl0(jM379tryMinHeightJN0ABg$default2, companion2.m3991getZeroYbymL2g())) {
                return jM379tryMinHeightJN0ABg$default2;
            }
            long jM376tryMaxWidthJN0ABg2 = m376tryMaxWidthJN0ABg(j10, false);
            if (!IntSize.m3984equalsimpl0(jM376tryMaxWidthJN0ABg2, companion2.m3991getZeroYbymL2g())) {
                return jM376tryMaxWidthJN0ABg2;
            }
            long jM374tryMaxHeightJN0ABg2 = m374tryMaxHeightJN0ABg(j10, false);
            if (!IntSize.m3984equalsimpl0(jM374tryMaxHeightJN0ABg2, companion2.m3991getZeroYbymL2g())) {
                return jM374tryMaxHeightJN0ABg2;
            }
            long jM380tryMinWidthJN0ABg2 = m380tryMinWidthJN0ABg(j10, false);
            if (!IntSize.m3984equalsimpl0(jM380tryMinWidthJN0ABg2, companion2.m3991getZeroYbymL2g())) {
                return jM380tryMinWidthJN0ABg2;
            }
            long jM378tryMinHeightJN0ABg2 = m378tryMinHeightJN0ABg(j10, false);
            if (!IntSize.m3984equalsimpl0(jM378tryMinHeightJN0ABg2, companion2.m3991getZeroYbymL2g())) {
                return jM378tryMinHeightJN0ABg2;
            }
        }
        return IntSize.INSTANCE.m3991getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMaxHeight-JN-0ABg, reason: not valid java name */
    private final long m374tryMaxHeightJN0ABg(long j10, boolean z10) {
        int iD;
        int iM3781getMaxHeightimpl = Constraints.m3781getMaxHeightimpl(j10);
        if (iM3781getMaxHeightimpl != Integer.MAX_VALUE && (iD = c.d(iM3781getMaxHeightimpl * this.aspectRatio)) > 0) {
            long jIntSize = IntSizeKt.IntSize(iD, iM3781getMaxHeightimpl);
            if (!z10 || ConstraintsKt.m3797isSatisfiedBy4WqzIAM(j10, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m3991getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMaxHeight-JN-0ABg$default, reason: not valid java name */
    public static /* synthetic */ long m375tryMaxHeightJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return aspectRatioModifier.m374tryMaxHeightJN0ABg(j10, z10);
    }

    /* JADX INFO: renamed from: tryMaxWidth-JN-0ABg, reason: not valid java name */
    private final long m376tryMaxWidthJN0ABg(long j10, boolean z10) {
        int iD;
        int iM3782getMaxWidthimpl = Constraints.m3782getMaxWidthimpl(j10);
        if (iM3782getMaxWidthimpl != Integer.MAX_VALUE && (iD = c.d(iM3782getMaxWidthimpl / this.aspectRatio)) > 0) {
            long jIntSize = IntSizeKt.IntSize(iM3782getMaxWidthimpl, iD);
            if (!z10 || ConstraintsKt.m3797isSatisfiedBy4WqzIAM(j10, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m3991getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMaxWidth-JN-0ABg$default, reason: not valid java name */
    public static /* synthetic */ long m377tryMaxWidthJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return aspectRatioModifier.m376tryMaxWidthJN0ABg(j10, z10);
    }

    /* JADX INFO: renamed from: tryMinHeight-JN-0ABg, reason: not valid java name */
    private final long m378tryMinHeightJN0ABg(long j10, boolean z10) {
        int iM3783getMinHeightimpl = Constraints.m3783getMinHeightimpl(j10);
        int iD = c.d(iM3783getMinHeightimpl * this.aspectRatio);
        if (iD > 0) {
            long jIntSize = IntSizeKt.IntSize(iD, iM3783getMinHeightimpl);
            if (!z10 || ConstraintsKt.m3797isSatisfiedBy4WqzIAM(j10, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m3991getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMinHeight-JN-0ABg$default, reason: not valid java name */
    public static /* synthetic */ long m379tryMinHeightJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return aspectRatioModifier.m378tryMinHeightJN0ABg(j10, z10);
    }

    /* JADX INFO: renamed from: tryMinWidth-JN-0ABg, reason: not valid java name */
    private final long m380tryMinWidthJN0ABg(long j10, boolean z10) {
        int iM3784getMinWidthimpl = Constraints.m3784getMinWidthimpl(j10);
        int iD = c.d(iM3784getMinWidthimpl / this.aspectRatio);
        if (iD > 0) {
            long jIntSize = IntSizeKt.IntSize(iM3784getMinWidthimpl, iD);
            if (!z10 || ConstraintsKt.m3797isSatisfiedBy4WqzIAM(j10, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m3991getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMinWidth-JN-0ABg$default, reason: not valid java name */
    public static /* synthetic */ long m381tryMinWidthJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return aspectRatioModifier.m380tryMinWidthJN0ABg(j10, z10);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        AspectRatioModifier aspectRatioModifier = other instanceof AspectRatioModifier ? (AspectRatioModifier) other : null;
        if (aspectRatioModifier == null) {
            return false;
        }
        return ((this.aspectRatio > aspectRatioModifier.aspectRatio ? 1 : (this.aspectRatio == aspectRatioModifier.aspectRatio ? 0 : -1)) == 0) && this.matchHeightConstraintsFirst == ((AspectRatioModifier) other).matchHeightConstraintsFirst;
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    public int hashCode() {
        return (Float.hashCode(this.aspectRatio) * 31) + Boolean.hashCode(this.matchHeightConstraintsFirst);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i10) {
        p.k(intrinsicMeasureScope, "<this>");
        p.k(intrinsicMeasurable, "measurable");
        return i10 != Integer.MAX_VALUE ? c.d(i10 / this.aspectRatio) : intrinsicMeasurable.maxIntrinsicHeight(i10);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i10) {
        p.k(intrinsicMeasureScope, "<this>");
        p.k(intrinsicMeasurable, "measurable");
        return i10 != Integer.MAX_VALUE ? c.d(i10 * this.aspectRatio) : intrinsicMeasurable.maxIntrinsicWidth(i10);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo21measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j10) {
        p.k(measureScope, "$this$measure");
        p.k(measurable, "measurable");
        long jM373findSizeToXhtMw = m373findSizeToXhtMw(j10);
        if (!IntSize.m3984equalsimpl0(jM373findSizeToXhtMw, IntSize.INSTANCE.m3991getZeroYbymL2g())) {
            j10 = Constraints.INSTANCE.m3790fixedJhjzzOo(IntSize.m3986getWidthimpl(jM373findSizeToXhtMw), IntSize.m3985getHeightimpl(jM373findSizeToXhtMw));
        }
        final Placeable placeableMo3112measureBRTryo0 = measurable.mo3112measureBRTryo0(j10);
        return MeasureScope.layout$default(measureScope, placeableMo3112measureBRTryo0.getWidth(), placeableMo3112measureBRTryo0.getHeight(), null, new l<Placeable.PlacementScope, r>() { // from class: androidx.compose.foundation.layout.AspectRatioModifier$measure$1
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
        return i10 != Integer.MAX_VALUE ? c.d(i10 / this.aspectRatio) : intrinsicMeasurable.minIntrinsicHeight(i10);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i10) {
        p.k(intrinsicMeasureScope, "<this>");
        p.k(intrinsicMeasurable, "measurable");
        return i10 != Integer.MAX_VALUE ? c.d(i10 * this.aspectRatio) : intrinsicMeasurable.minIntrinsicWidth(i10);
    }

    @NotNull
    public String toString() {
        return "AspectRatioModifier(aspectRatio=" + this.aspectRatio + ')';
    }
}
