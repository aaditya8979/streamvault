package com.yandex.div.core.images;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public interface DivImageLoader {
    default Boolean hasSvgSupport() {
        return Boolean.FALSE;
    }

    @NonNull
    @MainThread
    LoadReference loadImage(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback);

    @NonNull
    @MainThread
    default LoadReference loadImage(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback, int i10) {
        return loadImage(str, divImageDownloadCallback);
    }

    @NonNull
    @MainThread
    LoadReference loadImageBytes(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback);

    @NonNull
    @MainThread
    default LoadReference loadImageBytes(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback, int i10) {
        return loadImageBytes(str, divImageDownloadCallback);
    }
}
