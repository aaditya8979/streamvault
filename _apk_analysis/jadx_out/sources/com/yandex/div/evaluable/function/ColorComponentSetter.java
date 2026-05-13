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
import sn.p;

/* JADX INFO: compiled from: ColorFunctions.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ColorComponentSetter extends Function {

    @NotNull
    private final p<Color, Double, Color> componentSetter;

    @NotNull
    private final List<FunctionArgument> declaredArgs;
    private final boolean isPure;

    @NotNull
    private final EvaluableType resultType;

    /* JADX WARN: Multi-variable type inference failed */
    public ColorComponentSetter(@NotNull p<? super Color, ? super Double, Color> pVar) {
        tn.p.k(pVar, "componentSetter");
        this.componentSetter = pVar;
        EvaluableType evaluableType = EvaluableType.COLOR;
        this.declaredArgs = w.p(new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(EvaluableType.NUMBER, false, 2, null));
        this.resultType = evaluableType;
        this.isPure = true;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo7374evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable evaluable, @NotNull List<? extends Object> list) {
        tn.p.k(evaluationContext, "evaluationContext");
        tn.p.k(evaluable, "expressionContext");
        tn.p.k(list, "args");
        Object obj = list.get(0);
        tn.p.i(obj, "null cannot be cast to non-null type com.yandex.div.evaluable.types.Color");
        int iM7452unboximpl = ((Color) obj).m7452unboximpl();
        Object obj2 = list.get(1);
        tn.p.i(obj2, "null cannot be cast to non-null type kotlin.Double");
        double dDoubleValue = ((Double) obj2).doubleValue();
        try {
            return Color.m7444boximpl(this.componentSetter.mo2invoke(Color.m7444boximpl(iM7452unboximpl), Double.valueOf(dDoubleValue)).m7452unboximpl());
        } catch (IllegalArgumentException unused) {
            EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(getName(), w.p(Color.m7451toStringimpl(iM7452unboximpl), Double.valueOf(dDoubleValue)), "Value out of range 0..1.", null, 8, null);
            throw new KotlinNothingValueException();
        }
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
