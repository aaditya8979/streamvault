package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class GetDictOptBoolean extends DictOptBoolean {

    @NotNull
    public static final GetDictOptBoolean INSTANCE = new GetDictOptBoolean();

    @NotNull
    private static final String name = "getDictOptBoolean";

    private GetDictOptBoolean() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
