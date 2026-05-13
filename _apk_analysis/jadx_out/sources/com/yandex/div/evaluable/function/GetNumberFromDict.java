package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class GetNumberFromDict extends DictNumber {

    @NotNull
    public static final GetNumberFromDict INSTANCE = new GetNumberFromDict();

    @NotNull
    private static final String name = "getNumberFromDict";

    private GetNumberFromDict() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
