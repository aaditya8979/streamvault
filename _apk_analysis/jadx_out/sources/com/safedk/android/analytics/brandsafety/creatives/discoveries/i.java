package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.MolocoCreativeInfo;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class i extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f52321b = "MolocoDiscovery";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f52322c = "com.applovin.mediation.adapters.MolocoMediationAdapter";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<String, CreativeInfo> f52323d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f52324e = "adsmoloco.com";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f52325f = "androidx.compose.ui.platform.ComposeView";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f52326g = "seatbid";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f52327h = "bid";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f52328i = "crid";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f52329j = "bundle";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f52330k = "iurl";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f52331l = "adomain";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f52332w = "adid";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f52333x = "adm";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f52334y = "info";

    public i() {
        super(g.D, f52321b, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
        this.f52208p.b(AdNetworkConfiguration.SHOULD_ALLOW_REFLECTION_ON_OS_CLASSES, true);
        this.f52208p.b(AdNetworkConfiguration.AD_NETWORK_TO_IGNORE, "MOLOCO_NETWORK");
        this.f52208p.b(AdNetworkConfiguration.SHOULD_COPY_BITMAP_USING_PIXELCOPY, true);
    }

    private static String a(ArrayList<String> arrayList) {
        String strL;
        String str = null;
        if (arrayList == null) {
            return null;
        }
        for (String str2 : arrayList) {
            if (str2.contains(f52324e)) {
                strL = l(str2);
                if (!TextUtils.isEmpty(strL)) {
                    return strL;
                }
            } else {
                strL = str;
            }
            str = strL;
        }
        return str;
    }

    private static String l(String str) {
        String strC = k.c(str, f52334y);
        if (TextUtils.isEmpty(strC)) {
            strC = k.c(k.E(str), f52334y);
        }
        if (!TextUtils.isEmpty(strC)) {
            Logger.d(f52321b, "get ad id from resource - found adId= " + strC);
        }
        return strC;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo a(Object obj) {
        return f52323d.get(obj.toString());
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        return str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(String str, String str2, WeakReference<WebView> weakReference) {
        return l(str);
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
    protected List<CreativeInfo> b(String str, String str2, Map<String, List<String>> map, c.a aVar) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONArray jSONArrayOptJSONArray;
        ArrayList<String> arrayList;
        boolean z10;
        Logger.d(f52321b, "generate info - started, url= " + str);
        try {
            jSONObject = new JSONObject(com.safedk.android.utils.c.a(Base64.decode(str2, 0)));
        } catch (JSONException e10) {
            Logger.d(f52321b, "generate info - not a valid JSON string: " + e10.getMessage());
            jSONObject = null;
        } catch (Throwable th2) {
            Logger.d(f52321b, "generate info - not a valid JSON string: " + th2.getMessage(), th2);
            jSONObject = null;
        }
        if (jSONObject == null) {
            Logger.d(f52321b, "generate info - obj is null, skipping.");
            return null;
        }
        Logger.d(f52321b, "generate info - obj= " + jSONObject);
        BrandSafetyUtils.AdType adType = BrandSafetyUtils.AdType.INTERSTITIAL;
        String str3 = null;
        String str4 = null;
        if (aVar != null) {
            str3 = aVar.f52180c;
            str4 = aVar.f52178a;
            if (aVar.f52179b.name().equals("BANNER") || aVar.f52179b.name().equals(BrandSafetyUtils.f51657n)) {
                adType = BrandSafetyUtils.AdType.BANNER;
            }
        }
        try {
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(f52326g);
            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0 && (jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(0)) != null && (jSONArrayOptJSONArray = jSONObject2.optJSONArray("bid")) != null && jSONArrayOptJSONArray.length() > 0) {
                JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(0);
                Logger.d(f52321b, "generate info - bid= " + jSONObject3);
                if (jSONObject3 != null) {
                    String strOptString = jSONObject3.optString(f52328i);
                    Logger.d(f52321b, "generate info - creativeId= " + strOptString);
                    String strOptString2 = jSONObject3.optString("bundle");
                    Logger.d(f52321b, "generate info - bundle= " + strOptString2);
                    Logger.d(f52321b, "generate info - iurl= " + jSONObject3.optString(f52330k));
                    JSONArray jSONArrayOptJSONArray3 = jSONObject3.optJSONArray(f52331l);
                    Logger.d(f52321b, "generate info - adomainArray= " + jSONArrayOptJSONArray3);
                    String strOptString3 = jSONObject3.optString(f52332w);
                    String strOptString4 = jSONObject3.optString("adm");
                    Logger.d(f52321b, "generate info - adm= " + strOptString4);
                    boolean z11 = false;
                    String str5 = null;
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    if (TextUtils.isEmpty(strOptString4)) {
                        arrayList = arrayList2;
                        z10 = false;
                    } else {
                        ArrayList<String> arrayListG = k.g(strOptString4);
                        if (k.a(com.safedk.android.utils.f.c(), strOptString4, 1) != null) {
                            str5 = "vast";
                            z11 = true;
                        } else {
                            str5 = "mraid";
                        }
                        strOptString3 = a(arrayListG);
                        arrayList = arrayListG;
                        z10 = z11;
                    }
                    Logger.d(f52321b, "generate info - adId= " + strOptString3);
                    MolocoCreativeInfo molocoCreativeInfo = new MolocoCreativeInfo(adType, g.D, strOptString3, strOptString, str5, this.f52211t, str3, strOptString2, (jSONArrayOptJSONArray3 == null || jSONArrayOptJSONArray3.length() <= 0) ? null : jSONArrayOptJSONArray3.getString(0), str4);
                    if (z10) {
                        a((CreativeInfo) molocoCreativeInfo, (String) null, strOptString4, true);
                    } else {
                        molocoCreativeInfo.b((List<String>) arrayList);
                    }
                    f52323d.put(strOptString3, molocoCreativeInfo);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(molocoCreativeInfo);
                    Logger.d(f52321b, "generate info - creativeInfo= " + molocoCreativeInfo);
                    return arrayList3;
                }
            }
        } catch (Exception e11) {
            Logger.d(f52321b, "generate info - exception while parsing prefetch: " + e11);
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean b(View view) {
        return j(view);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean b(String str, Bundle bundle) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String c(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                return a(k.g(str));
            }
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String f() {
        return f52322c;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean f(View view) {
        return f52325f.equals(view.getClass().getName());
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public void i() {
        super.i();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String k() {
        return g.D;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean k(String str) {
        return str.contains(f52324e);
    }
}
