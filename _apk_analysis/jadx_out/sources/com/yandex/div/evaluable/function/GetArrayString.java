package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class GetArrayString extends ArrayString {

    @NotNull
    public static final GetArrayString INSTANCE = new GetArrayString();

    @NotNull
    private static final String name = "getArrayString";

    private GetArrayString() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
