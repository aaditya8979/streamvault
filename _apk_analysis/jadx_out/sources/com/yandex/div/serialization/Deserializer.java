package com.yandex.div.serialization;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Deserializer.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface Deserializer<D, V> {
    V deserialize(@NotNull ParsingContext parsingContext, D d10);
}
