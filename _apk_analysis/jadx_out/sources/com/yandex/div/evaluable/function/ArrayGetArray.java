package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ArrayGetArray extends ArrayFromArray {

    @NotNull
    public static final ArrayGetArray INSTANCE = new ArrayGetArray();

    @NotNull
    private static final String name = "getArray";
    private static final boolean isMethod = true;

    private ArrayGetArray() {
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
