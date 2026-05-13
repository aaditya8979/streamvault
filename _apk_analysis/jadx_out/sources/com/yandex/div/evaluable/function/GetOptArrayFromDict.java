package com.yandex.div.evaluable.function;

import cn.w;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import tn.p;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GetOptArrayFromDict extends Function {
    private static final boolean isPure = false;

    @NotNull
    public static final GetOptArrayFromDict INSTANCE = new GetOptArrayFromDict();

    @NotNull
    private static final String name = "getOptArrayFromDict";

    @NotNull
    private static final List<FunctionArgument> declaredArgs = w.p(new FunctionArgument(EvaluableType.DICT, false, 2, null), new FunctionArgument(EvaluableType.STRING, true));

    @NotNull
    private static final EvaluableType resultType = EvaluableType.ARRAY;

    private GetOptArrayFromDict() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo7374evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable evaluable, @NotNull List<? extends Object> list) {
        p.k(evaluationContext, "evaluationContext");
        p.k(evaluable, "expressionContext");
        p.k(list, "args");
        JSONArray jSONArray = new JSONArray();
        Object objEvaluateSafe = DictFunctionsKt.evaluateSafe(list, jSONArray, true);
        JSONArray jSONArray2 = objEvaluateSafe instanceof JSONArray ? (JSONArray) objEvaluateSafe : null;
        return jSONArray2 == null ? jSONArray : jSONArray2;
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
