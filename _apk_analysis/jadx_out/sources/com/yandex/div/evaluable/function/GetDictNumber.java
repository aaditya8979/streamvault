package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class GetDictNumber extends DictNumber {

    @NotNull
    public static final GetDictNumber INSTANCE = new GetDictNumber();

    @NotNull
    private static final String name = "getDictNumber";

    private GetDictNumber() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
