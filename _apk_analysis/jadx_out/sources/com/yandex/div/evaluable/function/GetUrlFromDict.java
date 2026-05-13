package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GetUrlFromDict extends UrlFromDict {

    @NotNull
    public static final GetUrlFromDict INSTANCE = new GetUrlFromDict();

    @NotNull
    private static final String name = "getUrlFromDict";

    private GetUrlFromDict() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
