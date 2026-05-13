package com.yandex.div.evaluable.function;

import bn.r;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import tn.p;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class ArrayNumber extends ArrayFunction {
    public ArrayNumber() {
        super(EvaluableType.NUMBER);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo7374evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable evaluable, @NotNull List<? extends Object> list) throws JSONException {
        p.k(evaluationContext, "evaluationContext");
        p.k(evaluable, "expressionContext");
        p.k(list, "args");
        Object objEvaluateArray = ArrayFunctionsKt.evaluateArray(getName(), list, isMethod());
        Number number = objEvaluateArray instanceof Number ? (Number) objEvaluateArray : null;
        if (number != null) {
            return Double.valueOf(number.doubleValue());
        }
        ArrayFunctionsKt.throwArrayWrongTypeException(getName(), list, getResultType(), objEvaluateArray, isMethod());
        return r.f5635a;
    }
}
