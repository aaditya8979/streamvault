package com.yandex.div.evaluable.function;

import cn.w;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Url;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: VariableFunctions.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class GetUrlValueWithUrlFallback extends Function {

    @NotNull
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure = false;

    @NotNull
    private static final EvaluableType resultType;

    @NotNull
    public static final GetUrlValueWithUrlFallback INSTANCE = new GetUrlValueWithUrlFallback();

    @NotNull
    private static final String name = "getUrlValue";

    static {
        EvaluableType evaluableType = EvaluableType.URL;
        declaredArgs = w.p(new FunctionArgument(EvaluableType.STRING, false, 2, null), new FunctionArgument(evaluableType, false, 2, null));
        resultType = evaluableType;
    }

    private GetUrlValueWithUrlFallback() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo7374evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable evaluable, @NotNull List<? extends Object> list) {
        p.k(evaluationContext, "evaluationContext");
        p.k(evaluable, "expressionContext");
        p.k(list, "args");
        Object obj = list.get(0);
        p.i(obj, "null cannot be cast to non-null type kotlin.String");
        Object obj2 = evaluationContext.getVariableProvider().get((String) obj);
        String strM7461unboximpl = obj2 instanceof Url ? ((Url) obj2).m7461unboximpl() : null;
        if (strM7461unboximpl != null) {
            return Url.m7455boximpl(strM7461unboximpl);
        }
        Object obj3 = list.get(1);
        p.i(obj3, "null cannot be cast to non-null type com.yandex.div.evaluable.types.Url");
        return (Url) obj3;
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
