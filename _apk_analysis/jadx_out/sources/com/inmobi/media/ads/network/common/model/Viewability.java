package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Keep
public final class Viewability {

    @Nullable
    private final ViewabilityParams inmobi;

    @Nullable
    private final MRC50Params mrc50;

    @Nullable
    public final ViewabilityParams getInmobi() {
        return this.inmobi;
    }

    @Nullable
    public final MRC50Params getMrc50() {
        return this.mrc50;
    }
}
