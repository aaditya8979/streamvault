package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableExceptionKt;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: TrigonometricFunctions.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class TrigonometricFunctionsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object evaluateMathResult(double d10, String str, double d11) {
        if (!isValidTrigonometricResult$default(d10, 0.0d, 2, null)) {
            throwIncorrectMathValueException(str, d11);
        }
        return Double.valueOf(d10);
    }

    private static final boolean isValidTrigonometricResult(double d10, double d11) {
        return !Double.isNaN(d10) && Math.abs(d10) <= d11;
    }

    public static /* synthetic */ boolean isValidTrigonometricResult$default(double d10, double d11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            d11 = 1.0E10d;
        }
        return isValidTrigonometricResult(d10, d11);
    }

    private static final void throwIncorrectMathValueException(String str, double d10) {
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(str + '(' + d10 + ')', toMathFunctionDisplayName(str) + " is undefined for the given value.", null, 4, null);
        throw new KotlinNothingValueException();
    }

    private static final String toMathFunctionDisplayName(String str) {
        int iHashCode = str.hashCode();
        return iHashCode != 98696 ? iHashCode != 2988422 ? (iHashCode == 3003607 && str.equals("asin")) ? "Arcsine" : str : !str.equals("acos") ? str : "Arccosine" : !str.equals("cot") ? str : "Cotangent";
    }
}
