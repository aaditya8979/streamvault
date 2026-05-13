package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class GetOptBooleanFromArray extends ArrayOptBoolean {

    @NotNull
    public static final GetOptBooleanFromArray INSTANCE = new GetOptBooleanFromArray();

    @NotNull
    private static final String name = "getOptBooleanFromArray";

    private GetOptBooleanFromArray() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
