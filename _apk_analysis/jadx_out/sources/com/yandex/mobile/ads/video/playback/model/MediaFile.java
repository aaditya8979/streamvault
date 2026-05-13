package com.yandex.mobile.ads.video.playback.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.cf3;

/* JADX INFO: loaded from: classes7.dex */
public interface MediaFile extends cf3 {
    int getAdHeight();

    int getAdWidth();

    @Nullable
    String getApiFramework();

    @Nullable
    Integer getBitrate();

    @Nullable
    String getMediaType();

    @Override // yads.cf3
    @NotNull
    String getUrl();
}
