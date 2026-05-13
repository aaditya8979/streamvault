package com.yandex.div.evaluable;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: EvaluableException.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class MissingLocalFunctionException extends EvaluableException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingLocalFunctionException(@NotNull String str, @NotNull List<? extends EvaluableType> list) {
        super("Function '" + str + '(' + EvaluableExceptionKt.toMessageFormat((List<? extends Object>) list) + ")' is missing.", null, 2, null);
        p.k(str, "name");
        p.k(list, "args");
    }
}
