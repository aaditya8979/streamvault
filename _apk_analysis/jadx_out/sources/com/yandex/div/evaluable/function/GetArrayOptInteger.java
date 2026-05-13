package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class GetArrayOptInteger extends ArrayOptInteger {

    @NotNull
    public static final GetArrayOptInteger INSTANCE = new GetArrayOptInteger();

    @NotNull
    private static final String name = "getArrayOptInteger";

    private GetArrayOptInteger() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
