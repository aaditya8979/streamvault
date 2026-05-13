package com.yandex.div.core;

import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.view2.Div2View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DivIdLoggingImageDownloadCallback.kt */
/* JADX INFO: loaded from: classes2.dex */
public class DivIdLoggingImageDownloadCallback extends DivImageDownloadCallback {

    @NotNull
    private final String divId;

    public DivIdLoggingImageDownloadCallback(@NotNull Div2View div2View) {
        this(div2View.getLogId());
    }

    public DivIdLoggingImageDownloadCallback(@NotNull String str) {
        this.divId = str;
    }
}
