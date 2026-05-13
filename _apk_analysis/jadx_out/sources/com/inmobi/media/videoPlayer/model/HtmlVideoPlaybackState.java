package com.inmobi.media.videoPlayer.model;

import androidx.annotation.Keep;
import com.inmobi.media.EnumC3504j8;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class HtmlVideoPlaybackState {
    private float duration;
    private boolean isMuted;

    @Nullable
    private Long latency;

    @NotNull
    private String state;
    private float time;

    @Nullable
    private String videoUrl;

    public HtmlVideoPlaybackState() {
        EnumC3504j8[] enumC3504j8Arr = EnumC3504j8.f27392a;
        this.state = "loading";
    }

    public final float getDuration() {
        return this.duration;
    }

    @Nullable
    public final Long getLatency() {
        return this.latency;
    }

    @NotNull
    public final String getState() {
        return this.state;
    }

    public final float getTime() {
        return this.time;
    }

    @Nullable
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public final boolean isMuted() {
        return this.isMuted;
    }

    public final void setDuration(float f10) {
        this.duration = f10;
    }

    public final void setLatency(@Nullable Long l10) {
        this.latency = l10;
    }

    public final void setMuted(boolean z10) {
        this.isMuted = z10;
    }

    public final void setState(@NotNull String str) {
        p.k(str, "<set-?>");
        this.state = str;
    }

    public final void setTime(float f10) {
        this.time = f10;
    }

    public final void setVideoUrl(@Nullable String str) {
        this.videoUrl = str;
    }
}
