package com.yandex.div.serialization;

import com.yandex.div.data.EntityTemplate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TemplateDeserializer.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface TemplateDeserializer<D, T extends EntityTemplate<?>> extends Deserializer<D, T> {
    @NotNull
    T deserialize(@NotNull ParsingContext parsingContext, @Nullable T t10, D d10);

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    default T deserialize(@NotNull ParsingContext parsingContext, D d10) {
        return (T) deserialize(parsingContext, null, d10);
    }
}
