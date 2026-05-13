package com.yandex.div.core.view2.divs.tabs;

import androidx.viewpager.widget.ViewPager;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.expression.local.DivRuntimeVisitor;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.TabsStateCache;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivTabs;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DivTabsActiveStateTracker.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivTabsActiveStateTracker implements ViewPager.OnPageChangeListener, BaseDivTabbedCardUi.ActiveTabClickListener<DivAction> {

    @NotNull
    private final BindingContext context;

    @NotNull
    private DivTabs div;

    @NotNull
    private final Div2Logger div2Logger;

    @NotNull
    private final DivStatePath path;

    @NotNull
    private final DivRuntimeVisitor runtimeVisitor;

    @NotNull
    private final TabsStateCache tabsStateCache;

    public DivTabsActiveStateTracker(@NotNull BindingContext bindingContext, @NotNull DivStatePath divStatePath, @NotNull Div2Logger div2Logger, @NotNull TabsStateCache tabsStateCache, @NotNull DivRuntimeVisitor divRuntimeVisitor, @NotNull DivTabs divTabs) {
        this.context = bindingContext;
        this.path = divStatePath;
        this.div2Logger = div2Logger;
        this.tabsStateCache = tabsStateCache;
        this.runtimeVisitor = divRuntimeVisitor;
        this.div = divTabs;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.ActiveTabClickListener
    public void onActiveTabClicked(@NotNull DivAction divAction, int i10) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i10) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i10, float f10, int i11) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i10) {
        this.div2Logger.logTabPageChanged(this.context.getDivView(), i10);
        this.tabsStateCache.putSelectedTab(this.context.getDivView().getDataTag().getId(), this.path.getFullPath$div_release(), i10);
        this.runtimeVisitor.createAndAttachRuntimesToTabs(this.context.getDivView(), this.div, this.path, this.context.getExpressionResolver());
    }

    public final void setDiv(@NotNull DivTabs divTabs) {
        this.div = divTabs;
    }
}
