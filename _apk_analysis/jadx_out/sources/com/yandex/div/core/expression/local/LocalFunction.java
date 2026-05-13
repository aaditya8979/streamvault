package com.yandex.div.core.expression.local;

import cn.w;
import com.yandex.div.core.expression.variables.ConstantsProvider;
import com.yandex.div.core.expression.variables.VariableAndConstantController;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Evaluator;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.VariableProvider;
import java.util.LinkedHashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: LocalFunction.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class LocalFunction extends Function {

    @NotNull
    private final List<String> argNames;

    @NotNull
    private final List<FunctionArgument> declaredArgs;

    @NotNull
    private final Evaluable evaluable;
    private final boolean isPure;

    @NotNull
    private final String name;

    @NotNull
    private final EvaluableType resultType;

    public LocalFunction(@NotNull String str, @NotNull List<FunctionArgument> list, @NotNull EvaluableType evaluableType, @NotNull List<String> list2, @NotNull String str2) {
        this.name = str;
        this.declaredArgs = list;
        this.resultType = evaluableType;
        this.argNames = list2;
        this.evaluable = Evaluable.Companion.lazy(str2);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* JADX INFO: renamed from: evaluate-ex6DHhM, reason: not valid java name */
    public Object mo7374evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable evaluable, @NotNull List<? extends Object> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i10 = 0;
        for (Object obj : this.argNames) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                w.w();
            }
            linkedHashMap.put((String) obj, list.get(i10));
            i10 = i11;
        }
        VariableProvider variableProvider = evaluationContext.getVariableProvider();
        p.i(variableProvider, "null cannot be cast to non-null type com.yandex.div.core.expression.variables.VariableController");
        return new Evaluator(new EvaluationContext(new VariableAndConstantController((VariableController) variableProvider, new ConstantsProvider(linkedHashMap)), evaluationContext.getStoredValueProvider(), evaluationContext.getFunctionProvider(), evaluationContext.getWarningSender())).eval(this.evaluable);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public List<FunctionArgument> getDeclaredArgs() {
        return this.declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return this.name;
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
