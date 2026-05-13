package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class GetOptUrlFromArrayWithUrlFallback extends ArrayOptUrlWithUrlFallback {

    @NotNull
    public static final GetOptUrlFromArrayWithUrlFallback INSTANCE = new GetOptUrlFromArrayWithUrlFallback();

    @NotNull
    private static final String name = "getOptUrlFromArray";

    private GetOptUrlFromArrayWithUrlFallback() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
