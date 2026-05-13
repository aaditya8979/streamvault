package com.yandex.div.core.view2.divs.gallery;

import ah.e2;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import cn.f0;
import cn.r;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivSize;
import java.util.HashSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;
import zn.n;

/* JADX INFO: compiled from: DivGridLayoutManager.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivGridLayoutManager extends StaggeredGridLayoutManager implements DivGalleryItemHelper {

    @NotNull
    private final BindingContext bindingContext;

    @NotNull
    private final HashSet<View> childrenToRelayout;

    @NotNull
    private final DivGallery div;

    @NotNull
    private final RecyclerView view;

    /* JADX WARN: Illegal instructions before constructor call */
    public DivGridLayoutManager(@NotNull BindingContext bindingContext, @NotNull RecyclerView recyclerView, @NotNull DivGallery divGallery, int i10) {
        int i11;
        Expression<Long> expression = divGallery.f55413h;
        if (expression != null) {
            long jLongValue = expression.evaluate(bindingContext.getExpressionResolver()).longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                i11 = (int) jLongValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + jLongValue + "' to Int");
                }
                i11 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        } else {
            i11 = 1;
        }
        super(i11, i10);
        this.bindingContext = bindingContext;
        this.view = recyclerView;
        this.div = divGallery;
        this.childrenToRelayout = new HashSet<>();
    }

    private final int getCrossSpacing() {
        Expression<Long> expression = getDiv().f55416k;
        return expression != null ? BaseDivViewExtensionsKt.dpToPx(Long.valueOf(expression.evaluate(getBindingContext().getExpressionResolver()).longValue()), getView().getResources().getDisplayMetrics()) : getItemSpacing();
    }

    private final int getItemSpacing() {
        return BaseDivViewExtensionsKt.dpToPx(getDiv().f55425t.evaluate(getBindingContext().getExpressionResolver()), getView().getResources().getDisplayMetrics());
    }

    private final int spacingByOrientation(int i10) {
        return i10 == getOrientation() ? getItemSpacing() : getCrossSpacing();
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

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void calculateItemDecorationsForChild(@NotNull View view, @NotNull Rect rect) {
        DivItemBuilderResult itemDiv;
        super.calculateItemDecorationsForChild(view, rect);
        int i_getPosition = _getPosition(view);
        if (i_getPosition == -1 || (itemDiv = getItemDiv(i_getPosition)) == null) {
            return;
        }
        e2 e2VarB = itemDiv.getDiv().b();
        boolean z10 = e2VarB.getHeight() instanceof DivSize.b;
        boolean z11 = e2VarB.getWidth() instanceof DivSize.b;
        int iSpacingByOrientation = 0;
        boolean z12 = getSpanCount() > 1;
        int iSpacingByOrientation2 = (z10 && z12) ? spacingByOrientation(1) / 2 : 0;
        if (z11 && z12) {
            iSpacingByOrientation = spacingByOrientation(0) / 2;
        }
        rect.set(rect.left - iSpacingByOrientation, rect.top - iSpacingByOrientation2, rect.right - iSpacingByOrientation, rect.bottom - iSpacingByOrientation2);
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
        int[] iArr = new int[n.e(getItemCount(), getSpanCount())];
        findFirstCompletelyVisibleItemPositions(iArr);
        return r.V(iArr);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int firstVisibleItemPosition() {
        int[] iArr = new int[n.e(getItemCount(), getSpanCount())];
        findFirstVisibleItemPositions(iArr);
        return r.V(iArr);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @NotNull
    public BindingContext getBindingContext() {
        return this.bindingContext;
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

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getPaddingBottom() {
        return super.getPaddingBottom() - (spacingByOrientation(1) / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getPaddingEnd() {
        return super.getPaddingEnd() - (getItemSpacing() / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getPaddingLeft() {
        return super.getPaddingLeft() - (spacingByOrientation(0) / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getPaddingRight() {
        return super.getPaddingRight() - (spacingByOrientation(0) / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getPaddingStart() {
        return super.getPaddingStart() - (getItemSpacing() / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getPaddingTop() {
        return super.getPaddingTop() - (spacingByOrientation(1) / 2);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @NotNull
    public RecyclerView getView() {
        return this.view;
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
        int[] iArr = new int[n.e(getItemCount(), getSpanCount())];
        findLastCompletelyVisibleItemPositions(iArr);
        return r.o0(iArr);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int lastVisibleItemPosition() {
        int[] iArr = new int[n.e(getItemCount(), getSpanCount())];
        findLastVisibleItemPositions(iArr);
        return r.o0(iArr);
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
    public void onAttachedToWindow(@NotNull RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        _onAttachedToWindow(recyclerView);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        _onDetachedFromWindow(recyclerView, recycler);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
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
    public DivGridLayoutManager toLayoutManager() {
        return this;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int width() {
        return getWidth();
    }
}
