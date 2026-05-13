package com.mgs.carparking.netbean;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DownloadListener.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface DownloadListener {
    long getLength();

    @Nullable
    String getLocalPath();

    @Nullable
    String getUrl();

    void onCanceled();

    void onFailed();

    void onPaused();

    void onSuccess();

    void setLength(long j10);

    void setProgress(int i10);
}
