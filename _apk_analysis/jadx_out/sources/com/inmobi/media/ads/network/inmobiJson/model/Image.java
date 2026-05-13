package com.inmobi.media.ads.network.inmobiJson.model;

import androidx.annotation.Keep;
import com.inmobi.media.ads.network.common.model.TrackingInfo;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Keep
public final class Image {
    private int height;

    @Nullable
    private final Link link;
    private int width;

    @NotNull
    private final String url = "";

    @NotNull
    private final List<TrackingInfo> trackers = new ArrayList();

    public final int getHeight() {
        return this.height;
    }

    @Nullable
    public final Link getLink() {
        return this.link;
    }

    @NotNull
    public final List<TrackingInfo> getTrackers() {
        return this.trackers;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }
}
