package com.yandex.div.evaluable.function;

import cn.f0;
import cn.v;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: ToNumber.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class IntegerToNumber extends Function {

    @NotNull
    public static final IntegerToNumber INSTANCE = new IntegerToNumber();

    @NotNull
    private static final String name = "toNumber";

    @NotNull
    private static final List<FunctionArgument> declaredArgs = v.e(new FunctionArgument(EvaluableType.INTEGER, false, 2, null));

    @NotNull
    private static final EvaluableType resultType = EvaluableType.NUMBER;
    private static final boolean isPure = true;

    private IntegerToNumber() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo7374evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable evaluable, @NotNull List<? extends Object> list) {
        p.k(evaluationContext, "evaluationContext");
        p.k(evaluable, "expressionContext");
        p.k(list, "args");
        p.i(f0.t0(list), "null cannot be cast to non-null type kotlin.Long");
        return Double.valueOf(((Long) r2).longValue());
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
