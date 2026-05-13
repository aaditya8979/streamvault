package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class GetArrayOptUrlWithUrlFallback extends ArrayOptUrlWithUrlFallback {

    @NotNull
    public static final GetArrayOptUrlWithUrlFallback INSTANCE = new GetArrayOptUrlWithUrlFallback();

    @NotNull
    private static final String name = "getArrayOptUrl";

    private GetArrayOptUrlWithUrlFallback() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
