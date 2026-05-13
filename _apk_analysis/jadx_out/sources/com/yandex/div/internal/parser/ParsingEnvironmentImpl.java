package com.yandex.div.internal.parser;

import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.templates.TemplateProvider;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ParsingEnvironmentImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ParsingEnvironmentImpl implements ParsingEnvironment {

    @NotNull
    private final ParsingErrorLogger logger;

    @NotNull
    private final TemplateProvider<JsonTemplate<?>> templates;

    /* JADX WARN: Multi-variable type inference failed */
    public ParsingEnvironmentImpl(@NotNull TemplateProvider<? extends JsonTemplate<?>> templateProvider, @NotNull ParsingErrorLogger parsingErrorLogger) {
        this.templates = templateProvider;
        this.logger = parsingErrorLogger;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    @NotNull
    public ParsingErrorLogger getLogger() {
        return this.logger;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    @NotNull
    public TemplateProvider<JsonTemplate<?>> getTemplates() {
        return this.templates;
    }
}
