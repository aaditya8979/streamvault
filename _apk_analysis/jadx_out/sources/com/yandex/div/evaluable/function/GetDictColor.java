package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class GetDictColor extends ColorFromDict {

    @NotNull
    public static final GetDictColor INSTANCE = new GetDictColor();

    @NotNull
    private static final String name = "getDictColor";

    private GetDictColor() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
