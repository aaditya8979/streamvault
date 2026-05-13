package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class GetDictOptInteger extends DictOptInteger {

    @NotNull
    public static final GetDictOptInteger INSTANCE = new GetDictOptInteger();

    @NotNull
    private static final String name = "getDictOptInteger";

    private GetDictOptInteger() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
