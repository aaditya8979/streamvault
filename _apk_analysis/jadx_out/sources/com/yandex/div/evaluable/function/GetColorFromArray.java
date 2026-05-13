package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class GetColorFromArray extends ArrayColor {

    @NotNull
    public static final GetColorFromArray INSTANCE = new GetColorFromArray();

    @NotNull
    private static final String name = "getColorFromArray";

    private GetColorFromArray() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
