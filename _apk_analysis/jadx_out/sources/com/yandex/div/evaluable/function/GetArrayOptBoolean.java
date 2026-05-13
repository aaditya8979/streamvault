package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class GetArrayOptBoolean extends ArrayOptBoolean {

    @NotNull
    public static final GetArrayOptBoolean INSTANCE = new GetArrayOptBoolean();

    @NotNull
    private static final String name = "getArrayOptBoolean";

    private GetArrayOptBoolean() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
