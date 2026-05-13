package com.yandex.div.internal.parser;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ParsingValidators.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface ListValidator<T> {
    boolean isValid(@NotNull List<? extends T> list);
}
