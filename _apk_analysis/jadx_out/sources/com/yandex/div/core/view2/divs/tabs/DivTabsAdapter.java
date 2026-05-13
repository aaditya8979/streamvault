package com.yandex.div.core.view2.divs.tabs;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import cn.w;
import cn.x;
import com.yandex.div.core.downloader.DivPatchApply;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.downloader.DivPatchMap;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.tabs.DivTabsAdapter;
import com.yandex.div.core.view2.divs.widgets.ReleaseUtils;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import com.yandex.div.internal.widget.tabs.HeightCalculatorFactory;
import com.yandex.div.internal.widget.tabs.TabTextStyleProvider;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivTabs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: DivTabsAdapter.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivTabsAdapter extends BaseDivTabbedCardUi<DivSimpleTab, ViewGroup, DivAction> {

    @NotNull
    private final DivTabsActiveStateTracker activeStateTracker;

    @NotNull
    private BindingContext bindingContext;

    @NotNull
    private List<String> childIds;

    @NotNull
    private final Map<String, DivStatePath> childStates;

    @NotNull
    private final DivBinder divBinder;

    @NotNull
    private final DivPatchCache divPatchCache;

    @NotNull
    private final DivTabsEventManager divTabsEventManager;
    private final boolean isDynamicHeight;

    @NotNull
    private final PagerController pager;

    @NotNull
    private DivStatePath path;

    @NotNull
    private final Map<ViewGroup, TabModel> tabModels;

    @NotNull
    private final View view;

    @NotNull
    private final DivViewCreator viewCreator;

    public DivTabsAdapter(@NotNull ViewPool viewPool, @NotNull View view, @NotNull BaseDivTabbedCardUi.TabbedCardConfig tabbedCardConfig, @NotNull HeightCalculatorFactory heightCalculatorFactory, boolean z10, @NotNull BindingContext bindingContext, @NotNull TabTextStyleProvider tabTextStyleProvider, @NotNull DivViewCreator divViewCreator, @NotNull DivBinder divBinder, @NotNull DivTabsEventManager divTabsEventManager, @NotNull DivTabsActiveStateTracker divTabsActiveStateTracker, @NotNull DivStatePath divStatePath, @NotNull DivPatchCache divPatchCache) {
        super(viewPool, view, tabbedCardConfig, heightCalculatorFactory, tabTextStyleProvider, divTabsEventManager, divTabsEventManager, divTabsActiveStateTracker);
        this.view = view;
        this.isDynamicHeight = z10;
        this.bindingContext = bindingContext;
        this.viewCreator = divViewCreator;
        this.divBinder = divBinder;
        this.divTabsEventManager = divTabsEventManager;
        this.activeStateTracker = divTabsActiveStateTracker;
        this.path = divStatePath;
        this.divPatchCache = divPatchCache;
        this.tabModels = new LinkedHashMap();
        this.childStates = new LinkedHashMap();
        this.childIds = w.m();
        this.pager = new PagerController(this.mPager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List applyPatch$lambda$4(List list) {
        return list;
    }

    private final View createItemView(Div div, ExpressionResolver expressionResolver, int i10) {
        View viewCreate = this.viewCreator.create(div, expressionResolver);
        viewCreate.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.divBinder.bind(this.bindingContext, viewCreate, div, getChildPath(i10));
        return viewCreate;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private final DivStatePath getChildPath(int i10) {
        Map<String, DivStatePath> map = this.childStates;
        String str = this.childIds.get(i10);
        DivStatePath divStatePathAppendDiv = map.get(str);
        if (divStatePathAppendDiv == null) {
            divStatePathAppendDiv = this.path.appendDiv(this.childIds.get(i10));
            map.put(str, divStatePathAppendDiv);
        }
        return divStatePathAppendDiv;
    }

    @Nullable
    public final Div.p applyPatch(@NotNull ExpressionResolver expressionResolver, @NotNull Div.p pVar) {
        DivPatchMap patch = this.divPatchCache.getPatch(this.bindingContext.getDivView().getDataTag());
        if (patch == null) {
            return null;
        }
        Div div = new DivPatchApply(patch).applyPatchForDiv(pVar, expressionResolver).get(0);
        p.i(div, "null cannot be cast to non-null type com.yandex.div2.Div.Tabs");
        Div.p pVar2 = (Div.p) div;
        DisplayMetrics displayMetrics = this.bindingContext.getDivView().getResources().getDisplayMetrics();
        List<DivTabs.Item> list = pVar2.c().f57409q;
        final ArrayList arrayList = new ArrayList(x.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new DivSimpleTab((DivTabs.Item) it.next(), displayMetrics, expressionResolver));
        }
        setData(new BaseDivTabbedCardUi.Input() { // from class: lg.a
            @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input
            public final List getTabs() {
                return DivTabsAdapter.applyPatch$lambda$4(arrayList);
            }
        }, this.mPager.getCurrentItem());
        return pVar2;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi
    @NotNull
    public ViewGroup bindTabData(@NotNull ViewGroup viewGroup, @NotNull DivSimpleTab divSimpleTab, int i10) {
        ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(viewGroup, this.bindingContext.getDivView());
        Div div = divSimpleTab.getItem().f57421a;
        View viewCreateItemView = createItemView(div, this.bindingContext.getExpressionResolver(), i10);
        this.tabModels.put(viewGroup, new TabModel(i10, div, viewCreateItemView));
        viewGroup.addView(viewCreateItemView);
        return viewGroup;
    }

    @NotNull
    public final DivTabsActiveStateTracker getActiveStateTracker() {
        return this.activeStateTracker;
    }

    @NotNull
    public final DivTabsEventManager getDivTabsEventManager() {
        return this.divTabsEventManager;
    }

    @NotNull
    public final PagerController getPager() {
        return this.pager;
    }

    public final boolean isDynamicHeight() {
        return this.isDynamicHeight;
    }

    public final void notifyStateChanged() {
        for (Map.Entry<ViewGroup, TabModel> entry : this.tabModels.entrySet()) {
            ViewGroup key = entry.getKey();
            TabModel value = entry.getValue();
            this.divBinder.bind(this.bindingContext, value.getView(), value.getDiv(), getChildPath(value.getIndex()));
            key.requestLayout();
        }
    }

    public final void setBindingContext(@NotNull BindingContext bindingContext) {
        this.bindingContext = bindingContext;
    }

    public final void setData(@NotNull BaseDivTabbedCardUi.Input<DivSimpleTab> input, int i10) {
        this.childIds = DivPathUtils.getIds$default(DivPathUtils.INSTANCE, input.getTabs(), new l<DivSimpleTab, Div>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsAdapter.setData.1
            @Override // sn.l
            @NotNull
            public final Div invoke(DivSimpleTab divSimpleTab) {
                return divSimpleTab.getItem().f57421a;
            }
        }, null, 2, null);
        super.setData(input, this.bindingContext.getExpressionResolver(), ReleasablesKt.getExpressionSubscriber(this.view));
        this.tabModels.clear();
        this.mPager.setCurrentItem(i10, true);
    }

    public final void setStatePath(@NotNull DivStatePath divStatePath) {
        this.path = divStatePath;
        this.childStates.clear();
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi
    public void unbindTabData(@NotNull ViewGroup viewGroup) {
        this.tabModels.remove(viewGroup);
        ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(viewGroup, this.bindingContext.getDivView());
    }
}
