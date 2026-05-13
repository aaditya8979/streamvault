package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class GetDictOptNumber extends DictOptNumber {

    @NotNull
    public static final GetDictOptNumber INSTANCE = new GetDictOptNumber();

    @NotNull
    private static final String name = "getDictOptNumber";

    private GetDictOptNumber() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
