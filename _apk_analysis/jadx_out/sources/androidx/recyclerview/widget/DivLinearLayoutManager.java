package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cn.f0;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.gallery.DivGalleryAdapter;
import com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper;
import com.yandex.div.core.view2.divs.gallery.ScrollPosition;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div2.DivGallery;
import java.util.HashSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: DivLinearLayoutManager.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivLinearLayoutManager extends LinearLayoutManager implements DivGalleryItemHelper {

    @NotNull
    private final BindingContext bindingContext;

    @NotNull
    private final HashSet<View> childrenToRelayout;

    @NotNull
    private final DivGallery div;

    @NotNull
    private final RecyclerView view;

    /* JADX INFO: compiled from: DivLinearLayoutManager.kt */
    public static final class DivRecyclerViewLayoutParams extends RecyclerView.LayoutParams {
        private int maxHeight;
        private int maxWidth;

        public DivRecyclerViewLayoutParams(int i10, int i11) {
            super(i10, i11);
            this.maxHeight = Integer.MAX_VALUE;
            this.maxWidth = Integer.MAX_VALUE;
        }

        public DivRecyclerViewLayoutParams(@Nullable Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.maxHeight = Integer.MAX_VALUE;
            this.maxWidth = Integer.MAX_VALUE;
        }

        public DivRecyclerViewLayoutParams(@Nullable ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.maxHeight = Integer.MAX_VALUE;
            this.maxWidth = Integer.MAX_VALUE;
        }

        public DivRecyclerViewLayoutParams(@Nullable ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.maxHeight = Integer.MAX_VALUE;
            this.maxWidth = Integer.MAX_VALUE;
        }

        public DivRecyclerViewLayoutParams(@NotNull DivRecyclerViewLayoutParams divRecyclerViewLayoutParams) {
            super((RecyclerView.LayoutParams) divRecyclerViewLayoutParams);
            this.maxHeight = Integer.MAX_VALUE;
            this.maxWidth = Integer.MAX_VALUE;
            this.maxHeight = divRecyclerViewLayoutParams.maxHeight;
            this.maxWidth = divRecyclerViewLayoutParams.maxWidth;
        }

        public DivRecyclerViewLayoutParams(@Nullable RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
            this.maxHeight = Integer.MAX_VALUE;
            this.maxWidth = Integer.MAX_VALUE;
        }

        public DivRecyclerViewLayoutParams(@NotNull DivLayoutParams divLayoutParams) {
            super((ViewGroup.MarginLayoutParams) divLayoutParams);
            this.maxHeight = Integer.MAX_VALUE;
            this.maxWidth = Integer.MAX_VALUE;
            this.maxHeight = divLayoutParams.getMaxHeight();
            this.maxWidth = divLayoutParams.getMaxWidth();
        }

        public final int getMaxHeight() {
            return this.maxHeight;
        }

        public final int getMaxWidth() {
            return this.maxWidth;
        }

        public final void setMaxHeight(int i10) {
            this.maxHeight = i10;
        }

        public final void setMaxWidth(int i10) {
            this.maxWidth = i10;
        }
    }

    public DivLinearLayoutManager(@NotNull BindingContext bindingContext, @NotNull RecyclerView recyclerView, @NotNull DivGallery divGallery, int i10) {
        super(recyclerView.getContext(), i10, false);
        this.bindingContext = bindingContext;
        this.view = recyclerView;
        this.div = divGallery;
        this.childrenToRelayout = new HashSet<>();
    }

    public /* synthetic */ DivLinearLayoutManager(BindingContext bindingContext, RecyclerView recyclerView, DivGallery divGallery, int i10, int i11, i iVar) {
        this(bindingContext, recyclerView, divGallery, (i11 & 8) != 0 ? 0 : i10);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public /* bridge */ /* synthetic */ void _detachView(@NotNull View view) {
        super._detachView(view);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public /* bridge */ /* synthetic */ void _detachViewAt(int i10) {
        super._detachViewAt(i10);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @Nullable
    public View _getChildAt(int i10) {
        return getChildAt(i10);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int _getPosition(@NotNull View view) {
        return getPosition(view);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public /* bridge */ /* synthetic */ void _layoutDecorated(@NotNull View view, int i10, int i11, int i12, int i13) {
        super._layoutDecorated(view, i10, i11, i12, i13);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public /* bridge */ /* synthetic */ void _layoutDecoratedWithMargins(@NotNull View view, int i10, int i11, int i12, int i13, boolean z10) {
        super._layoutDecoratedWithMargins(view, i10, i11, i12, i13, z10);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public /* bridge */ /* synthetic */ void _onAttachedToWindow(@NotNull RecyclerView recyclerView) {
        super._onAttachedToWindow(recyclerView);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public /* bridge */ /* synthetic */ void _onDetachedFromWindow(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.Recycler recycler) {
        super._onDetachedFromWindow(recyclerView, recycler);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public /* bridge */ /* synthetic */ void _onLayoutCompleted(@Nullable RecyclerView.State state) {
        super._onLayoutCompleted(state);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public /* bridge */ /* synthetic */ void _removeAndRecycleAllViews(@NotNull RecyclerView.Recycler recycler) {
        super._removeAndRecycleAllViews(recycler);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public /* bridge */ /* synthetic */ void _removeView(@NotNull View view) {
        super._removeView(view);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public /* bridge */ /* synthetic */ void _removeViewAt(int i10) {
        super._removeViewAt(i10);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public /* bridge */ /* synthetic */ int calcScrollOffset(@NotNull View view) {
        return super.calcScrollOffset(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(@Nullable RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof DivRecyclerViewLayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void detachView(@NotNull View view) {
        super.detachView(view);
        _detachView(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void detachViewAt(int i10) {
        super.detachViewAt(i10);
        _detachViewAt(i10);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int firstCompletelyVisibleItemPosition() {
        return findFirstCompletelyVisibleItemPosition();
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int firstVisibleItemPosition() {
        return findFirstVisibleItemPosition();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    @NotNull
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new DivRecyclerViewLayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @NotNull
    public RecyclerView.LayoutParams generateLayoutParams(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        return new DivRecyclerViewLayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @NotNull
    public RecyclerView.LayoutParams generateLayoutParams(@Nullable ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof DivRecyclerViewLayoutParams ? new DivRecyclerViewLayoutParams((DivRecyclerViewLayoutParams) layoutParams) : layoutParams instanceof RecyclerView.LayoutParams ? new DivRecyclerViewLayoutParams((RecyclerView.LayoutParams) layoutParams) : layoutParams instanceof DivLayoutParams ? new DivRecyclerViewLayoutParams((DivLayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new DivRecyclerViewLayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new DivRecyclerViewLayoutParams(layoutParams);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @NotNull
    public BindingContext getBindingContext() {
        return this.bindingContext;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public /* bridge */ /* synthetic */ int getChildMeasureSpec(int i10, int i11, int i12, int i13, int i14, boolean z10) {
        return super.getChildMeasureSpec(i10, i11, i12, i13, i14, z10);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @NotNull
    public HashSet<View> getChildrenToRelayout() {
        return this.childrenToRelayout;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @NotNull
    public DivGallery getDiv() {
        return this.div;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @Nullable
    public DivItemBuilderResult getItemDiv(int i10) {
        RecyclerView.Adapter adapter = getView().getAdapter();
        p.i(adapter, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.gallery.DivGalleryAdapter");
        return (DivItemBuilderResult) f0.w0(((DivGalleryAdapter) adapter).getVisibleItems(), i10);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int getLayoutManagerOrientation() {
        return getOrientation();
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @NotNull
    public RecyclerView getView() {
        return this.view;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public /* bridge */ /* synthetic */ void instantScroll(int i10, @NotNull ScrollPosition scrollPosition, int i11) {
        super.instantScroll(i10, scrollPosition, i11);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public void instantScrollToPosition(int i10, @NotNull ScrollPosition scrollPosition) {
        DivGalleryItemHelper.instantScroll$default(this, i10, scrollPosition, 0, 4, null);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public void instantScrollToPositionWithOffset(int i10, int i11, @NotNull ScrollPosition scrollPosition) {
        instantScroll(i10, scrollPosition, i11);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int lastCompletelyVisibleItemPosition() {
        return findLastCompletelyVisibleItemPosition();
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int lastVisibleItemPosition() {
        return findLastVisibleItemPosition();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void layoutDecorated(@NotNull View view, int i10, int i11, int i12, int i13) {
        super.layoutDecorated(view, i10, i11, i12, i13);
        _layoutDecorated(view, i10, i11, i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void layoutDecoratedWithMargins(@NotNull View view, int i10, int i11, int i12, int i13) {
        DivGalleryItemHelper._layoutDecoratedWithMargins$default(this, view, i10, i11, i12, i13, false, 32, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChild(@NotNull View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.i(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.DivLinearLayoutManager.DivRecyclerViewLayoutParams");
        DivRecyclerViewLayoutParams divRecyclerViewLayoutParams = (DivRecyclerViewLayoutParams) layoutParams;
        Rect itemDecorInsetsForChild = getView().getItemDecorInsetsForChild(view);
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + i10 + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right, ((ViewGroup.MarginLayoutParams) divRecyclerViewLayoutParams).width, divRecyclerViewLayoutParams.getMaxWidth(), canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + i11 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom, ((ViewGroup.MarginLayoutParams) divRecyclerViewLayoutParams).height, divRecyclerViewLayoutParams.getMaxHeight(), canScrollVertically());
        if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, divRecyclerViewLayoutParams)) {
            view.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChildWithMargins(@NotNull View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.i(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.DivLinearLayoutManager.DivRecyclerViewLayoutParams");
        DivRecyclerViewLayoutParams divRecyclerViewLayoutParams = (DivRecyclerViewLayoutParams) layoutParams;
        Rect itemDecorInsetsForChild = getView().getItemDecorInsetsForChild(view);
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) divRecyclerViewLayoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) divRecyclerViewLayoutParams).rightMargin + i10 + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right, ((ViewGroup.MarginLayoutParams) divRecyclerViewLayoutParams).width, divRecyclerViewLayoutParams.getMaxWidth(), canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) divRecyclerViewLayoutParams).topMargin + ((ViewGroup.MarginLayoutParams) divRecyclerViewLayoutParams).bottomMargin + i11 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom, ((ViewGroup.MarginLayoutParams) divRecyclerViewLayoutParams).height, divRecyclerViewLayoutParams.getMaxHeight(), canScrollVertically());
        if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, divRecyclerViewLayoutParams)) {
            view.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(@NotNull RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        _onAttachedToWindow(recyclerView);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        _onDetachedFromWindow(recyclerView, recycler);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(@Nullable RecyclerView.State state) {
        _onLayoutCompleted(state);
        super.onLayoutCompleted(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void removeAndRecycleAllViews(@NotNull RecyclerView.Recycler recycler) {
        _removeAndRecycleAllViews(recycler);
        super.removeAndRecycleAllViews(recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void removeView(@NotNull View view) {
        super.removeView(view);
        _removeView(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void removeViewAt(int i10) {
        super.removeViewAt(i10);
        _removeViewAt(i10);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public void superLayoutDecoratedWithMargins(@NotNull View view, int i10, int i11, int i12, int i13) {
        super.layoutDecoratedWithMargins(view, i10, i11, i12, i13);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @NotNull
    public DivLinearLayoutManager toLayoutManager() {
        return this;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public /* bridge */ /* synthetic */ void trackVisibilityAction(@NotNull View view, boolean z10) {
        super.trackVisibilityAction(view, z10);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int width() {
        return getWidth();
    }
}
