package com.yandex.div.evaluable;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: EvaluableException.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class IntegerOverflow extends EvaluableException {

    @NotNull
    private final String expression;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntegerOverflow(@NotNull String str, @Nullable Exception exc) {
        super("Failed to evaluate [" + str + "]. Integer overflow.", exc);
        p.k(str, "expression");
        this.expression = str;
    }

    public /* synthetic */ IntegerOverflow(String str, Exception exc, int i10, i iVar) {
        this(str, (i10 & 2) != 0 ? null : exc);
    }

    @NotNull
    public final String getExpression() {
        return this.expression;
    }
}
