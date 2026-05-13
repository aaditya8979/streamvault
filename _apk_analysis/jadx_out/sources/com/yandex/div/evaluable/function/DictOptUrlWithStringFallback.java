package com.yandex.div.evaluable.function;

import cn.w;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Url;
import java.util.List;
import kotlin.KotlinNothingValueException;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class DictOptUrlWithStringFallback extends Function {

    @NotNull
    private final List<FunctionArgument> declaredArgs;
    private final boolean isPure;

    @NotNull
    private final EvaluableType resultType;

    public DictOptUrlWithStringFallback() {
        EvaluableType evaluableType = EvaluableType.STRING;
        this.declaredArgs = w.p(new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(EvaluableType.DICT, false, 2, null), new FunctionArgument(evaluableType, true));
        this.resultType = EvaluableType.URL;
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
        String str = (String) obj;
        Object objEvaluateSafe$default = DictFunctionsKt.evaluateSafe$default(list, str, false, 4, null);
        String strSafeConvertToUrl = ArrayFunctionsKt.safeConvertToUrl(objEvaluateSafe$default instanceof String ? (String) objEvaluateSafe$default : null);
        if (strSafeConvertToUrl != null || (strSafeConvertToUrl = ArrayFunctionsKt.safeConvertToUrl(str)) != null) {
            return Url.m7455boximpl(strSafeConvertToUrl);
        }
        DictFunctionsKt.throwDictException(getName(), list, "Unable to convert value to Url.");
        throw new KotlinNothingValueException();
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
