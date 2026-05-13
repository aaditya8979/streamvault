package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: LazyMeasuredItem.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001Bh\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0007\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0011R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0010R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001d\u0010(\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b(\u0010)R\u0017\u0010*\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010,R\u0018\u0010/\u001a\u00020\u0002*\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010.R\u0011\u00101\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b0\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListPositionedItem;", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "", "index", "Landroidx/compose/ui/unit/IntOffset;", "getOffset-Bjo55l4", "(I)J", "getOffset", "getMainAxisSize", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getAnimationSpec", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "scope", "Lbn/r;", "place", TypedValues.CycleType.S_WAVE_OFFSET, "I", "()I", "getIndex", "", "key", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "size", "getSize", "sizeWithSpacings", "getSizeWithSpacings", "minMainAxisOffset", "maxMainAxisOffset", "", "isVertical", "Z", "", "Landroidx/compose/foundation/lazy/LazyListPlaceableWrapper;", "wrappers", "Ljava/util/List;", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "placementAnimator", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "visualOffset", "J", "hasAnimations", "getHasAnimations", "()Z", "Landroidx/compose/ui/layout/Placeable;", "(Landroidx/compose/ui/layout/Placeable;)I", "mainAxisSize", "getPlaceablesCount", "placeablesCount", "<init>", "(IILjava/lang/Object;IIIIZLjava/util/List;Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;JLtn/i;)V", "foundation_release"}, k = 1, mv = {1, 6, 0})
public final class LazyListPositionedItem implements LazyListItemInfo {
    private final boolean hasAnimations;
    private final int index;
    private final boolean isVertical;

    @NotNull
    private final Object key;
    private final int maxMainAxisOffset;
    private final int minMainAxisOffset;
    private final int offset;

    @NotNull
    private final LazyListItemPlacementAnimator placementAnimator;
    private final int size;
    private final int sizeWithSpacings;
    private final long visualOffset;

    @NotNull
    private final List<LazyListPlaceableWrapper> wrappers;

    private LazyListPositionedItem(int i10, int i11, Object obj, int i12, int i13, int i14, int i15, boolean z10, List<LazyListPlaceableWrapper> list, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, long j10) {
        this.offset = i10;
        this.index = i11;
        this.key = obj;
        this.size = i12;
        this.sizeWithSpacings = i13;
        this.minMainAxisOffset = i14;
        this.maxMainAxisOffset = i15;
        this.isVertical = z10;
        this.wrappers = list;
        this.placementAnimator = lazyListItemPlacementAnimator;
        this.visualOffset = j10;
        int placeablesCount = getPlaceablesCount();
        boolean z11 = false;
        int i16 = 0;
        while (true) {
            if (i16 >= placeablesCount) {
                break;
            }
            if (getAnimationSpec(i16) != null) {
                z11 = true;
                break;
            }
            i16++;
        }
        this.hasAnimations = z11;
    }

    public /* synthetic */ LazyListPositionedItem(int i10, int i11, Object obj, int i12, int i13, int i14, int i15, boolean z10, List list, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, long j10, i iVar) {
        this(i10, i11, obj, i12, i13, i14, i15, z10, list, lazyListItemPlacementAnimator, j10);
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }

    @Nullable
    public final FiniteAnimationSpec<IntOffset> getAnimationSpec(int index) {
        Object parentData = this.wrappers.get(index).getParentData();
        if (parentData instanceof FiniteAnimationSpec) {
            return (FiniteAnimationSpec) parentData;
        }
        return null;
    }

    public final boolean getHasAnimations() {
        return this.hasAnimations;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    @NotNull
    public Object getKey() {
        return this.key;
    }

    public final int getMainAxisSize(int index) {
        return getMainAxisSize(this.wrappers.get(index).getPlaceable());
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: getOffset-Bjo55l4, reason: not valid java name */
    public final long m532getOffsetBjo55l4(int index) {
        return this.wrappers.get(index).getOffset();
    }

    public final int getPlaceablesCount() {
        return this.wrappers.size();
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getSize() {
        return this.size;
    }

    public final int getSizeWithSpacings() {
        return this.sizeWithSpacings;
    }

    public final void place(@NotNull Placeable.PlacementScope placementScope) {
        p.k(placementScope, "scope");
        int placeablesCount = getPlaceablesCount();
        for (int i10 = 0; i10 < placeablesCount; i10++) {
            Placeable placeable = this.wrappers.get(i10).getPlaceable();
            long jM525getAnimatedOffsetYT5a7pE = getAnimationSpec(i10) != null ? this.placementAnimator.m525getAnimatedOffsetYT5a7pE(getKey(), i10, this.minMainAxisOffset - getMainAxisSize(placeable), this.maxMainAxisOffset, m532getOffsetBjo55l4(i10)) : m532getOffsetBjo55l4(i10);
            if (this.isVertical) {
                long j10 = this.visualOffset;
                Placeable.PlacementScope.m3157placeWithLayeraW9wM$default(placementScope, placeable, IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(jM525getAnimatedOffsetYT5a7pE) + IntOffset.m3944getXimpl(j10), IntOffset.m3945getYimpl(jM525getAnimatedOffsetYT5a7pE) + IntOffset.m3945getYimpl(j10)), 0.0f, null, 6, null);
            } else {
                long j11 = this.visualOffset;
                Placeable.PlacementScope.m3156placeRelativeWithLayeraW9wM$default(placementScope, placeable, IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(jM525getAnimatedOffsetYT5a7pE) + IntOffset.m3944getXimpl(j11), IntOffset.m3945getYimpl(jM525getAnimatedOffsetYT5a7pE) + IntOffset.m3945getYimpl(j11)), 0.0f, null, 6, null);
            }
        }
    }
}
