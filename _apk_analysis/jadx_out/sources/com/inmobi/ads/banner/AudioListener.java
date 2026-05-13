package com.inmobi.ads.banner;

import com.inmobi.ads.AudioStatus;
import com.inmobi.ads.InMobiBanner;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public interface AudioListener {
    void onAudioStatusChanged(@NotNull InMobiBanner inMobiBanner, @NotNull AudioStatus audioStatus);
}
