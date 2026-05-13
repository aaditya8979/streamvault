package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes6.dex */
@Immutable
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001B@\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0018\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003ø\u0001\u0000J\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003ø\u0001\u0000J\t\u0010\n\u001a\u00020\tHÆ\u0003JF\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\u000e\u001a\u00020\tHÆ\u0001ø\u0001\u0000J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Landroidx/compose/animation/ChangeSize;", "", "Landroidx/compose/ui/Alignment;", "component1", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "component2", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "component3", "", "component4", "alignment", "size", "animationSpec", "clip", "copy", "", "toString", "", "hashCode", "other", "equals", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "Lsn/l;", "getSize", "()Lsn/l;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "Z", "getClip", "()Z", "<init>", "(Landroidx/compose/ui/Alignment;Lsn/l;Landroidx/compose/animation/core/FiniteAnimationSpec;Z)V", "animation_release"}, k = 1, mv = {1, 6, 0})
public final /* data */ class ChangeSize {

    @NotNull
    private final Alignment alignment;

    @NotNull
    private final FiniteAnimationSpec<IntSize> animationSpec;
    private final boolean clip;

    @NotNull
    private final l<IntSize, IntSize> size;

    /* JADX WARN: Multi-variable type inference failed */
    public ChangeSize(@NotNull Alignment alignment, @NotNull l<? super IntSize, IntSize> lVar, @NotNull FiniteAnimationSpec<IntSize> finiteAnimationSpec, boolean z10) {
        p.k(alignment, "alignment");
        p.k(lVar, "size");
        p.k(finiteAnimationSpec, "animationSpec");
        this.alignment = alignment;
        this.size = lVar;
        this.animationSpec = finiteAnimationSpec;
        this.clip = z10;
    }

    public /* synthetic */ ChangeSize(Alignment alignment, l lVar, FiniteAnimationSpec finiteAnimationSpec, boolean z10, int i10, i iVar) {
        this(alignment, (i10 & 2) != 0 ? new l<IntSize, IntSize>() { // from class: androidx.compose.animation.ChangeSize.1
            @Override // sn.l
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m3978boximpl(m36invokemzRDjE0(intSize.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m36invokemzRDjE0(long j10) {
                return IntSizeKt.IntSize(0, 0);
            }
        } : lVar, finiteAnimationSpec, (i10 & 8) != 0 ? true : z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChangeSize copy$default(ChangeSize changeSize, Alignment alignment, l lVar, FiniteAnimationSpec finiteAnimationSpec, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            alignment = changeSize.alignment;
        }
        if ((i10 & 2) != 0) {
            lVar = changeSize.size;
        }
        if ((i10 & 4) != 0) {
            finiteAnimationSpec = changeSize.animationSpec;
        }
        if ((i10 & 8) != 0) {
            z10 = changeSize.clip;
        }
        return changeSize.copy(alignment, lVar, finiteAnimationSpec, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Alignment getAlignment() {
        return this.alignment;
    }

    @NotNull
    public final l<IntSize, IntSize> component2() {
        return this.size;
    }

    @NotNull
    public final FiniteAnimationSpec<IntSize> component3() {
        return this.animationSpec;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    @NotNull
    public final ChangeSize copy(@NotNull Alignment alignment, @NotNull l<? super IntSize, IntSize> lVar, @NotNull FiniteAnimationSpec<IntSize> finiteAnimationSpec, boolean z10) {
        p.k(alignment, "alignment");
        p.k(lVar, "size");
        p.k(finiteAnimationSpec, "animationSpec");
        return new ChangeSize(alignment, lVar, finiteAnimationSpec, z10);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeSize)) {
            return false;
        }
        ChangeSize changeSize = (ChangeSize) other;
        return p.f(this.alignment, changeSize.alignment) && p.f(this.size, changeSize.size) && p.f(this.animationSpec, changeSize.animationSpec) && this.clip == changeSize.clip;
    }

    @NotNull
    public final Alignment getAlignment() {
        return this.alignment;
    }

    @NotNull
    public final FiniteAnimationSpec<IntSize> getAnimationSpec() {
        return this.animationSpec;
    }

    public final boolean getClip() {
        return this.clip;
    }

    @NotNull
    public final l<IntSize, IntSize> getSize() {
        return this.size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = ((((this.alignment.hashCode() * 31) + this.size.hashCode()) * 31) + this.animationSpec.hashCode()) * 31;
        boolean z10 = this.clip;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iHashCode + r12;
    }

    @NotNull
    public String toString() {
        return "ChangeSize(alignment=" + this.alignment + ", size=" + this.size + ", animationSpec=" + this.animationSpec + ", clip=" + this.clip + ')';
    }
}
