package com.yandex.div.evaluable.function;

import cn.f0;
import cn.v;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Color;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: ColorFunctions.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class ColorComponentGetter extends Function {

    @NotNull
    private final l<Color, Integer> componentGetter;

    @NotNull
    private final List<FunctionArgument> declaredArgs;
    private final boolean isPure;

    @NotNull
    private final EvaluableType resultType;

    /* JADX WARN: Multi-variable type inference failed */
    public ColorComponentGetter(@NotNull l<? super Color, Integer> lVar) {
        p.k(lVar, "componentGetter");
        this.componentGetter = lVar;
        this.declaredArgs = v.e(new FunctionArgument(EvaluableType.COLOR, false, 2, null));
        this.resultType = EvaluableType.NUMBER;
        this.isPure = true;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo7374evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable evaluable, @NotNull List<? extends Object> list) {
        p.k(evaluationContext, "evaluationContext");
        p.k(evaluable, "expressionContext");
        p.k(list, "args");
        l<Color, Integer> lVar = this.componentGetter;
        Object objT0 = f0.t0(list);
        p.i(objT0, "null cannot be cast to non-null type com.yandex.div.evaluable.types.Color");
        return Double.valueOf(ColorFunctionsKt.toColorFloatComponentValue(lVar.invoke((Color) objT0).intValue()));
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
