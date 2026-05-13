package androidx.compose.foundation.lazy;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import bn.r;
import cn.f0;
import cn.w;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.a;
import org.jetbrains.annotations.NotNull;
import p000do.l0;
import tn.p;
import zn.i;
import zn.n;

/* JADX INFO: compiled from: LazyListItemPlacementAnimator.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020\b¢\u0006\u0004\bB\u0010CJ[\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0013\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u001c\u0010\u001b\u001a\u00020\u0006*\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ<\u0010#\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\u001f2\u0006\u0010\"\u001a\u00020!J;\u0010+\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*J\u0006\u0010,\u001a\u00020\u0017R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R \u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0015028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\"\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00104R\u0016\u00107\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00108R\u0016\u0010:\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00108R\u0016\u0010;\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00108R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00010<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001b\u0010A\u001a\u00020\u0002*\u00020\u00068BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b?\u0010@\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006D"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "", "", "index", "sizeWithSpacings", "averageItemsSize", "Landroidx/compose/ui/unit/IntOffset;", "scrolledBy", "", "reverseLayout", "mainAxisLayoutSize", "fallback", "", "Landroidx/compose/foundation/lazy/LazyListPositionedItem;", "visibleItems", "calculateExpectedOffset-diAxcj4", "(IIIJZIILjava/util/List;)I", "calculateExpectedOffset", "itemIndex", "getItemSize", "item", "Landroidx/compose/foundation/lazy/ItemInfo;", "itemInfo", "Lbn/r;", "startAnimationsIfNeeded", "toOffset-Bjo55l4", "(I)J", "toOffset", "consumedScroll", "layoutWidth", "layoutHeight", "", "positionedItems", "Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;", "itemProvider", "onMeasured", "key", "placeableIndex", "minOffset", "maxOffset", "rawOffset", "getAnimatedOffset-YT5a7pE", "(Ljava/lang/Object;IIIJ)J", "getAnimatedOffset", "reset", "Ldo/l0;", "scope", "Ldo/l0;", "isVertical", "Z", "", "keyToItemInfoMap", "Ljava/util/Map;", "", "keyToIndexMap", "viewportStartItemIndex", "I", "viewportStartItemNotVisiblePartSize", "viewportEndItemIndex", "viewportEndItemNotVisiblePartSize", "", "positionedKeys", "Ljava/util/Set;", "getMainAxis--gyyYBs", "(J)I", "mainAxis", "<init>", "(Ldo/l0;Z)V", "foundation_release"}, k = 1, mv = {1, 6, 0})
public final class LazyListItemPlacementAnimator {
    private final boolean isVertical;

    @NotNull
    private Map<Object, Integer> keyToIndexMap;

    @NotNull
    private final Map<Object, ItemInfo> keyToItemInfoMap;

    @NotNull
    private final Set<Object> positionedKeys;

    @NotNull
    private final l0 scope;
    private int viewportEndItemIndex;
    private int viewportEndItemNotVisiblePartSize;
    private int viewportStartItemIndex;
    private int viewportStartItemNotVisiblePartSize;

    public LazyListItemPlacementAnimator(@NotNull l0 l0Var, boolean z10) {
        p.k(l0Var, "scope");
        this.scope = l0Var;
        this.isVertical = z10;
        this.keyToItemInfoMap = new LinkedHashMap();
        this.keyToIndexMap = a.j();
        this.viewportStartItemIndex = -1;
        this.viewportEndItemIndex = -1;
        this.positionedKeys = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: calculateExpectedOffset-diAxcj4, reason: not valid java name */
    private final int m522calculateExpectedOffsetdiAxcj4(int index, int sizeWithSpacings, int averageItemsSize, long scrolledBy, boolean reverseLayout, int mainAxisLayoutSize, int fallback, List<LazyListPositionedItem> visibleItems) {
        int itemSize = 0;
        int i10 = this.viewportEndItemIndex;
        boolean z10 = reverseLayout ? i10 > index : i10 < index;
        int i11 = this.viewportStartItemIndex;
        boolean z11 = reverseLayout ? i11 < index : i11 > index;
        if (z10) {
            i iVarV = !reverseLayout ? n.v(this.viewportEndItemIndex + 1, index) : n.v(index + 1, this.viewportEndItemIndex);
            int iF = iVarV.f();
            int iG = iVarV.g();
            if (iF <= iG) {
                while (true) {
                    itemSize += getItemSize(visibleItems, iF, averageItemsSize);
                    if (iF == iG) {
                        break;
                    }
                    iF++;
                }
            }
            return mainAxisLayoutSize + this.viewportEndItemNotVisiblePartSize + itemSize + m523getMainAxisgyyYBs(scrolledBy);
        }
        if (!z11) {
            return fallback;
        }
        i iVarV2 = !reverseLayout ? n.v(index + 1, this.viewportStartItemIndex) : n.v(this.viewportStartItemIndex + 1, index);
        int iF2 = iVarV2.f();
        int iG2 = iVarV2.g();
        if (iF2 <= iG2) {
            while (true) {
                sizeWithSpacings += getItemSize(visibleItems, iF2, averageItemsSize);
                if (iF2 == iG2) {
                    break;
                }
                iF2++;
            }
        }
        return (this.viewportStartItemNotVisiblePartSize - sizeWithSpacings) + m523getMainAxisgyyYBs(scrolledBy);
    }

    private final int getItemSize(List<LazyListPositionedItem> list, int i10, int i11) {
        if (!list.isEmpty() && i10 >= ((LazyListPositionedItem) f0.t0(list)).getIndex() && i10 <= ((LazyListPositionedItem) f0.F0(list)).getIndex()) {
            if (i10 - ((LazyListPositionedItem) f0.t0(list)).getIndex() >= ((LazyListPositionedItem) f0.F0(list)).getIndex() - i10) {
                for (int iO = w.o(list); -1 < iO; iO--) {
                    LazyListPositionedItem lazyListPositionedItem = list.get(iO);
                    if (lazyListPositionedItem.getIndex() == i10) {
                        return lazyListPositionedItem.getSizeWithSpacings();
                    }
                    if (lazyListPositionedItem.getIndex() < i10) {
                        break;
                    }
                }
            } else {
                int size = list.size();
                for (int i12 = 0; i12 < size; i12++) {
                    LazyListPositionedItem lazyListPositionedItem2 = list.get(i12);
                    if (lazyListPositionedItem2.getIndex() == i10) {
                        return lazyListPositionedItem2.getSizeWithSpacings();
                    }
                    if (lazyListPositionedItem2.getIndex() > i10) {
                        break;
                    }
                }
            }
        }
        return i11;
    }

    /* JADX INFO: renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m523getMainAxisgyyYBs(long j10) {
        return this.isVertical ? IntOffset.m3945getYimpl(j10) : IntOffset.m3944getXimpl(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void startAnimationsIfNeeded(androidx.compose.foundation.lazy.LazyListPositionedItem r18, androidx.compose.foundation.lazy.ItemInfo r19) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListItemPlacementAnimator.startAnimationsIfNeeded(androidx.compose.foundation.lazy.LazyListPositionedItem, androidx.compose.foundation.lazy.ItemInfo):void");
    }

    /* JADX INFO: renamed from: toOffset-Bjo55l4, reason: not valid java name */
    private final long m524toOffsetBjo55l4(int i10) {
        boolean z10 = this.isVertical;
        int i11 = z10 ? 0 : i10;
        if (!z10) {
            i10 = 0;
        }
        return IntOffsetKt.IntOffset(i11, i10);
    }

    /* JADX INFO: renamed from: getAnimatedOffset-YT5a7pE, reason: not valid java name */
    public final long m525getAnimatedOffsetYT5a7pE(@NotNull Object key, int placeableIndex, int minOffset, int maxOffset, long rawOffset) {
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
        if (placeableInfo.getInProgress() && ((m523getMainAxisgyyYBs(jIntOffset2) < minOffset && m523getMainAxisgyyYBs(jIntOffset) < minOffset) || (m523getMainAxisgyyYBs(jIntOffset2) > maxOffset && m523getMainAxisgyyYBs(jIntOffset) > maxOffset))) {
            p000do.i.d(this.scope, null, null, new LazyListItemPlacementAnimator$getAnimatedOffset$1(placeableInfo, null), 3, null);
        }
        return jIntOffset;
    }

    public final void onMeasured(int i10, int i11, int i12, boolean z10, @NotNull List<LazyListPositionedItem> list, @NotNull LazyMeasuredItemProvider lazyMeasuredItemProvider) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i13;
        int i14;
        long j10;
        ItemInfo itemInfo;
        LazyListPositionedItem lazyListPositionedItem;
        int iM522calculateExpectedOffsetdiAxcj4;
        p.k(list, "positionedItems");
        p.k(lazyMeasuredItemProvider, "itemProvider");
        int size = list.size();
        int i15 = 0;
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
        int i17 = this.isVertical ? i12 : i11;
        int i18 = i10;
        if (z10) {
            i18 = -i18;
        }
        long jM524toOffsetBjo55l4 = m524toOffsetBjo55l4(i18);
        LazyListPositionedItem lazyListPositionedItem2 = (LazyListPositionedItem) f0.t0(list);
        LazyListPositionedItem lazyListPositionedItem3 = (LazyListPositionedItem) f0.F0(list);
        int size2 = list.size();
        int sizeWithSpacings = 0;
        for (int i19 = 0; i19 < size2; i19++) {
            LazyListPositionedItem lazyListPositionedItem4 = list.get(i19);
            ItemInfo itemInfo2 = this.keyToItemInfoMap.get(lazyListPositionedItem4.getKey());
            if (itemInfo2 != null) {
                itemInfo2.setIndex(lazyListPositionedItem4.getIndex());
            }
            sizeWithSpacings += lazyListPositionedItem4.getSizeWithSpacings();
        }
        int size3 = sizeWithSpacings / list.size();
        this.positionedKeys.clear();
        int size4 = list.size();
        int i20 = 0;
        while (i20 < size4) {
            LazyListPositionedItem lazyListPositionedItem5 = list.get(i20);
            this.positionedKeys.add(lazyListPositionedItem5.getKey());
            ItemInfo itemInfo3 = this.keyToItemInfoMap.get(lazyListPositionedItem5.getKey());
            if (itemInfo3 != null) {
                i13 = i20;
                i14 = size4;
                if (lazyListPositionedItem5.getHasAnimations()) {
                    long notAnimatableDelta = itemInfo3.getNotAnimatableDelta();
                    itemInfo3.m513setNotAnimatableDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(notAnimatableDelta) + IntOffset.m3944getXimpl(jM524toOffsetBjo55l4), IntOffset.m3945getYimpl(notAnimatableDelta) + IntOffset.m3945getYimpl(jM524toOffsetBjo55l4)));
                    startAnimationsIfNeeded(lazyListPositionedItem5, itemInfo3);
                } else {
                    this.keyToItemInfoMap.remove(lazyListPositionedItem5.getKey());
                }
            } else if (lazyListPositionedItem5.getHasAnimations()) {
                ItemInfo itemInfo4 = new ItemInfo(lazyListPositionedItem5.getIndex());
                Integer num = this.keyToIndexMap.get(lazyListPositionedItem5.getKey());
                long jM532getOffsetBjo55l4 = lazyListPositionedItem5.m532getOffsetBjo55l4(i15);
                int mainAxisSize = lazyListPositionedItem5.getMainAxisSize(i15);
                if (num == null) {
                    iM522calculateExpectedOffsetdiAxcj4 = m523getMainAxisgyyYBs(jM532getOffsetBjo55l4);
                    j10 = jM532getOffsetBjo55l4;
                    itemInfo = itemInfo4;
                    lazyListPositionedItem = lazyListPositionedItem5;
                    i13 = i20;
                    i14 = size4;
                } else {
                    j10 = jM532getOffsetBjo55l4;
                    itemInfo = itemInfo4;
                    lazyListPositionedItem = lazyListPositionedItem5;
                    i13 = i20;
                    i14 = size4;
                    iM522calculateExpectedOffsetdiAxcj4 = m522calculateExpectedOffsetdiAxcj4(num.intValue(), lazyListPositionedItem5.getSizeWithSpacings(), size3, jM524toOffsetBjo55l4, z10, i17, !z10 ? m523getMainAxisgyyYBs(jM532getOffsetBjo55l4) : (m523getMainAxisgyyYBs(jM532getOffsetBjo55l4) - lazyListPositionedItem5.getSizeWithSpacings()) + mainAxisSize, list) + (z10 ? lazyListPositionedItem.getSize() - mainAxisSize : i15);
                }
                long jM3940copyiSbpLlY$default = this.isVertical ? IntOffset.m3940copyiSbpLlY$default(j10, 0, iM522calculateExpectedOffsetdiAxcj4, 1, null) : IntOffset.m3940copyiSbpLlY$default(j10, iM522calculateExpectedOffsetdiAxcj4, 0, 2, null);
                int placeablesCount = lazyListPositionedItem.getPlaceablesCount();
                for (int i21 = i15; i21 < placeablesCount; i21++) {
                    LazyListPositionedItem lazyListPositionedItem6 = lazyListPositionedItem;
                    long jM532getOffsetBjo55l42 = lazyListPositionedItem6.m532getOffsetBjo55l4(i21);
                    long jIntOffset = IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(jM532getOffsetBjo55l42) - IntOffset.m3944getXimpl(j10), IntOffset.m3945getYimpl(jM532getOffsetBjo55l42) - IntOffset.m3945getYimpl(j10));
                    itemInfo.getPlaceables().add(new PlaceableInfo(IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(jM3940copyiSbpLlY$default) + IntOffset.m3944getXimpl(jIntOffset), IntOffset.m3945getYimpl(jM3940copyiSbpLlY$default) + IntOffset.m3945getYimpl(jIntOffset)), lazyListPositionedItem6.getMainAxisSize(i21), null));
                    r rVar = r.f5635a;
                }
                LazyListPositionedItem lazyListPositionedItem7 = lazyListPositionedItem;
                ItemInfo itemInfo5 = itemInfo;
                this.keyToItemInfoMap.put(lazyListPositionedItem7.getKey(), itemInfo5);
                startAnimationsIfNeeded(lazyListPositionedItem7, itemInfo5);
            } else {
                i13 = i20;
                i14 = size4;
            }
            i20 = i13 + 1;
            size4 = i14;
            i15 = 0;
        }
        if (z10) {
            this.viewportStartItemIndex = lazyListPositionedItem3.getIndex();
            this.viewportStartItemNotVisiblePartSize = (i17 - lazyListPositionedItem3.getOffset()) - lazyListPositionedItem3.getSize();
            this.viewportEndItemIndex = lazyListPositionedItem2.getIndex();
            this.viewportEndItemNotVisiblePartSize = (-lazyListPositionedItem2.getOffset()) + (lazyListPositionedItem2.getSizeWithSpacings() - lazyListPositionedItem2.getSize());
        } else {
            this.viewportStartItemIndex = lazyListPositionedItem2.getIndex();
            this.viewportStartItemNotVisiblePartSize = lazyListPositionedItem2.getOffset();
            this.viewportEndItemIndex = lazyListPositionedItem3.getIndex();
            this.viewportEndItemNotVisiblePartSize = (lazyListPositionedItem3.getOffset() + lazyListPositionedItem3.getSizeWithSpacings()) - i17;
        }
        Iterator<Map.Entry<Object, ItemInfo>> it = this.keyToItemInfoMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Object, ItemInfo> next = it.next();
            if (!this.positionedKeys.contains(next.getKey())) {
                ItemInfo value = next.getValue();
                long notAnimatableDelta2 = value.getNotAnimatableDelta();
                value.m513setNotAnimatableDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(notAnimatableDelta2) + IntOffset.m3944getXimpl(jM524toOffsetBjo55l4), IntOffset.m3945getYimpl(notAnimatableDelta2) + IntOffset.m3945getYimpl(jM524toOffsetBjo55l4)));
                Integer num2 = lazyMeasuredItemProvider.getKeyToIndexMap().get(next.getKey());
                List<PlaceableInfo> placeables = value.getPlaceables();
                int size5 = placeables.size();
                int i22 = 0;
                while (true) {
                    if (i22 >= size5) {
                        z12 = false;
                        break;
                    }
                    PlaceableInfo placeableInfo = placeables.get(i22);
                    long targetOffset = placeableInfo.getTargetOffset();
                    long notAnimatableDelta3 = value.getNotAnimatableDelta();
                    long jIntOffset2 = IntOffsetKt.IntOffset(IntOffset.m3944getXimpl(targetOffset) + IntOffset.m3944getXimpl(notAnimatableDelta3), IntOffset.m3945getYimpl(targetOffset) + IntOffset.m3945getYimpl(notAnimatableDelta3));
                    if (m523getMainAxisgyyYBs(jIntOffset2) + placeableInfo.getSize() > 0 && m523getMainAxisgyyYBs(jIntOffset2) < i17) {
                        z12 = true;
                        break;
                    }
                    i22++;
                }
                List<PlaceableInfo> placeables2 = value.getPlaceables();
                int size6 = placeables2.size();
                int i23 = 0;
                while (true) {
                    if (i23 >= size6) {
                        z13 = false;
                        break;
                    } else {
                        if (placeables2.get(i23).getInProgress()) {
                            z13 = true;
                            break;
                        }
                        i23++;
                    }
                }
                boolean z14 = !z13;
                if ((!z12 && z14) || num2 == null || value.getPlaceables().isEmpty()) {
                    it.remove();
                } else {
                    LazyMeasuredItem lazyMeasuredItemM541getAndMeasureZjPyQlc = lazyMeasuredItemProvider.m541getAndMeasureZjPyQlc(DataIndex.m500constructorimpl(num2.intValue()));
                    int iM522calculateExpectedOffsetdiAxcj42 = m522calculateExpectedOffsetdiAxcj4(num2.intValue(), lazyMeasuredItemM541getAndMeasureZjPyQlc.getSizeWithSpacings(), size3, jM524toOffsetBjo55l4, z10, i17, i17, list);
                    if (z10) {
                        iM522calculateExpectedOffsetdiAxcj42 = (i17 - iM522calculateExpectedOffsetdiAxcj42) - lazyMeasuredItemM541getAndMeasureZjPyQlc.getSize();
                    }
                    LazyListPositionedItem lazyListPositionedItemPosition = lazyMeasuredItemM541getAndMeasureZjPyQlc.position(iM522calculateExpectedOffsetdiAxcj42, i11, i12);
                    list.add(lazyListPositionedItemPosition);
                    startAnimationsIfNeeded(lazyListPositionedItemPosition, value);
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
