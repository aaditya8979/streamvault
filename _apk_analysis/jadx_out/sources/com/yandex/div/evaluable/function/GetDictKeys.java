package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class GetDictKeys extends GetKeysFromDict {

    @NotNull
    public static final GetDictKeys INSTANCE = new GetDictKeys();

    @NotNull
    private static final String name = "getDictKeys";

    private GetDictKeys() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
