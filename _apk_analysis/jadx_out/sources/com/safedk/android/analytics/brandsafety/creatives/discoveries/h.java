package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.Gc;
import com.ironsource.Z7;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.MBBannerView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BannerFinder;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.MintegralCreativeInfo;
import com.safedk.android.analytics.brandsafety.n;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.PersistentConcurrentHashMap;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class h extends d {
    private static Map<String, CreativeInfo> B = null;
    private static Map<String, CreativeInfo> C = null;
    private static Map<String, CreativeInfo> D = null;
    private static final String F = "com.applovin.mediation.adapters.MintegralMediationAdapter";
    private static final String G = "status";
    private static final int H = 1;
    private static final String I = "data";
    private static final String J = "ads";
    private static final String K = "id";
    private static final String L = "video_url";
    private static final String M = "image_url";
    private static final String N = "end_screen_url";
    private static final String O = "unit_id";
    private static final String P = "package_name";
    private static final String Q = "click_url";
    private static final String R = "cam_html";
    private static final String S = "http";
    private static final String T = "req_ext_data";
    private static final String U = "parent_id";
    private static final String V = "ad_tracking";
    private static final String W = "impression";
    private static final String X = "impression_url";
    private static final String Y = "only_impression_url";
    private static final String Z = "ad_type";

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private static final int f52279aa = -1;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final int f52280ab = 287;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private static final int f52281ac = 94;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private static final int f52282ad = 296;

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private static final int f52283ae = 295;

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private static final String f52284af = "mof_template_url";

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private static final String f52285ag = "mbridge_same_choice_one_layout";

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    private static final String f52286ah = "choose_from_two";

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    private static final String f52287ai = "multi_ad_mintegral_dsp";

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    private static final String f52288aj = "mof_data";

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    private static final String f52289ak = "crt_rid";

    /* JADX INFO: renamed from: al, reason: collision with root package name */
    private static final String f52290al = "rks";

    /* JADX INFO: renamed from: am, reason: collision with root package name */
    private static final String f52291am = "aks";

    /* JADX INFO: renamed from: an, reason: collision with root package name */
    private static final String f52292an = "k";

    /* JADX INFO: renamed from: ao, reason: collision with root package name */
    private static final String f52293ao = "sdkId";

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    private static final String f52294ap = "webviewAddress";

    /* JADX INFO: renamed from: aq, reason: collision with root package name */
    private static final String f52295aq = "direction";

    /* JADX INFO: renamed from: ar, reason: collision with root package name */
    private static final String f52296ar = "recommendation-images";

    /* JADX INFO: renamed from: as, reason: collision with root package name */
    private static final String f52297as = "recommendations";

    /* JADX INFO: renamed from: at, reason: collision with root package name */
    private static final String f52298at = "url";
    private static final String au = "responseText";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f52301d = "{";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f52302e = "}";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f52303f = "mbridge_order_layout_list";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f52304g = "a";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f52305h = "b";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f52306i = "c";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f52307j = "q";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f52308k = "r";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f52309l = "al";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f52310w = "csp";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f52311x = "MintegralDiscovery";
    private final Map<String, String> av;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f52299b = ".rayjump.com/openapi/ad";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f52312y = ".rayjump.com/load";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f52313z = "mtgglobals.com/load";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f52300c = "mtgglobals.com/openapi/ad/v3";
    private static final List<String> A = Arrays.asList(f52299b, f52312y, f52313z, f52300c, CreativeInfoManager.f51980n, CreativeInfoManager.f51981o);
    private static final Set<String> E = new HashSet();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f52314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f52315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f52316c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f52317d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f52318e;

        a() {
        }

        public String toString() {
            return (this.f52314a != null ? this.f52314a + Z7.f30794r : "") + (this.f52315b != null ? this.f52315b + Z7.f30794r : "") + (this.f52316c != null ? this.f52316c + Z7.f30794r : "") + (this.f52317d != null ? this.f52317d + Z7.f30794r : "") + (this.f52318e != null ? this.f52318e + Z7.f30794r : "");
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f52319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public HashSet<String> f52320b = new HashSet<>();

        b() {
        }
    }

    public h() {
        super(g.f53141o, f52311x, false);
        this.av = new HashMap();
        j();
        l();
        m();
    }

    private static String a(a aVar) {
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(aVar.f52314a)) {
            sb2.append(aVar.f52314a);
        }
        sb2.append(ImpressionLog.Q);
        if (!TextUtils.isEmpty(aVar.f52316c)) {
            sb2.append(aVar.f52316c);
        }
        sb2.append(ImpressionLog.Q);
        if (!TextUtils.isEmpty(aVar.f52315b)) {
            sb2.append(aVar.f52315b);
        }
        sb2.append(ImpressionLog.Q);
        if (!TextUtils.isEmpty(aVar.f52317d)) {
            sb2.append(aVar.f52317d);
        }
        sb2.append(ImpressionLog.Q);
        if (!TextUtils.isEmpty(aVar.f52318e)) {
            sb2.append(aVar.f52318e);
        }
        Logger.d(f52311x, "generate ad id AKS - generated ad id = " + ((Object) sb2));
        return sb2.toString();
    }

    private static String a(Map<String, String> map, String str) {
        for (String str2 : map.keySet()) {
            str = str.replace(f52301d + str2 + f52302e, map.get(str2));
        }
        return str;
    }

    private static String a(JSONObject jSONObject) {
        String strC = null;
        if (jSONObject.has("only_impression_url")) {
            try {
                strC = k.c(jSONObject.getString("only_impression_url"), "k");
            } catch (JSONException e10) {
                Logger.d(f52311x, "get onlyImpressionUrl identifier from prefetch - exception= " + e10);
            }
        }
        Logger.d(f52311x, "get onlyImpressionUrl identifier from prefetch - only impression url identifier= " + strC);
        return strC;
    }

    private String a(JSONObject jSONObject, Map<String, String> map, Map<String, String> map2) {
        Logger.d(f52311x, "get click url - started");
        String strA = null;
        try {
            String string = jSONObject.getString("click_url");
            Logger.d(f52311x, "get click url - click url from ad object= " + string);
            if (string.isEmpty() && jSONObject.has("cam_html")) {
                String strN = n(jSONObject.getString("cam_html"));
                if (strN != null) {
                    string = strN;
                }
                Logger.d(f52311x, "get click url - click url from dsp ad= " + string);
            }
            if (!string.contains(f52301d) || !string.contains(f52302e)) {
                return string;
            }
            strA = a(map2, a(map, string));
            Logger.d(f52311x, "get click url - click url after replacing place holders= " + strA);
            return strA;
        } catch (JSONException e10) {
            Logger.d(f52311x, "get click url - exception while extracting click url. exception= " + e10);
            return strA;
        }
    }

    private static String a(JSONObject jSONObject, JSONArray jSONArray, BrandSafetyUtils.AdType adType) {
        Logger.d(f52311x, "generate downstream struct - started");
        String str = "";
        String strOptString = jSONObject.optString("mof_template_url", null);
        if (!TextUtils.isEmpty(strOptString) && strOptString.contains(f52285ag)) {
            str = "" + f52286ah;
            Logger.d(f52311x, "generate downstream struct - downstreamStruct added= choose_from_two");
        }
        if (b(jSONObject, jSONArray, adType)) {
            str = str + "/multiple_ads";
            Logger.d(f52311x, "generate downstream struct - downstreamStruct added= /multiple_ads");
        }
        String str2 = str.isEmpty() ? null : "";
        Logger.d(f52311x, "generate downstream struct - final downstreamStruct= " + str2);
        return str2;
    }

    private List<CreativeInfo> a(JSONObject jSONObject, CreativeInfo creativeInfo) {
        String strI;
        BrandSafetyUtils.AdType adTypeK;
        Logger.d(f52311x, "generate CI - started");
        ArrayList arrayList = new ArrayList();
        Map<String, String> mapI = i(jSONObject);
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("ads");
            Logger.d(f52311x, "generate CI - ads size= " + jSONArray.length());
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                Logger.d(f52311x, "generate CI - Looping over ad index= " + i10);
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                Map<String, String> mapH = h(jSONObject2.optJSONObject("aks"));
                a aVarB = b(jSONObject2, mapI, mapH);
                String strA = a(aVarB);
                Logger.d(f52311x, "generate CI - adId= " + strA);
                if (creativeInfo == null) {
                    Pair<String, BrandSafetyUtils.AdType> pairF = f(jSONObject);
                    String str = (String) pairF.first;
                    adTypeK = (BrandSafetyUtils.AdType) pairF.second;
                    strI = str;
                } else {
                    strI = creativeInfo.I();
                    adTypeK = creativeInfo.K();
                }
                Logger.d(f52311x, "generate CI - adFormat= " + strI + " BrandSafety adType= " + adTypeK);
                String string = jSONObject2.getString("id");
                Logger.d(f52311x, "generate CI - creativeId= " + string);
                String strA2 = a(jSONObject2, mapI, mapH);
                Logger.d(f52311x, "generate CI - clickUrl= " + strA2);
                String strS = s(jSONObject2.getString("video_url"));
                Logger.d(f52311x, "generate CI - videoUrl= " + strS);
                String string2 = jSONObject2.getString("image_url");
                Logger.d(f52311x, "generate CI - imageUrl= " + string2);
                String string3 = jSONObject.getString("end_screen_url");
                Logger.d(f52311x, "generate CI - endScreenUrl= " + string3);
                String strC = k.c(string3, "unit_id");
                Logger.d(f52311x, "generate CI - placementId= " + strC);
                String strA3 = a(jSONObject, jSONArray, adTypeK);
                Logger.d(f52311x, "generate CI - downstreamStruct= " + strA3);
                String string4 = jSONObject2.getString("package_name");
                Logger.d(f52311x, "generate CI - packageName= " + string4);
                MintegralCreativeInfo mintegralCreativeInfo = new MintegralCreativeInfo(strA, adTypeK, string, strA2, strS, string2, strI, strC, this.f52211t, strA3, false, string4);
                Logger.d(f52311x, "generate CI - creativeInfo created= " + mintegralCreativeInfo);
                mintegralCreativeInfo.I(aVarB.f52314a);
                Logger.d(f52311x, "generate CI - setting creativeInfo k field= " + aVarB.f52314a);
                if (creativeInfo != null) {
                    mintegralCreativeInfo.s(creativeInfo.Q());
                }
                a(mintegralCreativeInfo, jSONObject2, string2);
                arrayList.add(mintegralCreativeInfo);
                a(mintegralCreativeInfo, adTypeK, jSONObject, jSONArray);
                a(mintegralCreativeInfo, jSONObject, i10);
                a((CreativeInfo) mintegralCreativeInfo, jSONObject2);
            }
        } catch (JSONException e10) {
            Logger.d(f52311x, "generate CI - could not extract ads array, exception= " + e10);
        }
        return arrayList;
    }

    private static void a(CreativeInfo creativeInfo, BrandSafetyUtils.AdType adType, JSONObject jSONObject, JSONArray jSONArray) {
        if (!adType.equals(BrandSafetyUtils.AdType.INTERSTITIAL) || jSONArray.length() <= 1) {
            return;
        }
        String strOptString = jSONObject.optString("mof_template_url");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        Logger.d(f52311x, "set mof template url - adding mofTemplateYrl to debug info= " + strOptString);
        creativeInfo.u("mofTemplateUrl:" + strOptString);
    }

    public static void a(CreativeInfo creativeInfo, String str, String str2) {
        JSONObject jSONObjectOptJSONObject;
        Logger.d(f52311x, "handle dsp recommendations prefetch - started, url= " + str);
        Logger.d(f52311x, "handle dsp recommendations prefetch - bufferValue= " + str2);
        if (creativeInfo == null || str == null || str2 == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (jSONObject == null) {
                Logger.d(f52311x, "handle dsp recommendations prefetch - not a valid JSON string");
            } else if (jSONObject.getInt("status") == 1 && (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) != null && c(jSONObjectOptJSONObject)) {
                Logger.d(f52311x, "handle dsp recommendations prefetch - buffer is recommendations prefetch, calling handleRecommendationsPrefetch");
                c(creativeInfo, jSONObjectOptJSONObject);
            }
        } catch (JSONException e10) {
            Logger.d(f52311x, "handle dsp recommendations prefetch - not a valid JSON string, exception= ", e10);
        } catch (Throwable th2) {
            Logger.d(f52311x, "handle dsp recommendations prefetch - encountered exception, ", th2);
        }
    }

    private void a(CreativeInfo creativeInfo, JSONObject jSONObject) {
        try {
            if (jSONObject.has("ad_tracking")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("ad_tracking");
                if (jSONObject2.has("impression")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("impression");
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        creativeInfo.x(jSONArray.getString(i10));
                    }
                }
            }
        } catch (JSONException e10) {
            Logger.d(f52311x, "add impression tracking URLs - could not extract impression urls, exception= " + e10);
        }
    }

    private static void a(CreativeInfo creativeInfo, JSONObject jSONObject, String str) {
        Logger.d(f52311x, "extract and classify urls - started");
        ArrayList<String> arrayListG = k.g(jSONObject.toString().replace("\\/", "/"));
        arrayListG.remove(q(str));
        Logger.d(f52311x, "extract and classify urls - prefetchResourcesList= " + arrayListG);
        creativeInfo.b((List<String>) arrayListG);
    }

    private static void a(MintegralCreativeInfo mintegralCreativeInfo, JSONObject jSONObject, int i10) {
        ArrayList<b> arrayListJ;
        String strOptString = jSONObject.optString("mof_template_url", null);
        if (TextUtils.isEmpty(strOptString) || !strOptString.contains(f52285ag) || (arrayListJ = j(jSONObject)) == null || arrayListJ.size() != 2) {
            return;
        }
        b bVar = arrayListJ.get(1 - i10);
        mintegralCreativeInfo.b(bVar.f52319a, bVar.f52320b);
        Logger.d(f52311x, "add choose ad recommendations - updating creative info recommendations= " + bVar);
    }

    private void a(String str, JSONObject jSONObject) {
        Throwable th2;
        CreativeInfo creativeInfoRemove;
        if (E.contains(str)) {
            Logger.d(f52311x, "handle complementary prefetch - url already handled= " + str);
            return;
        }
        Logger.d(f52311x, "handle complementary prefetch - started, url= " + str);
        CreativeInfo creativeInfoD = null;
        try {
            String strC = k.c(str, f52288aj);
            Logger.d(f52311x, "handle complementary prefetch - " + strC);
            if (strC == null) {
                return;
            }
            String string = new JSONObject(strC).getString(f52289ak);
            Logger.d(f52311x, "handle complementary prefetch - recommendation request ID= " + string);
            if (TextUtils.isEmpty(string) || (creativeInfoRemove = B.remove(string)) == null) {
                return;
            }
            try {
                Logger.d(f52311x, "handle complementary prefetch - ci found by request ID= " + creativeInfoRemove);
                if (g(jSONObject)) {
                    Logger.d(f52311x, "handle complementary prefetch - ads data is recommendation, calling handleRecommendationsPrefetch");
                    creativeInfoD = c(creativeInfoRemove, jSONObject);
                } else if (creativeInfoRemove.K() == BrandSafetyUtils.AdType.INTERSTITIAL) {
                    Logger.d(f52311x, "handle complementary prefetch - ads data is two or less, ad type is fullscreen, calling handleRecommendationsPrefetch");
                    creativeInfoD = d(creativeInfoRemove, jSONObject);
                } else {
                    Logger.d(f52311x, "handle complementary prefetch - ads data is second (multi) ad, calling handleSecondMultiAd");
                    b(creativeInfoRemove, jSONObject);
                    creativeInfoD = creativeInfoRemove;
                }
                E.add(str);
                return;
            } catch (Throwable th3) {
                th2 = th3;
                creativeInfoD = creativeInfoRemove;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
        Logger.d(f52311x, "handle complementary prefetch - exception= " + th2.getMessage(), th2);
        if (creativeInfoD != null) {
            creativeInfoD.u("rec_ex(" + k.e() + "):" + th2.getMessage() + ImpressionLog.Q);
        }
    }

    private static void a(List<CreativeInfo> list, JSONObject jSONObject) {
        for (CreativeInfo creativeInfo : list) {
            if (creativeInfo instanceof MintegralCreativeInfo) {
                MintegralCreativeInfo mintegralCreativeInfo = (MintegralCreativeInfo) creativeInfo;
                String strI = mintegralCreativeInfo.I();
                if (strI == null || !strI.equals(BrandSafetyEvent.AdFormatType.BANNER.toString())) {
                    Logger.d(f52311x, "save creative info - adding interstitial CI, ID: " + creativeInfo.L() + ", new map size= " + D.size());
                    C.put(creativeInfo.L(), creativeInfo);
                } else {
                    String strB = b(jSONObject);
                    boolean z10 = false;
                    if (strB != null) {
                        mintegralCreativeInfo.a(strB);
                        D.put(strB, mintegralCreativeInfo);
                        Logger.d(f52311x, "save creative info - banner/MREC CI saved to bannerRequestIdToCiMap using request ID= " + strB + ", new map size= " + D.size());
                        z10 = true;
                    }
                    String strA = a(jSONObject);
                    if (strA != null) {
                        mintegralCreativeInfo.H(strA);
                        D.put(strA, creativeInfo);
                        Logger.d(f52311x, "save creative info - banner/MREC CI saved to bannerRequestIdToCiMap using onlyImpressionUrlIdentifier= " + strA + ", new map size= " + D.size());
                        z10 = true;
                    }
                    if (!z10) {
                        Logger.d(f52311x, "save creative info - banner/MREC could NOT be saved! ci id= " + mintegralCreativeInfo.L());
                    }
                }
                B.put(mintegralCreativeInfo.aj(), creativeInfo);
                Logger.d(f52311x, "save creative info - adding CI to k map, key: " + mintegralCreativeInfo.aj() + ", new map size: " + B.size());
            }
        }
    }

    private static a b(JSONObject jSONObject, Map<String, String> map, Map<String, String> map2) {
        a aVar;
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("aks");
            String string = jSONObject.has("impression_url") ? jSONObject.getString("impression_url") : null;
            Logger.d(f52311x, "generate AKS from ad prefetch - impression url template: " + string);
            if (jSONObjectOptJSONObject == null) {
                if (string.contains(f52301d) && string.contains(f52302e)) {
                    string = a(map2, a(map, string));
                }
                return t(string);
            }
            aVar = new a();
            try {
                if (jSONObjectOptJSONObject.has("k")) {
                    aVar.f52314a = jSONObjectOptJSONObject.getString("k");
                }
                if (jSONObjectOptJSONObject.has("q")) {
                    aVar.f52316c = jSONObjectOptJSONObject.getString("q");
                }
                if (jSONObjectOptJSONObject.has("r")) {
                    aVar.f52315b = jSONObjectOptJSONObject.getString("r");
                }
                if (jSONObjectOptJSONObject.has("al")) {
                    aVar.f52317d = jSONObjectOptJSONObject.getString("al");
                }
                if (!jSONObjectOptJSONObject.has("csp")) {
                    return aVar;
                }
                aVar.f52318e = jSONObjectOptJSONObject.getString("csp");
                return aVar;
            } catch (JSONException e10) {
                e = e10;
                Logger.d(f52311x, "generate AKS from ad prefetch - exception while generating AKS from ad data. exception= " + e);
                return aVar;
            }
        } catch (JSONException e11) {
            e = e11;
            aVar = null;
        }
    }

    private static String b(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("req_ext_data");
        String strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString(U) : null;
        Logger.d(f52311x, "get requestId from prefetch - request id= " + strOptString);
        return strOptString;
    }

    private void b(CreativeInfo creativeInfo, JSONObject jSONObject) {
        Logger.d(f52311x, "handle second multi ad - started, firstCI= " + creativeInfo);
        Logger.d(f52311x, "handle second multi ad - calling generateCI");
        List<CreativeInfo> listA = a(jSONObject, creativeInfo);
        if (listA.isEmpty()) {
            Logger.d(f52311x, "handle second multi ad - could not generate second CI");
            return;
        }
        Logger.d(f52311x, "handle second multi ad - CIs generated= " + listA);
        creativeInfo.a(ImpressionLog.f51732b, new ImpressionLog.a[0]);
        creativeInfo.ai();
        String str = ((creativeInfo.h() != null ? creativeInfo.h() : "") + (creativeInfo.Q().equals(g.f53141o) ? CreativeInfo.aJ : f52287ai)) + CreativeInfo.aH + (listA.size() + 1);
        creativeInfo.c(str);
        c(creativeInfo);
        Logger.d(f52311x, "handle second multi ad - updating downstream struct of first CI to= " + str);
        BannerFinder bannerFinderZ = SafeDK.getInstance().z();
        Logger.d(f52311x, "handle second multi ad - calling setMintegralMultiAdUuid");
        bannerFinderZ.a(creativeInfo);
        for (CreativeInfo creativeInfo2 : listA) {
            creativeInfo2.f(creativeInfo.m());
            creativeInfo2.b(new ArrayList<>(creativeInfo.q()));
            creativeInfo2.ai();
            creativeInfo2.c(creativeInfo.h());
            creativeInfo2.h(creativeInfo.F());
            creativeInfo2.b(creativeInfo.af(), creativeInfo.ae());
            creativeInfo2.s(creativeInfo.Q());
            k.b(f52311x, "handle second multi ad - finished updating second CI, calling setCreativeInAdFinder. second CI= " + creativeInfo2);
            CreativeInfoManager.a(creativeInfo2, creativeInfo.V(), creativeInfo.U());
        }
    }

    private void b(JSONObject jSONObject, String str, String str2) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(f52297as);
            Logger.d(f52311x, "handle dsp fullScreen recommendations - jsonArray= " + jSONArrayOptJSONArray);
            if (jSONArrayOptJSONArray != null) {
                List<CreativeInfo> listG = g(str, str2);
                Logger.d(f52311x, "handle dsp fullScreen recommendations - found CIs= " + listG);
                for (CreativeInfo creativeInfo : listG) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10;
                        if (i11 < jSONArrayOptJSONArray.length()) {
                            String str3 = (String) jSONArrayOptJSONArray.get(i11);
                            Logger.d(f52311x, "handle dsp fullScreen recommendations - removing image from webView resources: " + str3);
                            creativeInfo.G(str3);
                            i10 = i11 + 1;
                        }
                    }
                }
            }
        } catch (JSONException e10) {
            Logger.d(f52311x, "handle dsp fullScreen recommendations - exception= " + e10);
        }
    }

    private static boolean b(JSONObject jSONObject, JSONArray jSONArray, BrandSafetyUtils.AdType adType) {
        boolean z10 = false;
        if (adType != null) {
            try {
                if (adType.equals(BrandSafetyUtils.AdType.INTERSTITIAL) && jSONArray.length() > 1 && jSONObject.has("mof_template_url") && jSONObject.getString("mof_template_url").contains(f52303f)) {
                    z10 = true;
                }
                Logger.d(f52311x, "is inter multi - returning= " + z10);
            } catch (JSONException e10) {
                Logger.d(f52311x, "is inter multi - exception while checking if ad is multi. exception= " + e10);
            }
        }
        return z10;
    }

    private static CreativeInfo c(CreativeInfo creativeInfo, JSONObject jSONObject) {
        Logger.d(f52311x, "handle recommendations prefetch - started");
        if (creativeInfo.Q().equals(g.f53141o)) {
            creativeInfo = d(creativeInfo);
        }
        ArrayList<b> arrayListJ = j(jSONObject);
        for (b bVar : arrayListJ) {
            creativeInfo.a(bVar.f52319a, bVar.f52320b);
            k.b(f52311x, "handle recommendations prefetch - added recommendation= " + bVar.f52319a + ", resource list= " + bVar.f52320b);
        }
        creativeInfo.ay = true;
        creativeInfo.u("added_recs (" + k.e() + "):" + arrayListJ.size());
        return creativeInfo;
    }

    private static void c(CreativeInfo creativeInfo) {
        String strH = creativeInfo.h();
        if (strH != null) {
            creativeInfo.c(strH.replace("/multiple_ads", ""));
        }
    }

    private static boolean c(JSONObject jSONObject) {
        boolean z10 = d(jSONObject) == f52283ae;
        Logger.d(f52311x, "is complementary prefetch - returning= " + z10);
        return z10;
    }

    private static int d(JSONObject jSONObject) {
        return jSONObject.optInt("ad_type", -1);
    }

    private static CreativeInfo d(CreativeInfo creativeInfo) {
        CreativeInfo creativeInfoI;
        n nVarK = SafeDK.getInstance().y().k(creativeInfo.Q());
        if (nVarK == null || (creativeInfoI = nVarK.i()) == null || creativeInfo == creativeInfoI || !creativeInfo.L().equals(creativeInfoI.L())) {
            return creativeInfo;
        }
        Logger.d(f52311x, "get current displaying Ci - found currently displayed instance= " + creativeInfo);
        return creativeInfoI;
    }

    private static CreativeInfo d(CreativeInfo creativeInfo, JSONObject jSONObject) {
        Logger.d(f52311x, "handle inter second prefetch - started");
        if (creativeInfo.Q().equals(g.f53141o)) {
            creativeInfo = d(creativeInfo);
        }
        for (b bVar : j(jSONObject)) {
            creativeInfo.a(bVar.f52319a, new HashSet());
            k.b(f52311x, "handle inter second prefetch - added recommendation= " + bVar.f52319a);
        }
        creativeInfo.ay = true;
        String strH = creativeInfo.h() != null ? creativeInfo.h() : "";
        if (!strH.contains("/multiple_ads")) {
            creativeInfo.c(strH + "/multiple_ads");
        }
        return creativeInfo;
    }

    private static boolean e(JSONObject jSONObject) {
        int iD = d(jSONObject);
        boolean z10 = iD == 287 || iD == 94 || iD == f52282ad || iD == f52283ae;
        Logger.d(f52311x, "is supported ad type - returning= " + z10);
        return z10;
    }

    private static Pair<String, BrandSafetyUtils.AdType> f(JSONObject jSONObject) {
        BrandSafetyUtils.AdType adType;
        String string;
        Logger.d(f52311x, "generate brandSafety ad type and format - started");
        int iD = d(jSONObject);
        if (iD == 287) {
            string = BrandSafetyEvent.AdFormatType.INTER.toString();
            adType = BrandSafetyUtils.AdType.INTERSTITIAL;
        } else {
            adType = null;
            string = null;
        }
        if (iD == 94) {
            string = BrandSafetyEvent.AdFormatType.REWARD.toString();
            adType = BrandSafetyUtils.AdType.INTERSTITIAL;
        }
        if (iD == f52282ad) {
            string = BrandSafetyEvent.AdFormatType.BANNER.toString();
            adType = BrandSafetyUtils.AdType.BANNER;
        }
        return new Pair<>(string, adType);
    }

    private List<CreativeInfo> g(String str, String str2) {
        Iterator<com.safedk.android.analytics.brandsafety.b> it = SafeDK.getInstance().x().values().iterator();
        while (it.hasNext()) {
            List<CreativeInfo> listA = it.next().a(str, str2);
            if (listA != null && !listA.isEmpty()) {
                return listA;
            }
        }
        return new ArrayList();
    }

    private static boolean g(JSONObject jSONObject) {
        boolean z10 = false;
        if (jSONObject != null) {
            try {
                if (jSONObject.getJSONArray("ads").length() > 2) {
                    z10 = true;
                }
            } catch (JSONException e10) {
            }
        }
        Logger.d(f52311x, "is recommendations prefetch - returning= " + z10);
        return z10;
    }

    private static Map<String, String> h(JSONObject jSONObject) {
        HashMap map = new HashMap();
        if (jSONObject != null) {
            try {
                if (jSONObject.has("k")) {
                    map.put("k", jSONObject.getString("k"));
                }
                if (jSONObject.has("q")) {
                    map.put("q", jSONObject.getString("q"));
                }
                if (jSONObject.has("r")) {
                    map.put("r", jSONObject.getString("r"));
                }
                if (jSONObject.has("al")) {
                    map.put("al", jSONObject.getString("al"));
                }
                if (jSONObject.has("csp")) {
                    map.put("csp", jSONObject.getString("csp"));
                }
            } catch (JSONException e10) {
                Logger.d(f52311x, "generate ad level place holders map - exception while generating adLevelPlaceHoldersMap. exception= " + e10);
            }
        }
        return map;
    }

    private static Map<String, String> i(JSONObject jSONObject) {
        Map<String, String> map = new HashMap<>();
        try {
            if (jSONObject.has("rks")) {
                map = com.safedk.android.utils.d.a(jSONObject.getJSONObject("rks"));
                if (jSONObject.has("a")) {
                    map.put("a", jSONObject.getString("a"));
                }
                if (jSONObject.has("b")) {
                    map.put("b", jSONObject.getString("b"));
                }
                if (jSONObject.has("c")) {
                    map.put("c", jSONObject.getString("c"));
                }
            }
        } catch (JSONException e10) {
            Logger.d(f52311x, "generate prefetch level place holders map - exception while generating prefetchLevelPlaceHoldersMap. exception= " + e10);
        }
        return map;
    }

    private static ArrayList<b> j(JSONObject jSONObject) {
        ArrayList<b> arrayList = new ArrayList<>();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("ads");
            Logger.d(f52311x, "generate recommendations - number of recommendations= " + jSONArray.length());
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                b bVar = new b();
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                bVar.f52319a = jSONObject2.getString("package_name");
                bVar.f52320b.addAll(k.g(jSONObject2.toString().replace("\\/", "/")));
                Logger.d(f52311x, "generate recommendations - generating recommendation num " + i10 + ". packageName= " + bVar.f52319a + ", resources= " + bVar.f52320b);
                arrayList.add(bVar);
            }
        } catch (JSONException e10) {
            Logger.d(f52311x, "generate recommendations - exception while generating recommendations. exception= " + e10);
        }
        return arrayList;
    }

    private void j() {
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_BIDDING_INTERSTITIAL_IMPRESSION_MATCHING_BY_MAX, true);
        this.f52208p.b(AdNetworkConfiguration.SHOULD_EXTRACT_AD_ID_FROM_BANNER_WEB_VIEW, true);
        this.f52208p.b(AdNetworkConfiguration.SHOULD_REPORT_AD_ID_ON_CI_CREATION, false);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION, true);
        this.f52208p.b(AdNetworkConfiguration.SHOULD_IGNORE_BANNER_MULTI_AD_DID_CLICK_EVENT, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_EOV, true);
        this.f52208p.b(AdNetworkConfiguration.SET_AD_FORMAT_FROM_APPLOVIN_BUNDLE, true);
    }

    private void l() {
        this.av.put("+", "X");
        this.av.put("/", "u");
        this.av.put("0", "i");
        this.av.put("1", "6");
        this.av.put("2", "1");
        this.av.put(ExifInterface.GPS_MEASUREMENT_3D, "k");
        this.av.put("4", "e");
        this.av.put(CampaignEx.CLICKMODE_ON, ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        this.av.put("6", InneractiveMediationDefs.GENDER_FEMALE);
        this.av.put(Gc.f29437e, RequestConfiguration.MAX_AD_CONTENT_RATING_G);
        this.av.put("8", "r");
        this.av.put("9", "4");
        this.av.put(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "z");
        this.av.put("B", VastAttributes.VERTICAL_POSITION);
        this.av.put("C", "/");
        this.av.put("D", "Y");
        this.av.put(ExifInterface.LONGITUDE_EAST, "o");
        this.av.put("F", "2");
        this.av.put(RequestConfiguration.MAX_AD_CONTENT_RATING_G, "O");
        this.av.put("H", "Z");
        this.av.put("I", "8");
        this.av.put("J", "d");
        this.av.put("K", "9");
        this.av.put("L", "a");
        this.av.put("M", "w");
        this.av.put("N", "Q");
        this.av.put("O", Gc.f29437e);
        this.av.put("P", CampaignEx.CLICKMODE_ON);
        this.av.put("Q", "l");
        this.av.put("R", "I");
        this.av.put(ExifInterface.LATITUDE_SOUTH, "B");
        this.av.put("T", "0");
        this.av.put("U", "j");
        this.av.put(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "U");
        this.av.put(ExifInterface.LONGITUDE_WEST, "L");
        this.av.put("X", "v");
        this.av.put("Y", "b");
        this.av.put("Z", ExifInterface.LATITUDE_SOUTH);
        this.av.put("a", "D");
        this.av.put("b", ExifInterface.GPS_MEASUREMENT_3D);
        this.av.put("c", "F");
        this.av.put("d", "H");
        this.av.put("e", VastAttributes.HORIZONTAL_POSITION);
        this.av.put(InneractiveMediationDefs.GENDER_FEMALE, "N");
        this.av.put("g", "n");
        this.av.put("h", "c");
        this.av.put("i", "M");
        this.av.put("j", ExifInterface.LONGITUDE_EAST);
        this.av.put("k", ExifInterface.LONGITUDE_WEST);
        this.av.put("l", "g");
        this.av.put(InneractiveMediationDefs.GENDER_MALE, "+");
        this.av.put("n", "T");
        this.av.put("o", "C");
        this.av.put("p", "K");
        this.av.put("q", "q");
        this.av.put("r", InneractiveMediationDefs.GENDER_MALE);
        this.av.put("s", "s");
        this.av.put("t", "h");
        this.av.put("u", "p");
        this.av.put("v", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
        this.av.put("w", "t");
        this.av.put(VastAttributes.HORIZONTAL_POSITION, "R");
        this.av.put(VastAttributes.VERTICAL_POSITION, "P");
        this.av.put("z", "J");
        this.av.put("=", "=");
    }

    private void m() {
        try {
            if (CreativeInfoManager.f51983q) {
                B = new ConcurrentHashMap();
                C = new ConcurrentHashMap();
                D = new ConcurrentHashMap();
            } else {
                B = new PersistentConcurrentHashMap("MintegralDiscovery_kToCInfo");
                Logger.d(f52311x, "generate collections - k to Ci info loaded, keyset=" + B.keySet());
                C = new PersistentConcurrentHashMap("MintegralDiscovery_adIdToCInfo");
                Logger.d(f52311x, "generate collections - ad ID to Ci info loaded, keyset=" + C.keySet());
                D = new PersistentConcurrentHashMap("MintegralDiscovery_bannerRequestIdToCiMap");
                Logger.d(f52311x, "generate collections - banner request ID to Co info loaded, keyset=" + D.keySet());
            }
        } catch (InvalidParameterException e10) {
            Logger.e(f52311x, "generate collections - error initializing caching will not be available", e10);
        }
    }

    public static String r(String str) {
        a aVarT = t(str);
        String strA = aVarT != null ? a(aVarT) : null;
        Logger.d(f52311x, "generate ad id String - generated ad id= " + strA);
        return strA;
    }

    private String s(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < str.length(); i10++) {
            stringBuffer.append(this.av.get(str.substring(i10, i10 + 1)));
        }
        return new String(Base64.decode(stringBuffer.toString(), 0));
    }

    private static a t(String str) {
        try {
            a aVar = new a();
            Map<String, String> mapB = k.b(str, false);
            aVar.f52314a = mapB.get("k");
            aVar.f52316c = mapB.get("q");
            aVar.f52315b = mapB.get("r");
            aVar.f52317d = mapB.get("al");
            aVar.f52318e = mapB.get("csp");
            Logger.d(f52311x, "generate AKS from impression url - generated AKS data= " + aVar);
            return aVar;
        } catch (Throwable th2) {
            Logger.d(f52311x, "generate AKS from impression url - exception while generating AKS from url " + str + ",  exception= " + th2.getMessage());
            return null;
        }
    }

    private static boolean u(String str) {
        boolean z10;
        Iterator<String> it = A.iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            if (str.contains(it.next())) {
                z10 = true;
                break;
            }
        }
        Logger.d(f52311x, "should follow url - returning= " + z10 + ", url= " + str);
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo] */
    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo a(Object obj) {
        ?? ContainsKey;
        String str;
        String str2 = null;
        Logger.d(f52311x, "match info - started. ad instance= " + obj);
        if (obj == null) {
            Logger.d(f52311x, "match info - ad instance is null, returning.");
            return null;
        }
        try {
            str = (String) obj;
            k.b(f52311x, "match info - ad instance: " + obj + ", banner CI to ID map: " + D.keySet() + ", k to C info: " + B.keySet());
            ContainsKey = D.containsKey(str);
            try {
            } catch (Throwable th2) {
                th = th2;
                Logger.d(f52311x, "match info - exception: ", th);
            }
        } catch (Throwable th3) {
            th = th3;
            ContainsKey = str2;
        }
        if (ContainsKey != 0) {
            CreativeInfo creativeInfoRemove = D.remove(str);
            str2 = f52311x;
            Logger.d(f52311x, "match info -  CI MATCH FOUND! by request ID: " + str + ", CI: " + creativeInfoRemove.toString());
            ContainsKey = creativeInfoRemove;
        } else {
            if (!B.containsKey(str)) {
                Logger.d(f52311x, "match info - cannot find CI for ad id= " + str);
                ContainsKey = 0;
                return ContainsKey;
            }
            CreativeInfo creativeInfo = B.get(str);
            str2 = f52311x;
            Logger.d(f52311x, "match info - CI MATCH FOUND! by AKS key " + str + ", CI: " + creativeInfo.toString());
            ContainsKey = creativeInfo;
        }
        return ContainsKey;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        return null;
    }

    public void a(JSONObject jSONObject, String str, String str2) {
        try {
            String strOptString = jSONObject.optString("url");
            Logger.d(f52311x, "handle dsp banner complementary prefetch - url is dsp complementary url= " + strOptString);
            if (TextUtils.isEmpty(strOptString) || !(strOptString.contains(CreativeInfoManager.f51980n) || strOptString.contains(CreativeInfoManager.f51981o))) {
                Logger.d(f52311x, "handle dsp banner complementary prefetch - sdk field is empty or is Mintegral sdk, returning. sdk= " + str);
                return;
            }
            String strOptString2 = jSONObject.optString(au);
            if (TextUtils.isEmpty(strOptString2)) {
                Logger.d(f52311x, "handle dsp banner complementary prefetch - adsData field is null or empty, returning. adsDataString= " + strOptString2);
                return;
            }
            JSONObject jSONObject2 = new JSONObject(strOptString2);
            Logger.d(f52311x, "handle dsp banner complementary prefetch - responsePrefetch= " + jSONObject2);
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("data");
            Logger.d(f52311x, "handle dsp banner complementary prefetch - adsData= " + jSONObjectOptJSONObject);
            if (jSONObjectOptJSONObject != null) {
                for (CreativeInfo creativeInfoC : g(str, str2)) {
                    if (g(jSONObjectOptJSONObject)) {
                        Logger.d(f52311x, "handle dsp banner complementary prefetch - ads data is recommendation, calling handleRecommendationsPrefetch");
                        creativeInfoC = c(creativeInfoC, jSONObjectOptJSONObject);
                    } else {
                        Logger.d(f52311x, "handle dsp banner complementary prefetch - ads data is second (multi) ad, calling handleSecondMultiAd");
                        b(creativeInfoC, jSONObjectOptJSONObject);
                    }
                    c(creativeInfoC);
                }
            }
        } catch (JSONException e10) {
            Logger.d(f52311x, "handle dsp banner complementary prefetch - message is not a valid JSON. exception= " + e10);
        } catch (Exception e11) {
            Logger.d(f52311x, "handle dsp banner complementary prefetch - encountered exception= " + e11);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        Logger.d(f52311x, "get webView resource matching method - returning= " + AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP);
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String b(Object obj) {
        int iIdentityHashCode = System.identityHashCode(obj);
        Logger.d(f52311x, "get creative info after media player start call - player id= " + iIdentityHashCode);
        return c((String) null, String.valueOf(iIdentityHashCode));
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<CreativeInfo> b(String str, String str2, Map<String, List<String>> map, c.a aVar) throws JSONException {
        JSONObject jSONObject;
        k.b(f52311x, "generate info - started, url: " + str + ", buffer = " + str2 + ", maxParams = " + aVar);
        try {
            jSONObject = new JSONObject(str2);
        } catch (JSONException e10) {
            Logger.d(f52311x, "generate info - not a valid JSON string: " + e10.getMessage());
            jSONObject = null;
        } catch (Throwable th2) {
            Logger.d(f52311x, "generate info - not a valid JSON string: " + th2.getMessage(), th2);
            jSONObject = null;
        }
        if (jSONObject == null) {
            Logger.d(f52311x, "generate info - obj is null, skipping.");
            return null;
        }
        int i10 = jSONObject.getInt("status");
        if (i10 != 1) {
            Logger.d(f52311x, "generate info - status is not okay, skipping. status= " + i10);
            return null;
        }
        if (!jSONObject.has("data")) {
            Logger.d(f52311x, "generate info - JSON object does not contain a 'data' key. this is not s prefetch");
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (!e(jSONObject2)) {
            Logger.d(f52311x, "generate info - invalid ad type= " + d(jSONObject2));
            return null;
        }
        if (c(jSONObject2)) {
            Logger.d(f52311x, "generate info - data object is complementary prefetch");
            a(str, jSONObject2);
            return null;
        }
        List<CreativeInfo> listA = a(jSONObject2, (CreativeInfo) null);
        a(listA, jSONObject2);
        return listA;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean b(String str, Bundle bundle) {
        boolean zU = u(str);
        Logger.d(f52311x, "should follow input stream Iimpl - returning= " + zU + ", url= " + str);
        return zU;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String c(View view) {
        Logger.d(f52311x, "get ad id from view - view class= " + view.getClass().getName());
        try {
        } catch (Throwable th2) {
            Logger.d(f52311x, "get ad id from view - exception= " + th2.getMessage(), th2);
        }
        if (!(view instanceof MBBannerView)) {
            Logger.d(f52311x, "get ad id from view - v is not of the expected type (actual is " + view.getClass().getName() + ")");
            return null;
        }
        MBBannerView mBBannerView = (MBBannerView) view;
        Logger.d(f52311x, "get ad id from view - mbBannerView request ID is " + mBBannerView.getRequestId());
        return mBBannerView.getRequestId();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String c(String str, String str2) {
        Logger.d(f52311x, "get ad id from resource - started, value: " + str + ", ad ID:" + str2);
        if (str2 != null && !str2.startsWith("http")) {
            CreativeInfo creativeInfoRemove = C.remove(str2);
            if (creativeInfoRemove != null) {
                k.b(f52311x, "get ad id from resource - found ad ID: " + str2 + " CI: " + creativeInfoRemove);
                return creativeInfoRemove.L();
            }
            Logger.d(f52311x, "get ad id from resource - missing ID: " + str2);
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public Set<String> c() {
        return new HashSet();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean e(String str) {
        Logger.d(f52311x, "should ignore redirect url - ignoring redirect url: " + str);
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String f() {
        return F;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean k(String str) {
        boolean zU = u(str);
        Logger.d(f52311x, "should follow get url impl - returning= " + zU + ", url= " + str);
        return zU;
    }

    public void l(String str) {
        Logger.d(f52311x, "handle dsp complementary prefetch - started. message= " + str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            Logger.d(f52311x, "handle dsp complementary prefetch - jsonObject= " + jSONObject);
            String strOptString = jSONObject.optString(f52293ao);
            Logger.d(f52311x, "handle dsp complementary prefetch - sdk= " + strOptString);
            String strOptString2 = jSONObject.optString(f52294ap);
            Logger.d(f52311x, "handle dsp complementary prefetch - webViewAddress= " + strOptString2);
            if (!TextUtils.isEmpty(strOptString) && !strOptString.equals(g.f53141o) && !TextUtils.isEmpty(strOptString2)) {
                String string = jSONObject.getString(f52295aq);
                Logger.d(f52311x, "handle dsp complementary prefetch - direction= " + string);
                if (TextUtils.isEmpty(string) || !string.equals(f52296ar)) {
                    Logger.d(f52311x, "handle dsp complementary prefetch - banner complementary, calling handleDspBannerComplementaryPrefetch");
                    a(jSONObject, strOptString, strOptString2);
                } else {
                    Logger.d(f52311x, "handle dsp complementary prefetch - full screen recommendations, calling handleDspFullScreenRecommendations");
                    b(jSONObject, strOptString, strOptString2);
                }
            }
        } catch (JSONException e10) {
            Logger.d(f52311x, "handle dsp complementary prefetch - message is not a valid JSON. exception= " + e10);
        } catch (Exception e11) {
            Logger.d(f52311x, "handle dsp complementary prefetch - encountered exception= " + e11);
        }
    }
}
