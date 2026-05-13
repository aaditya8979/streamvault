package com.yandex.div.core.view2.divs;

import ah.e2;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewGroupKt;
import bn.r;
import cn.b0;
import cn.f0;
import cn.v;
import cn.w;
import cn.x;
import com.ironsource.C3978d4;
import com.yandex.div.core.downloader.DivPatchManager;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.widgets.DivCollectionHolder;
import com.yandex.div.core.view2.divs.widgets.DivFrameLayout;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.divs.widgets.DivLinearLayout;
import com.yandex.div.core.view2.divs.widgets.DivViewVisitorKt;
import com.yandex.div.core.view2.divs.widgets.DivWrapLayout;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.core.view2.reuse.util.RebindUtilsKt;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.Div;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAspect;
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;
import tn.y;

/* JADX INFO: compiled from: DivContainerBinder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivContainerBinder extends DivViewBinder<Div.b, DivContainer, ViewGroup> {

    @NotNull
    private final DivBaseBinder baseBinder;

    @NotNull
    private final ym.a<DivBinder> divBinder;

    @NotNull
    private final DivPatchManager divPatchManager;

    @NotNull
    private final ym.a<DivViewCreator> divViewCreator;

    @NotNull
    private final ErrorCollectors errorCollectors;

    @NotNull
    private final Rect tempRect;

    /* JADX INFO: compiled from: DivContainerBinder.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivContainer.Orientation.values().length];
            try {
                iArr[DivContainer.Orientation.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DivContainerBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull ym.a<DivViewCreator> aVar, @NotNull DivPatchManager divPatchManager, @NotNull ym.a<DivBinder> aVar2, @NotNull ErrorCollectors errorCollectors) {
        super(divBaseBinder);
        this.baseBinder = divBaseBinder;
        this.divViewCreator = aVar;
        this.divPatchManager = divPatchManager;
        this.divBinder = aVar2;
        this.errorCollectors = errorCollectors;
        this.tempRect = new Rect();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyChildAlignment(View view, DivContainer divContainer, e2 e2Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        Expression<DivAlignmentHorizontal> expressionG = e2Var.g();
        DivAlignmentVertical alignmentVertical = null;
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate = expressionG != null ? expressionG.evaluate(expressionResolver2) : DivUtilKt.isWrapContainer(divContainer, expressionResolver) ? null : DivUtilKt.toAlignmentHorizontal(divContainer.f54870o.evaluate(expressionResolver));
        Expression<DivAlignmentVertical> expressionM = e2Var.m();
        if (expressionM != null) {
            alignmentVertical = expressionM.evaluate(expressionResolver2);
        } else if (!DivUtilKt.isWrapContainer(divContainer, expressionResolver)) {
            alignmentVertical = DivUtilKt.toAlignmentVertical(divContainer.f54871p.evaluate(expressionResolver));
        }
        BaseDivViewExtensionsKt.applyAlignment(view, divAlignmentHorizontalEvaluate, alignmentVertical);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyItems(ViewGroup viewGroup, BindingContext bindingContext, DivContainer divContainer, DivContainer divContainer2, List<DivItemBuilderResult> list, List<DivItemBuilderResult> list2, DivStatePath divStatePath, ErrorCollector errorCollector) {
        RebindUtilsKt.tryRebindPlainContainerChildren(viewGroup, bindingContext.getDivView(), list, this.divViewCreator);
        validateChildren(viewGroup, divContainer, list, bindingContext.getExpressionResolver(), errorCollector);
        dispatchItems(viewGroup, bindingContext, divContainer, divContainer2, list, list2, divStatePath);
    }

    private final List<Div> applyPatchToChild(ViewGroup viewGroup, BindingContext bindingContext, Div div, int i10) {
        Map<Div, View> mapCreateViewsForId;
        String id2 = div.b().getId();
        if (id2 != null && (mapCreateViewsForId = this.divPatchManager.createViewsForId(bindingContext, id2)) != null) {
            viewGroup.removeViewAt(i10);
            int i11 = 0;
            Iterator<Map.Entry<Div, View>> it = mapCreateViewsForId.entrySet().iterator();
            while (it.hasNext()) {
                viewGroup.addView(it.next().getValue(), i11 + i10);
                i11++;
            }
            return f0.g1(mapCreateViewsForId.keySet());
        }
        return v.e(div);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindChild(View view, BindingContext bindingContext, Div div, ExpressionResolver expressionResolver, DivContainer divContainer, DivContainer divContainer2, DivStatePath divStatePath) {
        ExpressionResolverImpl expressionResolver2;
        DivHolderView divHolderView = view instanceof DivHolderView ? (DivHolderView) view : null;
        Div div2 = divHolderView != null ? divHolderView.getDiv() : null;
        Div2View divView = bindingContext.getDivView();
        ExpressionsRuntime expressionsRuntimeResolveRuntimeWith = divView.getRuntimeStore$div_release().resolveRuntimeWith(divView, divStatePath, div, expressionResolver, bindingContext.getExpressionResolver());
        this.divBinder.get().bind(bindingContext.getFor(expressionResolver), view, div, divStatePath);
        bindChildAlignment(view, divContainer, divContainer2, div.b(), div2 != null ? div2.b() : null, bindingContext.getExpressionResolver(), (expressionsRuntimeResolveRuntimeWith == null || (expressionResolver2 = expressionsRuntimeResolveRuntimeWith.getExpressionResolver()) == null) ? expressionResolver : expressionResolver2, ReleasablesKt.getExpressionSubscriber(view), divView);
        if (DivUtilKt.getHasSightActions(div.b())) {
            divView.bindViewToDiv$div_release(view, div);
        } else {
            divView.unbindViewFromDiv$div_release(view);
        }
    }

    private final void bindChildAlignment(final View view, final DivContainer divContainer, DivContainer divContainer2, final e2 e2Var, e2 e2Var2, final ExpressionResolver expressionResolver, final ExpressionResolver expressionResolver2, ExpressionSubscriber expressionSubscriber, Div2View div2View) {
        if (!div2View.getComplexRebindInProgress$div_release() && e2Var2 != null) {
            if (ExpressionsKt.equalsToConstant(divContainer.f54870o, divContainer2 != null ? divContainer2.f54870o : null)) {
                if (ExpressionsKt.equalsToConstant(divContainer.f54871p, divContainer2 != null ? divContainer2.f54871p : null) && ExpressionsKt.equalsToConstant(e2Var.g(), e2Var2.g()) && ExpressionsKt.equalsToConstant(e2Var.m(), e2Var2.m())) {
                    return;
                }
            }
        }
        applyChildAlignment(view, divContainer, e2Var, expressionResolver, expressionResolver2);
        if (ExpressionsKt.isConstant(divContainer.f54870o) && ExpressionsKt.isConstant(divContainer.f54871p) && ExpressionsKt.isConstantOrNull(e2Var.g()) && ExpressionsKt.isConstantOrNull(e2Var.m())) {
            return;
        }
        l<? super DivAlignmentHorizontal, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindChildAlignment$callback$1
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
                this.this$0.applyChildAlignment(view, divContainer, e2Var, expressionResolver, expressionResolver2);
            }
        };
        expressionSubscriber.addSubscription(divContainer.f54870o.observe(expressionResolver, lVar));
        expressionSubscriber.addSubscription(divContainer.f54871p.observe(expressionResolver, lVar));
        Expression<DivAlignmentHorizontal> expressionG = e2Var.g();
        expressionSubscriber.addSubscription(expressionG != null ? expressionG.observe(expressionResolver2, lVar) : null);
        Expression<DivAlignmentVertical> expressionM = e2Var.m();
        expressionSubscriber.addSubscription(expressionM != null ? expressionM.observe(expressionResolver2, lVar) : null);
    }

    private final void bindItemBuilder(final ViewGroup viewGroup, final BindingContext bindingContext, final DivContainer divContainer, final DivStatePath divStatePath, final ErrorCollector errorCollector) {
        final DivCollectionItemBuilder divCollectionItemBuilder = divContainer.f54881z;
        if (divCollectionItemBuilder == null) {
            return;
        }
        BaseDivViewExtensionsKt.bindItemBuilder(divCollectionItemBuilder, bindingContext.getExpressionResolver(), new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder.bindItemBuilder.1
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
                List<DivItemBuilderResult> listBuild = DivCollectionExtensionsKt.build(divCollectionItemBuilder, bindingContext.getExpressionResolver());
                ViewParent viewParent = viewGroup;
                p.i(viewParent, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivCollectionHolder");
                List<DivItemBuilderResult> items = ((DivCollectionHolder) viewParent).getItems();
                if (items == null) {
                    items = w.m();
                }
                List<DivItemBuilderResult> list = items;
                this.replaceWithReuse(viewGroup, bindingContext.getDivView(), list, listBuild);
                DivContainerBinder divContainerBinder = this;
                ViewGroup viewGroup2 = viewGroup;
                BindingContext bindingContext2 = bindingContext;
                DivContainer divContainer2 = divContainer;
                divContainerBinder.applyItems(viewGroup2, bindingContext2, divContainer2, divContainer2, listBuild, list, divStatePath, errorCollector);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0079, code lost:
    
        if (com.yandex.div.core.view2.animations.DivComparator.areChildrenReplaceable$default(r3, r1, r5, null, 4, null) != false) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void bindItems(android.view.ViewGroup r19, com.yandex.div.core.view2.BindingContext r20, com.yandex.div2.DivContainer r21, com.yandex.div2.DivContainer r22, com.yandex.div.json.expressions.ExpressionResolver r23, com.yandex.div.core.state.DivStatePath r24, boolean r25) {
        /*
            r18 = this;
            r9 = r18
            r6 = r19
            r7 = r21
            r8 = r22
            com.yandex.div.core.view2.Div2View r0 = r20.getDivView()
            com.yandex.div.json.expressions.ExpressionResolver r1 = r20.getExpressionResolver()
            java.util.List r5 = com.yandex.div.internal.core.DivCollectionExtensionsKt.buildItems(r7, r1)
            java.lang.String r1 = "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivCollectionHolder"
            tn.p.i(r6, r1)
            r1 = r6
            com.yandex.div.core.view2.divs.widgets.DivCollectionHolder r1 = (com.yandex.div.core.view2.divs.widgets.DivCollectionHolder) r1
            java.util.List r1 = r1.getItems()
            r2 = 0
            if (r1 != 0) goto L4b
            java.util.Iterator r2 = r5.iterator()
        L27:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L7f
            java.lang.Object r3 = r2.next()
            com.yandex.div.internal.core.DivItemBuilderResult r3 = (com.yandex.div.internal.core.DivItemBuilderResult) r3
            ym.a<com.yandex.div.core.view2.DivViewCreator> r4 = r9.divViewCreator
            java.lang.Object r4 = r4.get()
            com.yandex.div.core.view2.DivViewCreator r4 = (com.yandex.div.core.view2.DivViewCreator) r4
            com.yandex.div2.Div r10 = r3.getDiv()
            com.yandex.div.json.expressions.ExpressionResolver r3 = r3.getExpressionResolver()
            android.view.View r3 = r4.create(r10, r3)
            r6.addView(r3)
            goto L27
        L4b:
            if (r7 == r8) goto L7f
            boolean r3 = r0.getComplexRebindInProgress$div_release()
            if (r3 == 0) goto L55
        L53:
            r10 = r2
            goto L80
        L55:
            if (r8 == 0) goto L7b
            com.yandex.div.core.view2.animations.DivComparator r3 = com.yandex.div.core.view2.animations.DivComparator.INSTANCE
            com.yandex.div.json.expressions.ExpressionResolver r14 = r20.getExpressionResolver()
            r15 = 0
            r16 = 16
            r17 = 0
            r10 = r3
            r11 = r22
            r12 = r21
            r13 = r23
            boolean r4 = com.yandex.div.core.view2.animations.DivComparator.areValuesReplaceable$default(r10, r11, r12, r13, r14, r15, r16, r17)
            if (r4 == 0) goto L7b
            r13 = 0
            r14 = 4
            r15 = 0
            r10 = r3
            r11 = r1
            r12 = r5
            boolean r3 = com.yandex.div.core.view2.animations.DivComparator.areChildrenReplaceable$default(r10, r11, r12, r13, r14, r15)
            if (r3 != 0) goto L7f
        L7b:
            r9.replaceWithReuse(r6, r0, r1, r5)
            goto L53
        L7f:
            r10 = r1
        L80:
            com.yandex.div.core.view2.errors.ErrorCollectors r1 = r9.errorCollectors
            com.yandex.div.DivDataTag r2 = r0.getDataTag()
            com.yandex.div2.DivData r0 = r0.getDivData()
            com.yandex.div.core.view2.errors.ErrorCollector r11 = r1.getOrCreate(r2, r0)
            if (r25 == 0) goto La0
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r24
            r12 = r5
            r5 = r11
            r0.bindItemBuilder(r1, r2, r3, r4, r5)
            goto La1
        La0:
            r12 = r5
        La1:
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r12
            r6 = r10
            r7 = r24
            r8 = r11
            r0.applyItems(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivContainerBinder.bindItems(android.view.ViewGroup, com.yandex.div.core.view2.BindingContext, com.yandex.div2.DivContainer, com.yandex.div2.DivContainer, com.yandex.div.json.expressions.ExpressionResolver, com.yandex.div.core.state.DivStatePath, boolean):void");
    }

    public static /* synthetic */ void bindItems$default(DivContainerBinder divContainerBinder, ViewGroup viewGroup, BindingContext bindingContext, DivContainer divContainer, DivContainer divContainer2, ExpressionResolver expressionResolver, DivStatePath divStatePath, boolean z10, int i10, Object obj) {
        divContainerBinder.bindItems(viewGroup, bindingContext, divContainer, divContainer2, expressionResolver, divStatePath, (i10 & 32) != 0 ? true : z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void bindLineSeparator(final com.yandex.div.core.view2.divs.widgets.DivWrapLayout r10, com.yandex.div2.DivContainer r11, com.yandex.div2.DivContainer r12, final com.yandex.div.json.expressions.ExpressionResolver r13) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivContainerBinder.bindLineSeparator(com.yandex.div.core.view2.divs.widgets.DivWrapLayout, com.yandex.div2.DivContainer, com.yandex.div2.DivContainer, com.yandex.div.json.expressions.ExpressionResolver):void");
    }

    private final void bindLineSpacing(final DivWrapLayout divWrapLayout, DivContainer divContainer, DivContainer divContainer2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divContainer.F, divContainer2 != null ? divContainer2.F : null)) {
            return;
        }
        final DisplayMetrics displayMetrics = divWrapLayout.getResources().getDisplayMetrics();
        divWrapLayout.setLineSpacing(BaseDivViewExtensionsKt.dpToPx(divContainer.F.evaluate(expressionResolver), displayMetrics));
        if (ExpressionsKt.isConstant(divContainer.F)) {
            return;
        }
        divWrapLayout.addSubscription(divContainer.F.observe(expressionResolver, new l<Long, r>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder.bindLineSpacing.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Long l10) {
                invoke(l10.longValue());
                return r.f5635a;
            }

            public final void invoke(long j10) {
                divWrapLayout.setLineSpacing(BaseDivViewExtensionsKt.dpToPx(Long.valueOf(j10), displayMetrics));
            }
        }));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void bindProperties(final com.yandex.div.core.view2.divs.widgets.DivLinearLayout r4, final com.yandex.div2.DivContainer r5, com.yandex.div2.DivContainer r6, final com.yandex.div.json.expressions.ExpressionResolver r7, com.yandex.div.core.view2.errors.ErrorCollector r8) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivContainerBinder.bindProperties(com.yandex.div.core.view2.divs.widgets.DivLinearLayout, com.yandex.div2.DivContainer, com.yandex.div2.DivContainer, com.yandex.div.json.expressions.ExpressionResolver, com.yandex.div.core.view2.errors.ErrorCollector):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void bindProperties(final com.yandex.div.core.view2.divs.widgets.DivWrapLayout r4, final com.yandex.div2.DivContainer r5, com.yandex.div2.DivContainer r6, final com.yandex.div.json.expressions.ExpressionResolver r7, com.yandex.div.core.view2.errors.ErrorCollector r8) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivContainerBinder.bindProperties(com.yandex.div.core.view2.divs.widgets.DivWrapLayout, com.yandex.div2.DivContainer, com.yandex.div2.DivContainer, com.yandex.div.json.expressions.ExpressionResolver, com.yandex.div.core.view2.errors.ErrorCollector):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void bindSeparator(final com.yandex.div.core.view2.divs.widgets.DivLinearLayout r10, com.yandex.div2.DivContainer r11, com.yandex.div2.DivContainer r12, final com.yandex.div.json.expressions.ExpressionResolver r13) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivContainerBinder.bindSeparator(com.yandex.div.core.view2.divs.widgets.DivLinearLayout, com.yandex.div2.DivContainer, com.yandex.div2.DivContainer, com.yandex.div.json.expressions.ExpressionResolver):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void bindSeparator(final com.yandex.div.core.view2.divs.widgets.DivWrapLayout r10, com.yandex.div2.DivContainer r11, com.yandex.div2.DivContainer r12, final com.yandex.div.json.expressions.ExpressionResolver r13) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivContainerBinder.bindSeparator(com.yandex.div.core.view2.divs.widgets.DivWrapLayout, com.yandex.div2.DivContainer, com.yandex.div2.DivContainer, com.yandex.div.json.expressions.ExpressionResolver):void");
    }

    private final void checkCrossAxisSize(DivContainer divContainer, e2 e2Var, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        if (DivUtilKt.isHorizontal(divContainer, expressionResolver)) {
            checkCrossAxisSize(e2Var.getHeight(), e2Var, errorCollector);
        } else {
            checkCrossAxisSize(e2Var.getWidth(), e2Var, errorCollector);
        }
    }

    private final void checkCrossAxisSize(DivSize divSize, e2 e2Var, ErrorCollector errorCollector) {
        checkSize(divSize, e2Var, errorCollector, "wrap layout mode", "cross");
    }

    private final void checkItemSpacingIgnored(DivContainer divContainer, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        long jLongValue = divContainer.A.evaluate(expressionResolver).longValue();
        if (!showSeparatorBetween(toSeparatorMode(divContainer.P, expressionResolver)) || jLongValue == 0) {
            return;
        }
        errorCollector.logWarning(new Throwable("item_spacing will be ignored due to the 'separator' property."));
    }

    private final void checkLineSpacingIgnored(DivContainer divContainer, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        long jLongValue = divContainer.F.evaluate(expressionResolver).longValue();
        if (!showSeparatorBetween(toSeparatorMode(divContainer.E, expressionResolver)) || jLongValue == 0) {
            return;
        }
        errorCollector.logWarning(new Throwable("line_spacing will be ignored due to the 'line_separator' property."));
    }

    private final void checkMainAxisSize(DivContainer divContainer, e2 e2Var, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        if (DivUtilKt.isHorizontal(divContainer, expressionResolver)) {
            if (divContainer.getWidth() instanceof DivSize.d) {
                checkMainAxisSize(e2Var.getWidth(), e2Var, errorCollector);
            }
        } else if (divContainer.getHeight() instanceof DivSize.d) {
            DivAspect divAspect = divContainer.f54864i;
            boolean z10 = true;
            if (divAspect != null && ((float) divAspect.f54651a.evaluate(expressionResolver).doubleValue()) != 0.0f) {
                z10 = false;
            }
            if (z10) {
                checkMainAxisSize(e2Var.getHeight(), e2Var, errorCollector);
            }
        }
    }

    private final void checkMainAxisSize(DivSize divSize, e2 e2Var, ErrorCollector errorCollector) {
        checkSize(divSize, e2Var, errorCollector, "wrap_content size", C3978d4.i.Z);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void checkSize(com.yandex.div2.DivSize r4, ah.e2 r5, com.yandex.div.core.view2.errors.ErrorCollector r6, java.lang.String r7, java.lang.String r8) {
        /*
            r3 = this;
            boolean r4 = r4 instanceof com.yandex.div2.DivSize.c
            if (r4 == 0) goto L47
            java.lang.String r4 = r5.getId()
            if (r4 == 0) goto L22
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = " with id='"
            r5.append(r0)
            r5.append(r4)
            r4 = 39
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            if (r4 != 0) goto L24
        L22:
            java.lang.String r4 = ""
        L24:
            java.lang.Throwable r5 = new java.lang.Throwable
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r7
            r7 = 1
            r1[r7] = r4
            r4 = 2
            r1[r4] = r8
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r7 = "Incorrect child size. Container with %s contains child%s with match_parent size along the %s axis."
            java.lang.String r4 = java.lang.String.format(r7, r4)
            java.lang.String r7 = "format(...)"
            tn.p.j(r4, r7)
            r5.<init>(r4)
            r6.logWarning(r5)
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivContainerBinder.checkSize(com.yandex.div2.DivSize, ah.e2, com.yandex.div.core.view2.errors.ErrorCollector, java.lang.String, java.lang.String):void");
    }

    private final List<DivItemBuilderResult> dispatchBinding(ViewGroup viewGroup, BindingContext bindingContext, DivContainer divContainer, DivContainer divContainer2, List<DivItemBuilderResult> list, DivStatePath divStatePath) {
        List<DivItemBuilderResult> list2;
        int i10 = 0;
        if (divContainer.f54881z == null || list == null) {
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            int size = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    w.w();
                }
                DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
                List<Div> listApplyPatchToChild = applyPatchToChild(viewGroup, bindingContext, divItemBuilderResult.getDiv(), i11 + size);
                ArrayList arrayList2 = new ArrayList(x.x(listApplyPatchToChild, 10));
                Iterator<T> it = listApplyPatchToChild.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new DivItemBuilderResult((Div) it.next(), divItemBuilderResult.getExpressionResolver()));
                }
                size += arrayList2.size() - 1;
                b0.F(arrayList, arrayList2);
                i11 = i12;
            }
            list2 = arrayList;
        } else {
            list2 = list;
        }
        List<String> itemIds = DivPathUtils.INSTANCE.getItemIds(list2);
        for (Object obj2 : list2) {
            int i13 = i10 + 1;
            if (i10 < 0) {
                w.w();
            }
            DivItemBuilderResult divItemBuilderResult2 = (DivItemBuilderResult) obj2;
            bindChild(viewGroup.getChildAt(i10), bindingContext, divItemBuilderResult2.getDiv(), divItemBuilderResult2.getExpressionResolver(), divContainer, divContainer2, divStatePath.appendDiv(itemIds.get(i10)));
            i10 = i13;
        }
        return list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void dispatchItems(ViewGroup viewGroup, BindingContext bindingContext, DivContainer divContainer, DivContainer divContainer2, List<DivItemBuilderResult> list, List<DivItemBuilderResult> list2, DivStatePath divStatePath) {
        List<DivItemBuilderResult> listDispatchBinding = dispatchBinding(viewGroup, bindingContext, divContainer, divContainer2, list, divStatePath);
        p.i(viewGroup, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivCollectionHolder");
        ((DivCollectionHolder) viewGroup).setItems(listDispatchBinding);
        BaseDivViewExtensionsKt.trackVisibilityActions(viewGroup, bindingContext.getDivView(), listDispatchBinding, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void replaceWithReuse(ViewGroup viewGroup, Div2View div2View, List<DivItemBuilderResult> list, List<DivItemBuilderResult> list2) {
        Object next;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listU = SequencesKt___SequencesKt.U(ViewGroupKt.getChildren(viewGroup));
        Iterator<T> it = list.iterator();
        Iterator it2 = listU.iterator();
        ArrayList arrayList = new ArrayList(Math.min(x.x(list, 10), x.x(listU, 10)));
        while (it.hasNext() && it2.hasNext()) {
            linkedHashMap.put(((DivItemBuilderResult) it.next()).getDiv(), (View) it2.next());
            arrayList.add(r.f5635a);
        }
        viewGroup.removeAllViews();
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        Iterator<T> it3 = list2.iterator();
        while (true) {
            Object obj = null;
            if (!it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            int i11 = i10 + 1;
            if (i10 < 0) {
                w.w();
            }
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) next2;
            Iterator it4 = linkedHashMap.keySet().iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object next3 = it4.next();
                Div div = (Div) next3;
                if (DivUtilKt.isBranch(div) ? p.f(DivUtilKt.getType(divItemBuilderResult.getDiv()), DivUtilKt.getType(div)) : DivUtilKt.canBeReused(div, divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver())) {
                    obj = next3;
                    break;
                }
            }
            View view = (View) y.d(linkedHashMap).remove((Div) obj);
            if (view != null) {
                viewGroup.addView(view);
            } else {
                arrayList2.add(Integer.valueOf(i10));
            }
            i10 = i11;
        }
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            int iIntValue = ((Number) it5.next()).intValue();
            DivItemBuilderResult divItemBuilderResult2 = list2.get(iIntValue);
            Iterator it6 = linkedHashMap.keySet().iterator();
            while (true) {
                if (!it6.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it6.next();
                    if (p.f(DivUtilKt.getType((Div) next), DivUtilKt.getType(divItemBuilderResult2.getDiv()))) {
                        break;
                    }
                }
            }
            View viewCreate = (View) y.d(linkedHashMap).remove((Div) next);
            if (viewCreate == null) {
                viewCreate = this.divViewCreator.get().create(divItemBuilderResult2.getDiv(), divItemBuilderResult2.getExpressionResolver());
            }
            viewGroup.addView(viewCreate, iIntValue);
        }
        Iterator it7 = linkedHashMap.values().iterator();
        while (it7.hasNext()) {
            DivViewVisitorKt.visitViewTree(div2View.getReleaseViewVisitor$div_release(), (View) it7.next());
        }
    }

    private final boolean showSeparatorBetween(int i10) {
        return (i10 & 2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int toOrientationMode(DivContainer.Orientation orientation) {
        return WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()] == 1 ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect toRect(DivEdgeInsets divEdgeInsets, Resources resources, ExpressionResolver expressionResolver) {
        if (divEdgeInsets == null) {
            this.tempRect.set(0, 0, 0, 0);
            return this.tempRect;
        }
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        DivSizeUnit divSizeUnitEvaluate = divEdgeInsets.f55205g.evaluate(expressionResolver);
        if (divEdgeInsets.f55203e == null && divEdgeInsets.f55200b == null) {
            this.tempRect.left = BaseDivViewExtensionsKt.unitToPx(divEdgeInsets.f55201c.evaluate(expressionResolver), displayMetrics, divSizeUnitEvaluate);
            this.tempRect.right = BaseDivViewExtensionsKt.unitToPx(divEdgeInsets.f55202d.evaluate(expressionResolver), displayMetrics, divSizeUnitEvaluate);
        } else {
            if (resources.getConfiguration().getLayoutDirection() == 0) {
                Rect rect = this.tempRect;
                Expression<Long> expression = divEdgeInsets.f55203e;
                rect.left = BaseDivViewExtensionsKt.unitToPx(expression != null ? expression.evaluate(expressionResolver) : null, displayMetrics, divSizeUnitEvaluate);
                Rect rect2 = this.tempRect;
                Expression<Long> expression2 = divEdgeInsets.f55200b;
                rect2.right = BaseDivViewExtensionsKt.unitToPx(expression2 != null ? expression2.evaluate(expressionResolver) : null, displayMetrics, divSizeUnitEvaluate);
            } else {
                Rect rect3 = this.tempRect;
                Expression<Long> expression3 = divEdgeInsets.f55200b;
                rect3.left = BaseDivViewExtensionsKt.unitToPx(expression3 != null ? expression3.evaluate(expressionResolver) : null, displayMetrics, divSizeUnitEvaluate);
                Rect rect4 = this.tempRect;
                Expression<Long> expression4 = divEdgeInsets.f55203e;
                rect4.right = BaseDivViewExtensionsKt.unitToPx(expression4 != null ? expression4.evaluate(expressionResolver) : null, displayMetrics, divSizeUnitEvaluate);
            }
        }
        this.tempRect.top = BaseDivViewExtensionsKt.unitToPx(divEdgeInsets.f55204f.evaluate(expressionResolver), displayMetrics, divSizeUnitEvaluate);
        this.tempRect.bottom = BaseDivViewExtensionsKt.unitToPx(divEdgeInsets.f55199a.evaluate(expressionResolver), displayMetrics, divSizeUnitEvaluate);
        return this.tempRect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int toSeparatorMode(DivContainer.Separator separator, ExpressionResolver expressionResolver) {
        if (separator == null) {
            return 0;
        }
        boolean zBooleanValue = separator.f54891c.evaluate(expressionResolver).booleanValue();
        ?? r02 = zBooleanValue;
        if (separator.f54892d.evaluate(expressionResolver).booleanValue()) {
            r02 = (zBooleanValue ? 1 : 0) | 2;
        }
        return separator.f54890b.evaluate(expressionResolver).booleanValue() ? r02 | 4 : r02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int toWrapDirection(DivContainer.Orientation orientation) {
        return WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()] == 1 ? 0 : 1;
    }

    private final void validateChildren(ViewGroup viewGroup, DivContainer divContainer, List<DivItemBuilderResult> list, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        if (viewGroup instanceof DivFrameLayout) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            e2 e2VarB = ((DivItemBuilderResult) it.next()).getDiv().b();
            if (viewGroup instanceof DivWrapLayout) {
                checkCrossAxisSize(divContainer, e2VarB, expressionResolver, errorCollector);
            } else if (viewGroup instanceof DivLinearLayout) {
                checkMainAxisSize(divContainer, e2VarB, expressionResolver, errorCollector);
            }
        }
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull ViewGroup viewGroup, @NotNull BindingContext bindingContext, @NotNull DivContainer divContainer, @Nullable DivContainer divContainer2) {
        BaseDivViewExtensionsKt.applyDivActions(viewGroup, bindingContext, divContainer.f54854b, divContainer.f54858d, divContainer.G, divContainer.f54873r, divContainer.f54879x, divContainer.f54878w, divContainer.L, divContainer.K, divContainer.f54856c, divContainer.f54867l);
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        ErrorCollector orCreate = this.errorCollectors.getOrCreate(bindingContext.getDivView().getDataTag(), bindingContext.getDivView().getDivData());
        BaseDivViewExtensionsKt.bindAspectRatio(viewGroup, divContainer.f54864i, divContainer2 != null ? divContainer2.f54864i : null, expressionResolver);
        BaseDivViewExtensionsKt.bindClipChildren(viewGroup, divContainer.f54868m, divContainer2 != null ? divContainer2.f54868m : null, expressionResolver);
        if (viewGroup instanceof DivLinearLayout) {
            bindProperties((DivLinearLayout) viewGroup, divContainer, divContainer2, expressionResolver, orCreate);
        } else if (viewGroup instanceof DivWrapLayout) {
            bindProperties((DivWrapLayout) viewGroup, divContainer, divContainer2, expressionResolver, orCreate);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void bindView(@NotNull BindingContext bindingContext, @NotNull ViewGroup viewGroup, @NotNull Div.b bVar, @NotNull DivStatePath divStatePath) {
        ExpressionResolver oldExpressionResolver$div_release;
        p.i(viewGroup, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivHolderView<com.yandex.div2.Div.Container>");
        DivHolderView divHolderView = (DivHolderView) viewGroup;
        Div.b bVar2 = (Div.b) divHolderView.getDiv();
        BindingContext bindingContext2 = divHolderView.getBindingContext();
        if (bindingContext2 == null || (oldExpressionResolver$div_release = bindingContext2.getExpressionResolver()) == null) {
            oldExpressionResolver$div_release = bindingContext.getDivView().getOldExpressionResolver$div_release();
        }
        ExpressionResolver expressionResolver = oldExpressionResolver$div_release;
        if (bVar == bVar2) {
            bindItems(viewGroup, bindingContext, bVar.c(), bVar2.c(), expressionResolver, divStatePath, false);
            return;
        }
        this.baseBinder.bindView(bindingContext, viewGroup, bVar, bVar2);
        bind(viewGroup, bindingContext, bVar.c(), bVar2 != null ? bVar2.c() : null);
        Iterator<View> it = ViewGroupKt.getChildren(viewGroup).iterator();
        while (it.hasNext()) {
            bindingContext.getDivView().unbindViewFromDiv$div_release(it.next());
        }
        bindItems$default(this, viewGroup, bindingContext, bVar.c(), bVar2 != null ? bVar2.c() : null, expressionResolver, divStatePath, false, 32, null);
    }
}
