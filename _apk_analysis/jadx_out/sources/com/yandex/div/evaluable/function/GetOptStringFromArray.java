package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class GetOptStringFromArray extends ArrayOptString {

    @NotNull
    public static final GetOptStringFromArray INSTANCE = new GetOptStringFromArray();

    @NotNull
    private static final String name = "getOptStringFromArray";

    private GetOptStringFromArray() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
