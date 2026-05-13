package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class GetArrayUrl extends ArrayUrl {

    @NotNull
    public static final GetArrayUrl INSTANCE = new GetArrayUrl();

    @NotNull
    private static final String name = "getArrayUrl";

    private GetArrayUrl() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
