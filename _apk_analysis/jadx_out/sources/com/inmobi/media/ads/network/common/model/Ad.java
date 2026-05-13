package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import com.inmobi.media.A8;
import com.inmobi.media.Gg;
import com.inmobi.media.Hg;
import com.inmobi.media.O0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import tn.p;

/* JADX INFO: loaded from: classes12.dex */
@Keep
public final class Ad {

    @A8
    @Nullable
    private O0 _features;

    @A8
    @Nullable
    private Gg _pubContent;

    @Nullable
    private final AdQualityControl adQualityControl;
    private final boolean allowAutoRedirection;

    @Nullable
    private final String baseEventUrl;

    @Nullable
    private final String bidBundle;

    @Nullable
    private final ContextData contextData;

    @A8
    private long expiryTimestampInMillis;

    @Nullable
    private final MetaInfo metaInfo;

    /* JADX INFO: renamed from: sf, reason: collision with root package name */
    @Nullable
    private final String f26787sf;

    @A8
    private long insertionTimestampInMillis = System.currentTimeMillis();

    @NotNull
    private String markupType = "unknown";

    @NotNull
    private final String tracking = "unknown";

    @Nullable
    private Long expiry = -1L;

    @NotNull
    private final String creativeId = "";

    @NotNull
    private final String impressionId = "";

    @NotNull
    private final String telemetryMetadataBlob = "";

    @NotNull
    private final List<Viewability> viewability = new ArrayList();

    @NotNull
    private final JSONObject transaction = new JSONObject();

    @NotNull
    private final Map<String, String> rewards = new HashMap();

    @NotNull
    private String webVast = "";

    @NotNull
    private final List<Trackers> trackers = new ArrayList();

    @NotNull
    private final List<TrackingInfo> trackingInfo = new ArrayList();

    @NotNull
    private final String pubContent = "";

    public static /* synthetic */ void getMarkupType$annotations() {
    }

    public static /* synthetic */ void getTracking$annotations() {
    }

    @Nullable
    public final AdQualityControl getAdQualityControl() {
        return this.adQualityControl;
    }

    public final boolean getAllowAutoRedirection() {
        return this.allowAutoRedirection;
    }

    @Nullable
    public final String getBaseEventUrl() {
        return this.baseEventUrl;
    }

    @Nullable
    public final String getBidBundle() {
        return this.bidBundle;
    }

    @Nullable
    public final ContextData getContextData() {
        return this.contextData;
    }

    @NotNull
    public final String getCreativeId() {
        return this.creativeId;
    }

    @Nullable
    public final Long getExpiry() {
        return this.expiry;
    }

    public final long getExpiryTimestampInMillis() {
        return this.expiryTimestampInMillis;
    }

    @Nullable
    public final O0 getFeatures() {
        O0 o02 = this._features;
        if (o02 != null) {
            return o02;
        }
        String str = this.f26787sf;
        if (str == null) {
            return null;
        }
        O0 o03 = new O0(str);
        this._features = o03;
        return o03;
    }

    @NotNull
    public final String getImpressionId() {
        return this.impressionId;
    }

    public final long getInsertionTimestampInMillis() {
        return this.insertionTimestampInMillis;
    }

    @NotNull
    public final String getMarkupType() {
        return this.markupType;
    }

    @Nullable
    public final MetaInfo getMetaInfo() {
        return this.metaInfo;
    }

    @NotNull
    public final Gg getPubContent() throws IllegalStateException {
        Gg gg2 = this._pubContent;
        if (gg2 != null) {
            return gg2;
        }
        Gg ggA = Hg.a(this.pubContent, this.markupType);
        this._pubContent = ggA;
        return ggA;
    }

    @NotNull
    public final Map<String, String> getRewards() {
        return this.rewards;
    }

    @NotNull
    public final String getTelemetryMetadataBlob() {
        return this.telemetryMetadataBlob;
    }

    @NotNull
    public final List<Trackers> getTrackers$media_release() {
        return this.trackers;
    }

    @NotNull
    public final String getTracking() {
        return this.tracking;
    }

    @NotNull
    public final List<TrackingInfo> getTrackingInfo$media_release() {
        return this.trackingInfo;
    }

    @NotNull
    public final JSONObject getTransaction() {
        return this.transaction;
    }

    @NotNull
    public final List<Viewability> getViewability() {
        return this.viewability;
    }

    @NotNull
    public final String getWebVast() {
        return this.webVast;
    }

    public final void setExpiryTimestampInMillis(long j10) {
        this.expiryTimestampInMillis = j10;
    }

    public final void setInsertionTimestampInMillis(long j10) {
        this.insertionTimestampInMillis = j10;
    }

    public final void setWebVast(@NotNull String str) {
        p.k(str, "<set-?>");
        this.webVast = str;
    }
}
