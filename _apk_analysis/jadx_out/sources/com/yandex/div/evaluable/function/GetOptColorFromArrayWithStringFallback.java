package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class GetOptColorFromArrayWithStringFallback extends ArrayOptColorWithStringFallback {

    @NotNull
    public static final GetOptColorFromArrayWithStringFallback INSTANCE = new GetOptColorFromArrayWithStringFallback();

    @NotNull
    private static final String name = "getOptColorFromArray";

    private GetOptColorFromArrayWithStringFallback() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
