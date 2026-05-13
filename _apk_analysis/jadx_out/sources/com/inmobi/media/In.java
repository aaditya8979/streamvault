package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: loaded from: classes8.dex */
public final class In {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3900z5 f25673c;

    public In(AdConfig.VideoPlayerViewabilityConfig videoPlayerViewabilityConfig) {
        tn.p.k(videoPlayerViewabilityConfig, "viewableConfig");
        this.f25671a = videoPlayerViewabilityConfig.getMinPercentageVisible();
        this.f25672b = videoPlayerViewabilityConfig.getPollingInterval();
        this.f25673c = AbstractC3468hl.a(videoPlayerViewabilityConfig.getMinDimensions());
    }
}
