package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class GetArray extends ArrayFromDict {

    @NotNull
    public static final GetArray INSTANCE = new GetArray();

    @NotNull
    private static final String name = "getArray";
    private static final boolean isMethod = true;

    private GetArray() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.ArrayFromDict
    public boolean isMethod() {
        return isMethod;
    }
}
