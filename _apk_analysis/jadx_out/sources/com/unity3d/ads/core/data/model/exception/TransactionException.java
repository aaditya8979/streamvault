package com.unity3d.ads.core.data.model.exception;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: TransactionException.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class TransactionException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionException(@NotNull String str) {
        super(str);
        p.k(str, "message");
    }
}
