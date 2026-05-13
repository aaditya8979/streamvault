package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class GetBooleanFromDict extends BooleanFromDict {

    @NotNull
    public static final GetBooleanFromDict INSTANCE = new GetBooleanFromDict();

    @NotNull
    private static final String name = "getBooleanFromDict";

    private GetBooleanFromDict() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
