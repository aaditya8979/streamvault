package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class GetOptUrlFromDictWithStringFallback extends DictOptUrlWithStringFallback {

    @NotNull
    public static final GetOptUrlFromDictWithStringFallback INSTANCE = new GetOptUrlFromDictWithStringFallback();

    @NotNull
    private static final String name = "getOptUrlFromDict";

    private GetOptUrlFromDictWithStringFallback() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
