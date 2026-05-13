package com.yandex.div.serialization;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.templates.TemplateProvider;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ParsingContext.kt */
/* JADX INFO: loaded from: classes3.dex */
final class OverrideRestrictingParsingContext implements ParsingContext, ParsingContextWrapper {

    @NotNull
    private final ParsingContext baseContext;

    public OverrideRestrictingParsingContext(@NotNull ParsingContext parsingContext) {
        this.baseContext = parsingContext;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    public boolean getAllowPropertyOverride() {
        return false;
    }

    @Override // com.yandex.div.serialization.ParsingContextWrapper
    @NotNull
    public ParsingContext getBaseContext() {
        return this.baseContext;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    @NotNull
    public ParsingErrorLogger getLogger() {
        return this.baseContext.getLogger();
    }

    @Override // com.yandex.div.serialization.ParsingContext
    @NotNull
    public TemplateProvider<EntityTemplate<?>> getTemplates() {
        return this.baseContext.getTemplates();
    }
}
