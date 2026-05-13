package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class GetNumber extends DictNumber {

    @NotNull
    public static final GetNumber INSTANCE = new GetNumber();

    @NotNull
    private static final String name = "getNumber";
    private static final boolean isMethod = true;

    private GetNumber() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.DictNumber
    public boolean isMethod() {
        return isMethod;
    }
}
