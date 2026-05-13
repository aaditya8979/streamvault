package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class GetDictOptUrlWithStringFallback extends DictOptUrlWithStringFallback {

    @NotNull
    public static final GetDictOptUrlWithStringFallback INSTANCE = new GetDictOptUrlWithStringFallback();

    @NotNull
    private static final String name = "getDictOptUrl";

    private GetDictOptUrlWithStringFallback() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
