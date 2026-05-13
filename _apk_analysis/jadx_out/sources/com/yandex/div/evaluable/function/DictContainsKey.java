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
/* JADX INFO: loaded from: classes5.dex */
public final class DictContainsKey extends Function {
    private static final boolean isPure = false;

    @NotNull
    public static final DictContainsKey INSTANCE = new DictContainsKey();

    @NotNull
    private static final String name = "containsKey";

    @NotNull
    private static final List<FunctionArgument> declaredArgs = w.p(new FunctionArgument(EvaluableType.DICT, false, 2, null), new FunctionArgument(EvaluableType.STRING, false, 2, null));

    @NotNull
    private static final EvaluableType resultType = EvaluableType.BOOLEAN;

    private DictContainsKey() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo7374evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable evaluable, @NotNull List<? extends Object> list) {
        p.k(evaluationContext, "evaluationContext");
        p.k(evaluable, "expressionContext");
        p.k(list, "args");
        Object obj = list.get(0);
        p.i(obj, "null cannot be cast to non-null type org.json.JSONObject");
        Object obj2 = list.get(1);
        p.i(obj2, "null cannot be cast to non-null type kotlin.String");
        return Boolean.valueOf(((JSONObject) obj).has((String) obj2));
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
