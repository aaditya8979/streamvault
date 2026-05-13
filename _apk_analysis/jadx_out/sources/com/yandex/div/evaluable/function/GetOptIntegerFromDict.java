package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class GetOptIntegerFromDict extends DictOptInteger {

    @NotNull
    public static final GetOptIntegerFromDict INSTANCE = new GetOptIntegerFromDict();

    @NotNull
    private static final String name = "getOptIntegerFromDict";

    private GetOptIntegerFromDict() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
