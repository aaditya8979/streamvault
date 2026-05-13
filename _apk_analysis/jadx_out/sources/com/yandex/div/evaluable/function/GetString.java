package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class GetString extends DictString {

    @NotNull
    public static final GetString INSTANCE = new GetString();

    @NotNull
    private static final String name = "getString";
    private static final boolean isMethod = true;

    private GetString() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.DictString
    public boolean isMethod() {
        return isMethod;
    }
}
