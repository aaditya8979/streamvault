package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class GetOptBooleanFromDict extends DictOptBoolean {

    @NotNull
    public static final GetOptBooleanFromDict INSTANCE = new GetOptBooleanFromDict();

    @NotNull
    private static final String name = "getOptBooleanFromDict";

    private GetOptBooleanFromDict() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
