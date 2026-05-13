package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.FixedDpInsets, reason: from toString */
/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes3.dex */
@Immutable
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B*\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0006H\u0016R\u001d\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u001d\u0010\u0016\u001a\u00020\u00128\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u001d\u0010\u0017\u001a\u00020\u00128\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/layout/FixedDpInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "getLeft", "getTop", "getRight", "getBottom", "", "toString", "", "other", "", "equals", "hashCode", "Landroidx/compose/ui/unit/Dp;", "leftDp", "F", "topDp", "rightDp", "bottomDp", "<init>", "(FFFFLtn/i;)V", "foundation-layout_release"}, k = 1, mv = {1, 6, 0})
final class Insets implements WindowInsets {

    /* JADX INFO: renamed from: bottomDp, reason: from kotlin metadata and from toString */
    private final float bottom;

    /* JADX INFO: renamed from: leftDp, reason: from kotlin metadata and from toString */
    private final float left;

    /* JADX INFO: renamed from: rightDp, reason: from kotlin metadata and from toString */
    private final float right;

    /* JADX INFO: renamed from: topDp, reason: from kotlin metadata and from toString */
    private final float top;

    private Insets(float f10, float f11, float f12, float f13) {
        this.left = f10;
        this.top = f11;
        this.right = f12;
        this.bottom = f13;
    }

    public /* synthetic */ Insets(float f10, float f11, float f12, float f13, i iVar) {
        this(f10, f11, f12, f13);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Insets)) {
            return false;
        }
        Insets insets = (Insets) other;
        return Dp.m3831equalsimpl0(this.left, insets.left) && Dp.m3831equalsimpl0(this.top, insets.top) && Dp.m3831equalsimpl0(this.right, insets.right) && Dp.m3831equalsimpl0(this.bottom, insets.bottom);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(@NotNull Density density) {
        p.k(density, "density");
        return density.mo300roundToPx0680j_4(this.bottom);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        p.k(density, "density");
        p.k(layoutDirection, "layoutDirection");
        return density.mo300roundToPx0680j_4(this.left);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        p.k(density, "density");
        p.k(layoutDirection, "layoutDirection");
        return density.mo300roundToPx0680j_4(this.right);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(@NotNull Density density) {
        p.k(density, "density");
        return density.mo300roundToPx0680j_4(this.top);
    }

    public int hashCode() {
        return (((((Dp.m3832hashCodeimpl(this.left) * 31) + Dp.m3832hashCodeimpl(this.top)) * 31) + Dp.m3832hashCodeimpl(this.right)) * 31) + Dp.m3832hashCodeimpl(this.bottom);
    }

    @NotNull
    public String toString() {
        return "Insets(left=" + ((Object) Dp.m3837toStringimpl(this.left)) + ", top=" + ((Object) Dp.m3837toStringimpl(this.top)) + ", right=" + ((Object) Dp.m3837toStringimpl(this.right)) + ", bottom=" + ((Object) Dp.m3837toStringimpl(this.bottom)) + ')';
    }
}
