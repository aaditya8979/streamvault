package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class GetIntegerFromArray extends ArrayInteger {

    @NotNull
    public static final GetIntegerFromArray INSTANCE = new GetIntegerFromArray();

    @NotNull
    private static final String name = "getIntegerFromArray";

    private GetIntegerFromArray() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
