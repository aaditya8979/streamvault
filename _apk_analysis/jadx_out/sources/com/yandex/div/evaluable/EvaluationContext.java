package com.yandex.div.evaluable;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: EvaluationContext.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class EvaluationContext {

    @NotNull
    private final FunctionProvider functionProvider;

    @NotNull
    private final StoredValueProvider storedValueProvider;

    @NotNull
    private final VariableProvider variableProvider;

    @NotNull
    private final WarningSender warningSender;

    public EvaluationContext(@NotNull VariableProvider variableProvider, @NotNull StoredValueProvider storedValueProvider, @NotNull FunctionProvider functionProvider, @NotNull WarningSender warningSender) {
        p.k(variableProvider, "variableProvider");
        p.k(storedValueProvider, "storedValueProvider");
        p.k(functionProvider, "functionProvider");
        p.k(warningSender, "warningSender");
        this.variableProvider = variableProvider;
        this.storedValueProvider = storedValueProvider;
        this.functionProvider = functionProvider;
        this.warningSender = warningSender;
    }

    @NotNull
    public final FunctionProvider getFunctionProvider() {
        return this.functionProvider;
    }

    @NotNull
    public final StoredValueProvider getStoredValueProvider() {
        return this.storedValueProvider;
    }

    @NotNull
    public final VariableProvider getVariableProvider() {
        return this.variableProvider;
    }

    @NotNull
    public final WarningSender getWarningSender() {
        return this.warningSender;
    }
}
