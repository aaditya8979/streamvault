package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.a;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.VastAdTagUri;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.f;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.InMobiCreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class e extends d {
    private static final String A = "landingPageUrl";
    private static final String B = "markupType";
    private static final String C = "inmobiJson";
    private static final String D = "requestId";
    private static final String E = ".w.inmobi.com/c.asm/";
    private static final String F = "banner";
    private static final String G = "mrec";
    private static final String H = "com.applovin.mediation.adapters.InMobiMediationAdapter";
    private static final String I = "ads.inmobi.com/sdk";
    private static final String J = "client-request-id";
    private static final String K = "mk-ad-slot";
    private static final String L = "im-plid";
    private static final String M = "adtype";
    private static final String N = "creativeType";
    private static final String O = "metaInfo";
    private static final String P = "omsdkInfo";
    private static final String Q = "macros";
    private static final String R = "$PLACEMENT_DIMENSION";
    private static final String S = "content";
    private static final String T = "trackers";
    private static final String U = "title";
    private static final String V = "screenshots";
    private static final String W = "url";
    private static final String X = "icon";
    private static final String Y = "iconUrl";
    private static final String Z = "description";

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private static final String f52214aa = "cta";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final String f52215ab = "ctaText";

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private static final String f52216ac = "rating";

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private static final String f52217ad = "star";

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private static final String f52218ae = "impressionTrackers";

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private static final String f52219af = "com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL";

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private static final String f52220ag = "com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX";

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    private static final float f52221ah = 0.3f;

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    private static final Map<String, VastAdTagUri> f52222ai = new HashMap();

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    private static final Map<String, CreativeInfo> f52223aj = new ConcurrentHashMap();

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    private static final Map<String, CreativeInfo> f52224ak = new ConcurrentHashMap();

    /* JADX INFO: renamed from: al, reason: collision with root package name */
    private static final Map<String, CreativeInfo> f52225al = new ConcurrentHashMap();

    /* JADX INFO: renamed from: am, reason: collision with root package name */
    private static final Map<String, CreativeInfo> f52226am = new ConcurrentHashMap();

    /* JADX INFO: renamed from: an, reason: collision with root package name */
    private static final Map<String, String> f52227an = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f52228b = "contextData";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f52229c = "advertisedContent";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f52230d = "InMobiDiscovery";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f52231e = "rootContainer";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f52232f = "assetValue";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f52233g = "placementId";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f52234h = "ads";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f52235i = "adSets";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f52236j = "creativeId";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f52237k = "impressionId";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f52238l = "bidBundle";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f52239w = "pubContent";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f52240x = "passThroughJson";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f52241y = "adContent";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f52242z = "landingUrl";

    public e() {
        super(g.f53135i, f52230d, false);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
        this.f52208p.b(AdNetworkConfiguration.SHOULD_UPDATE_CREATIVE_INFO_FROM_VAST, false);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_GZIP_CONTENT, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_EOV, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION, true);
        this.f52208p.b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_PREFETCH_REUSE, true);
        this.f52208p.a(AdNetworkConfiguration.BITMAP_SCAN_BOTTOM_MARGIN_PERCENT, f52221ah);
        this.f52208p.b(AdNetworkConfiguration.BITMAP_SCAN_SHOULD_CHECK_FOR_GREYSCALE, true);
        this.f52208p.b(AdNetworkConfiguration.ENFORCE_CLOSE_INPUT_STREAM_VAST_IN_VAST, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_BIDDING_INTERSTITIAL_IMPRESSION_MATCHING_BY_MAX, true);
        this.f52208p.b(AdNetworkConfiguration.AVOID_CLEANING_PENDING_CI_LIST_ON_AD_END, true);
        this.f52208p.b(AdNetworkConfiguration.AD_NETWORK_INTERNAL_BROWSER_OPENS_IN_SAME_ACTIVITY, true);
        this.f52208p.b(AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, true);
        this.f52208p.b(AdNetworkConfiguration.SHOULD_USE_EARLY_VAST_AD_TAG_URI_PARSING, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_NATIVE_BANNERS_USING_BANNER_KEY, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_NATIVE_IMPRESSION_TRACKING, true);
    }

    private String a(InMobiCreativeInfo inMobiCreativeInfo, JSONObject jSONObject, boolean z10) {
        String str = z10 ? "" : CreativeInfo.aG;
        try {
            String str2 = str + "/" + jSONObject.getString(B);
            if (!jSONObject.has(O)) {
                Logger.d(f52230d, "set downstreamStruct failed because there is no metaInfo in ad object");
                return str2;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(O);
            if (!jSONObject2.has("creativeType")) {
                Logger.d(f52230d, "set downstreamStruct failed because there is no creativeType in metaInfo");
                return str2;
            }
            String str3 = str2 + "/" + jSONObject2.getString("creativeType");
            inMobiCreativeInfo.c(str3);
            return str3;
        } catch (JSONException e10) {
            Logger.d(f52230d, "set downstreamStruct - failed because of jsonException " + e10.getMessage());
            return str;
        }
    }

    private static List<String> a(CreativeInfo creativeInfo, String str) {
        Logger.d(f52230d, "extracting urls");
        new ArrayList();
        ArrayList<String> arrayListG = k.g(str);
        Logger.d(f52230d, "prefetch resources list after impression beacons urls removal : " + arrayListG);
        creativeInfo.b((List<String>) arrayListG);
        return arrayListG;
    }

    private List<CreativeInfo> a(String str, String str2, InMobiCreativeInfo inMobiCreativeInfo, String str3) {
        ArrayList<f.a> arrayListA;
        String strO;
        String strN;
        ArrayList arrayList = new ArrayList();
        if (str2 == null) {
            arrayList.add(inMobiCreativeInfo);
            return arrayList;
        }
        BrandSafetyUtils.AdType adTypeK = inMobiCreativeInfo.K();
        String strK = k.k(str2);
        if (com.safedk.android.analytics.brandsafety.creatives.f.a(strK)) {
            arrayListA = com.safedk.android.analytics.brandsafety.creatives.f.a(strK, true, g.f53135i);
            k.b(f52230d, "vast ad infos: " + (arrayListA != null ? arrayListA.toString() : "null"));
        } else {
            arrayListA = null;
        }
        if (arrayListA != null && arrayListA.size() > 0 && !str3.startsWith("vast")) {
            str3 = TextUtils.isEmpty(str3) ? "vast" : "vast/" + str3;
        }
        Logger.d(f52230d, "is prefetch multi ad? " + (inMobiCreativeInfo.b() > 1 || u(strK)));
        if (arrayListA == null || arrayListA.size() == 0) {
            Logger.d(f52230d, "no vast info detected in prefetch");
            if (TextUtils.isEmpty(str3)) {
                str3 = "mraid";
                if (inMobiCreativeInfo.b() > 1) {
                    str3 = "mraid" + CreativeInfo.aH + inMobiCreativeInfo.b();
                }
            }
            if (inMobiCreativeInfo.M() == null && (strN = n(strK)) != null) {
                inMobiCreativeInfo.t(strN);
            }
            if (inMobiCreativeInfo.o() == null && (strO = o(strK)) != null) {
                inMobiCreativeInfo.q(strO);
            }
            arrayList.add(inMobiCreativeInfo);
        } else if (arrayListA.size() == 1) {
            Logger.d(f52230d, "prefetch has vast info");
            a(inMobiCreativeInfo, arrayListA.get(0), str);
            if (inMobiCreativeInfo.b() > 1) {
                str3 = str3 + CreativeInfo.aH + inMobiCreativeInfo.b();
            }
            Logger.d(f52230d, "downstream struct set to " + str3);
            inMobiCreativeInfo.c(true);
            arrayList.add(inMobiCreativeInfo);
        } else {
            Logger.d(f52230d, "prefetch has multiple vast infos");
            str3 = str3 + CreativeInfo.aH + arrayListA.size() + "/multiple_ads";
            for (f.a aVar : arrayListA) {
                InMobiCreativeInfo inMobiCreativeInfoAj = inMobiCreativeInfo.aj();
                inMobiCreativeInfoAj.ai();
                a(inMobiCreativeInfoAj, aVar, str);
                inMobiCreativeInfo.c(true);
                arrayList.add(inMobiCreativeInfoAj);
            }
        }
        if (str3.endsWith("/")) {
            str3 = str3.substring(0, str3.length() - 1);
        }
        Logger.d(f52230d, "downstream struct set to " + str3);
        if (inMobiCreativeInfo.h() == null || str3.contains(inMobiCreativeInfo.h())) {
            inMobiCreativeInfo.c(str3);
        }
        ArrayList<String> arrayListG = k.g(strK);
        try {
            arrayListG.addAll(k.g(str2));
        } catch (Exception e10) {
            Logger.d(f52230d, "handlePubContent - could not extract urls from encoded pubContent: " + e10);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((CreativeInfo) it.next()).b((List<String>) arrayListG);
        }
        if (inMobiCreativeInfo.K() != BrandSafetyUtils.AdType.NATIVE && arrayListG.size() > 0) {
            for (String str4 : arrayListG) {
                if (str4.contains(E)) {
                    Logger.d(f52230d, "adding " + adTypeK.name().toLowerCase() + " ci with url as key (" + str4 + ")");
                    f52226am.put(str4, inMobiCreativeInfo);
                    k.b(f52230d, "added " + adTypeK.name().toLowerCase() + " CI. # of cis is " + f52226am.size() + ", impressionId: " + inMobiCreativeInfo.L() + ", prefetchResource: " + str4 + ", ci = " + inMobiCreativeInfo);
                }
            }
        }
        return arrayList;
    }

    public static void a(View view, String str) {
        List<CreativeInfo> listA;
        Logger.d(f52230d, "redirect potential source: " + view);
        a aVarA = null;
        if (k.a(view.getWidth(), view.getHeight())) {
            aVarA = SafeDK.getInstance().a(BrandSafetyUtils.AdType.BANNER);
        } else if (k.b(view.getWidth(), view.getHeight())) {
            aVarA = SafeDK.getInstance().a(BrandSafetyUtils.AdType.MREC);
        }
        if (aVarA == null || (listA = aVarA.a(g.f53135i, BrandSafetyUtils.a(view))) == null) {
            return;
        }
        Iterator<CreativeInfo> it = listA.iterator();
        while (it.hasNext()) {
            it.next().u("redirectPotentialSource=" + str + ",view=" + view);
        }
    }

    private void a(InMobiCreativeInfo inMobiCreativeInfo, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(f52239w);
        if (jSONObjectOptJSONObject != null) {
            a((List<String>) arrayList, jSONObjectOptJSONObject.optJSONArray(T), true);
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(f52240x);
            if (jSONObjectOptJSONObject2 != null) {
                a((List<String>) arrayList, jSONObjectOptJSONObject2.optJSONArray(f52218ae), false);
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject(f52231e);
            if (jSONObjectOptJSONObject3 != null) {
                a((List<String>) arrayList, jSONObjectOptJSONObject3.optJSONArray(T), true);
                JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject(f52232f);
                if (jSONObjectOptJSONObject4 != null) {
                    a((List<String>) arrayList, jSONObjectOptJSONObject4.optJSONArray(T), true);
                }
            }
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            inMobiCreativeInfo.w(it.next());
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:12:0x0024
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    private void a(java.util.List<java.lang.String> r4, org.json.JSONArray r5, boolean r6) {
        /*
            r3 = this;
            if (r5 != 0) goto L3
        L2:
            return
        L3:
            r0 = 0
        L4:
            int r1 = r5.length()
            if (r0 >= r1) goto L2
            if (r6 == 0) goto L1c
            org.json.JSONObject r1 = r5.getJSONObject(r0)     // Catch: org.json.JSONException -> L24
            java.lang.String r2 = "url"
            java.lang.String r1 = r1.optString(r2)     // Catch: org.json.JSONException -> L24
            r4.add(r1)     // Catch: org.json.JSONException -> L24
        L19:
            int r0 = r0 + 1
            goto L4
        L1c:
            java.lang.String r1 = r5.getString(r0)     // Catch: org.json.JSONException -> L24
            r4.add(r1)     // Catch: org.json.JSONException -> L24
            goto L19
        L24:
            r1 = move-exception
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.analytics.brandsafety.creatives.discoveries.e.a(java.util.List, org.json.JSONArray, boolean):void");
    }

    private static void a(JSONObject jSONObject, CreativeInfo creativeInfo) {
        String strOptString;
        String strOptString2;
        String str;
        String str2;
        String strOptString3;
        String strOptString4;
        String strOptString5;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(f52240x);
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(f52241y);
        if (jSONObjectOptJSONObject != null) {
            strOptString3 = jSONObjectOptJSONObject.optString("title");
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject(V);
            String strOptString6 = jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.optString("url") : null;
            String strOptString7 = jSONObjectOptJSONObject.optJSONObject("icon") != null ? jSONObjectOptJSONObject.optString("url") : null;
            strOptString2 = jSONObjectOptJSONObject.optString("description");
            strOptString = jSONObjectOptJSONObject.optString("cta");
            str = strOptString7;
            str2 = strOptString6;
        } else {
            strOptString = null;
            strOptString2 = null;
            str = null;
            str2 = null;
            strOptString3 = null;
        }
        if (jSONObjectOptJSONObject2 != null) {
            strOptString5 = TextUtils.isEmpty(strOptString3) ? jSONObjectOptJSONObject2.optString("title") : strOptString3;
            strOptString4 = TextUtils.isEmpty(str) ? jSONObjectOptJSONObject2.optString("iconUrl") : str;
            String strOptString8 = TextUtils.isEmpty(strOptString2) ? jSONObjectOptJSONObject2.optString("description") : strOptString2;
            strOptString = TextUtils.isEmpty(strOptString) ? jSONObjectOptJSONObject2.optString(f52215ab) : strOptString;
            strOptString2 = strOptString8;
        } else {
            strOptString4 = str;
            strOptString5 = strOptString3;
        }
        if (!TextUtils.isEmpty(strOptString5)) {
            creativeInfo.B(CreativeInfo.aM + strOptString5);
        }
        if (!TextUtils.isEmpty(str2)) {
            creativeInfo.B(CreativeInfo.aN + str2);
        }
        if (!TextUtils.isEmpty(strOptString4)) {
            creativeInfo.B(CreativeInfo.aO + strOptString4);
        }
        if (!TextUtils.isEmpty(strOptString2)) {
            creativeInfo.B(CreativeInfo.aP + strOptString2);
        }
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        creativeInfo.B(CreativeInfo.aQ + strOptString);
    }

    private boolean a(JSONObject jSONObject) {
        try {
            boolean z10 = jSONObject.has(B) && jSONObject.getString(B).equals(C);
            boolean z11 = jSONObject.has(f52239w) && k.v(jSONObject.getString(f52239w));
            boolean z12 = jSONObject.getJSONObject(f52239w).has(f52241y) && jSONObject.getJSONObject(f52239w).getJSONObject(f52241y).length() > 0;
            if (z10 && z11 && z12) {
                Logger.d(f52230d, "is native ad - adObj is indeed an inmobi native ad");
                return true;
            }
        } catch (JSONException e10) {
            Logger.d(f52230d, "isNativeAd not a native ad (" + e10.getMessage() + ")");
        }
        return false;
    }

    private boolean a(JSONObject jSONObject, String str, CreativeInfo creativeInfo, String str2, boolean z10, boolean z11) {
        try {
            if (jSONObject.has(str2)) {
                if (z11) {
                    creativeInfo.A(jSONObject.getString(str2));
                } else {
                    creativeInfo.z(jSONObject.getString(str2));
                }
                return true;
            }
        } catch (JSONException e10) {
            Logger.d(f52230d, "findInJSONAndAddText - exception happened during trying to retrieve key " + str2 + " form json element " + str);
        }
        if (z10) {
            Logger.d(f52230d, "findInJSONAndAddText - did not find the key: " + str2 + " inside the json element: " + str);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d A[Catch: JSONException -> 0x0073, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0073, blocks: (B:6:0x0011, B:8:0x001f, B:10:0x002d, B:11:0x004d), top: B:16:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String b(org.json.JSONObject r6) {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r1 = "pubContent"
            boolean r1 = r6.has(r1)
            if (r1 != 0) goto L11
            java.lang.String r1 = "InMobiDiscovery"
            java.lang.String r2 = "getNativeAdClickUrl did not find pub_content"
            com.safedk.android.utils.Logger.d(r1, r2)
        L10:
            return r0
        L11:
            java.lang.String r1 = "pubContent"
            org.json.JSONObject r1 = r6.getJSONObject(r1)     // Catch: org.json.JSONException -> L73
            java.lang.String r2 = "passThroughJson"
            boolean r2 = r1.has(r2)     // Catch: org.json.JSONException -> L73
            if (r2 == 0) goto L4d
            java.lang.String r2 = "passThroughJson"
            org.json.JSONObject r2 = r1.getJSONObject(r2)     // Catch: org.json.JSONException -> L73
            java.lang.String r3 = "landingUrl"
            boolean r3 = r2.has(r3)     // Catch: org.json.JSONException -> L73
            if (r3 == 0) goto L4d
            java.lang.String r1 = "landingUrl"
            java.lang.String r1 = r2.getString(r1)     // Catch: org.json.JSONException -> L73
            java.lang.String r2 = "InMobiDiscovery"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L73
            r3.<init>()     // Catch: org.json.JSONException -> L73
            java.lang.String r4 = "getNativeAdClickUrl returned "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: org.json.JSONException -> L73
            java.lang.StringBuilder r3 = r3.append(r1)     // Catch: org.json.JSONException -> L73
            java.lang.String r3 = r3.toString()     // Catch: org.json.JSONException -> L73
            com.safedk.android.utils.Logger.d(r2, r3)     // Catch: org.json.JSONException -> L73
            r0 = r1
            goto L10
        L4d:
            java.lang.String r2 = "adContent"
            org.json.JSONObject r1 = r1.getJSONObject(r2)     // Catch: org.json.JSONException -> L73
            java.lang.String r2 = "landingPageUrl"
            java.lang.String r1 = r1.getString(r2)     // Catch: org.json.JSONException -> L73
            java.lang.String r2 = "InMobiDiscovery"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L73
            r3.<init>()     // Catch: org.json.JSONException -> L73
            java.lang.String r4 = "getNativeAdClickUrl returned "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: org.json.JSONException -> L73
            java.lang.StringBuilder r3 = r3.append(r1)     // Catch: org.json.JSONException -> L73
            java.lang.String r3 = r3.toString()     // Catch: org.json.JSONException -> L73
            com.safedk.android.utils.Logger.d(r2, r3)     // Catch: org.json.JSONException -> L73
            r0 = r1
            goto L10
        L73:
            r1 = move-exception
            java.lang.String r2 = "InMobiDiscovery"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "getNativeAdClickUrl not a native ad ("
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r1 = r1.getMessage()
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r3 = ")"
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.safedk.android.utils.Logger.d(r2, r1)
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.analytics.brandsafety.creatives.discoveries.e.b(org.json.JSONObject):java.lang.String");
    }

    private void b(CreativeInfo creativeInfo, String str) {
        List<String> listA = k.a(com.safedk.android.utils.f.H(), str);
        if (listA == null || listA.size() <= 1) {
            return;
        }
        for (String str2 : listA) {
            Logger.d(f52230d, "adding vast clause " + str2 + " to ci debug info");
            creativeInfo.u(str2);
        }
    }

    private void b(InMobiCreativeInfo inMobiCreativeInfo, JSONObject jSONObject) {
        if (!jSONObject.has(f52239w)) {
            Logger.d(f52230d, "addDSPDomainURLs did not find pub_content");
            return;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(f52239w);
            if (!jSONObject2.has(T)) {
                Logger.d(f52230d, "addDSPDomainURLs did not find trackers array");
                return;
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject2.getJSONArray(T);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (jSONArray.getJSONObject(i10).has("url")) {
                    arrayList.add(jSONArray.getJSONObject(i10).getString("url"));
                }
            }
            inMobiCreativeInfo.b((List<String>) arrayList);
        } catch (JSONException e10) {
            Logger.d(f52230d, "addDSPDomainURLs not a native ad (" + e10.getMessage() + ")");
        }
    }

    private BrandSafetyUtils.AdType c(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has(O) || !jSONObject.getJSONObject(O).has(P)) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(O).getJSONObject(P);
        if (!jSONObject2.has(Q)) {
            return null;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject(Q);
        if (!jSONObject3.has(R)) {
            return null;
        }
        String string = jSONObject3.getString(R);
        Logger.d(f52230d, "generate info - placementDimension = " + string);
        if (!string.contains("X")) {
            return null;
        }
        String[] strArrSplit = string.split("X");
        int i10 = Integer.parseInt(strArrSplit[0]);
        int i11 = Integer.parseInt(strArrSplit[1]);
        if (i10 != 0 && i11 != 0 && k.a(i10, i11)) {
            BrandSafetyUtils.AdType adType = BrandSafetyUtils.AdType.BANNER;
            Logger.d(f52230d, "generate info - adtype set to BANNER : placementDimension is " + string);
            return adType;
        }
        if (i10 == 0 || i11 == 0 || !k.b(i10, i11)) {
            return null;
        }
        BrandSafetyUtils.AdType adType2 = BrandSafetyUtils.AdType.MREC;
        Logger.d(f52230d, "generate info - adtype set to MREC : placementDimension is " + string);
        return adType2;
    }

    private List<CreativeInfo> c(String str, String str2, Map<String, List<String>> map, c.a aVar) {
        JSONObject jSONObject;
        String str3;
        JSONArray jSONArray;
        BrandSafetyUtils.AdType adTypeC;
        BrandSafetyUtils.AdType adTypeC2;
        ArrayList arrayList = new ArrayList();
        try {
            jSONObject = new JSONObject(str2);
        } catch (Throwable th2) {
            Logger.e(f52230d, "error: " + th2.getMessage(), th2);
        }
        if (!jSONObject.has(D) || (!jSONObject.has(f52235i) && !jSONObject.has("ads"))) {
            Logger.d(f52230d, "generate info - not a JSON prefetch");
            return arrayList;
        }
        if (jSONObject.getJSONArray(f52235i).length() == 0) {
            Logger.d(f52230d, "generate info - ad sets array is empty, skipping");
            return arrayList;
        }
        if (jSONObject.has(D)) {
            String string = jSONObject.getString(D);
            Logger.d(f52230d, "generate info - request id: " + string);
            str3 = string;
        } else {
            str3 = null;
        }
        String string2 = null;
        if (jSONObject.has("placementId")) {
            string2 = jSONObject.getString("placementId");
            Logger.d(f52230d, "generate info - placement id: " + string2);
        }
        k.b(f52230d, "generate info - url: " + str + " , Headers: " + (map != null ? map.toString() : "null") + ", buffer size: " + (str2 == null ? "0" : Integer.valueOf(str2.length())) + " , buffer: " + str2);
        JSONObject jSONObject2 = null;
        if (jSONObject.has(f52235i)) {
            JSONArray jSONArray2 = jSONObject.getJSONArray(f52235i);
            Logger.d(f52230d, "generate info - ad sets : " + jSONArray2.length() + " items");
            if (jSONArray2.length() <= 0) {
                Logger.d(f52230d, "generate info - ad sets element has no items");
                return arrayList;
            }
            jSONObject2 = jSONArray2.getJSONObject(0);
        }
        if (jSONObject2 != null) {
            jSONArray = jSONObject2.getJSONArray("ads");
        } else {
            if (!jSONObject.has("ads") || !(jSONObject.get("ads") instanceof JSONArray)) {
                Logger.d(f52230d, "generate info - ads element has no items or is not an array");
                return arrayList;
            }
            jSONArray = jSONObject.getJSONArray("ads");
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
            String string3 = jSONObject3.getString("creativeId");
            String string4 = jSONObject3.getString(f52237k);
            Logger.d(f52230d, "generate info - impression id: " + string4 + ", creative id: " + string3);
            JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject(f52228b);
            String strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString(f52229c) : null;
            if (str3 != null && f52227an.containsKey(string2)) {
                String str4 = f52227an.get(string2);
                Logger.d(f52230d, "generate info - placement id to ad type list contains ad type " + str4 + " for placement id " + string2);
                if (str4.equals("banner")) {
                    adTypeC2 = c(jSONObject3);
                    if (adTypeC2 == null) {
                        adTypeC2 = BrandSafetyUtils.AdType.BANNER;
                    }
                } else {
                    adTypeC2 = str4.equals("mrec") ? BrandSafetyUtils.AdType.MREC : BrandSafetyUtils.AdType.INTERSTITIAL;
                }
                adTypeC = adTypeC2;
            } else if (aVar != null && (aVar.f52179b == BrandSafetyEvent.AdFormatType.BANNER || aVar.f52179b == BrandSafetyEvent.AdFormatType.LEADER)) {
                adTypeC = BrandSafetyUtils.AdType.BANNER;
            } else if (aVar != null && aVar.f52179b == BrandSafetyEvent.AdFormatType.MREC) {
                adTypeC = BrandSafetyUtils.AdType.MREC;
            } else if (aVar == null || aVar.f52179b != BrandSafetyEvent.AdFormatType.NATIVE) {
                adTypeC = c(jSONObject3);
                if (adTypeC == null) {
                    adTypeC = BrandSafetyUtils.AdType.INTERSTITIAL;
                }
            } else {
                adTypeC = BrandSafetyUtils.AdType.NATIVE;
            }
            Logger.d(f52230d, "generate info - ad type: " + (adTypeC != null ? adTypeC.name() : "null"));
            InMobiCreativeInfo inMobiCreativeInfo = new InMobiCreativeInfo(string4, string3, string2, this.f52211t, adTypeC, jSONArray.length(), aVar == null ? null : aVar.f52179b, aVar == null ? null : aVar.f52178a, strOptString);
            boolean zA = a(jSONObject3);
            String string5 = jSONObject3.getString(f52239w);
            String strL = l(string5);
            List<CreativeInfo> arrayList2 = new ArrayList<>();
            if (k.a((Object) string5)) {
                inMobiCreativeInfo.u("pubContentUrl=" + string5);
                Logger.d(f52230d, "generate info - adding pubContent URL to follow: " + string5);
                f52223aj.put(string5, inMobiCreativeInfo);
                arrayList2.add(inMobiCreativeInfo);
            } else if (adTypeC == BrandSafetyUtils.AdType.NATIVE) {
                String strA = a(inMobiCreativeInfo, jSONObject3, true);
                if (strL != null) {
                    arrayList2 = a(str, strL, inMobiCreativeInfo, strA);
                } else {
                    inMobiCreativeInfo.t(b(jSONObject3));
                }
                a(inMobiCreativeInfo, jSONObject3);
                a(new JSONObject(string5), (CreativeInfo) inMobiCreativeInfo);
                String str5 = string3 + "_" + string4;
                Logger.d(f52230d, "generate info - adding native ci with creative id as key: " + str5);
                f52224ak.put(str5, inMobiCreativeInfo);
            } else if (zA && strL != null) {
                k.b(f52230d, "generate info - found native vast inside pubContent");
                arrayList2 = a(str, strL, inMobiCreativeInfo, a(inMobiCreativeInfo, jSONObject3, false));
            } else if (zA) {
                arrayList2 = a(str, string5, inMobiCreativeInfo, a(inMobiCreativeInfo, jSONObject3, false));
                inMobiCreativeInfo.t(b(jSONObject3));
                b(inMobiCreativeInfo, jSONObject3);
                c(inMobiCreativeInfo, jSONObject3);
            } else {
                arrayList2 = strL != null ? a(str, strL, inMobiCreativeInfo, "") : a(str, string5, inMobiCreativeInfo, "");
            }
            if (adTypeC == BrandSafetyUtils.AdType.INTERSTITIAL) {
                if (aVar == null) {
                    Logger.d(f52230d, "generate info - adding interstitial ci with creative id as key (" + string3 + ")");
                    f52224ak.put(string3, inMobiCreativeInfo);
                    k.b(f52230d, "generate info - added interstitial CI. # of cis is " + f52224ak.size() + ", impression id: " + string4 + ", creative id: " + string3 + ", CI: " + inMobiCreativeInfo.toString());
                } else if (aVar.f52178a == null || string2 == null) {
                    Logger.d(f52230d, "generate info - placementId and/or eventId are missing, cannot process ci");
                } else {
                    String str6 = string2 + "_" + aVar.f52178a + "_" + g.f53135i;
                    Logger.d(f52230d, "generate info - adding interstitial ci with complex key (" + str6 + ")");
                    f52224ak.put(str6, inMobiCreativeInfo);
                    inMobiCreativeInfo.f(aVar.f52178a);
                    k.b(f52230d, "added interstitial CI. # of cis is " + f52224ak.size() + ", impression id: " + string4 + ", complex key: " + str6 + ", CI: " + inMobiCreativeInfo.toString());
                }
            } else if ((adTypeC == BrandSafetyUtils.AdType.BANNER || adTypeC == BrandSafetyUtils.AdType.MREC) && string2 != null && aVar != null && aVar.f52178a != null && inMobiCreativeInfo.b() == 1) {
                String str7 = string2 + "_" + aVar.f52178a + "_" + g.f53135i;
                Logger.d(f52230d, "adding banner ci with complex key (" + str7 + ")");
                f52225al.put(str7, inMobiCreativeInfo);
                k.b(f52230d, "added banner CI. # of cis is " + f52225al.size() + ", impression id: " + string4 + ", adType = " + adTypeC + ", complex key: " + str7 + ", CI: " + inMobiCreativeInfo.toString());
            }
            Logger.d(f52230d, "recent creative IDs array item added. Key = " + string3);
            if (arrayList2 != null && arrayList2.size() > 0) {
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }

    private void c(InMobiCreativeInfo inMobiCreativeInfo, JSONObject jSONObject) {
        boolean zA;
        boolean zA2;
        boolean zA3;
        boolean z10 = false;
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(f52239w);
            if (jSONObject2.has(f52240x)) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(f52240x);
                if (jSONObject3.has(V)) {
                    a(jSONObject3.getJSONObject(V), V, inMobiCreativeInfo, "url", true, false);
                }
                zA = jSONObject3.has("icon") ? a(jSONObject3.getJSONObject("icon"), "icons", inMobiCreativeInfo, "url", false, false) : false;
                boolean zA4 = a(jSONObject3, f52240x, inMobiCreativeInfo, "title", false, true);
                zA3 = a(jSONObject3, f52240x, inMobiCreativeInfo, "description", false, true);
                zA2 = a(jSONObject3, f52240x, inMobiCreativeInfo, "cta", false, true);
                zA = a(jSONObject3, f52240x, inMobiCreativeInfo, "rating", false, true);
                z10 = zA4;
            } else {
                zA = false;
                zA2 = false;
                zA3 = false;
            }
            if (jSONObject2.has(f52241y)) {
                JSONObject jSONObject4 = jSONObject2.getJSONObject(f52241y);
                a(jSONObject4, f52241y, inMobiCreativeInfo, "title", !z10, true);
                a(jSONObject4, f52241y, inMobiCreativeInfo, "iconUrl", !zA, false);
                a(jSONObject4, f52241y, inMobiCreativeInfo, "description", !zA3, true);
                a(jSONObject4, f52241y, inMobiCreativeInfo, f52215ab, !zA2, true);
                a(jSONObject4, f52241y, inMobiCreativeInfo, "rating", !zA, true);
            }
        } catch (JSONException e10) {
            Logger.d(f52230d, "extract native ad content - failed because of jsonException " + e10.getMessage());
        }
    }

    private List<CreativeInfo> g(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        try {
            if (TextUtils.isEmpty(str2)) {
                Logger.d(f52230d, "generate info - buffer value cannot be empty, skipping.");
            } else {
                Logger.d(f52230d, "generate info - InMobi vast proxy prefetch. vast ad tag proxy urls to follow: " + f52222ai.toString());
                CreativeInfo creativeInfoRemove = null;
                if (f52222ai.containsKey(str)) {
                    Logger.d(f52230d, "vasts proxy redirect url found: " + str);
                    creativeInfoRemove = this.f52209q.remove(f52222ai.remove(str));
                }
                String strQ = q(str);
                Logger.d(f52230d, "decodedUrl : " + strQ);
                if (creativeInfoRemove == null && f52222ai.containsKey(strQ)) {
                    Logger.d(f52230d, "vasts proxy redirect url found: " + str);
                    creativeInfoRemove = this.f52209q.remove(f52222ai.remove(strQ));
                }
                if (creativeInfoRemove != null) {
                    k.b(f52230d, "found vast proxy url: " + str + ", ci: " + creativeInfoRemove + ", content: " + str2);
                    a(creativeInfoRemove, str, str2, true);
                    Logger.d(f52230d, "vast processing was done in BaseDiscovery.");
                    arrayList.add(creativeInfoRemove);
                    return arrayList;
                }
            }
        } catch (Throwable th2) {
            Logger.e(f52230d, "generate info exception: " + th2.getMessage(), th2);
        }
        return arrayList;
    }

    private String l(String str) {
        String string = null;
        try {
            if (k.v(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has(f52231e)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(f52231e);
                    if (jSONObject2.has(f52232f)) {
                        JSONArray jSONArray = jSONObject2.getJSONArray(f52232f);
                        int i10 = 0;
                        loop0: while (true) {
                            if (i10 < jSONArray.length()) {
                                JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                                if (jSONObject3.has(f52232f)) {
                                    JSONArray jSONArray2 = jSONObject3.getJSONArray(f52232f);
                                    for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                                        if ((jSONArray2.get(i11) instanceof String) && com.safedk.android.analytics.brandsafety.creatives.f.a(jSONArray2.getString(i11))) {
                                            Logger.d(f52230d, "check vast format prefetch - found vast value inside");
                                            string = jSONArray2.getString(i11);
                                            break loop0;
                                        }
                                    }
                                }
                                i10++;
                            }
                        }
                    }
                }
            } else {
                Logger.d(f52230d, "check vast format prefetch - pubContent is not a JSON");
            }
            break;
        } catch (JSONException e10) {
            Logger.d(f52230d, "check vast format prefetch - exception occurred: " + e10.getMessage());
        }
        return string;
    }

    private static String r(String str) {
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONArray jSONArrayOptJSONArray2 = new JSONObject(str).optJSONArray(f52235i);
            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0 && (jSONArrayOptJSONArray = jSONArrayOptJSONArray2.getJSONObject(0).optJSONArray("ads")) != null && jSONArrayOptJSONArray.length() > 0) {
                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(0);
                String strOptString = jSONObject.optString("creativeId");
                String strOptString2 = jSONObject.optString(f52237k);
                if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                    String str2 = strOptString + "_" + strOptString2;
                    Logger.d(f52230d, "get creative id json - found creative id= " + str2);
                    return str2;
                }
            }
        } catch (JSONException e10) {
            Logger.d(f52230d, "get creative id json - exception: " + e10);
        }
        return null;
    }

    private boolean s(String str) {
        return str.contains(D) && str.contains("placementId") && str.contains(f52235i) && str.contains("creativeId");
    }

    private String t(String str) {
        Map<String, String> mapB;
        String next = null;
        if (str != null && (mapB = k.b(str, false)) != null && mapB.size() > 0) {
            Iterator<String> it = mapB.values().iterator();
            while (it.hasNext()) {
                next = it.next();
            }
        }
        return next;
    }

    private boolean u(String str) {
        List<String> listA = k.a(com.safedk.android.utils.f.J(), str);
        List<String> listA2 = k.a(com.safedk.android.utils.f.I(), str);
        if (listA == null || listA.size() <= 1) {
            return listA2 != null && listA2.size() > 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x011f  */
    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo a(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.analytics.brandsafety.creatives.discoveries.e.a(java.lang.Object):com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(Bundle bundle) {
        int i10;
        if (bundle == null || (i10 = bundle.getInt(f52220ag)) <= 0) {
            return null;
        }
        String hexString = Integer.toHexString(i10);
        Logger.d(f52230d, "found expanded ad webview address in intent extra: " + hexString);
        return hexString;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected synchronized void a(VastAdTagUri vastAdTagUri) {
        if (vastAdTagUri != null) {
            Iterator<Map.Entry<String, VastAdTagUri>> it = f52222ai.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, VastAdTagUri> next = it.next();
                if (next.getValue().equals(vastAdTagUri)) {
                    Logger.d(f52230d, "remove vast ad tag proxy uri from url to follow list: " + next.getValue());
                    it.remove();
                }
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(FileInputStream fileInputStream, FileDescriptor fileDescriptor) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(FileInputStream fileInputStream, String str) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected void a(String str, VastAdTagUri vastAdTagUri) {
        if (str != null) {
            String[] strArrSplit = str.split("://");
            if (strArrSplit.length == 2) {
                f52222ai.put("http://vastproxy.brand.inmobi.com/g/" + strArrSplit[1], vastAdTagUri);
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(String str, String str2, String str3, String str4) {
        BrandSafetyEvent.AdFormatType adFormatType;
        CreativeInfo creativeInfo;
        if (str4.equals(BrandSafetyEvent.AdFormatType.APPOPEN.name())) {
            Logger.d(f52230d, "ignoring creative info details from Max, adFormat = " + str4 + ", creativeId = " + str2 + ", placementId = " + str);
            return;
        }
        if (str2 == null || str3 == null) {
            return;
        }
        if (str4.equals(BrandSafetyUtils.f51653j)) {
            CreativeInfo creativeInfo2 = f52224ak.get(str2);
            adFormatType = BrandSafetyEvent.AdFormatType.INTER;
            creativeInfo = creativeInfo2;
        } else if (str4.equals(BrandSafetyUtils.f51654k)) {
            CreativeInfo creativeInfo3 = f52224ak.get(str2);
            adFormatType = BrandSafetyEvent.AdFormatType.REWARD;
            creativeInfo = creativeInfo3;
        } else if (str4.equals("BANNER") || str4.equals(BrandSafetyUtils.f51657n)) {
            CreativeInfo creativeInfo4 = f52225al.get(str + "_" + str3 + "_" + g.f53135i);
            adFormatType = BrandSafetyEvent.AdFormatType.BANNER;
            creativeInfo = creativeInfo4;
        } else if (str4.equals(BrandSafetyUtils.f51658o)) {
            CreativeInfo creativeInfo5 = f52225al.get(str + "_" + str3 + "_" + g.f53135i);
            adFormatType = BrandSafetyEvent.AdFormatType.MREC;
            creativeInfo = creativeInfo5;
        } else {
            adFormatType = null;
            creativeInfo = null;
        }
        if (adFormatType == null || creativeInfo == null) {
            Logger.d(f52230d, "failed to update CI details from Max, creative id: " + str2 + ", ad format: " + str4 + ", ad format type: " + adFormatType + ", CI: " + creativeInfo);
        } else {
            creativeInfo.p(adFormatType.name());
            Logger.d(f52230d, "update CI details from Max, creative id: " + str2 + ", ID: " + creativeInfo.L() + ", placement id: " + creativeInfo.F() + ", ad format type: " + adFormatType);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a() {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String b(Object obj) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<CreativeInfo> b(String str, String str2, Map<String, List<String>> map, c.a aVar) {
        k.b(f52230d, "generate info started, url: " + str + ", event id: " + (aVar == null ? "" : aVar.f52178a) + ", buffer: " + str2);
        if (k.v(str2)) {
            if (!s(str2)) {
                return g(str, str2);
            }
            Logger.d(f52230d, "generate info - InMobi prefetch");
            return c(str, str2, map, aVar);
        }
        Logger.d(f52230d, "generate info - InMobi pubContent, url: " + str);
        InMobiCreativeInfo inMobiCreativeInfo = (InMobiCreativeInfo) f52223aj.remove(str);
        if (inMobiCreativeInfo != null) {
            return a(str, str2, inMobiCreativeInfo, "");
        }
        Logger.d(f52230d, "generate info - not a valid JSON string");
        return new ArrayList();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void b(Object obj, Object obj2) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean b(String str) {
        if (!str.contains(I)) {
            return false;
        }
        Logger.d(f52230d, "should follow output stream returned true for url " + str);
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public boolean b(String str, Bundle bundle) {
        String strE = k.E(str);
        boolean zContainsKey = f52223aj.containsKey(strE);
        if (zContainsKey && bundle != null) {
            bundle.putString(CreativeInfoManager.f51947a, "text/html");
            bundle.putString(CreativeInfoManager.f51968b, "UTF-8");
        }
        VastAdTagUri vastAdTagUri = new VastAdTagUri(strE);
        boolean z10 = this.f52209q.containsKey(vastAdTagUri) || com.safedk.android.analytics.brandsafety.creatives.f.f52440c.contains(vastAdTagUri) || f52222ai.containsKey(strE);
        if (strE.contains("action=skip-btn-clicked")) {
            Logger.d(f52230d, "video skipped event identified: " + strE);
            CreativeInfoManager.onVideoCompleted(g.f53135i, null);
        }
        if (!strE.contains(I) && !zContainsKey && !z10) {
            return false;
        }
        Logger.d(f52230d, "should follow input stream returned true for: " + strE);
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public int c(String str) {
        return 0;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String c(String str, String str2) {
        String strO = k.o(str2);
        Logger.d(f52230d, "get ad id from resource started, resource: " + str2 + ", resource key: " + strO);
        if (!f52226am.containsKey(strO)) {
            return null;
        }
        CreativeInfo creativeInfo = f52226am.get(strO);
        k.b(f52230d, "get ad id from resource - CI identified, # of CIs: " + f52226am.size() + ", CI: " + creativeInfo.toString());
        return creativeInfo.L();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public Set<String> c() {
        Set<String> setC = super.c();
        setC.add("$TS");
        return setC;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void d(View view) {
        a(view, "onClick");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void d(String str, String str2) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String e(String str, String str2) {
        String strC;
        String strC2;
        Logger.d(f52230d, "handle on request sent url: " + str + ", content: " + str2);
        String strC3 = k.c(str + "?" + str2, L);
        if (strC3 == null || (strC = k.c(str + "?" + str2, M)) == null) {
            return null;
        }
        if (strC.equals("banner") && (strC2 = k.c(str + "?" + str2, K)) != null && strC2.contains(VastAttributes.HORIZONTAL_POSITION)) {
            String[] strArrSplit = strC2.split(VastAttributes.HORIZONTAL_POSITION);
            int i10 = Integer.parseInt(strArrSplit[0]);
            int i11 = Integer.parseInt(strArrSplit[1]);
            if (i10 != 0 && i11 != 0 && k.b(i10, i11)) {
                strC = "mrec";
                Logger.d(f52230d, "handle on request sent - adtype is MREC : mkAdSlot is " + strC2);
            }
        }
        Logger.d(f52230d, "adding to placement id to ad type list - size: " + f52227an.size() + ", placement id: " + strC3 + ", ad type: " + strC);
        f52227an.put(strC3, strC);
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void e(View view) {
        a(view, "onSource");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean e(String str) {
        if (!str.contains(E)) {
            return false;
        }
        Logger.d(f52230d, "should ignore redirect url - tracking url detected");
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String f() {
        return H;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<String> g() {
        List<String> listG = super.g();
        listG.add(f52219af);
        return listG;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public void i() {
        super.i();
        com.safedk.android.utils.e.a(f52224ak, "InMobiDiscovery:creativeToIdMap", false);
        com.safedk.android.utils.e.a(f52225al, "InMobiDiscovery:bannerCreativeToIdMap", false);
        com.safedk.android.utils.e.a(f52226am, "InMobiDiscovery:creativeToUrlMap", false);
        com.safedk.android.utils.e.a(f52223aj, "InMobiDiscovery:pubContentUrlsToFollow", false);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean k(String str) {
        String strO = k.o(str);
        if (!(str.contains(I) || f52226am.containsKey(strO))) {
            return false;
        }
        Logger.d(f52230d, "should follow get url key: " + strO);
        return true;
    }
}
