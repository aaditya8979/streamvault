package com.yandex.mobile.ads.video.playback.model;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface VideoAd {
    @NotNull
    VideoAdInfo getAdInfo();

    @NotNull
    AdPodInfo getAdPodInfo();

    long getDuration();

    @NotNull
    VideoAdExtensions getExtensions();

    @Nullable
    String getInfo();

    @NotNull
    MediaFile getMediaFile();

    @NotNull
    List<MediaFile> getMediaFiles();

    @Nullable
    SkipInfo getSkipInfo();
}
