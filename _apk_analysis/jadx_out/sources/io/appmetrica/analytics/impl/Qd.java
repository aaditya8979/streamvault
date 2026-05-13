package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Qd implements InterfaceC5122t {
    @Override // io.appmetrica.analytics.impl.InterfaceC5122t
    @NotNull
    public final Map<String, String> a(@NotNull Map<String, String> map) {
        map.put(AdRevenueConstants.LAYER_KEY, "native");
        return map;
    }
}
