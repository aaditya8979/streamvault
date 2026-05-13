package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class GetDictValues extends GetValuesFromDict {

    @NotNull
    public static final GetDictValues INSTANCE = new GetDictValues();

    @NotNull
    private static final String name = "getDictValues";

    private GetDictValues() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
