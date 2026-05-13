package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.VideoExperience;
import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: loaded from: classes6.dex */
public final class Fg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f25446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f25447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f25449f;

    public Fg(VideoExperience videoExperience, boolean z10, AdConfig.VideoPlayerProgressConfig videoPlayerProgressConfig) {
        tn.p.k(videoExperience, "videoExperience");
        tn.p.k(videoPlayerProgressConfig, "progressConfig");
        Boolean showProgress = videoExperience.getProgress().getShowProgress();
        this.f25444a = showProgress != null ? showProgress.booleanValue() : videoPlayerProgressConfig.getShowProgress();
        this.f25445b = !(videoExperience.getLoopVideoOnComplete() != null ? r0.booleanValue() : z10);
        int[] color = videoExperience.getProgress().getColor();
        this.f25446c = color == null ? cn.f0.f1(videoPlayerProgressConfig.getForegroundColor()) : color;
        this.f25447d = cn.f0.f1(videoPlayerProgressConfig.getBackgroundColor());
        Integer height = videoExperience.getProgress().getHeight();
        this.f25448e = height != null ? height.intValue() : videoPlayerProgressConfig.getHeight();
        this.f25449f = videoPlayerProgressConfig.getProgressPolling();
    }
}
