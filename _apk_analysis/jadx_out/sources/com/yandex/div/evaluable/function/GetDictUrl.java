package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class GetDictUrl extends UrlFromDict {

    @NotNull
    public static final GetDictUrl INSTANCE = new GetDictUrl();

    @NotNull
    private static final String name = "getDictUrl";

    private GetDictUrl() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
