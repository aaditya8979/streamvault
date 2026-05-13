package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class GetDictString extends DictString {

    @NotNull
    public static final GetDictString INSTANCE = new GetDictString();

    @NotNull
    private static final String name = "getDictString";

    private GetDictString() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
