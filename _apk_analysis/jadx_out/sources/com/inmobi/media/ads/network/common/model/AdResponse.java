package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import com.inmobi.media.Ue;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Keep
public final class AdResponse {

    @NotNull
    private String requestId = "";
    private final long placementId = -1;

    @Ue
    @NotNull
    private final List<AdSet> adSets = new ArrayList();

    @NotNull
    public final List<AdSet> getAdSets() {
        return this.adSets;
    }

    public final long getPlacementId() {
        return this.placementId;
    }

    @NotNull
    public final String getRequestId() {
        return this.requestId;
    }
}
