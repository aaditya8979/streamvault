package com.moloco.sdk.internal;

import com.moloco.sdk.publisher.MolocoAdError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 {
    @NotNull
    public static final c0 a(@NotNull String str, @NotNull MolocoAdError.ErrorType errorType, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
        tn.p.k(str, "adUnitId");
        tn.p.k(errorType, "errorType");
        tn.p.k(cVar, "subErrorType");
        return new c0(new MolocoAdError("Moloco", str, errorType, null, 8, null), cVar);
    }
}
