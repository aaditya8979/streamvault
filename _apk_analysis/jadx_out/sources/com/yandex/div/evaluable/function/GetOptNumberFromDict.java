package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class GetOptNumberFromDict extends DictOptNumber {

    @NotNull
    public static final GetOptNumberFromDict INSTANCE = new GetOptNumberFromDict();

    @NotNull
    private static final String name = "getOptNumberFromDict";

    private GetOptNumberFromDict() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
