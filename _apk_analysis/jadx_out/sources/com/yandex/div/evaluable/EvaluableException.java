package com.yandex.div.evaluable;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: EvaluableException.kt */
/* JADX INFO: loaded from: classes11.dex */
public class EvaluableException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EvaluableException(@NotNull String str, @Nullable Exception exc) {
        super(str, exc);
        p.k(str, "message");
    }

    public /* synthetic */ EvaluableException(String str, Exception exc, int i10, i iVar) {
        this(str, (i10 & 2) != 0 ? null : exc);
    }
}
