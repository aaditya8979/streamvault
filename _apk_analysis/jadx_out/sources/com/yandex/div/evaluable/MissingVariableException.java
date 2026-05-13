package com.yandex.div.evaluable;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: EvaluableException.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class MissingVariableException extends EvaluableException {

    @NotNull
    private final String variableName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingVariableException(@NotNull String str, @Nullable Exception exc) {
        super("Variable '" + str + "' is missing.", exc);
        p.k(str, "variableName");
        this.variableName = str;
    }

    public /* synthetic */ MissingVariableException(String str, Exception exc, int i10, i iVar) {
        this(str, (i10 & 2) != 0 ? null : exc);
    }

    @NotNull
    public final String getVariableName() {
        return this.variableName;
    }
}
