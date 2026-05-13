package com.yandex.div.core.view2.divs.tabs;

import android.content.Context;
import android.graphics.drawable.PictureDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.DrawableKt;
import bn.r;
import cn.f0;
import cn.x;
import com.yandex.div.DivDataTag;
import com.yandex.div.R$id;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivIdLoggingImageDownloadCallback;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.expression.local.DivRuntimeVisitor;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.TabsStateCache;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.tabs.DivTabsBinder;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.core.view2.divs.widgets.ParentScrollRestrictor;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.util.UiThreadHandler;
import com.yandex.div.internal.viewpool.ViewFactory;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;
import com.yandex.div.internal.widget.tabs.DynamicCardHeightCalculator;
import com.yandex.div.internal.widget.tabs.HeightCalculatorFactory;
import com.yandex.div.internal.widget.tabs.MaxCardHeightCalculator;
import com.yandex.div.internal.widget.tabs.TabItemLayout;
import com.yandex.div.internal.widget.tabs.TabTextStyleProvider;
import com.yandex.div.internal.widget.tabs.TabTitlesLayoutView;
import com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivCornersRadius;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivTabs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.p;
import ym.a;

/* JADX INFO: compiled from: DivTabsBinder.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivTabsBinder extends DivViewBinder<Div.p, DivTabs, DivTabsLayout> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final DivTabs.TabTitleStyle DEFAULT_TAB_TITLE_STYLE = new DivTabs.TabTitleStyle(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);

    @NotNull
    private final DivActionBinder actionBinder;

    @NotNull
    private final DivBaseBinder baseBinder;

    @NotNull
    private final Context context;

    @NotNull
    private final Div2Logger div2Logger;

    @NotNull
    private final a<DivBinder> divBinder;

    @NotNull
    private final DivPatchCache divPatchCache;

    @NotNull
    private final DivImageLoader imageLoader;

    @Nullable
    private Long oldDivSelectedTab;

    @NotNull
    private final DivRuntimeVisitor runtimeVisitor;

    @NotNull
    private final TabsStateCache tabsStateCache;

    @NotNull
    private final TabTextStyleProvider textStyleProvider;

    @NotNull
    private final DivViewCreator viewCreator;

    @NotNull
    private final ViewPool viewPool;

    @NotNull
    private final DivVisibilityActionTracker visibilityActionTracker;

    /* JADX INFO: compiled from: DivTabsBinder.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivTabsBinder.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivTabs.TabTitleStyle.AnimationType.values().length];
            try {
                iArr[DivTabs.TabTitleStyle.AnimationType.SLIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivTabs.TabTitleStyle.AnimationType.FADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivTabs.TabTitleStyle.AnimationType.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DivTabsBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull DivViewCreator divViewCreator, @NotNull a<DivBinder> aVar, @NotNull ViewPool viewPool, @NotNull TabTextStyleProvider tabTextStyleProvider, @NotNull DivActionBinder divActionBinder, @NotNull Div2Logger div2Logger, @NotNull DivImageLoader divImageLoader, @NotNull DivVisibilityActionTracker divVisibilityActionTracker, @NotNull DivPatchCache divPatchCache, @NotNull Context context, @NotNull DivRuntimeVisitor divRuntimeVisitor, @NotNull TabsStateCache tabsStateCache) {
        super(divBaseBinder);
        this.baseBinder = divBaseBinder;
        this.viewCreator = divViewCreator;
        this.divBinder = aVar;
        this.viewPool = viewPool;
        this.textStyleProvider = tabTextStyleProvider;
        this.actionBinder = divActionBinder;
        this.div2Logger = div2Logger;
        this.imageLoader = divImageLoader;
        this.visibilityActionTracker = divVisibilityActionTracker;
        this.divPatchCache = divPatchCache;
        this.context = context;
        this.runtimeVisitor = divRuntimeVisitor;
        this.tabsStateCache = tabsStateCache;
        viewPool.register("DIV2.TAB_HEADER_VIEW", new TabTitlesLayoutView.TabViewFactory(context), 12);
        viewPool.register("DIV2.TAB_ITEM_VIEW", new ViewFactory() { // from class: lg.d
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivTabsBinder._init_$lambda$0(this.f73832a);
            }
        }, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TabItemLayout _init_$lambda$0(DivTabsBinder divTabsBinder) {
        return new TabItemLayout(divTabsBinder.context, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyDelimiterStyle(final TabTitlesLayoutView<?> tabTitlesLayoutView, ExpressionResolver expressionResolver, DivTabs.TabTitleDelimiter tabTitleDelimiter, BindingContext bindingContext) {
        DisplayMetrics displayMetrics = tabTitlesLayoutView.getResources().getDisplayMetrics();
        DivFixedSize divFixedSize = tabTitleDelimiter.f57431c;
        final int px = BaseDivViewExtensionsKt.toPx(divFixedSize.f55333b.evaluate(expressionResolver).longValue(), divFixedSize.f55332a.evaluate(expressionResolver), displayMetrics);
        DivFixedSize divFixedSize2 = tabTitleDelimiter.f57429a;
        final int px2 = BaseDivViewExtensionsKt.toPx(divFixedSize2.f55333b.evaluate(expressionResolver).longValue(), divFixedSize2.f55332a.evaluate(expressionResolver), displayMetrics);
        DivImageLoader divImageLoader = this.imageLoader;
        String string = tabTitleDelimiter.f57430b.evaluate(expressionResolver).toString();
        final Div2View divView = bindingContext.getDivView();
        bindingContext.getDivView().addLoadReference(divImageLoader.loadImage(string, new DivIdLoggingImageDownloadCallback(divView) { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$applyDelimiterStyle$reference$1
            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onError() {
                super.onError();
                tabTitlesLayoutView.setTabDelimiter(null, 0, 0);
            }

            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onSuccess(@NotNull PictureDrawable pictureDrawable) {
                super.onSuccess(pictureDrawable);
                tabTitlesLayoutView.setTabDelimiter(DrawableKt.toBitmap$default(pictureDrawable, 0, 0, null, 7, null), px, px2);
            }

            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onSuccess(@NotNull CachedBitmap cachedBitmap) {
                super.onSuccess(cachedBitmap);
                tabTitlesLayoutView.setTabDelimiter(cachedBitmap.getBitmap(), px, px2);
            }
        }), tabTitlesLayoutView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyStyle(TabTitlesLayoutView<?> tabTitlesLayoutView, ExpressionResolver expressionResolver, DivTabs.TabTitleStyle tabTitleStyle) {
        BaseIndicatorTabLayout.AnimationType animationType;
        int iIntValue = tabTitleStyle.f57441d.evaluate(expressionResolver).intValue();
        int iIntValue2 = tabTitleStyle.f57438a.evaluate(expressionResolver).intValue();
        int iIntValue3 = tabTitleStyle.f57453p.evaluate(expressionResolver).intValue();
        Expression<Integer> expression = tabTitleStyle.f57450m;
        tabTitlesLayoutView.setTabColors(iIntValue, iIntValue2, iIntValue3, expression != null ? expression.evaluate(expressionResolver).intValue() : 0);
        DisplayMetrics displayMetrics = tabTitlesLayoutView.getResources().getDisplayMetrics();
        tabTitlesLayoutView.setTabIndicatorCornersRadii(getCornerRadii(tabTitleStyle, displayMetrics, expressionResolver));
        tabTitlesLayoutView.setTabItemSpacing(BaseDivViewExtensionsKt.dpToPx(tabTitleStyle.f57454q.evaluate(expressionResolver), displayMetrics));
        int i10 = WhenMappings.$EnumSwitchMapping$0[tabTitleStyle.f57443f.evaluate(expressionResolver).ordinal()];
        if (i10 == 1) {
            animationType = BaseIndicatorTabLayout.AnimationType.SLIDE;
        } else if (i10 == 2) {
            animationType = BaseIndicatorTabLayout.AnimationType.FADE;
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            animationType = BaseIndicatorTabLayout.AnimationType.NONE;
        }
        tabTitlesLayoutView.setAnimationType(animationType);
        tabTitlesLayoutView.setAnimationDuration(tabTitleStyle.f57442e.evaluate(expressionResolver).longValue());
        tabTitlesLayoutView.setTabTitleStyle(tabTitleStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2(DivTabsBinder divTabsBinder, BindingContext bindingContext) {
        divTabsBinder.div2Logger.logTabTitlesScroll(bindingContext.getDivView());
    }

    private final void bindAdapter(final DivStatePath divStatePath, final BindingContext bindingContext, final DivTabsLayout divTabsLayout, DivTabs divTabs, final DivTabs divTabs2, final DivBinder divBinder, ExpressionSubscriber expressionSubscriber) {
        int i10;
        Long l10;
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        List<DivTabs.Item> list = divTabs2.f57409q;
        final ArrayList arrayList = new ArrayList(x.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new DivSimpleTab((DivTabs.Item) it.next(), divTabsLayout.getResources().getDisplayMetrics(), expressionResolver));
        }
        DivTabsAdapter divTabsAdapterTryReuse = DivTabsBinderKt.tryReuse(divTabsLayout.getDivTabsAdapter(), divTabs2, expressionResolver);
        if (divTabsAdapterTryReuse != null) {
            divTabsAdapterTryReuse.setBindingContext(bindingContext);
            divTabsAdapterTryReuse.setStatePath(divStatePath);
            divTabsAdapterTryReuse.getDivTabsEventManager().setDiv(divTabs2);
            divTabsAdapterTryReuse.getActiveStateTracker().setDiv(divTabs2);
            if (divTabs == divTabs2) {
                divTabsAdapterTryReuse.notifyStateChanged();
            } else {
                divTabsAdapterTryReuse.setData(new BaseDivTabbedCardUi.Input() { // from class: lg.b
                    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input
                    public final List getTabs() {
                        return DivTabsBinder.bindAdapter$lambda$5(arrayList);
                    }
                }, expressionResolver, expressionSubscriber);
            }
        } else {
            long jLongValue = divTabs2.f57417y.evaluate(expressionResolver).longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                i10 = (int) jLongValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + jLongValue + "' to Int");
                }
                i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            bindAdapter$setupNewAdapter(this, bindingContext, divTabs2, divTabsLayout, divBinder, divStatePath, arrayList, i10);
        }
        DivTabsBinderKt.observeFixedHeightChange(divTabs2.f57409q, expressionResolver, expressionSubscriber, new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder.bindAdapter.2
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Object obj) {
                DivTabsAdapter divTabsAdapter = divTabsLayout.getDivTabsAdapter();
                if (divTabsAdapter != null) {
                    divTabsAdapter.notifyStateChanged();
                }
            }
        });
        l<Long, r> lVar = new l<Long, r>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bindAdapter$selectTab$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Long l11) {
                invoke(l11.longValue());
                return r.f5635a;
            }

            public final void invoke(long j11) {
                PagerController pager;
                int i11;
                this.this$0.oldDivSelectedTab = Long.valueOf(j11);
                DivTabsAdapter divTabsAdapter = divTabsLayout.getDivTabsAdapter();
                if (divTabsAdapter == null || (pager = divTabsAdapter.getPager()) == null) {
                    return;
                }
                long j12 = j11 >> 31;
                if (j12 == 0 || j12 == -1) {
                    i11 = (int) j11;
                } else {
                    KAssert kAssert2 = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + j11 + "' to Int");
                    }
                    i11 = j11 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                if (pager.getCurrentItemIndex() != i11) {
                    pager.smoothScrollTo(i11);
                }
            }
        };
        expressionSubscriber.addSubscription(divTabs2.f57402j.observe(expressionResolver, new l<Boolean, r>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder.bindAdapter.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return r.f5635a;
            }

            public final void invoke(boolean z10) {
                int currentItemIndex;
                PagerController pager;
                DivTabsAdapter divTabsAdapter = divTabsLayout.getDivTabsAdapter();
                boolean z11 = false;
                if (divTabsAdapter != null && divTabsAdapter.isDynamicHeight() == z10) {
                    z11 = true;
                }
                if (z11) {
                    return;
                }
                DivTabsBinder divTabsBinder = this;
                BindingContext bindingContext2 = bindingContext;
                DivTabs divTabs3 = divTabs2;
                DivTabsLayout divTabsLayout2 = divTabsLayout;
                DivBinder divBinder2 = divBinder;
                DivStatePath divStatePath2 = divStatePath;
                List<DivSimpleTab> list2 = arrayList;
                DivTabsAdapter divTabsAdapter2 = divTabsLayout2.getDivTabsAdapter();
                if (divTabsAdapter2 == null || (pager = divTabsAdapter2.getPager()) == null) {
                    long jLongValue2 = divTabs2.f57417y.evaluate(expressionResolver).longValue();
                    long j11 = jLongValue2 >> 31;
                    if (j11 == 0 || j11 == -1) {
                        currentItemIndex = (int) jLongValue2;
                    } else {
                        KAssert kAssert2 = KAssert.INSTANCE;
                        if (Assert.isEnabled()) {
                            Assert.fail("Unable convert '" + jLongValue2 + "' to Int");
                        }
                        currentItemIndex = jLongValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    }
                } else {
                    currentItemIndex = pager.getCurrentItemIndex();
                }
                DivTabsBinder.bindAdapter$setupNewAdapter(divTabsBinder, bindingContext2, divTabs3, divTabsLayout2, divBinder2, divStatePath2, list2, currentItemIndex);
            }
        }));
        expressionSubscriber.addSubscription(divTabs2.f57417y.observe(expressionResolver, lVar));
        Div2View divView = bindingContext.getDivView();
        boolean z10 = false;
        boolean z11 = p.f(divView.getPrevDataTag(), DivDataTag.INVALID) || p.f(divView.getDataTag(), divView.getPrevDataTag());
        long jLongValue2 = divTabs2.f57417y.evaluate(expressionResolver).longValue();
        if (z11 && (l10 = this.oldDivSelectedTab) != null && l10.longValue() == jLongValue2) {
            z10 = true;
        }
        if (!z10) {
            lVar.invoke(Long.valueOf(jLongValue2));
        }
        expressionSubscriber.addSubscription(divTabs2.B.observeAndGet(expressionResolver, new l<Boolean, r>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder.bindAdapter.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return r.f5635a;
            }

            public final void invoke(boolean z12) {
                DivTabsAdapter divTabsAdapter = divTabsLayout.getDivTabsAdapter();
                if (divTabsAdapter != null) {
                    divTabsAdapter.setDisabledScrollPages(this.getDisabledScrollPages(divTabs2.f57409q.size() - 1, z12));
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List bindAdapter$lambda$5(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindAdapter$setupNewAdapter(DivTabsBinder divTabsBinder, BindingContext bindingContext, DivTabs divTabs, DivTabsLayout divTabsLayout, DivBinder divBinder, DivStatePath divStatePath, final List<DivSimpleTab> list, int i10) {
        DivTabsAdapter divTabsAdapterCreateAdapter = divTabsBinder.createAdapter(bindingContext, divTabs, divTabsLayout, divBinder, divStatePath);
        divTabsAdapterCreateAdapter.setData(new BaseDivTabbedCardUi.Input() { // from class: lg.e
            @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input
            public final List getTabs() {
                return DivTabsBinder.bindAdapter$setupNewAdapter$lambda$4(list);
            }
        }, i10);
        divTabsLayout.setDivTabsAdapter(divTabsAdapterCreateAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List bindAdapter$setupNewAdapter$lambda$4(List list) {
        return list;
    }

    private final DivTabsAdapter createAdapter(BindingContext bindingContext, DivTabs divTabs, DivTabsLayout divTabsLayout, DivBinder divBinder, DivStatePath divStatePath) {
        final DivTabsEventManager divTabsEventManager = new DivTabsEventManager(bindingContext, this.actionBinder, this.div2Logger, this.visibilityActionTracker, divTabsLayout, divTabs);
        boolean zBooleanValue = divTabs.f57402j.evaluate(bindingContext.getExpressionResolver()).booleanValue();
        HeightCalculatorFactory heightCalculatorFactory = zBooleanValue ? new HeightCalculatorFactory() { // from class: lg.f
            @Override // com.yandex.div.internal.widget.tabs.HeightCalculatorFactory
            public final ViewPagerFixedSizeLayout.HeightCalculator getCardHeightCalculator(ViewGroup viewGroup, HeightCalculatorFactory.MeasureTabHeightFn measureTabHeightFn, HeightCalculatorFactory.GetTabCountFn getTabCountFn) {
                return new DynamicCardHeightCalculator(viewGroup, measureTabHeightFn, getTabCountFn);
            }
        } : new HeightCalculatorFactory() { // from class: lg.g
            @Override // com.yandex.div.internal.widget.tabs.HeightCalculatorFactory
            public final ViewPagerFixedSizeLayout.HeightCalculator getCardHeightCalculator(ViewGroup viewGroup, HeightCalculatorFactory.MeasureTabHeightFn measureTabHeightFn, HeightCalculatorFactory.GetTabCountFn getTabCountFn) {
                return new MaxCardHeightCalculator(viewGroup, measureTabHeightFn, getTabCountFn);
            }
        };
        int currentItem = divTabsLayout.getViewPager().getCurrentItem();
        final int currentItem2 = divTabsLayout.getViewPager().getCurrentItem();
        if (currentItem2 == currentItem) {
            UiThreadHandler.INSTANCE.postOnMainThread(new sn.a<r>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder.createAdapter.1
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
                    divTabsEventManager.onPageDisplayed(currentItem2);
                }
            });
        }
        return new DivTabsAdapter(this.viewPool, divTabsLayout, getTabbedCardLayoutIds(), heightCalculatorFactory, zBooleanValue, bindingContext, this.textStyleProvider, this.viewCreator, divBinder, divTabsEventManager, new DivTabsActiveStateTracker(bindingContext, divStatePath, this.div2Logger, this.tabsStateCache, this.runtimeVisitor, divTabs), divStatePath, this.divPatchCache);
    }

    private final float[] getCornerRadii(DivTabs.TabTitleStyle tabTitleStyle, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        Expression<Long> expression;
        Expression<Long> expression2;
        Expression<Long> expression3;
        Expression<Long> expression4;
        Expression<Long> expression5 = tabTitleStyle.f57444g;
        float cornerRadii$toCornerRadii = expression5 != null ? getCornerRadii$toCornerRadii(expression5, expressionResolver, displayMetrics) : tabTitleStyle.f57445h == null ? -1.0f : 0.0f;
        DivCornersRadius divCornersRadius = tabTitleStyle.f57445h;
        float cornerRadii$toCornerRadii2 = (divCornersRadius == null || (expression4 = divCornersRadius.f54983c) == null) ? cornerRadii$toCornerRadii : getCornerRadii$toCornerRadii(expression4, expressionResolver, displayMetrics);
        DivCornersRadius divCornersRadius2 = tabTitleStyle.f57445h;
        float cornerRadii$toCornerRadii3 = (divCornersRadius2 == null || (expression3 = divCornersRadius2.f54984d) == null) ? cornerRadii$toCornerRadii : getCornerRadii$toCornerRadii(expression3, expressionResolver, displayMetrics);
        DivCornersRadius divCornersRadius3 = tabTitleStyle.f57445h;
        float cornerRadii$toCornerRadii4 = (divCornersRadius3 == null || (expression2 = divCornersRadius3.f54981a) == null) ? cornerRadii$toCornerRadii : getCornerRadii$toCornerRadii(expression2, expressionResolver, displayMetrics);
        DivCornersRadius divCornersRadius4 = tabTitleStyle.f57445h;
        if (divCornersRadius4 != null && (expression = divCornersRadius4.f54982b) != null) {
            cornerRadii$toCornerRadii = getCornerRadii$toCornerRadii(expression, expressionResolver, displayMetrics);
        }
        return new float[]{cornerRadii$toCornerRadii2, cornerRadii$toCornerRadii2, cornerRadii$toCornerRadii3, cornerRadii$toCornerRadii3, cornerRadii$toCornerRadii, cornerRadii$toCornerRadii, cornerRadii$toCornerRadii4, cornerRadii$toCornerRadii4};
    }

    private static final float getCornerRadii$toCornerRadii(Expression<Long> expression, ExpressionResolver expressionResolver, DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt.dpToPx(expression.evaluate(expressionResolver), displayMetrics);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<Integer> getDisabledScrollPages(int i10, boolean z10) {
        return z10 ? new LinkedHashSet() : f0.k1(new zn.i(0, i10));
    }

    private final BaseDivTabbedCardUi.TabbedCardConfig getTabbedCardLayoutIds() {
        return new BaseDivTabbedCardUi.TabbedCardConfig(R$id.base_tabbed_title_container_scroller, R$id.div_tabs_pager_container, R$id.div_tabs_container_helper, true, false, "DIV2.TAB_HEADER_VIEW", "DIV2.TAB_ITEM_VIEW");
    }

    private final void observeDividerStyle(final DivTabsLayout divTabsLayout, final ExpressionResolver expressionResolver, final DivTabs.TabTitleDelimiter tabTitleDelimiter, final BindingContext bindingContext) {
        if (tabTitleDelimiter == null) {
            return;
        }
        applyDelimiterStyle(divTabsLayout.getTitleLayout(), expressionResolver, tabTitleDelimiter, bindingContext);
        l<? super Long, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$observeDividerStyle$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Object obj) {
                this.this$0.applyDelimiterStyle(divTabsLayout.getTitleLayout(), expressionResolver, tabTitleDelimiter, bindingContext);
            }
        };
        tabTitleDelimiter.f57431c.f55333b.observe(expressionResolver, lVar);
        tabTitleDelimiter.f57431c.f55332a.observe(expressionResolver, lVar);
        tabTitleDelimiter.f57429a.f55333b.observe(expressionResolver, lVar);
        tabTitleDelimiter.f57429a.f55332a.observe(expressionResolver, lVar);
        tabTitleDelimiter.f57430b.observe(expressionResolver, lVar);
    }

    private final void observeHeight(final TabTitlesLayoutView<?> tabTitlesLayoutView, final DivTabs divTabs, final ExpressionResolver expressionResolver) {
        DivEdgeInsets divEdgeInsets;
        Expression<Long> expression;
        DivEdgeInsets divEdgeInsets2;
        Expression<Long> expression2;
        Expression<Long> expression3;
        Expression<Long> expression4;
        l<? super Long, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$observeHeight$applyHeight$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Object obj) {
                DivTabs.TabTitleStyle tabTitleStyle = divTabs.D;
                if (tabTitleStyle == null) {
                    tabTitleStyle = DivTabsBinder.DEFAULT_TAB_TITLE_STYLE;
                }
                DivEdgeInsets divEdgeInsets3 = tabTitleStyle.f57457t;
                DivEdgeInsets divEdgeInsets4 = divTabs.E;
                Expression<Long> expression5 = tabTitleStyle.f57456s;
                long jLongValue = (expression5 != null ? expression5.evaluate(expressionResolver).longValue() : (long) (tabTitleStyle.f57447j.evaluate(expressionResolver).floatValue() * 1.3f)) + divEdgeInsets3.f55204f.evaluate(expressionResolver).longValue() + divEdgeInsets3.f55199a.evaluate(expressionResolver).longValue() + divEdgeInsets4.f55204f.evaluate(expressionResolver).longValue() + divEdgeInsets4.f55199a.evaluate(expressionResolver).longValue();
                tabTitlesLayoutView.getLayoutParams().height = BaseDivViewExtensionsKt.spToPx(Long.valueOf(jLongValue), tabTitlesLayoutView.getResources().getDisplayMetrics());
            }
        };
        Disposable disposableObserve = null;
        lVar.invoke(null);
        ExpressionSubscriber expressionSubscriber = ReleasablesKt.getExpressionSubscriber(tabTitlesLayoutView);
        DivTabs.TabTitleStyle tabTitleStyle = divTabs.D;
        expressionSubscriber.addSubscription((tabTitleStyle == null || (expression4 = tabTitleStyle.f57456s) == null) ? null : expression4.observe(expressionResolver, lVar));
        DivTabs.TabTitleStyle tabTitleStyle2 = divTabs.D;
        expressionSubscriber.addSubscription((tabTitleStyle2 == null || (expression3 = tabTitleStyle2.f57447j) == null) ? null : expression3.observe(expressionResolver, lVar));
        DivTabs.TabTitleStyle tabTitleStyle3 = divTabs.D;
        expressionSubscriber.addSubscription((tabTitleStyle3 == null || (divEdgeInsets2 = tabTitleStyle3.f57457t) == null || (expression2 = divEdgeInsets2.f55204f) == null) ? null : expression2.observe(expressionResolver, lVar));
        DivTabs.TabTitleStyle tabTitleStyle4 = divTabs.D;
        if (tabTitleStyle4 != null && (divEdgeInsets = tabTitleStyle4.f57457t) != null && (expression = divEdgeInsets.f55199a) != null) {
            disposableObserve = expression.observe(expressionResolver, lVar);
        }
        expressionSubscriber.addSubscription(disposableObserve);
        expressionSubscriber.addSubscription(divTabs.E.f55204f.observe(expressionResolver, lVar));
        expressionSubscriber.addSubscription(divTabs.E.f55199a.observe(expressionResolver, lVar));
    }

    private final void observeStyle(final DivTabsLayout divTabsLayout, final ExpressionResolver expressionResolver, final DivTabs.TabTitleStyle tabTitleStyle) {
        Expression<Long> expression;
        Expression<DivTabs.TabTitleStyle.AnimationType> expression2;
        Expression<Long> expression3;
        DivCornersRadius divCornersRadius;
        Expression<Long> expression4;
        DivCornersRadius divCornersRadius2;
        Expression<Long> expression5;
        DivCornersRadius divCornersRadius3;
        Expression<Long> expression6;
        DivCornersRadius divCornersRadius4;
        Expression<Long> expression7;
        Expression<Long> expression8;
        Expression<Integer> expression9;
        Expression<Integer> expression10;
        Expression<Integer> expression11;
        Expression<Integer> expression12;
        applyStyle(divTabsLayout.getTitleLayout(), expressionResolver, tabTitleStyle == null ? DEFAULT_TAB_TITLE_STYLE : tabTitleStyle);
        l<? super Long, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$observeStyle$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Object obj) {
                DivTabsBinder divTabsBinder = this.this$0;
                TabTitlesLayoutView<?> titleLayout = divTabsLayout.getTitleLayout();
                ExpressionResolver expressionResolver2 = expressionResolver;
                DivTabs.TabTitleStyle tabTitleStyle2 = tabTitleStyle;
                if (tabTitleStyle2 == null) {
                    tabTitleStyle2 = DivTabsBinder.DEFAULT_TAB_TITLE_STYLE;
                }
                divTabsBinder.applyStyle(titleLayout, expressionResolver2, tabTitleStyle2);
            }
        };
        if (tabTitleStyle != null && (expression12 = tabTitleStyle.f57441d) != null) {
            expression12.observe(expressionResolver, lVar);
        }
        if (tabTitleStyle != null && (expression11 = tabTitleStyle.f57438a) != null) {
            expression11.observe(expressionResolver, lVar);
        }
        if (tabTitleStyle != null && (expression10 = tabTitleStyle.f57453p) != null) {
            expression10.observe(expressionResolver, lVar);
        }
        if (tabTitleStyle != null && (expression9 = tabTitleStyle.f57450m) != null) {
            expression9.observe(expressionResolver, lVar);
        }
        if (tabTitleStyle != null && (expression8 = tabTitleStyle.f57444g) != null) {
            expression8.observe(expressionResolver, lVar);
        }
        if (tabTitleStyle != null && (divCornersRadius4 = tabTitleStyle.f57445h) != null && (expression7 = divCornersRadius4.f54983c) != null) {
            expression7.observe(expressionResolver, lVar);
        }
        if (tabTitleStyle != null && (divCornersRadius3 = tabTitleStyle.f57445h) != null && (expression6 = divCornersRadius3.f54984d) != null) {
            expression6.observe(expressionResolver, lVar);
        }
        if (tabTitleStyle != null && (divCornersRadius2 = tabTitleStyle.f57445h) != null && (expression5 = divCornersRadius2.f54982b) != null) {
            expression5.observe(expressionResolver, lVar);
        }
        if (tabTitleStyle != null && (divCornersRadius = tabTitleStyle.f57445h) != null && (expression4 = divCornersRadius.f54981a) != null) {
            expression4.observe(expressionResolver, lVar);
        }
        if (tabTitleStyle != null && (expression3 = tabTitleStyle.f57454q) != null) {
            expression3.observe(expressionResolver, lVar);
        }
        if (tabTitleStyle != null && (expression2 = tabTitleStyle.f57443f) != null) {
            expression2.observe(expressionResolver, lVar);
        }
        if (tabTitleStyle == null || (expression = tabTitleStyle.f57442e) == null) {
            return;
        }
        expression.observe(expressionResolver, lVar);
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull final DivTabsLayout divTabsLayout, @NotNull final BindingContext bindingContext, @NotNull final DivTabs divTabs, @Nullable DivTabs divTabs2) {
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        divTabsLayout.setClipToPadding(false);
        l<? super Long, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bind$applyPaddings$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Object obj) {
                BaseDivViewExtensionsKt.applyPaddings(divTabsLayout.getTitleLayout(), divTabs.E, expressionResolver);
            }
        };
        lVar.invoke(null);
        divTabsLayout.addSubscription(divTabs.E.f55201c.observe(expressionResolver, lVar));
        divTabsLayout.addSubscription(divTabs.E.f55202d.observe(expressionResolver, lVar));
        divTabsLayout.addSubscription(divTabs.E.f55204f.observe(expressionResolver, lVar));
        divTabsLayout.addSubscription(divTabs.E.f55199a.observe(expressionResolver, lVar));
        observeHeight(divTabsLayout.getTitleLayout(), divTabs, expressionResolver);
        observeStyle(divTabsLayout, expressionResolver, divTabs.D);
        observeDividerStyle(divTabsLayout, expressionResolver, divTabs.C, bindingContext);
        divTabsLayout.getPagerLayout().setClipToPadding(false);
        DivTabsBinderKt.observe(divTabs.A, expressionResolver, divTabsLayout, new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder.bind.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Object obj) {
                BaseDivViewExtensionsKt.applyMargins(divTabsLayout.getDivider(), divTabs.A, expressionResolver);
            }
        });
        divTabsLayout.addSubscription(divTabs.f57418z.observeAndGet(expressionResolver, new l<Integer, r>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder.bind.2
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Integer num) {
                invoke(num.intValue());
                return r.f5635a;
            }

            public final void invoke(int i10) {
                divTabsLayout.getDivider().setBackgroundColor(i10);
            }
        }));
        divTabsLayout.addSubscription(divTabs.f57406n.observeAndGet(expressionResolver, new l<Boolean, r>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder.bind.3
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return r.f5635a;
            }

            public final void invoke(boolean z10) {
                divTabsLayout.getDivider().setVisibility(z10 ? 0 : 8);
            }
        }));
        divTabsLayout.getTitleLayout().setOnScrollChangedListener(new TabTitlesLayoutView.OnScrollChangedListener() { // from class: lg.c
            @Override // com.yandex.div.internal.widget.tabs.TabTitlesLayoutView.OnScrollChangedListener
            public final void onScrolled() {
                DivTabsBinder.bind$lambda$2(this.f73830a, bindingContext);
            }
        });
        divTabsLayout.getTitleLayout().setFocusTracker(bindingContext.getDivView().getInputFocusTracker$div_release());
        divTabsLayout.addSubscription(divTabs.f57413u.observeAndGet(expressionResolver, new l<Boolean, r>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder.bind.5
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return r.f5635a;
            }

            public final void invoke(boolean z10) {
                divTabsLayout.getViewPager().setOnInterceptTouchEventListener(z10 ? ParentScrollRestrictor.INSTANCE : null);
            }
        }));
    }

    public void bindView(@NotNull BindingContext bindingContext, @NotNull DivTabsLayout divTabsLayout, @NotNull Div.p pVar, @NotNull DivStatePath divStatePath) {
        Div.p pVarApplyPatch;
        Div.p div = divTabsLayout.getDiv();
        if (div == pVar) {
            DivTabsAdapter divTabsAdapter = divTabsLayout.getDivTabsAdapter();
            if (divTabsAdapter != null && (pVarApplyPatch = divTabsAdapter.applyPatch(bindingContext.getExpressionResolver(), pVar)) != null) {
                divTabsLayout.setDiv(pVarApplyPatch);
                return;
            }
        } else {
            this.baseBinder.bindView(bindingContext, divTabsLayout, pVar, div);
            bind(divTabsLayout, bindingContext, pVar.c(), div != null ? div.c() : null);
        }
        bindAdapter(divStatePath, bindingContext, divTabsLayout, div != null ? div.c() : null, pVar.c(), this.divBinder.get(), divTabsLayout);
    }
}
