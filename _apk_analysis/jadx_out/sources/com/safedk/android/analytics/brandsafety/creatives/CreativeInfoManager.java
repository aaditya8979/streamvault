package com.safedk.android.analytics.brandsafety.creatives;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.mintegral.msdk.thrid.okio.BufferedSource;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BannerFinder;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.InterstitialFinder;
import com.safedk.android.analytics.brandsafety.NativeFinder;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.FyberDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.i;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.j;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.m;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.o;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.internal.SafeDKSource;
import com.safedk.android.internal.SafeDKSourceMintegral;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.internal.g;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.PersistentConcurrentHashMap;
import com.safedk.android.utils.SdksMapping;
import com.safedk.android.utils.annotations.AdNetworkDependency;
import com.safedk.android.utils.annotations.SDKDependancy;
import com.safedk.android.utils.k;
import com.safedk.android.utils.l;
import com.unity3d.services.core.webview.bridge.WebViewBridgeInterface;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLConnection;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class CreativeInfoManager {
    private static final String A = "contentHashCodeToCreatives";
    private static Map<Integer, CreativeInfo> B = null;
    private static final String C = "webviewAddressToCreatives";
    private static Map<String, CreativeInfo> D = null;
    private static final String G = "IRONSOURCE_NETWORK";
    private static final String H = "IRONSOURCE_BIDDING";
    private static final String I = "VUNGLE_NETWORK";
    private static final String J = "VUNGLE_BIDDING";
    private static final String K = "UNITY_NETWORK";
    private static final String L = "UNITY_BIDDING";
    private static final String M = "ADMOB_NETWORK";
    private static final String N = "ADMOB_BIDDING";
    private static final String O = "ADMOB_NATIVE_NETWORK";
    private static final String P = "MINTEGRAL_NETWORK";
    private static final String Q = "MINTEGRAL_BIDDING";
    private static final String R = "FYBER_NETWORK";
    private static final String S = "FYBER_BIDDING";
    private static final String T = "INNERACTIVE_BIDDING";
    private static final String U = "ADCOLONY_NETWORK";
    private static final String V = "ADCOLONY_BIDDING";
    private static final String W = "AMAZON_NETWORK";
    private static final String X = "AMAZON_BIDDING";
    private static final String Y = "CHARTBOOST_NETWORK";
    private static final String Z = "CHARTBOOST_BIDDING";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f51947a = "mime-type";
    private static final String aA = "YANDEX_BIDDING";
    private static final String aB = "LINE_NETWORK";
    private static final String aC = "VERVE_NETWORK";
    private static final String aD = "VERVE_BIDDING";
    private static final String aE = "BIDMACHINE_BIDDING";
    private static final String aF = "MOLOCO_BIDDING";
    private static boolean aI = false;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private static final String f51948aa = "GOOGLE_AD_MANAGER_NETWORK";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final String f51949ab = "GOOGLE_AD_MANAGER_BIDDING";

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private static final String f51950ac = "GOOGLE_AD_MANAGER_NATIVE_NETWORK";

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private static final String f51951ad = "INMOBI_NETWORK";

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private static final String f51952ae = "INMOBI_BIDDING";

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private static final String f51953af = "INMOBI_NATIVE_BIDDING";

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private static final String f51954ag = "MAIO_NETWORK";

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    private static final String f51955ah = "MAIO_BIDDING";

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    private static final String f51956ai = "MYTARGET_NETWORK";

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    private static final String f51957aj = "MYTARGET_BIDDING";

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    private static final String f51958ak = "NEND_NETWORK";

    /* JADX INFO: renamed from: al, reason: collision with root package name */
    private static final String f51959al = "NEND_BIDDING";

    /* JADX INFO: renamed from: am, reason: collision with root package name */
    private static final String f51960am = "OGURY_NETWORK";

    /* JADX INFO: renamed from: an, reason: collision with root package name */
    private static final String f51961an = "OGURY_BIDDING";

    /* JADX INFO: renamed from: ao, reason: collision with root package name */
    private static final String f51962ao = "OGURY_PRESAGE";

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    private static final String f51963ap = "TIKTOK_NETWORK";

    /* JADX INFO: renamed from: aq, reason: collision with root package name */
    private static final String f51964aq = "TIKTOK_BIDDING";

    /* JADX INFO: renamed from: ar, reason: collision with root package name */
    private static final String f51965ar = "SMAATO_NETWORK";

    /* JADX INFO: renamed from: as, reason: collision with root package name */
    private static final String f51966as = "SMAATO_BIDDING";

    /* JADX INFO: renamed from: at, reason: collision with root package name */
    private static final String f51967at = "SNAP_NETWORK";
    private static final String au = "SNAP_BIDDING";
    private static final String av = "TAPJOY_NETWORK";
    private static final String aw = "TAPJOY_BIDDING";
    private static final String ax = "VERIZON_NETWORK";
    private static final String ay = "VERIZON_BIDDING";
    private static final String az = "YANDEX_NETWORK";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f51968b = "encoding";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f51969c = "mraid://tpat?event";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f51970d = "checkpoint.0";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f51971e = "video.close";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f51972f = "privacyButtonClick";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f51973g = "APPLOVIN_NETWORK";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f51974h = "APPLOVIN_EXCHANGE";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f51975i = "APPLOVIN_DIRECTSOLD";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f51976j = "CUSTOM_NETWORK";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f51977k = "/mediate";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f51979m = "@!1:ad_fetch@!";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f51980n = ".rayjump.com/openapi/moreoffer";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f51981o = "mtgglobals.com/openapi/moreoffer";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f51982p = "/multiple_ads";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f51984r = "CreativeInfoManager";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f51985s = "timestamp";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f51986t = "urls";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f51988v = "adIdToCreatives";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f51989w = "multiAdCreatives";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static Map<String, CreativeInfo> f51990x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static Map<String, List<CreativeInfo>> f51992z;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final List<String> f51987u = new ArrayList();
    private static TreeMap<String, AdNetworkDiscovery> adNetworkDiscoveries = new TreeMap<>();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Map<String, Set<String>> f51991y = new HashMap();
    private static final Map<String, String> E = new HashMap();
    private static final HashSet<String> F = new HashSet<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final List<String> f51978l = Arrays.asList("ms.applovin.com", "ms.applvn.com", "ms4.applovin.com", "ms4.applvn.com");
    private static AtomicBoolean aG = new AtomicBoolean(false);
    private static final ExecutorService aH = Executors.newFixedThreadPool(2);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static boolean f51983q = false;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ArrayList<CreativeInfo> f52051a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        CreativeInfo f52052b;

        private a() {
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ArrayList<String> f52053a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f52054b;

        private b() {
        }
    }

    public static float a(String str, AdNetworkConfiguration adNetworkConfiguration, float f10) {
        AdNetworkDiscovery adNetworkDiscovery;
        return (aI && aG.get() && (adNetworkDiscovery = adNetworkDiscoveries.get(str)) != null && adNetworkDiscovery.d() != null && adNetworkDiscovery.d().a(adNetworkConfiguration)) ? adNetworkDiscovery.d().d(adNetworkConfiguration) : f10;
    }

    public static int a() {
        return f51990x.size();
    }

    public static long a(String str, AdNetworkConfiguration adNetworkConfiguration, long j10) {
        AdNetworkDiscovery adNetworkDiscovery;
        return (!aI || !aG.get() || str == null || (adNetworkDiscovery = adNetworkDiscoveries.get(str)) == null || adNetworkDiscovery.d() == null || !adNetworkDiscovery.d().a(adNetworkConfiguration)) ? j10 : adNetworkDiscovery.d().e(adNetworkConfiguration);
    }

    private static WebResourceResponse a(String str, String str2, WebResourceResponse webResourceResponse) {
        try {
            if (aI && aG.get()) {
                Logger.d(f51984r, "follow webview response if needed for " + str + ", url " + str2);
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                Bundle bundle = new Bundle();
                if (adNetworkDiscovery != null && adNetworkDiscovery.a(str2, bundle)) {
                    if (webResourceResponse == null) {
                        URLConnection uRLConnectionOpenConnection = new URL(str2).openConnection();
                        WebResourceResponse webResourceResponse2 = new WebResourceResponse(bundle.getString(f51947a, "text/javascript"), bundle.getString(f51968b, "UTF-8"), new com.safedk.android.internal.f(str, str2, uRLConnectionOpenConnection.getInputStream(), null, false));
                        try {
                            a(webResourceResponse2, uRLConnectionOpenConnection.getHeaderFields());
                            webResourceResponse = webResourceResponse2;
                        } catch (Throwable th2) {
                            th = th2;
                            webResourceResponse = webResourceResponse2;
                            Logger.d(f51984r, "following webView response failed: " + th.getMessage(), th);
                        }
                    } else if (!(webResourceResponse.getData() instanceof com.safedk.android.internal.f)) {
                        webResourceResponse.setData(new com.safedk.android.internal.f(str, str2, webResourceResponse.getData(), null, false));
                    }
                    Logger.d(f51984r, "following webView response " + str2 + " wrapping input stream in response: " + webResourceResponse + ", mime type: " + webResourceResponse.getMimeType() + ", encoding: " + webResourceResponse.getEncoding());
                }
            } else {
                Logger.d(f51984r, "follow webview response if needed SafeDK not initialized");
            }
        } catch (Throwable th3) {
            th = th3;
        }
        return webResourceResponse;
    }

    @AdNetworkDependency(className = "com.mintegral.msdk.thrid.okio.BufferedSource")
    public static BufferedSource a(String str, String str2, BufferedSource bufferedSource, int i10) {
        try {
            if (aI && aG.get()) {
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                if (adNetworkDiscovery != null && adNetworkDiscovery.a(str2)) {
                    Logger.d(f51984r, "following source stream for url " + str2);
                    bufferedSource = SafeDKSourceMintegral.create(bufferedSource, i10);
                }
            } else {
                Logger.d(f51984r, "following source stream SafeDK not initialized");
            }
        } catch (Throwable th2) {
            Logger.e(f51984r, th2.getMessage(), th2);
            new CrashReporter().caughtException(th2);
        }
        return bufferedSource;
    }

    public static AdNetworkDiscovery.WebViewResourceMatchingMethod a(String str) {
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
        if (adNetworkDiscovery == null) {
            return null;
        }
        return adNetworkDiscovery.b();
    }

    public static FileOutputStream a(String str, String str2, FileOutputStream fileOutputStream) {
        try {
            if (aI && aG.get()) {
                Logger.d(f51984r, "follow output file stream if needed sdk = " + str + ", path = " + str2 + ", stream " + fileOutputStream);
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                if (adNetworkDiscovery != null && adNetworkDiscovery.b(str2)) {
                    Logger.d(f51984r, "following output stream for file path " + str2);
                    fileOutputStream = new com.safedk.android.internal.e(str, str2, fileOutputStream);
                }
            } else {
                Logger.d(f51984r, "following output stream for file SafeDK not initialized");
            }
        } catch (Throwable th2) {
            try {
                Logger.e(f51984r, th2.getMessage(), th2);
                new CrashReporter().caughtException(th2);
            } catch (Throwable th3) {
            }
        }
        return fileOutputStream;
    }

    public static InputStream a(String str, String str2, InputStream inputStream, Map<String, List<String>> map) {
        boolean z10 = false;
        try {
            if (!aI || !aG.get()) {
                Logger.d(f51984r, "should follow input stream SafeDK not initialized");
                return inputStream;
            }
            Logger.d(f51984r, "follow input stream if needed for " + str + ", url " + str2 + " ad network discoveries=" + adNetworkDiscoveries.keySet());
            if (a(str, AdNetworkConfiguration.USE_INPUT_STREAM_EVENT_AS_RESOURCE_LOADED_INDICATION, false)) {
                onResourceLoaded(str, null, str2);
            }
            AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
            boolean z11 = adNetworkDiscovery != null && adNetworkDiscovery.a(str2);
            Logger.d(f51984r, "should follow input stream? " + (adNetworkDiscovery != null ? Boolean.valueOf(z11) : "null"));
            if (adNetworkDiscovery == null) {
                Logger.d(f51984r, "no discovery class for " + str + " or discovery class does not follow this url.");
                return inputStream;
            }
            boolean zD = adNetworkDiscovery.d(str2);
            boolean zA = a(str, AdNetworkConfiguration.ENFORCE_CLOSE_INPUT_STREAM_VAST_IN_VAST, false);
            Logger.d(f51984r, "enforce close VIV value for sdk " + str + " is " + zA + ", is VIV returned " + zD + " for url " + str2);
            boolean zA2 = a(str, AdNetworkConfiguration.ENFORCE_CLOSE_INPUT_STREAM, false);
            Logger.d(f51984r, "enforce close value for sdk " + str + " is " + zA2 + " for url " + str2);
            if (!z11) {
                return inputStream;
            }
            Logger.d(f51984r, "following input stream for url " + str2);
            if (zA2 || (zA && zD)) {
                z10 = true;
            }
            return new com.safedk.android.internal.f(str, str2, inputStream, map, z10);
        } catch (Throwable th2) {
            try {
                Logger.e(f51984r, th2.getMessage(), th2);
                new CrashReporter().caughtException(th2);
                return inputStream;
            } catch (Throwable th3) {
                return inputStream;
            }
        }
    }

    public static OutputStream a(String str, String str2, OutputStream outputStream) {
        try {
            if (aI && aG.get()) {
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                if (adNetworkDiscovery != null && adNetworkDiscovery.b(str2)) {
                    Logger.d(f51984r, "following output stream for url " + str2);
                    outputStream = new g(str, str2, outputStream);
                }
            } else {
                Logger.d(f51984r, "following output stream SafeDK not initialized");
            }
        } catch (Throwable th2) {
            try {
                Logger.e(f51984r, th2.getMessage(), th2);
                new CrashReporter().caughtException(th2);
            } catch (Throwable th3) {
            }
        }
        return outputStream;
    }

    public static String a(String str, AdNetworkConfiguration adNetworkConfiguration, String str2) {
        AdNetworkDiscovery adNetworkDiscovery;
        return (aI && aG.get() && (adNetworkDiscovery = adNetworkDiscoveries.get(str)) != null && adNetworkDiscovery.d() != null && adNetworkDiscovery.d().a(adNetworkConfiguration)) ? adNetworkDiscovery.d().c(adNetworkConfiguration) : str2;
    }

    public static List<CreativeInfo> a(WebView webView, String str, String str2) {
        if (!f51983q && (!aI || !aG.get())) {
            return new ArrayList();
        }
        Logger.d(f51984r, "adIdFoundOnResource started with ad id " + str2);
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
        if (adNetworkDiscovery == null) {
            Logger.d(f51984r, "adIdFoundOnResource - packageName: " + str + " does not corresponds to any ad network");
            return new ArrayList();
        }
        String strA = BrandSafetyUtils.a(webView);
        List<CreativeInfo> listA = a(adNetworkDiscovery, str2);
        Logger.d(f51984r, "adIdFoundOnResource - ad id: " + str2 + " ci: " + listA);
        if (adNetworkDiscovery.d().b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_BANNER_MULTIPLE_WEBVIEWS)) {
            b(str2, strA);
        }
        if (listA.size() == 0) {
            Logger.d(f51984r, "adIdFoundOnResource - ci list is empty, exiting");
            return listA;
        }
        for (CreativeInfo creativeInfo : listA) {
            k.b(f51984r, "Ad identified, ci : " + creativeInfo);
            BrandSafetyUtils.AdType adTypeK = creativeInfo.K();
            creativeInfo.a((Object) webView);
            if (adTypeK == BrandSafetyUtils.AdType.INTERSTITIAL || adTypeK == BrandSafetyUtils.AdType.BANNER || adTypeK == BrandSafetyUtils.AdType.MREC) {
                k.b(f51984r, "Ad identified, setting creative in ad finder, adType=" + adTypeK + ", click url=" + creativeInfo.M());
                a(creativeInfo, CreativeInfo.f52483l, str2);
                creativeInfo.b(B);
            } else if (strA != null) {
                Logger.d(f51984r, "Linking ad id " + str2 + " to web view " + strA);
                D.put(strA, creativeInfo);
            }
        }
        adNetworkDiscovery.i(str2);
        return listA;
    }

    public static List<CreativeInfo> a(AdNetworkDiscovery adNetworkDiscovery, String str) {
        CreativeInfo creativeInfoRemove;
        if (!f51983q && (!aI || !aG.get())) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        synchronized (f51990x) {
            if (adNetworkDiscovery.d().b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_PREFETCH_REUSE)) {
                creativeInfoRemove = f51990x.get(str);
                if (creativeInfoRemove != null) {
                    Logger.d(f51984r, "get CIs by ad id, reset expiration time as network support prefetch reuse. ci id = " + creativeInfoRemove.L());
                    creativeInfoRemove.ac();
                }
            } else {
                creativeInfoRemove = f51990x.remove(str);
            }
        }
        if (creativeInfoRemove != null) {
            k.b(f51984r, "get CIs by ad id, ci: " + creativeInfoRemove);
            if (creativeInfoRemove.ah()) {
                List<CreativeInfo> listRemove = f51992z.remove(str);
                if (listRemove != null) {
                    arrayList.addAll(listRemove);
                }
            } else {
                arrayList.add(creativeInfoRemove);
            }
        }
        Logger.d(f51984r, "get CIs by ad id, number of CIs: " + arrayList.size() + ", ad id: " + str);
        return arrayList;
    }

    public static List<CreativeInfo> a(String str, Set<String> set) {
        try {
        } catch (Throwable th2) {
            new CrashReporter().caughtException(th2);
            Logger.e(f51984r, th2.getMessage());
        }
        if (!aI || !aG.get()) {
            Logger.d(f51984r, "SafeDK not initialized");
            return null;
        }
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
        if (adNetworkDiscovery != null) {
            Pair<String, List<String>> pairA = adNetworkDiscovery.a(set);
            if (pairA != null) {
                String str2 = (String) pairA.first;
                List<String> list = (List) pairA.second;
                Collections.sort(list);
                Logger.d(f51984r, "adId = " + str2);
                List<CreativeInfo> listA = a(adNetworkDiscovery, str2);
                for (CreativeInfo creativeInfo : listA) {
                    creativeInfo.a(list);
                    Logger.d(f51984r, "clickUrl = " + creativeInfo.M());
                    if (creativeInfo.K() == BrandSafetyUtils.AdType.INTERSTITIAL || creativeInfo.K() == BrandSafetyUtils.AdType.BANNER || creativeInfo.K() == BrandSafetyUtils.AdType.MREC) {
                        creativeInfo.b(B);
                    }
                }
                return listA;
            }
        } else {
            Logger.d(f51984r, "no discovery object for SDK " + str);
        }
        return null;
    }

    @SDKDependancy(packageName = "okio")
    public static okio.BufferedSource a(String str, String str2, okio.BufferedSource bufferedSource, int i10) {
        try {
            if (aI && aG.get()) {
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                if (adNetworkDiscovery != null && adNetworkDiscovery.a(str2)) {
                    Logger.d(f51984r, "following source stream for url " + str2);
                    bufferedSource = SafeDKSource.create(bufferedSource, i10);
                }
            } else {
                Logger.d(f51984r, "following source stream SafeDK not initialized");
            }
        } catch (Throwable th2) {
            Logger.e(f51984r, th2.getMessage(), th2);
            new CrashReporter().caughtException(th2);
        }
        return bufferedSource;
    }

    private static void a(WebResourceResponse webResourceResponse, Map<String, List<String>> map) {
        HashMap map2 = new HashMap();
        for (String str : map.keySet()) {
            List<String> list = map.get(str);
            if (list != null && !list.isEmpty()) {
                map2.put(str, list.get(0));
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            webResourceResponse.setResponseHeaders(map2);
        }
    }

    public static void a(MaxAdView maxAdView) {
        if (maxAdView != null) {
            String strE = k.e(com.safedk.android.utils.f.L(), maxAdView.toString());
            if (strE != null) {
                Logger.d(f51984r, "Max ad view destroyed: " + maxAdView + " ad unit id: " + strE + ", isOnUiThread = " + k.c());
                BannerFinder.a(strE, maxAdView);
            } else {
                Logger.d(f51984r, "Max ad view destroyed: " + maxAdView);
                BannerFinder.a(maxAdView);
            }
        }
    }

    public static void a(BrandSafetyUtils.AdType adType, String str) {
        if (aI && aG.get()) {
            Logger.d(f51984r, "request to stop take screenshots from current " + adType.name() + " impression received");
            BannerFinder bannerFinder = (BannerFinder) SafeDK.getInstance().a(adType);
            if (bannerFinder == null) {
                Logger.d(f51984r, adType.name() + " finder is null, exiting");
            } else {
                bannerFinder.l(str);
            }
        }
    }

    public static void a(AdNetworkConfiguration adNetworkConfiguration, float f10) {
        if (aI && aG.get()) {
            for (AdNetworkDiscovery adNetworkDiscovery : adNetworkDiscoveries.values()) {
                if (adNetworkDiscovery.d() != null) {
                    adNetworkDiscovery.d().a(adNetworkConfiguration, f10);
                    Logger.d(f51984r, "Config bundle for sdk " + adNetworkDiscovery + " updated config item " + adNetworkDiscovery.h() + " to " + f10);
                }
            }
        }
    }

    public static void a(AdNetworkConfiguration adNetworkConfiguration, long j10) {
        if (aI && aG.get()) {
            for (AdNetworkDiscovery adNetworkDiscovery : adNetworkDiscoveries.values()) {
                if (adNetworkDiscovery.d() != null) {
                    adNetworkDiscovery.d().a(adNetworkConfiguration, j10);
                    Logger.d(f51984r, "Config bundle for sdk " + adNetworkDiscovery + " updated config item " + adNetworkDiscovery.h() + " to " + j10);
                }
            }
        }
    }

    public static void a(CreativeInfo creativeInfo) {
        List<CreativeInfo> arrayList = f51992z.get(creativeInfo.L());
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            f51992z.put(creativeInfo.L(), arrayList);
        }
        Logger.d(f51984r, "storing creative info to multi ad CI list: " + creativeInfo);
        arrayList.add(creativeInfo);
    }

    public static void a(CreativeInfo creativeInfo, String str, String str2) {
        if (aI && aG.get()) {
            if (creativeInfo.V() != null) {
                Logger.d(f51984r, "setting creative in ad finder - ci already have matching method. ci: " + creativeInfo);
                return;
            }
            k.b(f51984r, "setting creative in ad finder, ci id =" + creativeInfo.L());
            com.safedk.android.analytics.brandsafety.a aVarA = SafeDK.getInstance().a(creativeInfo.K());
            if (aVarA != null) {
                Logger.d(f51984r, "setting creative in ad finder updating ci " + (a(creativeInfo.Q(), AdNetworkConfiguration.SHOULD_REPORT_AD_ID_ON_CI_CREATION, true) ? aVarA.a(new o(creativeInfo, str, str2)) : aVarA.a(new o(creativeInfo, str, null))) + ", matching method=" + str + ", ad id=" + creativeInfo.L() + ", ad type=" + creativeInfo.K());
            } else {
                Logger.d(f51984r, "setting creative in ad finder - cannot update ad finder");
            }
        }
    }

    public static void a(final String str, final int i10) {
        aH.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.10
            @Override // java.lang.Runnable
            public void run() {
                Logger.d(CreativeInfoManager.f51984r, "ad markup hash code is: " + i10);
                CreativeInfoManager.a(com.safedk.android.utils.g.f53132f, "gw-ext.mediation.unity3d.com/auction/videoBridge", com.safedk.android.analytics.brandsafety.creatives.discoveries.f.l(str), (Map<String, List<String>>) null);
            }
        });
    }

    public static void a(String str, WebView webView, String str2) {
        if (str2 == null || !str2.startsWith(f51969c)) {
            return;
        }
        String strA = BrandSafetyUtils.a(webView);
        if (str2.endsWith("checkpoint.0")) {
            a(str, strA, false);
            return;
        }
        if (str2.endsWith(f51971e)) {
            a(str, strA, true);
        } else if (str2.endsWith(f51972f)) {
            com.safedk.android.analytics.brandsafety.b.a(strA, ImpressionLog.f51747q, new ImpressionLog.a[0]);
            a(str, strA);
        }
    }

    public static void a(final String str, final Object obj) {
        try {
            if (aI && aG.get()) {
                aH.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            Logger.d(CreativeInfoManager.f51984r, "media player start event " + obj);
                            AdNetworkDiscovery adNetworkDiscovery = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str);
                            if (adNetworkDiscovery == null) {
                                Logger.d(CreativeInfoManager.f51984r, "no discovery object found for SDK " + str);
                                return;
                            }
                            String strB = adNetworkDiscovery.b(obj);
                            if (strB != null) {
                                for (CreativeInfo creativeInfo : CreativeInfoManager.a(adNetworkDiscovery, strB)) {
                                    creativeInfo.a(obj);
                                    Logger.d(CreativeInfoManager.f51984r, "calling set creative in ad finder after media player start called. video url: " + creativeInfo.H());
                                    CreativeInfoManager.a(creativeInfo, CreativeInfo.f52482k, strB);
                                }
                            }
                        } catch (Throwable th2) {
                            try {
                                new CrashReporter().caughtException(th2);
                                Logger.d(CreativeInfoManager.f51984r, "Media player start event error ", th2);
                            } catch (Throwable th3) {
                            }
                        }
                    }
                });
            } else {
                Logger.d(f51984r, "media player start SafeDK not initialized");
            }
        } catch (Throwable th2) {
            Logger.d(f51984r, "Media player start event error ", th2);
            try {
                new CrashReporter().caughtException(th2);
            } catch (Throwable th3) {
            }
        }
    }

    public static void a(final String str, final Object obj, final Object obj2) {
        try {
            if (aI && aG.get()) {
                aH.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.19
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            Logger.d(CreativeInfoManager.f51984r, "Media player set data source event received " + obj + ", video file " + obj2);
                            AdNetworkDiscovery adNetworkDiscovery = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str);
                            if (adNetworkDiscovery != null) {
                                adNetworkDiscovery.b(obj, obj2);
                            } else {
                                Logger.d(CreativeInfoManager.f51984r, "no discovery object found for SDK " + str);
                            }
                        } catch (Throwable th2) {
                            try {
                                new CrashReporter().caughtException(th2);
                                Logger.e(CreativeInfoManager.f51984r, th2.getMessage());
                            } catch (Throwable th3) {
                            }
                        }
                    }
                });
            } else {
                Logger.d(f51984r, "Media player set data source event SafeDK not initialized");
            }
        } catch (Throwable th2) {
            Logger.e(f51984r, th2.getMessage(), th2);
            try {
                new CrashReporter().caughtException(th2);
            } catch (Throwable th3) {
            }
        }
    }

    public static void a(String str, String str2) {
        List<CreativeInfo> listA = SafeDK.getInstance().y().a(str, str2);
        List<CreativeInfo> listA2 = SafeDK.getInstance().z().a(str, str2);
        List<CreativeInfo> listA3 = SafeDK.getInstance().A().a(str, str2);
        if (listA != null && listA.size() > 0) {
            Logger.d(f51984r, "requestNoSamplingUnity calling interstitial requestNoSampling, : address = " + str2);
            d(str, str2);
            return;
        }
        if (listA2 != null && listA2.size() > 0) {
            Logger.d(f51984r, "requestNoSamplingUnity calling banner requestNoSampling, : address = " + str2);
            a(BrandSafetyUtils.AdType.BANNER, str2);
        } else if (listA3 == null || listA3.size() <= 0) {
            Logger.d(f51984r, "requestNoSamplingUnity WebView is not a banner nor an MREC nor an interstitial, : address = " + str2);
        } else {
            Logger.d(f51984r, "requestNoSamplingUnity calling MREC requestNoSampling, : address = " + str2);
            a(BrandSafetyUtils.AdType.MREC, str2);
        }
    }

    public static void a(final String str, final String str2, final WebView webView, final String str3) {
        try {
            AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str3);
            if (adNetworkDiscovery != null) {
                adNetworkDiscovery.a(webView);
            }
            if (!aI || !aG.get()) {
                Logger.d(f51984r, "data loaded to webView SafeDK not initialized for package: " + str3 + " and webview: " + webView);
                return;
            }
            if (str2 == null) {
                Logger.d(f51984r, "data loaded to webView is null for package: " + str3 + " and webview: " + webView);
                return;
            }
            final String strG = k.G(str2);
            Logger.d(f51984r, "data loaded to webView " + webView + ", package: " + str3 + ", baseUrl: " + str + ", content size is " + strG.length());
            k.b(f51984r, "data loaded to webView: " + webView + ", package: " + str3 + ", value: " + strG);
            aH.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.14
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        AdNetworkDiscovery adNetworkDiscovery2 = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str3);
                        if (adNetworkDiscovery2 != null) {
                            String strA = adNetworkDiscovery2.a(strG, str, new WeakReference<>(webView));
                            Logger.d(CreativeInfoManager.f51984r, "data loaded to webView ad id " + strA);
                            String strA2 = BrandSafetyUtils.a(webView);
                            if (strA != null) {
                                if (CreativeInfoManager.b(webView, str3, strA)) {
                                    adNetworkDiscovery2.i(strA);
                                    return;
                                }
                                return;
                            }
                            int iC = adNetworkDiscovery2.c(str2);
                            Logger.d(CreativeInfoManager.f51984r, String.format("Trying to match by hashcode: %s .contentHashCodeToCreatives size: %s", Integer.valueOf(iC), Integer.valueOf(CreativeInfoManager.B.size())));
                            if (iC == 0) {
                                Logger.d(CreativeInfoManager.f51984r, "hashcode 0, with value: " + str2);
                            }
                            for (CreativeInfo creativeInfo : CreativeInfoManager.b(iC)) {
                                Logger.d(CreativeInfoManager.f51984r, "getting Base64 resources");
                                ArrayList<String> arrayListI = k.i(str2);
                                if (arrayListI != null && arrayListI.size() > 0) {
                                    creativeInfo.b(arrayListI);
                                }
                                creativeInfo.a((Object) webView);
                                if (!adNetworkDiscovery2.d().b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_PREFETCH_REUSE)) {
                                    synchronized (CreativeInfoManager.f51990x) {
                                        CreativeInfoManager.f51990x.remove(creativeInfo.L());
                                    }
                                }
                                if (creativeInfo.K() == BrandSafetyUtils.AdType.INTERSTITIAL) {
                                    SafeDKWebAppInterface.a(strA2);
                                    e.a(strA2);
                                }
                                if (TextUtils.isEmpty(strA2)) {
                                    Logger.d(CreativeInfoManager.f51984r, "webView address is empty - can't link creative info to webview");
                                }
                                Logger.d(CreativeInfoManager.f51984r, "linking " + creativeInfo.S() + " to web view " + strA2);
                                CreativeInfoManager.D.put(strA2, creativeInfo);
                                if (creativeInfo.K() == BrandSafetyUtils.AdType.INTERSTITIAL || creativeInfo.K() == BrandSafetyUtils.AdType.BANNER || creativeInfo.K() == BrandSafetyUtils.AdType.MREC) {
                                    CreativeInfoManager.b(creativeInfo, CreativeInfo.f52481j, creativeInfo.S());
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        new CrashReporter().caughtException(th2);
                        Logger.d(CreativeInfoManager.f51984r, "Exception in data loaded to webView : ", th2);
                    }
                }
            });
        } catch (Throwable th2) {
            try {
                Logger.d(f51984r, "Exception in data loaded to webView : ", th2);
                new CrashReporter().caughtException(th2);
            } catch (Throwable th3) {
            }
        }
    }

    public static void a(String str, String str2, BrandSafetyUtils.AdType adType, String str3) {
        if (aI && aG.get()) {
            SafeDK safeDK = SafeDK.getInstance();
            if (safeDK == null || safeDK.a(adType) == null) {
                Logger.d(f51984r, "sendMessageToAdInfo: NOT sending message: " + str2 + " to address: " + str + "because ad finder not available");
            } else {
                Logger.d(f51984r, "sendMessageToAdInfo: sending message: " + str2 + " to address: " + str);
                safeDK.a(adType).d(str, str2, str3);
            }
        }
    }

    public static void a(final String str, final String str2, final BrandSafetyEvent.AdFormatType adFormatType, final Object obj) {
        try {
            if (aI && aG.get()) {
                aH.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.18
                    @Override // java.lang.Runnable
                    public void run() {
                        String strC;
                        try {
                            Logger.d(CreativeInfoManager.f51984r, "handling shown ad by api, sdk: " + str + ", message: " + str2 + ", ad format type: " + adFormatType + ", isOnUiThread = " + k.c());
                            AdNetworkDiscovery adNetworkDiscovery = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str);
                            if (adNetworkDiscovery == null || (strC = adNetworkDiscovery.c(str2, str2)) == null) {
                                return;
                            }
                            k.b(CreativeInfoManager.f51984r, "ad id: " + strC);
                            for (CreativeInfo creativeInfo : CreativeInfoManager.a(adNetworkDiscovery, strC)) {
                                if (adFormatType == BrandSafetyEvent.AdFormatType.INTER || adFormatType == BrandSafetyEvent.AdFormatType.NATIVE) {
                                    creativeInfo.a(obj);
                                    CreativeInfoManager.a(creativeInfo, CreativeInfo.f52484m, strC);
                                }
                            }
                        } catch (Throwable th2) {
                            new CrashReporter().caughtException(th2);
                            Logger.d(CreativeInfoManager.f51984r, "handling shown ad by api failed", th2);
                        }
                    }
                });
            }
        } catch (Throwable th2) {
            Logger.d(f51984r, "Exception handling shown ad by api :" + th2.getMessage(), th2);
            try {
                new CrashReporter().caughtException(th2);
            } catch (Throwable th3) {
            }
        }
    }

    public static void a(String str, String str2, String str3) {
        if (aI && aG.get() && !str.equals(com.safedk.android.utils.g.f53141o)) {
            if (str3.contains(f51980n) || str3.contains(f51981o)) {
                Logger.d(f51984r, "addMintegralDspMultipleAdsDownstreamStruct - started, sdkPackageName= " + str + ", webViewAddress= " + str2 + ", url= " + str3);
                BannerFinder bannerFinderZ = SafeDK.getInstance().z();
                if (bannerFinderZ != null) {
                    List<CreativeInfo> listA = bannerFinderZ.a(str, str2);
                    if (listA == null || listA.size() <= 0) {
                        Logger.d(f51984r, "addMintegralDspMultipleAdsDownstreamStruct - CI list is null or empty. sdkPackageName = " + str + ", webViewAddress = " + str2);
                        return;
                    }
                    Logger.d(f51984r, "addMintegralDspMultipleAdsDownstreamStruct - found CIs by webView= " + listA);
                    for (CreativeInfo creativeInfo : listA) {
                        if (creativeInfo.ah()) {
                            Logger.d(f51984r, "addMintegralDspMultipleAdsDownstreamStruct - CI is already multi, not adding /multiple_ads to CI= " + creativeInfo);
                        } else if (creativeInfo.h() == null || !creativeInfo.h().contains("/multiple_ads")) {
                            Logger.d(f51984r, "addMintegralDspMultipleAdsDownstreamStruct - adding /multiple_ads to CI= " + creativeInfo);
                            creativeInfo.d("/multiple_ads");
                        } else {
                            Logger.d(f51984r, "addMintegralDspMultipleAdsDownstreamStruct - already added /multiple_ads to CI= " + creativeInfo);
                        }
                    }
                }
            }
        }
    }

    public static synchronized void a(final String str, final String str2, final String str3, final String str4, final String str5) {
        try {
            if (aI && aG.get()) {
                aH.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.8
                    @Override // java.lang.Runnable
                    public void run() {
                        Logger.d(CreativeInfoManager.f51984r, "updating creative info details from Max, sdk=" + str + ", placement id=" + str2 + ", creative id=" + str3 + ", ad format=" + str5);
                        AdNetworkDiscovery adNetworkDiscovery = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str);
                        if (adNetworkDiscovery != null) {
                            adNetworkDiscovery.a(str2, str3, str4, str5);
                        } else {
                            Logger.d(CreativeInfoManager.f51984r, "no discovery object for SDK " + str);
                        }
                    }
                });
            } else {
                Logger.d(f51984r, "updating creative info details SafeDK not initialized");
            }
        } catch (Throwable th2) {
            Logger.e(f51984r, th2.getMessage(), th2);
            try {
                new CrashReporter().caughtException(th2);
            } catch (Throwable th3) {
            }
        }
    }

    public static void a(String str, String str2, String str3, Map<String, List<String>> map) {
        a(str, str2, str3, map, (String) null);
    }

    public static void a(String str, String str2, String str3, Map<String, List<String>> map, c.a aVar) {
        if (aI && aG.get()) {
            Logger.d(f51984r, "handle prefetch started, networkName=" + str + ", url=" + str2);
            String strB = b(str);
            if (strB == null) {
                Logger.d(f51984r, "handle prefetch sdkPackage is null, skipping");
                return;
            }
            Logger.d(f51984r, "handle prefetch sdkPackage is " + strB);
            if (!g(str2) && !str2.equals("@!1:ad_fetch@!")) {
                Logger.d(f51984r, "handle prefetch Url is not a mediation url, skipping");
                return;
            }
            com.safedk.android.analytics.brandsafety.creatives.a aVarI = i(strB);
            if (aVarI == null) {
                Logger.d(f51984r, "handle prefetch sdkPackage does not exist");
                return;
            }
            Logger.d(f51984r, "handle prefetch sdk " + strB + " config item SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN is " + aVarI.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN));
            if (aVarI.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN)) {
                Logger.d(f51984r, "handle prefetch calling onAdFetchedImpl sdkPackage=" + strB + ", url=" + str2 + ", prefetch=" + str3);
                b(strB, str2, str3, map, aVar, null);
            }
        }
    }

    public static void a(final String str, final String str2, final String str3, final Map<String, List<String>> map, final String str4) {
        try {
            if ((aI && aG.get()) || f51983q) {
                Logger.d(f51984r, "ad fetched package: " + str + " url: " + str2 + " , content size=" + str3.length());
                if (a(str, AdNetworkConfiguration.SHOULD_USE_EARLY_VAST_AD_TAG_URI_PARSING, false)) {
                    Logger.d(f51984r, "ad fetched package: " + str + " searching for VastAdTagUri");
                    f.b(str3);
                }
                if (!f51983q) {
                    aH.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.13
                        @Override // java.lang.Runnable
                        public void run() {
                            Logger.d(CreativeInfoManager.f51984r, "ad fetched executor service started " + str + " url: " + str2);
                            CreativeInfoManager.b(str, str2, str3, map, null, str4);
                        }
                    });
                } else {
                    Logger.d(f51984r, "ad fetched executor service started " + str + " url: " + str2);
                    b(str, str2, str3, map, null, str4);
                }
            }
        } catch (Throwable th2) {
            Logger.e(f51984r, th2.getMessage(), th2);
            try {
                new CrashReporter().caughtException(th2);
            } catch (Throwable th3) {
            }
        }
    }

    public static void a(final String str, final String str2, final boolean z10) {
        if (k.c()) {
            aH.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.5
                @Override // java.lang.Runnable
                public void run() {
                    CreativeInfoManager.c(str, str2, z10);
                }
            });
        } else {
            c(str, str2, z10);
        }
    }

    public static void a(boolean z10) {
        aI = z10;
        Logger.d(f51984r, "setting active mode to " + z10);
    }

    private static boolean a(AdNetworkDiscovery adNetworkDiscovery, String str, WebView webView, String str2, Map<String, String> map) {
        boolean z10 = false;
        if (!aI || !aG.get()) {
            return false;
        }
        String strA = BrandSafetyUtils.a(webView);
        BannerFinder bannerFinderZ = SafeDK.getInstance() != null ? SafeDK.getInstance().z() : null;
        boolean z11 = webView != null && (k.a((float) webView.getWidth(), (float) webView.getHeight()) || (bannerFinderZ != null && bannerFinderZ.i(strA)));
        Logger.d(f51984r, "should handle resource attachment started sdk=" + str + ", webview= " + webView + ", resource=" + str2 + ", headers=" + map + " is banner=" + z11);
        if (adNetworkDiscovery == null) {
            Logger.d(f51984r, "should handle resource attachment returns false");
            return false;
        }
        AdNetworkDiscovery.WebViewResourceMatchingMethod webViewResourceMatchingMethodB = adNetworkDiscovery.b();
        Logger.d(f51984r, "should handle resource attachment, matching method for " + str + " is " + webViewResourceMatchingMethodB.name());
        if (webViewResourceMatchingMethodB == AdNetworkDiscovery.WebViewResourceMatchingMethod.DIRECT_CREATIVE_INFO) {
            String strA2 = adNetworkDiscovery.a(str2, new WeakReference<>(webView));
            if (strA2 != null) {
                Logger.d(f51984r, "should handle resource attachment, get Ad Id For Resource returned ad id: " + strA2);
                List<CreativeInfo> arrayList = new ArrayList<>();
                CreativeInfo creativeInfo = f51990x.get(strA2);
                if (creativeInfo != null) {
                    arrayList.add(creativeInfo);
                    if (creativeInfo.ah()) {
                        arrayList = f51992z.get(strA2);
                    }
                } else {
                    Logger.d(f51984r, "should handle resource attachment, resource matching: no CI for " + strA2);
                    if (SafeDK.getInstance() != null) {
                        Iterator<com.safedk.android.analytics.brandsafety.b> it = SafeDK.getInstance().x().values().iterator();
                        while (true) {
                            List<CreativeInfo> list = arrayList;
                            if (!it.hasNext()) {
                                arrayList = list;
                                break;
                            }
                            com.safedk.android.analytics.brandsafety.b next = it.next();
                            arrayList = next.c(str, strA2);
                            if (arrayList != null && !arrayList.isEmpty()) {
                                Logger.d(f51984r, "should handle resource attachment, found CI in " + next.a() + " finder for ad ID: " + strA2);
                                break;
                            }
                            arrayList = next.a(str, strA);
                            if (arrayList != null && !arrayList.isEmpty()) {
                                Logger.d(f51984r, "should handle resource attachment, found CI in " + next.a() + " finder for webview: " + strA);
                                break;
                            }
                        }
                    }
                }
                if (arrayList == null || arrayList.isEmpty()) {
                    return false;
                }
                Logger.d(f51984r, "attaching resource for ad id " + strA2);
                if (e.a(str, str2, map)) {
                    if (k.b(str2, map)) {
                        if (!str2.startsWith(CreativeInfo.f52472aq)) {
                            str2 = CreativeInfo.f52472aq + str2;
                        }
                        Logger.d(f51984r, "video resource found : " + str2);
                    }
                    Logger.d(f51984r, "should handle resource attachment ci ids are: " + CreativeInfo.a(arrayList, VastAttributes.AD_ID));
                    for (CreativeInfo creativeInfo2 : arrayList) {
                        if (strA2.equals(creativeInfo2.L())) {
                            String strA3 = BrandSafetyUtils.a(webView);
                            com.safedk.android.analytics.brandsafety.c cVarB = SafeDK.getInstance().a(creativeInfo2.K()).b(strA);
                            if (cVarB == null || cVarB.x() == null || !cVarB.x().contains(strA3)) {
                                Logger.d(f51984r, "not adding for ad id " + strA2 + " due to webview address difference. webview address: " + strA3 + ", ci matching object address : " + creativeInfo2.af() + ", resource: " + str2);
                            } else {
                                Logger.d(f51984r, "adding for ad id " + strA2 + " webview address: " + strA3 + " resource: " + str2);
                                creativeInfo2.y(str2);
                                z10 = true;
                            }
                        }
                    }
                    if (!z10) {
                        if (z11) {
                            e.a(str, webView, str2, map);
                        } else {
                            e.a(str, webView, str2, map, strA2);
                        }
                    }
                } else if (e.a(str, str2)) {
                    if (z11) {
                        e.a(str, webView, str2, map);
                    } else {
                        e.a(str, webView, str2, map, strA2);
                    }
                }
            } else if (z11) {
                e.a(str, webView, str2, map);
            }
        } else {
            if (webViewResourceMatchingMethodB != AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP || webView == null) {
                Logger.d(f51984r, "should handle resource attachment returns false");
                return false;
            }
            e.a(str, webView, str2, map);
        }
        return true;
    }

    public static boolean a(String str, AdNetworkConfiguration adNetworkConfiguration, boolean z10) {
        AdNetworkDiscovery adNetworkDiscovery;
        return (!aI || !aG.get() || str == null || (adNetworkDiscovery = adNetworkDiscoveries.get(str)) == null || adNetworkDiscovery.d() == null || !adNetworkDiscovery.d().a(adNetworkConfiguration)) ? z10 : adNetworkDiscovery.d().b(adNetworkConfiguration);
    }

    public static boolean a(String str, com.safedk.android.analytics.brandsafety.e eVar) {
        if (!aI || !aG.get()) {
            return false;
        }
        if (eVar.x() == null) {
            return false;
        }
        Iterator<String> it = f51991y.keySet().iterator();
        while (it.hasNext()) {
            Set<String> set = f51991y.get(it.next());
            if (set != null && set.contains(str)) {
                Iterator<String> it2 = eVar.x().iterator();
                while (it2.hasNext()) {
                    if (set.contains(it2.next())) {
                        Logger.d(f51984r, "shouldVerifyMatchingMultipleWebViews: found multiple webview addresses for one banner. webViewAddresses= " + set + ", views hierarchy: " + eVar.x());
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static String b(String str) {
        String str2 = E.get(str);
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<CreativeInfo> b(int i10) {
        List<CreativeInfo> listRemove;
        ArrayList arrayList = new ArrayList();
        CreativeInfo creativeInfoRemove = B.remove(Integer.valueOf(i10));
        if (creativeInfoRemove != null) {
            arrayList.add(creativeInfoRemove);
            if (creativeInfoRemove.ah() && (listRemove = f51992z.remove(creativeInfoRemove.L())) != null) {
                arrayList.addAll(listRemove);
            }
        }
        Logger.d(f51984r, "get CIs by hash code, number of CIs: " + arrayList.size() + ", hash code: " + i10);
        return arrayList;
    }

    public static void b() {
        Logger.d(f51984r, "getAdNetworkVersions started, adNetworkDiscoveries size is " + adNetworkDiscoveries.size());
        SdksMapping.init();
        Iterator<AdNetworkDiscovery> it = adNetworkDiscoveries.values().iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        if (aI && aG.get() && maxAd != null) {
            String adUnitId = maxAd.getAdUnitId();
            Bundle bundleA = com.safedk.android.analytics.brandsafety.creatives.discoveries.c.a(maxAd);
            if (bundleA != null) {
                String string = bundleA.getString("eventId");
                String string2 = bundleA.getString("sdk");
                String string3 = bundleA.getString("bidResponse");
                Logger.d(f51984r, "Max native ad loaded: " + maxNativeAdView + " ad unit id: " + adUnitId + ", network: " + maxAd.getNetworkName() + ", isOnUiThread = " + k.c());
                NativeFinder nativeFinderB = SafeDK.getInstance().B();
                if (nativeFinderB != null && maxNativeAdView != null) {
                    nativeFinderB.a(string, string2, maxNativeAdView);
                }
                b(string2, string3, maxNativeAdView);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(CreativeInfo creativeInfo, String str, int i10) {
        a(creativeInfo, str, i10 + "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, View view) {
        try {
            Logger.d(f51984r, "View clicked event sdk=" + str + ", view id = " + Integer.toString(view.getId(), 16) + ", isOnUiThread = " + k.c());
            if (aI && aG.get()) {
                if (view == null) {
                    Logger.d(f51984r, "View clicked event sdk=" + str + ", view=null, exiting.");
                } else {
                    AdNetworkDiscovery adNetworkDiscoveryH = h(str);
                    if (adNetworkDiscoveryH != null) {
                        adNetworkDiscoveryH.d(view);
                    } else {
                        Logger.d(f51984r, "clicked from unsupported SDK: " + str);
                    }
                }
            }
        } catch (Throwable th2) {
            Logger.e(f51984r, "View clicked event exception", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, View view, MotionEvent motionEvent) {
        try {
            Logger.d(f51984r, "onViewTouchedImpl started, sdkPackageName = " + str + ", view = " + view + ", motionEvent = " + motionEvent + ", isOnUiThread = " + k.c());
            AdNetworkDiscovery adNetworkDiscoveryH = h(str);
            if (adNetworkDiscoveryH != null) {
                adNetworkDiscoveryH.e(view);
            } else {
                Logger.d(f51984r, "View touched event clicked from unsupported SDK: " + str);
            }
        } catch (Throwable th2) {
            Logger.e(f51984r, "View touched event exception", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, WebViewBridgeInterface webViewBridgeInterface) {
        if (aI && aG.get()) {
            String strA = BrandSafetyUtils.a(webViewBridgeInterface);
            k.b(f51984r, "onWebviewInterfaceConstruction: packageName is: " + str + ", isOnUiThread = " + k.c() + ", bridge address is: " + strA);
            AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
            if (adNetworkDiscovery == null) {
                Logger.d(f51984r, "onWebviewInterfaceConstruction: couldn't find discovery for package: " + str);
            } else {
                adNetworkDiscovery.a(strA, (WebView) null);
            }
        }
    }

    public static void b(final String str, final Object obj, final Object obj2) {
        try {
            Logger.d(f51984r, "Ad Object ready");
            if (aI && aG.get()) {
                aH.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.3
                    @Override // java.lang.Runnable
                    public void run() {
                        Logger.d(CreativeInfoManager.f51984r, "Executor started " + str + " ad instance: " + obj + ", matching object: " + obj2 + ", isOnUiThread = " + k.c());
                        CreativeInfoManager.d(str, obj, obj2);
                    }
                });
            } else {
                Logger.d(f51984r, "Ad Object ready SafeDK not initialized");
                Logger.printStackTrace(f51984r);
            }
        } catch (Throwable th2) {
            Logger.e(f51984r, th2.getMessage(), th2);
            try {
                new CrashReporter().caughtException(th2);
            } catch (Throwable th3) {
            }
        }
    }

    public static void b(String str, String str2) {
        Set<String> hashSet = f51991y.get(str);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            f51991y.put(str, hashSet);
        }
        hashSet.add(str2);
    }

    public static void b(final String str, final String str2, final String str3) {
        try {
            if (aI && aG.get()) {
                Logger.d(f51984r, "File output stream completed " + str + " , " + str2);
                aH.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.15
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            AdNetworkDiscovery adNetworkDiscovery = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str);
                            if (adNetworkDiscovery == null) {
                                Logger.d(CreativeInfoManager.f51984r, "no discovery object for SDK " + str);
                            } else if (adNetworkDiscovery.d().b(AdNetworkConfiguration.FILE_WRITE_AS_NETWORK_READ)) {
                                CreativeInfoManager.b(str, str2, str3, null, null, null);
                            } else {
                                adNetworkDiscovery.d(str2, str3);
                            }
                        } catch (Throwable th2) {
                            new CrashReporter().caughtException(th2);
                            Logger.e(CreativeInfoManager.f51984r, th2.getMessage(), th2);
                        }
                    }
                });
            } else {
                Logger.d(f51984r, "File output stream completed SafeDK not initialized");
            }
        } catch (Throwable th2) {
            try {
                Logger.e(f51984r, th2.getMessage(), th2);
                new CrashReporter().caughtException(th2);
            } catch (Throwable th3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, String str2, String str3, Map<String, List<String>> map, c.a aVar, String str4) {
        try {
            AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
            if (adNetworkDiscovery == null) {
                Logger.d(f51984r, "no discovery object found for SDK " + str);
                return;
            }
            if (str3.length() > 204800 || str2.endsWith(".gif") || str2.endsWith(".mp4") || str2.endsWith(".jpg") || str2.endsWith(".jpeg")) {
                Logger.d(f51984r, "ad fetched Impl sdk: " + str + " url: " + str2 + " , content size=" + str3.length());
            } else {
                k.b(f51984r, "ad fetched Impl sdk: " + str + ", originalUrl: " + str2 + " eventId: " + (aVar == null ? "" : aVar.f52178a) + ", value: " + str3);
            }
            long jNanoTime = System.nanoTime();
            List<CreativeInfo> listA = adNetworkDiscovery.a(str2, str3, map, aVar);
            int size = listA != null ? listA.size() : 0;
            Logger.d(f51984r, "ad network discovery generate info sdk " + str + " took " + ((System.nanoTime() - jNanoTime) / 1000000) + " ms, number of CIs: " + size);
            if (size > 0) {
                for (CreativeInfo creativeInfo : listA) {
                    if (creativeInfo.J()) {
                        Logger.d(f51984r, "ci is empty");
                    } else {
                        if (str4 != null) {
                            creativeInfo.u("isci=(" + str4 + ")");
                        }
                        Logger.d(f51984r, "ci saved id=" + creativeInfo.L() + ", is multi ad? " + creativeInfo.ah() + ", video url=" + creativeInfo.H());
                        if (b(creativeInfo)) {
                            adNetworkDiscovery.h(creativeInfo.L());
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            try {
                new CrashReporter().caughtException(th2);
                Logger.e(f51984r, "Exception in ad fetch: " + th2.getMessage(), th2);
            } catch (Throwable th3) {
            }
        }
    }

    public static boolean b(WebView webView, String str, String str2) {
        if (!aI || !aG.get()) {
            return false;
        }
        Logger.d(f51984r, "adIdFoundOnDataLoaded started with ad id " + str2);
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
        if (adNetworkDiscovery == null) {
            Logger.d(f51984r, "adIdFoundOnDataLoaded - packageName: " + str + " does not corresponds to any ad network");
            return false;
        }
        String strA = BrandSafetyUtils.a(webView);
        List<CreativeInfo> listA = a(adNetworkDiscovery, str2);
        Logger.d(f51984r, "adIdFoundOnDataLoaded - data loaded to webView ad id: " + str2 + " ci: " + listA);
        if (listA.size() == 0) {
            Logger.d(f51984r, "adIdFoundOnDataLoaded - ci list is empty, exiting");
            return false;
        }
        for (CreativeInfo creativeInfo : listA) {
            if (creativeInfo.K() == BrandSafetyUtils.AdType.INTERSTITIAL || creativeInfo.K() == BrandSafetyUtils.AdType.BANNER || creativeInfo.K() == BrandSafetyUtils.AdType.MREC) {
                creativeInfo.b(B);
                creativeInfo.a((Object) webView);
                a(creativeInfo, CreativeInfo.f52483l, str2);
                if (creativeInfo.K() == BrandSafetyUtils.AdType.INTERSTITIAL) {
                    SafeDKWebAppInterface.a(strA);
                    e.a(strA);
                }
            }
        }
        return true;
    }

    public static boolean b(CreativeInfo creativeInfo) {
        boolean z10 = false;
        if (f51983q || (aI && aG.get())) {
            if (creativeInfo == null || creativeInfo.L() == null) {
                Logger.d(f51984r, "store Creative Info creative info is null or CIs ID is null, cannot store it.");
            } else {
                synchronized (f51990x) {
                    if (creativeInfo.ah()) {
                        a(creativeInfo);
                        if (f51990x.containsKey(creativeInfo.L())) {
                        }
                    }
                    boolean zA = a(creativeInfo.Q(), AdNetworkConfiguration.SHOULD_OVERWRITE_REPEATED_CI_IN_CREATIVE_INFO_MANAGER_LISTS, true);
                    if (f51990x.containsKey(creativeInfo.L()) && !zA && creativeInfo.ad()) {
                        Logger.d(f51984r, "store Creative Info CI already exists, do not overwrite it. ID: " + creativeInfo.L());
                    } else {
                        f51990x.put(creativeInfo.L(), creativeInfo);
                        Logger.d(f51984r, "store Creative Info CI stored, sdkPackageName = " + creativeInfo.Q() + ", ID: " + creativeInfo.L());
                        if (creativeInfo.a(B)) {
                            Logger.d(f51984r, "store Creative Info storing creative info with hashcode: " + creativeInfo.S() + ", CI: " + creativeInfo);
                        } else {
                            Logger.d(f51984r, "store Creative Info creative info content hashcode is null, cannot store it.");
                        }
                        z10 = true;
                    }
                }
            }
        }
        return z10;
    }

    public static CreativeInfo c(String str, String str2) {
        try {
            if (!aI || !aG.get()) {
                return null;
            }
            CreativeInfo creativeInfoRemove = D.remove(str2);
            if (creativeInfoRemove == null) {
                return creativeInfoRemove;
            }
            if (creativeInfoRemove.L() != null && !adNetworkDiscoveries.get(str).d().b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_PREFETCH_REUSE)) {
                synchronized (f51990x) {
                    f51990x.remove(creativeInfoRemove.L());
                }
            }
            creativeInfoRemove.b(B);
            return creativeInfoRemove;
        } catch (Throwable th2) {
            Logger.e(f51984r, th2.getMessage(), th2);
            try {
                new CrashReporter().caughtException(th2);
            } catch (Throwable th3) {
            }
            return null;
        }
    }

    public static HashSet<String> c() {
        return F;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, WebView webView, String str2) {
        String str3;
        String strA;
        String strF = null;
        try {
            if (f51983q || (aI && aG.get())) {
                String strE = k.E(str2);
                if (webView != null) {
                    String strA2 = BrandSafetyUtils.a(webView);
                    Logger.d(f51984r, "Resource loaded. sdk: " + str + ", webView: " + webView + " resource: " + strE);
                    a(str, strA2, str2);
                    str3 = strA2;
                } else {
                    Logger.d(f51984r, "Resource loaded. sdk: " + str + ", webView: null , resource: " + strE);
                    str3 = null;
                }
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                if (adNetworkDiscovery != null && adNetworkDiscovery.b(strE, str3) && (strA = adNetworkDiscovery.a(strE, strE, new WeakReference<>(webView))) != null) {
                    Logger.d(f51984r, "Resource loaded adId = " + strA + ", activity = " + l.a(webView));
                    List<CreativeInfo> listA = a(webView, str, strA);
                    if (listA.size() > 0) {
                        strF = listA.get(0).F();
                    }
                }
                if (a(adNetworkDiscovery, str, webView, str2, (Map<String, String>) null)) {
                    Logger.d(f51984r, "should handle resource attachment returned true, don't call resource url filter to handle loaded url. sdk=" + str + ", resource=" + str2);
                } else {
                    Logger.d(f51984r, "calling resource url filter to handle loaded url");
                    e.a(str, webView, strE, strF, (Map<String, String>) null);
                }
            }
        } catch (Throwable th2) {
            new CrashReporter().caughtException(th2);
            Logger.d(f51984r, "resource loaded failed", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, Object obj) {
        if (aI && aG.get()) {
            Logger.d(f51984r, "Video completed event sdk=" + str + ", source " + obj + ", isOnUiThread = " + k.c());
            SafeDK safeDK = SafeDK.getInstance();
            if (safeDK == null || safeDK.y() == null) {
                return;
            }
            safeDK.y().a(str, obj);
        }
    }

    public static void c(final String str, final String str2, final String str3) {
        try {
            if (aI && aG.get()) {
                aH.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.16
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            AdNetworkDiscovery adNetworkDiscovery = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str);
                            if (adNetworkDiscovery == null) {
                                Logger.d(CreativeInfoManager.f51984r, "no discovery object for SDK " + str);
                                return;
                            }
                            String strE = adNetworkDiscovery.e(str2, str3);
                            if (strE != null) {
                                for (CreativeInfo creativeInfo : CreativeInfoManager.a(adNetworkDiscovery, strE)) {
                                    if (creativeInfo.K() == BrandSafetyUtils.AdType.INTERSTITIAL || creativeInfo.K() == BrandSafetyUtils.AdType.BANNER || creativeInfo.K() == BrandSafetyUtils.AdType.MREC) {
                                        CreativeInfoManager.a(creativeInfo, CreativeInfo.f52484m, strE);
                                        Logger.d(CreativeInfoManager.f51984r, "set CI in ad finder: " + creativeInfo);
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            new CrashReporter().caughtException(th2);
                            Logger.e(CreativeInfoManager.f51984r, th2.getMessage(), th2);
                        }
                    }
                });
            } else {
                Logger.d(f51984r, "handling output stream SafeDK not initialized");
            }
        } catch (Throwable th2) {
            Logger.e(f51984r, "Exception handling output stream : " + th2.getMessage(), th2);
            try {
                new CrashReporter().caughtException(th2);
            } catch (Throwable th3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, String str2, boolean z10) {
        if (aI && aG.get()) {
            Logger.d(f51984r, "Video completed event sdk=" + str + ", view address=" + str2 + ", completed? " + z10);
            SafeDK safeDK = SafeDK.getInstance();
            if (safeDK != null) {
                Iterator<com.safedk.android.analytics.brandsafety.b> it = safeDK.x().values().iterator();
                while (it.hasNext()) {
                    it.next().a(str, str2, z10);
                }
            }
        }
    }

    public static boolean c(String str) {
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
        if (adNetworkDiscovery == null) {
            return false;
        }
        return adNetworkDiscovery.a();
    }

    public static Set<String> d(String str) {
        if (!aI || !aG.get()) {
            return new HashSet();
        }
        if (str == null) {
            return new HashSet();
        }
        Iterator<String> it = f51991y.keySet().iterator();
        while (it.hasNext()) {
            Set<String> set = f51991y.get(it.next());
            if (set != null && set.contains(str)) {
                Logger.d(f51984r, "getAllWebViewsForBanner: found multiple webviews. webviewAddress= " + str + ", addresses= " + set);
                return set;
            }
        }
        return new HashSet();
    }

    public static synchronized void d() {
        try {
            if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
                if (aG.get()) {
                    Logger.d(f51984r, "initCreativeInfoManager already executed, skipping");
                } else {
                    Logger.d(f51984r, "initCreativeInfoManager started");
                    f();
                    n();
                    boolean zIsEmpty = adNetworkDiscoveries.isEmpty();
                    init();
                    if (zIsEmpty) {
                        b();
                    }
                    aG.set(true);
                }
            }
        } catch (Throwable th2) {
            Logger.e(f51984r, "Error initializing CreativeInfoManager ", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str, Object obj, Object obj2) {
        try {
            Logger.d(f51984r, "ad object ready impl " + obj);
            AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
            if (adNetworkDiscovery == null) {
                Logger.d(f51984r, "ad object ready impl no discovery object for SDK " + str);
                return;
            }
            CreativeInfo creativeInfoA = adNetworkDiscovery.a(obj);
            if (creativeInfoA == null) {
                Logger.d(f51984r, "no CI returned.");
                adNetworkDiscovery.a(obj, obj2);
                return;
            }
            creativeInfoA.a(obj2);
            if (BrandSafetyUtils.AdType.INTERSTITIAL.equals(creativeInfoA.K()) || BrandSafetyUtils.AdType.NATIVE.equals(creativeInfoA.K()) || BrandSafetyUtils.AdType.BANNER.equals(creativeInfoA.K()) || BrandSafetyUtils.AdType.MREC.equals(creativeInfoA.K())) {
                Logger.d(f51984r, "calling set creative in ad finder with " + creativeInfoA);
                a(creativeInfoA, CreativeInfo.f52485n, "");
            }
            f(str, creativeInfoA.L());
        } catch (Throwable th2) {
            new CrashReporter().caughtException(th2);
            Logger.d(f51984r, "ad object ready impl error ", th2);
        }
    }

    public static void d(String str, String str2) {
        if (aI && aG.get()) {
            Logger.d(f51984r, "request to stop take screenshots from current interstitial impression received for package " + str);
            InterstitialFinder interstitialFinderY = SafeDK.getInstance().y();
            if (interstitialFinderY == null) {
                Logger.d(f51984r, "interstitial finder is null, exiting");
            } else {
                interstitialFinderY.b(str, str2, false);
            }
        }
    }

    private static void d(final String str, final String str2, final String str3) {
        try {
            if (aI && aG.get()) {
                aH.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.17
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            AdNetworkDiscovery adNetworkDiscovery = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str);
                            if (adNetworkDiscovery == null) {
                                Logger.d(CreativeInfoManager.f51984r, "no discovery object for SDK " + str);
                                return;
                            }
                            String strC = adNetworkDiscovery.c(str3, str2);
                            if (strC != null) {
                                Logger.d(CreativeInfoManager.f51984r, "handle shown ad - adId = " + strC);
                                for (CreativeInfo creativeInfo : CreativeInfoManager.a(adNetworkDiscovery, strC)) {
                                    Logger.d(CreativeInfoManager.f51984r, "clickUrl = " + creativeInfo.M());
                                    if (creativeInfo.K() == BrandSafetyUtils.AdType.INTERSTITIAL || creativeInfo.K() == BrandSafetyUtils.AdType.BANNER || creativeInfo.K() == BrandSafetyUtils.AdType.MREC) {
                                        CreativeInfoManager.a(creativeInfo, CreativeInfo.f52483l, strC);
                                        creativeInfo.b(CreativeInfoManager.B);
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            new CrashReporter().caughtException(th2);
                            Logger.d(CreativeInfoManager.f51984r, "Exception when handling shown ad : " + th2.getMessage(), th2);
                        }
                    }
                });
            } else {
                Logger.d(f51984r, "handle shown ad SafeDK not initialized");
            }
        } catch (Throwable th2) {
            Logger.d(f51984r, "handling shown ad failed", th2);
            try {
                new CrashReporter().caughtException(th2);
            } catch (Throwable th3) {
            }
        }
    }

    public static List<CreativeInfo> e(String str) {
        return f51992z.remove(str);
    }

    public static void e() {
        f();
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53130d, new m());
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53127a, new com.safedk.android.analytics.brandsafety.creatives.discoveries.c());
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53132f, new com.safedk.android.analytics.brandsafety.creatives.discoveries.f());
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53142p, new FyberDiscovery());
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53135i, new com.safedk.android.analytics.brandsafety.creatives.discoveries.e());
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53128b, new com.safedk.android.analytics.brandsafety.creatives.discoveries.a());
        adNetworkDiscoveries.put("com.unity3d.ads", new com.safedk.android.analytics.brandsafety.creatives.discoveries.l());
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53147u, new j());
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53152z, new com.safedk.android.analytics.brandsafety.creatives.discoveries.g());
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53148v, new com.safedk.android.analytics.brandsafety.creatives.discoveries.k());
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53134h, new com.safedk.android.analytics.brandsafety.creatives.discoveries.b());
        f51990x = new ConcurrentHashMap();
    }

    private static void e(String str, String str2) {
        if (aI && aG.get()) {
            Logger.d(f51984r, "set active ad in ad finder as video ad started, sdkPackageName = " + str + ", webViewAddress = " + str2);
            Iterator<com.safedk.android.analytics.brandsafety.b> it = SafeDK.getInstance().x().values().iterator();
            while (it.hasNext()) {
                List<CreativeInfo> listA = it.next().a(str, str2);
                if (listA == null || listA.size() <= 0) {
                    Logger.d(f51984r, "set active ad in ad finder as video ad, ci list is null or empty. sdkPackageName = " + str + ", webViewAddress = " + str2);
                } else {
                    for (CreativeInfo creativeInfo : listA) {
                        Logger.d(f51984r, "set active ad in ad finder as video ad, ci: " + creativeInfo);
                        creativeInfo.d(true);
                    }
                }
            }
        }
    }

    public static void f() {
        if (SafeDK.getInstance() == null || !SafeDK.getInstance().o()) {
            return;
        }
        F.add("APPLOVIN_NETWORK");
        F.add("APPLOVIN_EXCHANGE");
        F.add(f51975i);
        F.add(f51976j);
        E.put("APPLOVIN_NETWORK", com.safedk.android.utils.g.f53127a);
        E.put("APPLOVIN_EXCHANGE", com.safedk.android.utils.g.f53127a);
        E.put(f51975i, com.safedk.android.utils.g.f53127a);
        E.put(G, com.safedk.android.utils.g.f53132f);
        E.put(H, com.safedk.android.utils.g.f53132f);
        E.put(I, com.safedk.android.utils.g.f53130d);
        E.put(J, com.safedk.android.utils.g.f53130d);
        E.put(K, "com.unity3d.ads");
        E.put(L, "com.unity3d.ads");
        E.put(M, com.safedk.android.utils.g.f53134h);
        E.put(N, com.safedk.android.utils.g.f53134h);
        E.put(O, com.safedk.android.utils.g.f53134h);
        E.put(P, com.safedk.android.utils.g.f53141o);
        E.put(Q, com.safedk.android.utils.g.f53141o);
        E.put(R, com.safedk.android.utils.g.f53142p);
        E.put(S, com.safedk.android.utils.g.f53142p);
        E.put(T, com.safedk.android.utils.g.f53142p);
        E.put(U, com.safedk.android.utils.g.f53128b);
        E.put(V, com.safedk.android.utils.g.f53128b);
        E.put(Y, com.safedk.android.utils.g.f53129c);
        E.put(Z, com.safedk.android.utils.g.f53129c);
        E.put(f51948aa, com.safedk.android.utils.g.f53134h);
        E.put(f51949ab, com.safedk.android.utils.g.f53134h);
        E.put(f51950ac, com.safedk.android.utils.g.f53134h);
        E.put(f51951ad, com.safedk.android.utils.g.f53135i);
        E.put(f51952ae, com.safedk.android.utils.g.f53135i);
        E.put(f51953af, com.safedk.android.utils.g.f53135i);
        E.put(f51954ag, com.safedk.android.utils.g.f53143q);
        E.put(f51955ah, com.safedk.android.utils.g.f53143q);
        E.put(f51956ai, com.safedk.android.utils.g.f53144r);
        E.put(f51957aj, com.safedk.android.utils.g.f53144r);
        E.put(f51958ak, com.safedk.android.utils.g.f53145s);
        E.put(f51959al, com.safedk.android.utils.g.f53145s);
        E.put(f51960am, com.safedk.android.utils.g.f53146t);
        E.put(f51961an, com.safedk.android.utils.g.f53146t);
        E.put(f51962ao, com.safedk.android.utils.g.f53146t);
        E.put(f51963ap, com.safedk.android.utils.g.f53147u);
        E.put(f51964aq, com.safedk.android.utils.g.f53147u);
        E.put(f51965ar, com.safedk.android.utils.g.f53148v);
        E.put(f51966as, com.safedk.android.utils.g.f53148v);
        E.put(f51967at, com.safedk.android.utils.g.f53149w);
        E.put(au, com.safedk.android.utils.g.f53149w);
        E.put(av, com.safedk.android.utils.g.f53136j);
        E.put(aw, com.safedk.android.utils.g.f53136j);
        E.put(ax, com.safedk.android.utils.g.f53150x);
        E.put(ay, com.safedk.android.utils.g.f53150x);
        E.put(az, com.safedk.android.utils.g.f53151y);
        E.put(aA, com.safedk.android.utils.g.f53151y);
        E.put(aB, com.safedk.android.utils.g.f53152z);
        E.put(W, com.safedk.android.utils.g.B);
        E.put(X, com.safedk.android.utils.g.B);
        E.put(ax, com.safedk.android.utils.g.A);
        E.put(ay, com.safedk.android.utils.g.A);
        E.put(aE, "io.bidmachine");
        E.put(aF, com.safedk.android.utils.g.D);
    }

    public static void f(String str) {
        SafeDK safeDK = SafeDK.getInstance();
        if (safeDK == null || safeDK.y() == null) {
            return;
        }
        safeDK.y().j(str);
    }

    private static void f(String str, String str2) {
        CreativeInfo creativeInfoRemove;
        if (adNetworkDiscoveries.get(str).d().b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_PREFETCH_REUSE)) {
            synchronized (f51990x) {
                creativeInfoRemove = f51990x.remove(str2);
            }
            if (creativeInfoRemove != null) {
                creativeInfoRemove.b(B);
                creativeInfoRemove.c(D);
            }
        }
    }

    public static void g() {
        if (aI && aG.get()) {
            for (AdNetworkDiscovery adNetworkDiscovery : adNetworkDiscoveries.values()) {
                if (adNetworkDiscovery.d() != null) {
                    Logger.d(f51984r, "Config item SDK " + adNetworkDiscovery.h() + " min image uniformity threshold is " + adNetworkDiscovery.d().d(AdNetworkConfiguration.SDK_SPECIFIC_MIN_UNIFORM_PIXELS_PERCENTAGE_FOR_UNIFORM_IMAGE));
                }
            }
        }
    }

    public static boolean g(String str) {
        return k.a(str, f51978l) && str.contains(f51977k);
    }

    public static AdNetworkDiscovery h(String str) {
        if (!aI || !aG.get()) {
            return null;
        }
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
        if (adNetworkDiscovery == null) {
            return null;
        }
        return adNetworkDiscovery;
    }

    public static void h() {
        if (aI && aG.get()) {
            Logger.d(f51984r, "clear old CIs from ad networks started");
            synchronized (f51990x) {
                com.safedk.android.utils.e.a(f51990x, "CreativeInfoManager:adIdToCreatives", true);
            }
            com.safedk.android.utils.e.a(f51992z, "CreativeInfoManager:multiAdCreatives", true);
            com.safedk.android.utils.e.a(B, "CreativeInfoManager:contentHashCodeToCreatives", true);
            com.safedk.android.utils.e.a(D, "CreativeInfoManager:webviewAddressToCreatives", true);
        }
    }

    public static com.safedk.android.analytics.brandsafety.creatives.a i(String str) {
        if (!aI || !aG.get()) {
            return null;
        }
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
        if (adNetworkDiscovery != null) {
            return adNetworkDiscovery.d();
        }
        return null;
    }

    public static Set<String> i() {
        return adNetworkDiscoveries.keySet();
    }

    private static void init() {
        FyberDiscovery fyberDiscovery = new FyberDiscovery();
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53142p, fyberDiscovery);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53142p, fyberDiscovery);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53142p, fyberDiscovery);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53142p, fyberDiscovery);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53142p, fyberDiscovery);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53142p, fyberDiscovery);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53142p, fyberDiscovery);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53142p, fyberDiscovery);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53142p, fyberDiscovery);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53142p, fyberDiscovery);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53142p, fyberDiscovery);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53142p, fyberDiscovery);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53142p, fyberDiscovery);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53142p, fyberDiscovery);
        com.safedk.android.analytics.brandsafety.creatives.discoveries.b bVar = new com.safedk.android.analytics.brandsafety.creatives.discoveries.b();
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53134h, bVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53134h, bVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53134h, bVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53134h, bVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53134h, bVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53134h, bVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53134h, bVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53134h, bVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53134h, bVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53134h, bVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53134h, bVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53134h, bVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53134h, bVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53134h, bVar);
        com.safedk.android.analytics.brandsafety.creatives.discoveries.c cVar = new com.safedk.android.analytics.brandsafety.creatives.discoveries.c();
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53127a, cVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53127a, cVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53127a, cVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53127a, cVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53127a, cVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53127a, cVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53127a, cVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53127a, cVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53127a, cVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53127a, cVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53127a, cVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53127a, cVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53127a, cVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53127a, cVar);
        com.safedk.android.analytics.brandsafety.creatives.discoveries.e eVar = new com.safedk.android.analytics.brandsafety.creatives.discoveries.e();
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53135i, eVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53135i, eVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53135i, eVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53135i, eVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53135i, eVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53135i, eVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53135i, eVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53135i, eVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53135i, eVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53135i, eVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53135i, eVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53135i, eVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53135i, eVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53135i, eVar);
        com.safedk.android.analytics.brandsafety.creatives.discoveries.f fVar = new com.safedk.android.analytics.brandsafety.creatives.discoveries.f();
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53132f, fVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53132f, fVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53132f, fVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53132f, fVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53132f, fVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53132f, fVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53132f, fVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53132f, fVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53132f, fVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53132f, fVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53132f, fVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53132f, fVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53132f, fVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53132f, fVar);
        h hVar = new h();
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53141o, hVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53141o, hVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53141o, hVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53141o, hVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53141o, hVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53141o, hVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53141o, hVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53141o, hVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53141o, hVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53141o, hVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53141o, hVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53141o, hVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53141o, hVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53141o, hVar);
        i iVar = new i();
        adNetworkDiscoveries.put(com.safedk.android.utils.g.D, iVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.D, iVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.D, iVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.D, iVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.D, iVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.D, iVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.D, iVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.D, iVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.D, iVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.D, iVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.D, iVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.D, iVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.D, iVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.D, iVar);
        j jVar = new j();
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53147u, jVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53147u, jVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53147u, jVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53147u, jVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53147u, jVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53147u, jVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53147u, jVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53147u, jVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53147u, jVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53147u, jVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53147u, jVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53147u, jVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53147u, jVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53147u, jVar);
        com.safedk.android.analytics.brandsafety.creatives.discoveries.l lVar = new com.safedk.android.analytics.brandsafety.creatives.discoveries.l();
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53139m, lVar);
        adNetworkDiscoveries.put("com.unity3d.ads", lVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53139m, lVar);
        adNetworkDiscoveries.put("com.unity3d.ads", lVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53139m, lVar);
        adNetworkDiscoveries.put("com.unity3d.ads", lVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53139m, lVar);
        adNetworkDiscoveries.put("com.unity3d.ads", lVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53139m, lVar);
        adNetworkDiscoveries.put("com.unity3d.ads", lVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53139m, lVar);
        adNetworkDiscoveries.put("com.unity3d.ads", lVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53139m, lVar);
        adNetworkDiscoveries.put("com.unity3d.ads", lVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53139m, lVar);
        adNetworkDiscoveries.put("com.unity3d.ads", lVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53139m, lVar);
        adNetworkDiscoveries.put("com.unity3d.ads", lVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53139m, lVar);
        adNetworkDiscoveries.put("com.unity3d.ads", lVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53139m, lVar);
        adNetworkDiscoveries.put("com.unity3d.ads", lVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53139m, lVar);
        adNetworkDiscoveries.put("com.unity3d.ads", lVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53139m, lVar);
        adNetworkDiscoveries.put("com.unity3d.ads", lVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53139m, lVar);
        adNetworkDiscoveries.put("com.unity3d.ads", lVar);
        m mVar = new m();
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53130d, mVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53130d, mVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53130d, mVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53130d, mVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53130d, mVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53130d, mVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53130d, mVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53130d, mVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53130d, mVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53130d, mVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53130d, mVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53130d, mVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53130d, mVar);
        adNetworkDiscoveries.put(com.safedk.android.utils.g.f53130d, mVar);
    }

    public static boolean j(String str) {
        SafeDK safeDK;
        return (!aI || !aG.get() || (safeDK = SafeDK.getInstance()) == null || safeDK.y() == null || safeDK.y().F.a(str, false) == null) ? false : true;
    }

    public static boolean k(String str) {
        SafeDK safeDK;
        return (!aI || !aG.get() || (safeDK = SafeDK.getInstance()) == null || safeDK.y() == null || safeDK.y().F.e(str) == null) ? false : true;
    }

    private static void n() {
        try {
            f51990x = new PersistentConcurrentHashMap(f51988v);
            f51992z = new PersistentConcurrentHashMap(f51989w);
            B = new PersistentConcurrentHashMap(A);
            D = new PersistentConcurrentHashMap(C);
        } catch (InvalidParameterException e10) {
            Logger.e(f51984r, "Error initializing CreativeInfoManager class, ads caching will not be available", e10);
        }
    }

    public static void onHandleInvocation(String str, WebViewBridgeInterface webViewBridgeInterface, String str2) {
        if (aI && aG.get()) {
            k.b(f51984r, "onHandleInvocation packageName = " + str + ", isOnUiThread = " + k.c() + " data is: " + str2);
            String strA = BrandSafetyUtils.a(webViewBridgeInterface);
            AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
            if (adNetworkDiscovery == null) {
                Logger.d(f51984r, "onHandleInvocation: couldn't find discovery for package: " + str);
            } else {
                adNetworkDiscovery.f(str2, strA);
            }
        }
    }

    public static void onMaxAdViewCreated(MaxAdView maxAdView, MaxAdFormat maxAdFormat, String str) {
        Logger.d(f51984r, "Max ad view created: " + maxAdView + " ad format: " + maxAdFormat + " ad unit id: " + str);
        if (maxAdView == null || maxAdFormat == null) {
            return;
        }
        if (maxAdFormat == MaxAdFormat.BANNER || maxAdFormat == MaxAdFormat.LEADER || maxAdFormat == MaxAdFormat.MREC) {
            BannerFinder.a(str, maxAdView, maxAdFormat == MaxAdFormat.MREC ? BrandSafetyUtils.AdType.MREC : BrandSafetyUtils.AdType.BANNER);
        }
    }

    public static void onMaxNativeAdCreated(MaxNativeAdView maxNativeAdView) {
        NativeFinder nativeFinderB;
        if (aI && aG.get()) {
            Logger.d(f51984r, "Max native ad created: " + maxNativeAdView);
            if (maxNativeAdView == null || (nativeFinderB = SafeDK.getInstance().B()) == null) {
                return;
            }
            nativeFinderB.a(maxNativeAdView);
        }
    }

    public static void onMaxNativeAdLoaded(final MaxNativeAdView maxNativeAdView, final MaxAd maxAd) {
        if (k.c()) {
            aH.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.12
                @Override // java.lang.Runnable
                public void run() {
                    CreativeInfoManager.b(maxNativeAdView, maxAd);
                }
            });
        } else {
            b(maxNativeAdView, maxAd);
        }
    }

    public static void onReceiveMessageFromExternal(final String str, final Object obj, final String str2) {
        aH.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.11
            @Override // java.lang.Runnable
            public void run() {
                AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(str);
                if (adNetworkDiscoveryH != null) {
                    adNetworkDiscoveryH.a(obj, str2);
                }
            }
        });
    }

    public static void onResourceLoaded(final String str, final WebView webView, final String str2) {
        try {
            if ((aI && aG.get()) || f51983q) {
                if (f51983q) {
                    c(str, webView, str2);
                } else {
                    aH.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.1
                        @Override // java.lang.Runnable
                        public void run() {
                            k.b(CreativeInfoManager.f51984r, "on resource loaded executor started " + str + " url: " + str2);
                            CreativeInfoManager.c(str, webView, str2);
                        }
                    });
                }
            }
        } catch (Throwable th2) {
            try {
                new CrashReporter().caughtException(th2);
            } catch (Throwable th3) {
            }
            Logger.e(f51984r, th2.getMessage(), th2);
        }
    }

    public static void onVideoCompleted(final String str, final Object obj) {
        if (k.c()) {
            aH.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.4
                @Override // java.lang.Runnable
                public void run() {
                    CreativeInfoManager.c(str, obj);
                }
            });
        } else {
            c(str, obj);
        }
    }

    public static void onViewClicked(final String str, final View view) {
        Logger.d(f51984r, "View clicked event sdk=" + str + ", view id = " + Integer.toString(view.getId(), 16));
        if (k.c()) {
            aH.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.6
                @Override // java.lang.Runnable
                public void run() {
                    CreativeInfoManager.b(str, view);
                }
            });
        } else {
            c(str, view);
        }
    }

    public static boolean onViewTouched(final String str, final View view, final MotionEvent motionEvent) {
        Logger.d(f51984r, "View touched event sdk=" + str + ", view id = " + Integer.toString(view.getId(), 16) + ", motion event=" + motionEvent.toString());
        if (!aI || !aG.get()) {
            return false;
        }
        if (view == null) {
            Logger.d(f51984r, "View touched event sdk=" + str + ", view=null, exiting.");
            return false;
        }
        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 11) {
            Logger.d(f51984r, "View touched event sdk=" + str + ", motion event=" + motionEvent.getAction() + ". exiting.");
            return false;
        }
        if (k.c()) {
            aH.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.7
                @Override // java.lang.Runnable
                public void run() {
                    CreativeInfoManager.b(str, view, motionEvent);
                }
            });
        } else {
            b(str, view, motionEvent);
        }
        return true;
    }

    public static void onWebViewPageFinished(String str, WebView webView, String str2) {
        Logger.d(f51984r, "WebView page finished, WebView : " + webView.toString() + ", url " + str2);
    }

    public static WebResourceResponse onWebViewResponse(String str, WebView webView, String str2, WebResourceResponse webResourceResponse) {
        Logger.d(f51984r, "on webView response " + str + ", webview " + webView + ", url " + str2);
        if (!aI || !aG.get()) {
            return webResourceResponse;
        }
        Logger.d(f51984r, "on webView response " + str + " url " + str2 + ", isOnUiThread = " + k.c());
        return a(str, str2, webResourceResponse);
    }

    public static WebResourceResponse onWebViewResponseWithHeaders(String str, WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        String strA;
        try {
            if (Build.VERSION.SDK_INT < 21) {
                Logger.d(f51984r, "Android SDK version too low.");
            } else if (aI && aG.get()) {
                String string = webResourceRequest.getUrl().toString();
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                Logger.d(f51984r, "on webView response with headers " + str + ", webview " + webView + ", url " + string + ", isOnUiThread = " + k.c());
                if (webResourceRequest == null || webResourceRequest.getRequestHeaders() == null) {
                    Logger.d(f51984r, "web resource request is null");
                } else if (webResourceRequest != null && webResourceRequest.getRequestHeaders() != null && webResourceRequest.getRequestHeaders().size() > 0 && webResourceRequest.getRequestHeaders().containsKey(k.f53181b)) {
                    Logger.d(f51984r, "web resource request accept header value is " + webResourceRequest.getRequestHeaders().get(k.f53181b));
                    if (!a(adNetworkDiscoveries.get(str), str, webView, string, webResourceRequest.getRequestHeaders())) {
                        e.a(str, webView, string, (String) null, webResourceRequest.getRequestHeaders());
                    }
                    if (adNetworkDiscovery != null) {
                        AdNetworkDiscovery.WebViewResourceMatchingMethod webViewResourceMatchingMethodB = adNetworkDiscovery.b();
                        Logger.d(f51984r, "on webView response with headers - webView resource matching method for " + str + " is " + webViewResourceMatchingMethodB.name());
                        if (webViewResourceMatchingMethodB == AdNetworkDiscovery.WebViewResourceMatchingMethod.DIRECT_CREATIVE_INFO && (strA = adNetworkDiscovery.a(string, string, new WeakReference<>(webView))) != null) {
                            a(webView, str, strA);
                        }
                    }
                    if (adNetworkDiscovery != null && adNetworkDiscovery.d().b(AdNetworkConfiguration.SHOULD_SET_CI_AS_VIDEO_AD_ON_VIDEO_RESOURCE_LOAD)) {
                        String str2 = webResourceRequest.getRequestHeaders().get(k.f53181b);
                        if (k.z(string) || (str2 != null && str2.contains("video"))) {
                            Logger.d(f51984r, "set active ad as video ad");
                            e(str, BrandSafetyUtils.a(webView));
                        }
                    }
                }
            } else {
                Logger.d(f51984r, "on webView response SafeDK not initialized");
            }
        } catch (Throwable th2) {
            try {
                new CrashReporter().caughtException(th2);
                Logger.e(f51984r, "Exception in on webView response with headers : ", th2);
            } catch (Throwable th3) {
            }
        }
        return webResourceResponse;
    }

    public static void onWebviewInterfaceConstruction(final String str, final WebViewBridgeInterface webViewBridgeInterface) {
        if (k.c()) {
            aH.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.9
                @Override // java.lang.Runnable
                public void run() {
                    CreativeInfoManager.b(str, webViewBridgeInterface);
                }
            });
        } else {
            b(str, webViewBridgeInterface);
        }
    }
}
