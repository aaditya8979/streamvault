package com.inmobi.ads.core;

import androidx.annotation.Keep;
import cn.w;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public final class TrackingInfo {

    @NotNull
    private final String imBaseUrl = "";

    @NotNull
    private final List<Trackers> trackers = w.m();

    @NotNull
    public final String getImBaseUrl() {
        return this.imBaseUrl;
    }

    @NotNull
    public final List<Trackers> getTrackers() {
        return this.trackers;
    }
}
