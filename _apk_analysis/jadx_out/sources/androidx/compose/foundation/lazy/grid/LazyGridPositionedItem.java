package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: LazyMeasuredItem.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0088\u0001\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020(\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00102\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nR#\u0010\u000e\u001a\u00020\b8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016R\u001a\u0010\u001e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016R#\u0010!\u001a\u00020 8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b!\u0010\u000f\u001a\u0004\b\"\u0010\u0011R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010\u0016R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0014R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0014R\u0014\u0010'\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0014R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001d\u00102\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b2\u0010\u000fR\u0017\u00103\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b3\u0010*\u001a\u0004\b4\u00105R\u001b\u00108\u001a\u00020\u0002*\u00020\b8BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b6\u00107R\u0018\u0010;\u001a\u00020\u0002*\u0002098BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010:R\u0011\u0010=\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b<\u0010\u0016R\u0011\u0010?\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b>\u0010\u0016R\u0011\u0010A\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b@\u0010\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006D"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "", "index", "getMainAxisSize", "getCrossAxisSize", "getCrossAxisOffset", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntOffset;", "getAnimationSpec", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "scope", "Lbn/r;", "place", TypedValues.CycleType.S_WAVE_OFFSET, "J", "getOffset-nOcc-ac", "()J", "placeableOffset", "getPlaceableOffset-nOcc-ac", "I", "getIndex", "()I", "", "key", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "row", "getRow", "column", "getColumn", "Landroidx/compose/ui/unit/IntSize;", "size", "getSize-YbymL2g", "lineMainAxisSize", "getLineMainAxisSize", "mainAxisSpacing", "minMainAxisOffset", "maxMainAxisOffset", "", "isVertical", "Z", "", "Landroidx/compose/foundation/lazy/grid/LazyGridPlaceableWrapper;", "wrappers", "Ljava/util/List;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "placementAnimator", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "visualOffset", "hasAnimations", "getHasAnimations", "()Z", "getMainAxis--gyyYBs", "(J)I", "mainAxis", "Landroidx/compose/ui/layout/Placeable;", "(Landroidx/compose/ui/layout/Placeable;)I", "mainAxisSize", "getPlaceablesCount", "placeablesCount", "getMainAxisSizeWithSpacings", "mainAxisSizeWithSpacings", "getLineMainAxisSizeWithSpacings", "lineMainAxisSizeWithSpacings", "<init>", "(JJILjava/lang/Object;IIJIIIIZLjava/util/List;Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;JLtn/i;)V", "foundation_release"}, k = 1, mv = {1, 6, 0})
public final class LazyGridPositionedItem implements LazyGridItemInfo {
    private final int column;
    private final boolean hasAnimations;
    private final int index;
    private final boolean isVertical;

    @NotNull
    private final Object key;
    private final int lineMainAxisSize;
    private final int mainAxisSpacing;
    private final int maxMainAxisOffset;
    private final int minMainAxisOffset;
    private final long offset;
    private final long placeableOffset;

    @NotNull
    private final LazyGridItemPlacementAnimator placementAnimator;
    private final int row;
    private final long size;
    private final long visualOffset;

    @NotNull
    private final List<LazyGridPlaceableWrapper> wrappers;

    private LazyGridPositionedItem(long j10, long j11, int i10, Object obj, int i11, int i12, long j12, int i13, int i14, int i15, int i16, boolean z10, List<LazyGridPlaceableWrapper> list, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j13) {
        this.offset = j10;
        this.placeableOffset = j11;
        this.index = i10;
        this.key = obj;
        this.row = i11;
        this.column = i12;
        this.size = j12;
        this.lineMainAxisSize = i13;
        this.mainAxisSpacing = i14;
        this.minMainAxisOffset = i15;
        this.maxMainAxisOffset = i16;
        this.isVertical = z10;
        this.wrappers = list;
        this.placementAnimator = lazyGridItemPlacementAnimator;
        this.visualOffset = j13;
        int placeablesCount = getPlaceablesCount();
        boolean z11 = false;
        int i17 = 0;
        while (true) {
            if (i17 >= placeablesCount) {
                break;
            }
            if (getAnimationSpec(i17) != null) {
                z11 = true;
                break;
            }
            i17++;
        }
        this.hasAnimations = z11;
    }

    public /* synthetic */ LazyGridPositionedItem(long j10, long j11, int i10, Object obj, int i11, int i12, long j12, int i13, int i14, int i15, int i16, boolean z10, List list, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j13, i iVar) {
        this(j10, j11, i10, obj, i11, i12, j12, i13, i14, i15, i16, z10, list, lazyGridItemPlacementAnimator, j13);
    }

    /* JADX INFO: renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m588getMainAxisgyyYBs(long j10) {
        return this.isVertical ? IntOffset.m3945getYimpl(j10) : IntOffset.m3944getXimpl(j10);
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

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getColumn() {
        return this.column;
    }

    public final int getCrossAxisOffset() {
        return this.isVertical ? IntOffset.m3944getXimpl(getOffset()) : IntOffset.m3945getYimpl(getOffset());
    }

    public final int getCrossAxisSize() {
        return this.isVertical ? IntSize.m3986getWidthimpl(getSize()) : IntSize.m3985getHeightimpl(getSize());
    }

    public final boolean getHasAnimations() {
        return this.hasAnimations;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    @NotNull
    public Object getKey() {
        return this.key;
    }

    public final int getLineMainAxisSize() {
        return this.lineMainAxisSize;
    }

    public final int getLineMainAxisSizeWithSpacings() {
        return this.mainAxisSpacing + this.lineMainAxisSize;
    }

    public final int getMainAxisSize(int index) {
        return getMainAxisSize(this.wrappers.get(index).getPlaceable());
    }

    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSpacing + (this.isVertical ? IntSize.m3985getHeightimpl(getSize()) : IntSize.m3986getWidthimpl(getSize()));
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* JADX INFO: renamed from: getOffset-nOcc-ac, reason: from getter */
    public long getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: getPlaceableOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getPlaceableOffset() {
        return this.placeableOffset;
    }

    public final int getPlaceablesCount() {
        return this.wrappers.size();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getRow() {
        return this.row;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* JADX INFO: renamed from: getSize-YbymL2g, reason: from getter */
    public long getSize() {
        return this.size;
    }

    public final void place(@NotNull Placeable.PlacementScope placementScope) {
        p.k(placementScope, "scope");
        int placeablesCount = getPlaceablesCount();
        for (int i10 = 0; i10 < placeablesCount; i10++) {
            Placeable placeable = this.wrappers.get(i10).getPlaceable();
            int mainAxisSize = this.minMainAxisOffset - getMainAxisSize(placeable);
            int i11 = this.maxMainAxisOffset;
            long jM580getAnimatedOffsetYT5a7pE = getAnimationSpec(i10) != null ? this.placementAnimator.m580getAnimatedOffsetYT5a7pE(getKey(), i10, mainAxisSize, i11, this.placeableOffset) : this.placeableOffset;
            if (m588getMainAxisgyyYBs(jM580getAnimatedOffsetYT5a7pE) > mainAxisSize && m588getMainAxisgyyYBs(jM580getAnimatedOffsetYT5a7pE) < i11) {
                if (this.isVertical) {
                    long j10 = this.visualOffset;
                    Placeable.PlacementScope.m3157placeWithLayeraW9wM$default(placementScope, placeable, IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(jM580getAnimatedOffsetYT5a7pE) + IntOffset.m3944getXimpl(j10), IntOffset.m3945getYimpl(jM580getAnimatedOffsetYT5a7pE) + IntOffset.m3945getYimpl(j10)), 0.0f, null, 6, null);
                } else {
                    long j11 = this.visualOffset;
                    Placeable.PlacementScope.m3156placeRelativeWithLayeraW9wM$default(placementScope, placeable, IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(jM580getAnimatedOffsetYT5a7pE) + IntOffset.m3944getXimpl(j11), IntOffset.m3945getYimpl(jM580getAnimatedOffsetYT5a7pE) + IntOffset.m3945getYimpl(j11)), 0.0f, null, 6, null);
                }
            }
        }
    }
}
