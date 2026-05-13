package com.inmobi.media.ads.network.inmobiJson.model;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class VideoExperience {

    @Nullable
    private final Boolean loopVideoOnComplete;

    @NotNull
    private final VideoProgressConfig progress = new VideoProgressConfig();

    @NotNull
    private final VideoAudioExperience audio = new VideoAudioExperience();

    @NotNull
    public final VideoAudioExperience getAudio() {
        return this.audio;
    }

    @Nullable
    public final Boolean getLoopVideoOnComplete() {
        return this.loopVideoOnComplete;
    }

    @NotNull
    public final VideoProgressConfig getProgress() {
        return this.progress;
    }
}
