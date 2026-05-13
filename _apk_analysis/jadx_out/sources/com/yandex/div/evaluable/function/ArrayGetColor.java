package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ArrayGetColor extends ArrayColor {

    @NotNull
    public static final ArrayGetColor INSTANCE = new ArrayGetColor();

    @NotNull
    private static final String name = "getColor";
    private static final boolean isMethod = true;

    private ArrayGetColor() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.ArrayFunction
    public boolean isMethod() {
        return isMethod;
    }
}
