package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class GetArrayOptString extends ArrayOptString {

    @NotNull
    public static final GetArrayOptString INSTANCE = new GetArrayOptString();

    @NotNull
    private static final String name = "getArrayOptString";

    private GetArrayOptString() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
