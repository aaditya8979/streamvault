package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ArrayGetInteger extends ArrayInteger {

    @NotNull
    public static final ArrayGetInteger INSTANCE = new ArrayGetInteger();

    @NotNull
    private static final String name = "getInteger";
    private static final boolean isMethod = true;

    private ArrayGetInteger() {
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
