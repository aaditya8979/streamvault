package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public final class ViewabilityParams {
    private final byte type;

    @NotNull
    private final String view = "";

    @NotNull
    private final String time = "";

    @NotNull
    private final String pixel = "";

    @NotNull
    private final int[] frame = {0, 0, 0, 0};

    public static /* synthetic */ void getType$annotations() {
    }

    @NotNull
    public final int[] getFrame() {
        return this.frame;
    }

    @NotNull
    public final String getPixel() {
        return this.pixel;
    }

    @NotNull
    public final String getTime() {
        return this.time;
    }

    public final byte getType() {
        return this.type;
    }

    @NotNull
    public final String getView() {
        return this.view;
    }
}
