package com.safedk.android.analytics.brandsafety;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.C3978d4;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import java.net.URI;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes8.dex */
public class i implements com.safedk.android.internal.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f52583a = "ClickUrlsManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f52584b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f52585c = "https://play.google.com/store/apps/details?id=%s";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static i f52586d;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Object f52587l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static AtomicBoolean f52588m = new AtomicBoolean();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ScheduledExecutorService f52589n = Executors.newScheduledThreadPool(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f52590e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f52591f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f52592g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f52593h = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private AtomicBoolean f52595j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private AtomicInteger f52596k = new AtomicInteger(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Set<String> f52594i = new HashSet();

    /* JADX INFO: renamed from: com.safedk.android.analytics.brandsafety.i$3, reason: invalid class name */
    class AnonymousClass3 extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        AtomicInteger f52606a = new AtomicInteger(0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f52607b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f52608c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f52609d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f52610e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f52611f;

        AnonymousClass3(String str, AtomicBoolean atomicBoolean, String str2, String str3, String str4) {
            this.f52607b = str;
            this.f52608c = atomicBoolean;
            this.f52609d = str2;
            this.f52610e = str3;
            this.f52611f = str4;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, final String str) {
            final int iIncrementAndGet = this.f52606a.incrementAndGet();
            Logger.d(i.f52583a, "onPageFinished started. callbackCounter=" + iIncrementAndGet + ", url= " + str);
            new Handler().postDelayed(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.i.3.2
                @Override // java.lang.Runnable
                public void run() {
                    if (AnonymousClass3.this.f52606a.get() != iIncrementAndGet) {
                        Logger.d(i.f52583a, "onPageFinished resolveCounter.get() is not equal to callbackCounter. resolveCounter.get()=" + AnonymousClass3.this.f52606a.get() + ", callbackCounter=" + iIncrementAndGet);
                        return;
                    }
                    Logger.d(i.f52583a, "Landing page detected. is original url same as resolved ? " + AnonymousClass3.this.f52607b.equals(str) + " , url " + str);
                    AnonymousClass3.this.f52608c.set(true);
                    i.this.a(AnonymousClass3.this.f52607b, str, AnonymousClass3.this.f52609d, AnonymousClass3.this.f52610e, AnonymousClass3.this.f52611f, true);
                }
            }, 5000L);
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, final String str, Bitmap bitmap) {
            final int iIncrementAndGet = this.f52606a.incrementAndGet();
            Logger.d(i.f52583a, "onPageStarted started. callbackCounter=" + iIncrementAndGet + ", url= " + str);
            if (!str.equals(this.f52607b)) {
                new Handler().postDelayed(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.i.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (AnonymousClass3.this.f52606a.get() != iIncrementAndGet) {
                            Logger.d(i.f52583a, "onPageStarted resolveCounter.get() is not equal to callbackCounter. resolveCounter.get()=" + AnonymousClass3.this.f52606a.get() + ", callbackCounter=" + iIncrementAndGet);
                            return;
                        }
                        Logger.d(i.f52583a, "onPageFinished never called, assuming last onPageStarted is the landing page.");
                        Logger.d(i.f52583a, "Landing page detected: " + str);
                        AnonymousClass3.this.f52608c.set(true);
                        i.this.a(AnonymousClass3.this.f52607b, str, AnonymousClass3.this.f52609d, AnonymousClass3.this.f52610e, AnonymousClass3.this.f52611f, true);
                    }
                }, 60000L);
            }
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.d(i.f52583a, "onRenderProcessGone for view = " + webView.toString());
            this.f52608c.set(true);
            return true;
        }
    }

    private i() {
        com.safedk.android.internal.b.getInstance().registerBackgroundForegroundListener(this);
    }

    public static i a() {
        i iVar;
        synchronized (f52587l) {
            if (f52586d == null) {
                f52586d = new i();
            }
            iVar = f52586d;
        }
        return iVar;
    }

    public static String a(String str) {
        return com.safedk.android.utils.k.w(str) ? com.safedk.android.utils.k.y(str) : b(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, String str3, String str4, String str5, boolean z10) {
        try {
            Logger.d(f52583a, "reportResolvedUrlToServer started. originalUrl=" + str + ", resolvedUrl=" + str2 + ", fingerprint=" + str3 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            d();
            if (z10 && com.safedk.android.utils.k.w(str2)) {
                str2 = com.safedk.android.utils.k.x(a(str2));
            }
            Bundle bundle = new Bundle();
            bundle.putString(k.f52626a, str);
            bundle.putString(k.f52627b, str2);
            bundle.putString(k.f52628c, str3);
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("sdk_uuid", str4);
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString("impression_id", str5);
            }
            bundle.putString("package", SafeDK.getInstance().l().getPackageName());
            g.b(bundle);
        } catch (Throwable th2) {
            Logger.d(f52583a, "Failed to report url resolve to server");
            new CrashReporter().caughtException(th2);
        }
    }

    public static void a(boolean z10) {
        synchronized (f52587l) {
            Logger.d(f52583a, "setActiveMode to " + z10);
            f52586d = null;
        }
    }

    public static String b(String str) {
        try {
            URI uri = new URI(URLEncoder.encode(str, "UTF-8"));
            String query = uri.getQuery();
            if (TextUtils.isEmpty(query)) {
                return str;
            }
            String str2 = "";
            String[] strArrSplit = query.split(C3978d4.j.f31381c);
            for (String str3 : strArrSplit) {
                if (!com.safedk.android.utils.f.M().matcher(str3).find()) {
                    if (str2.length() > 0) {
                        str2 = str2 + C3978d4.j.f31381c;
                    }
                    str2 = str2 + str3;
                }
            }
            return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), str2, uri.getFragment()).toString();
        } catch (Throwable th2) {
            Logger.w(f52583a, "Unable to clean url: " + th2.getMessage());
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(String str, String str2, String str3, String str4) {
        if (this.f52590e == null && !this.f52594i.contains(str)) {
            Logger.d(f52583a, "logging url: " + str + ", fingerprint: " + str2 + ", sdkUuid: " + str3 + ", impressionId: " + str4 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            this.f52590e = str;
            this.f52591f = str2;
            this.f52592g = str3;
            this.f52593h = str4;
            if (TextUtils.isEmpty(this.f52591f)) {
                this.f52591f = str;
            }
        }
    }

    public static String c(String str) {
        return String.format(Locale.ENGLISH, f52585c, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, String str2, String str3, String str4) {
        Logger.d(f52583a, "resolveUrlInternal starting Url resolution. url = " + str + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final WebView webView = new WebView(SafeDK.getInstance().l());
        Runnable runnable = new Runnable() { // from class: com.safedk.android.analytics.brandsafety.i.2
            @Override // java.lang.Runnable
            public void run() {
                if (atomicBoolean.get()) {
                    Logger.d(i.f52583a, "Url resolved. no timeout.");
                } else {
                    webView.post(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.i.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Logger.d(i.f52583a, "Timeout resolving url");
                            webView.stopLoading();
                        }
                    });
                }
            }
        };
        AtomicLong atomicLong = new AtomicLong(0L);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new AnonymousClass3(str, atomicBoolean, str2, str3, str4));
        atomicLong.set(System.currentTimeMillis());
        webView.loadUrl(str);
        Logger.d(f52583a, "Starting resolution, timeout = " + SafeDK.getInstance().M());
        f52589n.schedule(runnable, SafeDK.getInstance().M(), TimeUnit.MILLISECONDS);
    }

    private void d() {
        synchronized (f52586d) {
            if (this.f52590e != null) {
                String str = this.f52590e;
                this.f52590e = null;
                this.f52591f = null;
                this.f52594i.add(str);
                this.f52595j.set(false);
                this.f52596k.set(0);
            }
        }
    }

    public void a(String str, final String str2, final String str3, final String str4) {
        Logger.d(f52583a, "resolve Url started, url = " + str + ", fingerprint = " + str2 + ", sdkUuid: " + str3 + ", impressionId: " + str4 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        String sdkPackageByPackageUUID = SdksMapping.getSdkPackageByPackageUUID(str3);
        boolean zA = CreativeInfoManager.a(sdkPackageByPackageUUID, AdNetworkConfiguration.SHOULD_DECODE_URLS_IN_CLICK_URL_RESOLUTION, true);
        Logger.d(f52583a, "resolve Url setting shouldDecode is " + zA + " for sdkPackageName " + sdkPackageByPackageUUID);
        String strE = zA ? com.safedk.android.utils.k.E(str) : str;
        if (com.safedk.android.utils.k.w(strE)) {
            a(strE, com.safedk.android.utils.k.x(strE), str2, str3, str4, false);
        } else {
            final String str5 = strE;
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.i.1
                @Override // java.lang.Runnable
                public void run() {
                    if (!i.f52588m.get()) {
                        Logger.d(i.f52583a, "not currently in background, try to resolve.");
                        i.this.c(str5, str2, str3, str4);
                    } else {
                        i.this.b(str5, str2, str3, str4);
                        i.this.f52595j.set(true);
                        Logger.d(i.f52583a, "server asked to resolve but currently in background.");
                    }
                }
            }, 500L);
        }
    }

    public synchronized String b() {
        return this.f52591f;
    }

    @Override // com.safedk.android.internal.a
    public synchronized void g() {
        f52588m.set(true);
    }

    @Override // com.safedk.android.internal.a
    public synchronized void h() {
        String str;
        String str2;
        String str3;
        String str4;
        Logger.d(f52583a, "onForeground started");
        f52588m.set(false);
        if (this.f52595j.get()) {
            if (this.f52596k.getAndIncrement() <= 2) {
                synchronized (f52586d) {
                    if (this.f52590e != null) {
                        str4 = this.f52590e;
                        str3 = this.f52591f;
                        String str5 = this.f52592g;
                        str = this.f52593h;
                        str2 = str5;
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                        str4 = null;
                    }
                }
                c(str4, str3, str2, str);
            } else {
                Logger.d(f52583a, "Exhausted2 attempts to resolve URL. Clearing the slot.");
                d();
            }
        }
    }
}
