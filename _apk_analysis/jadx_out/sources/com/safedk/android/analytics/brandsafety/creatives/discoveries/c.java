package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.sdk.AppLovinAdSize;
import com.ironsource.Z7;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.RedirectDetails;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.AppLovinCreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.LimitedConcurrentHashMap;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c extends d {
    private static final String A = "REWARD";
    private static final String B = "ad_type";
    private static final String C = "REGULAR";
    private static final String D = "VIDEOA";
    private static final String E = "zone_id";
    private static final String F = "event_id";
    private static final String G = "clcodes";
    private static final String H = "dsp_name";
    private static final String I = "is_js_tag_ad";
    private static final String J = "html";
    private static final String K = "html_template";
    private static final String L = "status";
    private static final String M = "ads";
    private static final String N = "click_url";
    private static final String O = "&listing=";
    private static final String P = "video";
    private static final String Q = "ad_id";
    private static final String R = "clcode";
    private static final String S = "bid_response";
    private static final String T = "creative_id";
    private static final String U = "adomain";
    private static final String V = "third_party_ad_placement_id";
    private static final String W = "xml";
    private static final String X = "stream_url";
    private static final String Y = "network_name";
    private static final String Z = "HOSTED_HTML_UNIVERSAL_VIDEO";
    private static final String aA = "ad_info";
    private static final String aB = "ad_unit_id";
    private static final String aC = "com.applovin.mediation.adapters.AppLovinMediationAdapter";
    private static final String aD = "name";
    private static final int aE = 200;
    private static String aG = null;
    private static final int aH = 15;
    private static final String aO = "&current_retry_attempt=";
    private static final String aP = "(function(){var sdkId=\"{{SDK_ID}}\";var address=\"{{ADDRESS}}\";var log=function(message){try{if(typeof window.SafeDKWebAppInterface.postMessage===\"function\"){window.SafeDKWebAppInterface.postMessage(message)}else{console.log(\"SafeDKWebApInterface log object missing\")}}catch(error){}};var addObservers=function(){try{var isContainerExpanded=false;var privacyElement=document.getElementById(\"al_bigAdInfo\");if(!privacyElement){privacyElement=document.getElementById(\"al_optout_container_expanded\");isContainerExpanded=true}if(!privacyElement&&document.getElementsByClassName(\"_background_3lacm_11\").length>0){privacyElement=document.getElementsByClassName(\"_background_3lacm_11\")[0]}if(privacyElement&&privacyElement.style){var displayState=privacyElement.style.display;var visibility=getComputedStyle(privacyElement).visibility;var isVisible=visibility==\"visible\";if(isContainerExpanded&&isVisible){isVisible=privacyElement.offsetWidth!=0&&privacyElement.offsetHeight!=0}if(displayState!=\"none\"&&displayState!=\"\"||isVisible){if(typeof window.SafeDKWebAppInterface.requestNoSampling===\"function\"){window.SafeDKWebAppInterface.requestNoSampling(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface safedkNoSampling object missing\")}}else{if(privacyElement.safedkPrivacyDialogObserver!=true){privacyElement.safedkPrivacyDialogObserver=true;try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){switch(mutation.type){case\"attributes\":var isVisible=getComputedStyle(mutation.target).visibility==\"visible\";if(mutation.target.id==\"al_optout_container_expanded\"){isVisible=mutation.target.offsetWidth!=0&&mutation.target.offsetHeight!=0}if(isVisible||getComputedStyle(mutation.target).display!=\"none\"&&displayState!=\"\"||getComputedStyle(mutation.target).display==\"block\"){if(typeof window.SafeDKWebAppInterface.requestNoSampling===\"function\"){window.SafeDKWebAppInterface.requestNoSampling(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface safedkNoSampling object missing\")}}break}})});var config={attributes:true,attributeOldValue:true,attributeFilter:[\"style\",\"class\"]};observer.observe(privacyElement,config)}catch(error){if(typeof window.SafeDKWebAppInterface.postMessage===\"function\"){window.SafeDKWebAppInterface.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface SafeDKWebAppInterface object missing\")}}}}}}catch(error){if(typeof window.SafeDKWebAppInterface.postMessage===\"function\"){window.SafeDKWebAppInterface.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface SafeDKWebAppInterface object missing\")}}};addObservers();try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){for(var i=0;i<mutation.addedNodes.length;i++){var node=mutation.addedNodes[i];if(node&&node.nodeName!=\"#text\"){addObservers()}}})});var config={childList:true,subtree:true};observer.observe(document,config)}catch(error){if(typeof window.SafeDKWebAppInterface.postMessage===\"function\"){window.SafeDKWebAppInterface.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface SafeDKWebAppInterface object missing\")}}})();\n";
    private static final String aQ = "{PLACEMENT}";
    private static final String aR = "(\\/)([A-Za-z0-9]{8}_)([^'\"\\?]*?['\"\\?])";
    private static final String aS = "(ad[-_A-Za-z_\\/]+[0-9]*[_\\/])(index\\.js)";
    private static final String aT = "(?:file|http[s]?):\\/{2,3}.*?([^\\/'\\\"\\?]*)(['\\\"\\?])";
    private static final String aU = "[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}";
    private static final String aV = "(<head>\\s*)(<script.*?</script>)";
    private static MessageDigest aY = null;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private static final String f52142aa = "HOSTED_HTML_UNIVERSAL_REWARD";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final String f52143ab = "HOSTED_HTML_UNIVERSAL";

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private static final String f52144ac = "server_parameters";

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private static final String f52145ad = "ortb_response";

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private static final String f52146ae = "version";

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private static final String f52147af = "value";

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private static final String f52148ag = "native";

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    private static final String f52149ah = "link";

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    private static final String f52150ai = "assets";

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    private static final String f52151aj = "title";

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    private static final String f52152ak = "text";

    /* JADX INFO: renamed from: al, reason: collision with root package name */
    private static final String f52153al = "img";

    /* JADX INFO: renamed from: am, reason: collision with root package name */
    private static final String f52154am = "id";

    /* JADX INFO: renamed from: an, reason: collision with root package name */
    private static final String f52155an = "type";

    /* JADX INFO: renamed from: ao, reason: collision with root package name */
    private static final String f52156ao = "url";

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    private static final String f52157ap = "w";

    /* JADX INFO: renamed from: aq, reason: collision with root package name */
    private static final String f52158aq = "h";

    /* JADX INFO: renamed from: ar, reason: collision with root package name */
    private static final String f52159ar = "video";

    /* JADX INFO: renamed from: as, reason: collision with root package name */
    private static final String f52160as = "vasttag";

    /* JADX INFO: renamed from: at, reason: collision with root package name */
    private static final String f52161at = "data";
    private static final String au = "fallback";
    private static final String av = "clicktrackers";
    private static final String aw = "imptrackers";
    private static final String ax = "eventtrackers";
    private static final String ay = "click_tracking_urls";
    private static final String az = "manual";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f52162b = "video";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f52163c = "playable";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f52164d = "template";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f52165e = "prod-a4.applovin.com/redirect";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f52166f = "n";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f52167g = "applovin://com.applovin.sdk/adservice/expand_ad";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f52169i = "com.applovin.mediation.adapters.AppLovinMediationAdapter";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f52170j = "APPLOVIN_EXCHANGE";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f52171k = "APPLOVIN_NETWORK";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f52175y = "ad_size";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f52176z = "ad_format";
    private final ConcurrentHashMap<String, CreativeInfo> aK;
    private final ConcurrentHashMap<String, CreativeInfo> aL;
    private final Map<String, a> aM;
    private final LimitedConcurrentHashMap<String, String> aN;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static String f52173w = "AppLovinDiscovery";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static String f52174x = "json_v3!";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f52168h = {"applovin://com.applovin.sdk/webview_event"};
    private static final LimitedConcurrentHashMap<String, WeakReference<WebView>> aI = new LimitedConcurrentHashMap<>(15);
    private static final LimitedConcurrentHashMap<String, String> aJ = new LimitedConcurrentHashMap<>(15);
    private static final List<String> aW = Arrays.asList("a.applovin.com/4.0/ad", "a.applvn.com/4.0/ad", "a4.applovin.com/4.0/ad", "a4.applvn.com/4.0/ad");
    private static boolean aX = false;
    private static final String aF = "BANNER_NATIVE";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static List<String> f52172l = Arrays.asList("BANNER_GRAPHIC_BLANK_UNIFIED", "BANNER_STOREKIT", aF, "BANNER_STOREASSETS");

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f52178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public BrandSafetyEvent.AdFormatType f52179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f52180c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f52181d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f52182e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f52183f;

        public a(String str) {
            this.f52178a = str;
        }

        public a(c cVar, String str, BrandSafetyEvent.AdFormatType adFormatType) {
            this(str, adFormatType, null, null, null, null);
        }

        public a(c cVar, String str, BrandSafetyEvent.AdFormatType adFormatType, String str2) {
            this(str, adFormatType, str2, null, null, null);
        }

        public a(String str, BrandSafetyEvent.AdFormatType adFormatType, String str2, String str3, String str4, String str5) {
            this.f52178a = str;
            this.f52179b = adFormatType;
            this.f52180c = str2;
            this.f52181d = str3;
            this.f52182e = str4;
            this.f52183f = str5;
        }

        public String toString() {
            return "{eventId=" + this.f52178a + ", adFormat=" + this.f52179b + ", placementId=" + this.f52180c + ", creativeId=" + this.f52181d + ", adDomain=" + this.f52182e + '}';
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final int f52185a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f52186b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f52187c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f52188d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f52189e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f52190f = 6;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f52191g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f52192h = 8;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f52193i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f52194j = 3;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f52195k = 1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f52196l = 2;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f52197m = 12;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int f52198n = -1;

        private b() {
        }
    }

    static {
        try {
            aY = MessageDigest.getInstance("SHA-256");
        } catch (Throwable th2) {
        }
    }

    public c() {
        super(g.f53127a, f52173w, false);
        this.aK = new ConcurrentHashMap<>();
        this.aL = new ConcurrentHashMap<>();
        this.aM = new HashMap();
        this.aN = new LimitedConcurrentHashMap<>(15);
        aG = k.a();
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_NATIVE_IMPRESSION_TRACKING, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_FULLSCREEN_ADS, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_MRECS, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_BANNERS, true);
        this.f52208p.b(AdNetworkConfiguration.JS_PRIVACY_BUTTON_CLICK_DETECTION_SCRIPT, aP);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_EOV, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION, true);
        this.f52208p.b(AdNetworkConfiguration.REPLACE_PREFETCH_CREATIVE_ID_WITH_MAX_CREATIVE_ID, true);
        this.f52208p.b(AdNetworkConfiguration.REPLACE_PREFETCH_CREATIVE_ID_WITH_MAX_CREATIVE_ID_MAX_NETWORK_NAMES, "APPLOVIN_EXCHANGE");
        this.f52208p.b(AdNetworkConfiguration.DONT_USE_PLACEMENT_ID_IN_BANNER_AD_INFO_KEY, "APPLOVIN_NETWORK");
        this.f52208p.a(AdNetworkConfiguration.FULL_SCREEN_CI_MAX_AGE, 4800000L);
        this.f52208p.a(AdNetworkConfiguration.BANNER_CI_MAX_AGE, 4800000L);
        AsyncTask.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.discoveries.c.1
            @Override // java.lang.Runnable
            public void run() {
                com.safedk.android.analytics.brandsafety.creatives.f.b("<vast><ad id=\"stam\"></ad></vast>", false, "");
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0185  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.os.Bundle a(com.applovin.mediation.MaxAd r13) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.analytics.brandsafety.creatives.discoveries.c.a(com.applovin.mediation.MaxAd):android.os.Bundle");
    }

    private CreativeInfo a(String str, BrandSafetyUtils.AdType adType, String str2, String str3, String str4, String str5, JSONObject jSONObject) throws JSONException {
        String strOptString;
        String strOptString2 = jSONObject.optString("ad_id");
        JSONObject jSONObject2 = jSONObject.getJSONObject(f52145ad);
        String strOptString3 = jSONObject2.optString("version");
        JSONObject jSONObject3 = jSONObject2.getJSONObject("value");
        Logger.d(f52173w, "parse native ad, rendering native ad for oRTB version: " + strOptString3);
        JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject("native");
        if (jSONObjectOptJSONObject == null) {
            Logger.d(f52173w, "parse native ad, no native object, continue...");
        } else {
            jSONObject3 = jSONObjectOptJSONObject;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject3.optJSONObject(f52149ah);
        JSONArray jSONArray = jSONObject3.getJSONArray(f52150ai);
        ArrayList arrayList = new ArrayList();
        String str6 = null;
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (i11 >= jSONArray.length()) {
                break;
            }
            JSONObject jSONObject4 = jSONArray.getJSONObject(i11);
            if (jSONObject4.has("title")) {
                JSONObject jSONObjectOptJSONObject3 = jSONObject4.optJSONObject("title");
                if (jSONObjectOptJSONObject3 != null) {
                    String strOptString4 = jSONObjectOptJSONObject3.optString("text");
                    if (!strOptString4.isEmpty()) {
                        arrayList.add(CreativeInfo.aM + strOptString4);
                        Logger.d(f52173w, "parse native ad, processed title: " + strOptString4);
                    }
                }
            } else if (jSONObject4.has(f52149ah)) {
                jSONObjectOptJSONObject2 = jSONObject4.optJSONObject(f52149ah);
            } else if (jSONObject4.has("img")) {
                int iOptInt = jSONObject4.optInt("id", -1);
                JSONObject jSONObjectOptJSONObject4 = jSONObject4.optJSONObject("img");
                if (jSONObjectOptJSONObject4 != null) {
                    int iOptInt2 = jSONObjectOptJSONObject4.optInt("type", -1);
                    String strOptString5 = jSONObjectOptJSONObject4.optString("url");
                    if (!strOptString5.isEmpty()) {
                        if (3 == iOptInt || iOptInt2 == 1) {
                            arrayList.add(CreativeInfo.aO + strOptString5);
                            Logger.d(f52173w, "parse native ad, processed icon URL: " + strOptString5);
                        } else if (2 == iOptInt || iOptInt2 == 3) {
                            arrayList.add(CreativeInfo.aN + strOptString5);
                            Logger.d(f52173w, "parse native ad, processed main image URL: " + strOptString5);
                        } else {
                            Logger.d(f52173w, "parse native ad, unrecognized image: " + jSONObject4);
                            int iOptInt3 = jSONObjectOptJSONObject4.optInt(f52157ap, -1);
                            int iOptInt4 = jSONObjectOptJSONObject4.optInt("h", -1);
                            if (iOptInt3 <= 0 || iOptInt4 <= 0) {
                                Logger.d(f52173w, "parse native ad, skipping...");
                            } else if (iOptInt3 / iOptInt4 > 1.0d) {
                                Logger.d(f52173w, "parse native ad, inferring main image from " + iOptInt3 + VastAttributes.HORIZONTAL_POSITION + iOptInt4 + ", processed main image URL: " + strOptString5);
                                arrayList.add(CreativeInfo.aN + strOptString5);
                            } else {
                                Logger.d(f52173w, "parse native ad, inferring icon image from " + iOptInt3 + VastAttributes.HORIZONTAL_POSITION + iOptInt4 + ", processed icon URL: " + strOptString5);
                                arrayList.add(CreativeInfo.aO + strOptString5);
                            }
                        }
                    }
                }
            } else if (jSONObject4.has("video")) {
                JSONObject jSONObjectOptJSONObject5 = jSONObject4.optJSONObject("video");
                if (jSONObjectOptJSONObject5 != null) {
                    strOptString = jSONObjectOptJSONObject5.optString(f52160as);
                    Logger.d(f52173w, "parse native ad, processed VAST video: " + strOptString);
                } else {
                    strOptString = str6;
                }
                str6 = strOptString;
            } else if (jSONObject4.has("data")) {
                int iOptInt5 = jSONObject4.optInt("id", -1);
                JSONObject jSONObjectOptJSONObject6 = jSONObject4.optJSONObject("data");
                if (jSONObjectOptJSONObject6 != null) {
                    int iOptInt6 = jSONObjectOptJSONObject6.optInt("type", -1);
                    String strOptString6 = jSONObjectOptJSONObject6.optString("value");
                    if (!strOptString6.isEmpty()) {
                        if (iOptInt5 == 8 || iOptInt6 == 1) {
                            arrayList.add(CreativeInfo.aS + strOptString6);
                            Logger.d(f52173w, "parse native ad, processed advertiser: " + strOptString6);
                        } else if (iOptInt5 == 4 || iOptInt6 == 2) {
                            arrayList.add(CreativeInfo.aP + strOptString6);
                            Logger.d(f52173w, "parse native ad, processed body: " + strOptString6);
                        } else if (iOptInt5 == 5 || iOptInt6 == 12) {
                            arrayList.add(CreativeInfo.aQ + strOptString6);
                            Logger.d(f52173w, "parse native ad, processed cta: " + strOptString6);
                        } else if (iOptInt5 == 6 || iOptInt6 == -1) {
                            arrayList.add(CreativeInfo.aR + strOptString6);
                            Logger.d(f52173w, "parse native ad, processed star rating: " + strOptString6);
                        } else {
                            Logger.d(f52173w, "parse native ad, skipping unsupported data: " + jSONObject4);
                        }
                    }
                }
            } else {
                Logger.d(f52173w, "parse native ad, unsupported asset object: " + jSONObject4);
            }
            i10 = i11 + 1;
        }
        String strOptString7 = null;
        ArrayList arrayList2 = new ArrayList();
        if (jSONObjectOptJSONObject2 != null) {
            strOptString7 = jSONObjectOptJSONObject2.optString("url");
            Logger.d(f52173w, "parse native ad, processed click destination URL: " + strOptString7);
            Logger.d(f52173w, "parse native ad, processed click destination backup URL: " + jSONObjectOptJSONObject2.optString(au));
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray(av);
            if (jSONArrayOptJSONArray != null) {
                for (int i12 = 0; i12 < jSONArrayOptJSONArray.length(); i12++) {
                    arrayList2.add(jSONArrayOptJSONArray.optString(i12));
                }
                Logger.d(f52173w, "parse native ad, processed click trackers: " + arrayList2);
            }
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject3.optJSONArray(aw);
        if (jSONArrayOptJSONArray2 != null) {
            for (int i13 = 0; i13 < jSONArrayOptJSONArray2.length(); i13++) {
                arrayList2.add(jSONArrayOptJSONArray2.optString(i13));
            }
            Logger.d(f52173w, "parse native ad, processed imp trackers: " + arrayList2);
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject3.optJSONArray(ax);
        if (jSONArrayOptJSONArray3 != null) {
            for (int i14 = 0; i14 < jSONArrayOptJSONArray3.length(); i14++) {
                if (jSONArrayOptJSONArray3.get(i14) instanceof JSONObject) {
                    JSONObject jSONObject5 = jSONArrayOptJSONArray3.getJSONObject(i14);
                    if (jSONObject5.has("url")) {
                        arrayList2.add(jSONObject5.getString("url"));
                    }
                } else {
                    arrayList2.add(jSONArrayOptJSONArray3.getString(i14));
                }
            }
            Logger.d(f52173w, "parse native ad, processed event trackers: " + arrayList2);
        }
        if (jSONObject.has(ay)) {
            arrayList2.add(jSONObject.getString(ay));
            Logger.d(f52173w, "parse native ad, processed click tracking URLs: " + arrayList2);
        }
        AppLovinCreativeInfo appLovinCreativeInfo = new AppLovinCreativeInfo(adType, str, strOptString2, strOptString7, null, str2, str3, aG, null, str4, str5, null, false, false, false);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            appLovinCreativeInfo.B((String) it.next());
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            appLovinCreativeInfo.x((String) it2.next());
        }
        if (!TextUtils.isEmpty(str6)) {
            a((CreativeInfo) appLovinCreativeInfo, (String) null, str6, false);
            appLovinCreativeInfo.c("vast");
        }
        Logger.d(f52173w, "parse native ad, new CI detected, ad ID: " + appLovinCreativeInfo.L() + ", event ID: " + appLovinCreativeInfo.m() + ", CI: " + appLovinCreativeInfo);
        this.aL.put(str, appLovinCreativeInfo);
        return appLovinCreativeInfo;
    }

    private CreativeInfo a(String str, BrandSafetyUtils.AdType adType, String str2, String str3, String str4, String str5, JSONObject jSONObject, String str6) throws JSONException {
        String str7;
        String str8;
        String strOptString = jSONObject.optString("html");
        if (adType == BrandSafetyUtils.AdType.BANNER || adType == BrandSafetyUtils.AdType.MREC) {
            String strL = l(strOptString);
            String strA = a(com.safedk.android.utils.f.ar(), strOptString);
            k.b(f52173w, "parse ad, prefetch bannerType = " + strA + ", html hash = " + strL + ", content = " + strOptString);
            str7 = strA;
            str8 = strL;
        } else {
            str7 = null;
            str8 = null;
        }
        String strOptString2 = TextUtils.isEmpty(strOptString) ? jSONObject.optString(K) : strOptString;
        String strOptString3 = jSONObject.optString("click_url", null);
        if (strOptString3 != null && strOptString3.startsWith(O)) {
            Logger.d(f52173w, "parse ad, clickUrl extraction from json is invalid, will be set to null. clickUrl= " + strOptString3);
            strOptString3 = null;
        }
        if (strOptString3 == null && !TextUtils.isEmpty(strOptString2)) {
            strOptString3 = n(strOptString2);
            if (strOptString3 == null) {
                strOptString3 = a(com.safedk.android.utils.f.at(), strOptString2);
            }
            if (strOptString3 == null) {
                strOptString3 = a(com.safedk.android.utils.f.as(), strOptString2);
            }
            if (strOptString3 == null) {
                strOptString3 = a(com.safedk.android.utils.f.al(), strOptString2);
            }
            if (strOptString3 == null) {
                strOptString3 = a(com.safedk.android.utils.f.ak(), strOptString2);
            }
            if (strOptString3 == null && str7 != null && f52172l.contains(str7.trim().split(Z7.f30794r)[0])) {
                strOptString3 = a(com.safedk.android.utils.f.am(), strOptString2);
                Logger.d(f52173w, "parse ad, clickUrl ad, " + str7 + " = " + strOptString3);
            }
            if (strOptString3 != null) {
                Logger.d(f52173w, "parse ad, clickUrl extraction for DSP : " + strOptString3);
            }
        }
        if (strOptString3 == null && !TextUtils.isEmpty(strOptString2)) {
            Logger.d(f52173w, "parse ad, click_url attempting extracting Mraid click url on html " + strOptString2);
            Matcher matcher = com.safedk.android.utils.f.aK().matcher(strOptString2);
            if (matcher.find() && matcher.group(2) != null) {
                try {
                    strOptString3 = matcher.group(2).replace("\\/", "/");
                    Logger.d(f52173w, "parse ad, click_url extracting via Mraid click url regex : " + strOptString3);
                    if (strOptString3 != null) {
                        Logger.d(f52173w, "parse ad, clickUrl extracting via Mraid click url regex returned : " + strOptString3);
                    }
                } catch (Throwable th2) {
                    Logger.d(f52173w, "Exception extracting Mraid click url : " + th2.getMessage(), th2);
                }
            }
        }
        String strO = o(strOptString2);
        String strOptString4 = jSONObject.optString(X);
        String strOptString5 = jSONObject.optString("video");
        if (strOptString5.isEmpty()) {
            strOptString5 = a(com.safedk.android.utils.f.an(), strOptString2);
        }
        boolean zHas = false;
        String strA2 = a(com.safedk.android.utils.f.ao(), strOptString2);
        if (strA2 != null && k.H(strA2)) {
            JSONObject jSONObject2 = new JSONObject(strA2);
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("video");
            if (jSONObjectOptJSONObject != null && TextUtils.isEmpty(strOptString5)) {
                strOptString5 = jSONObjectOptJSONObject.optString("url");
            }
            zHas = jSONObject2.has("playable");
            Logger.d(f52173w, "parse ad, new template, video: " + strOptString5 + ", is playable? false");
        }
        String str9 = strOptString5;
        boolean z10 = (TextUtils.isEmpty(str9) && TextUtils.isEmpty(strOptString4)) ? false : true;
        String strA3 = a(com.safedk.android.utils.f.ar(), strOptString2);
        if (strA3 != null) {
            strA3 = strA3.trim() + "/";
        } else if (zHas) {
            strA3 = "playable/";
        }
        String strOptString6 = jSONObject.optString("ad_id");
        boolean zOptBoolean = false;
        if (jSONObject.has("network_name") && jSONObject.getString("network_name").equals(CreativeInfoManager.f51976j) && jSONObject.has(I)) {
            zOptBoolean = jSONObject.optBoolean(I);
            Logger.d(f52173w, "parse ad, field is_js_tag_ad value is " + zOptBoolean);
        }
        AppLovinCreativeInfo appLovinCreativeInfo = new AppLovinCreativeInfo(adType, str, strOptString6, strOptString3, str9, str2, str3, aG, strA3, str5, str4, strO, z10, false, zOptBoolean);
        if (this.aN.containsKey(str6)) {
            String strRemove = this.aN.remove(str6);
            Logger.d(f52173w, "parse ad - found ad unit id: " + strRemove + ", urlToAdUnitId contains the key url: " + str6);
            appLovinCreativeInfo.e(strRemove);
        } else {
            k.b(f52173w, "parse ad - urlToAdUnitId contains the key url: " + str6 + " the keys are: " + this.aN.keySet());
        }
        Logger.d(f52173w, "parse ad, adding CI id: " + str + ", CI: " + appLovinCreativeInfo);
        if (adType.equals(BrandSafetyUtils.AdType.BANNER) || adType.equals(BrandSafetyUtils.AdType.MREC)) {
            this.aK.put(str3 + "_" + str4 + "_" + g.f53127a, appLovinCreativeInfo);
            if (str8 != null) {
                aJ.put(str, str8);
                this.aK.put(str8, appLovinCreativeInfo);
            }
        }
        String strOptString7 = jSONObject.optString(W);
        if (!TextUtils.isEmpty(strOptString7)) {
            a((CreativeInfo) appLovinCreativeInfo, str6, strOptString7, true);
        }
        appLovinCreativeInfo.b((List<String>) k.g(strOptString2));
        if (!TextUtils.isEmpty(strOptString2)) {
            appLovinCreativeInfo.a(str.hashCode());
        }
        ArrayList<String> arrayListR = null;
        if (k.a(str6, aW) || (str7 != null && str7.contains(aF))) {
            arrayListR = r(strOptString2);
        }
        if (arrayListR != null && arrayListR.size() > 0) {
            for (String str10 : arrayListR) {
                Logger.d(f52173w, "parse ad, json object text " + str10);
                appLovinCreativeInfo.A(str10);
            }
        }
        return appLovinCreativeInfo;
    }

    private String a(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has("zone_id")) {
            return "";
        }
        String string = jSONObject.getString("zone_id");
        Logger.d(f52173w, "generate info - found placement id in zone id - " + string);
        return string;
    }

    private void a(String str, Map<String, List<String>> map, JSONArray jSONArray, a aVar) throws JSONException {
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (i11 >= jSONArray.length()) {
                return;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i11);
            String strOptString = jSONObject.optString("name");
            String strOptString2 = jSONObject.optString(S, null);
            String strOptString3 = jSONObject.optString("creative_id", null);
            String strOptString4 = jSONObject.optString("third_party_ad_placement_id");
            String strOptString5 = jSONObject.optString(U, null);
            String strOptString6 = az;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(f52144ac);
            if (jSONObjectOptJSONObject != null) {
                strOptString6 = jSONObjectOptJSONObject.optString("template");
                if (TextUtils.isEmpty(strOptString6)) {
                    strOptString6 = az;
                }
            }
            Logger.d(f52173w, "parse Max prefetch response started url=" + str + " ,max params = " + aVar.toString());
            a aVar2 = new a(aVar.f52178a, aVar.f52179b, strOptString4, strOptString3, strOptString5, strOptString6);
            if (CreativeInfoManager.c().contains(strOptString)) {
                String strS = s(strOptString2);
                if (strS != null) {
                    Logger.d(f52173w, "parse Max prefetch response " + strOptString + Z7.f30794r + aVar2.f52179b + " base64 bid response is " + strOptString2);
                    CreativeInfoManager.a(strOptString, str, strS, map, aVar2);
                } else {
                    Logger.d(f52173w, "parse Max prefetch response " + strOptString + " bidder " + aVar2.f52179b + ", bid response is clcode " + strOptString2);
                    this.aM.put(strOptString2, aVar2);
                }
            } else if (strOptString2 != null) {
                Logger.d(f52173w, "parse Max prefetch response " + strOptString + Z7.f30794r + aVar2.f52179b + " bid response is " + strOptString2);
                CreativeInfoManager.a(strOptString, str, strOptString2, map, aVar2);
            } else {
                Logger.d(f52173w, "parse Max prefetch response " + strOptString + Z7.f30794r + aVar2.f52179b + " bid response empty.");
            }
            i10 = i11 + 1;
        }
    }

    public static void j() {
        aX = true;
    }

    private String l(String str) {
        return k.a(aY.digest(k.a(str, com.safedk.android.utils.f.aj(), 2, "").replace(aQ, "").replaceAll(aR, "$1$3").replaceAll(aS, "$2").replaceAll(aT, "$1$2").replaceAll(aU, "").replaceAll(aV, "$1").getBytes(Charset.defaultCharset())));
    }

    private ArrayList<String> r(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        String strA = a(com.safedk.android.utils.f.aq(), str);
        String strA2 = a(com.safedk.android.utils.f.ap(), str);
        Logger.d(f52173w, "found ad text: title=" + strA + ", description=" + strA2);
        arrayList.add(strA);
        arrayList.add(strA2);
        return arrayList;
    }

    private static String s(String str) {
        if (str != null) {
            String[] strArrSplit = str.split("!");
            if (strArrSplit.length == 2) {
                return new String(Base64.decode(strArrSplit[1], 0));
            }
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo a(Object obj) {
        CreativeInfo value;
        CreativeInfo creativeInfo;
        if (obj instanceof String) {
            if (!((String) obj).startsWith(f52174x)) {
                String str = (String) obj;
                if (this.aK.containsKey(str)) {
                    Logger.d(f52173w, "match info started, complex key = " + str + " , banner CIs key set = " + this.aK.keySet());
                    CreativeInfo creativeInfo2 = this.aK.get(str);
                    Logger.d(f52173w, "match info found, banner CI: " + creativeInfo2);
                    return creativeInfo2;
                }
                Iterator<Map.Entry<String, CreativeInfo>> it = this.aL.entrySet().iterator();
                CreativeInfo creativeInfo3 = null;
                while (it.hasNext()) {
                    Map.Entry<String, CreativeInfo> next = it.next();
                    if (str.equals(next.getValue().m())) {
                        value = next.getValue();
                        Logger.d(f52173w, "match info found, native CI: " + value);
                        it.remove();
                    } else {
                        value = creativeInfo3;
                    }
                    creativeInfo3 = value;
                }
                return creativeInfo3;
            }
            String strS = s((String) obj);
            if (strS != null) {
                try {
                    String strOptString = new JSONObject(strS).optString(R);
                    if (!TextUtils.isEmpty(strOptString)) {
                        creativeInfo = this.aL.get(strOptString);
                        try {
                            Logger.d(f52173w, "match info found, native CI: " + creativeInfo);
                            return creativeInfo;
                        } catch (JSONException e10) {
                            Logger.d(f52173w, "match info: failed to parse bid response");
                            return creativeInfo;
                        }
                    }
                } catch (JSONException e11) {
                    creativeInfo = null;
                }
            } else {
                Logger.d(f52173w, "match info: failed to decode bid response");
            }
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        return str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(String str, String str2, WeakReference<WebView> weakReference) {
        k.b(f52173w, "get ad ID from resource started, url: " + str2 + ", value: " + str);
        if (str2 != null) {
            try {
                String[] strArrSplit = str2.split("clcode=");
                if (strArrSplit.length > 1) {
                    String[] strArrSplit2 = strArrSplit[1].split("\"|\\&|&");
                    if (strArrSplit2.length > 0) {
                        String str3 = strArrSplit2[0];
                        Logger.d(f52173w, "get ad ID from resource: CI MATCH, adId = " + str3);
                        return str3;
                    }
                } else {
                    Logger.d(f52173w, "get ad ID from resource: cant split string by clcode, url: " + str2);
                }
            } catch (Exception e10) {
                Logger.d(f52173w, "get ad ID from resource: cant extract ad id from: " + str2, e10);
            }
        }
        if (k.s(str)) {
            String strL = l(str);
            Logger.d(f52173w, "get ad ID from resource: the banner hash is: " + strL);
            if (aI.containsKey(strL)) {
                Logger.d(f52173w, "get ad ID from resource: bannerHtmlHash already in sourceToWebviewRef map - bannerHtmlHash=" + strL);
            }
            if (k.a((Reference<?>) weakReference)) {
                aI.put(strL, weakReference);
            } else {
                Logger.d(f52173w, "get ad id from resource - webview is null, not storing bannerHtmlHash in sourceToWebviewRef");
            }
            if (this.aK.containsKey(strL)) {
                CreativeInfo creativeInfo = this.aK.get(strL);
                if (creativeInfo != null) {
                    String strL2 = creativeInfo.L();
                    Logger.d(f52173w, "get ad ID from resource: CI MATCH! : id = " + strL2 + ", ci : " + creativeInfo);
                    if (aJ.containsKey(strL2)) {
                        Logger.d(f52173w, "get ad ID from resource: ad id already in adIdToSource map - adId=" + strL2);
                    }
                    aJ.put(strL2, strL);
                    return strL2;
                }
                Logger.d(f52173w, "get ad ID from resource: failed to mach by html hash. will try to extract ad id...");
                String strA = a(com.safedk.android.utils.f.aQ(), str);
                if (strA != null) {
                    return strA;
                }
                Logger.d(f52173w, "get ad ID from resource: NO MATCH, can't extract clcode from html");
            } else {
                Logger.d(f52173w, "get ad ID from resource: NO MATCH, putting the banner hash into the sourceToWebviewRef");
            }
        } else {
            Logger.d(f52173w, "get ad ID from resource: NO MATCH, putting the value into sourceToWebviewRef");
            if (k.a((Reference<?>) weakReference)) {
                aI.put(str, weakReference);
            } else {
                Logger.d(f52173w, "get ad id from resource - webview is null, not storing value in sourceToWebviewRef");
            }
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<CreativeInfo> a(String str, String str2, Map<String, List<String>> map, a aVar) {
        int iIndexOf = str.indexOf(aO);
        if (iIndexOf > -1) {
            str = str.substring(0, iIndexOf);
        }
        return super.a(str, str2, map, aVar);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(View view) {
        return i(view);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public List<CreativeInfo> b(String str, String str2, Map<String, List<String>> map, a aVar) throws JSONException {
        String str3;
        a aVar2;
        Logger.d(f52173w, "generate info, url: " + str);
        ArrayList arrayList = new ArrayList();
        try {
            if (!k.t(str2)) {
                return new ArrayList();
            }
            JSONObject jSONObject = new JSONObject(str2);
            if (jSONObject == null || !jSONObject.has("ads")) {
                return new ArrayList();
            }
            JSONArray jSONArray = jSONObject.getJSONArray("ads");
            if (jSONArray.length() != 0 && jSONObject.getInt("status") == 200) {
                String strOptString = jSONObject.optString(R);
                Logger.d(f52173w, "adId = " + strOptString);
                if (TextUtils.isEmpty(strOptString) && !aX) {
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(G);
                    if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                        String strOptString2 = jSONObject.optString("ad_format", null);
                        String strOptString3 = jSONObject.optString("event_id");
                        if (strOptString2 != null) {
                            try {
                                aVar2 = new a(this, strOptString3, BrandSafetyEvent.AdFormatType.valueOf(strOptString2));
                            } catch (IllegalArgumentException e10) {
                                Logger.d(f52173w, "generate info, Max prefetch parameters: unsupported ad format=" + strOptString2);
                                return null;
                            }
                        } else {
                            aVar2 = new a(strOptString3);
                        }
                        Logger.d(f52173w, "generate info, Max prefetch parameters: eventId=" + aVar2.f52178a + ", adFormat=" + aVar2.f52179b);
                        a(str, map, jSONArray, aVar2);
                        return null;
                    }
                    strOptString = jSONArrayOptJSONArray.getString(0);
                }
                BrandSafetyUtils.AdType adType = null;
                String strName = null;
                if (jSONObject.has(f52175y)) {
                    String string = jSONObject.getString(f52175y);
                    Logger.d(f52173w, "generate info, json ad_size is " + string);
                    if ("BANNER".equals(string) || BrandSafetyUtils.f51657n.equals(string)) {
                        strName = BrandSafetyEvent.AdFormatType.BANNER.name();
                        adType = BrandSafetyUtils.AdType.BANNER;
                    } else if (BrandSafetyUtils.f51658o.equals(string)) {
                        strName = BrandSafetyEvent.AdFormatType.MREC.name();
                        adType = BrandSafetyUtils.AdType.MREC;
                    } else if ("NATIVE".equals(string)) {
                        strName = BrandSafetyEvent.AdFormatType.NATIVE.name();
                        adType = BrandSafetyUtils.AdType.NATIVE;
                    } else {
                        adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                    }
                    Logger.d(f52173w, "generate info, json ad_size : ad format = " + strName + ", ad type = " + adType.name() + ", ad_format = " + (jSONObject.has("ad_format") ? jSONObject.get("ad_format") : "NA"));
                } else {
                    if (jSONObject.has("ad_format")) {
                        String string2 = jSONObject.getString("ad_format");
                        Logger.d(f52173w, "generate info, json ad_format is " + string2);
                        if (string2.equals("BANNER") || string2.equals(BrandSafetyUtils.f51657n)) {
                            strName = BrandSafetyEvent.AdFormatType.BANNER.name();
                            adType = BrandSafetyUtils.AdType.BANNER;
                        } else if (string2.equals(BrandSafetyUtils.f51658o)) {
                            strName = BrandSafetyEvent.AdFormatType.MREC.name();
                            adType = BrandSafetyUtils.AdType.MREC;
                        } else if (string2.equals("NATIVE")) {
                            strName = BrandSafetyEvent.AdFormatType.NATIVE.name();
                            adType = BrandSafetyUtils.AdType.NATIVE;
                        } else if (string2.equals(BrandSafetyUtils.f51653j)) {
                            strName = BrandSafetyEvent.AdFormatType.INTER.name();
                            adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                        } else if (string2.equals(A)) {
                            strName = BrandSafetyEvent.AdFormatType.REWARD.name();
                            adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                        } else if (string2.equals(BrandSafetyUtils.f51655l)) {
                            strName = BrandSafetyEvent.AdFormatType.APPOPEN.name();
                            adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                        }
                        Logger.d(f52173w, "generate info, prefetch parameters adFormat: " + strName);
                    } else {
                        Logger.d(f52173w, "generate info, json ad_format has no value, setting ad type to default : INTERSTITIAL ");
                        adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                    }
                    Logger.d(f52173w, "generate info, json ad_format result : ad format = " + strName + " , ad type = " + adType.name());
                }
                String string3 = jSONObject.has("ad_type") ? jSONObject.getString("ad_type") : null;
                String strA = a(jSONObject);
                Logger.d(f52173w, "generate info, placementId = " + strA);
                String strOptString4 = jSONObject.optString("event_id", null);
                Logger.d(f52173w, "generate info, eventId = " + strOptString4);
                if (aVar != null) {
                    Logger.d(f52173w, "generate info, got MAX prefetch parameters: " + aVar);
                    strName = aVar.f52179b.name();
                    str3 = aVar.f52178a;
                } else {
                    a aVarRemove = this.aM.remove(strOptString);
                    if (aVarRemove == null) {
                        Logger.d(f52173w, "generate info, no MAX prefetch parameters found for adId: " + strOptString + ", eventId: " + strOptString4);
                        return arrayList;
                    }
                    Logger.d(f52173w, "generate info, find MAX prefetch parameters: " + aVarRemove);
                    str3 = aVarRemove.f52178a;
                    if (strA == null || strA.isEmpty()) {
                        strA = aVarRemove.f52180c;
                    }
                    if (aVarRemove.f52179b != null) {
                        if (aVarRemove.f52179b.name().equals("BANNER") || aVarRemove.f52179b.name().equals(BrandSafetyUtils.f51657n)) {
                            strName = BrandSafetyEvent.AdFormatType.BANNER.name();
                            adType = BrandSafetyUtils.AdType.BANNER;
                        } else if (aVarRemove.f52179b.name().equals(BrandSafetyUtils.f51658o)) {
                            strName = BrandSafetyEvent.AdFormatType.MREC.name();
                            adType = BrandSafetyUtils.AdType.MREC;
                        } else if (aVarRemove.f52179b.name().equals("NATIVE")) {
                            strName = BrandSafetyEvent.AdFormatType.NATIVE.name();
                            adType = BrandSafetyUtils.AdType.NATIVE;
                        } else if (aVarRemove.f52179b.name().equals(BrandSafetyUtils.f51653j)) {
                            strName = BrandSafetyEvent.AdFormatType.INTER.name();
                            adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                        } else if (aVarRemove.f52179b.name().equals(A)) {
                            strName = BrandSafetyEvent.AdFormatType.REWARD.name();
                            adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                        } else if (aVarRemove.f52179b.name().equals(BrandSafetyUtils.f51655l)) {
                            strName = BrandSafetyEvent.AdFormatType.APPOPEN.name();
                            adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                        }
                    }
                    Logger.d(f52173w, "generate info, MAX prefetch parameters adFormat: " + strName);
                }
                Logger.d(f52173w, "generate info, adTypeJson = " + string3);
                if (strName == null && string3 != null && string3.equals(D)) {
                    strName = BrandSafetyEvent.AdFormatType.REWARD.name();
                }
                Logger.d(f52173w, "generate info, ad format = " + strName);
                String strOptString5 = jSONObject.optString("dsp_name");
                Logger.d(f52173w, "generate info, dsp name = " + strOptString5);
                Logger.d(f52173w, "generate info, network name = " + jSONObject.optString("network_name"));
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    k.b(f52173w, "generate info, json object is " + jSONObject2.toString());
                    CreativeInfo creativeInfoA = null;
                    if (jSONObject2.has("html") || jSONObject2.has(K)) {
                        creativeInfoA = a(strOptString, adType, strName, strA, str3, strOptString5, jSONObject2, str);
                    } else if (jSONObject2.has(f52145ad)) {
                        creativeInfoA = a(strOptString, adType, strName, strA, strOptString5, str3, jSONObject2);
                    }
                    if (creativeInfoA != null) {
                        if (aVar != null) {
                            if (aVar.f52182e != null) {
                                creativeInfoA.g(aVar.f52182e);
                                Logger.d(f52173w, "generate info, setting adDomain : " + aVar.f52182e);
                            }
                            if (aVar.f52183f != null && creativeInfoA.K() == BrandSafetyUtils.AdType.NATIVE) {
                                String strH = creativeInfoA.h();
                                if (TextUtils.isEmpty(strH)) {
                                    creativeInfoA.c(aVar.f52183f);
                                } else {
                                    creativeInfoA.c(strH + "/" + aVar.f52183f);
                                }
                                Logger.d(f52173w, "generate info, setting native template: " + aVar.f52183f);
                            }
                        }
                        arrayList.add(creativeInfoA);
                        k.b(f52173w, "generate info, added CI: " + creativeInfoA);
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            Logger.d(f52173w, "generate info, exception parsing prefetch: " + th2.getMessage(), th2);
        }
        return arrayList;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean b(View view) {
        return j(view);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean b(String str) {
        Iterator<String> it = CreativeInfoManager.f51978l.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                Logger.d(f52173w, "should follow output stream returned TRUE for url " + str);
                return true;
            }
        }
        Logger.d(f52173w, "should follow output stream returned FALSE for url " + str);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d A[PHI: r5
      0x004d: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String) binds: [B:3:0x0009, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean b(java.lang.String r5, android.os.Bundle r6) {
        /*
            r4 = this;
            r1 = 1
            r0 = 0
            java.lang.String r2 = "&current_retry_attempt="
            int r2 = r5.indexOf(r2)
            r3 = -1
            if (r2 <= r3) goto L4d
            java.lang.String r2 = r5.substring(r0, r2)
            java.lang.String r5 = q(r2)
            java.util.concurrent.ConcurrentHashMap<com.safedk.android.analytics.brandsafety.creatives.VastAdTagUri, com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo> r2 = r4.f52209q
            com.safedk.android.analytics.brandsafety.creatives.VastAdTagUri r3 = new com.safedk.android.analytics.brandsafety.creatives.VastAdTagUri
            r3.<init>(r5)
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L4d
            r2 = r1
        L21:
            if (r2 != 0) goto L31
            java.lang.String r2 = "4.0/ad"
            boolean r2 = r5.contains(r2)
            if (r2 != 0) goto L31
            boolean r2 = com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.g(r5)
            if (r2 == 0) goto L32
        L31:
            r0 = r1
        L32:
            if (r0 == 0) goto L4c
            java.lang.String r1 = com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f52173w
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "should follow input stream: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.safedk.android.utils.Logger.d(r1, r2)
        L4c:
            return r0
        L4d:
            r2 = r0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.analytics.brandsafety.creatives.discoveries.c.b(java.lang.String, android.os.Bundle):boolean");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public int c(String str) {
        String strC = c(str, str);
        if (strC == null) {
            return 0;
        }
        Logger.d(f52173w, String.format("ad id %s, hash code: %s, from webview html: %s, ", strC, Integer.valueOf(strC.hashCode()), str));
        return strC.hashCode();
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
    public String e(String str, String str2) {
        if (b(str)) {
            if (TextUtils.isEmpty(str2)) {
                Logger.d(f52173w, "handle on request sent - content is empty");
            } else {
                try {
                    if (k.H(str2)) {
                        JSONObject jSONObject = new JSONObject(str2);
                        k.b(f52173w, "handle on request sent - parsing json. url: " + str + ", content: " + str2);
                        if (jSONObject.has(aA)) {
                            Logger.d(f52173w, "handle on request sent - applovin request json has ad info");
                            JSONObject jSONObject2 = jSONObject.getJSONObject(aA);
                            if (jSONObject2.has("ad_unit_id")) {
                                String string = jSONObject2.getString("ad_unit_id");
                                Logger.d(f52173w, "handle on request sent - found ad unit id " + string + " inside the request");
                                this.aN.put(str, string);
                            }
                        }
                    } else {
                        Logger.d(f52173w, "handle on request sent - content is not json. content = " + str2);
                    }
                } catch (Throwable th2) {
                    k.b(f52173w, "handle on request sent - exception occurred: " + th2.getMessage());
                }
            }
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public RedirectDetails.RedirectType f(String str) {
        if (str != null) {
            if (str.contains(f52165e)) {
                return RedirectDetails.RedirectType.REDIRECT;
            }
            if (str.contains(f52167g)) {
                return RedirectDetails.RedirectType.EXPAND;
            }
            for (String str2 : f52168h) {
                if (str.startsWith(str2)) {
                    return null;
                }
            }
        }
        return RedirectDetails.RedirectType.REDIRECT;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String f() {
        return "com.applovin.mediation.adapters.AppLovinMediationAdapter";
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public BrandSafetyUtils.AdType g(View view) {
        if (view instanceof AppLovinAdView) {
            AppLovinAdSize size = ((AppLovinAdView) view).getSize();
            if (size.equals(AppLovinAdSize.BANNER) || size.equals(AppLovinAdSize.LEADER)) {
                return BrandSafetyUtils.AdType.BANNER;
            }
            if (size.equals(AppLovinAdSize.MREC)) {
                return BrandSafetyUtils.AdType.MREC;
            }
            if (size.equals(AppLovinAdSize.INTERSTITIAL)) {
                return BrandSafetyUtils.AdType.INTERSTITIAL;
            }
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String g(String str) {
        if (str != null && str.contains(f52165e)) {
            return k.c(str, "n");
        }
        if (str.contains(f52167g)) {
            return null;
        }
        return str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean h(String str) {
        if (aJ.containsKey(str)) {
            return a(aJ.get(str), g.f53127a, aI, this.aK, d.f52203n);
        }
        Logger.d(f52173w, "tryReverseMatching with ad id - ad id " + str + " is not in the adIdToSource keys: " + aJ.keySet());
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public void i() {
        super.i();
        com.safedk.android.utils.e.a(this.aK, f52173w + ":bannerCreativeInfos", false);
        com.safedk.android.utils.e.a(this.aL, f52173w + ":nativeCreativeInfos", false);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void i(String str) {
        String strRemove = aJ.remove(str);
        Logger.d(f52173w, "clean resources started with ad id: " + str + ", and source is: " + strRemove);
        if (strRemove != null) {
            aI.remove(strRemove);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean k(String str) {
        Logger.d(f52173w, "should follow get url: " + str);
        return str.contains("4.0/ad");
    }
}
