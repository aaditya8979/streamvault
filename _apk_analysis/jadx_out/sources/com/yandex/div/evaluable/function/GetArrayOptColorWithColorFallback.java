package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class GetArrayOptColorWithColorFallback extends ArrayOptColorWithColorFallback {

    @NotNull
    public static final GetArrayOptColorWithColorFallback INSTANCE = new GetArrayOptColorWithColorFallback();

    @NotNull
    private static final String name = "getArrayOptColor";

    private GetArrayOptColorWithColorFallback() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
