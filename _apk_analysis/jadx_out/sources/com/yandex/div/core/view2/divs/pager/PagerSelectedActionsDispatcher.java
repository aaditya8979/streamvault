package com.yandex.div.core.view2.divs.pager;

import androidx.viewpager2.widget.ViewPager2;
import bn.r;
import cn.m;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.logging.Severity;
import com.yandex.div2.DivAction;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;

/* JADX INFO: compiled from: PagerSelectedActionsDispatcher.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class PagerSelectedActionsDispatcher {

    @NotNull
    private final DivActionBinder divActionBinder;

    @NotNull
    private final Div2View divView;

    @NotNull
    private final List<DivItemBuilderResult> items;

    @Nullable
    private ViewPager2.OnPageChangeCallback pageSelectionTracker;

    /* JADX INFO: compiled from: PagerSelectedActionsDispatcher.kt */
    public final class PageSelectionTracker extends ViewPager2.OnPageChangeCallback {
        private int currentPage = -1;

        @NotNull
        private final m<Integer> selectedPages = new m<>();

        public PageSelectionTracker() {
        }

        private final void trackSelectedPages() {
            while (!this.selectedPages.isEmpty()) {
                int iIntValue = this.selectedPages.removeFirst().intValue();
                KLog kLog = KLog.INSTANCE;
                if (kLog.isAtLeast(Severity.DEBUG)) {
                    kLog.print(3, "Ya:PagerSelectedActionsTracker", "dispatch selected actions for page " + iIntValue);
                }
                PagerSelectedActionsDispatcher pagerSelectedActionsDispatcher = PagerSelectedActionsDispatcher.this;
                pagerSelectedActionsDispatcher.dispatchSelectedActions((DivItemBuilderResult) pagerSelectedActionsDispatcher.items.get(iIntValue));
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i10) {
            if (i10 == 0) {
                trackSelectedPages();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i10) {
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.DEBUG)) {
                kLog.print(3, "Ya:PagerSelectedActionsTracker", "onPageSelected(" + i10 + ')');
            }
            if (this.currentPage == i10) {
                return;
            }
            if (i10 != -1) {
                this.selectedPages.add(Integer.valueOf(i10));
            }
            if (this.currentPage == -1) {
                trackSelectedPages();
            }
            this.currentPage = i10;
        }
    }

    public PagerSelectedActionsDispatcher(@NotNull Div2View div2View, @NotNull List<DivItemBuilderResult> list, @NotNull DivActionBinder divActionBinder) {
        this.divView = div2View;
        this.items = list;
        this.divActionBinder = divActionBinder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchSelectedActions(final DivItemBuilderResult divItemBuilderResult) {
        final List<DivAction> listQ = divItemBuilderResult.getDiv().b().q();
        if (listQ != null) {
            this.divView.bulkActions$div_release(new a<r>() { // from class: com.yandex.div.core.view2.divs.pager.PagerSelectedActionsDispatcher$dispatchSelectedActions$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // sn.a
                public /* bridge */ /* synthetic */ r invoke() {
                    invoke2();
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    DivActionBinder.handleActions$div_release$default(this.this$0.divActionBinder, this.this$0.divView, divItemBuilderResult.getExpressionResolver(), listQ, "selection", null, 16, null);
                }
            });
        }
    }

    public final void attach(@NotNull ViewPager2 viewPager2) {
        PageSelectionTracker pageSelectionTracker = new PageSelectionTracker();
        viewPager2.registerOnPageChangeCallback(pageSelectionTracker);
        this.pageSelectionTracker = pageSelectionTracker;
    }

    public final void detach(@NotNull ViewPager2 viewPager2) {
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.pageSelectionTracker;
        if (onPageChangeCallback != null) {
            viewPager2.unregisterOnPageChangeCallback(onPageChangeCallback);
        }
        this.pageSelectionTracker = null;
    }
}
