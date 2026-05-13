package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GetDictBoolean extends BooleanFromDict {

    @NotNull
    public static final GetDictBoolean INSTANCE = new GetDictBoolean();

    @NotNull
    private static final String name = "getDictBoolean";

    private GetDictBoolean() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
