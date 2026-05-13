package com.yandex.div.json;

import com.yandex.div.internal.parser.JsonTopologicalSorting;
import com.yandex.div.internal.parser.ParsingEnvironmentImpl;
import com.yandex.div.internal.parser.TemplateParsingErrorLogger;
import com.yandex.div.internal.util.CollectionsKt;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.templates.CachingTemplateProvider;
import com.yandex.div.json.templates.TemplateProvider;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: TemplateParsingEnvironment.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class TemplateParsingEnvironment<T extends JsonTemplate<?>> implements ParsingEnvironment {

    @NotNull
    private final ParsingErrorLogger logger;

    @NotNull
    private final CachingTemplateProvider<T> mainTemplateProvider;

    @NotNull
    private final TemplateProvider<T> templates;

    /* JADX INFO: compiled from: TemplateParsingEnvironment.kt */
    public interface TemplateFactory<T> {
        T create(@NotNull ParsingEnvironment parsingEnvironment, boolean z10, @NotNull JSONObject jSONObject) throws JSONException;
    }

    /* JADX INFO: compiled from: TemplateParsingEnvironment.kt */
    public static final class TemplateParsingResult<T> {

        @NotNull
        private final Map<String, T> parsedTemplates;

        @NotNull
        private final Map<String, Set<String>> templateDependencies;

        /* JADX WARN: Multi-variable type inference failed */
        public TemplateParsingResult(@NotNull Map<String, ? extends T> map, @NotNull Map<String, ? extends Set<String>> map2) {
            this.parsedTemplates = map;
            this.templateDependencies = map2;
        }

        @NotNull
        public final Map<String, T> getParsedTemplates() {
            return this.parsedTemplates;
        }
    }

    public TemplateParsingEnvironment(@NotNull ParsingErrorLogger parsingErrorLogger, @NotNull CachingTemplateProvider<T> cachingTemplateProvider) {
        this.logger = parsingErrorLogger;
        this.mainTemplateProvider = cachingTemplateProvider;
        this.templates = cachingTemplateProvider;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    @NotNull
    public ParsingErrorLogger getLogger() {
        return this.logger;
    }

    @NotNull
    public abstract TemplateFactory<T> getTemplateFactory();

    public final void parseTemplates(@NotNull JSONObject jSONObject) {
        this.mainTemplateProvider.putAll(parseTemplatesWithResult(jSONObject));
    }

    @NotNull
    public final Map<String, T> parseTemplatesWithResult(@NotNull JSONObject jSONObject) {
        return parseTemplatesWithResultAndDependencies(jSONObject).getParsedTemplates();
    }

    @NotNull
    public final TemplateParsingResult<T> parseTemplatesWithResultAndDependencies(@NotNull JSONObject jSONObject) {
        Map<String, T> mapArrayMap = CollectionsKt.arrayMap();
        Map mapArrayMap2 = CollectionsKt.arrayMap();
        try {
            Map<String, Set<String>> mapSort = JsonTopologicalSorting.INSTANCE.sort(this, jSONObject);
            this.mainTemplateProvider.takeSnapshot(mapArrayMap);
            TemplateProvider templateProviderWrap = TemplateProvider.Companion.wrap(mapArrayMap);
            for (Map.Entry<String, Set<String>> entry : mapSort.entrySet()) {
                String key = entry.getKey();
                Set<String> value = entry.getValue();
                try {
                    mapArrayMap.put(key, getTemplateFactory().create(new ParsingEnvironmentImpl(templateProviderWrap, new TemplateParsingErrorLogger(getLogger(), key)), true, jSONObject.getJSONObject(key)));
                    if (!value.isEmpty()) {
                        mapArrayMap2.put(key, value);
                    }
                } catch (ParsingException e10) {
                    getLogger().logTemplateError(e10, key);
                }
            }
        } catch (Exception e11) {
            getLogger().logError(e11);
        }
        return new TemplateParsingResult<>(mapArrayMap, mapArrayMap2);
    }
}
