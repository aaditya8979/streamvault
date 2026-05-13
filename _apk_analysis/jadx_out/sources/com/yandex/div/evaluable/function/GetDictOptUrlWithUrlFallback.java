package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class GetDictOptUrlWithUrlFallback extends DictOptUrlWithUrlFallback {

    @NotNull
    public static final GetDictOptUrlWithUrlFallback INSTANCE = new GetDictOptUrlWithUrlFallback();

    @NotNull
    private static final String name = "getDictOptUrl";

    private GetDictOptUrlWithUrlFallback() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
