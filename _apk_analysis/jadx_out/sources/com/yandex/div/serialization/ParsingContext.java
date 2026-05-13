package com.yandex.div.serialization;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.templates.TemplateProvider;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ParsingContext.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface ParsingContext {
    default boolean getAllowPropertyOverride() {
        return true;
    }

    @NotNull
    ParsingErrorLogger getLogger();

    @NotNull
    TemplateProvider<EntityTemplate<?>> getTemplates();
}
