package androidx.compose.foundation.lazy;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffsetKt;
import bn.r;
import kotlin.Metadata;
import kotlin.collections.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.p;
import sn.q;

/* JADX INFO: compiled from: LazyList.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u008b\u0001\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001f\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0094\u0001\u0010(\u001a\u0014\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0$2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010#\u001a\u00020\"H\u0003ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a\u0018\u0010,\u001a\u00020\u00162\u0006\u0010!\u001a\u00020 2\u0006\u0010+\u001a\u00020*H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "isVertical", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lbn/r;", "content", "LazyList", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lsn/l;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "itemProvider", "ScrollPositionUpdater", "(Landroidx/compose/foundation/lazy/LazyListItemProvider;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;", "beyondBoundsInfo", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "placementAnimator", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "rememberLazyListMeasurePolicy", "(Landroidx/compose/foundation/lazy/LazyListItemProvider;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;Landroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;Landroidx/compose/runtime/Composer;III)Lsn/p;", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "result", "refreshOverscrollInfo", "foundation_release"}, k = 2, mv = {1, 6, 0})
public final class LazyListKt {
    /* JADX WARN: Removed duplicated region for block: B:106:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0130  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyList(@org.jetbrains.annotations.NotNull final androidx.compose.ui.Modifier r35, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.lazy.LazyListState r36, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.layout.PaddingValues r37, final boolean r38, final boolean r39, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.gestures.FlingBehavior r40, final boolean r41, @org.jetbrains.annotations.Nullable androidx.compose.ui.Alignment.Horizontal r42, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Vertical r43, @org.jetbrains.annotations.Nullable androidx.compose.ui.Alignment.Vertical r44, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Horizontal r45, @org.jetbrains.annotations.NotNull final sn.l<? super androidx.compose.foundation.lazy.LazyListScope, bn.r> r46, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r47, final int r48, final int r49, final int r50) {
        /*
            Method dump skipped, instruction units count: 906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListKt.LazyList(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, boolean, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, sn.l, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ExperimentalFoundationApi
    public static final void ScrollPositionUpdater(final LazyListItemProvider lazyListItemProvider, final LazyListState lazyListState, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(3173830);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(lazyListItemProvider) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(lazyListState) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else if (lazyListItemProvider.getItemCount() > 0) {
            lazyListState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyListItemProvider);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, r>() { // from class: androidx.compose.foundation.lazy.LazyListKt.ScrollPositionUpdater.1
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
                LazyListKt.ScrollPositionUpdater(lazyListItemProvider, lazyListState, composer2, i10 | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshOverscrollInfo(OverscrollEffect overscrollEffect, LazyListMeasureResult lazyListMeasureResult) {
        boolean canScrollForward = lazyListMeasureResult.getCanScrollForward();
        LazyMeasuredItem firstVisibleItem = lazyListMeasureResult.getFirstVisibleItem();
        overscrollEffect.setEnabled(canScrollForward || ((firstVisibleItem != null ? firstVisibleItem.getIndex() : 0) != 0 || lazyListMeasureResult.getFirstVisibleItemScrollOffset() != 0));
    }

    @Composable
    @ExperimentalFoundationApi
    private static final p<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyListMeasurePolicy(final LazyListItemProvider lazyListItemProvider, final LazyListState lazyListState, final LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, final OverscrollEffect overscrollEffect, final PaddingValues paddingValues, final boolean z10, final boolean z11, Alignment.Horizontal horizontal, Alignment.Vertical vertical, Arrangement.Horizontal horizontal2, Arrangement.Vertical vertical2, final LazyListItemPlacementAnimator lazyListItemPlacementAnimator, Composer composer, int i10, int i11, int i12) {
        composer.startReplaceableGroup(-1404987696);
        final Alignment.Horizontal horizontal3 = (i12 & 128) != 0 ? null : horizontal;
        final Alignment.Vertical vertical3 = (i12 & 256) != 0 ? null : vertical;
        final Arrangement.Horizontal horizontal4 = (i12 & 512) != 0 ? null : horizontal2;
        final Arrangement.Vertical vertical4 = (i12 & 1024) != 0 ? null : vertical2;
        Object[] objArr = {lazyListState, lazyListBeyondBoundsInfo, overscrollEffect, paddingValues, Boolean.valueOf(z10), Boolean.valueOf(z11), horizontal3, vertical3, horizontal4, vertical4, lazyListItemPlacementAnimator};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i13 = 0; i13 < 11; i13++) {
            zChanged |= composer.changed(objArr[i13]);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new p<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ LazyListMeasureResult mo2invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                    return m526invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                }

                @NotNull
                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyListMeasureResult m526invoke0kLqBqw(@NotNull final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j10) {
                    float spacing;
                    long jIntOffset;
                    tn.p.k(lazyLayoutMeasureScope, "$this$null");
                    CheckScrollableContainerConstraintsKt.m179checkScrollableContainerConstraintsK40F9xA(j10, z11 ? Orientation.Vertical : Orientation.Horizontal);
                    int iMo300roundToPx0680j_4 = z11 ? lazyLayoutMeasureScope.mo300roundToPx0680j_4(paddingValues.mo392calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.mo300roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    int iMo300roundToPx0680j_42 = z11 ? lazyLayoutMeasureScope.mo300roundToPx0680j_4(paddingValues.mo393calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.mo300roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    int iMo300roundToPx0680j_43 = lazyLayoutMeasureScope.mo300roundToPx0680j_4(paddingValues.getTop());
                    int iMo300roundToPx0680j_44 = lazyLayoutMeasureScope.mo300roundToPx0680j_4(paddingValues.getBottom());
                    final int i14 = iMo300roundToPx0680j_43 + iMo300roundToPx0680j_44;
                    final int i15 = iMo300roundToPx0680j_4 + iMo300roundToPx0680j_42;
                    boolean z12 = z11;
                    int i16 = z12 ? i14 : i15;
                    int i17 = (!z12 || z10) ? (z12 && z10) ? iMo300roundToPx0680j_44 : (z12 || z10) ? iMo300roundToPx0680j_42 : iMo300roundToPx0680j_4 : iMo300roundToPx0680j_43;
                    final int i18 = i16 - i17;
                    long jM3798offsetNN6EwU = ConstraintsKt.m3798offsetNN6EwU(j10, -i15, -i14);
                    lazyListState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyListItemProvider);
                    lazyListState.setDensity$foundation_release(lazyLayoutMeasureScope);
                    lazyListItemProvider.getItemScope().m517setMaxWidth0680j_4(lazyLayoutMeasureScope.mo303toDpu2uoSUM(Constraints.m3782getMaxWidthimpl(jM3798offsetNN6EwU)));
                    lazyListItemProvider.getItemScope().m516setMaxHeight0680j_4(lazyLayoutMeasureScope.mo303toDpu2uoSUM(Constraints.m3781getMaxHeightimpl(jM3798offsetNN6EwU)));
                    if (z11) {
                        Arrangement.Vertical vertical5 = vertical4;
                        if (vertical5 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        spacing = vertical5.getSpacing();
                    } else {
                        Arrangement.Horizontal horizontal5 = horizontal4;
                        if (horizontal5 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        spacing = horizontal5.getSpacing();
                    }
                    final int iMo300roundToPx0680j_45 = lazyLayoutMeasureScope.mo300roundToPx0680j_4(spacing);
                    final int itemCount = lazyListItemProvider.getItemCount();
                    int iM3781getMaxHeightimpl = z11 ? Constraints.m3781getMaxHeightimpl(j10) - i14 : Constraints.m3782getMaxWidthimpl(j10) - i15;
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
                    final boolean z14 = z11;
                    LazyListItemProvider lazyListItemProvider2 = lazyListItemProvider;
                    final Alignment.Horizontal horizontal6 = horizontal3;
                    final Alignment.Vertical vertical6 = vertical3;
                    final boolean z15 = z10;
                    final LazyListItemPlacementAnimator lazyListItemPlacementAnimator2 = lazyListItemPlacementAnimator;
                    final int i19 = i17;
                    LazyMeasuredItemProvider lazyMeasuredItemProvider = new LazyMeasuredItemProvider(jM3798offsetNN6EwU, z14, lazyListItemProvider2, lazyLayoutMeasureScope, new MeasuredItemFactory() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1
                        @Override // androidx.compose.foundation.lazy.MeasuredItemFactory
                        @NotNull
                        /* JADX INFO: renamed from: createItem-HK0c1C0, reason: not valid java name */
                        public final LazyMeasuredItem mo527createItemHK0c1C0(int i20, @NotNull Object obj, @NotNull Placeable[] placeableArr) {
                            tn.p.k(obj, "key");
                            tn.p.k(placeableArr, "placeables");
                            return new LazyMeasuredItem(i20, placeableArr, z14, horizontal6, vertical6, lazyLayoutMeasureScope.getLayoutDirection(), z15, i19, i18, lazyListItemPlacementAnimator2, i20 == itemCount + (-1) ? 0 : iMo300roundToPx0680j_45, j11, obj, null);
                        }
                    }, null);
                    lazyListState.m540setPremeasureConstraintsBRTryo0$foundation_release(lazyMeasuredItemProvider.getChildConstraints());
                    Snapshot.Companion companion = Snapshot.INSTANCE;
                    LazyListState lazyListState2 = lazyListState;
                    Snapshot snapshotCreateNonObservableSnapshot = companion.createNonObservableSnapshot();
                    try {
                        Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                        try {
                            int iM500constructorimpl = DataIndex.m500constructorimpl(lazyListState2.getFirstVisibleItemIndex());
                            int firstVisibleItemScrollOffset = lazyListState2.getFirstVisibleItemScrollOffset();
                            r rVar = r.f5635a;
                            snapshotCreateNonObservableSnapshot.dispose();
                            LazyListMeasureResult lazyListMeasureResultM530measureLazyList7Xnphek = LazyListMeasureKt.m530measureLazyList7Xnphek(itemCount, lazyMeasuredItemProvider, iM3781getMaxHeightimpl, i17, i18, iM500constructorimpl, firstVisibleItemScrollOffset, lazyListState.getScrollToBeConsumed(), jM3798offsetNN6EwU, z11, lazyListItemProvider.getHeaderIndexes(), vertical4, horizontal4, z10, lazyLayoutMeasureScope, lazyListItemPlacementAnimator, lazyListBeyondBoundsInfo, new q<Integer, Integer, l<? super Placeable.PlacementScope, ? extends r>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @NotNull
                                public final MeasureResult invoke(int i20, int i21, @NotNull l<? super Placeable.PlacementScope, r> lVar) {
                                    tn.p.k(lVar, "placement");
                                    return lazyLayoutMeasureScope.layout(ConstraintsKt.m3796constrainWidthK40F9xA(j10, i20 + i15), ConstraintsKt.m3795constrainHeightK40F9xA(j10, i21 + i14), a.j(), lVar);
                                }

                                @Override // sn.q
                                public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, l<? super Placeable.PlacementScope, ? extends r> lVar) {
                                    return invoke(num.intValue(), num2.intValue(), (l<? super Placeable.PlacementScope, r>) lVar);
                                }
                            });
                            LazyListState lazyListState3 = lazyListState;
                            OverscrollEffect overscrollEffect2 = overscrollEffect;
                            lazyListState3.applyMeasureResult$foundation_release(lazyListMeasureResultM530measureLazyList7Xnphek);
                            LazyListKt.refreshOverscrollInfo(overscrollEffect2, lazyListMeasureResultM530measureLazyList7Xnphek);
                            return lazyListMeasureResultM530measureLazyList7Xnphek;
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
        p<LazyLayoutMeasureScope, Constraints, MeasureResult> pVar = (p) objRememberedValue;
        composer.endReplaceableGroup();
        return pVar;
    }
}
