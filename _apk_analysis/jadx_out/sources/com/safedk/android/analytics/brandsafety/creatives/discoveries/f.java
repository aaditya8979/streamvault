package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.webkit.WebView;
import com.ironsource.C3978d4;
import com.ironsource.G5;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BannerFinder;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.utils.LimitedConcurrentHashMap;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class f extends d {
    public static final String A = "data=";
    public static final String B = "data";
    public static final String C = "eventname";
    public static final String D = "requestid";
    public static final String E = "bannerid";
    public static final String F = "auctionid";
    public static final String G = "producttype";
    public static final String H = "loadAd";
    public static final String I = "adLoaded";
    public static final String J = "loadAdSuccess";
    public static final String K = "mraid.supports";
    public static final String L = "saveAdInCacheSuccess";
    public static final String M = "showAd";
    public static final String N = "showAdSuccess";
    public static final String O = "adVisible";
    public static final String P = "adClosed";
    public static final String Q = "bannerID";
    public static final int R = 200;
    private static final String S = "IronSourceDiscovery";
    private static final String T = "crid";
    private static final String U = "type";
    private static final String V = "appData";
    private static final String W = "appId";
    private static final String X = "bid";
    private static final String Y = "id";
    private static final String Z = "auction";
    private static final String aA = "external_url";
    private static final String aB = "IRONSOURCE_BIDDING";
    private static final String aC = "IRONSOURCE_NETWORK";
    private static final String aD = "adMarkup";
    private static final String aE = "adViewId";
    private static final int aF = 20;
    private static final int aH = 10;
    private static final int aL = 20;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private static final String f52243aa = "seatbid";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final String f52244ab = "cid";

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private static final String f52245ac = "ext";

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private static final String f52246ad = "dspName";

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private static final String f52247ae = "requestID";

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private static final String f52248af = "callbacks";

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private static final String f52249ag = "layoutData";

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    private static final String f52250ah = "impressions";

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    private static final String f52251ai = "url";

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    private static final String f52252aj = "clickTags";

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    private static final String f52253ak = "clickURL";

    /* JADX INFO: renamed from: al, reason: collision with root package name */
    private static final String f52254al = "videoData";

    /* JADX INFO: renamed from: am, reason: collision with root package name */
    private static final String f52255am = "videoSource";

    /* JADX INFO: renamed from: an, reason: collision with root package name */
    private static final String f52256an = "videoformat_mp4";

    /* JADX INFO: renamed from: ao, reason: collision with root package name */
    private static final String f52257ao = "html";

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    private static final String f52258ap = "htmlURL";

    /* JADX INFO: renamed from: aq, reason: collision with root package name */
    private static final String f52259aq = "vast";

    /* JADX INFO: renamed from: ar, reason: collision with root package name */
    private static final String f52260ar = "mraid";

    /* JADX INFO: renamed from: as, reason: collision with root package name */
    private static final String f52261as = "customEndCard";

    /* JADX INFO: renamed from: at, reason: collision with root package name */
    private static final String f52262at = "rv-gateway";
    private static final String au = "gw-rv";
    private static final String av = "_SupersonicAds";
    private static final String aw = "_IronSource_";
    private static final String az = "com.applovin.mediation.adapters.IronSourceMediationAdapter";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f52263b = "Interstitial";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f52264c = "Banner";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f52265d = "instanceID";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f52266e = "iid";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f52267f = "sdk/v";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f52268g = "gateway.supersonicads.com/gateway/sdk/request";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f52269h = "iads.unity3d.com/gateway/sdk/request";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f52270i = "gw-ext.mediation.unity3d.com/auction";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f52271j = "init.supersonicads.com";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f52272k = "logs.supersonic.com";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f52273l = "logs.ironsrc.mobi";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f52274w = "unity3d.com/logs";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f52275x = "unity3d.com/d";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f52276y = "iads.unity3d.com";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f52277z = "isprog.com/d";
    private a aV;
    private a aW;
    private String aX;
    private boolean aY;
    private static final List<String> ax = Collections.synchronizedList(new ArrayList());
    private static final Set<String> ay = new HashSet();
    private static final LimitedConcurrentHashMap<String, String> aG = new LimitedConcurrentHashMap<>(20);
    private static final LimitedConcurrentHashMap<String, Long> aI = new LimitedConcurrentHashMap<>(10);
    private static final LimitedConcurrentHashMap<String, Long> aJ = new LimitedConcurrentHashMap<>(10);
    private static final LimitedConcurrentHashMap<String, List<String>> aK = new LimitedConcurrentHashMap<>(10);
    private static final LimitedConcurrentHashMap<String, WeakReference<WebView>> aM = new LimitedConcurrentHashMap<>(20);
    private static final LimitedConcurrentHashMap<String, String> aN = new LimitedConcurrentHashMap<>(20);
    private static final LimitedConcurrentHashMap<String, String> aO = new LimitedConcurrentHashMap<>(20);
    private static final LimitedConcurrentHashMap<String, CreativeInfo> aP = new LimitedConcurrentHashMap<>(20);
    private static final LimitedConcurrentHashMap<String, CreativeInfo> aQ = new LimitedConcurrentHashMap<>(20);
    private static final Map<String, c.a> aR = new LimitedConcurrentHashMap(20);
    private static final Map<String, BrandSafetyUtils.AdType> aS = new LimitedConcurrentHashMap(20);
    private static final LimitedConcurrentHashMap<String, BrandSafetyUtils.AdType> aT = new LimitedConcurrentHashMap<>(20);
    private static final Map<Integer, Long> aU = new LimitedConcurrentHashMap(20);
    private static final LimitedConcurrentHashMap<String, WeakReference<WebView>> aZ = new LimitedConcurrentHashMap<>(20);

    private class a extends Pair<String, String> {
        a(String str, String str2) {
            super(str, str2);
        }

        String a() {
            return (String) ((Pair) this).first;
        }

        String b() {
            return (String) ((Pair) this).second;
        }
    }

    public f() {
        super(g.f53132f, S, false);
        this.aY = true;
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_GZIP_CONTENT, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
        this.f52208p.b(AdNetworkConfiguration.DONT_USE_PLACEMENT_ID_IN_BANNER_AD_INFO_KEY, aC);
        this.f52208p.b(AdNetworkConfiguration.MATCH_ON_BANNER_WEBVIEW_DETECTION, true);
        this.f52208p.b(AdNetworkConfiguration.VERIFY_MATCHING_OBJECT_ADDRESS_IN_RESOURCE_URL_FILTER, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, true);
        this.f52208p.b(AdNetworkConfiguration.IGNORE_SHOULD_OVERRIDE_URL_CALLS, true);
    }

    private String a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            return str + "/" + str3;
        }
        StringBuilder sb2 = new StringBuilder();
        if (str2 == null) {
            str2 = "";
        }
        return sb2.append(str2).append("/").append(str3).toString();
    }

    private String a(String str, List<String> list, WeakReference<WebView> weakReference) {
        a aVarB = b(str, weakReference);
        if (aVarB != null && aVarB.b() != null) {
            try {
                a(aVarB, weakReference);
            } catch (Throwable th2) {
                Logger.e(S, "error occurred while calling handle webview change: " + th2.getMessage());
            }
            if (list.contains(aVarB.a())) {
                return aVarB.b();
            }
        }
        Logger.d(S, "extract ad id from IS log message - did not find pair " + aVarB);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        r1 = r3.getString("url");
        r0 = g(com.safedk.android.analytics.brandsafety.creatives.discoveries.f.f52265d, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        r0 = g(com.safedk.android.analytics.brandsafety.creatives.discoveries.f.f52266e, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        com.safedk.android.utils.Logger.d(com.safedk.android.analytics.brandsafety.creatives.discoveries.f.S, "instance ID: " + r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(org.json.JSONObject r6) {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r1 = "impressions"
            boolean r1 = r6.has(r1)
            if (r1 != 0) goto L11
            java.lang.String r1 = "IronSourceDiscovery"
            java.lang.String r2 = "extract placement Id - no impressions, can't parse"
            com.safedk.android.utils.Logger.d(r1, r2)
        L10:
            return r0
        L11:
            java.lang.String r1 = "impressions"
            org.json.JSONArray r2 = r6.getJSONArray(r1)     // Catch: org.json.JSONException -> L57
            r1 = 0
        L18:
            int r3 = r2.length()     // Catch: org.json.JSONException -> L57
            if (r1 >= r3) goto L10
            org.json.JSONObject r3 = r2.getJSONObject(r1)     // Catch: org.json.JSONException -> L57
            java.lang.String r4 = "url"
            boolean r4 = r3.has(r4)     // Catch: org.json.JSONException -> L57
            if (r4 == 0) goto L71
            java.lang.String r1 = "url"
            java.lang.String r1 = r3.getString(r1)     // Catch: org.json.JSONException -> L57
            java.lang.String r2 = "instanceID"
            java.lang.String r0 = r5.g(r2, r1)     // Catch: org.json.JSONException -> L57
            if (r0 != 0) goto L3e
            java.lang.String r2 = "iid"
            java.lang.String r0 = r5.g(r2, r1)     // Catch: org.json.JSONException -> L57
        L3e:
            java.lang.String r1 = "IronSourceDiscovery"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L57
            r2.<init>()     // Catch: org.json.JSONException -> L57
            java.lang.String r3 = "instance ID: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: org.json.JSONException -> L57
            java.lang.StringBuilder r2 = r2.append(r0)     // Catch: org.json.JSONException -> L57
            java.lang.String r2 = r2.toString()     // Catch: org.json.JSONException -> L57
            com.safedk.android.utils.Logger.d(r1, r2)     // Catch: org.json.JSONException -> L57
            goto L10
        L57:
            r1 = move-exception
            java.lang.String r2 = "IronSourceDiscovery"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "exception occurred while extracting placement id:\n"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r1 = r1.toString()
            com.safedk.android.utils.Logger.d(r2, r1)
            goto L10
        L71:
            int r1 = r1 + 1
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.analytics.brandsafety.creatives.discoveries.f.a(org.json.JSONObject):java.lang.String");
    }

    private void a(a aVar, WeakReference<WebView> weakReference) {
        if (Arrays.asList(J, I).contains(aVar.a())) {
            b("extract adId from IronSource log message - ", aVar.b(), weakReference);
        }
        if (N.equals(aVar.a()) || M.equals(aVar.a())) {
            aG.remove(aVar.b());
            Logger.d(S, "extract adId from IronSource log message - received show ad message for ad id - " + aVar.b());
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (String str : aI.keySet()) {
            if (aI.get(str) != null) {
                long jLongValue = aI.get(str).longValue();
                Logger.d(S, "extract adId from IronSource log message - handling webview address: " + str + " and unseen period: " + (jCurrentTimeMillis - jLongValue));
                if (jCurrentTimeMillis - jLongValue > TimeUnit.SECONDS.toMillis(60L) || aJ.containsKey(str)) {
                    aJ.put(str, 0L);
                    String str2 = "cwv_issue=" + str;
                    a(aG, str);
                    if (CreativeInfoManager.j(str)) {
                        Logger.d(S, "extract adId from IronSource log message - inter info exists for webview " + str);
                    } else {
                        Logger.d(S, "extract adId from IronSource log message - inter info does NOT exist for webview " + str);
                    }
                }
            }
        }
        if (k.a((Reference<?>) weakReference)) {
            String strA = BrandSafetyUtils.a(weakReference.get());
            aI.put(strA, Long.valueOf(System.currentTimeMillis()));
            Logger.d(S, "extract adId from IronSource log message - adding webview: " + strA + " to map");
        } else {
            Logger.d(S, "extract adId from IronSource log message - webview is not alive, not adding");
        }
        for (String str3 : aK.keySet()) {
            if (str3 == null || !CreativeInfoManager.j(str3)) {
                Logger.d(S, "extract adId from IronSource log message - iterating addressToMessages: inter info does NOT exist for webview " + str3);
            } else {
                Logger.d(S, "extract adId from IronSource log message - iterating addressToMessages: inter info exists for webview " + str3);
                Iterator<String> it = aK.get(str3).iterator();
                while (it.hasNext()) {
                    CreativeInfoManager.a(str3, it.next(), BrandSafetyUtils.AdType.INTERSTITIAL, com.safedk.android.analytics.brandsafety.b.f51861y);
                }
                aK.remove(str3);
            }
        }
    }

    private void a(CreativeInfo creativeInfo, String str) {
        Logger.d(S, "update CI Ad Format - ad format: " + str);
        if (creativeInfo == null) {
            Logger.d(S, "update CI Ad Format - ci is null, cannot update ad format");
            return;
        }
        if (str.equals("Banner")) {
            creativeInfo.p("BANNER");
            creativeInfo.a(BrandSafetyUtils.AdType.BANNER);
            Logger.d(S, "update CI Ad Format - setting to banner format, now ci ad format is: " + creativeInfo.I() + " and typs: " + creativeInfo.K());
        } else {
            creativeInfo.p(str.equals("Interstitial") ? BrandSafetyUtils.f51653j : BrandSafetyUtils.f51654k);
            creativeInfo.a(BrandSafetyUtils.AdType.INTERSTITIAL);
            Logger.d(S, "update CI Ad Format - setting to fullscreen format, now ci ad format is: " + creativeInfo.I() + " and typs: " + creativeInfo.K());
        }
    }

    private void a(LimitedConcurrentHashMap<String, String> limitedConcurrentHashMap, String str) {
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : limitedConcurrentHashMap.keySet()) {
            if (str.equals(limitedConcurrentHashMap.get(str2))) {
                sb2.append(str2).append(", ");
                limitedConcurrentHashMap.remove(str2);
            }
        }
        if (sb2.length() > 0) {
            k.b(S, "a cwv occurred with webview address: " + str + " and adIds: [" + ((Object) sb2) + C3978d4.j.f31385e);
        } else {
            Logger.d(S, "possibly cwv but with no ad ids");
        }
    }

    public static boolean a(int i10) {
        Long l10;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (aU.get(Integer.valueOf(i10)) == null || (l10 = aU.get(Integer.valueOf(i10))) == null || jCurrentTimeMillis - l10.longValue() >= 200) {
            aU.put(Integer.valueOf(i10), Long.valueOf(jCurrentTimeMillis));
            return true;
        }
        Logger.d(S, "check if prefetch should be parsed - same prefetch that was seen earlier");
        return false;
    }

    private a b(String str, WeakReference<WebView> weakReference) {
        if (str.contains(f52272k) || str.contains(f52273l) || str.contains(f52274w)) {
            String[] strArrSplit = str.split(A);
            if (strArrSplit.length == 2) {
                String str2 = new String(Base64.decode(strArrSplit[1], 0));
                Logger.v(S, "message is " + str2);
                try {
                    JSONObject jSONObject = new JSONObject(str2).getJSONObject("data");
                    String string = jSONObject.getString(C);
                    String strA = k.a((Reference<?>) weakReference) ? BrandSafetyUtils.a(weakReference.get()) : null;
                    String strA2 = a(jSONObject.optString(D), jSONObject.optString(F), jSONObject.optString(E));
                    Logger.d(S, "event: " + string + " and webview is: " + strA + " ad id: " + strA2);
                    String strOptString = jSONObject.optString("producttype");
                    if (aP.get(strA2) != null) {
                        Logger.d(S, "get ad id from resource - ad format: " + strOptString);
                        a(aP.get(strA2), strOptString);
                    }
                    return new a(string, strA2);
                } catch (JSONException e10) {
                    Logger.d(S, "error in json parse: " + e10);
                }
            }
        }
        return null;
    }

    private String b(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(V);
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject.optString(W);
        }
        return null;
    }

    private void b(String str, String str2, WeakReference<WebView> weakReference) {
        if (!k.a((Reference<?>) weakReference)) {
            Logger.d(S, str + "webView's ref not alive, not adding ad id: " + str2 + " to adIdToWebviewAddressMap");
            return;
        }
        String strA = BrandSafetyUtils.a(weakReference.get());
        aG.put(str2, strA);
        Logger.d(S, str + "adding ad id: " + str2 + " with webview address: " + strA);
    }

    private String c(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(f52252aj);
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        return jSONObjectOptJSONObject.getString(f52253ak);
    }

    private void c(String str, WeakReference<WebView> weakReference) {
        if (k.a((Reference<?>) weakReference) && !TextUtils.isEmpty(str) && str.contains("?")) {
            String strI = k.I(str);
            Map<String, String> mapB = k.b(str, false);
            Logger.d(S, "extract auction id started with domain: " + strI + " map is: " + mapB);
            if (mapB != null) {
                String str2 = mapB.containsKey("sid") ? mapB.get("sid") : mapB.get("s");
                if (str2 != null) {
                    Logger.d(S, "extract auction id - found auction id: " + str2);
                }
            }
        }
    }

    private String g(String str, String str2) {
        int iIndexOf = str2.indexOf(str + G5.T);
        if (iIndexOf == -1) {
            return null;
        }
        int iIndexOf2 = str2.indexOf(C3978d4.j.f31381c, iIndexOf);
        if (iIndexOf2 == -1) {
            iIndexOf2 = str2.length();
        }
        return str2.substring(iIndexOf + str.length() + 1, iIndexOf2);
    }

    private boolean i(String str, String str2) {
        if (str.contains("data=eyJ")) {
            return false;
        }
        if (aS.containsKey(str2)) {
            return aS.get(str2) == BrandSafetyUtils.AdType.BANNER;
        }
        Map<String, String> mapB = k.b(str, false);
        Logger.d(S, "isBannerMessage url is: " + str + " and map is: " + mapB);
        if (mapB == null) {
            return false;
        }
        Logger.d(S, "is banner message: values are: " + mapB.values());
        for (String str3 : mapB.values()) {
            if (str3 != null && str3.equalsIgnoreCase("Banner")) {
                Logger.d(S, "isBannerMessage added webview address: " + str2 + " to map");
                aS.put(str2, BrandSafetyUtils.AdType.BANNER);
                return true;
            }
        }
        return false;
    }

    public static String l(String str) {
        if (!k.t(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("adMarkup")) {
                return URLDecoder.decode(jSONObject.getString("adMarkup"), "UTF-8");
            }
            return null;
        } catch (Throwable th2) {
            Logger.d(S, "Exception decoding prefetch: \n" + th2.getMessage() + " encoded prefetch is: \n" + str);
            return null;
        }
    }

    private static String r(String str) {
        if (str == null || !str.contains(".")) {
            return str;
        }
        try {
            return str.split("\\.")[2].substring(0, r0.length() - 2);
        } catch (Throwable th2) {
            Logger.d(S, "exception when trying to extract ad id from adViewId: " + th2.getMessage());
            return null;
        }
    }

    private String s(String str) {
        Map<String, String> mapB = k.b(str, false);
        if (mapB == null) {
            return null;
        }
        String strR = mapB.get("sid");
        if (strR == null && mapB.containsKey("adViewId")) {
            strR = r(mapB.get("adViewId"));
        }
        if (strR == null && mapB.containsKey(Q)) {
            strR = mapB.get(Q);
            Logger.d(S, "extract Ad Id From IronSource Resource - found value in banner id! value: " + strR);
        }
        String str2 = strR;
        if (str2 != null) {
            Logger.d(S, "extract Ad Id From IronSource Resource - value: " + str2);
            Iterator<String> it = ay.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next.endsWith("/" + str2) || next.startsWith(str2 + "/")) {
                    return next;
                }
            }
            Logger.d(S, "extract Ad Id From IronSource Resource - did not find ad id, storing value: /" + str2 + " ad ids are: " + aU);
        }
        Logger.d(S, "extract Ad Id From IronSource Resource - did not find ad id");
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo a(Object obj) {
        Logger.d(S, "match ci started for ironsource banner: with object: " + obj);
        try {
            if (obj instanceof HashSet) {
                for (Object obj2 : (HashSet) obj) {
                    if (obj2 instanceof String) {
                        Logger.d(S, "match ci resource is: " + obj2);
                        String strS = s((String) obj2);
                        if (strS != null && aP.containsKey(strS)) {
                            if (aM.containsKey(obj2)) {
                                WeakReference<WebView> weakReference = aM.get(obj2);
                                if (k.a((Reference<?>) weakReference)) {
                                    String strA = BrandSafetyUtils.a(weakReference.get());
                                    Logger.d(S, "match ci - added webview address: " + strA + " to webview to ad id map with ad id: " + strS);
                                    aO.put(strA, strS);
                                }
                            }
                            return aP.get(strS);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            Logger.d(S, "error while matching info: " + th2.getMessage());
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(String str, String str2, WeakReference<WebView> weakReference) {
        String strA;
        String strA2 = k.a((Reference<?>) weakReference) ? BrandSafetyUtils.a(weakReference.get()) : null;
        boolean zI = i(str, strA2);
        BrandSafetyUtils.AdType adTypeA = weakReference.get().getWidth() > 0 ? com.safedk.android.analytics.brandsafety.b.a(g.f53132f, weakReference.get()) : null;
        if (adTypeA != null) {
            aS.put(strA2, adTypeA);
        }
        if (k.a((Reference<?>) weakReference)) {
            Logger.d(S, "get ad id from resource - is banner: " + zI + " width: " + weakReference.get().getWidth() + " height: " + weakReference.get().getHeight() + " ad type: " + adTypeA + " webview address: " + strA2);
            BannerFinder bannerFinderZ = SafeDK.getInstance() != null ? SafeDK.getInstance().z() : null;
            if (adTypeA == BrandSafetyUtils.AdType.BANNER) {
                c(str, weakReference);
            }
            if (adTypeA != BrandSafetyUtils.AdType.BANNER || (!zI && (bannerFinderZ == null || !bannerFinderZ.i(strA2)))) {
                strA = a(str, Arrays.asList(M, N), weakReference);
                if (strA != null) {
                    Logger.d(S, "get ad id from resource - found ad id by interstitial log message - ad id: " + strA);
                } else if (adTypeA == BrandSafetyUtils.AdType.INTERSTITIAL && (strA = s(str)) != null) {
                    Logger.d(S, "get ad id from resource - found ad id by interstitial URL resource - ad id: " + strA);
                }
            } else {
                strA = s(str);
            }
        } else {
            strA = null;
        }
        if (strA != null) {
            if (ay.contains(strA) && aP.get(strA) != null && adTypeA == BrandSafetyUtils.AdType.BANNER) {
                CreativeInfo creativeInfo = aP.get(strA);
                if (creativeInfo != null && creativeInfo.h() != null && creativeInfo.h().contains("mraid")) {
                    creativeInfo.t(null);
                }
                a(aP.get(strA), "Banner");
            }
            if (adTypeA != null) {
                aT.put(strA, adTypeA);
            }
            if (str2 != null) {
                aN.put(strA, str2);
            }
            aO.put(strA2, strA);
            Logger.d(S, "get ad id from resource - added ad id: " + strA + " to adIdToSource map");
        } else {
            Logger.d(S, "get ad id from resource - ad id is null");
        }
        if (str2 == null || !k.a((Reference<?>) weakReference)) {
            Logger.d(S, "get ad id from resource - webview is not alive or source is null, not adding to map, source=" + str2);
        } else {
            aM.put(str2, weakReference);
            Logger.d(S, "get ad id from resource - webview is alive, adding source: " + str2);
        }
        if (strA == null || !ay.remove(strA)) {
            Logger.d(S, "get ad id from resource - match not found for " + strA);
            return null;
        }
        Logger.d(S, "get ad id from resource - found ad id - " + strA);
        return strA;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(String str, WeakReference<WebView> weakReference) {
        Logger.d(S, "get ad id FOR resource started with resource: " + str);
        String strA = BrandSafetyUtils.a(weakReference.get());
        boolean zI = i(str, strA);
        BrandSafetyUtils.AdType adTypeA = weakReference.get().getWidth() > 0 ? com.safedk.android.analytics.brandsafety.b.a(g.f53132f, weakReference.get()) : null;
        Logger.d(S, "get ad id FOR resource - is banner: " + zI + " width: " + weakReference.get().getWidth() + " height: " + weakReference.get().getHeight() + " ad type: " + adTypeA + " webview address: " + strA);
        if (adTypeA == BrandSafetyUtils.AdType.BANNER) {
            aS.put(strA, BrandSafetyUtils.AdType.BANNER);
            if (aO.containsKey(strA)) {
                Logger.d(S, "get ad id for resource - returning ad id that is stored for webview: " + aO.get(strA));
                return aO.get(strA);
            }
            String strS = s(str);
            if (strS == null) {
                return null;
            }
            aO.put(strA, strS);
            return strS;
        }
        a aVarB = b(str, weakReference);
        Logger.d(S, "get ad id FOR resource pair is: " + aVarB + " and latest log message is: " + this.aV + " and latest webview address is: " + this.aX + " and resource: " + str);
        if (aVarB == null) {
            String strB = this.aV != null ? this.aV.b() : null;
            String strB2 = this.aW != null ? this.aW.b() : null;
            if (strB != null && strB2 != null && !strB.equals(strB2)) {
                Logger.d(S, "get ad id FOR resource mismatch between older message and newer messages! new latest log ad id is: " + strB + " and older latest log ad id is: " + strB2 + " resource is: " + str);
            }
            if (adTypeA != BrandSafetyUtils.AdType.INTERSTITIAL && this.aX != null && !this.aX.equals(strA)) {
                Logger.d(S, "get ad id for resource - not returning ad id since webview address is different then stored: " + this.aX + " vs given: " + strA);
                return null;
            }
            if (this.aV != null) {
                return this.aV.b();
            }
            return null;
        }
        if (aVarB.a() == null) {
            return null;
        }
        String strA2 = aVarB.a();
        List listAsList = Arrays.asList(I, H, J, M, O, K, L);
        List listAsList2 = Arrays.asList(P);
        List listAsList3 = Arrays.asList(I, M, O, K, L);
        List listAsList4 = Arrays.asList(H, J, P);
        if ((this.aY && listAsList.contains(strA2)) || listAsList3.contains(strA2)) {
            this.aV = aVarB;
            this.aX = strA;
            Logger.d(S, "get ad id for resource - setting latest log message to: " + aVarB + " and latest webview address to: " + strA);
            if (aVarB.a() == null || aVarB.a().equals(L)) {
                return null;
            }
            this.aW = aVarB;
            return null;
        }
        if ((!this.aY || !listAsList2.contains(strA2)) && !listAsList4.contains(strA2)) {
            return null;
        }
        this.aV = null;
        this.aW = null;
        this.aX = null;
        Logger.d(S, "get ad id for resource - setting latest log message to: null and latest webview address to: null");
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(WebView webView, Object obj) {
        String strA = BrandSafetyUtils.a(webView);
        aZ.put(BrandSafetyUtils.a(obj), new WeakReference<>(webView));
        Logger.d(S, "add webview to object on interface: " + strA + " object " + obj);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(Object obj, String str) {
        if (str != null && str.startsWith("{\"id\":") && str.contains("openUrl")) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.has("arguments")) {
                    Logger.d(S, "find webview from open url message - there is no arguments key for json: " + str);
                    return;
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("arguments");
                if (!jSONObject2.has("url")) {
                    Logger.d(S, "find webview from open url message - there is no url key for json: " + str);
                    return;
                }
                Logger.d(S, "find webview from open url message started with json: " + jSONObject);
                if (!jSONObject2.has("type") || !jSONObject2.getString("type").equals("openUrl")) {
                    Logger.d(S, "find webview from open url message - there is no type or it's not equal to openUrl: " + (jSONObject2.has("type") ? jSONObject2.getString("type") : null));
                    return;
                }
                String strK = k.k(jSONObject2.getString("url"));
                Logger.d(S, "find webview from open url message - redirect message is: " + str);
                Logger.d(S, "find webview from open url message - url: " + strK);
                if (obj == null || !aZ.containsKey(BrandSafetyUtils.a(obj))) {
                    Logger.d(S, "find webview from open url message - did not find object: " + obj + " in set: " + aZ.keySet());
                    return;
                }
                WeakReference<WebView> weakReference = aZ.get(BrandSafetyUtils.a(obj));
                if (!k.a((Reference<?>) weakReference)) {
                    Logger.d(S, "find webview from open url message - webview is not alive, exiting");
                    return;
                }
                WebView webView = weakReference.get();
                Logger.d(S, "find webview from open url message - webview address: " + BrandSafetyUtils.a(webView) + " object: " + obj);
                BrandSafetyUtils.onMraidOpen(g.f53132f, null, strK, webView, "mraid.open");
            } catch (Throwable th2) {
                Logger.d(S, "find webview from open url message - exception occurred: " + th2);
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(String str, String str2) {
        if (str == null || !str.equals(str2)) {
            return true;
        }
        Logger.d(S, "screenshot validity failed for hash: " + str);
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.DIRECT_CREATIVE_INFO;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0465  */
    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.util.List<com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo> b(java.lang.String r28, java.lang.String r29, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r30, com.safedk.android.analytics.brandsafety.creatives.discoveries.c.a r31) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1132
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.analytics.brandsafety.creatives.discoveries.f.b(java.lang.String, java.lang.String, java.util.Map, com.safedk.android.analytics.brandsafety.creatives.discoveries.c$a):java.util.List");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean b(String str, Bundle bundle) {
        return str.contains(f52268g) || str.contains(f52269h);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public Set<String> c() {
        return new HashSet();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String f() {
        return az;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<String> g() {
        List<String> listG = super.g();
        listG.add("external_url");
        return listG;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean h(String str) {
        if (str == null) {
            return false;
        }
        if (str.endsWith("/") || str.startsWith("/")) {
            for (String str2 : aN.keySet()) {
                if (str2.startsWith(str) || str2.endsWith(str)) {
                    Logger.d(S, "tryReverseMatching - extended ad id from: " + str + " to: " + str2);
                    str = str2;
                    break;
                }
            }
        }
        if (!aN.containsKey(str)) {
            Logger.d(S, "tryReverseMatching with ad id - ad id " + str + " is not in the adIdToSource keys: " + aN.keySet());
            return false;
        }
        if (!aP.containsKey(str)) {
            Logger.d(S, "tryReverseMatching with ad id - ad id " + str + " is not in the adIdToCI keys: " + aP.keySet());
            return false;
        }
        CreativeInfo creativeInfo = aP.get(str);
        if (creativeInfo != null && aT.get(str) == BrandSafetyUtils.AdType.BANNER) {
            creativeInfo.a(aT.get(str));
        }
        String str3 = aN.get(str);
        aQ.put(str3, creativeInfo);
        return a(str3, g.f53132f, aM, aQ, d.f52204o);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public void i() {
        super.i();
        com.safedk.android.utils.e.a(aP, "IronSourceDiscovery:adIdToCI", false);
        com.safedk.android.utils.e.a(aQ, "IronSourceDiscovery:sourceToCI", false);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void i(String str) {
        String strRemove = aN.remove(str);
        Logger.d(S, "clean resources started with ad id: " + str + ", and source is: " + strRemove);
        if (strRemove != null) {
            aM.remove(strRemove);
            aQ.remove(strRemove);
        }
        aT.remove(str);
        aP.remove(str);
        ay.remove(str);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<String> j(String str) {
        String str2 = aG.get(str);
        if (str2 == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str3 : aG.keySet()) {
            String str4 = aG.get(str3);
            if (str4 != null && str4.equals(str2)) {
                arrayList.add(str3);
            }
        }
        return arrayList;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean k(String str) {
        return ax.remove(str) || str.contains(f52272k) || str.contains(f52273l) || str.contains(av) || str.contains(aw) || str.contains(f52275x) || str.contains(f52276y) || str.contains(f52277z) || str.contains("&adViewId=") || str.contains(f52274w);
    }
}
