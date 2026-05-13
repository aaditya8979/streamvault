package com.yandex.div.json.templates;

import com.yandex.div.internal.util.CollectionsKt;
import com.yandex.div.json.JsonTemplate;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InMemoryTemplateProvider.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class InMemoryTemplateProvider<T extends JsonTemplate<?>> implements TemplateProvider<T> {

    @NotNull
    private final Map<String, T> templatesMap = CollectionsKt.arrayMap();

    @Override // com.yandex.div.json.templates.TemplateProvider
    @Nullable
    public T get(@NotNull String str) {
        return this.templatesMap.get(str);
    }

    public final void put$div_data_release(@NotNull String str, @NotNull T t10) {
        this.templatesMap.put(str, t10);
    }

    public final void takeSnapshot$div_data_release(@NotNull Map<String, T> map) {
        map.putAll(this.templatesMap);
    }
}
