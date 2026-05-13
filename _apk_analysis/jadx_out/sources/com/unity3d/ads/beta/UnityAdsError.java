package com.unity3d.ads.beta;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: UnityAdsError.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class UnityAdsError {
    private final int code;

    @NotNull
    private final String message;

    public UnityAdsError(int i10, @NotNull String str) {
        p.k(str, "message");
        this.code = i10;
        this.message = str;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }
}
