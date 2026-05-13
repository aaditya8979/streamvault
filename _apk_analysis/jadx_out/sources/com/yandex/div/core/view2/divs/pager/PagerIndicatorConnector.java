package com.yandex.div.core.view2.divs.pager;

import com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div2.DivPager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: PagerIndicatorConnector.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PagerIndicatorConnector {

    @NotNull
    private final Map<DivPager, DivPagerView> pagers = new LinkedHashMap();

    @NotNull
    private final List<IndicatorData> indicators = new ArrayList();

    /* JADX INFO: compiled from: PagerIndicatorConnector.kt */
    public static final class IndicatorData {

        @NotNull
        private final DivPagerIndicatorView indicator;

        @NotNull
        private final DivPager pagerDiv;

        public IndicatorData(@NotNull DivPagerIndicatorView divPagerIndicatorView, @NotNull DivPager divPager) {
            this.indicator = divPagerIndicatorView;
            this.pagerDiv = divPager;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IndicatorData)) {
                return false;
            }
            IndicatorData indicatorData = (IndicatorData) obj;
            return p.f(this.indicator, indicatorData.indicator) && p.f(this.pagerDiv, indicatorData.pagerDiv);
        }

        @NotNull
        public final DivPagerIndicatorView getIndicator() {
            return this.indicator;
        }

        @NotNull
        public final DivPager getPagerDiv() {
            return this.pagerDiv;
        }

        public int hashCode() {
            return (this.indicator.hashCode() * 31) + this.pagerDiv.hashCode();
        }

        @NotNull
        public String toString() {
            return "IndicatorData(indicator=" + this.indicator + ", pagerDiv=" + this.pagerDiv + ')';
        }
    }

    public final void attach$div_release() {
        Iterator<Map.Entry<DivPager, DivPagerView>> it = this.pagers.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().clearChangePageCallbackForIndicators();
        }
        for (IndicatorData indicatorData : this.indicators) {
            DivPagerView divPagerView = this.pagers.get(indicatorData.getPagerDiv());
            if (divPagerView != null) {
                indicatorData.getIndicator().attachPager(divPagerView);
            }
        }
        this.pagers.clear();
        this.indicators.clear();
    }

    public final void submitIndicator$div_release(@NotNull DivPagerIndicatorView divPagerIndicatorView, @NotNull DivPager divPager) {
        this.indicators.add(new IndicatorData(divPagerIndicatorView, divPager));
    }

    public final void submitPager$div_release(@NotNull DivPagerView divPagerView, @NotNull DivPager divPager) {
        this.pagers.put(divPager, divPagerView);
    }
}
