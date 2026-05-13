package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public final class ContextData {

    @Nullable
    private final String advertisedContent;

    @Nullable
    private final Long bidderId;
    private final int casAdTypeId = -1;
    private final boolean enabled;

    @Nullable
    public final String getAdvertisedContent() {
        return this.advertisedContent;
    }

    @Nullable
    public final Long getBidderId() {
        return this.bidderId;
    }

    public final int getCasAdTypeId() {
        return this.casAdTypeId;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }
}
