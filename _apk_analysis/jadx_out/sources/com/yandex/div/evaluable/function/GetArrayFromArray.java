package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class GetArrayFromArray extends ArrayFromArray {

    @NotNull
    public static final GetArrayFromArray INSTANCE = new GetArrayFromArray();

    @NotNull
    private static final String name = "getArrayFromArray";

    private GetArrayFromArray() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
