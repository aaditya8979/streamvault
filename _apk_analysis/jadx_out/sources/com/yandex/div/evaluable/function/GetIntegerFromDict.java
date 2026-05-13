package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class GetIntegerFromDict extends DictInteger {

    @NotNull
    public static final GetIntegerFromDict INSTANCE = new GetIntegerFromDict();

    @NotNull
    private static final String name = "getIntegerFromDict";

    private GetIntegerFromDict() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
