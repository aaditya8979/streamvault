package com.yandex.div.evaluable.function;

import cn.v;
import cn.w;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Evaluator;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.internal.Token;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: IntegerArithmeticFunctions.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class IntegerMul extends Function {

    @NotNull
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;

    @NotNull
    private static final EvaluableType resultType;

    @NotNull
    public static final IntegerMul INSTANCE = new IntegerMul();

    @NotNull
    private static final String name = "mul";

    static {
        EvaluableType evaluableType = EvaluableType.INTEGER;
        declaredArgs = v.e(new FunctionArgument(evaluableType, true));
        resultType = evaluableType;
        isPure = true;
    }

    private IntegerMul() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo7374evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable evaluable, @NotNull List<? extends Object> list) {
        p.k(evaluationContext, "evaluationContext");
        p.k(evaluable, "expressionContext");
        p.k(list, "args");
        Long lValueOf = 0L;
        int i10 = 0;
        for (Object objEvalFactor$div_evaluable : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                w.w();
            }
            long jLongValue = lValueOf.longValue();
            if (i10 != 0) {
                objEvalFactor$div_evaluable = Evaluator.Companion.evalFactor$div_evaluable(Token.Operator.Binary.Factor.Multiplication.INSTANCE, Long.valueOf(jLongValue), objEvalFactor$div_evaluable);
            }
            p.i(objEvalFactor$div_evaluable, "null cannot be cast to non-null type kotlin.Long");
            lValueOf = Long.valueOf(((Long) objEvalFactor$div_evaluable).longValue());
            i10 = i11;
        }
        return lValueOf;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public List<FunctionArgument> getDeclaredArgs() {
        return declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public EvaluableType getResultType() {
        return resultType;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return isPure;
    }
}
