package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class GetOptColorFromDictWithColorFallback extends DictOptColorWithColorFallback {

    @NotNull
    public static final GetOptColorFromDictWithColorFallback INSTANCE = new GetOptColorFromDictWithColorFallback();

    @NotNull
    private static final String name = "getOptColorFromDict";

    private GetOptColorFromDictWithColorFallback() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
