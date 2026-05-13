package com.yandex.div.core.util;

import bn.r;
import com.yandex.div.core.Disposable;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAbsoluteEdgeInsets;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivCircleShape;
import com.yandex.div2.DivDrawable;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFilter;
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivImageBackground;
import com.yandex.div2.DivLinearGradient;
import com.yandex.div2.DivMatchParentSize;
import com.yandex.div2.DivNinePatchBackground;
import com.yandex.div2.DivPivot;
import com.yandex.div2.DivPivotFixed;
import com.yandex.div2.DivRadialGradient;
import com.yandex.div2.DivRadialGradientCenter;
import com.yandex.div2.DivRadialGradientRadius;
import com.yandex.div2.DivRoundedRectangleShape;
import com.yandex.div2.DivShape;
import com.yandex.div2.DivShapeDrawable;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivSizeUnitValue;
import com.yandex.div2.DivStroke;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivWrapContentSize;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;

/* JADX INFO: compiled from: ExpressionSubscribers.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ExpressionSubscribersKt {
    public static final void observeAbsoluteEdgeInsets(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable DivAbsoluteEdgeInsets divAbsoluteEdgeInsets, @NotNull ExpressionResolver expressionResolver, @NotNull l<Object, r> lVar) {
        if (divAbsoluteEdgeInsets == null) {
            return;
        }
        expressionSubscriber.addSubscription(divAbsoluteEdgeInsets.f54123b.observe(expressionResolver, lVar));
        expressionSubscriber.addSubscription(divAbsoluteEdgeInsets.f54125d.observe(expressionResolver, lVar));
        expressionSubscriber.addSubscription(divAbsoluteEdgeInsets.f54124c.observe(expressionResolver, lVar));
        expressionSubscriber.addSubscription(divAbsoluteEdgeInsets.f54122a.observe(expressionResolver, lVar));
    }

    public static final void observeBackground(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable DivBackground divBackground, @NotNull ExpressionResolver expressionResolver, @NotNull l<Object, r> lVar) {
        if (divBackground != null) {
            if (divBackground instanceof DivBackground.f) {
                expressionSubscriber.addSubscription(((DivBackground.f) divBackground).c().f57151a.observe(expressionResolver, lVar));
                return;
            }
            if (divBackground instanceof DivBackground.b) {
                DivImageBackground divImageBackgroundC = ((DivBackground.b) divBackground).c();
                expressionSubscriber.addSubscription(divImageBackgroundC.f55731a.observe(expressionResolver, lVar));
                expressionSubscriber.addSubscription(divImageBackgroundC.f55735e.observe(expressionResolver, lVar));
                expressionSubscriber.addSubscription(divImageBackgroundC.f55732b.observe(expressionResolver, lVar));
                expressionSubscriber.addSubscription(divImageBackgroundC.f55733c.observe(expressionResolver, lVar));
                expressionSubscriber.addSubscription(divImageBackgroundC.f55736f.observe(expressionResolver, lVar));
                expressionSubscriber.addSubscription(divImageBackgroundC.f55737g.observe(expressionResolver, lVar));
                List<DivFilter> list = divImageBackgroundC.f55734d;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        observeFilter(expressionSubscriber, (DivFilter) it.next(), expressionResolver, lVar);
                    }
                    return;
                }
                return;
            }
            if (divBackground instanceof DivBackground.c) {
                DivLinearGradient divLinearGradientC = ((DivBackground.c) divBackground).c();
                expressionSubscriber.addSubscription(divLinearGradientC.f56183a.observe(expressionResolver, lVar));
                ExpressionList<Integer> expressionList = divLinearGradientC.f56185c;
                expressionSubscriber.addSubscription(expressionList != null ? expressionList.observe(expressionResolver, lVar) : null);
                List<DivLinearGradient.ColorPoint> list2 = divLinearGradientC.f56184b;
                if (list2 != null) {
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        observeColorPoint(expressionSubscriber, (DivLinearGradient.ColorPoint) it2.next(), expressionResolver, lVar);
                    }
                    return;
                }
                return;
            }
            if (!(divBackground instanceof DivBackground.e)) {
                if (divBackground instanceof DivBackground.d) {
                    DivNinePatchBackground divNinePatchBackgroundC = ((DivBackground.d) divBackground).c();
                    expressionSubscriber.addSubscription(divNinePatchBackgroundC.f56222a.observe(expressionResolver, lVar));
                    observeAbsoluteEdgeInsets(expressionSubscriber, divNinePatchBackgroundC.f56223b, expressionResolver, lVar);
                    return;
                }
                return;
            }
            DivRadialGradient divRadialGradientC = ((DivBackground.e) divBackground).c();
            ExpressionList<Integer> expressionList2 = divRadialGradientC.f56578d;
            expressionSubscriber.addSubscription(expressionList2 != null ? expressionList2.observe(expressionResolver, lVar) : null);
            observeRadialGradientCenter(expressionSubscriber, divRadialGradientC.f56575a, expressionResolver, lVar);
            observeRadialGradientCenter(expressionSubscriber, divRadialGradientC.f56576b, expressionResolver, lVar);
            observeRadialGradientRadius(expressionSubscriber, divRadialGradientC.f56579e, expressionResolver, lVar);
        }
    }

    public static final void observeCircleShape(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable DivCircleShape divCircleShape, @NotNull ExpressionResolver expressionResolver, @NotNull l<Object, r> lVar) {
        if (divCircleShape == null) {
            return;
        }
        Expression<Integer> expression = divCircleShape.f54743a;
        expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, lVar) : null);
        observeFixedSize(expressionSubscriber, divCircleShape.f54744b, expressionResolver, lVar);
        observeStroke(expressionSubscriber, divCircleShape.f54745c, expressionResolver, lVar);
    }

    public static final void observeColorPoint(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable DivLinearGradient.ColorPoint colorPoint, @NotNull ExpressionResolver expressionResolver, @NotNull l<Object, r> lVar) {
        if (colorPoint == null) {
            return;
        }
        expressionSubscriber.addSubscription(colorPoint.f56189a.observe(expressionResolver, lVar));
        expressionSubscriber.addSubscription(colorPoint.f56190b.observe(expressionResolver, lVar));
    }

    public static final void observeDrawable(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable DivDrawable divDrawable, @NotNull ExpressionResolver expressionResolver, @NotNull l<Object, r> lVar) {
        if (divDrawable == null || !(divDrawable instanceof DivDrawable.b)) {
            return;
        }
        DivShapeDrawable divShapeDrawableC = ((DivDrawable.b) divDrawable).c();
        expressionSubscriber.addSubscription(divShapeDrawableC.f56933a.observe(expressionResolver, lVar));
        observeShape(expressionSubscriber, divShapeDrawableC.f56934b, expressionResolver, lVar);
        observeStroke(expressionSubscriber, divShapeDrawableC.f56935c, expressionResolver, lVar);
    }

    public static final void observeEdgeInsets(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable DivEdgeInsets divEdgeInsets, @NotNull ExpressionResolver expressionResolver, @NotNull l<Object, r> lVar) {
        if (divEdgeInsets == null) {
            return;
        }
        expressionSubscriber.addSubscription(divEdgeInsets.f55204f.observe(expressionResolver, lVar));
        expressionSubscriber.addSubscription(divEdgeInsets.f55199a.observe(expressionResolver, lVar));
        Expression<Long> expression = divEdgeInsets.f55203e;
        if (expression == null && divEdgeInsets.f55200b == null) {
            expressionSubscriber.addSubscription(divEdgeInsets.f55201c.observe(expressionResolver, lVar));
            expressionSubscriber.addSubscription(divEdgeInsets.f55202d.observe(expressionResolver, lVar));
        } else {
            expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, lVar) : null);
            Expression<Long> expression2 = divEdgeInsets.f55200b;
            expressionSubscriber.addSubscription(expression2 != null ? expression2.observe(expressionResolver, lVar) : null);
        }
    }

    public static final void observeFilter(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable DivFilter divFilter, @NotNull ExpressionResolver expressionResolver, @NotNull l<Object, r> lVar) {
        if (divFilter == null || (divFilter instanceof DivFilter.c) || !(divFilter instanceof DivFilter.a)) {
            return;
        }
        expressionSubscriber.addSubscription(((DivFilter.a) divFilter).c().f54674a.observe(expressionResolver, lVar));
    }

    public static final void observeFixedSize(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable DivFixedSize divFixedSize, @NotNull ExpressionResolver expressionResolver, @NotNull l<Object, r> lVar) {
        if (divFixedSize == null) {
            return;
        }
        expressionSubscriber.addSubscription(divFixedSize.f55333b.observe(expressionResolver, lVar));
        expressionSubscriber.addSubscription(divFixedSize.f55332a.observe(expressionResolver, lVar));
    }

    public static final void observePivot(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable DivPivot divPivot, @NotNull ExpressionResolver expressionResolver, @NotNull l<Object, r> lVar) {
        if (divPivot != null) {
            if (!(divPivot instanceof DivPivot.b)) {
                if (divPivot instanceof DivPivot.c) {
                    expressionSubscriber.addSubscription(((DivPivot.c) divPivot).c().f56552a.observe(expressionResolver, lVar));
                }
            } else {
                DivPivotFixed divPivotFixedC = ((DivPivot.b) divPivot).c();
                Expression<Long> expression = divPivotFixedC.f56537b;
                expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, lVar) : null);
                expressionSubscriber.addSubscription(divPivotFixedC.f56536a.observe(expressionResolver, lVar));
            }
        }
    }

    public static final void observeRadialGradientCenter(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable DivRadialGradientCenter divRadialGradientCenter, @NotNull ExpressionResolver expressionResolver, @NotNull l<Object, r> lVar) {
        if (divRadialGradientCenter != null) {
            if (divRadialGradientCenter instanceof DivRadialGradientCenter.b) {
                DivRadialGradientCenter.b bVar = (DivRadialGradientCenter.b) divRadialGradientCenter;
                expressionSubscriber.addSubscription(bVar.c().f56598a.observe(expressionResolver, lVar));
                expressionSubscriber.addSubscription(bVar.c().f56599b.observe(expressionResolver, lVar));
            } else if (divRadialGradientCenter instanceof DivRadialGradientCenter.c) {
                expressionSubscriber.addSubscription(((DivRadialGradientCenter.c) divRadialGradientCenter).c().f56623a.observe(expressionResolver, lVar));
            }
        }
    }

    public static final void observeRadialGradientRadius(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable DivRadialGradientRadius divRadialGradientRadius, @NotNull ExpressionResolver expressionResolver, @NotNull l<Object, r> lVar) {
        if (divRadialGradientRadius != null) {
            if (divRadialGradientRadius instanceof DivRadialGradientRadius.b) {
                DivRadialGradientRadius.b bVar = (DivRadialGradientRadius.b) divRadialGradientRadius;
                expressionSubscriber.addSubscription(bVar.c().f55332a.observe(expressionResolver, lVar));
                expressionSubscriber.addSubscription(bVar.c().f55333b.observe(expressionResolver, lVar));
            } else if (divRadialGradientRadius instanceof DivRadialGradientRadius.c) {
                expressionSubscriber.addSubscription(((DivRadialGradientRadius.c) divRadialGradientRadius).c().f56630a.observe(expressionResolver, lVar));
            }
        }
    }

    public static final void observeRoundedRectangleShape(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable DivRoundedRectangleShape divRoundedRectangleShape, @NotNull ExpressionResolver expressionResolver, @NotNull l<Object, r> lVar) {
        if (divRoundedRectangleShape == null) {
            return;
        }
        Expression<Integer> expression = divRoundedRectangleShape.f56660a;
        expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, lVar) : null);
        observeFixedSize(expressionSubscriber, divRoundedRectangleShape.f56661b, expressionResolver, lVar);
        observeFixedSize(expressionSubscriber, divRoundedRectangleShape.f56663d, expressionResolver, lVar);
        observeFixedSize(expressionSubscriber, divRoundedRectangleShape.f56662c, expressionResolver, lVar);
        observeStroke(expressionSubscriber, divRoundedRectangleShape.f56664e, expressionResolver, lVar);
    }

    public static final void observeShape(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable DivShape divShape, @NotNull ExpressionResolver expressionResolver, @NotNull l<Object, r> lVar) {
        if (divShape != null) {
            if (divShape instanceof DivShape.c) {
                observeRoundedRectangleShape(expressionSubscriber, ((DivShape.c) divShape).c(), expressionResolver, lVar);
            } else if (divShape instanceof DivShape.a) {
                observeCircleShape(expressionSubscriber, ((DivShape.a) divShape).c(), expressionResolver, lVar);
            }
        }
    }

    public static final void observeSize(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable DivSize divSize, @NotNull ExpressionResolver expressionResolver, @NotNull l<Object, r> lVar) {
        Expression<DivSizeUnit> expression;
        Expression<Long> expression2;
        Expression<DivSizeUnit> expression3;
        Expression<Long> expression4;
        Expression<DivSizeUnit> expression5;
        Expression<Long> expression6;
        Expression<DivSizeUnit> expression7;
        Expression<Long> expression8;
        if (divSize != null) {
            if (divSize instanceof DivSize.b) {
                DivFixedSize divFixedSizeC = ((DivSize.b) divSize).c();
                expressionSubscriber.addSubscription(divFixedSizeC.f55333b.observe(expressionResolver, lVar));
                expressionSubscriber.addSubscription(divFixedSizeC.f55332a.observe(expressionResolver, lVar));
                return;
            }
            Disposable disposableObserve = null;
            if (divSize instanceof DivSize.c) {
                DivMatchParentSize divMatchParentSizeC = ((DivSize.c) divSize).c();
                Expression<Double> expression9 = divMatchParentSizeC.f56206c;
                expressionSubscriber.addSubscription(expression9 != null ? expression9.observe(expressionResolver, lVar) : null);
                DivSizeUnitValue divSizeUnitValue = divMatchParentSizeC.f56205b;
                expressionSubscriber.addSubscription((divSizeUnitValue == null || (expression8 = divSizeUnitValue.f56962b) == null) ? null : expression8.observe(expressionResolver, lVar));
                DivSizeUnitValue divSizeUnitValue2 = divMatchParentSizeC.f56205b;
                expressionSubscriber.addSubscription((divSizeUnitValue2 == null || (expression7 = divSizeUnitValue2.f56961a) == null) ? null : expression7.observe(expressionResolver, lVar));
                DivSizeUnitValue divSizeUnitValue3 = divMatchParentSizeC.f56204a;
                expressionSubscriber.addSubscription((divSizeUnitValue3 == null || (expression6 = divSizeUnitValue3.f56962b) == null) ? null : expression6.observe(expressionResolver, lVar));
                DivSizeUnitValue divSizeUnitValue4 = divMatchParentSizeC.f56204a;
                if (divSizeUnitValue4 != null && (expression5 = divSizeUnitValue4.f56961a) != null) {
                    disposableObserve = expression5.observe(expressionResolver, lVar);
                }
                expressionSubscriber.addSubscription(disposableObserve);
                return;
            }
            if (divSize instanceof DivSize.d) {
                DivWrapContentSize divWrapContentSizeC = ((DivSize.d) divSize).c();
                Expression<Boolean> expression10 = divWrapContentSizeC.f58270a;
                expressionSubscriber.addSubscription(expression10 != null ? expression10.observe(expressionResolver, lVar) : null);
                DivSizeUnitValue divSizeUnitValue5 = divWrapContentSizeC.f58272c;
                expressionSubscriber.addSubscription((divSizeUnitValue5 == null || (expression4 = divSizeUnitValue5.f56962b) == null) ? null : expression4.observe(expressionResolver, lVar));
                DivSizeUnitValue divSizeUnitValue6 = divWrapContentSizeC.f58272c;
                expressionSubscriber.addSubscription((divSizeUnitValue6 == null || (expression3 = divSizeUnitValue6.f56961a) == null) ? null : expression3.observe(expressionResolver, lVar));
                DivSizeUnitValue divSizeUnitValue7 = divWrapContentSizeC.f58271b;
                expressionSubscriber.addSubscription((divSizeUnitValue7 == null || (expression2 = divSizeUnitValue7.f56962b) == null) ? null : expression2.observe(expressionResolver, lVar));
                DivSizeUnitValue divSizeUnitValue8 = divWrapContentSizeC.f58271b;
                if (divSizeUnitValue8 != null && (expression = divSizeUnitValue8.f56961a) != null) {
                    disposableObserve = expression.observe(expressionResolver, lVar);
                }
                expressionSubscriber.addSubscription(disposableObserve);
            }
        }
    }

    public static final void observeStroke(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable DivStroke divStroke, @NotNull ExpressionResolver expressionResolver, @NotNull l<Object, r> lVar) {
        if (divStroke == null) {
            return;
        }
        expressionSubscriber.addSubscription(divStroke.f57276a.observe(expressionResolver, lVar));
        expressionSubscriber.addSubscription(divStroke.f57279d.observe(expressionResolver, lVar));
        expressionSubscriber.addSubscription(divStroke.f57278c.observe(expressionResolver, lVar));
    }

    public static final void observeTransform(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable DivTransform divTransform, @NotNull ExpressionResolver expressionResolver, @NotNull l<Object, r> lVar) {
        if (divTransform == null) {
            return;
        }
        Expression<Double> expression = divTransform.f58046c;
        expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, lVar) : null);
        observePivot(expressionSubscriber, divTransform.f58044a, expressionResolver, lVar);
        observePivot(expressionSubscriber, divTransform.f58045b, expressionResolver, lVar);
    }
}
