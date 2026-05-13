package com.inmobi.media.ads.network.inmobiJson.model;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Keep
public final class VideoProgressConfig {

    @Nullable
    private int[] color;

    @Nullable
    private Integer height;

    @Nullable
    private final Boolean showProgress;

    @Nullable
    public final int[] getColor() {
        return this.color;
    }

    @Nullable
    public final Integer getHeight() {
        return this.height;
    }

    @Nullable
    public final Boolean getShowProgress() {
        return this.showProgress;
    }
}
