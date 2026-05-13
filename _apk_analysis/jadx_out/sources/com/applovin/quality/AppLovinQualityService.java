package com.applovin.quality;

import com.safedk.android.SafeDK;

/* JADX INFO: loaded from: classes2.dex */
public class AppLovinQualityService {
    public static String getSdkKey() {
        return SafeDK.getSdkKey();
    }

    public static String getVersion() {
        return SafeDK.getVersion();
    }
}
