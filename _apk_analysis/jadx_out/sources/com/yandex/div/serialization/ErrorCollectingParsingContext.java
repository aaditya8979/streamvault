package com.yandex.div.serialization;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.templates.TemplateProvider;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ParsingContext.kt */
/* JADX INFO: loaded from: classes3.dex */
final class ErrorCollectingParsingContext implements ParsingContext, ParsingContextWrapper {

    @NotNull
    private final ParsingContext baseContext;

    @NotNull
    private final List<Exception> errors = new ArrayList();

    @NotNull
    private final ParsingErrorLogger logger = new ParsingErrorLogger() { // from class: com.yandex.div.serialization.a
        @Override // com.yandex.div.json.ParsingErrorLogger
        public final void logError(Exception exc) {
            ErrorCollectingParsingContext.logger$lambda$0(this.f54010a, exc);
        }
    };

    public ErrorCollectingParsingContext(@NotNull ParsingContext parsingContext) {
        this.baseContext = parsingContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logger$lambda$0(ErrorCollectingParsingContext errorCollectingParsingContext, Exception exc) {
        errorCollectingParsingContext.errors.add(exc);
        errorCollectingParsingContext.getBaseContext().getLogger().logError(exc);
    }

    @Override // com.yandex.div.serialization.ParsingContext
    public boolean getAllowPropertyOverride() {
        return this.baseContext.getAllowPropertyOverride();
    }

    @Override // com.yandex.div.serialization.ParsingContextWrapper
    @NotNull
    public ParsingContext getBaseContext() {
        return this.baseContext;
    }

    @NotNull
    public final List<Exception> getErrors() {
        return this.errors;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    @NotNull
    public ParsingErrorLogger getLogger() {
        return this.logger;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    @NotNull
    public TemplateProvider<EntityTemplate<?>> getTemplates() {
        return this.baseContext.getTemplates();
    }
}
