package com.yandex.div.core.animation;

import ah.b2;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import com.yandex.div.evaluable.MissingVariableException;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivActionAnimatorStart;
import com.yandex.div2.DivAnimationDirection;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.DivAnimator;
import com.yandex.div2.DivColorAnimator;
import com.yandex.div2.DivCount;
import com.yandex.div2.DivNumberAnimator;
import com.yandex.div2.DivTypedValue;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zn.n;

/* JADX INFO: compiled from: DivVariableAnimatorBuilder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DivVariableAnimatorBuilder {

    @NotNull
    public static final DivVariableAnimatorBuilder INSTANCE = new DivVariableAnimatorBuilder();

    private DivVariableAnimatorBuilder() {
    }

    private final Animator buildColorAnimator(Div2View div2View, DivColorAnimator divColorAnimator, DivActionAnimatorStart divActionAnimatorStart, ExpressionResolver expressionResolver) {
        Integer numColorIntValue;
        Integer numColorIntValue2;
        String strG = divColorAnimator.g();
        VariableController variableController = UtilsKt.getVariableController(expressionResolver);
        Integer numEvaluate = null;
        Variable mutableVariable = variableController != null ? variableController.getMutableVariable(strG) : null;
        if (!(mutableVariable instanceof Variable.ColorVariable)) {
            mutableVariable = null;
        }
        Variable.ColorVariable colorVariable = (Variable.ColorVariable) mutableVariable;
        if (colorVariable == null) {
            DivActionTypedUtilsKt.logError(div2View, new MissingVariableException("Unable to find color variable with name '" + divColorAnimator.g() + '\'', null, 2, null));
            return null;
        }
        DivTypedValue divTypedValue = divActionAnimatorStart.f54203h;
        if (divTypedValue == null || (numColorIntValue2 = DivActionTypedUtilsKt.colorIntValue(divTypedValue, expressionResolver)) == null) {
            Expression<Integer> expression = divColorAnimator.f54805j;
            if (expression != null) {
                numEvaluate = expression.evaluate(expressionResolver);
            }
        } else {
            numEvaluate = numColorIntValue2;
        }
        DivTypedValue divTypedValue2 = divActionAnimatorStart.f54199d;
        int iIntValue = (divTypedValue2 == null || (numColorIntValue = DivActionTypedUtilsKt.colorIntValue(divTypedValue2, expressionResolver)) == null) ? divColorAnimator.f54800e.evaluate(expressionResolver).intValue() : numColorIntValue.intValue();
        if (numEvaluate != null) {
            colorVariable.setValueDirectly(Color.m7444boximpl(Color.m7445constructorimpl(numEvaluate.intValue())));
        }
        return configure(ObjectAnimator.ofArgb(colorVariable, ColorIntValueProperty.INSTANCE, iIntValue), div2View, divColorAnimator, divActionAnimatorStart, expressionResolver);
    }

    private final Animator buildDoubleAnimator(Div2View div2View, DivNumberAnimator divNumberAnimator, DivActionAnimatorStart divActionAnimatorStart, ExpressionResolver expressionResolver, Variable.DoubleVariable doubleVariable) {
        Double dEvaluate;
        Double dDoubleValue;
        DivTypedValue divTypedValue = divActionAnimatorStart.f54203h;
        if (divTypedValue == null || (dEvaluate = DivActionTypedUtilsKt.doubleValue(divTypedValue, expressionResolver)) == null) {
            Expression<Double> expression = divNumberAnimator.f56244j;
            dEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        }
        DivTypedValue divTypedValue2 = divActionAnimatorStart.f54199d;
        double dDoubleValue2 = (divTypedValue2 == null || (dDoubleValue = DivActionTypedUtilsKt.doubleValue(divTypedValue2, expressionResolver)) == null) ? divNumberAnimator.f56239e.evaluate(expressionResolver).doubleValue() : dDoubleValue.doubleValue();
        if (dEvaluate != null) {
            doubleVariable.setValueDirectly(dEvaluate);
        }
        return configure(ObjectAnimator.ofFloat(doubleVariable, NumberValueProperty.INSTANCE, (float) dDoubleValue2), div2View, divNumberAnimator, divActionAnimatorStart, expressionResolver);
    }

    private final Animator buildIntegerAnimator(Div2View div2View, DivNumberAnimator divNumberAnimator, DivActionAnimatorStart divActionAnimatorStart, ExpressionResolver expressionResolver, Variable.IntegerVariable integerVariable) {
        Object objEvaluate;
        Number numberEvaluate;
        DivTypedValue divTypedValue = divActionAnimatorStart.f54203h;
        if (divTypedValue == null || (objEvaluate = DivActionTypedUtilsKt.longValue(divTypedValue, expressionResolver)) == null) {
            Expression<Double> expression = divNumberAnimator.f56244j;
            objEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        }
        DivTypedValue divTypedValue2 = divActionAnimatorStart.f54199d;
        if (divTypedValue2 == null || (numberEvaluate = DivActionTypedUtilsKt.longValue(divTypedValue2, expressionResolver)) == null) {
            numberEvaluate = divNumberAnimator.f56239e.evaluate(expressionResolver);
        }
        if (objEvaluate != null) {
            integerVariable.setValueDirectly(objEvaluate);
        }
        return configure(ObjectAnimator.ofInt(integerVariable, IntegerValueProperty.INSTANCE, numberEvaluate.intValue()), div2View, divNumberAnimator, divActionAnimatorStart, expressionResolver);
    }

    private final Animator buildNumberAnimator(Div2View div2View, DivNumberAnimator divNumberAnimator, DivActionAnimatorStart divActionAnimatorStart, ExpressionResolver expressionResolver) {
        String strG = divNumberAnimator.g();
        VariableController variableController = UtilsKt.getVariableController(expressionResolver);
        Variable mutableVariable = variableController != null ? variableController.getMutableVariable(strG) : null;
        if (!(mutableVariable instanceof Variable)) {
            mutableVariable = null;
        }
        if (mutableVariable instanceof Variable.IntegerVariable) {
            return buildIntegerAnimator(div2View, divNumberAnimator, divActionAnimatorStart, expressionResolver, (Variable.IntegerVariable) mutableVariable);
        }
        if (mutableVariable instanceof Variable.DoubleVariable) {
            return buildDoubleAnimator(div2View, divNumberAnimator, divActionAnimatorStart, expressionResolver, (Variable.DoubleVariable) mutableVariable);
        }
        DivActionTypedUtilsKt.logError(div2View, new MissingVariableException("Unable to find number variable with name '" + divNumberAnimator.g() + '\'', null, 2, null));
        return null;
    }

    private final ObjectAnimator configure(ObjectAnimator objectAnimator, final Div2View div2View, b2 b2Var, DivActionAnimatorStart divActionAnimatorStart, final ExpressionResolver expressionResolver) {
        DivAnimationDirection divAnimationDirectionEvaluate;
        DivAnimationInterpolator divAnimationInterpolatorEvaluate;
        int iE;
        Expression<DivAnimationDirection> expression = divActionAnimatorStart.f54197b;
        if (expression == null || (divAnimationDirectionEvaluate = expression.evaluate(expressionResolver)) == null) {
            divAnimationDirectionEvaluate = b2Var.getDirection().evaluate(expressionResolver);
        }
        Expression<Long> duration = divActionAnimatorStart.f54198c;
        if (duration == null) {
            duration = b2Var.getDuration();
        }
        objectAnimator.setDuration(duration.evaluate(expressionResolver).longValue());
        Expression<Long> expressionE = divActionAnimatorStart.f54202g;
        if (expressionE == null) {
            expressionE = b2Var.e();
        }
        objectAnimator.setStartDelay(expressionE.evaluate(expressionResolver).longValue());
        Expression<DivAnimationInterpolator> expression2 = divActionAnimatorStart.f54200e;
        if (expression2 == null || (divAnimationInterpolatorEvaluate = expression2.evaluate(expressionResolver)) == null) {
            divAnimationInterpolatorEvaluate = b2Var.c().evaluate(expressionResolver);
        }
        objectAnimator.setInterpolator(DivUtilKt.androidInterpolator(divAnimationInterpolatorEvaluate, DivUtilKt.isReversed(divAnimationDirectionEvaluate)));
        DivCount divCountB = divActionAnimatorStart.f54201f;
        if (divCountB == null) {
            divCountB = b2Var.b();
        }
        if (divCountB instanceof DivCount.b) {
            iE = n.e(((int) ((DivCount.b) divCountB).c().f55296a.evaluate(expressionResolver).longValue()) - 1, 0);
        } else {
            if (!(divCountB instanceof DivCount.c)) {
                throw new NoWhenBranchMatchedException();
            }
            iE = -1;
        }
        objectAnimator.setRepeatCount(iE);
        objectAnimator.setRepeatMode(DivUtilKt.isAlternated(divAnimationDirectionEvaluate) ? 2 : 1);
        final List<DivAction> listD = b2Var.d();
        if (listD != null) {
            objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.yandex.div.core.animation.DivVariableAnimatorBuilder$configure$lambda$2$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@NotNull Animator animator) {
                    Iterator it = listD.iterator();
                    while (it.hasNext()) {
                        div2View.handleAction((DivAction) it.next(), "animation_end", expressionResolver);
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(@NotNull Animator animator) {
                }
            });
        }
        final List<DivAction> listA = b2Var.a();
        if (listA != null) {
            objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.yandex.div.core.animation.DivVariableAnimatorBuilder$configure$lambda$5$$inlined$doOnCancel$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(@NotNull Animator animator) {
                    Iterator it = listA.iterator();
                    while (it.hasNext()) {
                        div2View.handleAction((DivAction) it.next(), "animation_cancel", expressionResolver);
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(@NotNull Animator animator) {
                }
            });
        }
        return objectAnimator;
    }

    @Nullable
    public final Animator build(@NotNull Div2View div2View, @NotNull DivAnimator divAnimator, @NotNull DivActionAnimatorStart divActionAnimatorStart, @NotNull ExpressionResolver expressionResolver) {
        if (divAnimator instanceof DivAnimator.c) {
            return buildNumberAnimator(div2View, ((DivAnimator.c) divAnimator).c(), divActionAnimatorStart, expressionResolver);
        }
        if (divAnimator instanceof DivAnimator.a) {
            return buildColorAnimator(div2View, ((DivAnimator.a) divAnimator).c(), divActionAnimatorStart, expressionResolver);
        }
        throw new NoWhenBranchMatchedException();
    }
}
