package coil.compose;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import bn.r;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;
import z.c;

/* JADX INFO: compiled from: ContentPainterModifier.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B1\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00106\u001a\u000203\u0012\b\u0010:\u001a\u0004\u0018\u000107¢\u0006\u0004\b;\u0010<J)\u0010\f\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0011\u001a\u00020\u000f*\u00020\r2\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u001c\u0010\u0012\u001a\u00020\u000f*\u00020\r2\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u001c\u0010\u0014\u001a\u00020\u000f*\u00020\r2\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u001c\u0010\u0015\u001a\u00020\u000f*\u00020\r2\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\f\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0016J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001b\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\u001d\u0010$\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u001d\u0010&\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010#R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0004\u0018\u0001078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006="}, d2 = {"Lcoil/compose/ContentPainterModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Lbn/r;", "draw", "", "toString", "hashCode", "", "other", "", "equals", "Landroidx/compose/ui/geometry/Size;", "dstSize", "calculateScaledSize-E7KxVPU", "(J)J", "calculateScaledSize", "modifyConstraints-ZezNO4M", "modifyConstraints", "Landroidx/compose/ui/graphics/painter/Painter;", "b", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "Landroidx/compose/ui/Alignment;", "c", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "d", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "e", "F", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", InneractiveMediationDefs.GENDER_FEMALE, "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)V", "coil-compose-base_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class ContentPainterModifier extends InspectorValueInfo implements LayoutModifier, DrawModifier {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Painter painter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Alignment alignment;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final ContentScale contentScale;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final float alpha;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final ColorFilter colorFilter;

    public ContentPainterModifier(@NotNull final Painter painter, @NotNull final Alignment alignment, @NotNull final ContentScale contentScale, final float f10, @Nullable final ColorFilter colorFilter) {
        super(InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, r>() { // from class: coil.compose.ContentPainterModifier$special$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                p.k(inspectorInfo, "$this$null");
                inspectorInfo.setName("content");
                inspectorInfo.getProperties().set("painter", painter);
                inspectorInfo.getProperties().set("alignment", alignment);
                inspectorInfo.getProperties().set("contentScale", contentScale);
                inspectorInfo.getProperties().set("alpha", Float.valueOf(f10));
                inspectorInfo.getProperties().set("colorFilter", colorFilter);
            }
        } : InspectableValueKt.getNoInspectorInfo());
        this.painter = painter;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f10;
        this.colorFilter = colorFilter;
    }

    /* JADX INFO: renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    public final long m4121calculateScaledSizeE7KxVPU(long dstSize) {
        if (Size.m1454isEmptyimpl(dstSize)) {
            return Size.INSTANCE.m1461getZeroNHjbRc();
        }
        long intrinsicSize = this.painter.getIntrinsicSize();
        if (intrinsicSize == Size.INSTANCE.m1460getUnspecifiedNHjbRc()) {
            return dstSize;
        }
        float fM1452getWidthimpl = Size.m1452getWidthimpl(intrinsicSize);
        if (!((Float.isInfinite(fM1452getWidthimpl) || Float.isNaN(fM1452getWidthimpl)) ? false : true)) {
            fM1452getWidthimpl = Size.m1452getWidthimpl(dstSize);
        }
        float fM1449getHeightimpl = Size.m1449getHeightimpl(intrinsicSize);
        if (!((Float.isInfinite(fM1449getHeightimpl) || Float.isNaN(fM1449getHeightimpl)) ? false : true)) {
            fM1449getHeightimpl = Size.m1449getHeightimpl(dstSize);
        }
        long jSize = SizeKt.Size(fM1452getWidthimpl, fM1449getHeightimpl);
        return ScaleFactorKt.m3188timesUQTWf7w(jSize, this.contentScale.mo3103computeScaleFactorH7hwNQA(jSize, dstSize));
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public void draw(@NotNull ContentDrawScope contentDrawScope) {
        long jM4121calculateScaledSizeE7KxVPU = m4121calculateScaledSizeE7KxVPU(contentDrawScope.mo2113getSizeNHjbRc());
        long jMo1291alignKFBX0sM = this.alignment.mo1291alignKFBX0sM(c.e(jM4121calculateScaledSizeE7KxVPU), c.e(contentDrawScope.mo2113getSizeNHjbRc()), contentDrawScope.getLayoutDirection());
        float fM3936component1impl = IntOffset.m3936component1impl(jMo1291alignKFBX0sM);
        float fM3937component2impl = IntOffset.m3937component2impl(jMo1291alignKFBX0sM);
        contentDrawScope.getDrawContext().getTransform().translate(fM3936component1impl, fM3937component2impl);
        this.painter.m2188drawx_KDEd0(contentDrawScope, jM4121calculateScaledSizeE7KxVPU, this.alpha, this.colorFilter);
        contentDrawScope.getDrawContext().getTransform().translate(-fM3936component1impl, -fM3937component2impl);
        contentDrawScope.drawContent();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentPainterModifier)) {
            return false;
        }
        ContentPainterModifier contentPainterModifier = (ContentPainterModifier) other;
        return p.f(this.painter, contentPainterModifier.painter) && p.f(this.alignment, contentPainterModifier.alignment) && p.f(this.contentScale, contentPainterModifier.contentScale) && p.f(Float.valueOf(this.alpha), Float.valueOf(contentPainterModifier.alpha)) && p.f(this.colorFilter, contentPainterModifier.colorFilter);
    }

    public int hashCode() {
        int iHashCode = ((((((this.painter.hashCode() * 31) + this.alignment.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + Float.hashCode(this.alpha)) * 31;
        ColorFilter colorFilter = this.colorFilter;
        return iHashCode + (colorFilter == null ? 0 : colorFilter.hashCode());
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i10) {
        if (!(this.painter.getIntrinsicSize() != Size.INSTANCE.m1460getUnspecifiedNHjbRc())) {
            return intrinsicMeasurable.maxIntrinsicHeight(i10);
        }
        int iMaxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(Constraints.m3782getMaxWidthimpl(m4122modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i10, 0, 0, 13, null))));
        return Math.max(vn.c.d(Size.m1449getHeightimpl(m4121calculateScaledSizeE7KxVPU(SizeKt.Size(i10, iMaxIntrinsicHeight)))), iMaxIntrinsicHeight);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i10) {
        if (!(this.painter.getIntrinsicSize() != Size.INSTANCE.m1460getUnspecifiedNHjbRc())) {
            return intrinsicMeasurable.maxIntrinsicWidth(i10);
        }
        int iMaxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(Constraints.m3781getMaxHeightimpl(m4122modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i10, 7, null))));
        return Math.max(vn.c.d(Size.m1452getWidthimpl(m4121calculateScaledSizeE7KxVPU(SizeKt.Size(iMaxIntrinsicWidth, i10)))), iMaxIntrinsicWidth);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo21measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j10) {
        final Placeable placeableMo3112measureBRTryo0 = measurable.mo3112measureBRTryo0(m4122modifyConstraintsZezNO4M(j10));
        return MeasureScope.layout$default(measureScope, placeableMo3112measureBRTryo0.getWidth(), placeableMo3112measureBRTryo0.getHeight(), null, new l<Placeable.PlacementScope, r>() { // from class: coil.compose.ContentPainterModifier$measure$1
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
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo3112measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i10) {
        if (!(this.painter.getIntrinsicSize() != Size.INSTANCE.m1460getUnspecifiedNHjbRc())) {
            return intrinsicMeasurable.minIntrinsicHeight(i10);
        }
        int iMinIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(Constraints.m3782getMaxWidthimpl(m4122modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i10, 0, 0, 13, null))));
        return Math.max(vn.c.d(Size.m1449getHeightimpl(m4121calculateScaledSizeE7KxVPU(SizeKt.Size(i10, iMinIntrinsicHeight)))), iMinIntrinsicHeight);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i10) {
        if (!(this.painter.getIntrinsicSize() != Size.INSTANCE.m1460getUnspecifiedNHjbRc())) {
            return intrinsicMeasurable.minIntrinsicWidth(i10);
        }
        int iMinIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(Constraints.m3781getMaxHeightimpl(m4122modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i10, 7, null))));
        return Math.max(vn.c.d(Size.m1452getWidthimpl(m4121calculateScaledSizeE7KxVPU(SizeKt.Size(iMinIntrinsicWidth, i10)))), iMinIntrinsicWidth);
    }

    /* JADX INFO: renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    public final long m4122modifyConstraintsZezNO4M(long constraints) {
        float fB;
        int iM3783getMinHeightimpl;
        float fA;
        boolean zM3780getHasFixedWidthimpl = Constraints.m3780getHasFixedWidthimpl(constraints);
        boolean zM3779getHasFixedHeightimpl = Constraints.m3779getHasFixedHeightimpl(constraints);
        if (zM3780getHasFixedWidthimpl && zM3779getHasFixedHeightimpl) {
            return constraints;
        }
        boolean z10 = Constraints.m3778getHasBoundedWidthimpl(constraints) && Constraints.m3777getHasBoundedHeightimpl(constraints);
        long intrinsicSize = this.painter.getIntrinsicSize();
        if (intrinsicSize == Size.INSTANCE.m1460getUnspecifiedNHjbRc()) {
            return z10 ? Constraints.m3773copyZbe2FdA$default(constraints, Constraints.m3782getMaxWidthimpl(constraints), 0, Constraints.m3781getMaxHeightimpl(constraints), 0, 10, null) : constraints;
        }
        if (z10 && (zM3780getHasFixedWidthimpl || zM3779getHasFixedHeightimpl)) {
            fB = Constraints.m3782getMaxWidthimpl(constraints);
            iM3783getMinHeightimpl = Constraints.m3781getMaxHeightimpl(constraints);
        } else {
            float fM1452getWidthimpl = Size.m1452getWidthimpl(intrinsicSize);
            float fM1449getHeightimpl = Size.m1449getHeightimpl(intrinsicSize);
            fB = !Float.isInfinite(fM1452getWidthimpl) && !Float.isNaN(fM1452getWidthimpl) ? c.b(constraints, fM1452getWidthimpl) : Constraints.m3784getMinWidthimpl(constraints);
            if ((Float.isInfinite(fM1449getHeightimpl) || Float.isNaN(fM1449getHeightimpl)) ? false : true) {
                fA = c.a(constraints, fM1449getHeightimpl);
                long jM4121calculateScaledSizeE7KxVPU = m4121calculateScaledSizeE7KxVPU(SizeKt.Size(fB, fA));
                return Constraints.m3773copyZbe2FdA$default(constraints, ConstraintsKt.m3796constrainWidthK40F9xA(constraints, vn.c.d(Size.m1452getWidthimpl(jM4121calculateScaledSizeE7KxVPU))), 0, ConstraintsKt.m3795constrainHeightK40F9xA(constraints, vn.c.d(Size.m1449getHeightimpl(jM4121calculateScaledSizeE7KxVPU))), 0, 10, null);
            }
            iM3783getMinHeightimpl = Constraints.m3783getMinHeightimpl(constraints);
        }
        fA = iM3783getMinHeightimpl;
        long jM4121calculateScaledSizeE7KxVPU2 = m4121calculateScaledSizeE7KxVPU(SizeKt.Size(fB, fA));
        return Constraints.m3773copyZbe2FdA$default(constraints, ConstraintsKt.m3796constrainWidthK40F9xA(constraints, vn.c.d(Size.m1452getWidthimpl(jM4121calculateScaledSizeE7KxVPU2))), 0, ConstraintsKt.m3795constrainHeightK40F9xA(constraints, vn.c.d(Size.m1449getHeightimpl(jM4121calculateScaledSizeE7KxVPU2))), 0, 10, null);
    }

    @NotNull
    public String toString() {
        return "ContentPainterModifier(painter=" + this.painter + ", alignment=" + this.alignment + ", contentScale=" + this.contentScale + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }
}
