package com.yandex.div.serialization;

import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.templates.TemplateProvider;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BuiltInParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class BuiltInParserKt {

    @NotNull
    private static final ParsingContext builtInParsingContext = new ParsingContext() { // from class: com.yandex.div.serialization.BuiltInParserKt$builtInParsingContext$1

        @NotNull
        private final TemplateProvider<JsonTemplate<?>> templates = TemplateProvider.Companion.empty();

        @NotNull
        private final ParsingErrorLogger logger = ParsingErrorLogger.LOG;

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
    };

    @NotNull
    private static final JsonParserComponent builtInParserComponent = new JsonParserComponent();

    @NotNull
    public static final JsonParserComponent getBuiltInParserComponent() {
        return builtInParserComponent;
    }

    @NotNull
    public static final ParsingContext getBuiltInParsingContext() {
        return builtInParsingContext;
    }
}
