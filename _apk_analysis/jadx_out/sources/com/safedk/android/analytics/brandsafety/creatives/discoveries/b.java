package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.C3978d4;
import com.ironsource.Z7;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.f;
import com.safedk.android.analytics.brandsafety.creatives.infos.AdMobCreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b extends d {
    private static final String A = "pubid";
    private static final String B = "http";
    private static final String C = "intent";
    private static final String D = "market";
    private static final String E = "AdGroup+Creative+ID+0";
    private static final String H = "afma-sdk-a-v";
    private static final String I = "java.util.LinkedHashMap";
    private static final String J = "ignore_this_destination";
    private static final String K = "question";
    private static final String L = "longform_questions";
    private static final String M = "com.google.android.gms.ads.admanager.AdManagerAdView";
    private static final String N = "com.google.android.gms.ads.internal.overlay.g";
    private static final String O = "com.google.android.gms.ads.nativead.NativeAdView";
    private static final String P = "\\{background-image:url\\(([^)]+?)\\)";
    private static final String Q = "ad_json";
    private static final String R = "ads";
    private static final String S = "app_id";
    private static final String T = "headline";
    private static final String U = "image";
    private static final String V = "images";
    private static final String W = "thumbnails";
    private static final String X = "secondary_image";
    private static final String Y = "app_icon";
    private static final String Z = "tracking_urls_and_actions";

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private static final String f52099aa = "click_actions";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final String f52100ab = "impression_tracking_urls";

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private static final String f52101ac = "url";

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private static final String f52102ad = "u2_final_url";

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private static final String f52103ae = "body";

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private static final String f52104af = "call_to_action";

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private static final String f52105ag = "rating";

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    private static final String f52106ah = "type";

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    private static final String f52107ai = "advertiser";

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    private static final String f52108aj = "video";

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    private static final String f52109ak = "vast_xml";

    /* JADX INFO: renamed from: al, reason: collision with root package name */
    private static final String f52110al = "title:";

    /* JADX INFO: renamed from: am, reason: collision with root package name */
    private static final String f52111am = "mainImg:";

    /* JADX INFO: renamed from: an, reason: collision with root package name */
    private static final String f52112an = "icon:";

    /* JADX INFO: renamed from: ao, reason: collision with root package name */
    private static final String f52113ao = "body:";

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    private static final String f52114ap = "cta:";

    /* JADX INFO: renamed from: aq, reason: collision with root package name */
    private static final String f52115aq = "star:";

    /* JADX INFO: renamed from: ar, reason: collision with root package name */
    private static final String f52116ar = "advertiser:";

    /* JADX INFO: renamed from: as, reason: collision with root package name */
    private static final String f52117as = "tpc.googlesyndication.com/gpa_images/simgad/";

    /* JADX INFO: renamed from: at, reason: collision with root package name */
    private static final int f52118at = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f52119b = "appIcon:";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f52120c = "shortAppName:";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f52121d = "headline:";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f52122e = "description:";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f52123f = "image:";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f52124g = "ytId:";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f52125h = "/store";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f52126i = "/store/type2";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f52127j = "/brand";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f52128k = "destinationUrl";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f52129l = "AdMobDiscovery";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f52130w = "com.google.android.gms";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f52131x = "org.json.JSONObject";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f52132y = "ad_html";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f52133z = "clickUrl";
    private static final String F = "Backend+Query+ID";
    private static final String G = F.replace("+", "%2B");
    private static final String[] au = {"var url = 'https://googleads.g.doubleclick.net/dbm/ad?dbm_c=", "<div class=\"GoogleActiveViewInnerContainer\"", "src=\"https://googleads.g.doubleclick.net/xbbe/pixel?d", "googleInitIc(document.body"};

    private class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f52137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f52138b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f52139c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f52140d = true;

        a(String str, String str2, boolean z10) {
            this.f52137a = str;
            this.f52138b = str2;
            this.f52139c = z10;
        }

        public String toString() {
            return "resource: " + this.f52138b + ", element prefix: " + this.f52137a + ", should report as element= " + this.f52140d;
        }
    }

    public b() {
        super(g.f53134h, f52129l, false);
        this.f52208p.b(AdNetworkConfiguration.SHOULD_SCAN_OBJECT_USING_REFLECTION, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
        this.f52208p.b(AdNetworkConfiguration.APP_OPEN_IMPRESSION_TRACKING_ENABLED, true);
        this.f52208p.b(AdNetworkConfiguration.SHOULD_SCAN_INTERSTITIAL_VIEW_HIERARCHY_FOR_CI, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, true);
        this.f52208p.b(AdNetworkConfiguration.SHOULD_INJECT_JS_TO_WEBVIEWS_FOR_TEXT_EXTRACTION, false);
        this.f52208p.b(AdNetworkConfiguration.WEBVIEW_REPLACE_ON_AD_DISPLAY_FAIL, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_NATIVE_IMPRESSION_TRACKING, true);
    }

    private int a(List<Object> list) {
        Iterator<Object> it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Iterator<String> itKeys = ((JSONObject) it.next()).keys();
            while (itKeys.hasNext()) {
                if (itKeys.next().equals("clickUrl")) {
                    i10++;
                }
            }
        }
        Logger.d(f52129l, "generate info - clickUrlsCounter=" + i10);
        return i10;
    }

    private long a(View view, List<Object> list, List<String> list2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        a(view, new ArrayList(), list, new HashSet(), list2);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        k.b(f52129l, "generate info, travel time " + (jCurrentTimeMillis2 - jCurrentTimeMillis));
        return jCurrentTimeMillis2;
    }

    public static String a(int i10, String str, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
        String str2;
        String strA;
        List<Integer> listB = k.b(com.safedk.android.utils.f.U(), str);
        if (listB.isEmpty()) {
            str2 = f52126i;
            strA = str;
        } else {
            str2 = f52125h;
            strA = k.a(str.substring(listB.get(0).intValue()), 0);
        }
        if (strA != null) {
            List<Integer> listB2 = k.b(com.safedk.android.utils.f.T(), strA);
            if (listB2.size() >= i10) {
                for (int i11 = 0; i11 < i10; i11++) {
                    String strA2 = k.a(strA, listB2.get(i11).intValue());
                    list2.add(k.a(com.safedk.android.utils.f.R(), strA2, 1));
                    list3.add(k.a(com.safedk.android.utils.f.Q(), strA2, 1));
                    list4.add(k.a(com.safedk.android.utils.f.P(), strA2, 1));
                    list.add(k.a(Pattern.compile(k.a(com.safedk.android.utils.f.S(), strA2, 1) + P), str, 1));
                    list5.add(k.a(Pattern.compile(k.a(com.safedk.android.utils.f.O(), strA2, 1) + P), str, 1));
                }
                return str2;
            }
        }
        List<String> listB3 = k.b(com.safedk.android.utils.f.O(), str, 1);
        if (listB3.size() < i10) {
            return "";
        }
        for (int i12 = 0; i12 < i10; i12++) {
            list5.add(k.a(Pattern.compile(listB3.get(i12) + P), str, 1));
        }
        return f52127j;
    }

    private String a(String str, List<String> list, String str2, StringBuilder sb2) {
        String strReplaceAll;
        String strReplaceAll2 = str.replaceAll("<script\\b[^>]*>[\\s\\S]*?<\\/script\\b[^>]*>", "");
        k.b(f52129l, "generate info, sanitized html is: " + strReplaceAll2);
        Matcher matcher = com.safedk.android.utils.f.ad().matcher(strReplaceAll2);
        while (matcher.find()) {
            if (matcher.groupCount() > 1 && (strReplaceAll = matcher.group(2).replace("<br>", Z7.f30794r).replaceAll("<[^>]*>", "")) != null && strReplaceAll.length() > 0) {
                Logger.d(f52129l, "generate info, found ad text: " + strReplaceAll + ", decoded: " + k.k(strReplaceAll));
                list.add(k.k(strReplaceAll));
            }
            str2 = "text";
            sb2.append("text");
            sb2.append(C3978d4.j.f31381c);
            if (k.d(com.safedk.android.utils.f.aa(), str)) {
                str2 = "image";
                sb2.append("image");
                sb2.append(C3978d4.j.f31381c);
            }
        }
        return str2;
    }

    public static List<String> a(String str, boolean z10) {
        ArrayList arrayList = new ArrayList();
        List<String> listA = z10 ? com.safedk.android.analytics.brandsafety.creatives.d.a(com.safedk.android.utils.f.af(), str, 1, 2, false) : com.safedk.android.analytics.brandsafety.creatives.d.a(com.safedk.android.utils.f.ae(), str, 1, 2, false);
        Logger.d(f52129l, "extract creative ids - the values are: " + Arrays.toString(listA.toArray()));
        for (int i10 = 0; i10 < listA.size(); i10 += 2) {
            int i11 = Integer.parseInt(listA.get(i10));
            String str2 = listA.get(i10 + 1);
            if (!arrayList.contains(str2)) {
                arrayList.add(i11, str2);
            }
        }
        Logger.d(f52129l, "extract creative ids - creativeIds are: " + Arrays.toString(arrayList.toArray()));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj, List<String> list) {
        String strY;
        Logger.d(f52129l, "extractHashMapFieldResourceURLs started");
        for (Map.Entry entry : ((LinkedHashMap) obj).entrySet()) {
            if (entry != null && entry.getValue() != null && (strY = y(entry.getValue().toString())) != null) {
                Logger.d(f52129l, "extractHashMapFieldResourceURLs resource url: " + strY);
                list.add(strY);
            }
        }
    }

    private void a(Object obj, List<String> list, List<Object> list2, Set<Object> set, final List<String> list3) {
        if (obj == null || set.contains(obj)) {
            return;
        }
        set.add(obj);
        Class<?> superclass = obj.getClass();
        ArrayList<Field> arrayList = new ArrayList();
        do {
            arrayList.addAll(Arrays.asList(superclass.getDeclaredFields()));
            superclass = superclass.getSuperclass();
        } while (superclass.getName().startsWith("com.google.android.gms"));
        for (Field field : arrayList) {
            field.setAccessible(true);
            try {
                try {
                    final Object obj2 = field.get(obj);
                    if (obj2 != null) {
                        if (field.getType().getName().equals("interface") || obj2.getClass().getName().startsWith("com.google.android.gms")) {
                            list.add(field.getName());
                            a(obj2, list, list2, set, list3);
                            list.remove(list.size() - 1);
                        } else if (field.getType().getName().equals(f52131x)) {
                            list.add(field.getName());
                            Logger.d(f52129l, "found prefetch info in path: " + list + ", object: " + obj2);
                            list2.add(obj2);
                            list.remove(list.size() - 1);
                        } else if (obj2.getClass().getName().startsWith(k.f53183d)) {
                            String str = (String) obj2;
                            if (!TextUtils.isEmpty(str)) {
                                k.b(f52129l, "iterating over field " + field.getName() + " (non empty value) , string info = " + str);
                            }
                            if (str != null && str.startsWith(E)) {
                                list.add(field.getName());
                                Logger.d(f52129l, "found prefetch click url in path: " + list + ", object: " + obj2);
                                try {
                                    list2.add(new JSONObject("{ \"clickUrl\" : \"" + str + "\" }"));
                                } catch (JSONException e10) {
                                }
                                list.remove(list.size() - 1);
                            } else if (str != null && str.startsWith(H)) {
                                list.add(field.getName());
                                Logger.d(f52129l, "found sdk version in path: " + list + ", object: " + obj2);
                                String[] strArrSplit = str.split("\\.");
                                if (strArrSplit.length > 1) {
                                    this.f52211t = strArrSplit[1];
                                    if (this.f52211t != null) {
                                        h(g.f53134h, this.f52211t);
                                    }
                                }
                                list.remove(list.size() - 1);
                            }
                        } else if (field.getType().getName().equals(I)) {
                            list.add(field.getName());
                            Logger.d(f52129l, "found resource url in path: " + list);
                            try {
                                a(obj2, list3);
                            } catch (ConcurrentModificationException e11) {
                                Logger.d(f52129l, "Couldn't access LinkedHashMap field : " + e11.getMessage());
                                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.discoveries.b.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        try {
                                            b.this.a(obj2, (List<String>) list3);
                                        } catch (Throwable th2) {
                                            Logger.d(b.f52129l, "Couldn't access LinkedHashMap field (again!) : " + th2.getMessage());
                                        }
                                    }
                                }, 5L);
                            }
                            list.remove(list.size() - 1);
                        }
                    }
                } catch (ConcurrentModificationException e12) {
                    Logger.e(f52129l, "Error in extract ad info : " + e12.getMessage(), e12);
                }
            } catch (IllegalAccessException e13) {
                Logger.e(f52129l, e13.getMessage());
            }
        }
    }

    private void a(String str, int i10, List<String> list) {
        int iIndexOf = str.indexOf(61);
        if (iIndexOf != -1) {
            int iIndexOf2 = str.indexOf(38, iIndexOf);
            if (iIndexOf2 == -1) {
                iIndexOf2 = str.length();
            }
            String strSubstring = str.substring(iIndexOf + 1, iIndexOf2);
            Logger.d(f52129l, "extract click url index: " + i10 + ", landing page package id: " + strSubstring);
            list.add(i10, com.safedk.android.analytics.brandsafety.i.c(strSubstring));
        }
    }

    public static void a(String str, List<String> list, List<String> list2) {
        Matcher matcher = com.safedk.android.utils.f.X().matcher(str);
        boolean z10 = false;
        while (matcher.find()) {
            a(matcher.group(1), list, list2, Integer.parseInt(matcher.group(2)));
            z10 = true;
        }
        if (z10) {
            return;
        }
        a(str, list, list2, 0);
    }

    private static void a(String str, List<String> list, List<String> list2, int i10) {
        String strE = k.e(com.safedk.android.utils.f.c(), str);
        if (strE != null) {
            k.b(f52129l, "extractVastBlock adding vastBlock : " + strE);
            list.add(i10, strE);
        }
        String strE2 = k.e(com.safedk.android.utils.f.W(), str);
        if (strE2 == null) {
            strE2 = k.e(com.safedk.android.utils.f.V(), str);
        }
        if (strE2 != null) {
            k.b(f52129l, "extractVastBlock adding youtubeVideoId : " + strE2);
            list2.add(i10, strE2);
        }
    }

    private void a(List<f.a> list, List<String> list2, List<String> list3, List<String> list4, StringBuilder sb2) {
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (i11 >= list.size()) {
                return;
            }
            f.a aVar = list.get(i11);
            list4.add(i11, aVar.b());
            if (aVar.b() != null) {
                sb2.append("dv&");
            }
            if (aVar.a() != null) {
                if (i11 >= list3.size()) {
                    list3.add(i11, aVar.a());
                } else {
                    list3.set(i11, aVar.a());
                }
                sb2.append("dc&");
            }
            sb2.append("&c=" + aVar.a() + C3978d4.j.f31381c);
            if (aVar.c() != null) {
                if (i11 >= list2.size()) {
                    list2.add(i11, aVar.c());
                } else {
                    list2.set(i11, aVar.c());
                }
                Logger.d(f52129l, "generate info, Using ad id from vast: " + aVar.c());
                sb2.append("debugi&");
            }
            sb2.append("&i=" + aVar.c() + C3978d4.j.f31381c);
            i10 = i11 + 1;
        }
    }

    private void a(List<List<a>> list, List<List<String>> list2, List<String> list3, List<String> list4, List<f.a> list5, List<List<String>> list6, String str) {
        ArrayList arrayList;
        f.a aVarA;
        try {
            Logger.d(f52129l, "handle ad json object - started");
            JSONArray jSONArray = new JSONObject(str).getJSONArray("ads");
            list3.clear();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                ArrayList arrayList2 = new ArrayList();
                list.add(arrayList2);
                ArrayList arrayList3 = new ArrayList();
                list2.add(arrayList3);
                String strOptString = jSONObject.optString("app_id");
                if (!TextUtils.isEmpty(strOptString)) {
                    list4.add(strOptString);
                }
                String strOptString2 = jSONObject.optString(T);
                if (!TextUtils.isEmpty(strOptString2)) {
                    arrayList2.add(new a("title:", strOptString2, true));
                }
                Logger.d(f52129l, "handle ad json object - title: " + strOptString2);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("image");
                if (jSONObjectOptJSONObject != null) {
                    String strOptString3 = jSONObjectOptJSONObject.optString("url");
                    if (!TextUtils.isEmpty(strOptString3)) {
                        arrayList2.add(new a("mainImg:", strOptString3, false));
                    }
                    Logger.d(f52129l, "handle ad json object - mainImg: " + strOptString3);
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(V);
                if (jSONArrayOptJSONArray != null) {
                    for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                        String strOptString4 = jSONArrayOptJSONArray.getJSONObject(i11).optString("url");
                        if (!TextUtils.isEmpty(strOptString4)) {
                            a aVar = new a("mainImg:", strOptString4, false);
                            aVar.f52140d = false;
                            arrayList2.add(aVar);
                        }
                    }
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(W);
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i12 = 0; i12 < jSONArrayOptJSONArray2.length(); i12++) {
                        String strOptString5 = jSONArrayOptJSONArray2.getJSONObject(i12).optString("url");
                        if (!TextUtils.isEmpty(strOptString5)) {
                            a aVar2 = new a("mainImg:", strOptString5, false);
                            aVar2.f52140d = false;
                            arrayList2.add(aVar2);
                        }
                    }
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(X);
                if (jSONObjectOptJSONObject2 == null) {
                    jSONObjectOptJSONObject2 = jSONObject.optJSONObject(Y);
                }
                if (jSONObjectOptJSONObject2 != null) {
                    String strOptString6 = jSONObjectOptJSONObject2.optString("url");
                    if (!TextUtils.isEmpty(strOptString6)) {
                        arrayList2.add(new a("icon:", strOptString6, false));
                    }
                    Logger.d(f52129l, "handle ad json object - icon: " + strOptString6);
                }
                JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject(Z);
                if (jSONObjectOptJSONObject3 != null) {
                    JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject3.optJSONArray(f52099aa);
                    if (jSONArrayOptJSONArray3 != null) {
                        for (int i13 = 0; i13 < jSONArrayOptJSONArray3.length(); i13++) {
                            JSONObject jSONObject2 = jSONArrayOptJSONArray3.getJSONObject(i13);
                            if (jSONObject2 != null) {
                                String strOptString7 = jSONObject2.optString(f52102ad);
                                if (TextUtils.isEmpty(strOptString7)) {
                                    strOptString7 = jSONObject2.optString("url");
                                }
                                if (jSONObject2.optInt("type") == 1) {
                                    list3.add(0, strOptString7);
                                } else {
                                    list3.add(strOptString7);
                                }
                            }
                        }
                        Logger.d(f52129l, "handle ad json object - clickUrlList: " + list3);
                    }
                    JSONArray jSONArrayOptJSONArray4 = jSONObjectOptJSONObject3.optJSONArray(f52100ab);
                    if (jSONArrayOptJSONArray4 != null) {
                        for (int i14 = 0; i14 < jSONArrayOptJSONArray4.length(); i14++) {
                            arrayList3.add(jSONArrayOptJSONArray4.getString(i14));
                        }
                    }
                }
                String strOptString8 = jSONObject.optString("body");
                if (!TextUtils.isEmpty(strOptString8)) {
                    arrayList2.add(new a("body:", strOptString8, true));
                }
                Logger.d(f52129l, "handle ad json object - body: " + strOptString8);
                String strOptString9 = jSONObject.optString(f52104af);
                if (!TextUtils.isEmpty(strOptString9)) {
                    arrayList2.add(new a("cta:", strOptString9, true));
                }
                Logger.d(f52129l, "handle ad json object - cta: " + strOptString9);
                String strOptString10 = jSONObject.optString("rating");
                if (!TextUtils.isEmpty(strOptString10)) {
                    arrayList2.add(new a("star:", strOptString10, true));
                }
                Logger.d(f52129l, "handle ad json object - star: " + strOptString10);
                String strOptString11 = jSONObject.optString("advertiser");
                if (!TextUtils.isEmpty(strOptString11)) {
                    arrayList2.add(new a("advertiser:", strOptString11, true));
                }
                Logger.d(f52129l, "handle ad json object - advertiser: " + strOptString11);
                JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("video");
                if (jSONObjectOptJSONObject4 != null) {
                    String strOptString12 = jSONObjectOptJSONObject4.optString(f52109ak);
                    if (!TextUtils.isEmpty(strOptString12) && (aVarA = a(strOptString12, (List<String>) (arrayList = new ArrayList()))) != null) {
                        list5.add(aVarA);
                        list6.add(arrayList);
                    }
                }
            }
            Logger.d(f52129l, "handle ad json object - appPackageNameList: " + list4);
            Logger.d(f52129l, "handle ad json object - clickUrlList: " + list3);
            Logger.d(f52129l, "handle ad json object - nativeAdElementsLists: " + list);
            Logger.d(f52129l, "handle ad json object - nativeBannerDspResourcesLists: " + list2);
            Logger.d(f52129l, "handle ad json object - vastAdInfoList: " + list5);
            Logger.d(f52129l, "handle ad json object - vastAdUrisList: " + list6);
        } catch (Exception e10) {
            Logger.d(f52129l, "handle ad json object - encountered exception: " + e10);
        }
    }

    private CreativeInfo b(String str, CreativeInfo creativeInfo) {
        if (BrandSafetyUtils.AdType.INTERSTITIAL != creativeInfo.K()) {
            return creativeInfo;
        }
        Logger.d(f52129l, "handle scar-admob-video ad started, click string: " + str + ", CI: " + creativeInfo);
        if (!SafeDK.getInstance().y().i("com.unity3d.ads")) {
            if (SafeDK.getInstance().y().i(g.f53134h)) {
                return creativeInfo;
            }
            Logger.d(f52129l, "handle scar-admob-video ad - no interstitial info found for package name: com.google.ads");
            return creativeInfo;
        }
        AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h("com.unity3d.ads");
        if (adNetworkDiscoveryH == null) {
            Logger.d(f52129l, "handle scar-admob-video ad - no UnityAdsDiscovery found");
            return creativeInfo;
        }
        CreativeInfo creativeInfoA = adNetworkDiscoveryH.a((Object) str);
        if (creativeInfoA == null) {
            Logger.d(f52129l, "handle scar-admob-video ad - no CI matched, actual SDK: " + creativeInfo.Q());
            return creativeInfo;
        }
        k.b(f52129l, "handle scar-admob-video ad, found origin SDK: " + creativeInfoA.Q() + ", actual SDK: " + creativeInfo.Q());
        creativeInfoA.a(creativeInfo);
        return creativeInfoA;
    }

    private String b(String str, List<String> list, String str2, StringBuilder sb2) {
        Matcher matcher = com.safedk.android.utils.f.ac().matcher(str);
        if (!matcher.find()) {
            return str2;
        }
        try {
            JSONArray jSONArray = new JSONObject(k.k(matcher.group(1))).getJSONArray(L);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String string = jSONArray.getJSONObject(i10).getString(K);
                Logger.d(f52129l, "generate info, found ad survey text: " + string);
                list.add(string);
            }
            return CreativeInfo.f52490s;
        } catch (Throwable th2) {
            Logger.d(f52129l, "generate info, error parsing ad survey text: " + th2.getMessage());
            return CreativeInfo.f52490s;
        } finally {
            sb2.append(CreativeInfo.f52490s);
            sb2.append(C3978d4.j.f31381c);
        }
    }

    private void b(String str, List<String> list) {
        String strReplaceAll;
        String strReplaceAll2 = str.replaceAll("<script\\b[^>]*>[\\s\\S]*?<\\/script\\b[^>]*>", "");
        k.b(f52129l, "generate info, sanitized  html is: " + strReplaceAll2);
        Matcher matcher = com.safedk.android.utils.f.ad().matcher(strReplaceAll2);
        while (matcher.find()) {
            if (matcher.groupCount() > 1 && (strReplaceAll = matcher.group(2).replace("<br>", Z7.f30794r).replaceAll("<[^>]*>", "")) != null && strReplaceAll.length() > 0) {
                Logger.d(f52129l, "generate info, found ad text: " + strReplaceAll + ", decoded: " + k.k(strReplaceAll));
                list.add(k.k(strReplaceAll));
            }
        }
    }

    private static void c(CreativeInfo creativeInfo) {
        int i10 = 0;
        Iterator<String> it = creativeInfo.s().iterator();
        while (true) {
            int i11 = i10;
            if (!it.hasNext()) {
                return;
            }
            String next = it.next();
            if (k.d(com.safedk.android.utils.f.aP(), next) || next.contains(f52117as)) {
                i10 = i11 + 1;
                if (i10 >= 3) {
                    Logger.d(f52129l, "generate info, shopping collage creative detected");
                    creativeInfo.C();
                    return;
                }
            } else {
                i10 = i11;
            }
        }
    }

    public static List<String> l(String str) {
        int i10 = 0;
        ArrayList arrayList = new ArrayList();
        List<String> listA = com.safedk.android.analytics.brandsafety.creatives.d.a(com.safedk.android.utils.f.Z(), str, 1, 2, false);
        while (true) {
            int i11 = i10;
            if (i11 >= listA.size()) {
                return arrayList;
            }
            int i12 = Integer.parseInt(listA.get(i11));
            String str2 = listA.get(i11 + 1);
            if (!arrayList.contains(str2)) {
                arrayList.add(i12, str2);
            }
            i10 = i11 + 2;
        }
    }

    private String r(String str) {
        String strGroup;
        Matcher matcher = com.safedk.android.utils.f.Y().matcher(str);
        if (!matcher.find() || (strGroup = matcher.group(2)) == null || strGroup.length() > 20) {
            return null;
        }
        return strGroup;
    }

    private boolean s(String str) {
        Logger.d(f52129l, "isMraidAd started ");
        for (String str2 : au) {
            if (!str.contains(str2)) {
                return false;
            }
            Logger.d(f52129l, "isMraidAd ad html contains the string " + str2);
        }
        Logger.d(f52129l, "isMraidAd ad is an mraid ad");
        return true;
    }

    private String t(String str) {
        List<String> listB = k.b(com.safedk.android.utils.f.N(), str, 3);
        if (listB != null) {
            Iterator<String> it = listB.iterator();
            if (it.hasNext()) {
                String next = it.next();
                Logger.d(f52129l, "findPublisherAppIconUrl match  : " + next);
                return next;
            }
        }
        return null;
    }

    private String u(String str) {
        BufferedReader bufferedReader;
        InputStream inputStreamOpenStream = null;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            Logger.d(f52129l, "downloadUrl fetching " + str);
            inputStreamOpenStream = new URL(str).openStream();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenStream));
        } catch (Throwable th2) {
            try {
                Logger.d(f52129l, "Exception in downloadUrl : " + th2.getMessage(), th2);
                if (inputStreamOpenStream != null) {
                    inputStreamOpenStream.close();
                }
            } catch (Throwable th3) {
                Logger.d(f52129l, "Exception in downloadUrl inner : " + th2.getMessage(), th2);
            }
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            stringBuffer.append(line);
            return stringBuffer.toString();
        }
        inputStreamOpenStream.close();
        return stringBuffer.toString();
    }

    private List<String> v(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            List<String> listA = com.safedk.android.analytics.brandsafety.creatives.d.a(com.safedk.android.utils.f.ag(), str, 1, 2, false);
            Logger.d(f52129l, "extractClickUrls values : " + listA + ", rawValue = " + str);
            for (int i10 = 0; i10 < listA.size(); i10 += 2) {
                int i11 = Integer.parseInt(listA.get(i10));
                String lowerCase = URLDecoder.decode(listA.get(i10 + 1), "UTF-8").toLowerCase();
                Logger.d(f52129l, "extract click url index: " + i11 + ", landing page: " + lowerCase);
                if (lowerCase.startsWith("http") || lowerCase.startsWith(D)) {
                    arrayList.add(i11, lowerCase);
                } else if (lowerCase.startsWith(C)) {
                    arrayList.add(i11, lowerCase);
                    a(lowerCase, i11, arrayList);
                    Logger.d(f52129l, "extractClickUrls: adding intent link with landing page: " + lowerCase);
                }
            }
        } catch (UnsupportedEncodingException e10) {
            Logger.e(f52129l, e10.getMessage());
        }
        return arrayList;
    }

    private List<String> w(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            k.b(f52129l, "extract destination click url started rawValue = " + str);
            List<String> listA = com.safedk.android.analytics.brandsafety.creatives.d.a(com.safedk.android.utils.f.ah(), str, 1, false);
            Logger.d(f52129l, "extract destination click url values : " + listA + ", rawValue = " + str);
            Iterator<String> it = listA.iterator();
            while (it.hasNext()) {
                String strM = k.m(it.next());
                Logger.d(f52129l, "extract destination click url destination url : " + strM);
                if (strM.startsWith("http") || strM.startsWith(D) || strM.startsWith(C)) {
                    arrayList.add(strM);
                    Logger.d(f52129l, "extract destination click url : adding destination url : " + strM);
                }
            }
        } catch (Throwable th2) {
            Logger.e(f52129l, "Exception in extract destination click url : " + th2.getMessage(), th2);
        }
        return arrayList;
    }

    private int x(String str) {
        int iMax = -1;
        Matcher matcher = com.safedk.android.utils.f.ai().matcher(str);
        while (matcher.find()) {
            iMax = Math.max(Integer.parseInt(matcher.group(1)), iMax);
        }
        return iMax + 1;
    }

    private String y(String str) {
        int iIndexOf;
        int iIndexOf2 = str.indexOf(34);
        if (iIndexOf2 <= -1 || (iIndexOf = str.indexOf(34, iIndexOf2 + 1)) <= -1) {
            return null;
        }
        return str.substring(iIndexOf2 + 1, iIndexOf);
    }

    private String z(String str) {
        Matcher matcher = com.safedk.android.utils.f.aO().matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public long a(CreativeInfo creativeInfo) {
        return ((long) SafeDK.getInstance().E()) * 2;
    }

    public f.a a(String str, List<String> list) {
        Logger.d(f52129l, "getVastInfoRecursive started");
        f.a aVarB = com.safedk.android.analytics.brandsafety.creatives.f.b(str, true, g.f53134h);
        if (aVarB == null) {
            return null;
        }
        String strC = aVarB.c();
        String strD = aVarB.d();
        List<String> listI = aVarB.i();
        List<String> listO = aVarB.o();
        List<String> listN = aVarB.n();
        List<String> listP = aVarB.p();
        List<String> listQ = aVarB.q();
        Logger.d(f52129l, "get vast info - saved ad ID: " + strC + ", ad system: " + strD + " and impression urls: " + listI);
        k.b(f52129l, "get vast info - " + aVarB);
        while (true) {
            if (aVarB != null && aVarB.e() != null) {
                Logger.d(f52129l, "get vast info - fetching vast ad uri: " + aVarB.e());
                list.add(aVarB.e());
                String strU = u(aVarB.e());
                k.b(f52129l, "get vast info -  ad tag uri content=" + strU);
                if (TextUtils.isEmpty(strU)) {
                    Logger.d(f52129l, "get vast info -  ad tag uri content is empty");
                    break;
                }
                aVarB = com.safedk.android.analytics.brandsafety.creatives.f.b(strU, true, g.f53134h);
                k.b(f52129l, "get vast info recursive: " + aVarB);
            } else {
                break;
            }
        }
        if (aVarB == null) {
            return aVarB;
        }
        if (aVarB.c().equals(strC)) {
            aVarB.a(strC);
            Logger.d(f52129l, "get vast info - saved adId from outer vast: " + strC);
        }
        if (aVarB.d().equals(strD)) {
            aVarB.b(strD);
            Logger.d(f52129l, "get vast info - saved adSystem from outer vast: " + strD);
        }
        if (listI != null) {
            aVarB.a(listI);
            Logger.d(f52129l, "get vast info - saved impressionUrls from outer vast: " + listI);
        }
        if (listO != null) {
            aVarB.c(listO);
            Logger.d(f52129l, "get vast info - saved videoTrackingEventUrls from outer vast: " + listO);
        }
        if (listN != null) {
            aVarB.b(listN);
            Logger.d(f52129l, "get vast info - saved videoCompletedUrls from outer vast: " + listN);
        }
        if (listP != null) {
            aVarB.d(listP);
            Logger.d(f52129l, "get vast info - saved clickTrackingUrls from outer vast: " + listP);
        }
        if (listQ == null) {
            return aVarB;
        }
        aVarB.e(listQ);
        Logger.d(f52129l, "get vast info - saved companionClickTrackingUrls from outer vast: " + listQ);
        return aVarB;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<CreativeInfo> a(WeakReference<View> weakReference, String str, boolean z10) {
        BrandSafetyUtils.AdType adTypeA;
        List<String> arrayList;
        List<String> arrayList2;
        List<String> arrayList3;
        List<String> arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        String strSubstring;
        List<String> arrayList10;
        String str2;
        List<String> arrayList11;
        List<String> arrayList12;
        List<List<String>> arrayList13;
        List<f.a> arrayList14;
        ArrayList arrayList15;
        String str3;
        List<List<a>> arrayList16;
        List<List<String>> arrayList17;
        StringBuilder sb2;
        boolean z11;
        String str4;
        boolean z12;
        List<String> listF;
        List<String> listL;
        boolean z13;
        int i10;
        long jCurrentTimeMillis;
        List<String> list;
        String str5;
        List<String> list2;
        String strT;
        String strB;
        List<String> list3;
        boolean z14;
        String str6;
        String str7;
        int iMax;
        String strT2;
        List<String> list4;
        List<String> list5;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        ArrayList arrayList18 = new ArrayList();
        try {
            Logger.d(f52129l, "generate info started, view: " + weakReference.get());
            long measuredHeight = weakReference.get().getMeasuredHeight();
            long measuredWidth = weakReference.get().getMeasuredWidth();
            Logger.d(f52129l, "generate info View check. adInstance is a View, visibility = " + weakReference.get().getVisibility() + ", dimensions (height= " + measuredHeight + ", width=" + measuredWidth + ")");
            adTypeA = BrandSafetyUtils.a(measuredWidth, measuredHeight);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            arrayList = new ArrayList<>();
            List<Object> arrayList19 = new ArrayList<>();
            long jA = a(weakReference.get(), arrayList19, arrayList);
            ArrayList arrayList20 = new ArrayList();
            arrayList2 = new ArrayList<>();
            arrayList3 = new ArrayList<>();
            arrayList4 = new ArrayList<>();
            arrayList5 = new ArrayList();
            arrayList6 = new ArrayList();
            arrayList7 = new ArrayList();
            arrayList8 = new ArrayList();
            arrayList9 = new ArrayList();
            strSubstring = null;
            arrayList10 = new ArrayList<>();
            str2 = null;
            arrayList11 = new ArrayList<>();
            arrayList12 = new ArrayList<>();
            arrayList13 = new ArrayList<>();
            arrayList14 = new ArrayList<>();
            arrayList15 = new ArrayList();
            str3 = null;
            arrayList16 = new ArrayList<>();
            arrayList17 = new ArrayList<>();
            sb2 = new StringBuilder("b|");
            sb2.append(jCurrentTimeMillis2).append(ImpressionLog.Q);
            sb2.append(jA).append(ImpressionLog.Q);
            sb2.append(arrayList.size()).append(ImpressionLog.Q);
            sb2.append(arrayList19.size()).append(ImpressionLog.Q);
            HashSet hashSet = new HashSet();
            sb2.append(ImpressionLog.Q).append("click_url_count=").append(a(arrayList19)).append(ImpressionLog.Q);
            Iterator<Object> it = arrayList19.iterator();
            z11 = false;
            String str8 = null;
            int i11 = 0;
            str4 = null;
            z12 = false;
            listF = null;
            listL = arrayList20;
            z13 = true;
            i10 = -1;
            while (it.hasNext()) {
                JSONObject jSONObject = (JSONObject) it.next();
                Iterator<String> itKeys = jSONObject.keys();
                boolean z15 = z11;
                String str9 = str8;
                int i12 = i11;
                String str10 = str4;
                boolean z16 = z12;
                String str11 = str3;
                String str12 = str2;
                List<String> arrayList21 = arrayList3;
                List<String> list6 = arrayList2;
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String string = jSONObject.getString(next);
                    int iMax2 = Math.max(i10, x(string));
                    boolean z17 = z16 ? z16 : iMax2 > 1;
                    k.b(f52129l, "generate info, found ad part - key: " + next + ", is multi ad? " + z17 + ", ad count: " + iMax2 + ", value: " + string);
                    sb2.append(ImpressionLog.Q);
                    sb2.append(next);
                    sb2.append("->");
                    listL = l(string);
                    boolean z18 = !hashSet.contains(next);
                    hashSet.add(next);
                    if (next.equals(Q)) {
                        a(arrayList16, arrayList17, arrayList21, arrayList10, arrayList14, arrayList13, string);
                        str5 = !arrayList14.isEmpty() ? str12 == null ? "vast" : str12 + "vast" : str12;
                        z15 = true;
                        list2 = arrayList21;
                    } else if (next.equals("ad_html")) {
                        Logger.d(f52129l, "generate info, processing ad html");
                        z13 = false;
                        ArrayList<String> arrayList22 = new ArrayList();
                        a(string, arrayList22, arrayList15);
                        Logger.d(f52129l, "generate info, vastAdBlocks contains " + arrayList22.size() + " items");
                        if (arrayList22.isEmpty()) {
                            String strK = k.k(string);
                            strT = t(strK);
                            String strG = g(g(strK, "app-open-publisher-tab-holder"), "advertisement-top");
                            strB = b(string, arrayList11, a(strG, arrayList11, str11, sb2), sb2);
                            String strN = n(strG);
                            if (strN != null) {
                                List<String> arrayList23 = new ArrayList<>();
                                arrayList23.add(strN);
                                sb2.append("dd_c&");
                                list3 = arrayList23;
                            } else {
                                String strZ = z(strG);
                                if (strZ != null) {
                                    Logger.d(f52129l, "generate info - found click url inside html, url: " + strZ);
                                    Iterator<String> it2 = arrayList21.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            z14 = true;
                                            break;
                                        }
                                        String next2 = it2.next();
                                        if (next2 != null && !next2.contains(J)) {
                                            z14 = false;
                                            break;
                                        }
                                    }
                                    if (z14) {
                                        arrayList21 = new ArrayList<>();
                                        arrayList21.add(strZ);
                                        sb2.append("dd_c&");
                                    }
                                    list3 = arrayList21;
                                } else {
                                    Logger.d(f52129l, "generate info - did not find click url");
                                    list3 = arrayList21;
                                }
                            }
                            arrayList10.add(o(strG));
                            String strR = r(string);
                            if (!TextUtils.isEmpty(strR)) {
                                arrayList.add("element:ytId:" + strR);
                            }
                            str6 = string;
                            str7 = str12;
                            iMax = iMax2;
                        } else {
                            iMax = Math.max(iMax2, arrayList22.size());
                            Logger.d(f52129l, "generate info, processing vast blocks");
                            sb2.append("vast");
                            sb2.append(C3978d4.j.f31381c);
                            String strReplace = string;
                            for (String str13 : arrayList22) {
                                strReplace = strReplace.replace(str13, "");
                                List<String> arrayList24 = new ArrayList<>();
                                f.a aVarA = a(str13, arrayList24);
                                if (aVarA != null) {
                                    Logger.d(f52129l, "generate info, vast info found, ad id: " + aVarA.c());
                                    arrayList14.add(aVarA);
                                    arrayList13.add(arrayList24);
                                    if (!z18) {
                                        sb2.append("sk&");
                                        if (aVarA != null) {
                                            sb2.append("vast");
                                            sb2.append(C3978d4.j.f31381c);
                                            sb2.append("c=" + aVarA.a());
                                            sb2.append("&i=" + aVarA.c());
                                        }
                                    }
                                }
                            }
                            str6 = strReplace;
                            strT = str10;
                            strB = str11;
                            str7 = "vast";
                            list3 = arrayList21;
                        }
                        if (com.safedk.android.utils.f.ab().matcher(string).find()) {
                            sb2.append("playable");
                            sb2.append(C3978d4.j.f31381c);
                            strB = "playable";
                        }
                        if (z17) {
                            String strA = a(iMax, string, arrayList5, arrayList6, arrayList7, arrayList8, arrayList9);
                            if (z17) {
                                str7 = str7 == null ? strA + CreativeInfo.aH + iMax : str7 + strA + CreativeInfo.aH + iMax;
                                sb2.append(str7);
                                sb2.append(C3978d4.j.f31381c);
                            }
                        }
                        String str14 = str7;
                        listF = k.f(str6);
                        if (strT != null && listF.contains(strT)) {
                            listF.remove(strT);
                            k.b(f52129l, "generate info, removed app icon url: " + strT);
                        }
                        if (s(string)) {
                            Logger.d(f52129l, "generate info, all mraid string found, marking this ad as mraid");
                            sb2.append("mraidStringFound&");
                        }
                        for (int i13 = 0; i13 < listF.size(); i13++) {
                            String strK2 = k.k(listF.get(i13));
                            listF.set(i13, strK2);
                            Logger.d(f52129l, "htmlUrls url = " + strK2);
                        }
                        k.b(f52129l, "generate info, html: " + string);
                        if (k.s(string)) {
                            Logger.d(f52129l, "generate info, content is Html content");
                            strT2 = t(string);
                            String strG2 = g(g(string, "app-open-publisher-tab-holder"), "advertisement-top");
                            ArrayList<String> arrayListF = k.f(strG2);
                            k.b(f52129l, "generate info, urls extracted from source: " + arrayListF);
                            if (strT2 != null && arrayListF.contains(strT2)) {
                                arrayListF.remove(strT2);
                                k.b(f52129l, "generate info, removed app icon url: " + strT2);
                            }
                            if (arrayListF != null && arrayListF.size() > 0) {
                                ArrayList arrayList25 = new ArrayList();
                                Iterator<String> it3 = arrayListF.iterator();
                                while (it3.hasNext()) {
                                    String strReplaceAll = k.k(it3.next()).replaceAll("&quot;", C3978d4.j.f31381c);
                                    if (strReplaceAll == null || !k.a((Object) strReplaceAll)) {
                                        Logger.d(f52129l, "generate info, sanitizedUrl is not a url: " + strReplaceAll);
                                    } else {
                                        arrayList25.add(strReplaceAll);
                                    }
                                }
                                k.b(f52129l, "generate info, Html content sanitized urls: " + arrayList25);
                                listF.addAll(arrayList25);
                            }
                            b(strG2, arrayList12);
                            if (k.a((Collection<?>) list3) && strG2.contains(f52128k)) {
                                List<String> listW = w(strG2);
                                sb2.append("dc2&");
                                sb2.append(listW).append(C3978d4.j.f31381c);
                                Logger.d(f52129l, "generate info, click urls (Destination Url): " + listW);
                                list2 = listW;
                            } else {
                                list2 = list3;
                            }
                        } else {
                            strT2 = strT;
                            list2 = list3;
                        }
                        str10 = strT2;
                        str11 = strB;
                        str5 = str14;
                        iMax2 = iMax;
                    } else if (next.equals("pubid")) {
                        if (z18) {
                            strSubstring = string.substring(0, string.lastIndexOf(47));
                            Logger.d(f52129l, "generate info, placement ID: " + strSubstring);
                            z13 = false;
                            sb2.append(strSubstring);
                            sb2.append(C3978d4.j.f31381c);
                            str5 = str12;
                            list2 = arrayList21;
                        } else {
                            sb2.append("sk&");
                            sb2.append(string.substring(0, string.lastIndexOf(47)));
                            z16 = z17;
                            i10 = iMax2;
                        }
                    } else if (next.equals("clickUrl")) {
                        i12++;
                        if (i12 == 1) {
                            Logger.d(f52129l, "generate info, first click url: " + string);
                            str9 = string;
                        } else if (str9 != null) {
                            Logger.d(f52129l, "generate info, new click url: " + string);
                            if (str9.equals(string)) {
                                Logger.d(f52129l, "generate info, the click url with index: " + i12 + " has the same value as the first, so skipping!");
                                z16 = z17;
                                i10 = iMax2;
                            } else {
                                sb2.append("||different_clickUrl_found||");
                                Logger.d(f52129l, "generate info, click url index: " + i12 + " is NOT equal to the first one which is: " + str9);
                            }
                        }
                        Map<String, String> mapA = k.a(string, false);
                        if (mapA.containsKey(F) || mapA.containsKey(G)) {
                            String str15 = mapA.containsKey(F) ? mapA.get(F) : mapA.get(G);
                            if (str != null && !str.equals(str15)) {
                                Logger.d(f52129l, "generate info, for click index: " + i12 + " max creative id is: " + str + " vs backend query id: " + str15);
                            }
                        }
                        sb2.append(string).append(C3978d4.j.f31381c);
                        if (z18) {
                            Logger.d(f52129l, "generate info, click url value: " + string + ", clickUrlList = " + arrayList21);
                            if (k.a((Collection<?>) arrayList21)) {
                                List<String> listV = v(string);
                                sb2.append("dc2&");
                                sb2.append(listV).append(C3978d4.j.f31381c);
                                Logger.d(f52129l, "generate info, click urls: " + listV);
                                list4 = listV;
                            } else {
                                list4 = arrayList21;
                            }
                            if (list6 == null || list6.isEmpty()) {
                                List<String> listA = a(string, false);
                                Logger.d(f52129l, "generate info, creative ID: " + listA);
                                list5 = listA;
                            } else {
                                list5 = list6;
                            }
                            z13 = false;
                            str5 = str12;
                            list2 = list4;
                            list6 = list5;
                        } else {
                            Logger.d("generate info, should process key is false, skipping click url for now");
                            sb2.append("sk&");
                            sb2.append("c=").append(v(string));
                            sb2.append("&i=").append(a(string, false));
                            z16 = z17;
                            i10 = iMax2;
                        }
                    } else {
                        str5 = str12;
                        list2 = arrayList21;
                    }
                    if (z17 && str5 != null && !str5.contains(CreativeInfo.aJ)) {
                        str5 = str5 + CreativeInfo.aJ;
                        sb2.append("&multiple_ads");
                    }
                    z16 = z17;
                    str12 = str5;
                    arrayList21 = list2;
                    i10 = iMax2;
                }
                z11 = z15;
                str8 = str9;
                i11 = i12;
                str4 = str10;
                z12 = z16;
                str3 = str11;
                str2 = str12;
                arrayList3 = arrayList21;
                arrayList2 = list6;
            }
            jCurrentTimeMillis = System.currentTimeMillis();
            Logger.d(f52129l, "generate info, json build time: " + (jCurrentTimeMillis - jA));
        } catch (Throwable th2) {
            Logger.e(f52129l, "Exception in generate info: " + th2.getMessage(), th2);
        }
        if (z13) {
            Logger.d(f52129l, "generate info, prefetch is NULL");
            return null;
        }
        if (!arrayList14.isEmpty()) {
            a(arrayList14, arrayList2, arrayList3, arrayList4, sb2);
        }
        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
            if (arrayList3.get(i14) != null && arrayList3.get(i14).contains(J)) {
                arrayList3.set(i14, null);
            }
        }
        if (str2 == null) {
            str2 = str3;
        } else if (str3 != null) {
            str2 = str2 + ImpressionLog.Q + str3;
        }
        Logger.d(f52129l, "generate info, downstream struct: " + str2 + ", adCount = " + i10);
        Logger.d(f52129l, "generate info, click url list size is: " + arrayList3.size());
        if (i10 > 0 && arrayList3.size() != i10) {
            Logger.d(f52129l, "generate info, mismatched between click url list size and ad count");
        }
        Logger.d(f52129l, "generate info, app package name is: " + arrayList10 + " placement id is: " + strSubstring + " first creative id is: " + (arrayList2.size() > 0 ? arrayList2.get(0) : "null"));
        int i15 = 0;
        while (i15 < i10) {
            CreativeInfo adMobCreativeInfo = new AdMobCreativeInfo(null, adTypeA, arrayList2.size() > i15 ? arrayList2.get(i15) : null, arrayList3.size() > i15 ? arrayList3.get(i15) : null, strSubstring, arrayList4.size() > i15 ? arrayList4.get(i15) : null, this.f52211t, str2, arrayList10.size() > i15 ? arrayList10.get(i15) : null);
            Logger.d(f52129l, "generate info - set click url of CI to - " + adMobCreativeInfo.M());
            if (str4 != null) {
                adMobCreativeInfo.G(str4);
                Logger.d(f52129l, "generate info, application icon url added to ci WebView urls exclusion list : " + str4);
            }
            k.b(f52129l, "created ci : " + adMobCreativeInfo);
            sb2.append(ImpressionLog.Q);
            sb2.append(jCurrentTimeMillis).append(ImpressionLog.Q);
            sb2.append(arrayList.size()).append(ImpressionLog.Q);
            sb2.append(listF == null ? "e" : Integer.valueOf(listF.size())).append(ImpressionLog.Q);
            if (i15 < arrayList14.size()) {
                f.a aVar = arrayList14.get(i15);
                if (aVar != null) {
                    sb2.append(aVar.j() == null ? "v" : Integer.valueOf(aVar.j().size()));
                }
                adMobCreativeInfo.b(arrayList);
                if (!z12) {
                    adMobCreativeInfo.b(listF);
                }
                a(adMobCreativeInfo, aVar, (String) null);
            } else {
                k.b(f52129l, "generate info, adCount is 1");
                if (i10 == 1) {
                    adMobCreativeInfo.b(arrayList);
                    adMobCreativeInfo.b(listF);
                } else {
                    Logger.d(f52129l, "ad count is > 1 , not adding prefetch urls");
                }
            }
            k.b(f52129l, "generate info, creative info urls = " + adMobCreativeInfo.s());
            if (i15 < arrayList13.size() && (list = arrayList13.get(i15)) != null) {
                Iterator<String> it4 = list.iterator();
                while (it4.hasNext()) {
                    adMobCreativeInfo.C(it4.next());
                }
            }
            Logger.d(f52129l, "generate info, downstreamSubtype: " + str3 + ", inter text collection: " + arrayList11);
            if (str3 != null && !str3.equals("vast") && arrayList11.size() > 3) {
                for (String str16 : arrayList11) {
                    Logger.d(f52129l, "generate info, inter ad text: " + str16);
                    adMobCreativeInfo.A(str16);
                }
            }
            if ((adTypeA.equals(BrandSafetyUtils.AdType.BANNER) || adTypeA.equals(BrandSafetyUtils.AdType.MREC)) && arrayList12.size() > 0) {
                for (String str17 : arrayList12) {
                    Logger.d(f52129l, "generate info, banner/mrec ad text: " + str17);
                    adMobCreativeInfo.A(str17);
                }
            }
            if (z12) {
                adMobCreativeInfo.ai();
                if (i15 < arrayList5.size() && arrayList5.get(i15) != null) {
                    adMobCreativeInfo.B(f52119b + ((String) arrayList5.get(i15)));
                }
                if (i15 < arrayList6.size() && arrayList6.get(i15) != null) {
                    adMobCreativeInfo.B(f52120c + ((String) arrayList6.get(i15)));
                }
                if (i15 < arrayList7.size() && arrayList7.get(i15) != null) {
                    adMobCreativeInfo.B(f52121d + ((String) arrayList7.get(i15)));
                }
                if (i15 < arrayList8.size() && arrayList8.get(i15) != null) {
                    adMobCreativeInfo.B(f52122e + ((String) arrayList8.get(i15)));
                }
                if (i15 < arrayList9.size() && arrayList9.get(i15) != null) {
                    adMobCreativeInfo.B(f52123f + ((String) arrayList9.get(i15)));
                }
            }
            if (i15 < arrayList15.size() && arrayList15.get(i15) != null) {
                adMobCreativeInfo.B(f52124g + ((String) arrayList15.get(i15)));
            }
            if (i15 < arrayList16.size()) {
                for (a aVar2 : arrayList16.get(i15)) {
                    Logger.d(f52129l, "generate info - add prefetch element= " + aVar2);
                    if (z10) {
                        if (aVar2.f52140d) {
                            adMobCreativeInfo.B(aVar2.f52137a + aVar2.f52138b);
                        } else {
                            adMobCreativeInfo.z(aVar2.f52138b);
                        }
                    } else if (aVar2.f52139c) {
                        adMobCreativeInfo.A(aVar2.f52138b);
                    } else {
                        adMobCreativeInfo.z(aVar2.f52138b);
                    }
                }
            }
            if (i15 < arrayList17.size()) {
                Iterator<String> it5 = arrayList17.get(i15).iterator();
                while (it5.hasNext()) {
                    adMobCreativeInfo.w(it5.next());
                }
            }
            if (z11 && i15 < arrayList10.size()) {
                adMobCreativeInfo.q(arrayList10.get(i15));
            }
            adMobCreativeInfo.u(sb2.toString());
            if (i15 < listL.size()) {
                adMobCreativeInfo = b(listL.get(i15), adMobCreativeInfo);
            } else {
                Logger.d(f52129l, "generate info, click string is empty, cannot check if scar CI exists");
            }
            c(adMobCreativeInfo);
            Logger.d(f52129l, "generate info, generated info is: " + adMobCreativeInfo);
            arrayList18.add(adMobCreativeInfo);
            i15++;
        }
        return arrayList18;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<CreativeInfo> b(String str, String str2, Map<String, List<String>> map, c.a aVar) throws JSONException {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean b(String str, Bundle bundle) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public Set<String> c() {
        return new HashSet();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void e() {
        Logger.d(f52129l, "get SDK version - checking version for Admob " + this.f52211t);
        if (this.f52211t == null) {
            this.f52211t = SdksMapping.getSdkVersionByPackage(g.f53134h);
            Logger.d(f52129l, "get SDK version - version is " + this.f52211t);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String f() {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean f(View view) {
        if (!view.getClass().getName().equals(N) && !view.getClass().getName().equals(O)) {
            return false;
        }
        Logger.d(f52129l, "is ad view: " + view.getClass().getName() + " is an instance of " + view.getClass().getName());
        return true;
    }

    public String g(String str, String str2) {
        MatchResult next;
        if (!str.contains(str2)) {
            return str;
        }
        Iterator<MatchResult> it = k.c(Pattern.compile("<div|class=(?:\\\"|')" + str2 + "(?:\\\"|')|</div>"), str).iterator();
        int i10 = 0;
        boolean z10 = false;
        MatchResult matchResult = null;
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (z10) {
                if (next.group().equals("<div")) {
                    i10++;
                } else if (next.group().equals("</div>")) {
                    i10--;
                }
                if (i10 == 0) {
                    break;
                }
            }
            if (next.group().contains(str2)) {
                z10 = true;
                i10++;
            } else {
                next = matchResult;
            }
            matchResult = next;
        }
        if (matchResult == null || next == null) {
            return str;
        }
        String strSubstring = str.substring((matchResult.start() - "<div".length()) - 1, next.end());
        Logger.d(f52129l, "find app icon url  remove element by className removing this matched string : " + strSubstring);
        return str.replace(strSubstring, "");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public View h(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() > 0) {
                View childAt = viewGroup.getChildAt(0);
                Logger.d(f52129l, "handle native ad reflection - found admob native view: " + childAt);
                return childAt;
            }
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean k(String str) {
        return false;
    }
}
