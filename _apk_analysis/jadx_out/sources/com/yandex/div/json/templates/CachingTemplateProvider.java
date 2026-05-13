package com.yandex.div.json.templates;

import com.yandex.div.json.JsonTemplate;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CachingTemplateProvider.kt */
/* JADX INFO: loaded from: classes12.dex */
public class CachingTemplateProvider<T extends JsonTemplate<?>> implements TemplateProvider<T> {

    @NotNull
    private final InMemoryTemplateProvider<T> cacheProvider;

    @NotNull
    private TemplateProvider<? extends T> fallbackProvider;

    public CachingTemplateProvider(@NotNull InMemoryTemplateProvider<T> inMemoryTemplateProvider, @NotNull TemplateProvider<? extends T> templateProvider) {
        this.cacheProvider = inMemoryTemplateProvider;
        this.fallbackProvider = templateProvider;
    }

    @Override // com.yandex.div.json.templates.TemplateProvider
    @Nullable
    public T get(@NotNull String str) {
        T t10 = (T) this.cacheProvider.get(str);
        if (t10 != null) {
            return t10;
        }
        T t11 = (T) this.fallbackProvider.get(str);
        if (t11 == null) {
            return null;
        }
        this.cacheProvider.put$div_data_release(str, t11);
        return t11;
    }

    public void putAll(@NotNull Map<String, ? extends T> map) {
        for (Map.Entry<String, ? extends T> entry : map.entrySet()) {
            this.cacheProvider.put$div_data_release(entry.getKey(), entry.getValue());
        }
    }

    public void takeSnapshot(@NotNull Map<String, T> map) {
        this.cacheProvider.takeSnapshot$div_data_release(map);
    }
}
