package com.yandex.div.evaluable.function;

import cn.w;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Color;
import java.util.List;
import kotlin.KotlinNothingValueException;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: ColorFunctions.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ColorRgb extends Function {

    @NotNull
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;

    @NotNull
    private static final EvaluableType resultType;

    @NotNull
    public static final ColorRgb INSTANCE = new ColorRgb();

    @NotNull
    private static final String name = "rgb";

    static {
        EvaluableType evaluableType = EvaluableType.NUMBER;
        declaredArgs = w.p(new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(evaluableType, false, 2, null));
        resultType = EvaluableType.COLOR;
        isPure = true;
    }

    private ColorRgb() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo7374evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable evaluable, @NotNull List<? extends Object> list) {
        p.k(evaluationContext, "evaluationContext");
        p.k(evaluable, "expressionContext");
        p.k(list, "args");
        try {
            Object obj = list.get(0);
            p.i(obj, "null cannot be cast to non-null type kotlin.Double");
            int colorIntComponentValue = ColorFunctionsKt.toColorIntComponentValue(((Double) obj).doubleValue());
            Object obj2 = list.get(1);
            p.i(obj2, "null cannot be cast to non-null type kotlin.Double");
            int colorIntComponentValue2 = ColorFunctionsKt.toColorIntComponentValue(((Double) obj2).doubleValue());
            Object obj3 = list.get(2);
            p.i(obj3, "null cannot be cast to non-null type kotlin.Double");
            return Color.m7444boximpl(Color.Companion.m7453argbH0kstlE(255, colorIntComponentValue, colorIntComponentValue2, ColorFunctionsKt.toColorIntComponentValue(((Double) obj3).doubleValue())));
        } catch (IllegalArgumentException unused) {
            EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(getName(), list, "Value out of range 0..1.", null, 8, null);
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
