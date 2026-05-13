package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
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
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.p;
import vn.c;

/* JADX INFO: compiled from: PainterModifier.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BU\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u00101\u001a\u00020\r\u0012\b\b\u0002\u00106\u001a\u000205\u0012\b\b\u0002\u0010;\u001a\u00020:\u0012\b\b\u0002\u0010@\u001a\u00020?\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010D\u0012\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020$0K¢\u0006\u0004\bN\u0010OJ\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\u0007J\u0019\u0010\u0010\u001a\u00020\r*\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\r*\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u000fJ)\u0010\u0019\u001a\u00020\u0016*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u001e\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u001c\u0010\u001f\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u001c\u0010!\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001cH\u0016J\u001c\u0010\"\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001cH\u0016J\f\u0010%\u001a\u00020$*\u00020#H\u0016J\b\u0010&\u001a\u00020\u001cH\u0016J\u0013\u0010)\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u0010+\u001a\u00020*H\u0016R\u0017\u0010-\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00101\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u00106\u001a\u0002058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010;\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010@\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010E\u001a\u0004\u0018\u00010D8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u00104\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006P"}, d2 = {"Landroidx/compose/ui/draw/PainterModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/geometry/Size;", "dstSize", "calculateScaledSize-E7KxVPU", "(J)J", "calculateScaledSize", "Landroidx/compose/ui/unit/Constraints;", "constraints", "modifyConstraints-ZezNO4M", "modifyConstraints", "", "hasSpecifiedAndFiniteWidth-uvyYCjk", "(J)Z", "hasSpecifiedAndFiniteWidth", "hasSpecifiedAndFiniteHeight-uvyYCjk", "hasSpecifiedAndFiniteHeight", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Lbn/r;", "draw", "hashCode", "", "other", "equals", "", "toString", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "sizeToIntrinsics", "Z", "getSizeToIntrinsics", "()Z", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "", "alpha", "F", "getAlpha", "()F", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "getUseIntrinsicSize", "useIntrinsicSize", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectorInfo", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Lsn/l;)V", "ui_release"}, k = 1, mv = {1, 6, 0})
final class PainterModifier extends InspectorValueInfo implements LayoutModifier, DrawModifier {

    @NotNull
    private final Alignment alignment;
    private final float alpha;

    @Nullable
    private final ColorFilter colorFilter;

    @NotNull
    private final ContentScale contentScale;

    @NotNull
    private final Painter painter;
    private final boolean sizeToIntrinsics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PainterModifier(@NotNull Painter painter, boolean z10, @NotNull Alignment alignment, @NotNull ContentScale contentScale, float f10, @Nullable ColorFilter colorFilter, @NotNull l<? super InspectorInfo, r> lVar) {
        super(lVar);
        p.k(painter, "painter");
        p.k(alignment, "alignment");
        p.k(contentScale, "contentScale");
        p.k(lVar, "inspectorInfo");
        this.painter = painter;
        this.sizeToIntrinsics = z10;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f10;
        this.colorFilter = colorFilter;
    }

    public /* synthetic */ PainterModifier(Painter painter, boolean z10, Alignment alignment, ContentScale contentScale, float f10, ColorFilter colorFilter, l lVar, int i10, i iVar) {
        this(painter, z10, (i10 & 4) != 0 ? Alignment.INSTANCE.getCenter() : alignment, (i10 & 8) != 0 ? ContentScale.INSTANCE.getInside() : contentScale, (i10 & 16) != 0 ? 1.0f : f10, (i10 & 32) != 0 ? null : colorFilter, lVar);
    }

    /* JADX INFO: renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    private final long m1307calculateScaledSizeE7KxVPU(long dstSize) {
        if (!getUseIntrinsicSize()) {
            return dstSize;
        }
        long jSize = SizeKt.Size(!m1309hasSpecifiedAndFiniteWidthuvyYCjk(this.painter.getIntrinsicSize()) ? Size.m1452getWidthimpl(dstSize) : Size.m1452getWidthimpl(this.painter.getIntrinsicSize()), !m1308hasSpecifiedAndFiniteHeightuvyYCjk(this.painter.getIntrinsicSize()) ? Size.m1449getHeightimpl(dstSize) : Size.m1449getHeightimpl(this.painter.getIntrinsicSize()));
        if (!(Size.m1452getWidthimpl(dstSize) == 0.0f)) {
            if (!(Size.m1449getHeightimpl(dstSize) == 0.0f)) {
                return ScaleFactorKt.m3188timesUQTWf7w(jSize, this.contentScale.mo3103computeScaleFactorH7hwNQA(jSize, dstSize));
            }
        }
        return Size.INSTANCE.m1461getZeroNHjbRc();
    }

    private final boolean getUseIntrinsicSize() {
        if (this.sizeToIntrinsics) {
            if (this.painter.getIntrinsicSize() != Size.INSTANCE.m1460getUnspecifiedNHjbRc()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: hasSpecifiedAndFiniteHeight-uvyYCjk, reason: not valid java name */
    private final boolean m1308hasSpecifiedAndFiniteHeightuvyYCjk(long j10) {
        if (!Size.m1448equalsimpl0(j10, Size.INSTANCE.m1460getUnspecifiedNHjbRc())) {
            float fM1449getHeightimpl = Size.m1449getHeightimpl(j10);
            if ((Float.isInfinite(fM1449getHeightimpl) || Float.isNaN(fM1449getHeightimpl)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: hasSpecifiedAndFiniteWidth-uvyYCjk, reason: not valid java name */
    private final boolean m1309hasSpecifiedAndFiniteWidthuvyYCjk(long j10) {
        if (!Size.m1448equalsimpl0(j10, Size.INSTANCE.m1460getUnspecifiedNHjbRc())) {
            float fM1452getWidthimpl = Size.m1452getWidthimpl(j10);
            if ((Float.isInfinite(fM1452getWidthimpl) || Float.isNaN(fM1452getWidthimpl)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    private final long m1310modifyConstraintsZezNO4M(long constraints) {
        boolean z10 = Constraints.m3778getHasBoundedWidthimpl(constraints) && Constraints.m3777getHasBoundedHeightimpl(constraints);
        boolean z11 = Constraints.m3780getHasFixedWidthimpl(constraints) && Constraints.m3779getHasFixedHeightimpl(constraints);
        if ((!getUseIntrinsicSize() && z10) || z11) {
            return Constraints.m3773copyZbe2FdA$default(constraints, Constraints.m3782getMaxWidthimpl(constraints), 0, Constraints.m3781getMaxHeightimpl(constraints), 0, 10, null);
        }
        long intrinsicSize = this.painter.getIntrinsicSize();
        long jM1307calculateScaledSizeE7KxVPU = m1307calculateScaledSizeE7KxVPU(SizeKt.Size(ConstraintsKt.m3796constrainWidthK40F9xA(constraints, m1309hasSpecifiedAndFiniteWidthuvyYCjk(intrinsicSize) ? c.d(Size.m1452getWidthimpl(intrinsicSize)) : Constraints.m3784getMinWidthimpl(constraints)), ConstraintsKt.m3795constrainHeightK40F9xA(constraints, m1308hasSpecifiedAndFiniteHeightuvyYCjk(intrinsicSize) ? c.d(Size.m1449getHeightimpl(intrinsicSize)) : Constraints.m3783getMinHeightimpl(constraints))));
        return Constraints.m3773copyZbe2FdA$default(constraints, ConstraintsKt.m3796constrainWidthK40F9xA(constraints, c.d(Size.m1452getWidthimpl(jM1307calculateScaledSizeE7KxVPU))), 0, ConstraintsKt.m3795constrainHeightK40F9xA(constraints, c.d(Size.m1449getHeightimpl(jM1307calculateScaledSizeE7KxVPU))), 0, 10, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    @Override // androidx.compose.ui.draw.DrawModifier
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(@org.jetbrains.annotations.NotNull androidx.compose.ui.graphics.drawscope.ContentDrawScope r13) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.draw.PainterModifier.draw(androidx.compose.ui.graphics.drawscope.ContentDrawScope):void");
    }

    public boolean equals(@Nullable Object other) {
        PainterModifier painterModifier = other instanceof PainterModifier ? (PainterModifier) other : null;
        if (painterModifier != null && p.f(this.painter, painterModifier.painter) && this.sizeToIntrinsics == painterModifier.sizeToIntrinsics && p.f(this.alignment, painterModifier.alignment) && p.f(this.contentScale, painterModifier.contentScale)) {
            return ((this.alpha > painterModifier.alpha ? 1 : (this.alpha == painterModifier.alpha ? 0 : -1)) == 0) && p.f(this.colorFilter, painterModifier.colorFilter);
        }
        return false;
    }

    @NotNull
    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    @Nullable
    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    @NotNull
    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    @NotNull
    public final Painter getPainter() {
        return this.painter;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.painter.hashCode() * 31) + Boolean.hashCode(this.sizeToIntrinsics)) * 31) + this.alignment.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + Float.hashCode(this.alpha)) * 31;
        ColorFilter colorFilter = this.colorFilter;
        return iHashCode + (colorFilter != null ? colorFilter.hashCode() : 0);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i10) {
        p.k(intrinsicMeasureScope, "<this>");
        p.k(intrinsicMeasurable, "measurable");
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.maxIntrinsicHeight(i10);
        }
        long jM1310modifyConstraintsZezNO4M = m1310modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i10, 0, 0, 13, null));
        return Math.max(Constraints.m3783getMinHeightimpl(jM1310modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicHeight(i10));
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i10) {
        p.k(intrinsicMeasureScope, "<this>");
        p.k(intrinsicMeasurable, "measurable");
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.maxIntrinsicWidth(i10);
        }
        long jM1310modifyConstraintsZezNO4M = m1310modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i10, 7, null));
        return Math.max(Constraints.m3784getMinWidthimpl(jM1310modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicWidth(i10));
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo21measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j10) {
        p.k(measureScope, "$this$measure");
        p.k(measurable, "measurable");
        final Placeable placeableMo3112measureBRTryo0 = measurable.mo3112measureBRTryo0(m1310modifyConstraintsZezNO4M(j10));
        return MeasureScope.layout$default(measureScope, placeableMo3112measureBRTryo0.getWidth(), placeableMo3112measureBRTryo0.getHeight(), null, new l<Placeable.PlacementScope, r>() { // from class: androidx.compose.ui.draw.PainterModifier$measure$1
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
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.minIntrinsicHeight(i10);
        }
        long jM1310modifyConstraintsZezNO4M = m1310modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i10, 0, 0, 13, null));
        return Math.max(Constraints.m3783getMinHeightimpl(jM1310modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicHeight(i10));
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i10) {
        p.k(intrinsicMeasureScope, "<this>");
        p.k(intrinsicMeasurable, "measurable");
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.minIntrinsicWidth(i10);
        }
        long jM1310modifyConstraintsZezNO4M = m1310modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i10, 7, null));
        return Math.max(Constraints.m3784getMinWidthimpl(jM1310modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicWidth(i10));
    }

    @NotNull
    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }
}
