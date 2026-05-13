package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: loaded from: classes9.dex */
public abstract class H {
    public static final int a(String str) {
        if (bo.a0.W(str, "track_", false, 2, null)) {
            str = str.substring(6);
            tn.p.j(str, "substring(...)");
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static final int a(String str, String str2, AdConfig adConfig) {
        return tn.p.f("video", str) ? tn.p.f("native", str2) ? adConfig.getNative().getViewabilityConfig().getImpressionConfig().getMinPercentageViewed() : adConfig.getViewability().getVideoImpressionMinPercentageViewed() : tn.p.f("audio", str) ? tn.p.f("audio", str2) ? adConfig.getViewability().getAudioImpressionMinPercentageViewed() : adConfig.getViewability().getWebImpressionMinPercentageViewed() : tn.p.f("native", str2) ? adConfig.getNative().getViewabilityConfig().getImpressionConfig().getMinPercentageViewed() : adConfig.getViewability().getWebImpressionMinPercentageViewed();
    }

    public static final int b(String str, String str2, AdConfig adConfig) {
        return tn.p.f("video", str) ? tn.p.f("native", str2) ? adConfig.getNative().getViewabilityConfig().getImpressionConfig().getVideoMinTimeViewed() : adConfig.getViewability().getVideoImpressionMinTimeViewed() : tn.p.f("audio", str) ? tn.p.f("audio", str2) ? adConfig.getViewability().getAudioImpressionMinTimeViewed() : adConfig.getViewability().getWebImpressionMinTimeViewed() : tn.p.f("native", str2) ? adConfig.getNative().getViewabilityConfig().getImpressionConfig().getMinTimeViewed() : adConfig.getViewability().getWebImpressionMinTimeViewed();
    }
}
