package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes.dex */
public final class GetDictInteger extends DictInteger {

    @NotNull
    public static final GetDictInteger INSTANCE = new GetDictInteger();

    @NotNull
    private static final String name = "getDictInteger";

    private GetDictInteger() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
