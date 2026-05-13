package com.yandex.div.storage.analytics;

import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.storage.templates.TemplatesContainer;
import com.yandex.div.storage.util.CardErrorTransformer;
import org.jetbrains.annotations.NotNull;
import tn.i;

/* JADX INFO: compiled from: TemplateCardErrorTransformer.kt */
/* JADX INFO: loaded from: classes6.dex */
public class TemplateCardErrorTransformer implements CardErrorTransformer {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final ParsingErrorLogger internalLogger;

    @NotNull
    private final TemplatesContainer templateContainer;

    /* JADX INFO: compiled from: TemplateCardErrorTransformer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public TemplateCardErrorTransformer(@NotNull TemplatesContainer templatesContainer, @NotNull ParsingErrorLogger parsingErrorLogger) {
        this.templateContainer = templatesContainer;
        this.internalLogger = parsingErrorLogger;
    }
}
