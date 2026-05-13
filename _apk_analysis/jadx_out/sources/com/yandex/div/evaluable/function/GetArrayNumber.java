package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class GetArrayNumber extends ArrayNumber {

    @NotNull
    public static final GetArrayNumber INSTANCE = new GetArrayNumber();

    @NotNull
    private static final String name = "getArrayNumber";

    private GetArrayNumber() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
