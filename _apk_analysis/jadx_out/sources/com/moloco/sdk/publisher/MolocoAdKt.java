package com.moloco.sdk.publisher;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes5.dex */
public final class MolocoAdKt {
    @NotNull
    public static final MolocoAd createAdInfo(@NotNull String str, @Nullable Float f10, @Nullable String str2) {
        p.k(str, "adUnitId");
        return new MolocoAd("Moloco", str, f10, str2);
    }

    public static /* synthetic */ MolocoAd createAdInfo$default(String str, Float f10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        return createAdInfo(str, f10, str2);
    }
}
