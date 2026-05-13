package a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import bp.r0;
import bp.s1;
import bp.v0;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.yk.e.callBack.MainPreloadAdCallback;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import com.yk.e.util.CoreUtils;
import cp.b0;
import cp.g0;
import cp.q;
import cp.w;
import cp.z;
import j.l0;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile d f3422e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f3424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f3425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f3426d;

    public d() {
        HashMap map = new HashMap();
        this.f3423a = map;
        this.f3425c = new HashMap();
        this.f3426d = "";
        map.put(13, "开屏");
        map.put(14, "激励");
        map.put(11, "信息流");
        map.put(16, "插屏");
        map.put(18, "banner");
        map.put(27, "浮屏");
        map.put(28, "暂停插屏");
        map.put(29, "文案信息流");
        map.put(30, "thirdBanner");
        map.put(31, BrandSafetyUtils.f51658o);
    }

    public static int a(a aVar, String str) {
        int size;
        int iG = aVar.g(str);
        v0 v0VarA = v0.a();
        synchronized (v0VarA) {
            try {
                size = v0VarA.f5877a.size();
            } catch (Exception e10) {
                AdLog.e(e10.getMessage(), e10);
                size = 0;
            }
        }
        return iG >= 1 ? iG : size;
    }

    public static a b(int i10) {
        if (i10 == 11) {
            return f.i();
        }
        if (i10 == 16) {
            return k.i();
        }
        if (i10 == 18) {
            return e.i();
        }
        if (i10 == 13) {
            return c.i();
        }
        if (i10 == 14) {
            return l.i();
        }
        if (i10 == 30) {
            return g.i();
        }
        if (i10 != 31) {
            return null;
        }
        return i.i();
    }

    public static d c() {
        if (f3422e == null) {
            synchronized (d.class) {
                if (f3422e == null) {
                    f3422e = new d();
                }
            }
        }
        return f3422e;
    }

    public static l0 e(Activity activity, int i10, String str) {
        l0 b0Var;
        if (i10 == 11) {
            b0Var = new b0(activity, str, null);
        } else if (i10 == 14) {
            b0Var = new g0(activity, str, null);
        } else if (i10 == 16) {
            b0Var = new q(activity, str, null);
        } else if (i10 == 18) {
            b0Var = new cp.i(activity, str, null);
        } else if (i10 == 30) {
            b0Var = new z(activity, str, null);
        } else {
            if (i10 != 31) {
                return null;
            }
            b0Var = new w(activity, str, null);
        }
        return b0Var;
    }

    public static JSONArray f(String str, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("adList");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            AdLog.i("AdCacheRefreshUtils", "getAdApiInfo, " + str + ", adList is empty");
            return null;
        }
        JSONArray jSONArrayF = r0.f(jSONArrayOptJSONArray);
        if (jSONArrayF.length() > 0) {
            return jSONArrayF;
        }
        AdLog.i("AdCacheRefreshUtils", "getAdApiInfo, " + str + ", adList does not contain fusion data");
        return null;
    }

    public static JSONObject g(Context context, String str) {
        try {
            byte[] bytesFromAssets = CoreUtils.getBytesFromAssets(context, "okt_sdk_preset_" + str);
            if (bytesFromAssets != null) {
                String str2 = new String(bytesFromAssets, StandardCharsets.UTF_8);
                s1.a().getClass();
                String strB = s1.b(str2);
                if (TextUtils.isEmpty(strB)) {
                    return null;
                }
                return new JSONObject(strB);
            }
        } catch (Exception unused) {
            AdLog.e("AdCacheRefreshUtils, read preset failed");
        }
        return null;
    }

    public final i.c d(Context context, int i10) {
        i.c cVar;
        s1 s1VarA = s1.a();
        s1VarA.getClass();
        cVar = null;
        try {
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
        synchronized (s1VarA.f5869a) {
            cVar = new i.c();
            s1.a().getClass();
            Map<String, ?> all = context.getSharedPreferences(String.format(Constant.fileApiCache, Integer.valueOf(i10)), 0).getAll();
            if (!all.isEmpty()) {
                Iterator<String> it = all.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    String strB = s1.b((String) all.get(next));
                    if (strB.length() > 0) {
                        JSONObject jSONObjectOptJSONObject = new JSONObject(strB).optJSONObject("data");
                        if (jSONObjectOptJSONObject == null) {
                            break;
                        }
                        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("adList");
                        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                            break;
                        }
                        JSONArray jSONArrayF = r0.f(jSONArrayOptJSONArray);
                        AdLog.i("ac head, key=" + i10);
                        if (jSONArrayF.length() > 0) {
                            cVar.f63641b = next;
                            cVar.f63642c = jSONArrayF;
                            break;
                        }
                    }
                }
            }
            cVar = null;
        }
        if (cVar != null && cVar.f63642c != null) {
            AdLog.i("AdCacheRefreshUtils", "getAdApiCacheInfo4Preload from sp");
            return cVar;
        }
        AdLog.i("AdCacheRefreshUtils", "getAdApiCacheInfo4Preload from local");
        List<i.c> list = (List) this.f3425c.get(String.valueOf(i10));
        if (list != null && list.size() > 0) {
            for (i.c cVar2 : list) {
                if (r0.f(cVar2.f63642c).length() > 0) {
                    break;
                }
            }
        }
        return cVar2;
    }

    public final void h(int i10, MainPreloadAdCallback mainPreloadAdCallback) {
        WeakReference weakReference = this.f3424b;
        if (weakReference == null || weakReference.get() == null) {
            AdLog.i("AdCacheRefreshUtils", "preloadAd, activityWR is null");
            AdLog.ad("preloadAd, activityWR is null");
            if (mainPreloadAdCallback != null) {
                mainPreloadAdCallback.onFailed();
                return;
            }
            return;
        }
        if (((Activity) this.f3424b.get()).isFinishing() || ((Activity) this.f3424b.get()).isDestroyed()) {
            AdLog.i("AdCacheRefreshUtils", "preloadAd, activityWR is finish");
            AdLog.ad("preloadAd, activityWR is finish");
            if (mainPreloadAdCallback != null) {
                mainPreloadAdCallback.onFailed();
                return;
            }
            return;
        }
        Activity activity = (Activity) this.f3424b.get();
        try {
            i.c cVarD = d(activity, i10);
            if (cVarD == null) {
                AdLog.i("AdCacheRefreshUtils", "preloadAd fail, ad data is empty!");
                if (mainPreloadAdCallback != null) {
                    mainPreloadAdCallback.onFailed();
                }
            } else {
                JSONArray jSONArray = cVarD.f63642c;
                String str = cVarD.f63641b;
                if (jSONArray == null || jSONArray.length() <= 0) {
                    AdLog.i("AdCacheRefreshUtils", "preloadAd fail, ad data is empty.");
                    if (mainPreloadAdCallback != null) {
                        mainPreloadAdCallback.onFailed();
                    }
                } else if (!"admob".equals(jSONArray.getJSONObject(0).optString("platform", "")) || i10 == 18 || i10 == 11) {
                    j(activity, i10, str, jSONArray, new b(this, mainPreloadAdCallback, i10, str));
                } else {
                    AdLog.i("AdCacheRefreshUtils", "preloadAd fail, admob sdk not start preload through dev");
                    if (mainPreloadAdCallback != null) {
                        mainPreloadAdCallback.onFailed();
                    }
                }
            }
        } catch (Exception e10) {
            b.d.a(e10, new StringBuilder("preloadBannerAd error, msg = "), e10);
            if (mainPreloadAdCallback != null) {
                mainPreloadAdCallback.onFailed();
            }
        }
    }

    public final synchronized void i(int i10, String str) {
        WeakReference weakReference;
        JSONArray jSONArrayF;
        try {
            weakReference = this.f3424b;
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
        if (weakReference != null && weakReference.get() != null) {
            if (!((Activity) this.f3424b.get()).isFinishing() && !((Activity) this.f3424b.get()).isDestroyed()) {
                try {
                    jSONArrayF = f(str, s1.a().c((Context) this.f3424b.get(), i10, str));
                } catch (Exception e11) {
                    AdLog.e(e11.getMessage(), e11);
                }
                if (jSONArrayF == null) {
                    jSONArrayF = null;
                }
                JSONArray jSONArray = jSONArrayF;
                if (jSONArray != null && jSONArray.length() > 0) {
                    a aVarB = b(i10);
                    if (aVarB == null) {
                        AdLog.i("AdCacheRefreshUtils", "loadNextAd, adCache is null");
                        return;
                    }
                    if (aVarB.g(str) >= 1) {
                        AdLog.i("AdCacheRefreshUtils", "loadNextAd, adType = " + ((String) this.f3423a.get(Integer.valueOf(i10))) + ", adPlcID = adPlcID has ad cache size = " + aVarB.g(str));
                        return;
                    }
                    l0 l0VarE = e((Activity) this.f3424b.get(), i10, str);
                    if (l0VarE == null) {
                        AdLog.i("AdCacheRefreshUtils", "loadNextAd, sliceLoader is null");
                        return;
                    }
                    AdLog.i("AdCacheRefreshUtils", "loadNextAd, adType = " + ((String) this.f3423a.get(Integer.valueOf(i10))) + ", adPlcID = " + str);
                    l0VarE.f71916j = true;
                    l0VarE.l(1, jSONArray, 1, 1, new JSONArray());
                    return;
                }
                AdLog.i("AdCacheRefreshUtils", "loadNextAd, adJsonArray is empty");
                return;
            }
            AdLog.i("AdCacheRefreshUtils", "loadNextAd, activityWR is finish");
            return;
        }
        AdLog.i("AdCacheRefreshUtils", "loadNextAd, activityWR is null");
    }

    public final void j(Activity activity, int i10, String str, JSONArray jSONArray, b bVar) {
        int iA;
        if (activity.isFinishing()) {
            AdLog.i("AdCacheRefreshUtils", "refreshAdCache, activity is finishing");
            bVar.onFinish();
            return;
        }
        a aVarB = b(i10);
        if (aVarB == null) {
            AdLog.i("AdCacheRefreshUtils", "refreshAdCache, adCache is null, adType = " + i10);
            bVar.onFinish();
            return;
        }
        if (aVarB.g(str) >= 1) {
            AdLog.i("AdCacheRefreshUtils", "refreshAdCache, adType = " + ((String) this.f3423a.get(Integer.valueOf(i10))) + ", adPlcID = adPlcID has ad cache size = " + aVarB.g(str));
            bVar.onFinish();
            return;
        }
        if (i10 == 14 && (iA = a(aVarB, str)) >= 1) {
            AdLog.i("AdCacheRefreshUtils", "refreshAdCache, adType = " + ((String) this.f3423a.get(Integer.valueOf(i10))) + ", adPlcID = adPlcID has ad cache size = " + iA);
            bVar.onFinish();
            return;
        }
        l0 l0VarE = e(activity, i10, str);
        if (l0VarE != null) {
            AdLog.i("AdCacheRefreshUtils", "refreshAdCache, adType = " + ((String) this.f3423a.get(Integer.valueOf(i10))) + ", adPlcID = " + str);
            l0VarE.f71916j = true;
            l0VarE.f71917k = bVar;
            l0VarE.l(1, jSONArray, 1, 1, new JSONArray());
        }
    }

    public final String k(Context context, int i10) {
        try {
            i.c cVarD = d(context, i10);
            if (cVarD == null) {
                AdLog.i("AdCacheRefreshUtils", "getPreloadAdID fail, ad data is empty!");
                return "";
            }
            JSONArray jSONArray = cVarD.f63642c;
            if (jSONArray != null && jSONArray.length() > 0) {
                return jSONArray.getJSONObject(0).optString("thirdPosID", "");
            }
            AdLog.i("AdCacheRefreshUtils", "getPreloadAdID fail, ad data is empty.");
            return "";
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            return "";
        }
    }

    public final void l(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            AdLog.i("AdCacheRefreshUtils", "parseApiData");
            if (jSONObjectOptJSONObject != null) {
                if (!str.equals(jSONObjectOptJSONObject.optString(InneractiveMediationDefs.REMOTE_KEY_APP_ID, ""))) {
                    AdLog.i("AdCacheRefreshUtils", "parseApiData error, msg = appID is mismatch!!!");
                    return;
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("adList");
                if (jSONObjectOptJSONObject2 != null) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray(next);
                        ArrayList arrayList = new ArrayList();
                        if (jSONArrayOptJSONArray != null) {
                            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                                Iterator<String> itKeys2 = jSONObject2.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray(next2);
                                    i.c cVar = new i.c();
                                    cVar.f63640a = Integer.parseInt(next);
                                    cVar.f63641b = next2;
                                    cVar.f63642c = jSONArrayOptJSONArray2;
                                    arrayList.add(cVar);
                                    if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                                        this.f3426d = jSONArrayOptJSONArray2.getJSONObject(0).optString("platform", "");
                                    }
                                }
                                this.f3425c.put(next, arrayList);
                            }
                        }
                    }
                }
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }
}
