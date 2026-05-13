package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class GetUrl extends UrlFromDict {

    @NotNull
    public static final GetUrl INSTANCE = new GetUrl();

    @NotNull
    private static final String name = "getUrl";
    private static final boolean isMethod = true;

    private GetUrl() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.UrlFromDict
    public boolean isMethod() {
        return isMethod;
    }
}
