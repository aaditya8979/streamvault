package com.yandex.div.core.state;

import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TabsStateCache.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class TabsStateCache {

    @NotNull
    private final Map<String, Map<String, Integer>> temporaryCache = new LinkedHashMap();

    @Nullable
    public final Integer getSelectedTab(@NotNull String str, @NotNull String str2) {
        Map<String, Integer> map = this.temporaryCache.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    public final void putSelectedTab(@NotNull String str, @NotNull String str2, int i10) {
        Map<String, Map<String, Integer>> map = this.temporaryCache;
        Map<String, Integer> linkedHashMap = map.get(str);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
            map.put(str, linkedHashMap);
        }
        linkedHashMap.put(str2, Integer.valueOf(i10));
    }
}
