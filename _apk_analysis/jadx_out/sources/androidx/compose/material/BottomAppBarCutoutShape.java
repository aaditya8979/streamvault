package androidx.compose.material;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0001\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b*\u0010+J\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J4\u0010\u000f\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0002J-\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0016\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0017HÆ\u0003J\u001d\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u001a\u001a\u00020\u0017HÆ\u0001J\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001f\u001a\u00020\u001eHÖ\u0001J\u0013\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003R\u0017\u0010\u0019\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0019\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u001a\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u001a\u0010'\u001a\u0004\b(\u0010)\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"Landroidx/compose/material/BottomAppBarCutoutShape;", "Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "Lbn/r;", "addCutoutShape", "", "cutoutStartPosition", "cutoutEndPosition", "cutoutRadius", "roundedEdgeRadius", "verticalOffset", "addRoundedEdges", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/graphics/Outline;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "createOutline", "component1", "Landroidx/compose/material/FabPlacement;", "component2", "cutoutShape", "fabPlacement", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "Landroidx/compose/ui/graphics/Shape;", "getCutoutShape", "()Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/material/FabPlacement;", "getFabPlacement", "()Landroidx/compose/material/FabPlacement;", "<init>", "(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/FabPlacement;)V", "material_release"}, k = 1, mv = {1, 6, 0})
final /* data */ class BottomAppBarCutoutShape implements Shape {

    @NotNull
    private final Shape cutoutShape;

    @NotNull
    private final FabPlacement fabPlacement;

    public BottomAppBarCutoutShape(@NotNull Shape shape, @NotNull FabPlacement fabPlacement) {
        p.k(shape, "cutoutShape");
        p.k(fabPlacement, "fabPlacement");
        this.cutoutShape = shape;
        this.fabPlacement = fabPlacement;
    }

    private final void addCutoutShape(Path path, LayoutDirection layoutDirection, Density density) {
        float fMo306toPx0680j_4 = density.mo306toPx0680j_4(AppBarKt.BottomAppBarCutoutOffset);
        float f10 = 2 * fMo306toPx0680j_4;
        long jSize = SizeKt.Size(this.fabPlacement.getWidth() + f10, this.fabPlacement.getHeight() + f10);
        float left = this.fabPlacement.getLeft() - fMo306toPx0680j_4;
        float fM1452getWidthimpl = left + Size.m1452getWidthimpl(jSize);
        float fM1449getHeightimpl = Size.m1449getHeightimpl(jSize) / 2.0f;
        OutlineKt.addOutline(path, this.cutoutShape.mo199createOutlinePq9zytI(jSize, layoutDirection, density));
        path.mo1518translatek4lQ0M(OffsetKt.Offset(left, -fM1449getHeightimpl));
        if (p.f(this.cutoutShape, RoundedCornerShapeKt.getCircleShape())) {
            addRoundedEdges(path, left, fM1452getWidthimpl, fM1449getHeightimpl, density.mo306toPx0680j_4(AppBarKt.BottomAppBarRoundedEdgeRadius), 0.0f);
        }
    }

    private final void addRoundedEdges(Path path, float f10, float f11, float f12, float f13, float f14) {
        float f15 = -((float) Math.sqrt((f12 * f12) - (f14 * f14)));
        float f16 = f12 + f15;
        float f17 = f10 + f16;
        float f18 = f11 - f16;
        Pair<Float, Float> pairCalculateRoundedEdgeIntercept = AppBarKt.calculateRoundedEdgeIntercept(f15 - 1.0f, f14, f12);
        float fFloatValue = pairCalculateRoundedEdgeIntercept.component1().floatValue() + f12;
        float fFloatValue2 = pairCalculateRoundedEdgeIntercept.component2().floatValue() - f14;
        path.moveTo(f17 - f13, 0.0f);
        path.quadraticBezierTo(f17 - 1.0f, 0.0f, f10 + fFloatValue, fFloatValue2);
        path.lineTo(f11 - fFloatValue, fFloatValue2);
        path.quadraticBezierTo(f18 + 1.0f, 0.0f, f13 + f18, 0.0f);
        path.close();
    }

    public static /* synthetic */ BottomAppBarCutoutShape copy$default(BottomAppBarCutoutShape bottomAppBarCutoutShape, Shape shape, FabPlacement fabPlacement, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            shape = bottomAppBarCutoutShape.cutoutShape;
        }
        if ((i10 & 2) != 0) {
            fabPlacement = bottomAppBarCutoutShape.fabPlacement;
        }
        return bottomAppBarCutoutShape.copy(shape, fabPlacement);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Shape getCutoutShape() {
        return this.cutoutShape;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FabPlacement getFabPlacement() {
        return this.fabPlacement;
    }

    @NotNull
    public final BottomAppBarCutoutShape copy(@NotNull Shape cutoutShape, @NotNull FabPlacement fabPlacement) {
        p.k(cutoutShape, "cutoutShape");
        p.k(fabPlacement, "fabPlacement");
        return new BottomAppBarCutoutShape(cutoutShape, fabPlacement);
    }

    @Override // androidx.compose.ui.graphics.Shape
    @NotNull
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public Outline mo199createOutlinePq9zytI(long size, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
        p.k(layoutDirection, "layoutDirection");
        p.k(density, "density");
        Path Path = AndroidPath_androidKt.Path();
        Path.addRect(new Rect(0.0f, 0.0f, Size.m1452getWidthimpl(size), Size.m1449getHeightimpl(size)));
        Path Path2 = AndroidPath_androidKt.Path();
        addCutoutShape(Path2, layoutDirection, density);
        Path2.mo1516opN5in7k0(Path, Path2, PathOperation.INSTANCE.m1871getDifferenceb3I0S0c());
        return new Outline.Generic(Path2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomAppBarCutoutShape)) {
            return false;
        }
        BottomAppBarCutoutShape bottomAppBarCutoutShape = (BottomAppBarCutoutShape) other;
        return p.f(this.cutoutShape, bottomAppBarCutoutShape.cutoutShape) && p.f(this.fabPlacement, bottomAppBarCutoutShape.fabPlacement);
    }

    @NotNull
    public final Shape getCutoutShape() {
        return this.cutoutShape;
    }

    @NotNull
    public final FabPlacement getFabPlacement() {
        return this.fabPlacement;
    }

    public int hashCode() {
        return (this.cutoutShape.hashCode() * 31) + this.fabPlacement.hashCode();
    }

    @NotNull
    public String toString() {
        return "BottomAppBarCutoutShape(cutoutShape=" + this.cutoutShape + ", fabPlacement=" + this.fabPlacement + ')';
    }
}
