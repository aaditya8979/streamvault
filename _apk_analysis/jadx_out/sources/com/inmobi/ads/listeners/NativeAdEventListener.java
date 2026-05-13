package com.inmobi.ads.listeners;

import com.inmobi.ads.InMobiNative;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes4.dex */
public abstract class NativeAdEventListener extends AdEventListener<InMobiNative> {
    public void onAdClicked(@NotNull InMobiNative inMobiNative) {
        p.k(inMobiNative, "ad");
    }

    public void onAdFullScreenDismissed(@NotNull InMobiNative inMobiNative) {
        p.k(inMobiNative, "ad");
    }

    public void onAdFullScreenDisplayed(@NotNull InMobiNative inMobiNative) {
        p.k(inMobiNative, "ad");
    }

    public void onUserWillLeaveApplication(@NotNull InMobiNative inMobiNative) {
        p.k(inMobiNative, "ad");
    }
}
