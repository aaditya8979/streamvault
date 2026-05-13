package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class GetInteger extends DictInteger {

    @NotNull
    public static final GetInteger INSTANCE = new GetInteger();

    @NotNull
    private static final String name = "getInteger";
    private static final boolean isMethod = true;

    private GetInteger() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.DictInteger
    public boolean isMethod() {
        return isMethod;
    }
}
