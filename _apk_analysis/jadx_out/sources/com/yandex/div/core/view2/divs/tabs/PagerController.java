package com.yandex.div.core.view2.divs.tabs;

import com.yandex.div.internal.widget.tabs.ScrollableViewPager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DivTabsAdapter.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class PagerController {

    @NotNull
    private final ScrollableViewPager scrollableViewPager;

    public PagerController(@NotNull ScrollableViewPager scrollableViewPager) {
        this.scrollableViewPager = scrollableViewPager;
    }

    public final int getCurrentItemIndex() {
        return this.scrollableViewPager.getCurrentItem();
    }

    public final void smoothScrollTo(int i10) {
        this.scrollableViewPager.setCurrentItem(i10, true);
    }
}
