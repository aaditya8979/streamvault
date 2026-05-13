package com.inmobi.media.ads.network.inmobiJson.model;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class VideoAudioExperience {

    @Nullable
    private Integer muteIconHeight;

    @Nullable
    private int[] muteIconMargin;

    @Nullable
    private Integer muteIconPosition;

    @Nullable
    private Integer muteIconWidth;

    @Nullable
    private final Boolean startMuted;

    @Nullable
    public final Integer getMuteIconHeight() {
        return this.muteIconHeight;
    }

    @Nullable
    public final int[] getMuteIconMargin() {
        return this.muteIconMargin;
    }

    @Nullable
    public final Integer getMuteIconPosition() {
        return this.muteIconPosition;
    }

    @Nullable
    public final Integer getMuteIconWidth() {
        return this.muteIconWidth;
    }

    @Nullable
    public final Boolean getStartMuted() {
        return this.startMuted;
    }
}
