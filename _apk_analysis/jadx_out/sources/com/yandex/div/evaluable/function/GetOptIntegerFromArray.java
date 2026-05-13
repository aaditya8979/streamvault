package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class GetOptIntegerFromArray extends ArrayOptInteger {

    @NotNull
    public static final GetOptIntegerFromArray INSTANCE = new GetOptIntegerFromArray();

    @NotNull
    private static final String name = "getOptIntegerFromArray";

    private GetOptIntegerFromArray() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
