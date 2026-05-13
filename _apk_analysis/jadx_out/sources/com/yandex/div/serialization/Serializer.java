package com.yandex.div.serialization;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Serializer.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface Serializer<D, V> {
    D serialize(@NotNull ParsingContext parsingContext, V v10);
}
