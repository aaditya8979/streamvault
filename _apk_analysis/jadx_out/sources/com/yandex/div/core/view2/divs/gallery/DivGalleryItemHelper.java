package com.yandex.div.core.view2.divs.gallery;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div2.Div;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivGallery;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zn.n;

/* JADX INFO: compiled from: DivGalleryItemHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface DivGalleryItemHelper {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: DivGalleryItemHelper.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: compiled from: DivGalleryItemHelper.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;
            public static final /* synthetic */ int[] $EnumSwitchMapping$2;

            static {
                int[] iArr = new int[DivGallery.CrossContentAlignment.values().length];
                try {
                    iArr[DivGallery.CrossContentAlignment.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DivGallery.CrossContentAlignment.CENTER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DivGallery.CrossContentAlignment.END.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[DivAlignmentHorizontal.values().length];
                try {
                    iArr2[DivAlignmentHorizontal.LEFT.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[DivAlignmentHorizontal.CENTER.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[DivAlignmentHorizontal.RIGHT.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[DivAlignmentHorizontal.START.ordinal()] = 4;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[DivAlignmentHorizontal.END.ordinal()] = 5;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$1 = iArr2;
                int[] iArr3 = new int[DivAlignmentVertical.values().length];
                try {
                    iArr3[DivAlignmentVertical.TOP.ordinal()] = 1;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr3[DivAlignmentVertical.BASELINE.ordinal()] = 2;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr3[DivAlignmentVertical.CENTER.ordinal()] = 3;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr3[DivAlignmentVertical.BOTTOM.ordinal()] = 4;
                } catch (NoSuchFieldError unused12) {
                }
                $EnumSwitchMapping$2 = iArr3;
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DivGallery.CrossContentAlignment asCrossContentAlignment(DivAlignmentHorizontal divAlignmentHorizontal) {
            int i10 = WhenMappings.$EnumSwitchMapping$1[divAlignmentHorizontal.ordinal()];
            if (i10 == 1) {
                return DivGallery.CrossContentAlignment.START;
            }
            if (i10 == 2) {
                return DivGallery.CrossContentAlignment.CENTER;
            }
            if (i10 == 3) {
                return DivGallery.CrossContentAlignment.END;
            }
            if (i10 == 4) {
                return DivGallery.CrossContentAlignment.START;
            }
            if (i10 == 5) {
                return DivGallery.CrossContentAlignment.END;
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DivGallery.CrossContentAlignment asCrossContentAlignment(DivAlignmentVertical divAlignmentVertical) {
            int i10 = WhenMappings.$EnumSwitchMapping$2[divAlignmentVertical.ordinal()];
            if (i10 == 1 || i10 == 2) {
                return DivGallery.CrossContentAlignment.START;
            }
            if (i10 == 3) {
                return DivGallery.CrossContentAlignment.CENTER;
            }
            if (i10 == 4) {
                return DivGallery.CrossContentAlignment.END;
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int calculateOffset(int i10, int i11, DivGallery.CrossContentAlignment crossContentAlignment) {
            int i12 = i10 - i11;
            int i13 = WhenMappings.$EnumSwitchMapping$0[crossContentAlignment.ordinal()];
            if (i13 == 1) {
                return 0;
            }
            if (i13 == 2) {
                return i12 / 2;
            }
            if (i13 == 3) {
                return i12;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: compiled from: DivGalleryItemHelper.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScrollPosition.values().length];
            try {
                iArr[ScrollPosition.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScrollPosition.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static /* synthetic */ void _layoutDecoratedWithMargins$default(DivGalleryItemHelper divGalleryItemHelper, View view, int i10, int i11, int i12, int i13, boolean z10, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: _layoutDecoratedWithMargins");
        }
        if ((i14 & 32) != 0) {
            z10 = false;
        }
        divGalleryItemHelper._layoutDecoratedWithMargins(view, i10, i11, i12, i13, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    default int getScrollOffset(View view) {
        int marginStart;
        int paddingStart;
        if (isHorizontal()) {
            int width = ViewsKt.isLayoutRtl(view) ? getView().getWidth() - view.getRight() : view.getLeft();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            marginStart = width - (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
            paddingStart = getView().getPaddingStart();
        } else {
            int top2 = view.getTop();
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            marginStart = top2 - (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
            paddingStart = getView().getPaddingTop();
        }
        return marginStart - paddingStart;
    }

    static /* synthetic */ void instantScroll$default(DivGalleryItemHelper divGalleryItemHelper, int i10, ScrollPosition scrollPosition, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: instantScroll");
        }
        if ((i12 & 2) != 0) {
            scrollPosition = ScrollPosition.DEFAULT;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        divGalleryItemHelper.instantScroll(i10, scrollPosition, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    default boolean isHorizontal() {
        return getLayoutManagerOrientation() == 0;
    }

    static /* synthetic */ void trackVisibilityAction$default(DivGalleryItemHelper divGalleryItemHelper, View view, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackVisibilityAction");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        divGalleryItemHelper.trackVisibilityAction(view, z10);
    }

    default void _detachView(@NotNull View view) {
        trackVisibilityAction(view, true);
    }

    default void _detachViewAt(int i10) {
        View view_getChildAt = _getChildAt(i10);
        if (view_getChildAt == null) {
            return;
        }
        trackVisibilityAction(view_getChildAt, true);
    }

    @Nullable
    View _getChildAt(int i10);

    int _getPosition(@NotNull View view);

    default void _layoutDecorated(@NotNull View view, int i10, int i11, int i12, int i13) {
        trackVisibilityAction$default(this, view, false, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    default void _layoutDecoratedWithMargins(@org.jetbrains.annotations.NotNull android.view.View r14, int r15, int r16, int r17, int r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper._layoutDecoratedWithMargins(android.view.View, int, int, int, int, boolean):void");
    }

    default void _onAttachedToWindow(@NotNull RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            trackVisibilityAction$default(this, recyclerView.getChildAt(i10), false, 2, null);
        }
    }

    default void _onDetachedFromWindow(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.Recycler recycler) {
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            trackVisibilityAction(recyclerView.getChildAt(i10), true);
        }
    }

    default void _onLayoutCompleted(@Nullable RecyclerView.State state) {
        for (View view : getChildrenToRelayout()) {
            _layoutDecoratedWithMargins(view, view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), true);
        }
        getChildrenToRelayout().clear();
    }

    default void _removeAndRecycleAllViews(@NotNull RecyclerView.Recycler recycler) {
        RecyclerView view = getView();
        int childCount = view.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            trackVisibilityAction(view.getChildAt(i10), true);
        }
    }

    default void _removeView(@NotNull View view) {
        trackVisibilityAction(view, true);
    }

    default void _removeViewAt(int i10) {
        View view_getChildAt = _getChildAt(i10);
        if (view_getChildAt == null) {
            return;
        }
        trackVisibilityAction(view_getChildAt, true);
    }

    default int calcScrollOffset(@NotNull View view) {
        return getScrollOffset(view);
    }

    int firstCompletelyVisibleItemPosition();

    int firstVisibleItemPosition();

    @NotNull
    BindingContext getBindingContext();

    default int getChildMeasureSpec(int i10, int i11, int i12, int i13, int i14, boolean z10) {
        int i15 = i10 - i12;
        boolean z11 = false;
        int iE = n.e(i15, 0);
        if (i13 >= 0 && i13 <= Integer.MAX_VALUE) {
            z11 = true;
        }
        return z11 ? com.yandex.div.core.widget.ViewsKt.makeExactSpec(i13) : i13 == -1 ? (z10 && i11 == 0) ? com.yandex.div.core.widget.ViewsKt.makeUnspecifiedSpec() : View.MeasureSpec.makeMeasureSpec(iE, i11) : i13 == -2 ? i14 == Integer.MAX_VALUE ? com.yandex.div.core.widget.ViewsKt.makeUnspecifiedSpec() : com.yandex.div.core.widget.ViewsKt.makeAtMostSpec(i14) : i13 == -3 ? (i11 == Integer.MIN_VALUE || i11 == 1073741824) ? com.yandex.div.core.widget.ViewsKt.makeAtMostSpec(Math.min(iE, i14)) : i14 == Integer.MAX_VALUE ? com.yandex.div.core.widget.ViewsKt.makeUnspecifiedSpec() : com.yandex.div.core.widget.ViewsKt.makeAtMostSpec(i14) : com.yandex.div.core.widget.ViewsKt.makeUnspecifiedSpec();
    }

    @NotNull
    Set<View> getChildrenToRelayout();

    @NotNull
    DivGallery getDiv();

    @Nullable
    DivItemBuilderResult getItemDiv(int i10);

    int getLayoutManagerOrientation();

    @NotNull
    RecyclerView getView();

    default void instantScroll(final int i10, @NotNull final ScrollPosition scrollPosition, final int i11) {
        RecyclerView view = getView();
        if (!ViewsKt.isActuallyLaidOut(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper$instantScroll$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view2, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                    view2.removeOnLayoutChangeListener(this);
                    if (i10 == 0) {
                        int i20 = (this.isHorizontal() && ViewsKt.isLayoutRtl(this.getView())) ? i11 : -i11;
                        this.getView().scrollBy(i20, i20);
                        return;
                    }
                    this.getView().scrollBy(-this.getView().getScrollX(), -this.getView().getScrollY());
                    RecyclerView.LayoutManager layoutManager = this.getView().getLayoutManager();
                    View viewFindViewByPosition = layoutManager != null ? layoutManager.findViewByPosition(i10) : null;
                    while (viewFindViewByPosition == null && (this.getView().canScrollVertically(1) || this.getView().canScrollHorizontally(1))) {
                        RecyclerView.LayoutManager layoutManager2 = this.getView().getLayoutManager();
                        if (layoutManager2 != null) {
                            layoutManager2.requestLayout();
                        }
                        RecyclerView.LayoutManager layoutManager3 = this.getView().getLayoutManager();
                        viewFindViewByPosition = layoutManager3 != null ? layoutManager3.findViewByPosition(i10) : null;
                        if (viewFindViewByPosition != null) {
                            break;
                        } else {
                            this.getView().scrollBy(this.getView().getWidth(), this.getView().getHeight());
                        }
                    }
                    if (viewFindViewByPosition != null) {
                        int i21 = DivGalleryItemHelper.WhenMappings.$EnumSwitchMapping$0[scrollPosition.ordinal()];
                        if (i21 != 1) {
                            if (i21 != 2) {
                                return;
                            }
                            int scrollOffset = this.getScrollOffset(viewFindViewByPosition) - i11;
                            if (ViewsKt.isLayoutRtl(this.getView())) {
                                scrollOffset = -scrollOffset;
                            }
                            this.getView().scrollBy(scrollOffset, scrollOffset);
                            return;
                        }
                        int[] iArr = {0, 0};
                        int[] iArr2 = {0, 0};
                        this.getView().getLocationOnScreen(iArr2);
                        viewFindViewByPosition.getLocationOnScreen(iArr);
                        this.getView().scrollBy(((viewFindViewByPosition.getWidth() - this.getView().getWidth()) / 2) + (iArr[0] - iArr2[0]), ((viewFindViewByPosition.getHeight() - this.getView().getHeight()) / 2) + (iArr[1] - iArr2[1]));
                    }
                }
            });
            return;
        }
        if (i10 == 0) {
            if (!isHorizontal() || !ViewsKt.isLayoutRtl(getView())) {
                i11 = -i11;
            }
            getView().scrollBy(i11, i11);
            return;
        }
        getView().scrollBy(-getView().getScrollX(), -getView().getScrollY());
        RecyclerView.LayoutManager layoutManager = getView().getLayoutManager();
        View viewFindViewByPosition = layoutManager != null ? layoutManager.findViewByPosition(i10) : null;
        while (viewFindViewByPosition == null && (getView().canScrollVertically(1) || getView().canScrollHorizontally(1))) {
            RecyclerView.LayoutManager layoutManager2 = getView().getLayoutManager();
            if (layoutManager2 != null) {
                layoutManager2.requestLayout();
            }
            RecyclerView.LayoutManager layoutManager3 = getView().getLayoutManager();
            viewFindViewByPosition = layoutManager3 != null ? layoutManager3.findViewByPosition(i10) : null;
            if (viewFindViewByPosition != null) {
                break;
            } else {
                getView().scrollBy(getView().getWidth(), getView().getHeight());
            }
        }
        if (viewFindViewByPosition != null) {
            int i12 = WhenMappings.$EnumSwitchMapping$0[scrollPosition.ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    return;
                }
                int scrollOffset = getScrollOffset(viewFindViewByPosition) - i11;
                if (ViewsKt.isLayoutRtl(getView())) {
                    scrollOffset = -scrollOffset;
                }
                getView().scrollBy(scrollOffset, scrollOffset);
                return;
            }
            int[] iArr = {0, 0};
            int[] iArr2 = {0, 0};
            getView().getLocationOnScreen(iArr2);
            viewFindViewByPosition.getLocationOnScreen(iArr);
            getView().scrollBy(((viewFindViewByPosition.getWidth() - getView().getWidth()) / 2) + (iArr[0] - iArr2[0]), ((viewFindViewByPosition.getHeight() - getView().getHeight()) / 2) + (iArr[1] - iArr2[1]));
        }
    }

    void instantScrollToPosition(int i10, @NotNull ScrollPosition scrollPosition);

    void instantScrollToPositionWithOffset(int i10, int i11, @NotNull ScrollPosition scrollPosition);

    int lastCompletelyVisibleItemPosition();

    int lastVisibleItemPosition();

    void superLayoutDecoratedWithMargins(@NotNull View view, int i10, int i11, int i12, int i13);

    @NotNull
    RecyclerView.LayoutManager toLayoutManager();

    /* JADX WARN: Multi-variable type inference failed */
    default void trackVisibilityAction(@NotNull View view, boolean z10) {
        View view2;
        BindingContext bindingContext;
        int i_getPosition = _getPosition(view);
        if (i_getPosition == -1) {
            return;
        }
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null || (view2 = (View) SequencesKt___SequencesKt.D(ViewGroupKt.getChildren(viewGroup))) == 0) {
            return;
        }
        Div2View divView = getBindingContext().getDivView();
        if (!z10) {
            DivItemBuilderResult itemDiv = getItemDiv(i_getPosition);
            if (itemDiv == null) {
                return;
            }
            divView.getDiv2Component$div_release().getVisibilityActionTracker().startTrackingViewsHierarchy(getBindingContext().getFor(itemDiv.getExpressionResolver()), view2, itemDiv.getDiv());
            divView.bindViewToDiv$div_release(view2, itemDiv.getDiv());
            return;
        }
        Div divTakeBindingDiv$div_release = divView.takeBindingDiv$div_release(view2);
        if (divTakeBindingDiv$div_release == null) {
            return;
        }
        DivHolderView divHolderView = view2 instanceof DivHolderView ? (DivHolderView) view2 : null;
        if (divHolderView == null || (bindingContext = divHolderView.getBindingContext()) == null) {
            return;
        }
        divView.getDiv2Component$div_release().getVisibilityActionTracker().cancelTrackingViewsHierarchy(bindingContext, view2, divTakeBindingDiv$div_release);
        divView.unbindViewFromDiv$div_release(view2);
    }

    int width();
}
