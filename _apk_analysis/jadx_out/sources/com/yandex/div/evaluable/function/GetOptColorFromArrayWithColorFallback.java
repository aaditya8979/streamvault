package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GetOptColorFromArrayWithColorFallback extends ArrayOptColorWithColorFallback {

    @NotNull
    public static final GetOptColorFromArrayWithColorFallback INSTANCE = new GetOptColorFromArrayWithColorFallback();

    @NotNull
    private static final String name = "getOptColorFromArray";

    private GetOptColorFromArrayWithColorFallback() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
