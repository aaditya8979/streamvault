package com.safedk.android.utils;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes3.dex */
public class SafeDKMaxSimulator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f53064a = "SafeDKMaxSimulator";

    public static void resetRedirectSimulationMode() {
        Logger.d(f53064a, "reset redirect simulation mode");
        DetectTouchUtils.a();
        BrandSafetyUtils.i();
    }

    public static void setRedirectSimulationMode(String str, String str2) {
        Logger.d(f53064a, "set redirect simulation mode, ignore next touch event and intent, targetUrl: " + str + ", webview: " + str2);
        DetectTouchUtils.b(str2);
        BrandSafetyUtils.q(str);
    }

    public static boolean toggleIgnoreTouchEvents() {
        Logger.d(f53064a, "toggle ignore touch events");
        return DetectTouchUtils.b();
    }
}
