package com.unity3d.ads.core.data.model.exception;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: ExposureException.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ExposureException extends Exception {

    @NotNull
    private final Object[] parameters;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposureException(@NotNull String str, @NotNull Object[] objArr) {
        super(str);
        p.k(str, "message");
        p.k(objArr, "parameters");
        this.parameters = objArr;
    }

    @NotNull
    public final Object[] getParameters() {
        return this.parameters;
    }
}
