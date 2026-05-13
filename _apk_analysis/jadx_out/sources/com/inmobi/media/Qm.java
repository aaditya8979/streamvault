package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.VideoExperience;
import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: loaded from: classes9.dex */
public final class Qm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f26208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Fg f26209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final O1 f26210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final In f26211e;

    public Qm(boolean z10, VideoExperience videoExperience, AdConfig.NativeConfig nativeConfig) {
        tn.p.k(videoExperience, "videoExperience");
        tn.p.k(nativeConfig, "nativeConfig");
        this.f26207a = z10;
        Boolean loopVideoOnComplete = videoExperience.getLoopVideoOnComplete();
        this.f26208b = loopVideoOnComplete != null ? loopVideoOnComplete.booleanValue() : nativeConfig.getVideoPlayerConfig().getLoopVideoOnComplete();
        this.f26209c = new Fg(videoExperience, nativeConfig.getVideoPlayerConfig().getLoopVideoOnComplete(), nativeConfig.getVideoPlayerConfig().getProgressConfig());
        this.f26210d = new O1(videoExperience, nativeConfig.getVideoPlayerConfig().getAudioConfig());
        this.f26211e = new In(nativeConfig.getVideoPlayerConfig().getViewability());
    }
}
