package com.yandex.div.evaluable.function;

import cn.w;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Color;
import java.util.List;
import kotlin.KotlinNothingValueException;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class ArrayOptColorWithStringFallback extends ArrayOptFunction {

    @NotNull
    private final List<FunctionArgument> declaredArgs;

    public ArrayOptColorWithStringFallback() {
        super(EvaluableType.COLOR);
        this.declaredArgs = w.p(new FunctionArgument(EvaluableType.ARRAY, false, 2, null), new FunctionArgument(EvaluableType.INTEGER, false, 2, null), new FunctionArgument(EvaluableType.STRING, false, 2, null));
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo7374evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable evaluable, @NotNull List<? extends Object> list) {
        p.k(evaluationContext, "evaluationContext");
        p.k(evaluable, "expressionContext");
        p.k(list, "args");
        Object objEvaluateSafe = ArrayFunctionsKt.evaluateSafe(getName(), list);
        Color colorSafeConvertToColor = ArrayFunctionsKt.safeConvertToColor(objEvaluateSafe instanceof String ? (String) objEvaluateSafe : null);
        if (colorSafeConvertToColor == null) {
            Object obj = list.get(2);
            p.i(obj, "null cannot be cast to non-null type kotlin.String");
            colorSafeConvertToColor = ArrayFunctionsKt.safeConvertToColor((String) obj);
            if (colorSafeConvertToColor == null) {
                ArrayFunctionsKt.throwArrayException$default(getName(), list, "Unable to convert value to Color, expected format #AARRGGBB.", false, 8, null);
                throw new KotlinNothingValueException();
            }
        }
        return colorSafeConvertToColor;
    }

    @Override // com.yandex.div.evaluable.function.ArrayOptFunction, com.yandex.div.evaluable.Function
    @NotNull
    public List<FunctionArgument> getDeclaredArgs() {
        return this.declaredArgs;
    }
}
