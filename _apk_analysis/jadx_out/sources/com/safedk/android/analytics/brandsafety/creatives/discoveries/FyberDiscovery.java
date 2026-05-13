package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.OnGlobalImpressionDataListener;
import com.ironsource.Z7;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.RedirectDetails;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.VastAdTagUri;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.FyberCreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.LimitedConcurrentHashMap;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class FyberDiscovery extends d {
    private static final String A = "X-IA-Session";
    private static final String B = "X-IA-Campaign-ID";
    private static final String C = "X-IA-sdkImpressionUrl";
    private static final String D = "spotid";
    private static final String E = "vast";
    private static final String F = "rewarded";
    private static final String G = "interstitial";
    private static final String H = "banner";
    private static final String I = "mrec";
    private static final String J = "v";
    private static final String K = "vast-vpaid";
    private static final String L = "cached-ad.fyber.com/ad";
    private static final String M = "cached-ad.prod.fyber.com/ad";
    private static final String N = ".inner-active.mobi/impression";
    private static final String O = "s";
    private static final String P = "crid";
    private static final String Q = "cid";
    private static final String R = "network";
    private static final String S = "sessionId";
    private static final String T = "com.applovin.mediation.adapters.InneractiveMediationAdapter";
    private static final int Z = 15;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f52082b = "wv.inner-active.mobi/simpleM2M/clientRequestEnhancedXmlAd";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f52083c = "mraid://open";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f52084d = "url";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f52085e = "mraid://expand";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f52087g = "com.fyber.inneractive.sdk";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f52088h = "com.fyber.inneractive.sdk.player.ui";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f52089i = "<tns:Response";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f52090j = "FyberDiscovery";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f52091k = "X-IA-Ad-Unit-Display-Type";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f52092l = "X-IA-Creative-ID";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f52093w = "X-IA-Ad-Unit-ID";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f52094x = "X-IA-AdNetwork";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f52095y = "X-IA-Adomain";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f52096z = "X-IA-sdkClickUrl";
    private ConcurrentHashMap<String, CreativeInfo> U;
    private ConcurrentHashMap<String, CreativeInfo> Y;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private OnGlobalImpressionDataListener f52097ad;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f52086f = {"mraid://close", "mraid://usecustomclose", "mraid://setOrientationProperties", "iaadfinishedloading://", "fymraidvideo://", "fmpendcard://"};
    private static final ConcurrentHashMap<String, String> V = new ConcurrentHashMap<>();
    private static HashMap<Integer, String> W = new HashMap<>();
    private static final String[] X = {"adTime", "countingMethod"};

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private static final LimitedConcurrentHashMap<String, WeakReference<WebView>> f52079aa = new LimitedConcurrentHashMap<>(15);

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final LimitedConcurrentHashMap<String, String> f52080ab = new LimitedConcurrentHashMap<>(15);

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private static AtomicBoolean f52081ac = new AtomicBoolean(false);

    public class FyberOnGlobalImpressionDataListener implements OnGlobalImpressionDataListener {
        public FyberOnGlobalImpressionDataListener() {
        }

        @Override // com.fyber.inneractive.sdk.external.OnGlobalImpressionDataListener
        public void onImpression(String str, String str2, ImpressionData impressionData) {
            Logger.d(FyberDiscovery.f52090j, "on impression started, string1: " + str + ", string2: " + str2 + ", impression data: " + impressionData.toString());
        }
    }

    public FyberDiscovery() {
        super(g.f53142p, f52090j, false);
        this.U = new ConcurrentHashMap<>();
        this.Y = new ConcurrentHashMap<>();
        this.f52097ad = new FyberOnGlobalImpressionDataListener();
        try {
            this.f52208p.b(AdNetworkConfiguration.SHOULD_DECODE_EXTRACTED_EXPRESSIONS_FROM_VAST, false);
            this.f52208p.b(AdNetworkConfiguration.SUPPORTS_GZIP_CONTENT, true);
            this.f52208p.b(AdNetworkConfiguration.ENFORCE_CLOSE_INPUT_STREAM, true);
            this.f52208p.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
            this.f52208p.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, true);
            this.f52208p.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_EOV, true);
            this.f52208p.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
            this.f52208p.b(AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, true);
            this.f52208p.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION, true);
            this.f52208p.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION_BY_MAX_EVENT, true);
            this.f52208p.b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_BANNER_MULTIPLE_WEBVIEWS, true);
            this.f52208p.b(AdNetworkConfiguration.SHOULD_EXTRACT_AD_ID_FROM_BANNER_WEB_VIEW, true);
            this.f52208p.b(AdNetworkConfiguration.USE_INPUT_STREAM_EVENT_AS_RESOURCE_LOADED_INDICATION, true);
        } catch (Throwable th2) {
            Logger.e(f52090j, "exception in ctor", th2);
        }
    }

    private String a(Map<String, List<String>> map, String str) {
        if (map == null || !map.keySet().toString().toLowerCase().contains(str.toLowerCase())) {
            Logger.d(f52090j, "header '" + str + "' not found");
        } else {
            List<String> list = map.get(str) != null ? map.get(str) : map.get(str.toLowerCase()) != null ? map.get(str.toLowerCase()) : null;
            if (list != null && list.size() > 0) {
                Logger.d(f52090j, "get value from headers key '" + str + "', value '" + list.get(0) + "'");
                return list.get(0);
            }
            Logger.d(f52090j, "header '" + str + "' not found");
        }
        return null;
    }

    private List<CreativeInfo> a(String str, c.a aVar) {
        String string;
        BrandSafetyUtils.AdType adType;
        Logger.d(f52090j, "generate info handle bidding start");
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            ArrayList<String> arrayListG = k.g(new String(Base64.decode(str, 0)));
            for (String str2 : arrayListG) {
                if (str2.contains(N)) {
                    String strC = k.c(str2, "s");
                    String str3 = aVar != null ? aVar.f52181d : null;
                    String strC2 = k.c(str2, "network");
                    Logger.d(f52090j, "sessionId=" + strC + " creativeId=" + str3 + " adNetwork=" + strC2);
                    String str4 = null;
                    BrandSafetyUtils.AdType adType2 = null;
                    String str5 = null;
                    String str6 = null;
                    if (aVar != null) {
                        if (aVar.f52179b == BrandSafetyEvent.AdFormatType.INTER) {
                            string = BrandSafetyEvent.AdFormatType.INTER.toString();
                            adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                        } else if (aVar.f52179b == BrandSafetyEvent.AdFormatType.REWARD) {
                            string = BrandSafetyEvent.AdFormatType.REWARD.toString();
                            adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                        } else if (aVar.f52179b == BrandSafetyEvent.AdFormatType.BANNER || aVar.f52179b == BrandSafetyEvent.AdFormatType.LEADER) {
                            string = BrandSafetyEvent.AdFormatType.BANNER.toString();
                            adType = BrandSafetyUtils.AdType.BANNER;
                        } else {
                            if (aVar.f52179b != BrandSafetyEvent.AdFormatType.MREC) {
                                Logger.d(f52090j, "generate info max params ad format is " + aVar.f52179b + ", skipping");
                                return null;
                            }
                            string = BrandSafetyEvent.AdFormatType.MREC.toString();
                            adType = BrandSafetyUtils.AdType.MREC;
                        }
                        str5 = aVar.f52178a;
                        str6 = aVar.f52180c;
                        adType2 = adType;
                        str4 = string;
                    }
                    Logger.d(f52090j, "ad format type=" + str4 + " ad type=" + adType2);
                    FyberCreativeInfo fyberCreativeInfo = new FyberCreativeInfo(strC, str3, null, null, null, str4, adType2, str6, this.f52211t, strC2, null, null, str5);
                    fyberCreativeInfo.b((List<String>) arrayListG);
                    arrayList.add(fyberCreativeInfo);
                    this.U.put(strC, fyberCreativeInfo);
                    Logger.d(f52090j, "generate info added CI to list by session id: " + strC + ", CI list: " + this.U);
                    this.Y.put(s(str2), fyberCreativeInfo);
                    Logger.d(f52090j, "generate info added CI to list by sdk impression url: " + str2 + ", CI list: " + this.Y);
                    return arrayList;
                }
            }
        }
        return null;
    }

    private List<CreativeInfo> a(String str, String str2, Map<String, List<String>> map) {
        String strA;
        String string;
        BrandSafetyUtils.AdType adType;
        ArrayList arrayList = new ArrayList();
        String strC = null;
        try {
            m();
            Logger.d(f52090j, "generate info handle prefetch start");
            strA = a(map, f52091k);
        } catch (Throwable th2) {
            Logger.d(f52090j, "Error in generate info : " + th2.getMessage(), th2);
        }
        if (strA == null) {
            Logger.d(f52090j, "generate info ad type is null, skipping");
            return null;
        }
        Logger.d(f52090j, "generate info ad type is " + strA);
        if (strA.equals("interstitial")) {
            string = BrandSafetyEvent.AdFormatType.INTER.toString();
            adType = BrandSafetyUtils.AdType.INTERSTITIAL;
        } else if (strA.equals("rewarded")) {
            string = BrandSafetyEvent.AdFormatType.REWARD.toString();
            adType = BrandSafetyUtils.AdType.INTERSTITIAL;
        } else if (strA.equals("banner")) {
            string = BrandSafetyEvent.AdFormatType.BANNER.toString();
            adType = BrandSafetyUtils.AdType.BANNER;
        } else {
            if (!strA.contains("mrec")) {
                Logger.d(f52090j, "generate info ad type is " + strA + ", skipping");
                return null;
            }
            string = BrandSafetyEvent.AdFormatType.MREC.toString();
            adType = BrandSafetyUtils.AdType.MREC;
        }
        if (str != null && str.contains(f52082b) && ((strC = k.c(str, D)) != null || this.f52211t != null)) {
            Logger.d(f52090j, "generate info spot id: " + strC + " ,sdk version: " + this.f52211t);
        }
        String strA2 = a(map, f52093w);
        String strA3 = a(map, f52092l);
        if (strA3 == null) {
            Logger.d(f52090j, "generate info creative id is null, using ad id for it's value");
        } else {
            strA2 = strA3;
        }
        String strA4 = a(map, B);
        String strA5 = a(map, f52096z);
        String strA6 = a(map, f52094x);
        String strA7 = a(map, f52095y);
        String strA8 = a(map, A);
        Logger.d(f52090j, "generate info session id: " + strA8);
        String strA9 = a(map, C);
        Logger.d(f52090j, "generate info sdk impression url: " + strA9);
        String strN = n(k.F(str2));
        if (str2 != null) {
            String strA10 = BrandSafetyUtils.a(str2.replace("\n", "").getBytes());
            Logger.d(f52090j, "generate info content hash: " + strA10);
            V.put(strA10, strA8);
        }
        FyberCreativeInfo fyberCreativeInfo = new FyberCreativeInfo(strA8, strA2, strA4, strN, null, string, adType, strC, this.f52211t, strA6, strA7, strA5, null);
        arrayList.add(fyberCreativeInfo);
        if (adType == BrandSafetyUtils.AdType.INTERSTITIAL) {
            this.U.put(strA8, fyberCreativeInfo);
            Logger.d(f52090j, "generate info added CI to list by session id: " + strA8 + ",  CI list: " + this.U);
        }
        String strS = s(strA9);
        this.Y.put(strS, fyberCreativeInfo);
        Logger.d(f52090j, "generate info added CI to list by sdk impression url: " + strS + ",  CI list: " + this.Y);
        a(str2, (CreativeInfo) fyberCreativeInfo, false);
        return arrayList;
    }

    private void a(String str, CreativeInfo creativeInfo, boolean z10) {
        Logger.d(f52090j, "generate info ad content start");
        if (k.v(str)) {
            Logger.d(f52090j, "generate info wrong content type (possibly scar-admob)");
            return;
        }
        if (z10) {
            String strA = k.a(com.safedk.android.utils.f.av(), str, 1);
            if (TextUtils.isEmpty(strA)) {
                Logger.d(f52090j, "generate info bidding - did NOT find buyer id, using the old version from prefetch: " + creativeInfo.P());
            } else {
                Logger.d(f52090j, "generate info bidding - found buyer id: " + strA);
                creativeInfo.k(strA);
            }
        }
        String strA2 = k.a(com.safedk.android.utils.f.au(), str, 1);
        if (strA2 != null) {
            if (k.a(com.safedk.android.utils.f.c(), strA2, 1) == null) {
                k.b(f52090j, "generate info processing mraid ad: " + strA2);
                b(k.a(com.safedk.android.utils.f.au(), str, 1), creativeInfo);
                creativeInfo.c("mraid");
            } else {
                String strA3 = com.safedk.android.analytics.brandsafety.creatives.d.a(strA2, true);
                k.b(f52090j, "generate info vast ad content: " + strA3);
                a(creativeInfo, strA3);
                creativeInfo.c("vast");
            }
        }
    }

    public static void a(boolean z10) {
        f52081ac.set(z10);
        Logger.d(f52090j, "on global impression data listener is set to " + z10);
        l();
    }

    private CreativeInfo b(String str, CreativeInfo creativeInfo) {
        Logger.d(f52090j, "update Html CI started: " + creativeInfo);
        ArrayList arrayList = new ArrayList();
        List<String> listB = k.b(com.safedk.android.utils.f.ax(), str, 1);
        if (listB != null && listB.size() > 0) {
            Iterator<String> it = listB.iterator();
            while (it.hasNext()) {
                String strK = k.k(it.next());
                Logger.d(f52090j, "update Html CI - resource url: " + strK);
                arrayList.add(strK);
            }
        }
        Iterator<String> it2 = k.g(str).iterator();
        while (it2.hasNext()) {
            String strK2 = k.k(it2.next());
            Logger.d(f52090j, "update Html CI - extract urls from source new url: " + strK2);
            arrayList.add(strK2);
        }
        creativeInfo.b((List<String>) arrayList);
        Logger.d(f52090j, "update Html CI updated: " + creativeInfo);
        return creativeInfo;
    }

    private void b(CreativeInfo creativeInfo, String str) {
        if (creativeInfo == null) {
            Logger.d(f52090j, "print CI collection - CI is null");
            return;
        }
        StringBuilder sbAppend = new StringBuilder().append("print CI collection ");
        if (str == null) {
            str = "";
        }
        k.b(f52090j, sbAppend.append(str).append("\n, CI : ").append(creativeInfo).toString());
    }

    public static HashMap<Integer, String> j() {
        return W;
    }

    private void k(View view) {
        Context contextL = SafeDK.getInstance().l();
        int identifier = contextL.getResources().getIdentifier("ia_tv_skip", "id", contextL.getPackageName());
        int identifier2 = contextL.getResources().getIdentifier("ia_iv_close_button", "id", contextL.getPackageName());
        Logger.d(f52090j, "handle on view click - ia_tv_skip resId=" + identifier + ", ia_iv_close_button resId=" + identifier2);
        if (view.getId() != identifier && view.getId() != identifier2) {
            Logger.d(f52090j, "handle on view click - clicked view is not the 'skip' or 'close' TextView.");
            return;
        }
        Logger.d(f52090j, "handle on view click - view type is =" + view.getClass().getName());
        if (!(view instanceof TextView)) {
            Logger.d(f52090j, "handle on view click - clicked view is not of type 'TextView'. exiting function");
        } else {
            Logger.d(f52090j, "handle on view click - clicked the 'skip' TextView, calling CI manager on video completed");
            CreativeInfoManager.onVideoCompleted(g.f53142p, null);
        }
    }

    private static void l() {
        if (W.isEmpty()) {
            W.put(Integer.valueOf(SafeDK.getInstance().l().getResources().getIdentifier("inneractive_webview_vast_endcard", "id", SafeDK.getInstance().l().getPackageName())), "inneractive_webview_vast_endcard");
            W.put(Integer.valueOf(SafeDK.getInstance().l().getResources().getIdentifier("inneractive_webview_vast_vpaid", "id", SafeDK.getInstance().l().getPackageName())), "inneractive_webview_vast_vpaid");
            W.put(Integer.valueOf(SafeDK.getInstance().l().getResources().getIdentifier("inneractive_vast_endcard_html", "id", SafeDK.getInstance().l().getPackageName())), "inneractive_vast_endcard_html");
            W.put(Integer.valueOf(SafeDK.getInstance().l().getResources().getIdentifier("inneractive_webview_mraid", "id", SafeDK.getInstance().l().getPackageName())), "inneractive_webview_mraid");
        }
    }

    private void m() {
        if (f52081ac.get()) {
            return;
        }
        if (!InneractiveAdManager.wasInitialized()) {
            Logger.d(f52090j, "initialize on global impression listener - Fyber Sdk is not initialized yet");
            return;
        }
        InneractiveAdManager.setImpressionDataListener(this.f52097ad);
        Logger.d(f52090j, "on global impression data listener has been set by SafeDK");
        f52081ac.set(true);
    }

    private void r(String str) {
        try {
            Logger.d(f52090j, "print CI collection (" + str + ")==========   by session ID (" + this.U.size() + " items) ==============");
            for (String str2 : this.U.keySet()) {
                Logger.d(f52090j, "print CI collection key=" + str2);
                b(this.U.get(str2), str);
            }
        } catch (Throwable th2) {
            Logger.e(f52090j, "Exception in print CI collection", th2);
            if (this.U == null) {
                Logger.d(f52090j, "print CI collection list was null, initializing");
                this.U = new ConcurrentHashMap<>();
            }
        }
    }

    private String s(String str) {
        for (String str2 : X) {
            str = k.e(str, str2);
        }
        return q(str);
    }

    public CreativeInfo a(CreativeInfo creativeInfo, String str) {
        r("parse vast prefetch start");
        a(creativeInfo, (String) null, str, false);
        creativeInfo.b(true);
        if (creativeInfo.g()) {
            ((FyberCreativeInfo) creativeInfo).c(K);
        }
        Logger.d(f52090j, "parse vast prefetch - CI updated : " + creativeInfo);
        r("parse vast prefetch return");
        return creativeInfo;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo a(Object obj) {
        CreativeInfo creativeInfoRemove;
        try {
            Logger.d(f52090j, "match info ad instance: " + obj);
            String impressionId = obj instanceof ImpressionData ? ((ImpressionData) obj).getImpressionId() : obj instanceof String ? (String) obj : null;
            if (impressionId == null) {
                return null;
            }
            creativeInfoRemove = this.U.remove(impressionId);
            try {
                if (creativeInfoRemove != null) {
                    k.b(f52090j, "match info ad instance - CI MATCH FOUND! by key: " + impressionId + ", CI : " + creativeInfoRemove);
                } else {
                    Logger.d(f52090j, "match info ad instance - cannot find key in: " + this.U.keySet());
                }
                return creativeInfoRemove;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            creativeInfoRemove = null;
        }
        Logger.d(f52090j, "Exception in match info ad instance: ", th);
        return creativeInfoRemove;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        return str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(String str, String str2, WeakReference<WebView> weakReference) {
        Logger.d(f52090j, "get ad ID from resource: source is: " + str2 + ", and value is: " + str + ", webViewRef is: " + (weakReference == null ? "null" : weakReference.get()));
        if (str2 == null) {
            return null;
        }
        String strS = s(str2);
        Logger.d(f52090j, "get ad ID from resource: cleanSource: " + strS + ", creativeInfosBySdkImpressionUrl keys are: " + this.Y.keySet());
        if (k.a((Reference<?>) weakReference)) {
            f52079aa.put(strS, weakReference);
            Logger.d(f52090j, "get ad ID from resource: webview is alive, adding clean source: " + strS);
        } else {
            Logger.d(f52090j, "get ad ID from resource: webview is not alive, not adding to map");
        }
        CreativeInfo creativeInfo = this.Y.get(strS);
        if (creativeInfo == null) {
            Logger.d(f52090j, "get ad ID from resource: could not find ci in map!");
            return null;
        }
        String strL = creativeInfo.L();
        Logger.d(f52090j, "get ad ID from resource: found ci in map with ad id: " + strL);
        f52080ab.put(strL, strS);
        Logger.d(f52090j, "get ad ID from resource: added ad id: " + strL + " to adIdToSource map");
        return strL;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<CreativeInfo> b(String str, String str2, Map<String, List<String>> map, c.a aVar) {
        k.b(f52090j, "generate info url = " + str + " , headers = " + (map != null ? map.toString() : "null") + ", buffer size = " + (str2 == null ? "0" : Integer.valueOf(str2.length())));
        if (TextUtils.isEmpty(str)) {
            Logger.d(f52090j, "generate info url is empty, exiting");
            return null;
        }
        if (str.contains(f52082b)) {
            return a(str, str2, map);
        }
        if (str.contains(L) || str.contains(M)) {
            String strC = k.c(str, "sessionId");
            if (TextUtils.isEmpty(strC)) {
                Logger.d(f52090j, "generate info session id is empty, exiting");
                return null;
            }
            if (str2 != null) {
                String strA = BrandSafetyUtils.a(str2.replace("\n", "").getBytes());
                Logger.d(f52090j, "generate info content hash: " + strA);
                V.put(strA, strC);
                CreativeInfo creativeInfo = this.U.get(strC);
                if (creativeInfo != null) {
                    a(str2, creativeInfo, true);
                } else {
                    Logger.d(f52090j, "generate info no CI for ad content with session ID: " + strC);
                }
            }
        } else if (aVar != null) {
            return a(str2, aVar);
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean b(String str, Bundle bundle) {
        boolean z10 = str.contains(f52082b) || str.contains(L) || str.contains(M) || this.f52209q.containsKey(new VastAdTagUri(str)) || this.f52209q.containsKey(new VastAdTagUri(q(str))) || this.f52209q.containsKey(new VastAdTagUri(str.replace("+", Z7.f30794r)));
        if (z10) {
            Logger.d(f52090j, "should follow input stream started, url=" + str + ", result=" + z10);
        }
        m(str);
        return z10;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public int c(String str) {
        return 0;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String c(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.startsWith(f52089i)) {
                String strA = BrandSafetyUtils.a(str.replace("\n", "").getBytes());
                String strRemove = V.remove(strA);
                Logger.d(f52090j, "extract ad info found, hash: " + strA + ", sessionId: " + strRemove);
                return strRemove;
            }
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String c(String str, String str2) {
        return a(str, str2, (WeakReference<WebView>) null);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public Set<String> c() {
        return new HashSet();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void d(View view) {
        k(view);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void e(View view) {
        k(view);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public RedirectDetails.RedirectType f(String str) {
        if (str != null) {
            if (str.contains(f52083c)) {
                return RedirectDetails.RedirectType.REDIRECT;
            }
            if (str.contains(f52085e)) {
                return RedirectDetails.RedirectType.EXPAND;
            }
            for (String str2 : f52086f) {
                if (str.startsWith(str2)) {
                    return null;
                }
            }
        }
        return RedirectDetails.RedirectType.REDIRECT;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String f() {
        return T;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean f(View view) {
        if (!(view instanceof ViewGroup) || !view.getClass().getName().startsWith(f52088h)) {
            return false;
        }
        Logger.d(f52090j, "is ad view: " + view.getClass().getName() + " is a Fyber ViewGroup ");
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String g(String str) {
        return str != null ? (str.contains(f52083c) || str.contains(f52085e)) ? k.c(str, "url") : str : str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean h(String str) {
        if (f52080ab.containsKey(str)) {
            return a(f52080ab.get(str), g.f53142p, f52079aa, this.Y, d.f52204o);
        }
        Logger.d(f52090j, "try reverse matching with ad id - ad id " + str + " is not in the adIdToSource keys: " + f52080ab.keySet());
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public void i() {
        super.i();
        com.safedk.android.utils.e.a(this.Y, "FyberDiscovery:creativeInfosBySdkImpressionUrl", false);
        com.safedk.android.utils.e.a(this.U, "FyberDiscovery:creativeInfosBySessionId", false);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void i(String str) {
        String strRemove = f52080ab.remove(str);
        Logger.d(f52090j, "clean resources started with ad id: " + str + ", and source is: " + strRemove);
        if (strRemove != null) {
            f52079aa.remove(strRemove);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String k() {
        return f52087g;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean k(String str) {
        return ((this.f52210r.contains(str) || this.f52210r.contains(q(str)) || this.f52210r.contains(str.replace("+", Z7.f30794r))) && !p(str)) || this.Y.containsKey(s(str));
    }

    public String l(String str) {
        return k.a(com.safedk.android.utils.f.aw(), str, 1);
    }
}
