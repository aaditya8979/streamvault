package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class GetNumberFromArray extends ArrayNumber {

    @NotNull
    public static final GetNumberFromArray INSTANCE = new GetNumberFromArray();

    @NotNull
    private static final String name = "getNumberFromArray";

    private GetNumberFromArray() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
