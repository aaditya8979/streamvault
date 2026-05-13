package androidx.compose.foundation.lazy;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import cn.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import zn.g;
import zn.n;

/* JADX INFO: compiled from: LazyListMeasure.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0080\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aÓ\u0001\u0010&\u001a\u00020#2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2*\u0010\"\u001a&\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001e\u0012\u0004\u0012\u00020!0\u001dH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%\u001a\u008c\u0001\u00102\u001a\b\u0012\u0004\u0012\u000201002\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00102\f\u0010)\u001a\b\u0012\u0004\u0012\u00020'0\u00102\f\u0010*\u001a\b\u0012\u0004\u0012\u00020'0\u00102\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"", "itemsCount", "Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;", "itemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "Landroidx/compose/foundation/lazy/DataIndex;", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "", "scrollToBeConsumed", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "", "headerIndexes", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "reverseLayout", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "placementAnimator", "Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;", "beyondBoundsInfo", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lbn/r;", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "measureLazyList-7Xnphek", "(ILandroidx/compose/foundation/lazy/LazyMeasuredItemProvider;IIIIIFJZLjava/util/List;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;Lsn/q;)Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "measureLazyList", "Landroidx/compose/foundation/lazy/LazyMeasuredItem;", "items", "extraItemsBefore", "extraItemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "itemsScrollOffset", "", "Landroidx/compose/foundation/lazy/LazyListPositionedItem;", "calculateItemsOffsets", "foundation_release"}, k = 2, mv = {1, 6, 0})
public final class LazyListMeasureKt {
    private static final List<LazyListPositionedItem> calculateItemsOffsets(List<LazyMeasuredItem> list, List<LazyMeasuredItem> list2, List<LazyMeasuredItem> list3, int i10, int i11, int i12, int i13, int i14, boolean z10, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z11, Density density) {
        int i15 = z10 ? i11 : i10;
        boolean z12 = i12 < Math.min(i15, i13);
        if (z12) {
            if (!(i14 == 0)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z12) {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            int size = list.size();
            int[] iArr = new int[size];
            for (int i16 = 0; i16 < size; i16++) {
                iArr[i16] = list.get(calculateItemsOffsets$reverseAware(i16, z11, size)).getSize();
            }
            int[] iArr2 = new int[size];
            for (int i17 = 0; i17 < size; i17++) {
                iArr2[i17] = 0;
            }
            if (z10) {
                if (vertical == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                vertical.arrange(density, i15, iArr, iArr2);
            } else {
                if (horizontal == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                horizontal.arrange(density, i15, iArr, LayoutDirection.Ltr, iArr2);
            }
            g gVarY = r.Y(iArr2);
            if (z11) {
                gVarY = n.t(gVarY);
            }
            int iF = gVarY.f();
            int iG = gVarY.g();
            int iH = gVarY.h();
            if ((iH > 0 && iF <= iG) || (iH < 0 && iG <= iF)) {
                while (true) {
                    int size2 = iArr2[iF];
                    LazyMeasuredItem lazyMeasuredItem = list.get(calculateItemsOffsets$reverseAware(iF, z11, size));
                    if (z11) {
                        size2 = (i15 - size2) - lazyMeasuredItem.getSize();
                    }
                    arrayList.add(lazyMeasuredItem.position(size2, i10, i11));
                    if (iF == iG) {
                        break;
                    }
                    iF += iH;
                }
            }
        } else {
            int size3 = list2.size();
            int sizeWithSpacings = i14;
            for (int i18 = 0; i18 < size3; i18++) {
                LazyMeasuredItem lazyMeasuredItem2 = list2.get(i18);
                sizeWithSpacings -= lazyMeasuredItem2.getSizeWithSpacings();
                arrayList.add(lazyMeasuredItem2.position(sizeWithSpacings, i10, i11));
            }
            int size4 = list.size();
            int sizeWithSpacings2 = i14;
            for (int i19 = 0; i19 < size4; i19++) {
                LazyMeasuredItem lazyMeasuredItem3 = list.get(i19);
                arrayList.add(lazyMeasuredItem3.position(sizeWithSpacings2, i10, i11));
                sizeWithSpacings2 += lazyMeasuredItem3.getSizeWithSpacings();
            }
            int size5 = list3.size();
            for (int i20 = 0; i20 < size5; i20++) {
                LazyMeasuredItem lazyMeasuredItem4 = list3.get(i20);
                arrayList.add(lazyMeasuredItem4.position(sizeWithSpacings2, i10, i11));
                sizeWithSpacings2 += lazyMeasuredItem4.getSizeWithSpacings();
            }
        }
        return arrayList;
    }

    private static final int calculateItemsOffsets$reverseAware(int i10, boolean z10, int i11) {
        return !z10 ? i10 : (i11 - i10) - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a1 A[PHI: r5 r11 r12 r14
      0x01a1: PHI (r5v10 int) = (r5v7 int), (r5v23 int) binds: [B:51:0x0169, B:58:0x019a] A[DONT_GENERATE, DONT_INLINE]
      0x01a1: PHI (r11v15 int) = (r11v12 int), (r11v24 int) binds: [B:51:0x0169, B:58:0x019a] A[DONT_GENERATE, DONT_INLINE]
      0x01a1: PHI (r12v3 int) = (r12v2 int), (r12v17 int) binds: [B:51:0x0169, B:58:0x019a] A[DONT_GENERATE, DONT_INLINE]
      0x01a1: PHI (r14v5 int) = (r14v3 int), (r14v14 int) binds: [B:51:0x0169, B:58:0x019a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [int] */
    /* JADX WARN: Type inference failed for: r4v47 */
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: measureLazyList-7Xnphek, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.lazy.LazyListMeasureResult m530measureLazyList7Xnphek(int r31, @org.jetbrains.annotations.NotNull androidx.compose.foundation.lazy.LazyMeasuredItemProvider r32, int r33, int r34, int r35, int r36, int r37, float r38, long r39, boolean r41, @org.jetbrains.annotations.NotNull java.util.List<java.lang.Integer> r42, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Vertical r43, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Horizontal r44, boolean r45, @org.jetbrains.annotations.NotNull androidx.compose.ui.unit.Density r46, @org.jetbrains.annotations.NotNull androidx.compose.foundation.lazy.LazyListItemPlacementAnimator r47, @org.jetbrains.annotations.NotNull androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo r48, @org.jetbrains.annotations.NotNull sn.q<? super java.lang.Integer, ? super java.lang.Integer, ? super sn.l<? super androidx.compose.ui.layout.Placeable.PlacementScope, bn.r>, ? extends androidx.compose.ui.layout.MeasureResult> r49) {
        /*
            Method dump skipped, instruction units count: 927
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListMeasureKt.m530measureLazyList7Xnphek(int, androidx.compose.foundation.lazy.LazyMeasuredItemProvider, int, int, int, int, int, float, long, boolean, java.util.List, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, boolean, androidx.compose.ui.unit.Density, androidx.compose.foundation.lazy.LazyListItemPlacementAnimator, androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo, sn.q):androidx.compose.foundation.lazy.LazyListMeasureResult");
    }

    private static final int measureLazyList_7Xnphek$endIndex(LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, int i10) {
        return Math.min(lazyListBeyondBoundsInfo.getEnd(), i10 - 1);
    }

    private static final int measureLazyList_7Xnphek$startIndex(LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, int i10) {
        return Math.min(lazyListBeyondBoundsInfo.getStart(), i10 - 1);
    }
}
