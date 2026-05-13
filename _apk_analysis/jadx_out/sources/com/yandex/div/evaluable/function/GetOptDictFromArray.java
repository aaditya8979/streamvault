package com.yandex.div.evaluable.function;

import cn.w;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import tn.p;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class GetOptDictFromArray extends ArrayFunction {

    @NotNull
    public static final GetOptDictFromArray INSTANCE = new GetOptDictFromArray();

    @NotNull
    private static final String name = "getOptDictFromArray";

    @NotNull
    private static final List<FunctionArgument> declaredArgs = w.p(new FunctionArgument(EvaluableType.ARRAY, false, 2, null), new FunctionArgument(EvaluableType.INTEGER, false, 2, null));

    private GetOptDictFromArray() {
        super(EvaluableType.DICT);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo7374evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable evaluable, @NotNull List<? extends Object> list) {
        p.k(evaluationContext, "evaluationContext");
        p.k(evaluable, "expressionContext");
        p.k(list, "args");
        Object objEvaluateArray$default = ArrayFunctionsKt.evaluateArray$default(getName(), list, false, 4, null);
        JSONObject jSONObject = objEvaluateArray$default instanceof JSONObject ? (JSONObject) objEvaluateArray$default : null;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.yandex.div.evaluable.function.ArrayFunction, com.yandex.div.evaluable.Function
    @NotNull
    public List<FunctionArgument> getDeclaredArgs() {
        return declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
