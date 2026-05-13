package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class GetColorFromDict extends ColorFromDict {

    @NotNull
    public static final GetColorFromDict INSTANCE = new GetColorFromDict();

    @NotNull
    private static final String name = "getColorFromDict";

    private GetColorFromDict() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
