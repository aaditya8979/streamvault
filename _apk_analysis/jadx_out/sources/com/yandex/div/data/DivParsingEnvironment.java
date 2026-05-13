package com.yandex.div.data;

import com.yandex.div.data.DivParsingEnvironment;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.TemplateParsingEnvironment;
import com.yandex.div.json.templates.CachingTemplateProvider;
import com.yandex.div.json.templates.InMemoryTemplateProvider;
import com.yandex.div.json.templates.TemplateProvider;
import com.yandex.div2.DivTemplate;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import tn.i;

/* JADX INFO: compiled from: DivParsingEnvironment.kt */
/* JADX INFO: loaded from: classes8.dex */
public class DivParsingEnvironment extends TemplateParsingEnvironment<DivTemplate> {

    @NotNull
    private final TemplateParsingEnvironment.TemplateFactory<DivTemplate> templateFactory;

    @NotNull
    private final CachingTemplateProvider<DivTemplate> templates;

    public DivParsingEnvironment(@NotNull ParsingErrorLogger parsingErrorLogger, @NotNull CachingTemplateProvider<DivTemplate> cachingTemplateProvider) {
        super(parsingErrorLogger, cachingTemplateProvider);
        this.templates = cachingTemplateProvider;
        this.templateFactory = new TemplateParsingEnvironment.TemplateFactory() { // from class: pg.a
            @Override // com.yandex.div.json.TemplateParsingEnvironment.TemplateFactory
            public final Object create(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) {
                return DivParsingEnvironment.templateFactory$lambda$0(parsingEnvironment, z10, jSONObject);
            }
        };
    }

    public /* synthetic */ DivParsingEnvironment(ParsingErrorLogger parsingErrorLogger, CachingTemplateProvider cachingTemplateProvider, int i10, i iVar) {
        this(parsingErrorLogger, (i10 & 2) != 0 ? new CachingTemplateProvider(new InMemoryTemplateProvider(), TemplateProvider.Companion.empty()) : cachingTemplateProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivTemplate templateFactory$lambda$0(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) {
        return DivTemplate.f57579a.a(parsingEnvironment, z10, jSONObject);
    }

    @Override // com.yandex.div.json.TemplateParsingEnvironment
    @NotNull
    public TemplateParsingEnvironment.TemplateFactory<DivTemplate> getTemplateFactory() {
        return this.templateFactory;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    @NotNull
    public CachingTemplateProvider<DivTemplate> getTemplates() {
        return this.templates;
    }
}
