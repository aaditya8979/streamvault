package com.yandex.div.evaluable.function;

import bn.r;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import kotlin.KotlinNothingValueException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import tn.p;
import vn.c;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class ArrayInteger extends ArrayFunction {
    public ArrayInteger() {
        super(EvaluableType.INTEGER);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo7374evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable evaluable, @NotNull List<? extends Object> list) throws JSONException {
        p.k(evaluationContext, "evaluationContext");
        p.k(evaluable, "expressionContext");
        p.k(list, "args");
        Object objEvaluateArray = ArrayFunctionsKt.evaluateArray(getName(), list, isMethod());
        if (objEvaluateArray instanceof Integer) {
            return Long.valueOf(((Number) objEvaluateArray).intValue());
        }
        if (objEvaluateArray instanceof Long) {
            return objEvaluateArray;
        }
        if (objEvaluateArray instanceof BigInteger) {
            ArrayFunctionsKt.throwArrayException$default(getName(), list, "Integer overflow.", false, 8, null);
            throw new KotlinNothingValueException();
        }
        if (objEvaluateArray instanceof BigDecimal) {
            ArrayFunctionsKt.throwArrayException$default(getName(), list, "Cannot convert value to integer.", false, 8, null);
            throw new KotlinNothingValueException();
        }
        if (!(objEvaluateArray instanceof Double)) {
            ArrayFunctionsKt.throwArrayWrongTypeException(getName(), list, getResultType(), objEvaluateArray, isMethod());
            return r.f5635a;
        }
        Number number = (Number) objEvaluateArray;
        if (number.doubleValue() < -9.223372036854776E18d || number.doubleValue() > 9.223372036854776E18d) {
            ArrayFunctionsKt.throwArrayException$default(getName(), list, "Integer overflow.", false, 8, null);
            throw new KotlinNothingValueException();
        }
        long jE = c.e(number.doubleValue());
        if (number.doubleValue() - ((double) jE) == 0.0d) {
            return Long.valueOf(jE);
        }
        ArrayFunctionsKt.throwArrayException$default(getName(), list, "Cannot convert value to integer.", false, 8, null);
        throw new KotlinNothingValueException();
    }
}
