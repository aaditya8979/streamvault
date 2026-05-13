package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class TrackingInfo {

    @NotNull
    private final String imBaseUrl = "";

    @NotNull
    private final List<TrackersV2> trackers = new ArrayList();

    @NotNull
    public final String getImBaseUrl() {
        return this.imBaseUrl;
    }

    @NotNull
    public final List<TrackersV2> getTrackers() {
        return this.trackers;
    }
}
