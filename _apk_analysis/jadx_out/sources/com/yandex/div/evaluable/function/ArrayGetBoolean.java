package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ArrayGetBoolean extends ArrayBoolean {

    @NotNull
    public static final ArrayGetBoolean INSTANCE = new ArrayGetBoolean();

    @NotNull
    private static final String name = "getBoolean";
    private static final boolean isMethod = true;

    private ArrayGetBoolean() {
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
