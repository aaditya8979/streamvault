package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class GetBooleanFromArray extends ArrayBoolean {

    @NotNull
    public static final GetBooleanFromArray INSTANCE = new GetBooleanFromArray();

    @NotNull
    private static final String name = "getBooleanFromArray";

    private GetBooleanFromArray() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
