package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class GetArrayColor extends ArrayColor {

    @NotNull
    public static final GetArrayColor INSTANCE = new GetArrayColor();

    @NotNull
    private static final String name = "getArrayColor";

    private GetArrayColor() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
