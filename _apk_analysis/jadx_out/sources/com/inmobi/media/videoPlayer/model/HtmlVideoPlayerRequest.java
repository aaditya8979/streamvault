package com.inmobi.media.videoPlayer.model;

import androidx.annotation.Keep;
import cn.w;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class HtmlVideoPlayerRequest {
    private boolean isCache;

    @NotNull
    private List<HtmlVideoFile> videoFiles = w.m();
    private long loadTimeout = 3000;

    @NotNull
    private HtmlVideoPlayerConfig config = new HtmlVideoPlayerConfig();

    @NotNull
    private List<HtmlOmidTracker> omidTrackers = w.m();

    @NotNull
    public final HtmlVideoPlayerConfig getConfig() {
        return this.config;
    }

    public final long getLoadTimeout() {
        return this.loadTimeout;
    }

    @NotNull
    public final List<HtmlOmidTracker> getOmidTrackers() {
        return this.omidTrackers;
    }

    @NotNull
    public final List<HtmlVideoFile> getVideoFiles() {
        return this.videoFiles;
    }

    public final boolean isCache() {
        return this.isCache;
    }

    public final void setCache(boolean z10) {
        this.isCache = z10;
    }

    public final void setConfig(@NotNull HtmlVideoPlayerConfig htmlVideoPlayerConfig) {
        p.k(htmlVideoPlayerConfig, "<set-?>");
        this.config = htmlVideoPlayerConfig;
    }

    public final void setLoadTimeout(long j10) {
        this.loadTimeout = j10;
    }

    public final void setOmidTrackers(@NotNull List<HtmlOmidTracker> list) {
        p.k(list, "<set-?>");
        this.omidTrackers = list;
    }

    public final void setVideoFiles(@NotNull List<HtmlVideoFile> list) {
        p.k(list, "<set-?>");
        this.videoFiles = list;
    }
}
