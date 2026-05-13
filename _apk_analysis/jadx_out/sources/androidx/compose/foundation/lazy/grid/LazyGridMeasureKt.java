package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import cn.f0;
import cn.r;
import cn.w;
import com.safedk.android.analytics.reporters.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.q;
import tn.p;
import vn.c;
import zn.g;
import zn.n;

/* JADX INFO: compiled from: LazyGridMeasure.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000~\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aÍ\u0001\u0010%\u001a\u00020\"2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2*\u0010!\u001a&\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d\u0012\u0004\u0012\u00020 0\u001cH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$\u001ap\u00100\u001a\b\u0012\u0004\u0012\u00020/0.2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00061"}, d2 = {"", "itemsCount", "Landroidx/compose/foundation/lazy/grid/LazyMeasuredLineProvider;", "measuredLineProvider", "Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;", "measuredItemProvider", "mainAxisAvailableSize", "slotsPerLine", "beforeContentPadding", "afterContentPadding", "Landroidx/compose/foundation/lazy/grid/LineIndex;", "firstVisibleLineIndex", "firstVisibleLineScrollOffset", "", "scrollToBeConsumed", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "reverseLayout", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "placementAnimator", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lbn/r;", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "measureLazyGrid-zIfe3eg", "(ILandroidx/compose/foundation/lazy/grid/LazyMeasuredLineProvider;Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;Lsn/q;)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "measureLazyGrid", "", "Landroidx/compose/foundation/lazy/grid/LazyMeasuredLine;", b.f52847d, "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "firstLineScrollOffset", "", "Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;", "calculateItemsOffsets", "foundation_release"}, k = 2, mv = {1, 6, 0})
public final class LazyGridMeasureKt {
    private static final List<LazyGridPositionedItem> calculateItemsOffsets(List<LazyMeasuredLine> list, int i10, int i11, int i12, int i13, int i14, boolean z10, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z11, Density density) {
        int i15 = z10 ? i11 : i10;
        boolean z12 = i12 < Math.min(i15, i13);
        if (z12) {
            if (!(i14 == 0)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        int size = list.size();
        int length = 0;
        for (int i16 = 0; i16 < size; i16++) {
            length += list.get(i16).getItems().length;
        }
        ArrayList arrayList = new ArrayList(length);
        if (z12) {
            int size2 = list.size();
            int[] iArr = new int[size2];
            for (int i17 = 0; i17 < size2; i17++) {
                iArr[i17] = list.get(calculateItemsOffsets$reverseAware(i17, z11, size2)).getMainAxisSize();
            }
            int[] iArr2 = new int[size2];
            for (int i18 = 0; i18 < size2; i18++) {
                iArr2[i18] = 0;
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
                    int mainAxisSize = iArr2[iF];
                    LazyMeasuredLine lazyMeasuredLine = list.get(calculateItemsOffsets$reverseAware(iF, z11, size2));
                    if (z11) {
                        mainAxisSize = (i15 - mainAxisSize) - lazyMeasuredLine.getMainAxisSize();
                    }
                    arrayList.addAll(lazyMeasuredLine.position(mainAxisSize, i10, i11));
                    if (iF == iG) {
                        break;
                    }
                    iF += iH;
                }
            }
        } else {
            int size3 = list.size();
            int mainAxisSizeWithSpacings = i14;
            for (int i19 = 0; i19 < size3; i19++) {
                LazyMeasuredLine lazyMeasuredLine2 = list.get(i19);
                arrayList.addAll(lazyMeasuredLine2.position(mainAxisSizeWithSpacings, i10, i11));
                mainAxisSizeWithSpacings += lazyMeasuredLine2.getMainAxisSizeWithSpacings();
            }
        }
        return arrayList;
    }

    private static final int calculateItemsOffsets$reverseAware(int i10, boolean z10, int i11) {
        return !z10 ? i10 : (i11 - i10) - 1;
    }

    @NotNull
    /* JADX INFO: renamed from: measureLazyGrid-zIfe3eg, reason: not valid java name */
    public static final LazyGridMeasureResult m586measureLazyGridzIfe3eg(int i10, @NotNull LazyMeasuredLineProvider lazyMeasuredLineProvider, @NotNull LazyMeasuredItemProvider lazyMeasuredItemProvider, int i11, int i12, int i13, int i14, int i15, int i16, float f10, long j10, boolean z10, @Nullable Arrangement.Vertical vertical, @Nullable Arrangement.Horizontal horizontal, boolean z11, @NotNull Density density, @NotNull LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, @NotNull q<? super Integer, ? super Integer, ? super l<? super Placeable.PlacementScope, bn.r>, ? extends MeasureResult> qVar) {
        int iM608constructorimpl;
        int i17;
        int i18;
        LazyMeasuredLine lazyMeasuredLine;
        LazyMeasuredLineProvider lazyMeasuredLineProvider2 = lazyMeasuredLineProvider;
        p.k(lazyMeasuredLineProvider2, "measuredLineProvider");
        p.k(lazyMeasuredItemProvider, "measuredItemProvider");
        p.k(density, "density");
        p.k(lazyGridItemPlacementAnimator, "placementAnimator");
        p.k(qVar, "layout");
        if (!(i13 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i14 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i10 <= 0) {
            return new LazyGridMeasureResult(null, 0, false, 0.0f, qVar.invoke(Integer.valueOf(Constraints.m3784getMinWidthimpl(j10)), Integer.valueOf(Constraints.m3783getMinHeightimpl(j10)), new l<Placeable.PlacementScope, bn.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$1
                @Override // sn.l
                public /* bridge */ /* synthetic */ bn.r invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return bn.r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                    p.k(placementScope, "$this$invoke");
                }
            }), w.m(), -i13, i11 + i14, 0, z11, z10 ? Orientation.Vertical : Orientation.Horizontal, i14);
        }
        int iD = c.d(f10);
        int i19 = i16 - iD;
        int iM608constructorimpl2 = i15;
        if (LineIndex.m611equalsimpl0(iM608constructorimpl2, LineIndex.m608constructorimpl(0)) && i19 < 0) {
            iD += i19;
            i19 = 0;
        }
        ArrayList arrayList = new ArrayList();
        int mainAxisSizeWithSpacings = i19 - i13;
        int i20 = -i13;
        while (mainAxisSizeWithSpacings < 0 && iM608constructorimpl2 - LineIndex.m608constructorimpl(0) > 0) {
            iM608constructorimpl2 = LineIndex.m608constructorimpl(iM608constructorimpl2 - 1);
            LazyMeasuredLine lazyMeasuredLineM604getAndMeasurebKFJvoY = lazyMeasuredLineProvider2.m604getAndMeasurebKFJvoY(iM608constructorimpl2);
            arrayList.add(0, lazyMeasuredLineM604getAndMeasurebKFJvoY);
            mainAxisSizeWithSpacings += lazyMeasuredLineM604getAndMeasurebKFJvoY.getMainAxisSizeWithSpacings();
        }
        if (mainAxisSizeWithSpacings < i20) {
            iD += mainAxisSizeWithSpacings;
            mainAxisSizeWithSpacings = i20;
        }
        int i21 = mainAxisSizeWithSpacings + i13;
        int i22 = i11 + i14;
        int i23 = iM608constructorimpl2;
        int iE = n.e(i22, 0);
        int mainAxisSizeWithSpacings2 = -i21;
        int size = arrayList.size();
        int iM608constructorimpl3 = i23;
        int i24 = i22;
        for (int i25 = 0; i25 < size; i25++) {
            LazyMeasuredLine lazyMeasuredLine2 = (LazyMeasuredLine) arrayList.get(i25);
            iM608constructorimpl3 = LineIndex.m608constructorimpl(iM608constructorimpl3 + 1);
            mainAxisSizeWithSpacings2 += lazyMeasuredLine2.getMainAxisSizeWithSpacings();
        }
        int mainAxisSizeWithSpacings3 = i21;
        int iM608constructorimpl4 = iM608constructorimpl3;
        while (true) {
            if (mainAxisSizeWithSpacings2 > iE && !arrayList.isEmpty()) {
                break;
            }
            int i26 = iE;
            LazyMeasuredLine lazyMeasuredLineM604getAndMeasurebKFJvoY2 = lazyMeasuredLineProvider2.m604getAndMeasurebKFJvoY(iM608constructorimpl4);
            if (lazyMeasuredLineM604getAndMeasurebKFJvoY2.isEmpty()) {
                LineIndex.m608constructorimpl(iM608constructorimpl4 - 1);
                break;
            }
            int i27 = i20;
            int i28 = i24;
            mainAxisSizeWithSpacings2 += lazyMeasuredLineM604getAndMeasurebKFJvoY2.getMainAxisSizeWithSpacings();
            if (mainAxisSizeWithSpacings2 > i27 || ((LazyMeasuredItem) r.p0(lazyMeasuredLineM604getAndMeasurebKFJvoY2.getItems())).getIndex() == i10 - 1) {
                arrayList.add(lazyMeasuredLineM604getAndMeasurebKFJvoY2);
                iM608constructorimpl = i23;
            } else {
                iM608constructorimpl = LineIndex.m608constructorimpl(iM608constructorimpl4 + 1);
                mainAxisSizeWithSpacings3 -= lazyMeasuredLineM604getAndMeasurebKFJvoY2.getMainAxisSizeWithSpacings();
            }
            iM608constructorimpl4 = LineIndex.m608constructorimpl(iM608constructorimpl4 + 1);
            iE = i26;
            i23 = iM608constructorimpl;
            i20 = i27;
            i24 = i28;
            lazyMeasuredLineProvider2 = lazyMeasuredLineProvider;
        }
        if (mainAxisSizeWithSpacings2 < i11) {
            int i29 = i11 - mainAxisSizeWithSpacings2;
            mainAxisSizeWithSpacings3 -= i29;
            mainAxisSizeWithSpacings2 += i29;
            int iM608constructorimpl5 = i23;
            while (true) {
                if (mainAxisSizeWithSpacings3 >= i13) {
                    i17 = i20;
                    i18 = 0;
                    break;
                }
                if (iM608constructorimpl5 - LineIndex.m608constructorimpl(0) <= 0) {
                    i18 = 0;
                    i17 = i20;
                    break;
                }
                iM608constructorimpl5 = LineIndex.m608constructorimpl(iM608constructorimpl5 - 1);
                int i30 = i20;
                LazyMeasuredLine lazyMeasuredLineM604getAndMeasurebKFJvoY3 = lazyMeasuredLineProvider2.m604getAndMeasurebKFJvoY(iM608constructorimpl5);
                arrayList.add(0, lazyMeasuredLineM604getAndMeasurebKFJvoY3);
                mainAxisSizeWithSpacings3 += lazyMeasuredLineM604getAndMeasurebKFJvoY3.getMainAxisSizeWithSpacings();
                i20 = i30;
            }
            iD += i29;
            if (mainAxisSizeWithSpacings3 < 0) {
                iD += mainAxisSizeWithSpacings3;
                mainAxisSizeWithSpacings2 += mainAxisSizeWithSpacings3;
                mainAxisSizeWithSpacings3 = i18;
            }
        } else {
            i17 = i20;
            i18 = 0;
        }
        float f11 = (c.a(c.d(f10)) != c.a(iD) || Math.abs(c.d(f10)) < Math.abs(iD)) ? f10 : iD;
        int i31 = -mainAxisSizeWithSpacings3;
        LazyMeasuredLine lazyMeasuredLine3 = (LazyMeasuredLine) f0.t0(arrayList);
        if (i13 > 0) {
            int size2 = arrayList.size();
            LazyMeasuredLine lazyMeasuredLine4 = lazyMeasuredLine3;
            int i32 = i18;
            while (i32 < size2) {
                int mainAxisSizeWithSpacings4 = ((LazyMeasuredLine) arrayList.get(i32)).getMainAxisSizeWithSpacings();
                if (mainAxisSizeWithSpacings3 == 0 || mainAxisSizeWithSpacings4 > mainAxisSizeWithSpacings3 || i32 == w.o(arrayList)) {
                    break;
                }
                mainAxisSizeWithSpacings3 -= mainAxisSizeWithSpacings4;
                i32++;
                lazyMeasuredLine4 = (LazyMeasuredLine) arrayList.get(i32);
            }
            lazyMeasuredLine = lazyMeasuredLine4;
        } else {
            lazyMeasuredLine = lazyMeasuredLine3;
        }
        int i33 = mainAxisSizeWithSpacings3;
        int iM3782getMaxWidthimpl = z10 ? Constraints.m3782getMaxWidthimpl(j10) : ConstraintsKt.m3796constrainWidthK40F9xA(j10, mainAxisSizeWithSpacings2);
        int iM3795constrainHeightK40F9xA = z10 ? ConstraintsKt.m3795constrainHeightK40F9xA(j10, mainAxisSizeWithSpacings2) : Constraints.m3781getMaxHeightimpl(j10);
        int i34 = i24;
        float f12 = f11;
        int i35 = i17;
        final List<LazyGridPositionedItem> listCalculateItemsOffsets = calculateItemsOffsets(arrayList, iM3782getMaxWidthimpl, iM3795constrainHeightK40F9xA, mainAxisSizeWithSpacings2, i11, i31, z10, vertical, horizontal, z11, density);
        int i36 = mainAxisSizeWithSpacings2;
        lazyGridItemPlacementAnimator.onMeasured((int) f12, iM3782getMaxWidthimpl, iM3795constrainHeightK40F9xA, i12, z11, listCalculateItemsOffsets, lazyMeasuredItemProvider);
        return new LazyGridMeasureResult(lazyMeasuredLine, i33, i36 > i11, f12, qVar.invoke(Integer.valueOf(iM3782getMaxWidthimpl), Integer.valueOf(iM3795constrainHeightK40F9xA), new l<Placeable.PlacementScope, bn.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ bn.r invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return bn.r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                p.k(placementScope, "$this$invoke");
                List<LazyGridPositionedItem> list = listCalculateItemsOffsets;
                int size3 = list.size();
                for (int i37 = 0; i37 < size3; i37++) {
                    list.get(i37).place(placementScope);
                }
            }
        }), listCalculateItemsOffsets, i35, i34, i10, z11, z10 ? Orientation.Vertical : Orientation.Horizontal, i14);
    }
}
