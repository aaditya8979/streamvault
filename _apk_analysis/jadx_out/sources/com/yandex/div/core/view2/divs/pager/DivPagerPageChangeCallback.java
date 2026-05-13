package com.yandex.div.core.view2.divs.pager;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div2.Div;
import com.yandex.div2.DivPager;
import java.util.Iterator;
import java.util.List;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DivPagerPageChangeCallback.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DivPagerPageChangeCallback extends ViewPager2.OnPageChangeCallback {

    @NotNull
    private final BindingContext bindingContext;

    @NotNull
    private final DivPager divPager;

    @NotNull
    private final Div2View divView;

    @NotNull
    private final List<DivItemBuilderResult> items;
    private final int minimumSignificantDx;

    @NotNull
    private final DivPagerView pagerView;
    private int prevPosition = -1;

    @NotNull
    private final RecyclerView recyclerView;
    private int totalDelta;

    public DivPagerPageChangeCallback(@NotNull DivPager divPager, @NotNull List<DivItemBuilderResult> list, @NotNull BindingContext bindingContext, @NotNull RecyclerView recyclerView, @NotNull DivPagerView divPagerView) {
        this.divPager = divPager;
        this.items = list;
        this.bindingContext = bindingContext;
        this.recyclerView = recyclerView;
        this.pagerView = divPagerView;
        Div2View divView = bindingContext.getDivView();
        this.divView = divView;
        this.minimumSignificantDx = divView.getConfig().getLogCardScrollSignificantThreshold();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackVisibleChildren() {
        View next;
        int childAdapterPosition;
        Iterator<View> it = ViewGroupKt.getChildren(this.recyclerView).iterator();
        while (it.hasNext() && (childAdapterPosition = this.recyclerView.getChildAdapterPosition((next = it.next()))) != -1) {
            DivItemBuilderResult divItemBuilderResult = this.items.get(childAdapterPosition);
            this.divView.getDiv2Component$div_release().getVisibilityActionTracker().startTrackingViewsHierarchy(this.bindingContext.getFor(divItemBuilderResult.getExpressionResolver()), next, divItemBuilderResult.getDiv());
        }
    }

    private final void trackVisibleViews() {
        if (SequencesKt___SequencesKt.x(ViewGroupKt.getChildren(this.recyclerView)) > 0) {
            trackVisibleChildren();
            return;
        }
        RecyclerView recyclerView = this.recyclerView;
        if (!ViewsKt.isActuallyLaidOut(recyclerView) || recyclerView.isLayoutRequested()) {
            recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerPageChangeCallback$trackVisibleViews$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    view.removeOnLayoutChangeListener(this);
                    this.this$0.trackVisibleChildren();
                }
            });
        } else {
            trackVisibleChildren();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    @SuppressLint({"SwitchIntDef"})
    public void onPageScrollStateChanged(int i10) {
        super.onPageScrollStateChanged(i10);
        if (i10 == 0) {
            trackVisibleViews();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrolled(int i10, float f10, int i11) {
        super.onPageScrolled(i10, f10, i11);
        int width = this.minimumSignificantDx;
        if (width <= 0) {
            RecyclerView.LayoutManager layoutManager = this.recyclerView.getLayoutManager();
            width = (layoutManager != null ? layoutManager.getWidth() : 0) / 20;
        }
        int i12 = this.totalDelta + i11;
        this.totalDelta = i12;
        if (i12 > width) {
            this.totalDelta = 0;
            trackVisibleViews();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageSelected(int i10) {
        super.onPageSelected(i10);
        trackVisibleViews();
        int i11 = this.prevPosition;
        if (i10 == i11) {
            return;
        }
        if (i11 != -1) {
            this.divView.unbindViewFromDiv$div_release(this.pagerView);
        }
        if (i10 == -1) {
            this.prevPosition = i10;
            return;
        }
        int i12 = this.prevPosition;
        if (i12 != -1) {
            this.divView.getDiv2Component$div_release().getDiv2Logger().logPagerChangePage(this.divView, this.items.get(i10).getExpressionResolver(), this.divPager, i10, i10 > i12 ? "next" : "back");
        }
        Div div = this.items.get(i10).getDiv();
        if (DivUtilKt.getHasSightActions(div.b())) {
            this.divView.bindViewToDiv$div_release(this.pagerView, div);
        }
        this.prevPosition = i10;
    }
}
