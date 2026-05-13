package com.inmobi.ads;

import androidx.annotation.UiThread;

/* JADX INFO: loaded from: classes6.dex */
public interface PreloadManager {
    @UiThread
    void load();

    @UiThread
    void preload();
}
