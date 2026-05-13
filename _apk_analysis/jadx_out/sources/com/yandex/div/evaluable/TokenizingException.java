package com.yandex.div.evaluable;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: EvaluableException.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TokenizingException extends EvaluableException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenizingException(@NotNull String str, @Nullable Exception exc) {
        super(str, exc);
        p.k(str, "message");
    }

    public /* synthetic */ TokenizingException(String str, Exception exc, int i10, i iVar) {
        this(str, (i10 & 2) != 0 ? null : exc);
    }
}
