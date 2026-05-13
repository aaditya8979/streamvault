package com.inmobi.media.ads.network.inmobiJson.model;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Keep
public final class MainLink extends Link {

    @NotNull
    private String fallbackUrl = "";

    @NotNull
    public final String getFallbackUrl() {
        return this.fallbackUrl;
    }
}
