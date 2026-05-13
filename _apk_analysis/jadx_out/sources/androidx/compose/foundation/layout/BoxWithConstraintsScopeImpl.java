package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: BoxWithConstraints.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001a\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b(\u0010)J\t\u0010\u0004\u001a\u00020\u0003HÂ\u0003J\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0097\u0001J\r\u0010\t\u001a\u00020\u0005*\u00020\u0005H\u0097\u0001J\u0019\u0010\r\u001a\u00020\nHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\nHÆ\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003R\u0014\u0010\u000e\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR#\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001d\u0010!\u001a\u00020\u001e8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001d\u0010#\u001a\u00020\u001e8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u001d\u0010%\u001a\u00020\u001e8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b$\u0010 R\u001d\u0010'\u001a\u00020\u001e8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b&\u0010 \u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Landroidx/compose/foundation/layout/BoxWithConstraintsScopeImpl;", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/ui/unit/Density;", "component1", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Alignment;", "alignment", "align", "matchParentSize", "Landroidx/compose/ui/unit/Constraints;", "component2-msEJaDk", "()J", "component2", "density", "constraints", "copy-0kLqBqw", "(Landroidx/compose/ui/unit/Density;J)Landroidx/compose/foundation/layout/BoxWithConstraintsScopeImpl;", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "Landroidx/compose/ui/unit/Density;", "J", "getConstraints-msEJaDk", "Landroidx/compose/ui/unit/Dp;", "getMinWidth-D9Ej5fM", "()F", "minWidth", "getMaxWidth-D9Ej5fM", "maxWidth", "getMinHeight-D9Ej5fM", "minHeight", "getMaxHeight-D9Ej5fM", "maxHeight", "<init>", "(Landroidx/compose/ui/unit/Density;JLtn/i;)V", "foundation-layout_release"}, k = 1, mv = {1, 6, 0})
final /* data */ class BoxWithConstraintsScopeImpl implements BoxWithConstraintsScope, BoxScope {
    private final /* synthetic */ BoxScopeInstance $$delegate_0;
    private final long constraints;

    @NotNull
    private final Density density;

    private BoxWithConstraintsScopeImpl(Density density, long j10) {
        this.density = density;
        this.constraints = j10;
        this.$$delegate_0 = BoxScopeInstance.INSTANCE;
    }

    public /* synthetic */ BoxWithConstraintsScopeImpl(Density density, long j10, i iVar) {
        this(density, j10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final Density getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: copy-0kLqBqw$default, reason: not valid java name */
    public static /* synthetic */ BoxWithConstraintsScopeImpl m388copy0kLqBqw$default(BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl, Density density, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            density = boxWithConstraintsScopeImpl.density;
        }
        if ((i10 & 2) != 0) {
            j10 = boxWithConstraintsScopeImpl.getConstraints();
        }
        return boxWithConstraintsScopeImpl.m390copy0kLqBqw(density, j10);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    @Stable
    @NotNull
    public Modifier align(@NotNull Modifier modifier, @NotNull Alignment alignment) {
        p.k(modifier, "<this>");
        p.k(alignment, "alignment");
        return this.$$delegate_0.align(modifier, alignment);
    }

    /* JADX INFO: renamed from: component2-msEJaDk, reason: not valid java name */
    public final long m389component2msEJaDk() {
        return getConstraints();
    }

    @NotNull
    /* JADX INFO: renamed from: copy-0kLqBqw, reason: not valid java name */
    public final BoxWithConstraintsScopeImpl m390copy0kLqBqw(@NotNull Density density, long constraints) {
        p.k(density, "density");
        return new BoxWithConstraintsScopeImpl(density, constraints, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoxWithConstraintsScopeImpl)) {
            return false;
        }
        BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) other;
        return p.f(this.density, boxWithConstraintsScopeImpl.density) && Constraints.m3775equalsimpl0(getConstraints(), boxWithConstraintsScopeImpl.getConstraints());
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* JADX INFO: renamed from: getConstraints-msEJaDk, reason: from getter */
    public long getConstraints() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* JADX INFO: renamed from: getMaxHeight-D9Ej5fM */
    public float mo384getMaxHeightD9Ej5fM() {
        return Constraints.m3777getHasBoundedHeightimpl(getConstraints()) ? this.density.mo303toDpu2uoSUM(Constraints.m3781getMaxHeightimpl(getConstraints())) : Dp.INSTANCE.m3845getInfinityD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* JADX INFO: renamed from: getMaxWidth-D9Ej5fM */
    public float mo385getMaxWidthD9Ej5fM() {
        return Constraints.m3778getHasBoundedWidthimpl(getConstraints()) ? this.density.mo303toDpu2uoSUM(Constraints.m3782getMaxWidthimpl(getConstraints())) : Dp.INSTANCE.m3845getInfinityD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM */
    public float mo386getMinHeightD9Ej5fM() {
        return this.density.mo303toDpu2uoSUM(Constraints.m3783getMinHeightimpl(getConstraints()));
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM */
    public float mo387getMinWidthD9Ej5fM() {
        return this.density.mo303toDpu2uoSUM(Constraints.m3784getMinWidthimpl(getConstraints()));
    }

    public int hashCode() {
        return (this.density.hashCode() * 31) + Constraints.m3785hashCodeimpl(getConstraints());
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    @Stable
    @NotNull
    public Modifier matchParentSize(@NotNull Modifier modifier) {
        p.k(modifier, "<this>");
        return this.$$delegate_0.matchParentSize(modifier);
    }

    @NotNull
    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.density + ", constraints=" + ((Object) Constraints.m3787toStringimpl(getConstraints())) + ')';
    }
}
