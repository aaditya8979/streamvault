package com.yandex.div.core.view2.divs;

import ah.e2;
import android.util.DisplayMetrics;
import android.util.Log;
import bn.r;
import cn.f0;
import cn.h0;
import cn.z;
import com.yandex.div.core.util.DivTreeWalkKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.util.SearchRoute;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.pager.PagerIndicatorConnector;
import com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Animation;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Shape;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivDefaultIndicatorItemPlacement;
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivIndicator;
import com.yandex.div2.DivIndicatorItemPlacement;
import com.yandex.div2.DivPager;
import com.yandex.div2.DivRoundedRectangleShape;
import com.yandex.div2.DivShape;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivStroke;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.p;
import tn.t;

/* JADX INFO: compiled from: DivIndicatorBinder.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivIndicatorBinder extends DivViewBinder<Div.h, DivIndicator, DivPagerIndicatorView> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final PagerIndicatorConnector pagerIndicatorConnector;

    /* JADX INFO: compiled from: DivIndicatorBinder.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final IndicatorParams$Shape createCircle$div_release(int i10, float f10, float f11) {
            return new IndicatorParams$Shape.Circle(i10, new IndicatorParams$ItemSize.Circle(f10 * f11));
        }

        @NotNull
        public final IndicatorParams$Shape createRoundedRectangle$div_release(int i10, float f10, float f11, float f12, float f13, @Nullable Float f14, @Nullable Integer num) {
            return new IndicatorParams$Shape.RoundedRect(i10, new IndicatorParams$ItemSize.RoundedRect(f10 * f13, f11 * f13, f12 * f13), f14 != null ? f14.floatValue() : 0.0f, num != null ? num.intValue() : 0);
        }
    }

    public DivIndicatorBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull PagerIndicatorConnector pagerIndicatorConnector) {
        super(divBaseBinder);
        this.pagerIndicatorConnector = pagerIndicatorConnector;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void applyStyle(com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView r20, com.yandex.div.json.expressions.ExpressionResolver r21, com.yandex.div2.DivIndicator r22) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivIndicatorBinder.applyStyle(com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView, com.yandex.div.json.expressions.ExpressionResolver, com.yandex.div2.DivIndicator):void");
    }

    private final DivIndicatorItemPlacement getItemsPlacementCompat(DivIndicator divIndicator) {
        DivIndicatorItemPlacement divIndicatorItemPlacement = divIndicator.f55866v;
        return divIndicatorItemPlacement == null ? new DivIndicatorItemPlacement.b(new DivDefaultIndicatorItemPlacement(divIndicator.F)) : divIndicatorItemPlacement;
    }

    private final IndicatorParams$Shape multiply(IndicatorParams$Shape indicatorParams$Shape, float f10, Integer num) {
        if (!(indicatorParams$Shape instanceof IndicatorParams$Shape.RoundedRect)) {
            if (indicatorParams$Shape instanceof IndicatorParams$Shape.Circle) {
                return Companion.createCircle$div_release(num != null ? num.intValue() : indicatorParams$Shape.getColor(), ((IndicatorParams$Shape.Circle) indicatorParams$Shape).getItemSize().getRadius(), f10);
            }
            throw new NoWhenBranchMatchedException();
        }
        Companion companion = Companion;
        int iIntValue = num != null ? num.intValue() : indicatorParams$Shape.getColor();
        IndicatorParams$Shape.RoundedRect roundedRect = (IndicatorParams$Shape.RoundedRect) indicatorParams$Shape;
        return companion.createRoundedRectangle$div_release(iIntValue, roundedRect.getItemSize().getItemWidth(), roundedRect.getItemSize().getItemHeight(), roundedRect.getItemSize().getCornerRadius(), f10, Float.valueOf(roundedRect.getStrokeWidth()), Integer.valueOf(roundedRect.getStrokeColor()));
    }

    public static /* synthetic */ IndicatorParams$Shape multiply$default(DivIndicatorBinder divIndicatorBinder, IndicatorParams$Shape indicatorParams$Shape, float f10, Integer num, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        return divIndicatorBinder.multiply(indicatorParams$Shape, f10, num);
    }

    private final void observeWidthAndHeightSubscription(DivPagerIndicatorView divPagerIndicatorView, e2 e2Var, ExpressionResolver expressionResolver, l<Object, r> lVar) {
        Object objB = e2Var.getWidth().b();
        if (objB instanceof DivFixedSize) {
            ExpressionSubscribersKt.observeFixedSize(divPagerIndicatorView, (DivFixedSize) objB, expressionResolver, lVar);
        }
        Object objB2 = e2Var.getHeight().b();
        if (objB2 instanceof DivFixedSize) {
            ExpressionSubscribersKt.observeFixedSize(divPagerIndicatorView, (DivFixedSize) objB2, expressionResolver, lVar);
        }
    }

    private final IndicatorParams$Shape toIndicatorParamsShape(DivRoundedRectangleShape divRoundedRectangleShape, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, Expression<Integer> expression, float f10) {
        DivSizeUnit divSizeUnitEvaluate;
        Expression<Integer> expression2;
        Expression<Double> expression3;
        Expression<DivSizeUnit> expression4;
        DivStroke divStroke = divRoundedRectangleShape.f56664e;
        if (divStroke == null || (expression4 = divStroke.f57278c) == null || (divSizeUnitEvaluate = expression4.evaluate(expressionResolver)) == null) {
            divSizeUnitEvaluate = DivSizeUnit.DP;
        }
        DivStroke divStroke2 = divRoundedRectangleShape.f56664e;
        Integer numEvaluate = null;
        Integer numValueOf = (divStroke2 == null || (expression3 = divStroke2.f57279d) == null) ? null : Integer.valueOf(BaseDivViewExtensionsKt.unitToPx(Double.valueOf(expression3.evaluate(expressionResolver).doubleValue()), displayMetrics, divSizeUnitEvaluate));
        Companion companion = Companion;
        Expression<Integer> expression5 = divRoundedRectangleShape.f56660a;
        if (expression5 == null) {
            expression5 = expression;
        }
        int iIntValue = expression5.evaluate(expressionResolver).intValue();
        float pxF = BaseDivViewExtensionsKt.toPxF(divRoundedRectangleShape.f56663d, displayMetrics, expressionResolver);
        float pxF2 = BaseDivViewExtensionsKt.toPxF(divRoundedRectangleShape.f56662c, displayMetrics, expressionResolver);
        float pxF3 = BaseDivViewExtensionsKt.toPxF(divRoundedRectangleShape.f56661b, displayMetrics, expressionResolver);
        Float fValueOf = numValueOf != null ? Float.valueOf(numValueOf.intValue()) : null;
        DivStroke divStroke3 = divRoundedRectangleShape.f56664e;
        if (divStroke3 != null && (expression2 = divStroke3.f57276a) != null) {
            numEvaluate = expression2.evaluate(expressionResolver);
        }
        return companion.createRoundedRectangle$div_release(iIntValue, pxF, pxF2, pxF3, f10, fValueOf, numEvaluate);
    }

    private final IndicatorParams$Shape toIndicatorParamsShape(DivShape divShape, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, Expression<Integer> expression, float f10) {
        if (divShape instanceof DivShape.c) {
            return toIndicatorParamsShape(((DivShape.c) divShape).c(), displayMetrics, expressionResolver, expression, f10);
        }
        if (!(divShape instanceof DivShape.a)) {
            throw new NoWhenBranchMatchedException();
        }
        return Companion.createCircle$div_release(expression.evaluate(expressionResolver).intValue(), BaseDivViewExtensionsKt.toPxF(((DivShape.a) divShape).c().f54744b, displayMetrics, expressionResolver), f10);
    }

    public static /* synthetic */ IndicatorParams$Shape toIndicatorParamsShape$default(DivIndicatorBinder divIndicatorBinder, DivRoundedRectangleShape divRoundedRectangleShape, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, Expression expression, float f10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            f10 = 1.0f;
        }
        return divIndicatorBinder.toIndicatorParamsShape(divRoundedRectangleShape, displayMetrics, expressionResolver, (Expression<Integer>) expression, f10);
    }

    public static /* synthetic */ IndicatorParams$Shape toIndicatorParamsShape$default(DivIndicatorBinder divIndicatorBinder, DivShape divShape, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, Expression expression, float f10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            f10 = 1.0f;
        }
        return divIndicatorBinder.toIndicatorParamsShape(divShape, displayMetrics, expressionResolver, (Expression<Integer>) expression, f10);
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull final DivPagerIndicatorView divPagerIndicatorView, @NotNull BindingContext bindingContext, @NotNull final DivIndicator divIndicator, @Nullable DivIndicator divIndicator2) {
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        applyStyle(divPagerIndicatorView, expressionResolver, divIndicator);
        l<? super DivIndicator.Animation, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivIndicatorBinder$bind$callback$1
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
                this.this$0.applyStyle(divPagerIndicatorView, expressionResolver, divIndicator);
            }
        };
        divPagerIndicatorView.addSubscription(divIndicator.f55852h.observe(expressionResolver, lVar));
        divPagerIndicatorView.addSubscription(divIndicator.f55846b.observe(expressionResolver, lVar));
        divPagerIndicatorView.addSubscription(divIndicator.f55847c.observe(expressionResolver, lVar));
        divPagerIndicatorView.addSubscription(divIndicator.f55863s.observe(expressionResolver, lVar));
        divPagerIndicatorView.addSubscription(divIndicator.f55869y.observe(expressionResolver, lVar));
        ExpressionSubscribersKt.observeShape(divPagerIndicatorView, divIndicator.E, expressionResolver, lVar);
        ExpressionSubscribersKt.observeRoundedRectangleShape(divPagerIndicatorView, divIndicator.f55848d, expressionResolver, lVar);
        ExpressionSubscribersKt.observeRoundedRectangleShape(divPagerIndicatorView, divIndicator.f55865u, expressionResolver, lVar);
        ExpressionSubscribersKt.observeRoundedRectangleShape(divPagerIndicatorView, divIndicator.f55864t, expressionResolver, lVar);
        DivIndicatorItemPlacement itemsPlacementCompat = getItemsPlacementCompat(divIndicator);
        if (itemsPlacementCompat instanceof DivIndicatorItemPlacement.b) {
            DivIndicatorItemPlacement.b bVar = (DivIndicatorItemPlacement.b) itemsPlacementCompat;
            divPagerIndicatorView.addSubscription(bVar.c().f55118a.f55333b.observe(expressionResolver, lVar));
            divPagerIndicatorView.addSubscription(bVar.c().f55118a.f55332a.observe(expressionResolver, lVar));
        } else if (itemsPlacementCompat instanceof DivIndicatorItemPlacement.c) {
            DivIndicatorItemPlacement.c cVar = (DivIndicatorItemPlacement.c) itemsPlacementCompat;
            divPagerIndicatorView.addSubscription(cVar.c().f57262a.f55333b.observe(expressionResolver, lVar));
            divPagerIndicatorView.addSubscription(cVar.c().f57262a.f55332a.observe(expressionResolver, lVar));
            divPagerIndicatorView.addSubscription(cVar.c().f57263b.observe(expressionResolver, lVar));
        }
        observeWidthAndHeightSubscription(divPagerIndicatorView, divIndicator, expressionResolver, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v5, types: [T, com.yandex.div.core.util.SearchRoute] */
    public void bindView(@NotNull BindingContext bindingContext, @NotNull DivPagerIndicatorView divPagerIndicatorView, @NotNull Div.h hVar) {
        e2 e2Var;
        Div divRootDiv$div_release = bindingContext.getDivView().rootDiv$div_release();
        if (divRootDiv$div_release != null) {
            ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
            e2 e2VarB = hVar.b();
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            final ArrayList<SearchRoute> arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator itB = z.B(DivTreeWalkKt.walk(divRootDiv$div_release, expressionResolver).onEnter(new l<Div, Boolean>() { // from class: com.yandex.div.core.view2.divs.DivIndicatorBinder$bindView$lambda$2$$inlined$findNearest$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // sn.l
                @NotNull
                public final Boolean invoke(@NotNull Div div) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((SearchRoute) it.next()).onEnter();
                    }
                    SearchRoute searchRoute = (SearchRoute) ref$ObjectRef.element;
                    if (searchRoute != null) {
                        searchRoute.onEnter();
                    }
                    return Boolean.TRUE;
                }
            }).onLeave(new l<Div, r>() { // from class: com.yandex.div.core.view2.divs.DivIndicatorBinder$bindView$lambda$2$$inlined$findNearest$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(Div div) {
                    invoke2(div);
                    return r.f5635a;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Div div) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((SearchRoute) it.next()).onLeave();
                    }
                    SearchRoute searchRoute = (SearchRoute) ref$ObjectRef.element;
                    if (searchRoute != null) {
                        searchRoute.onLeave();
                    }
                }
            }).iterator());
            while (true) {
                e2Var = null;
                if (!itB.hasNext()) {
                    break;
                }
                e2 e2VarB2 = ((DivItemBuilderResult) ((h0) itB.next()).b()).getDiv().b();
                if (e2VarB2 == e2VarB) {
                    for (SearchRoute searchRoute : arrayList) {
                        if (((e2) searchRoute.getItem()) != null) {
                            linkedHashMap.put(searchRoute.getItem(), Integer.valueOf(searchRoute.distance()));
                        }
                    }
                    arrayList.clear();
                    ref$ObjectRef.element = new SearchRoute(null);
                }
                if (e2VarB2 instanceof DivPager) {
                    if (hVar.c().A == null || p.f(((DivPager) e2VarB2).getId(), hVar.c().A)) {
                        T t10 = ref$ObjectRef.element;
                        if (t10 != 0) {
                            linkedHashMap.put(e2VarB2, Integer.valueOf(((SearchRoute) t10).distance()));
                        } else {
                            arrayList.add(new SearchRoute(e2VarB2));
                        }
                    }
                }
            }
            Integer num = (Integer) f0.J0(linkedHashMap.values());
            if (num != null) {
                int iIntValue = num.intValue();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((Number) entry.getValue()).intValue() == iIntValue) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Set setKeySet = linkedHashMap2.keySet();
                if (!setKeySet.isEmpty()) {
                    if (setKeySet.size() > 1) {
                        Log.w("SearchUtil", "Distance clash when searching for the nearest " + t.b(DivPager.class).getSimpleName() + ". First found is taken");
                    }
                    e2Var = (e2) f0.s0(setKeySet);
                }
            }
            DivPager divPager = (DivPager) e2Var;
            if (divPager != null) {
                this.pagerIndicatorConnector.submitIndicator$div_release(divPagerIndicatorView, divPager);
            }
        }
        super.bindView(bindingContext, divPagerIndicatorView, hVar);
    }

    @NotNull
    public final IndicatorParams$Animation convert(@NotNull DivIndicator.Animation animation) {
        return animation == DivIndicator.Animation.WORM ? IndicatorParams$Animation.WORM : animation == DivIndicator.Animation.SLIDER ? IndicatorParams$Animation.SLIDER : IndicatorParams$Animation.SCALE;
    }
}
