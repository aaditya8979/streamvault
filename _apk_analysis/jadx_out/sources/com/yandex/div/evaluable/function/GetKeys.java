package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class GetKeys extends GetKeysFromDict {

    @NotNull
    public static final GetKeys INSTANCE = new GetKeys();

    @NotNull
    private static final String name = "getKeys";
    private static final boolean isMethod = true;

    private GetKeys() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
