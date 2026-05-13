package com.inmobi.media.ads.network.inmobiJson.model;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class AppMetrics {

    @Nullable
    private final Long downloads;

    @Nullable
    private final Long likes;

    @Nullable
    private final Float rating;

    @Nullable
    public final Long getDownloads() {
        return this.downloads;
    }

    @Nullable
    public final Long getLikes() {
        return this.likes;
    }

    @Nullable
    public final Float getRating() {
        return this.rating;
    }
}
