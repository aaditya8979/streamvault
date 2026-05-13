package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class GetDictFromArray extends ArrayDict {

    @NotNull
    public static final GetDictFromArray INSTANCE = new GetDictFromArray();

    @NotNull
    private static final String name = "getDictFromArray";

    private GetDictFromArray() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
