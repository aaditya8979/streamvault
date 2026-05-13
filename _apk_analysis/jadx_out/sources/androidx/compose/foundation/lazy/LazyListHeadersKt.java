package androidx.compose.foundation.lazy;

import cn.f0;
import cn.w;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: LazyListHeaders.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\u001aF\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0000¨\u0006\f"}, d2 = {"findOrComposeLazyListHeader", "Landroidx/compose/foundation/lazy/LazyListPositionedItem;", "composedVisibleItems", "", "itemProvider", "Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;", "headerIndexes", "", "", "beforeContentPadding", "layoutWidth", "layoutHeight", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class LazyListHeadersKt {
    @Nullable
    public static final LazyListPositionedItem findOrComposeLazyListHeader(@NotNull List<LazyListPositionedItem> list, @NotNull LazyMeasuredItemProvider lazyMeasuredItemProvider, @NotNull List<Integer> list2, int i10, int i11, int i12) {
        p.k(list, "composedVisibleItems");
        p.k(lazyMeasuredItemProvider, "itemProvider");
        p.k(list2, "headerIndexes");
        int index = ((LazyListPositionedItem) f0.t0(list)).getIndex();
        int size = list2.size();
        int i13 = 0;
        int iIntValue = -1;
        int iIntValue2 = -1;
        while (i13 < size && list2.get(i13).intValue() <= index) {
            iIntValue = list2.get(i13).intValue();
            i13++;
            iIntValue2 = ((i13 < 0 || i13 > w.o(list2)) ? -1 : list2.get(i13)).intValue();
        }
        int size2 = list.size();
        int offset = Integer.MIN_VALUE;
        int offset2 = Integer.MIN_VALUE;
        int i14 = -1;
        for (int i15 = 0; i15 < size2; i15++) {
            LazyListPositionedItem lazyListPositionedItem = list.get(i15);
            if (lazyListPositionedItem.getIndex() == iIntValue) {
                offset = lazyListPositionedItem.getOffset();
                i14 = i15;
            } else if (lazyListPositionedItem.getIndex() == iIntValue2) {
                offset2 = lazyListPositionedItem.getOffset();
            }
        }
        if (iIntValue == -1) {
            return null;
        }
        LazyMeasuredItem lazyMeasuredItemM541getAndMeasureZjPyQlc = lazyMeasuredItemProvider.m541getAndMeasureZjPyQlc(DataIndex.m500constructorimpl(iIntValue));
        int iMax = offset != Integer.MIN_VALUE ? Math.max(-i10, offset) : -i10;
        if (offset2 != Integer.MIN_VALUE) {
            iMax = Math.min(iMax, offset2 - lazyMeasuredItemM541getAndMeasureZjPyQlc.getSize());
        }
        LazyListPositionedItem lazyListPositionedItemPosition = lazyMeasuredItemM541getAndMeasureZjPyQlc.position(iMax, i11, i12);
        if (i14 != -1) {
            list.set(i14, lazyListPositionedItemPosition);
        } else {
            list.add(0, lazyListPositionedItemPosition);
        }
        return lazyListPositionedItemPosition;
    }
}
