package com.yandex.div.evaluable.function;

import cn.w;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class DictOptInteger extends Function {

    @NotNull
    private final List<FunctionArgument> declaredArgs;
    private final boolean isPure;

    @NotNull
    private final EvaluableType resultType;

    public DictOptInteger() {
        EvaluableType evaluableType = EvaluableType.INTEGER;
        this.declaredArgs = w.p(new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(EvaluableType.DICT, false, 2, null), new FunctionArgument(EvaluableType.STRING, true));
        this.resultType = evaluableType;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo7374evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable evaluable, @NotNull List<? extends Object> list) {
        p.k(evaluationContext, "evaluationContext");
        p.k(evaluable, "expressionContext");
        p.k(list, "args");
        Object obj = list.get(0);
        p.i(obj, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) obj).longValue();
        Object objEvaluateSafe$default = DictFunctionsKt.evaluateSafe$default(list, Long.valueOf(jLongValue), false, 4, null);
        if (objEvaluateSafe$default instanceof Integer) {
            jLongValue = ((Number) objEvaluateSafe$default).intValue();
        } else if (objEvaluateSafe$default instanceof Long) {
            jLongValue = ((Number) objEvaluateSafe$default).longValue();
        }
        return Long.valueOf(jLongValue);
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
