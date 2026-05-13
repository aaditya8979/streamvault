package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.types.Color;
import java.util.List;
import kotlin.Result;
import kotlin.c;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class ArrayOptColorWithColorFallback extends ArrayOptFunction {
    public ArrayOptColorWithColorFallback() {
        super(EvaluableType.COLOR);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo7374evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable evaluable, @NotNull List<? extends Object> list) {
        Object objM7534constructorimpl;
        p.k(evaluationContext, "evaluationContext");
        p.k(evaluable, "expressionContext");
        p.k(list, "args");
        Object objEvaluateSafe = ArrayFunctionsKt.evaluateSafe(getName(), list);
        Color color = objEvaluateSafe instanceof Color ? (Color) objEvaluateSafe : null;
        if (color != null) {
            return color;
        }
        String str = objEvaluateSafe instanceof String ? (String) objEvaluateSafe : null;
        if (str != null) {
            try {
                Result.a aVar = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(Color.m7444boximpl(Color.Companion.m7454parseC4zCDoM(str)));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(c.a(th2));
            }
            obj = (Color) (Result.m7539isFailureimpl(objM7534constructorimpl) ? null : objM7534constructorimpl);
        }
        return obj == null ? list.get(2) : obj;
    }
}
