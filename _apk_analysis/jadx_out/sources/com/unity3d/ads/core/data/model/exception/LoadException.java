package com.unity3d.ads.core.data.model.exception;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: LoadException.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class LoadException extends Exception {
    private final int errorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadException(int i10, @NotNull String str) {
        super(str);
        p.k(str, "message");
        this.errorCode = i10;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}
