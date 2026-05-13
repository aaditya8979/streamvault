package com.applovin.impl;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public abstract class n8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f9337a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f9341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static String f9342f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f9338b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f9339c = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicBoolean f9343g = new AtomicBoolean();

    static {
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.C0;
        if (kVar != null && ((Boolean) kVar.a(x4.f10705d4)).booleanValue() && e()) {
            f9337a = (String) a5.a(z4.M, "", com.applovin.impl.sdk.k.o());
        } else {
            f9337a = "";
            a5.b(z4.M, (Object) null, com.applovin.impl.sdk.k.o());
        }
    }

    public static String a() {
        String str;
        synchronized (f9338b) {
            str = f9337a;
        }
        return str;
    }

    public static void a(final com.applovin.impl.sdk.k kVar) {
        if (f9339c.getAndSet(true)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sc
            @Override // java.lang.Runnable
            public final void run() {
                n8.d(kVar);
            }
        });
    }

    public static String b() {
        return f9342f;
    }

    public static void b(com.applovin.impl.sdk.k kVar) {
        if (f9343g.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfoC = c(kVar);
        if (packageInfoC != null) {
            f9340d = packageInfoC.versionCode;
            f9341e = packageInfoC.versionName;
            f9342f = packageInfoC.packageName;
        } else {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("WebViewDataCollector", "Failed to get WebView package info");
            }
        }
    }

    private static PackageInfo c(com.applovin.impl.sdk.k kVar) {
        PackageManager packageManager = com.applovin.impl.sdk.k.o().getPackageManager();
        if (o0.g()) {
            return WebView.getCurrentWebViewPackage();
        }
        Iterator it = kVar.c(x4.f10802o4).iterator();
        while (it.hasNext()) {
            try {
                return packageManager.getPackageInfo((String) it.next(), 0);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static String c() {
        return f9341e;
    }

    public static int d() {
        return f9340d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(com.applovin.impl.sdk.k kVar) {
        try {
            synchronized (f9338b) {
                String defaultUserAgent = WebSettings.getDefaultUserAgent(com.applovin.impl.sdk.k.o());
                if (!TextUtils.isEmpty(defaultUserAgent)) {
                    f9337a = defaultUserAgent;
                    a5.b(z4.M, f9337a, com.applovin.impl.sdk.k.o());
                } else {
                    kVar.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        kVar.O().b("WebViewDataCollector", "Collected invalid user agent");
                    }
                    kVar.D().a(d2.f7996b1, "collectedInvalidUserAgent");
                }
            }
        } catch (Throwable th2) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("WebViewDataCollector", "Failed to collect user agent", th2);
            }
            kVar.D().a("WebViewDataCollector", "collectUserAgent", th2);
        }
    }

    private static boolean e() {
        boolean zIsValidString;
        synchronized (f9338b) {
            zIsValidString = StringUtils.isValidString((String) a5.a(z4.M, "", com.applovin.impl.sdk.k.o()));
        }
        return zIsValidString;
    }
}
