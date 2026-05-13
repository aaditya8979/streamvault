package com.yandex.div.evaluable.function;

import cn.v;
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
/* JADX INFO: loaded from: classes3.dex */
public final class GetDictLength extends Function {
    private static final boolean isPure = false;

    @NotNull
    public static final GetDictLength INSTANCE = new GetDictLength();

    @NotNull
    private static final String name = "len";

    @NotNull
    private static final List<FunctionArgument> declaredArgs = v.e(new FunctionArgument(EvaluableType.DICT, false, 2, null));

    @NotNull
    private static final EvaluableType resultType = EvaluableType.INTEGER;

    private GetDictLength() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo7374evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable evaluable, @NotNull List<? extends Object> list) {
        p.k(evaluationContext, "evaluationContext");
        p.k(evaluable, "expressionContext");
        p.k(list, "args");
        p.i(list.get(0), "null cannot be cast to non-null type org.json.JSONObject");
        return Long.valueOf(((JSONObject) r2).length());
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
