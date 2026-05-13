package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class GetValues extends GetValuesFromDict {

    @NotNull
    public static final GetValues INSTANCE = new GetValues();

    @NotNull
    private static final String name = "getValues";
    private static final boolean isMethod = true;

    private GetValues() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
