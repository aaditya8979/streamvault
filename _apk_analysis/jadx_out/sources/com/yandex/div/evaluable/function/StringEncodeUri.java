package com.yandex.div.evaluable.function;

import bo.a0;
import bo.c;
import cn.v;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: StringFunctions.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class StringEncodeUri extends Function {

    @NotNull
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;

    @NotNull
    private static final EvaluableType resultType;

    @NotNull
    public static final StringEncodeUri INSTANCE = new StringEncodeUri();

    @NotNull
    private static final String name = "encodeUri";

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        declaredArgs = v.e(new FunctionArgument(evaluableType, false, 2, null));
        resultType = evaluableType;
        isPure = true;
    }

    private StringEncodeUri() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo7374evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable evaluable, @NotNull List<? extends Object> list) throws UnsupportedEncodingException {
        p.k(evaluationContext, "evaluationContext");
        p.k(evaluable, "expressionContext");
        p.k(list, "args");
        Object obj = list.get(0);
        p.i(obj, "null cannot be cast to non-null type kotlin.String");
        String strEncode = URLEncoder.encode((String) obj, c.f5639b.name());
        p.j(strEncode, "encode(str, Charsets.UTF_8.name())");
        return a0.S(a0.S(a0.S(a0.S(a0.S(a0.S(strEncode, "+", "%20", false, 4, null), "%21", "!", false, 4, null), "%7E", "~", false, 4, null), "%27", "'", false, 4, null), "%28", "(", false, 4, null), "%29", ")", false, 4, null);
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
