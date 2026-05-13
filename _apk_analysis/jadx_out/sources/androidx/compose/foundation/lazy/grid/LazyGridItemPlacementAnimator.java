package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import bn.r;
import cn.f0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.a;
import org.jetbrains.annotations.NotNull;
import p000do.i;
import p000do.l0;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: LazyGridItemPlacementAnimator.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020\b¢\u0006\u0004\b?\u0010@JM\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u001c\u0010\u0017\u001a\u00020\u0006*\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016JD\u0010 \u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c2\u0006\u0010\u001f\u001a\u00020\u001eJ;\u0010(\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'J\u0006\u0010)\u001a\u00020\u0013R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010/R \u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0011008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\"\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R\u0016\u00105\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010/R\u0016\u00106\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010/R\u0016\u00107\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010/R\u0016\u00108\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010/R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0001098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001b\u0010>\u001a\u00020\u0002*\u00020\u00068BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b<\u0010=\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "", "", "index", "mainAxisSizeWithSpacings", "averageLineMainAxisSize", "Landroidx/compose/ui/unit/IntOffset;", "scrolledBy", "", "reverseLayout", "mainAxisLayoutSize", "fallback", "calculateExpectedOffset-tGxSNXI", "(IIIJZII)I", "calculateExpectedOffset", "Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;", "item", "Landroidx/compose/foundation/lazy/grid/ItemInfo;", "itemInfo", "Lbn/r;", "startAnimationsIfNeeded", "toOffset-Bjo55l4", "(I)J", "toOffset", "consumedScroll", "layoutWidth", "layoutHeight", "slotsPerLine", "", "positionedItems", "Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;", "measuredItemProvider", "onMeasured", "key", "placeableIndex", "minOffset", "maxOffset", "rawOffset", "getAnimatedOffset-YT5a7pE", "(Ljava/lang/Object;IIIJ)J", "getAnimatedOffset", "reset", "Ldo/l0;", "scope", "Ldo/l0;", "isVertical", "Z", "I", "", "keyToItemInfoMap", "Ljava/util/Map;", "", "keyToIndexMap", "viewportStartItemIndex", "viewportStartItemNotVisiblePartSize", "viewportEndItemIndex", "viewportEndItemNotVisiblePartSize", "", "positionedKeys", "Ljava/util/Set;", "getMainAxis--gyyYBs", "(J)I", "mainAxis", "<init>", "(Ldo/l0;Z)V", "foundation_release"}, k = 1, mv = {1, 6, 0})
public final class LazyGridItemPlacementAnimator {
    private final boolean isVertical;

    @NotNull
    private Map<Object, Integer> keyToIndexMap;

    @NotNull
    private final Map<Object, ItemInfo> keyToItemInfoMap;

    @NotNull
    private final Set<Object> positionedKeys;

    @NotNull
    private final l0 scope;
    private int slotsPerLine;
    private int viewportEndItemIndex;
    private int viewportEndItemNotVisiblePartSize;
    private int viewportStartItemIndex;
    private int viewportStartItemNotVisiblePartSize;

    public LazyGridItemPlacementAnimator(@NotNull l0 l0Var, boolean z10) {
        p.k(l0Var, "scope");
        this.scope = l0Var;
        this.isVertical = z10;
        this.keyToItemInfoMap = new LinkedHashMap();
        this.keyToIndexMap = a.j();
        this.viewportStartItemIndex = -1;
        this.viewportEndItemIndex = -1;
        this.positionedKeys = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: calculateExpectedOffset-tGxSNXI, reason: not valid java name */
    private final int m577calculateExpectedOffsettGxSNXI(int index, int mainAxisSizeWithSpacings, int averageLineMainAxisSize, long scrolledBy, boolean reverseLayout, int mainAxisLayoutSize, int fallback) {
        boolean z10 = false;
        if (!(this.slotsPerLine != 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i10 = this.viewportEndItemIndex;
        boolean z11 = reverseLayout ? i10 > index : i10 < index;
        if (reverseLayout ? this.viewportStartItemIndex < index : this.viewportStartItemIndex > index) {
            z10 = true;
        }
        if (z11) {
            int iAbs = Math.abs(index - this.viewportEndItemIndex);
            int i11 = this.slotsPerLine;
            return mainAxisLayoutSize + this.viewportEndItemNotVisiblePartSize + (averageLineMainAxisSize * ((((iAbs + i11) - 1) / i11) - 1)) + m578getMainAxisgyyYBs(scrolledBy);
        }
        if (!z10) {
            return fallback;
        }
        int iAbs2 = Math.abs(this.viewportStartItemIndex - index);
        int i12 = this.slotsPerLine;
        return ((this.viewportStartItemNotVisiblePartSize - mainAxisSizeWithSpacings) - (averageLineMainAxisSize * ((((iAbs2 + i12) - 1) / i12) - 1))) + m578getMainAxisgyyYBs(scrolledBy);
    }

    /* JADX INFO: renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m578getMainAxisgyyYBs(long j10) {
        return this.isVertical ? IntOffset.m3945getYimpl(j10) : IntOffset.m3944getXimpl(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void startAnimationsIfNeeded(androidx.compose.foundation.lazy.grid.LazyGridPositionedItem r18, androidx.compose.foundation.lazy.grid.ItemInfo r19) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator.startAnimationsIfNeeded(androidx.compose.foundation.lazy.grid.LazyGridPositionedItem, androidx.compose.foundation.lazy.grid.ItemInfo):void");
    }

    /* JADX INFO: renamed from: toOffset-Bjo55l4, reason: not valid java name */
    private final long m579toOffsetBjo55l4(int i10) {
        boolean z10 = this.isVertical;
        int i11 = z10 ? 0 : i10;
        if (!z10) {
            i10 = 0;
        }
        return IntOffsetKt.IntOffset(i11, i10);
    }

    /* JADX INFO: renamed from: getAnimatedOffset-YT5a7pE, reason: not valid java name */
    public final long m580getAnimatedOffsetYT5a7pE(@NotNull Object key, int placeableIndex, int minOffset, int maxOffset, long rawOffset) {
        p.k(key, "key");
        ItemInfo itemInfo = this.keyToItemInfoMap.get(key);
        if (itemInfo == null) {
            return rawOffset;
        }
        PlaceableInfo placeableInfo = itemInfo.getPlaceables().get(placeableIndex);
        long packedValue = placeableInfo.getAnimatedOffset().getValue().getPackedValue();
        long notAnimatableDelta = itemInfo.getNotAnimatableDelta();
        long jIntOffset = IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(packedValue) + IntOffset.m3944getXimpl(notAnimatableDelta), IntOffset.m3945getYimpl(packedValue) + IntOffset.m3945getYimpl(notAnimatableDelta));
        long targetOffset = placeableInfo.getTargetOffset();
        long notAnimatableDelta2 = itemInfo.getNotAnimatableDelta();
        long jIntOffset2 = IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(targetOffset) + IntOffset.m3944getXimpl(notAnimatableDelta2), IntOffset.m3945getYimpl(targetOffset) + IntOffset.m3945getYimpl(notAnimatableDelta2));
        if (placeableInfo.getInProgress() && ((m578getMainAxisgyyYBs(jIntOffset2) < minOffset && m578getMainAxisgyyYBs(jIntOffset) < minOffset) || (m578getMainAxisgyyYBs(jIntOffset2) > maxOffset && m578getMainAxisgyyYBs(jIntOffset) > maxOffset))) {
            i.d(this.scope, null, null, new LazyGridItemPlacementAnimator$getAnimatedOffset$1(placeableInfo, null), 3, null);
        }
        return jIntOffset;
    }

    public final void onMeasured(int i10, int i11, int i12, int i13, boolean z10, @NotNull final List<LazyGridPositionedItem> list, @NotNull LazyMeasuredItemProvider lazyMeasuredItemProvider) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i14;
        int i15;
        long j10;
        ItemInfo itemInfo;
        LazyGridPositionedItem lazyGridPositionedItem;
        int iM577calculateExpectedOffsettGxSNXI;
        p.k(list, "positionedItems");
        p.k(lazyMeasuredItemProvider, "measuredItemProvider");
        int size = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size) {
                z11 = false;
                break;
            } else {
                if (list.get(i16).getHasAnimations()) {
                    z11 = true;
                    break;
                }
                i16++;
            }
        }
        if (!z11) {
            reset();
            return;
        }
        this.slotsPerLine = i13;
        int i17 = this.isVertical ? i12 : i11;
        int i18 = i10;
        if (z10) {
            i18 = -i18;
        }
        long jM579toOffsetBjo55l4 = m579toOffsetBjo55l4(i18);
        LazyGridPositionedItem lazyGridPositionedItem2 = (LazyGridPositionedItem) f0.t0(list);
        LazyGridPositionedItem lazyGridPositionedItem3 = (LazyGridPositionedItem) f0.F0(list);
        int size2 = list.size();
        for (int i19 = 0; i19 < size2; i19++) {
            LazyGridPositionedItem lazyGridPositionedItem4 = list.get(i19);
            ItemInfo itemInfo2 = this.keyToItemInfoMap.get(lazyGridPositionedItem4.getKey());
            if (itemInfo2 != null) {
                itemInfo2.setIndex(lazyGridPositionedItem4.getIndex());
                itemInfo2.setCrossAxisSize(lazyGridPositionedItem4.getCrossAxisSize());
                itemInfo2.setCrossAxisOffset(lazyGridPositionedItem4.getCrossAxisOffset());
            }
        }
        l<Integer, Integer> lVar = new l<Integer, Integer>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$averageLineMainAxisSize$1$lineOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @NotNull
            public final Integer invoke(int i20) {
                return Integer.valueOf(this.$this_run.isVertical ? list.get(i20).getRow() : list.get(i20).getColumn());
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }
        };
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        while (i20 < list.size()) {
            int iIntValue = lVar.invoke(Integer.valueOf(i20)).intValue();
            if (iIntValue == -1) {
                i20++;
            } else {
                int iMax = 0;
                while (i20 < list.size() && lVar.invoke(Integer.valueOf(i20)).intValue() == iIntValue) {
                    iMax = Math.max(iMax, list.get(i20).getMainAxisSizeWithSpacings());
                    i20++;
                }
                i21 += iMax;
                i22++;
            }
        }
        int i23 = i21 / i22;
        this.positionedKeys.clear();
        int i24 = 0;
        for (int size3 = list.size(); i24 < size3; size3 = i15) {
            LazyGridPositionedItem lazyGridPositionedItem5 = list.get(i24);
            this.positionedKeys.add(lazyGridPositionedItem5.getKey());
            ItemInfo itemInfo3 = this.keyToItemInfoMap.get(lazyGridPositionedItem5.getKey());
            if (itemInfo3 != null) {
                i14 = i24;
                i15 = size3;
                if (lazyGridPositionedItem5.getHasAnimations()) {
                    long notAnimatableDelta = itemInfo3.getNotAnimatableDelta();
                    itemInfo3.m568setNotAnimatableDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(notAnimatableDelta) + IntOffset.m3944getXimpl(jM579toOffsetBjo55l4), IntOffset.m3945getYimpl(notAnimatableDelta) + IntOffset.m3945getYimpl(jM579toOffsetBjo55l4)));
                    startAnimationsIfNeeded(lazyGridPositionedItem5, itemInfo3);
                } else {
                    this.keyToItemInfoMap.remove(lazyGridPositionedItem5.getKey());
                }
            } else if (lazyGridPositionedItem5.getHasAnimations()) {
                ItemInfo itemInfo4 = new ItemInfo(lazyGridPositionedItem5.getIndex(), lazyGridPositionedItem5.getCrossAxisSize(), lazyGridPositionedItem5.getCrossAxisOffset());
                Integer num = this.keyToIndexMap.get(lazyGridPositionedItem5.getKey());
                long placeableOffset = lazyGridPositionedItem5.getPlaceableOffset();
                if (num == null) {
                    iM577calculateExpectedOffsettGxSNXI = m578getMainAxisgyyYBs(placeableOffset);
                    j10 = placeableOffset;
                    itemInfo = itemInfo4;
                    lazyGridPositionedItem = lazyGridPositionedItem5;
                    i14 = i24;
                    i15 = size3;
                } else {
                    j10 = placeableOffset;
                    itemInfo = itemInfo4;
                    lazyGridPositionedItem = lazyGridPositionedItem5;
                    i14 = i24;
                    i15 = size3;
                    iM577calculateExpectedOffsettGxSNXI = m577calculateExpectedOffsettGxSNXI(num.intValue(), lazyGridPositionedItem5.getMainAxisSizeWithSpacings(), i23, jM579toOffsetBjo55l4, z10, i17, !z10 ? m578getMainAxisgyyYBs(placeableOffset) : m578getMainAxisgyyYBs(placeableOffset) - lazyGridPositionedItem5.getMainAxisSizeWithSpacings());
                }
                long jM3940copyiSbpLlY$default = this.isVertical ? IntOffset.m3940copyiSbpLlY$default(j10, 0, iM577calculateExpectedOffsettGxSNXI, 1, null) : IntOffset.m3940copyiSbpLlY$default(j10, iM577calculateExpectedOffsettGxSNXI, 0, 2, null);
                int placeablesCount = lazyGridPositionedItem.getPlaceablesCount();
                for (int i25 = 0; i25 < placeablesCount; i25++) {
                    itemInfo.getPlaceables().add(new PlaceableInfo(jM3940copyiSbpLlY$default, lazyGridPositionedItem.getMainAxisSize(i25), null));
                    r rVar = r.f5635a;
                }
                LazyGridPositionedItem lazyGridPositionedItem6 = lazyGridPositionedItem;
                ItemInfo itemInfo5 = itemInfo;
                this.keyToItemInfoMap.put(lazyGridPositionedItem6.getKey(), itemInfo5);
                startAnimationsIfNeeded(lazyGridPositionedItem6, itemInfo5);
            } else {
                i14 = i24;
                i15 = size3;
            }
            i24 = i14 + 1;
        }
        if (z10) {
            this.viewportStartItemIndex = lazyGridPositionedItem3.getIndex();
            this.viewportStartItemNotVisiblePartSize = (i17 - m578getMainAxisgyyYBs(lazyGridPositionedItem3.getOffset())) - lazyGridPositionedItem3.getLineMainAxisSize();
            this.viewportEndItemIndex = lazyGridPositionedItem2.getIndex();
            this.viewportEndItemNotVisiblePartSize = (-m578getMainAxisgyyYBs(lazyGridPositionedItem2.getOffset())) + (lazyGridPositionedItem2.getLineMainAxisSizeWithSpacings() - (this.isVertical ? IntSize.m3985getHeightimpl(lazyGridPositionedItem2.getSize()) : IntSize.m3986getWidthimpl(lazyGridPositionedItem2.getSize())));
        } else {
            this.viewportStartItemIndex = lazyGridPositionedItem2.getIndex();
            this.viewportStartItemNotVisiblePartSize = m578getMainAxisgyyYBs(lazyGridPositionedItem2.getOffset());
            this.viewportEndItemIndex = lazyGridPositionedItem3.getIndex();
            this.viewportEndItemNotVisiblePartSize = (m578getMainAxisgyyYBs(lazyGridPositionedItem3.getOffset()) + lazyGridPositionedItem3.getLineMainAxisSizeWithSpacings()) - i17;
        }
        Iterator<Map.Entry<Object, ItemInfo>> it = this.keyToItemInfoMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Object, ItemInfo> next = it.next();
            if (!this.positionedKeys.contains(next.getKey())) {
                ItemInfo value = next.getValue();
                long notAnimatableDelta2 = value.getNotAnimatableDelta();
                value.m568setNotAnimatableDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(notAnimatableDelta2) + IntOffset.m3944getXimpl(jM579toOffsetBjo55l4), IntOffset.m3945getYimpl(notAnimatableDelta2) + IntOffset.m3945getYimpl(jM579toOffsetBjo55l4)));
                Integer num2 = lazyMeasuredItemProvider.getKeyToIndexMap().get(next.getKey());
                List<PlaceableInfo> placeables = value.getPlaceables();
                int size4 = placeables.size();
                int i26 = 0;
                while (true) {
                    if (i26 >= size4) {
                        z12 = false;
                        break;
                    }
                    PlaceableInfo placeableInfo = placeables.get(i26);
                    long targetOffset = placeableInfo.getTargetOffset();
                    long notAnimatableDelta3 = value.getNotAnimatableDelta();
                    long jIntOffset = IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(targetOffset) + IntOffset.m3944getXimpl(notAnimatableDelta3), IntOffset.m3945getYimpl(targetOffset) + IntOffset.m3945getYimpl(notAnimatableDelta3));
                    if (m578getMainAxisgyyYBs(jIntOffset) + placeableInfo.getMainAxisSize() > 0 && m578getMainAxisgyyYBs(jIntOffset) < i17) {
                        z12 = true;
                        break;
                    }
                    i26++;
                }
                List<PlaceableInfo> placeables2 = value.getPlaceables();
                int size5 = placeables2.size();
                int i27 = 0;
                while (true) {
                    if (i27 >= size5) {
                        z13 = false;
                        break;
                    } else {
                        if (placeables2.get(i27).getInProgress()) {
                            z13 = true;
                            break;
                        }
                        i27++;
                    }
                }
                boolean z14 = !z13;
                if ((!z12 && z14) || num2 == null || value.getPlaceables().isEmpty()) {
                    it.remove();
                } else {
                    LazyMeasuredItem lazyMeasuredItemM601getAndMeasureednRnyU$default = LazyMeasuredItemProvider.m601getAndMeasureednRnyU$default(lazyMeasuredItemProvider, ItemIndex.m556constructorimpl(num2.intValue()), 0, this.isVertical ? Constraints.INSTANCE.m3792fixedWidthOenEA2s(value.getCrossAxisSize()) : Constraints.INSTANCE.m3791fixedHeightOenEA2s(value.getCrossAxisSize()), 2, null);
                    int iM577calculateExpectedOffsettGxSNXI2 = m577calculateExpectedOffsettGxSNXI(num2.intValue(), lazyMeasuredItemM601getAndMeasureednRnyU$default.getMainAxisSizeWithSpacings(), i23, jM579toOffsetBjo55l4, z10, i17, i17);
                    if (z10) {
                        iM577calculateExpectedOffsettGxSNXI2 = (i17 - iM577calculateExpectedOffsettGxSNXI2) - lazyMeasuredItemM601getAndMeasureednRnyU$default.getMainAxisSize();
                    }
                    LazyGridPositionedItem lazyGridPositionedItemPosition = lazyMeasuredItemM601getAndMeasureednRnyU$default.position(iM577calculateExpectedOffsettGxSNXI2, value.getCrossAxisOffset(), i11, i12, -1, -1, lazyMeasuredItemM601getAndMeasureednRnyU$default.getMainAxisSize());
                    list.add(lazyGridPositionedItemPosition);
                    startAnimationsIfNeeded(lazyGridPositionedItemPosition, value);
                }
            }
        }
        this.keyToIndexMap = lazyMeasuredItemProvider.getKeyToIndexMap();
    }

    public final void reset() {
        this.keyToItemInfoMap.clear();
        this.keyToIndexMap = a.j();
        this.viewportStartItemIndex = -1;
        this.viewportStartItemNotVisiblePartSize = 0;
        this.viewportEndItemIndex = -1;
        this.viewportEndItemNotVisiblePartSize = 0;
    }
}
