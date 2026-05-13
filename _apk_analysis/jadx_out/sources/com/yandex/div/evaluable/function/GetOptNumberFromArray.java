package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class GetOptNumberFromArray extends ArrayOptNumber {

    @NotNull
    public static final GetOptNumberFromArray INSTANCE = new GetOptNumberFromArray();

    @NotNull
    private static final String name = "getOptNumberFromArray";

    private GetOptNumberFromArray() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
