package com.moloco.sdk.internal.services.config.handlers;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.Init$SDKInitResponse;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 1)
public final class b implements a {
    @Override // com.moloco.sdk.internal.services.config.handlers.a
    @NotNull
    public Class<com.moloco.sdk.internal.configs.a> a() {
        return com.moloco.sdk.internal.configs.a.class;
    }

    @Override // com.moloco.sdk.internal.services.config.handlers.a
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.moloco.sdk.internal.configs.a a(@NotNull Init$SDKInitResponse init$SDKInitResponse) {
        p.k(init$SDKInitResponse, "sdkInitResponse");
        if (!init$SDKInitResponse.n()) {
            return com.moloco.sdk.internal.configs.b.a();
        }
        Init$SDKInitResponse.j jVarH = init$SDKInitResponse.h();
        String url = jVarH.getUrl();
        p.j(url, "getUrl(...)");
        return new com.moloco.sdk.internal.configs.a(url, jVarH.c());
    }
}
