package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class GetOptUrlFromArrayWithStringFallback extends ArrayOptUrlWithStringFallback {

    @NotNull
    public static final GetOptUrlFromArrayWithStringFallback INSTANCE = new GetOptUrlFromArrayWithStringFallback();

    @NotNull
    private static final String name = "getOptUrlFromArray";

    private GetOptUrlFromArrayWithStringFallback() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
