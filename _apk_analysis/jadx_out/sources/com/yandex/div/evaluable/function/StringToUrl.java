package com.yandex.div.evaluable.function;

import cn.f0;
import cn.v;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Url;
import java.util.List;
import kotlin.KotlinNothingValueException;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: ToUrl.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class StringToUrl extends Function {

    @NotNull
    public static final StringToUrl INSTANCE = new StringToUrl();

    @NotNull
    private static final String name = "toUrl";

    @NotNull
    private static final List<FunctionArgument> declaredArgs = v.e(new FunctionArgument(EvaluableType.STRING, false, 2, null));

    @NotNull
    private static final EvaluableType resultType = EvaluableType.URL;
    private static final boolean isPure = true;

    private StringToUrl() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo7374evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable evaluable, @NotNull List<? extends Object> list) {
        p.k(evaluationContext, "evaluationContext");
        p.k(evaluable, "expressionContext");
        p.k(list, "args");
        Object objT0 = f0.t0(list);
        p.i(objT0, "null cannot be cast to non-null type kotlin.String");
        try {
            return Url.m7455boximpl(Url.Companion.m7462fromVcSV9u8((String) objT0));
        } catch (IllegalArgumentException e10) {
            EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed(getName(), list, "Unable to convert value to Url.", e10);
            throw new KotlinNothingValueException();
        }
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
