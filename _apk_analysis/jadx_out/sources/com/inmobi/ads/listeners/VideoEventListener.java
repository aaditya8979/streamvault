package com.inmobi.ads.listeners;

import com.inmobi.ads.InMobiNative;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes12.dex */
public abstract class VideoEventListener {
    public void onAudioStateChanged(@NotNull InMobiNative inMobiNative, boolean z10) {
        p.k(inMobiNative, "inMobiNative");
    }

    public void onVideoCompleted(@NotNull InMobiNative inMobiNative) {
        p.k(inMobiNative, "ad");
    }

    public void onVideoPaused(@NotNull InMobiNative inMobiNative) {
        p.k(inMobiNative, "ad");
    }

    public void onVideoResumed(@NotNull InMobiNative inMobiNative) {
        p.k(inMobiNative, "ad");
    }

    public void onVideoSkipped(@NotNull InMobiNative inMobiNative) {
        p.k(inMobiNative, "ad");
    }

    public void onVideoStarted(@NotNull InMobiNative inMobiNative) {
        p.k(inMobiNative, "ad");
    }
}
