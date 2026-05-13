package com.yandex.div.internal.parser;

import com.yandex.div.json.ParsingErrorLogger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TemplateParsingErrorLogger.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class TemplateParsingErrorLogger implements ParsingErrorLogger {

    @NotNull
    private final ParsingErrorLogger logger;

    @NotNull
    private final String templateId;

    public TemplateParsingErrorLogger(@NotNull ParsingErrorLogger parsingErrorLogger, @NotNull String str) {
        this.logger = parsingErrorLogger;
        this.templateId = str;
    }

    @Override // com.yandex.div.json.ParsingErrorLogger
    public void logError(@NotNull Exception exc) {
        this.logger.logTemplateError(exc, this.templateId);
    }
}
