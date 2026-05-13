package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GetArrayOptUrlWithStringFallback extends ArrayOptUrlWithStringFallback {

    @NotNull
    public static final GetArrayOptUrlWithStringFallback INSTANCE = new GetArrayOptUrlWithStringFallback();

    @NotNull
    private static final String name = "getArrayOptUrl";

    private GetArrayOptUrlWithStringFallback() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
