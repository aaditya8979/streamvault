package com.yandex.div.core.view2.divs.pager;

import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import bn.r;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivPager;
import com.yandex.div2.DivPagerLayoutMode;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;
import ym.a;

/* JADX INFO: compiled from: DivPagerBinder.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivPagerBinder extends DivViewBinder<Div.j, DivPager, DivPagerView> {

    @NotNull
    private final AccessibilityStateProvider accessibilityStateProvider;

    @NotNull
    private final DivBaseBinder baseBinder;

    @NotNull
    private final DivActionBinder divActionBinder;

    @NotNull
    private final a<DivBinder> divBinder;

    @NotNull
    private final DivPatchCache divPatchCache;

    @NotNull
    private final PagerIndicatorConnector pagerIndicatorConnector;

    @NotNull
    private final DivViewCreator viewCreator;

    /* JADX INFO: renamed from: com.yandex.div.core.view2.divs.pager.DivPagerBinder$observeSizeChange$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: DivPagerBinder.kt */
    public static final class ViewOnLayoutChangeListenerC46181 implements Disposable, View.OnLayoutChangeListener {
        public final /* synthetic */ DivPager $div;
        public final /* synthetic */ l<Object, r> $observer;
        public final /* synthetic */ ViewPager2 $this_observeSizeChange;
        private int oldSize;

        public ViewOnLayoutChangeListenerC46181(final ViewPager2 viewPager2, final l<Object, r> lVar, DivPager divPager) {
            this.$this_observeSizeChange = viewPager2;
            this.$observer = lVar;
            this.$div = divPager;
            viewPager2.addOnLayoutChangeListener(this);
            OneShotPreDrawListener.add(viewPager2, new Runnable() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$observeSizeChange$1$special$$inlined$doOnPreDraw$1
                @Override // java.lang.Runnable
                public final void run() {
                    int size = this.getSize();
                    lVar.invoke(Integer.valueOf(size));
                    this.oldSize = size;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getSize() {
            return this.$this_observeSizeChange.getOrientation() == 0 ? this.$this_observeSizeChange.getWidth() : this.$this_observeSizeChange.getHeight();
        }

        @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
        public void close() {
            this.$this_observeSizeChange.removeOnLayoutChangeListener(this);
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int size = getSize();
            if (this.oldSize != size) {
                this.oldSize = size;
                this.$observer.invoke(Integer.valueOf(size));
            } else if (this.$div.f56406u instanceof DivPagerLayoutMode.c) {
                this.$this_observeSizeChange.requestTransform();
            }
        }
    }

    public DivPagerBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull DivViewCreator divViewCreator, @NotNull a<DivBinder> aVar, @NotNull DivPatchCache divPatchCache, @NotNull DivActionBinder divActionBinder, @NotNull PagerIndicatorConnector pagerIndicatorConnector, @NotNull AccessibilityStateProvider accessibilityStateProvider) {
        super(divBaseBinder);
        this.baseBinder = divBaseBinder;
        this.viewCreator = divViewCreator;
        this.divBinder = aVar;
        this.divPatchCache = divPatchCache;
        this.divActionBinder = divActionBinder;
        this.pagerIndicatorConnector = pagerIndicatorConnector;
        this.accessibilityStateProvider = accessibilityStateProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void applyDecorations(com.yandex.div.core.view2.divs.widgets.DivPagerView r23, com.yandex.div2.DivPager r24, com.yandex.div.json.expressions.ExpressionResolver r25, android.util.SparseArray<java.lang.Float> r26, com.yandex.div.core.view2.divs.pager.DivPagerAdapter r27) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.pager.DivPagerBinder.applyDecorations(com.yandex.div.core.view2.divs.widgets.DivPagerView, com.yandex.div2.DivPager, com.yandex.div.json.expressions.ExpressionResolver, android.util.SparseArray, com.yandex.div.core.view2.divs.pager.DivPagerAdapter):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void bind(final com.yandex.div.core.view2.divs.widgets.DivPagerView r20, com.yandex.div.core.view2.BindingContext r21, final com.yandex.div2.DivPager r22, com.yandex.div.core.state.DivStatePath r23) {
        /*
            Method dump skipped, instruction units count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.pager.DivPagerBinder.bind(com.yandex.div.core.view2.divs.widgets.DivPagerView, com.yandex.div.core.view2.BindingContext, com.yandex.div2.DivPager, com.yandex.div.core.state.DivStatePath):void");
    }

    private final void bindInfiniteScroll(final DivPagerView divPagerView, DivPager divPager, ExpressionResolver expressionResolver) {
        View childAt = divPagerView.getViewPager().getChildAt(0);
        p.i(childAt, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        final RecyclerView recyclerView = (RecyclerView) childAt;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        divPager.f56402q.observeAndGet(expressionResolver, new l<Boolean, r>() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder.bindInfiniteScroll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return r.f5635a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v6, types: [androidx.recyclerview.widget.RecyclerView] */
            /* JADX WARN: Type inference failed for: r3v10 */
            /* JADX WARN: Type inference failed for: r3v11 */
            /* JADX WARN: Type inference failed for: r3v7, types: [androidx.recyclerview.widget.RecyclerView$OnScrollListener] */
            /* JADX WARN: Type inference failed for: r3v9, types: [T, com.yandex.div.core.view2.divs.pager.DivPagerBinder$createInfiniteScrollListener$1] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public final void invoke(boolean z10) {
                RecyclerView.Adapter adapter = divPagerView.getViewPager().getAdapter();
                DivPagerAdapter divPagerAdapter = adapter instanceof DivPagerAdapter ? (DivPagerAdapter) adapter : null;
                if (divPagerAdapter != null) {
                    divPagerAdapter.setInfiniteScrollEnabled(z10);
                }
                if (!z10) {
                    RecyclerView.OnScrollListener onScrollListener = ref$ObjectRef.element;
                    if (onScrollListener != null) {
                        recyclerView.removeOnScrollListener(onScrollListener);
                        return;
                    }
                    return;
                }
                RecyclerView.OnScrollListener onScrollListener2 = ref$ObjectRef.element;
                ?? r32 = onScrollListener2;
                if (onScrollListener2 == null) {
                    ?? CreateInfiniteScrollListener = this.createInfiniteScrollListener(divPagerView);
                    ref$ObjectRef.element = CreateInfiniteScrollListener;
                    r32 = CreateInfiniteScrollListener;
                }
                recyclerView.addOnScrollListener(r32);
            }
        });
    }

    private final void bindItemBuilder(final DivPagerView divPagerView, final BindingContext bindingContext, DivPager divPager) {
        final DivCollectionItemBuilder divCollectionItemBuilder = divPager.f56403r;
        if (divCollectionItemBuilder == null) {
            return;
        }
        BaseDivViewExtensionsKt.bindItemBuilder(divCollectionItemBuilder, bindingContext.getExpressionResolver(), new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder.bindItemBuilder.1
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
            public final void invoke2(@NotNull Object obj) {
                DivPagerAdapter divPagerAdapter = (DivPagerAdapter) divPagerView.getViewPager().getAdapter();
                if (divPagerAdapter != null) {
                    DivCollectionItemBuilder divCollectionItemBuilder2 = divCollectionItemBuilder;
                    BindingContext bindingContext2 = bindingContext;
                    final DivPagerView divPagerView2 = divPagerView;
                    divPagerAdapter.setItems(DivCollectionExtensionsKt.build(divCollectionItemBuilder2, bindingContext2.getExpressionResolver()));
                    DivPagerView.OnItemsUpdatedCallback pagerOnItemsCountChange$div_release = divPagerView2.getPagerOnItemsCountChange$div_release();
                    if (pagerOnItemsCountChange$div_release != null) {
                        pagerOnItemsCountChange$div_release.onItemsUpdated();
                    }
                    RecyclerView recyclerView = divPagerView2.getRecyclerView();
                    if (recyclerView != null) {
                        recyclerView.scrollToPosition(divPagerAdapter.realItemPosition(divPagerView2.getCurrentItem$div_release()));
                    }
                    divPagerView2.getViewPager().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$bindItemBuilder$1$invoke$lambda$1$$inlined$doOnNextLayout$1
                        @Override // android.view.View.OnLayoutChangeListener
                        public void onLayoutChange(@NotNull View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                            view.removeOnLayoutChangeListener(this);
                            divPagerView2.getViewPager().requestTransform();
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.yandex.div.core.view2.divs.pager.DivPagerBinder$createInfiniteScrollListener$1] */
    public final C46171 createInfiniteScrollListener(final DivPagerView divPagerView) {
        return new RecyclerView.OnScrollListener() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder.createInfiniteScrollListener.1
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(@NotNull RecyclerView recyclerView, int i10, int i11) {
                super.onScrolled(recyclerView, i10, i11);
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                p.i(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                RecyclerView.Adapter adapter = divPagerView.getViewPager().getAdapter();
                int itemCount = adapter != null ? adapter.getItemCount() : 0;
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                if (iFindFirstVisibleItemPosition >= itemCount - 2 && i10 > 0) {
                    recyclerView.scrollToPosition(2);
                } else {
                    if (iFindLastVisibleItemPosition > 1 || i10 >= 0) {
                        return;
                    }
                    recyclerView.scrollToPosition((itemCount - 1) - 2);
                }
            }
        };
    }

    private final boolean isHorizontal(DivPager divPager, ExpressionResolver expressionResolver) {
        return divPager.f56409x.evaluate(expressionResolver) == DivPager.Orientation.HORIZONTAL;
    }

    private final Disposable observeSizeChange(ViewPager2 viewPager2, DivPager divPager, l<Object, r> lVar) {
        return new ViewOnLayoutChangeListenerC46181(viewPager2, lVar, divPager);
    }

    private final void removeItemDecorations(ViewPager2 viewPager2) {
        int itemDecorationCount = viewPager2.getItemDecorationCount();
        for (int i10 = 0; i10 < itemDecorationCount; i10++) {
            viewPager2.removeItemDecorationAt(i10);
        }
    }

    private final void setItemDecoration(ViewPager2 viewPager2, RecyclerView.ItemDecoration itemDecoration) {
        removeItemDecorations(viewPager2);
        viewPager2.addItemDecoration(itemDecoration);
    }

    public void bindView(@NotNull BindingContext bindingContext, @NotNull DivPagerView divPagerView, @NotNull Div.j jVar, @NotNull DivStatePath divStatePath) {
        this.pagerIndicatorConnector.submitPager$div_release(divPagerView, jVar.c());
        Div.j div = divPagerView.getDiv();
        if (jVar != div) {
            if (div != null) {
                divPagerView.setChangePageCallbackForOffScreenPages$div_release(null);
                removeItemDecorations(divPagerView.getViewPager());
                divPagerView.setPageTransformer$div_release(null);
            }
            this.baseBinder.bindView(bindingContext, divPagerView, jVar, div);
            bind(divPagerView, bindingContext, jVar.c(), divStatePath);
            return;
        }
        final ViewPager2 viewPager = divPagerView.getViewPager();
        RecyclerView.Adapter adapter = viewPager.getAdapter();
        DivPagerAdapter divPagerAdapter = adapter instanceof DivPagerAdapter ? (DivPagerAdapter) adapter : null;
        if (divPagerAdapter == null) {
            return;
        }
        if (!divPagerAdapter.applyPatch(divPagerView.getRecyclerView(), this.divPatchCache, bindingContext)) {
            BaseDivViewExtensionsKt.bindStates(divPagerView, bindingContext, this.divBinder.get());
            viewPager.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$bindView$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    view.removeOnLayoutChangeListener(this);
                    viewPager.requestTransform();
                }
            });
        } else {
            DivPagerView.OnItemsUpdatedCallback pagerOnItemsCountChange$div_release = divPagerView.getPagerOnItemsCountChange$div_release();
            if (pagerOnItemsCountChange$div_release != null) {
                pagerOnItemsCountChange$div_release.onItemsUpdated();
            }
        }
    }
}
