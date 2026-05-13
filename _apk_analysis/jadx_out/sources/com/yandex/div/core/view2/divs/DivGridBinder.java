package com.yandex.div.core.view2.divs;

import ah.e2;
import android.view.View;
import android.view.ViewGroup;
import bn.r;
import cn.b0;
import cn.f0;
import cn.v;
import cn.w;
import com.yandex.div.core.downloader.DivPatchManager;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.widgets.DivGridLayout;
import com.yandex.div.core.view2.reuse.util.RebindUtilsKt;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivGrid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;

/* JADX INFO: compiled from: DivGridBinder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivGridBinder extends DivViewBinder<Div.f, DivGrid, DivGridLayout> {

    @NotNull
    private final ym.a<DivBinder> divBinder;

    @NotNull
    private final DivPatchManager divPatchManager;

    @NotNull
    private final ym.a<DivViewCreator> divViewCreator;

    public DivGridBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull DivPatchManager divPatchManager, @NotNull ym.a<DivBinder> aVar, @NotNull ym.a<DivViewCreator> aVar2) {
        super(divBaseBinder);
        this.divPatchManager = divPatchManager;
        this.divBinder = aVar;
        this.divViewCreator = aVar2;
    }

    private final void applyColumnSpan(View view, ExpressionResolver expressionResolver, Expression<Long> expression) {
        int i10;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null) {
            return;
        }
        if (expression != null) {
            long jLongValue = expression.evaluate(expressionResolver).longValue();
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
        } else {
            i10 = 1;
        }
        if (divLayoutParams.getColumnSpan() != i10) {
            divLayoutParams.setColumnSpan(i10);
            view.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyGridLayoutParams(View view, ExpressionResolver expressionResolver, e2 e2Var) {
        applyColumnSpan(view, expressionResolver, e2Var.b());
        applyRowSpan(view, expressionResolver, e2Var.e());
    }

    private final List<Div> applyPatchToChild(ViewGroup viewGroup, BindingContext bindingContext, Div div, int i10) {
        Div2View divView = bindingContext.getDivView();
        String id2 = div.b().getId();
        if (id2 == null || divView.getComplexRebindInProgress$div_release()) {
            return v.e(div);
        }
        Map<Div, View> mapCreateViewsForId = this.divPatchManager.createViewsForId(bindingContext, id2);
        if (mapCreateViewsForId == null) {
            return v.e(div);
        }
        viewGroup.removeViewAt(i10);
        int i11 = 0;
        Iterator<Map.Entry<Div, View>> it = mapCreateViewsForId.entrySet().iterator();
        while (it.hasNext()) {
            viewGroup.addView(it.next().getValue(), i11 + i10, new DivLayoutParams(-2, -2));
            i11++;
        }
        return f0.g1(mapCreateViewsForId.keySet());
    }

    private final void applyRowSpan(View view, ExpressionResolver expressionResolver, Expression<Long> expression) {
        int i10;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null) {
            return;
        }
        if (expression != null) {
            long jLongValue = expression.evaluate(expressionResolver).longValue();
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
        } else {
            i10 = 1;
        }
        if (divLayoutParams.getRowSpan() != i10) {
            divLayoutParams.setRowSpan(i10);
            view.requestLayout();
        }
    }

    private final void bindItems(DivGridLayout divGridLayout, BindingContext bindingContext, DivGrid divGrid, DivGrid divGrid2, DivStatePath divStatePath) {
        List<Div> list;
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        List<Div> nonNullItems = DivCollectionExtensionsKt.getNonNullItems(divGrid);
        RebindUtilsKt.tryRebindPlainContainerChildren(divGridLayout, bindingContext.getDivView(), DivCollectionExtensionsKt.toDivItemBuilderResult(nonNullItems, expressionResolver), this.divViewCreator);
        BaseDivViewExtensionsKt.trackVisibilityActions(divGridLayout, bindingContext.getDivView(), DivCollectionExtensionsKt.toDivItemBuilderResult(dispatchBinding(divGridLayout, bindingContext, nonNullItems, divStatePath), expressionResolver), (divGrid2 == null || (list = divGrid2.f55625y) == null) ? null : DivCollectionExtensionsKt.toDivItemBuilderResult(list, expressionResolver));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindLayoutParams(final View view, final e2 e2Var, final ExpressionResolver expressionResolver) {
        applyGridLayoutParams(view, expressionResolver, e2Var);
        if (view instanceof ExpressionSubscriber) {
            l<? super Long, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivGridBinder$bindLayoutParams$callback$1
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
                    this.this$0.applyGridLayoutParams(view, expressionResolver, e2Var);
                }
            };
            ExpressionSubscriber expressionSubscriber = (ExpressionSubscriber) view;
            Expression<Long> expressionB = e2Var.b();
            expressionSubscriber.addSubscription(expressionB != null ? expressionB.observe(expressionResolver, lVar) : null);
            Expression<Long> expressionE = e2Var.e();
            expressionSubscriber.addSubscription(expressionE != null ? expressionE.observe(expressionResolver, lVar) : null);
        }
    }

    private final List<Div> dispatchBinding(DivGridLayout divGridLayout, BindingContext bindingContext, List<? extends Div> list, DivStatePath divStatePath) {
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        int size = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                w.w();
            }
            List<Div> listApplyPatchToChild = applyPatchToChild(divGridLayout, bindingContext, (Div) obj, i11 + size);
            size += listApplyPatchToChild.size() - 1;
            b0.F(arrayList, listApplyPatchToChild);
            i11 = i12;
        }
        List<String> ids = DivPathUtils.INSTANCE.getIds(arrayList);
        for (Object obj2 : arrayList) {
            int i13 = i10 + 1;
            if (i10 < 0) {
                w.w();
            }
            Div div = (Div) obj2;
            View childAt = divGridLayout.getChildAt(i10);
            e2 e2VarB = div.b();
            this.divBinder.get().bind(bindingContext, childAt, div, divStatePath.appendDiv(ids.get(i10)));
            bindLayoutParams(childAt, e2VarB, expressionResolver);
            if (DivUtilKt.getHasSightActions(e2VarB)) {
                divView.bindViewToDiv$div_release(childAt, div);
            } else {
                divView.unbindViewFromDiv$div_release(childAt);
            }
            i10 = i13;
        }
        return arrayList;
    }

    private final void observeContentAlignment(final DivGridLayout divGridLayout, final Expression<DivAlignmentHorizontal> expression, final Expression<DivAlignmentVertical> expression2, final ExpressionResolver expressionResolver) {
        divGridLayout.setGravity(DivUtilKt.evaluateGravity(expression.evaluate(expressionResolver), expression2.evaluate(expressionResolver)));
        l<? super DivAlignmentHorizontal, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivGridBinder$observeContentAlignment$callback$1
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
                divGridLayout.setGravity(DivUtilKt.evaluateGravity(expression.evaluate(expressionResolver), expression2.evaluate(expressionResolver)));
            }
        };
        divGridLayout.addSubscription(expression.observe(expressionResolver, lVar));
        divGridLayout.addSubscription(expression2.observe(expressionResolver, lVar));
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull final DivGridLayout divGridLayout, @NotNull BindingContext bindingContext, @NotNull DivGrid divGrid, @Nullable DivGrid divGrid2) {
        divGridLayout.setReleaseViewVisitor$div_release(bindingContext.getDivView().getReleaseViewVisitor$div_release());
        BaseDivViewExtensionsKt.applyDivActions(divGridLayout, bindingContext, divGrid.f55602b, divGrid.f55604d, divGrid.A, divGrid.f55617q, divGrid.f55623w, divGrid.f55622v, divGrid.E, divGrid.D, divGrid.f55603c, divGrid.f55611k);
        divGridLayout.addSubscription(divGrid.f55612l.observeAndGet(bindingContext.getExpressionResolver(), new l<Long, r>() { // from class: com.yandex.div.core.view2.divs.DivGridBinder.bind.1
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Long l10) {
                invoke(l10.longValue());
                return r.f5635a;
            }

            public final void invoke(long j10) {
                int i10;
                DivGridLayout divGridLayout2 = divGridLayout;
                long j11 = j10 >> 31;
                if (j11 == 0 || j11 == -1) {
                    i10 = (int) j10;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + j10 + "' to Int");
                    }
                    i10 = j10 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                divGridLayout2.setColumnCount(i10);
            }
        }));
        observeContentAlignment(divGridLayout, divGrid.f55614n, divGrid.f55615o, bindingContext.getExpressionResolver());
    }

    public void bindView(@NotNull BindingContext bindingContext, @NotNull DivGridLayout divGridLayout, @NotNull Div.f fVar, @NotNull DivStatePath divStatePath) {
        super.bindView(bindingContext, divGridLayout, fVar, divStatePath);
        DivGrid divGridC = fVar.c();
        Div.f div = divGridLayout.getDiv();
        bindItems(divGridLayout, bindingContext, divGridC, div != null ? div.c() : null, divStatePath);
    }
}
