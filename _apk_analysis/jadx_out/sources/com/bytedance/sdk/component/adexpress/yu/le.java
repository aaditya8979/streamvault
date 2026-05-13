package com.bytedance.sdk.component.adexpress.yu;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class le {
    public static boolean ouw(String str) {
        return com.bytedance.sdk.component.adexpress.yu.vt() && vt(str);
    }

    private static boolean vt(String str) {
        return TextUtils.equals(str, "fullscreen_interstitial_ad") || TextUtils.equals(str, "rewarded_video");
    }
}
