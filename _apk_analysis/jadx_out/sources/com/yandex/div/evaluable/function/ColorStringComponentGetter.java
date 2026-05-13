package com.yandex.div.evaluable.function;

import cn.f0;
import cn.v;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Color;
import java.util.List;
import kotlin.KotlinNothingValueException;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: ColorFunctions.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class ColorStringComponentGetter extends Function {

    @NotNull
    private final ColorComponentGetter componentGetter;

    @NotNull
    private final List<FunctionArgument> declaredArgs;
    private final boolean isPure;

    @NotNull
    private final EvaluableType resultType;

    public ColorStringComponentGetter(@NotNull ColorComponentGetter colorComponentGetter) {
        p.k(colorComponentGetter, "componentGetter");
        this.componentGetter = colorComponentGetter;
        this.declaredArgs = v.e(new FunctionArgument(EvaluableType.STRING, false, 2, null));
        this.resultType = EvaluableType.NUMBER;
        this.isPure = true;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo7374evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable evaluable, @NotNull List<? extends Object> list) {
        p.k(evaluationContext, "evaluationContext");
        p.k(evaluable, "expressionContext");
        p.k(list, "args");
        Object objT0 = f0.t0(list);
        p.i(objT0, "null cannot be cast to non-null type kotlin.String");
        try {
            return this.componentGetter.m7403invokeex6DHhM(evaluationContext, evaluable, v.e(Color.m7444boximpl(Color.Companion.m7454parseC4zCDoM((String) objT0))));
        } catch (IllegalArgumentException e10) {
            EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed(getName(), list, "Unable to convert value to Color, expected format #AARRGGBB.", e10);
            throw new KotlinNothingValueException();
        }
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public List<FunctionArgument> getDeclaredArgs() {
        return this.declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public EvaluableType getResultType() {
        return this.resultType;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return this.isPure;
    }
}
