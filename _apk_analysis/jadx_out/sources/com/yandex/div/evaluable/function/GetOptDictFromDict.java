package com.yandex.div.evaluable.function;

import cn.w;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import tn.p;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class GetOptDictFromDict extends Function {

    @NotNull
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure = false;

    @NotNull
    private static final EvaluableType resultType;

    @NotNull
    public static final GetOptDictFromDict INSTANCE = new GetOptDictFromDict();

    @NotNull
    private static final String name = "getOptDictFromDict";

    static {
        EvaluableType evaluableType = EvaluableType.DICT;
        declaredArgs = w.p(new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(EvaluableType.STRING, true));
        resultType = evaluableType;
    }

    private GetOptDictFromDict() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo7374evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable evaluable, @NotNull List<? extends Object> list) {
        p.k(evaluationContext, "evaluationContext");
        p.k(evaluable, "expressionContext");
        p.k(list, "args");
        JSONObject jSONObject = new JSONObject();
        Object objEvaluateSafe = DictFunctionsKt.evaluateSafe(list, jSONObject, true);
        JSONObject jSONObject2 = objEvaluateSafe instanceof JSONObject ? (JSONObject) objEvaluateSafe : null;
        return jSONObject2 == null ? jSONObject : jSONObject2;
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
