package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class GetOptUrlFromDictWithUrlFallback extends DictOptUrlWithUrlFallback {

    @NotNull
    public static final GetOptUrlFromDictWithUrlFallback INSTANCE = new GetOptUrlFromDictWithUrlFallback();

    @NotNull
    private static final String name = "getOptUrlFromDict";

    private GetOptUrlFromDictWithUrlFallback() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
