package com.inmobi.media.ads.network.inmobiJson.model;

import androidx.annotation.Keep;
import com.inmobi.media.ads.network.common.model.TrackingInfo;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class NativeVideo {
    private final boolean required;

    @NotNull
    private final String vastTag = "";

    @NotNull
    private final VideoExperience experience = new VideoExperience();

    @NotNull
    private final List<TrackingInfo> trackers = new ArrayList();

    @NotNull
    public final VideoExperience getExperience() {
        return this.experience;
    }

    public final boolean getRequired() {
        return this.required;
    }

    @NotNull
    public final List<TrackingInfo> getTrackers() {
        return this.trackers;
    }

    @NotNull
    public final String getVastTag() {
        return this.vastTag;
    }
}
