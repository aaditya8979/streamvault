package com.inmobi.media.ads.network.inmobiJson.model;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Keep
public final class InMobiJsonResponse {

    @Nullable
    private final JsonAssetObject assetsObject;

    @Nullable
    private final MainLink mainLink;

    @Nullable
    public final JsonAssetObject getAssetsObject() {
        return this.assetsObject;
    }

    @Nullable
    public final MainLink getMainLink() {
        return this.mainLink;
    }
}
