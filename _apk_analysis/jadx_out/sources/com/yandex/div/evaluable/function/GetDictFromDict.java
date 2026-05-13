package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class GetDictFromDict extends DictFromDict {

    @NotNull
    public static final GetDictFromDict INSTANCE = new GetDictFromDict();

    @NotNull
    private static final String name = "getDictFromDict";

    private GetDictFromDict() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
