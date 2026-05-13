package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffsetKt;
import bn.h;
import bn.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.p;
import sn.q;

/* JADX INFO: compiled from: LazyGrid.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0096\u0001\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0094\u0001\u0010&\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020%0\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010#\u001a\u00020\"H\u0003ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a\u0018\u0010*\u001a\u00020\u00182\u0006\u0010!\u001a\u00020 2\u0006\u0010)\u001a\u00020(H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Constraints;", "", "", "slotSizesSums", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "isVertical", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "Lbn/r;", "content", "LazyGrid", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Lsn/p;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lsn/l;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "itemProvider", "ScrollPositionUpdater", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "placementAnimator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/layout/MeasureResult;", "rememberLazyGridMeasurePolicy", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/OverscrollEffect;Lsn/p;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;Landroidx/compose/runtime/Composer;II)Lsn/p;", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "result", "refreshOverscrollInfo", "foundation_release"}, k = 2, mv = {1, 6, 0})
public final class LazyGridKt {
    /* JADX WARN: Removed duplicated region for block: B:107:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0136  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyGrid(@org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r33, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.lazy.grid.LazyGridState r34, @org.jetbrains.annotations.NotNull final sn.p<? super androidx.compose.ui.unit.Density, ? super androidx.compose.ui.unit.Constraints, ? extends java.util.List<java.lang.Integer>> r35, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r36, boolean r37, final boolean r38, @org.jetbrains.annotations.Nullable androidx.compose.foundation.gestures.FlingBehavior r39, final boolean r40, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.layout.Arrangement.Vertical r41, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.layout.Arrangement.Horizontal r42, @org.jetbrains.annotations.NotNull final sn.l<? super androidx.compose.foundation.lazy.grid.LazyGridScope, bn.r> r43, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r44, final int r45, final int r46, final int r47) {
        /*
            Method dump skipped, instruction units count: 863
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, sn.p, androidx.compose.foundation.layout.PaddingValues, boolean, boolean, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, sn.l, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void ScrollPositionUpdater(final LazyGridItemProvider lazyGridItemProvider, final LazyGridState lazyGridState, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(950944068);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(lazyGridItemProvider) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(lazyGridState) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else if (lazyGridItemProvider.getItemCount() > 0) {
            lazyGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyGridItemProvider);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.ScrollPositionUpdater.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return r.f5635a;
            }

            public final void invoke(@Nullable Composer composer2, int i12) {
                LazyGridKt.ScrollPositionUpdater(lazyGridItemProvider, lazyGridState, composer2, i10 | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshOverscrollInfo(OverscrollEffect overscrollEffect, LazyGridMeasureResult lazyGridMeasureResult) {
        Object obj;
        LazyMeasuredItem[] items;
        boolean canScrollForward = lazyGridMeasureResult.getCanScrollForward();
        LazyMeasuredLine firstVisibleLine = lazyGridMeasureResult.getFirstVisibleLine();
        if (firstVisibleLine == null || (items = firstVisibleLine.getItems()) == null || (obj = (LazyMeasuredItem) cn.r.X(items)) == null) {
            obj = 0;
        }
        overscrollEffect.setEnabled(canScrollForward || (!tn.p.f(obj, 0) || lazyGridMeasureResult.getFirstVisibleLineScrollOffset() != 0));
    }

    @Composable
    private static final p<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy(final LazyGridItemProvider lazyGridItemProvider, final LazyGridState lazyGridState, final OverscrollEffect overscrollEffect, final p<? super Density, ? super Constraints, ? extends List<Integer>> pVar, final PaddingValues paddingValues, final boolean z10, final boolean z11, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, final LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(1958911962);
        final Arrangement.Horizontal horizontal2 = (i11 & 128) != 0 ? null : horizontal;
        final Arrangement.Vertical vertical2 = (i11 & 256) != 0 ? null : vertical;
        Object[] objArr = {lazyGridState, overscrollEffect, pVar, paddingValues, Boolean.valueOf(z10), Boolean.valueOf(z11), horizontal2, vertical2, lazyGridItemPlacementAnimator};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i12 = 0; i12 < 9; i12++) {
            zChanged |= composer.changed(objArr[i12]);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new p<LazyLayoutMeasureScope, Constraints, LazyGridMeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ LazyGridMeasureResult mo2invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                    return m582invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                }

                @NotNull
                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyGridMeasureResult m582invoke0kLqBqw(@NotNull final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j10) {
                    float spacing;
                    float spacing2;
                    long jIntOffset;
                    int firstVisibleItemScrollOffset;
                    int iM598getLineIndexOfItem_Ze7BM;
                    tn.p.k(lazyLayoutMeasureScope, "$this$null");
                    CheckScrollableContainerConstraintsKt.m179checkScrollableContainerConstraintsK40F9xA(j10, z11 ? Orientation.Vertical : Orientation.Horizontal);
                    int iMo300roundToPx0680j_4 = z11 ? lazyLayoutMeasureScope.mo300roundToPx0680j_4(paddingValues.mo392calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.mo300roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    int iMo300roundToPx0680j_42 = z11 ? lazyLayoutMeasureScope.mo300roundToPx0680j_4(paddingValues.mo393calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.mo300roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    int iMo300roundToPx0680j_43 = lazyLayoutMeasureScope.mo300roundToPx0680j_4(paddingValues.getTop());
                    int iMo300roundToPx0680j_44 = lazyLayoutMeasureScope.mo300roundToPx0680j_4(paddingValues.getBottom());
                    final int i13 = iMo300roundToPx0680j_43 + iMo300roundToPx0680j_44;
                    final int i14 = iMo300roundToPx0680j_4 + iMo300roundToPx0680j_42;
                    boolean z12 = z11;
                    int i15 = z12 ? i13 : i14;
                    int i16 = (!z12 || z10) ? (z12 && z10) ? iMo300roundToPx0680j_44 : (z12 || z10) ? iMo300roundToPx0680j_42 : iMo300roundToPx0680j_4 : iMo300roundToPx0680j_43;
                    final int i17 = i15 - i16;
                    long jM3798offsetNN6EwU = ConstraintsKt.m3798offsetNN6EwU(j10, -i14, -i13);
                    lazyGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyGridItemProvider);
                    final LazyGridSpanLayoutProvider spanLayoutProvider = lazyGridItemProvider.getSpanLayoutProvider();
                    final List<Integer> listMo2invoke = pVar.mo2invoke(lazyLayoutMeasureScope, Constraints.m3770boximpl(j10));
                    spanLayoutProvider.setSlotsPerLine(listMo2invoke.size());
                    lazyGridState.setDensity$foundation_release(lazyLayoutMeasureScope);
                    lazyGridState.setSlotsPerLine$foundation_release(listMo2invoke.size());
                    if (z11) {
                        Arrangement.Vertical vertical3 = vertical2;
                        if (vertical3 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        spacing = vertical3.getSpacing();
                    } else {
                        Arrangement.Horizontal horizontal3 = horizontal2;
                        if (horizontal3 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        spacing = horizontal3.getSpacing();
                    }
                    int iMo300roundToPx0680j_45 = lazyLayoutMeasureScope.mo300roundToPx0680j_4(spacing);
                    if (z11) {
                        Arrangement.Horizontal horizontal4 = horizontal2;
                        spacing2 = horizontal4 != null ? horizontal4.getSpacing() : Dp.m3826constructorimpl(0);
                    } else {
                        Arrangement.Vertical vertical4 = vertical2;
                        spacing2 = vertical4 != null ? vertical4.getSpacing() : Dp.m3826constructorimpl(0);
                    }
                    final int iMo300roundToPx0680j_46 = lazyLayoutMeasureScope.mo300roundToPx0680j_4(spacing2);
                    int itemCount = lazyGridItemProvider.getItemCount();
                    int iM3781getMaxHeightimpl = z11 ? Constraints.m3781getMaxHeightimpl(j10) - i13 : Constraints.m3782getMaxWidthimpl(j10) - i14;
                    if (!z10 || iM3781getMaxHeightimpl > 0) {
                        jIntOffset = IntOffsetKt.IntOffset(iMo300roundToPx0680j_4, iMo300roundToPx0680j_43);
                    } else {
                        boolean z13 = z11;
                        if (!z13) {
                            iMo300roundToPx0680j_4 += iM3781getMaxHeightimpl;
                        }
                        if (z13) {
                            iMo300roundToPx0680j_43 += iM3781getMaxHeightimpl;
                        }
                        jIntOffset = IntOffsetKt.IntOffset(iMo300roundToPx0680j_4, iMo300roundToPx0680j_43);
                    }
                    final long j11 = jIntOffset;
                    LazyGridItemProvider lazyGridItemProvider2 = lazyGridItemProvider;
                    final boolean z14 = z11;
                    final boolean z15 = z10;
                    final LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator2 = lazyGridItemPlacementAnimator;
                    final int i18 = i16;
                    LazyMeasuredItemProvider lazyMeasuredItemProvider = new LazyMeasuredItemProvider(lazyGridItemProvider2, lazyLayoutMeasureScope, iMo300roundToPx0680j_45, new MeasuredItemFactory() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1
                        @Override // androidx.compose.foundation.lazy.grid.MeasuredItemFactory
                        @NotNull
                        /* JADX INFO: renamed from: createItem-PU_OBEw, reason: not valid java name */
                        public final LazyMeasuredItem mo584createItemPU_OBEw(int i19, @NotNull Object obj, int i20, int i21, @NotNull Placeable[] placeableArr) {
                            tn.p.k(obj, "key");
                            tn.p.k(placeableArr, "placeables");
                            return new LazyMeasuredItem(i19, obj, z14, i20, i21, z15, lazyLayoutMeasureScope.getLayoutDirection(), i18, i17, placeableArr, lazyGridItemPlacementAnimator2, j11, null);
                        }
                    });
                    final boolean z16 = z11;
                    final LazyMeasuredLineProvider lazyMeasuredLineProvider = new LazyMeasuredLineProvider(z16, listMo2invoke, iMo300roundToPx0680j_46, itemCount, iMo300roundToPx0680j_45, lazyMeasuredItemProvider, spanLayoutProvider, new MeasuredLineFactory() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1
                        @Override // androidx.compose.foundation.lazy.grid.MeasuredLineFactory
                        @NotNull
                        /* JADX INFO: renamed from: createLine-H9FfpSk, reason: not valid java name */
                        public final LazyMeasuredLine mo585createLineH9FfpSk(int i19, @NotNull LazyMeasuredItem[] lazyMeasuredItemArr, @NotNull List<GridItemSpan> list, int i20) {
                            tn.p.k(lazyMeasuredItemArr, "items");
                            tn.p.k(list, "spans");
                            return new LazyMeasuredLine(i19, lazyMeasuredItemArr, list, z16, listMo2invoke.size(), lazyLayoutMeasureScope.getLayoutDirection(), i20, iMo300roundToPx0680j_46, null);
                        }
                    });
                    lazyGridState.setPrefetchInfoRetriever$foundation_release(new l<LineIndex, ArrayList<Pair<? extends Integer, ? extends Constraints>>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // sn.l
                        public /* bridge */ /* synthetic */ ArrayList<Pair<? extends Integer, ? extends Constraints>> invoke(LineIndex lineIndex) {
                            return m583invokebKFJvoY(lineIndex.m618unboximpl());
                        }

                        @NotNull
                        /* JADX INFO: renamed from: invoke-bKFJvoY, reason: not valid java name */
                        public final ArrayList<Pair<Integer, Constraints>> m583invokebKFJvoY(int i19) {
                            LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = spanLayoutProvider.getLineConfiguration(i19);
                            int iM556constructorimpl = ItemIndex.m556constructorimpl(lineConfiguration.getFirstItemIndex());
                            ArrayList<Pair<Integer, Constraints>> arrayList = new ArrayList<>(lineConfiguration.getSpans().size());
                            List<GridItemSpan> spans = lineConfiguration.getSpans();
                            LazyMeasuredLineProvider lazyMeasuredLineProvider2 = lazyMeasuredLineProvider;
                            int size = spans.size();
                            int i20 = 0;
                            for (int i21 = 0; i21 < size; i21++) {
                                int iM550getCurrentLineSpanimpl = GridItemSpan.m550getCurrentLineSpanimpl(spans.get(i21).getPackedValue());
                                arrayList.add(h.a(Integer.valueOf(iM556constructorimpl), lazyMeasuredLineProvider2.getChildConstraints$foundation_release().mo2invoke(Integer.valueOf(i20), Integer.valueOf(iM550getCurrentLineSpanimpl))));
                                iM556constructorimpl = ItemIndex.m556constructorimpl(iM556constructorimpl + 1);
                                i20 += iM550getCurrentLineSpanimpl;
                            }
                            return arrayList;
                        }
                    });
                    Snapshot.Companion companion = Snapshot.INSTANCE;
                    LazyGridState lazyGridState2 = lazyGridState;
                    Snapshot snapshotCreateNonObservableSnapshot = companion.createNonObservableSnapshot();
                    try {
                        Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                        try {
                            if (lazyGridState2.getFirstVisibleItemIndex() < itemCount || itemCount <= 0) {
                                int iM598getLineIndexOfItem_Ze7BM2 = spanLayoutProvider.m598getLineIndexOfItem_Ze7BM(lazyGridState2.getFirstVisibleItemIndex());
                                firstVisibleItemScrollOffset = lazyGridState2.getFirstVisibleItemScrollOffset();
                                iM598getLineIndexOfItem_Ze7BM = iM598getLineIndexOfItem_Ze7BM2;
                            } else {
                                iM598getLineIndexOfItem_Ze7BM = spanLayoutProvider.m598getLineIndexOfItem_Ze7BM(itemCount - 1);
                                firstVisibleItemScrollOffset = 0;
                            }
                            r rVar = r.f5635a;
                            snapshotCreateNonObservableSnapshot.dispose();
                            LazyGridMeasureResult lazyGridMeasureResultM586measureLazyGridzIfe3eg = LazyGridMeasureKt.m586measureLazyGridzIfe3eg(itemCount, lazyMeasuredLineProvider, lazyMeasuredItemProvider, iM3781getMaxHeightimpl, listMo2invoke.size(), i16, i17, iM598getLineIndexOfItem_Ze7BM, firstVisibleItemScrollOffset, lazyGridState.getScrollToBeConsumed(), jM3798offsetNN6EwU, z11, vertical2, horizontal2, z10, lazyLayoutMeasureScope, lazyGridItemPlacementAnimator, new q<Integer, Integer, l<? super Placeable.PlacementScope, ? extends r>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @NotNull
                                public final MeasureResult invoke(int i19, int i20, @NotNull l<? super Placeable.PlacementScope, r> lVar) {
                                    tn.p.k(lVar, "placement");
                                    return lazyLayoutMeasureScope.layout(ConstraintsKt.m3796constrainWidthK40F9xA(j10, i19 + i14), ConstraintsKt.m3795constrainHeightK40F9xA(j10, i20 + i13), a.j(), lVar);
                                }

                                @Override // sn.q
                                public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, l<? super Placeable.PlacementScope, ? extends r> lVar) {
                                    return invoke(num.intValue(), num2.intValue(), (l<? super Placeable.PlacementScope, r>) lVar);
                                }
                            });
                            LazyGridState lazyGridState3 = lazyGridState;
                            OverscrollEffect overscrollEffect2 = overscrollEffect;
                            lazyGridState3.applyMeasureResult$foundation_release(lazyGridMeasureResultM586measureLazyGridzIfe3eg);
                            LazyGridKt.refreshOverscrollInfo(overscrollEffect2, lazyGridMeasureResultM586measureLazyGridzIfe3eg);
                            return lazyGridMeasureResultM586measureLazyGridzIfe3eg;
                        } finally {
                            snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                        }
                    } catch (Throwable th2) {
                        snapshotCreateNonObservableSnapshot.dispose();
                        throw th2;
                    }
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        p<LazyLayoutMeasureScope, Constraints, MeasureResult> pVar2 = (p) objRememberedValue;
        composer.endReplaceableGroup();
        return pVar2;
    }
}
