package com.fyber.inneractive.sdk.renderers;

import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes2.dex */
public enum k {
    BANNER_WIDTH(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE),
    BANNER_HEIGHT(50),
    BANNER_TABLET_HEIGHT(90),
    BANNER_TABLET_WIDTH(728),
    RECTANGLE_HEIGHT(250),
    RECTANGLE_WIDTH(300);

    public final int value;

    k(int i10) {
        this.value = i10;
    }
}
