package com.inmobi.media.ads.network.inmobiJson.model;

import androidx.annotation.Keep;
import com.inmobi.media.ads.network.common.model.TrackingInfo;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class Icon {

    @Nullable
    private final Link link;
    private final boolean required;

    @NotNull
    private final String url = "";

    @NotNull
    private final List<TrackingInfo> trackers = new ArrayList();

    @Nullable
    public final Link getLink() {
        return this.link;
    }

    public final boolean getRequired() {
        return this.required;
    }

    @NotNull
    public final List<TrackingInfo> getTrackers() {
        return this.trackers;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }
}
