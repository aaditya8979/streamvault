package com.inmobi.media.ads.network.inmobiJson.model;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class NativeMedia {

    @Nullable
    private final NativeImage image;

    @NotNull
    private String type = "";

    @Nullable
    private final NativeVideo video;

    public static /* synthetic */ void getType$annotations() {
    }

    @Nullable
    public final NativeImage getImage() {
        return this.image;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final NativeVideo getVideo() {
        return this.video;
    }
}
