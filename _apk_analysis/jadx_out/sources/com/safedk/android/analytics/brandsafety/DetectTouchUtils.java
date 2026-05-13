package com.safedk.android.analytics.brandsafety;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.safedk.android.SafeDK;
import com.safedk.android.utils.Logger;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes5.dex */
public class DetectTouchUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f51720a = "DetectTouchUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashMap<String, u> f51721b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HashMap<String, u> f51722c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f51723d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f51724e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ExecutorService f51725f = Executors.newSingleThreadExecutor();

    public static u a(String str) {
        Logger.d(f51720a, "getLastTouchEvent is latestTouchEventBySdkMap contains " + str + "? " + f51721b.containsKey(str) + ", map = " + f51721b);
        if (!f51721b.containsKey(str) || f51721b.get(str) == null) {
            return null;
        }
        Logger.d(f51720a, "getLastTouchEvent returns " + f51721b.get(str));
        return f51721b.get(str);
    }

    public static u a(String str, String str2) {
        return f51722c.get(str + "_" + str2);
    }

    public static void a() {
        f51723d = null;
        Logger.d(f51720a, "reset ignore next touch event");
    }

    public static void activityOnTouch(String str, MotionEvent motionEvent) {
        try {
            if (motionEvent.getAction() != 0) {
                return;
            }
            Logger.d(f51720a, "activity on touch started, sdk: " + str + ", motion event: " + motionEvent + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            if (!(0 != motionEvent.getEventTime()) || motionEvent.getActionMasked() == 2) {
                return;
            }
            b(null, str);
        } catch (Throwable th2) {
            Logger.d(f51720a, "error in activity on touch", th2);
        }
    }

    public static void b(final String str) {
        if (com.safedk.android.utils.k.c()) {
            f51725f.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.DetectTouchUtils.2
                @Override // java.lang.Runnable
                public void run() {
                    DetectTouchUtils.e(str);
                }
            });
        } else {
            e(str);
        }
    }

    public static void b(final String str, final String str2) {
        if (com.safedk.android.utils.k.c()) {
            f51725f.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.DetectTouchUtils.1
                @Override // java.lang.Runnable
                public void run() {
                    DetectTouchUtils.d(str, str2);
                }
            });
        } else {
            d(str, str2);
        }
    }

    public static boolean b() {
        f51724e = !f51724e;
        Logger.d(f51720a, "toggle ignore touch events: " + f51724e);
        return f51724e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str, String str2) {
        if (SafeDK.P() && (f51724e || (f51723d != null && str != null && f51723d.contains(str)))) {
            Logger.d(f51720a, "ignore touch event, sdk: " + str2 + ", view address: " + str + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            return;
        }
        u uVar = new u(Long.valueOf(SystemClock.elapsedRealtime()), Long.valueOf(System.currentTimeMillis()), str);
        f51721b.put(str2, uVar);
        Logger.d(f51720a, "Set latest touch event, setting sdk: " + str2 + ", details: " + uVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (str != null) {
            String str3 = str2 + "_" + str;
            f51722c.put(str3, uVar);
            Logger.d(f51720a, "Set latest touch event, setting key: " + str3 + ", details: " + uVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(String str) {
        if (SafeDK.P()) {
            f51723d = str;
            Logger.d(f51720a, "set ignore next touch event: " + f51723d + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            new Timer("RedirectSimulationTimer").schedule(new TimerTask() { // from class: com.safedk.android.analytics.brandsafety.DetectTouchUtils.3
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    String unused = DetectTouchUtils.f51723d = null;
                    Logger.d(DetectTouchUtils.f51720a, "timeout ignore next touch event");
                }
            }, SafeDK.getInstance().f());
        }
    }

    public static void viewOnTouch(String str, View view, MotionEvent motionEvent) {
        try {
            if (motionEvent.getAction() != 0) {
                return;
            }
            Logger.d(f51720a, "view on touch, started, sdkPackage = " + str + ", View = " + view + ", MotionEvent = " + motionEvent);
            if (str.equals(com.safedk.android.utils.g.f53127a) && (view instanceof MaxNativeAdView)) {
                String strB = NativeFinder.b((MaxNativeAdView) view);
                if (strB == null) {
                    strB = BannerFinder.a((MaxNativeAdView) view);
                }
                if (strB != null) {
                    try {
                        Logger.d(f51720a, "view on touch, translate Max native ad view to sdk: " + strB + ", view: " + view + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                        str = strB;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    Logger.d(f51720a, "view on touch, failed to translate Max native ad view to sdk, view: " + view);
                }
            } else if (view instanceof WebView) {
                Logger.d(f51720a, "web view on touch, sdk: " + str + ", view: " + view + ", motion event: " + motionEvent);
            } else if (view instanceof ViewGroup) {
                Logger.d(f51720a, "view group on touch, sdk: " + str + ", view: " + view + ", motion event: " + motionEvent);
            } else {
                Logger.d(f51720a, "view on touch, sdk: " + str + ", view: " + view + ", motion event: " + motionEvent);
            }
            b(view != null ? BrandSafetyUtils.a(view) : null, str);
            return;
        } catch (Throwable th3) {
            th = th3;
        }
        Logger.d(f51720a, "error in view on touch", th);
    }
}
