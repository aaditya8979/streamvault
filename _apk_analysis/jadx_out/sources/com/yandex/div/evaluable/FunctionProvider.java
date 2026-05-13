package com.yandex.div.evaluable;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FunctionProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface FunctionProvider {
    @NotNull
    Function get(@NotNull String str, @NotNull List<? extends EvaluableType> list);

    @NotNull
    Function getMethod(@NotNull String str, @NotNull List<? extends EvaluableType> list);
}
