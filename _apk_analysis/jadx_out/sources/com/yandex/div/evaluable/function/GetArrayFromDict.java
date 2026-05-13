package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GetArrayFromDict extends ArrayFromDict {

    @NotNull
    public static final GetArrayFromDict INSTANCE = new GetArrayFromDict();

    @NotNull
    private static final String name = "getArrayFromDict";

    private GetArrayFromDict() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
