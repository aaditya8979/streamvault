package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class GetDictOptColorWithColorFallback extends DictOptColorWithColorFallback {

    @NotNull
    public static final GetDictOptColorWithColorFallback INSTANCE = new GetDictOptColorWithColorFallback();

    @NotNull
    private static final String name = "getDictOptColor";

    private GetDictOptColorWithColorFallback() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
