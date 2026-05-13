package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GetOptStringFromDict extends DictOptString {

    @NotNull
    public static final GetOptStringFromDict INSTANCE = new GetOptStringFromDict();

    @NotNull
    private static final String name = "getOptStringFromDict";

    private GetOptStringFromDict() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
