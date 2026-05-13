package com.inmobi.ads.listeners;

import com.inmobi.ads.AudioStatus;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiAudio;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AudioAdEventListener extends AdEventListener<InMobiAudio> {
    public void onAdDismissed(@NotNull InMobiAudio inMobiAudio) {
        p.k(inMobiAudio, "ad");
    }

    public void onAdDisplayFailed(@NotNull InMobiAudio inMobiAudio) {
        p.k(inMobiAudio, "ad");
    }

    public void onAdDisplayed(@NotNull InMobiAudio inMobiAudio) {
        p.k(inMobiAudio, "ad");
    }

    public void onAdFetchFailed(@NotNull InMobiAudio inMobiAudio, @NotNull InMobiAdRequestStatus inMobiAdRequestStatus) {
        p.k(inMobiAudio, "ad");
        p.k(inMobiAdRequestStatus, "status");
    }

    public void onAudioStatusChanged(@NotNull InMobiAudio inMobiAudio, @NotNull AudioStatus audioStatus) {
        p.k(inMobiAudio, "ad");
        p.k(audioStatus, "audioStatus");
    }

    public void onRewardsUnlocked(@NotNull InMobiAudio inMobiAudio, @NotNull Map<Object, ? extends Object> map) {
        p.k(inMobiAudio, "ad");
        p.k(map, "rewards");
    }

    public void onUserLeftApplication(@NotNull InMobiAudio inMobiAudio) {
        p.k(inMobiAudio, "ad");
    }
}
