package com.yandex.div.state;

import androidx.annotation.AnyThread;
import bn.h;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InMemoryDivStateCache.kt */
/* JADX INFO: loaded from: classes10.dex */
@AnyThread
public final class InMemoryDivStateCache implements DivStateCache {
    private final Map<Pair<String, String>, String> states = Collections.synchronizedMap(new LinkedHashMap());
    private final Map<String, String> rootStates = Collections.synchronizedMap(new LinkedHashMap());

    @Override // com.yandex.div.state.DivStateCache
    @Nullable
    public String getRootState(@NotNull String str) {
        return this.rootStates.get(str);
    }

    @Override // com.yandex.div.state.DivStateCache
    @Nullable
    public String getState(@NotNull String str, @NotNull String str2) {
        return this.states.get(h.a(str, str2));
    }

    @Override // com.yandex.div.state.DivStateCache
    public void putRootState(@NotNull String str, @NotNull String str2) {
        this.rootStates.put(str, str2);
    }

    @Override // com.yandex.div.state.DivStateCache
    public void putState(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.states.put(h.a(str, str2), str3);
    }
}
