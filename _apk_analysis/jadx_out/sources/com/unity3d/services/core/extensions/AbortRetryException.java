package com.unity3d.services.core.extensions;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: TaskExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AbortRetryException extends Exception {

    @NotNull
    private final String reason;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbortRetryException(@NotNull String str) {
        super(str);
        p.k(str, "reason");
        this.reason = str;
    }
}
