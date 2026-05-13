package com.yandex.div.serialization;

import com.yandex.div.data.EntityTemplate;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TemplateResolver.kt */
/* JADX INFO: loaded from: classes9.dex */
public interface TemplateResolver<D, T extends EntityTemplate<V>, V> {
    V resolve(@NotNull ParsingContext parsingContext, @NotNull T t10, D d10);
}
