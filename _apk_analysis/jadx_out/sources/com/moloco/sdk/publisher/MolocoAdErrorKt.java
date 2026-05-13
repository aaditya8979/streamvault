package com.moloco.sdk.publisher;

import com.moloco.sdk.publisher.MolocoAdError;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes2.dex */
public final class MolocoAdErrorKt {
    @NotNull
    public static final MolocoAdError createAdErrorInfo(@NotNull String str, @NotNull MolocoAdError.ErrorType errorType) {
        p.k(str, "adUnitId");
        p.k(errorType, "errorType");
        return new MolocoAdError("Moloco", str, errorType, null, 8, null);
    }
}
