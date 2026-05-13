package com.inmobi.media.videoPlayer.model;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class HtmlVideoPlayerConfig {
    private boolean autoplay;
    private boolean muted;
    private float skipOffset;
    private boolean skippable;

    @Nullable
    private VideoViewPosition videoViewPosition;
    private boolean fullscreenEnabled = true;

    @NotNull
    private TrackPercentage trackPercentages = new TrackPercentage();
    private long playbackInterval = 1000;

    public final boolean getAutoplay() {
        return this.autoplay;
    }

    public final boolean getFullscreenEnabled() {
        return this.fullscreenEnabled;
    }

    public final boolean getMuted() {
        return this.muted;
    }

    public final long getPlaybackInterval() {
        return this.playbackInterval;
    }

    public final float getSkipOffset() {
        return this.skipOffset;
    }

    public final boolean getSkippable() {
        return this.skippable;
    }

    @NotNull
    public final TrackPercentage getTrackPercentages() {
        return this.trackPercentages;
    }

    @Nullable
    public final VideoViewPosition getVideoViewPosition() {
        return this.videoViewPosition;
    }

    public final void setAutoplay(boolean z10) {
        this.autoplay = z10;
    }

    public final void setFullscreenEnabled(boolean z10) {
        this.fullscreenEnabled = z10;
    }

    public final void setMuted(boolean z10) {
        this.muted = z10;
    }

    public final void setPlaybackInterval(long j10) {
        this.playbackInterval = j10;
    }

    public final void setSkipOffset(float f10) {
        this.skipOffset = f10;
    }

    public final void setSkippable(boolean z10) {
        this.skippable = z10;
    }

    public final void setTrackPercentages(@NotNull TrackPercentage trackPercentage) {
        p.k(trackPercentage, "<set-?>");
        this.trackPercentages = trackPercentage;
    }

    public final void setVideoViewPosition(@Nullable VideoViewPosition videoViewPosition) {
        this.videoViewPosition = videoViewPosition;
    }
}
