package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class GetUrlFromArray extends ArrayUrl {

    @NotNull
    public static final GetUrlFromArray INSTANCE = new GetUrlFromArray();

    @NotNull
    private static final String name = "getUrlFromArray";

    private GetUrlFromArray() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
