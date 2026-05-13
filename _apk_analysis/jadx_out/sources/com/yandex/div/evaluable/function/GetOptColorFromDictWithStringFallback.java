package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class GetOptColorFromDictWithStringFallback extends DictOptColorWithStringFallback {

    @NotNull
    public static final GetOptColorFromDictWithStringFallback INSTANCE = new GetOptColorFromDictWithStringFallback();

    @NotNull
    private static final String name = "getOptColorFromDict";

    private GetOptColorFromDictWithStringFallback() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
