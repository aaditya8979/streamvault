package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class GetArrayOptNumber extends ArrayOptNumber {

    @NotNull
    public static final GetArrayOptNumber INSTANCE = new GetArrayOptNumber();

    @NotNull
    private static final String name = "getArrayOptNumber";

    private GetArrayOptNumber() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
