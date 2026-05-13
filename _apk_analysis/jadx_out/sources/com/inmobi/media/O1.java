package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.VideoExperience;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class O1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Yb f26060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26061e;

    public O1(VideoExperience videoExperience, AdConfig.VideoPlayerAudioConfig videoPlayerAudioConfig) {
        Yb yb2;
        Yb yb3;
        tn.p.k(videoExperience, "videoExperience");
        tn.p.k(videoPlayerAudioConfig, "audioConfig");
        Boolean startMuted = videoExperience.getAudio().getStartMuted();
        this.f26057a = startMuted != null ? startMuted.booleanValue() : videoPlayerAudioConfig.getStartMuted();
        Integer muteIconWidth = videoExperience.getAudio().getMuteIconWidth();
        this.f26058b = muteIconWidth != null ? muteIconWidth.intValue() : videoPlayerAudioConfig.getMuteIconWidth();
        Integer muteIconHeight = videoExperience.getAudio().getMuteIconHeight();
        this.f26059c = muteIconHeight != null ? muteIconHeight.intValue() : videoPlayerAudioConfig.getMuteIconHeight();
        int[] muteIconMargin = videoExperience.getAudio().getMuteIconMargin();
        if (muteIconMargin != null) {
            tn.p.k(muteIconMargin, "<this>");
            if (muteIconMargin.length != 4) {
                yb3 = new Yb(0, 0, 0, 0);
            } else {
                yb2 = new Yb(muteIconMargin[0], muteIconMargin[1], muteIconMargin[2], muteIconMargin[3]);
                yb3 = yb2;
            }
        } else {
            List<Integer> muteIconMargin2 = videoPlayerAudioConfig.getMuteIconMargin();
            tn.p.k(muteIconMargin2, "<this>");
            if (muteIconMargin2.size() != 4) {
                yb3 = new Yb(0, 0, 0, 0);
            } else {
                yb2 = new Yb(muteIconMargin2.get(0).intValue(), muteIconMargin2.get(1).intValue(), muteIconMargin2.get(2).intValue(), muteIconMargin2.get(3).intValue());
                yb3 = yb2;
            }
        }
        this.f26060d = yb3;
        Integer muteIconPosition = videoExperience.getAudio().getMuteIconPosition();
        this.f26061e = muteIconPosition != null ? muteIconPosition.intValue() : videoPlayerAudioConfig.getMuteIconPosition();
    }
}
