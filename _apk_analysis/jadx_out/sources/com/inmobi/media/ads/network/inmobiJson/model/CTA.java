package com.inmobi.media.ads.network.inmobiJson.model;

import androidx.annotation.Keep;
import com.inmobi.media.ads.network.common.model.TrackingInfo;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Keep
public final class CTA {

    @Nullable
    private final Link link;
    private final boolean required;

    @NotNull
    private final String text = "";

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
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final List<TrackingInfo> getTrackers() {
        return this.trackers;
    }
}
