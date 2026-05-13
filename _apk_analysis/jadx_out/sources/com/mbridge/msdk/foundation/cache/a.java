package com.mbridge.msdk.foundation.cache;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.j;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: BaseCandidateCache.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f37323e = "BaseCandidateCache";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f37324f = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.mbridge.msdk.foundation.db.c f37325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONArray f37326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f37327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f37328d;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.cache.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseCandidateCache.java */
    public class C0436a implements Comparator<b> {
        public C0436a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return Double.compare(bVar.f37331b, bVar2.f37331b);
        }
    }

    /* JADX INFO: compiled from: BaseCandidateCache.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.foundation.cache.b f37330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private double f37331b;

        public b(double d10, com.mbridge.msdk.foundation.cache.b bVar) {
            this.f37331b = d10;
            this.f37330a = bVar;
        }

        public com.mbridge.msdk.foundation.cache.b a() {
            return this.f37330a;
        }
    }

    private String a(String str, int i10, String str2, String str3) {
        if (TextUtils.isEmpty(str) || str.contains("ca_sce") || str.contains("real_rid") || str.contains("real_bp")) {
            return str;
        }
        if (c1.c(str) > 0) {
            return str + "&ca_sce=" + i10 + "&real_rid=" + str2 + "&real_bp=" + str3;
        }
        return str + "?ca_sce=" + i10 + "&real_rid=" + str2 + "&real_bp=" + str3;
    }

    private String a(Map<Integer, String> map, int i10, String str, String str2) {
        if (map == null || map.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                String value = entry.getValue();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(CampaignEx.JSON_AD_IMP_KEY, entry.getKey());
                jSONObject.put("url", a(value, i10, str, str2));
                jSONArray.put(jSONObject);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return jSONArray.toString();
    }

    private List<String> a(List<String> list, int i10, String str, String str2) {
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            arrayList.add(a(list.get(i11), i10, str, str2));
        }
        return arrayList;
    }

    private String[] a(String[] strArr, int i10, String str, String str2) {
        if (strArr == null || strArr.length == 0) {
            return strArr;
        }
        String[] strArr2 = new String[strArr.length];
        for (int i11 = 0; i11 < strArr.length; i11++) {
            strArr2[i11] = a(strArr[i11], i10, str, str2);
        }
        return strArr2;
    }

    private List<Map<Integer, String>> b(List<Map<Integer, String>> list, int i10, String str, String str2) {
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            Map<Integer, String> map = list.get(i11);
            if (map != null && map.size() > 0) {
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    map.put(entry.getKey(), a(entry.getValue(), i10, str, str2));
                }
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    public long a(List<CampaignEx> list, String str) {
        if (list == null || list.size() == 0) {
            return 0L;
        }
        String ecppv = list.get(0).getEcppv();
        if (TextUtils.isEmpty(ecppv)) {
            return 0L;
        }
        String strA = k0.a(ecppv);
        if (TextUtils.isEmpty(strA)) {
            return 0L;
        }
        try {
            if (Double.parseDouble(strA) <= 0.0d) {
                return 0L;
            }
            JSONObject jSONObjectC = c(d(str));
            int iOptInt = jSONObjectC != null ? jSONObjectC.optInt("max_cache_num", 20) : 20;
            com.mbridge.msdk.foundation.db.c cVar = this.f37325a;
            if (cVar == null || iOptInt <= 0) {
                return -1L;
            }
            return cVar.a(list, this.f37328d);
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1L;
        }
    }

    public c a() {
        JSONArray jSONArray;
        c cVar = new c();
        try {
            jSONArray = this.f37326b;
        } catch (Exception unused) {
            cVar.d("checkConfigAndDB exception");
            cVar.a(c.f37344k);
        }
        if (jSONArray != null && jSONArray.length() != 0) {
            if (this.f37325a == null) {
                cVar.d("db error");
                cVar.a(c.f37344k);
                return cVar;
            }
            return cVar;
        }
        cVar.d("setting config is null");
        cVar.a(c.f37342i);
        return cVar;
    }

    public c a(String str) {
        c cVar = new c();
        if (TextUtils.isEmpty(str) || str.split("_").length <= 3 || TextUtils.isEmpty(str.split("_")[3])) {
            cVar.d("bid token exception");
            cVar.a(c.f37342i);
            return cVar;
        }
        JSONArray jSONArray = this.f37326b;
        if (jSONArray == null || jSONArray.length() == 0) {
            cVar.d("config is empty");
            cVar.a(c.f37342i);
            return cVar;
        }
        String strA = k0.a(str.split("_")[3]);
        if (TextUtils.isEmpty(strA)) {
            cVar.d("bid token exception:decode error");
            cVar.a(c.f37342i);
            return cVar;
        }
        String[] strArrSplit = strA.split("\\|");
        if (strArrSplit.length == 0) {
            cVar.d("bid token can not get bid price");
            cVar.a(c.f37342i);
            return cVar;
        }
        if (strArrSplit.length > 0) {
            try {
                Double.parseDouble(strArrSplit[0]);
            } catch (Exception unused) {
                cVar.d("bid token can not cast bid price");
                cVar.a(c.f37342i);
                return cVar;
            }
        }
        if (TextUtils.isEmpty(this.f37328d)) {
            cVar.d("unitId is empty");
            cVar.a(c.f37344k);
        }
        return cVar;
    }

    public List<com.mbridge.msdk.foundation.cache.b> a(int i10, long j10) {
        if (i10 >= 0) {
            a(i10);
        }
        com.mbridge.msdk.foundation.db.c cVar = this.f37325a;
        if (cVar != null) {
            return cVar.a(this.f37328d, j10);
        }
        return null;
    }

    public void a(int i10) {
        com.mbridge.msdk.foundation.db.c cVar = this.f37325a;
        if (cVar != null) {
            cVar.a(this.f37328d, i10);
            a(f37324f, 1, null, true, "", "", i10, this.f37328d);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0199 A[Catch: Exception -> 0x01ac, TryCatch #2 {Exception -> 0x01ac, blocks: (B:3:0x0011, B:7:0x002e, B:9:0x0066, B:12:0x0076, B:14:0x007c, B:17:0x0083, B:19:0x008e, B:22:0x0095, B:24:0x009b, B:26:0x00a3, B:28:0x00b3, B:30:0x00fe, B:37:0x0114, B:41:0x011d, B:43:0x0123, B:45:0x0131, B:46:0x0135, B:48:0x0140, B:50:0x0146, B:52:0x014e, B:54:0x0159, B:56:0x016b, B:65:0x0187, B:67:0x018f, B:69:0x0199, B:70:0x019e, B:57:0x0170, B:31:0x0103), top: B:79:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r17, int r18, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r19, boolean r20, java.lang.String r21, java.lang.String r22, int r23, java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.cache.a.a(int, int, java.util.List, boolean, java.lang.String, java.lang.String, int, java.lang.String):void");
    }

    public void a(String str, String str2, int i10, String str3) {
        try {
            if (this.f37325a == null || TextUtils.isEmpty(str3)) {
                return;
            }
            if (i10 == 1) {
                this.f37325a.a(str2, str, this.f37328d, i10);
                a(f37324f, 3, null, true, str2, str, -1, this.f37328d);
            } else if (i10 == 2) {
                this.f37325a.a(this.f37328d, str2, str);
                a(f37324f, 1, null, true, str2, str, -1, this.f37328d);
            } else if (i10 == 3) {
                this.f37325a.b(str2, str, this.f37328d);
                a(f37324f, 4, null, true, str2, str, -1, this.f37328d);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(List<b> list, int i10) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    Collections.sort(list, new C0436a());
                    int size = list.size() - i10;
                    if (size > 0) {
                        List<b> listSubList = list.subList(0, size);
                        if (this.f37325a == null || listSubList.size() <= 0) {
                            return;
                        }
                        for (int i11 = 0; i11 < listSubList.size(); i11++) {
                            com.mbridge.msdk.foundation.cache.b bVar = listSubList.get(i11).f37330a;
                            this.f37325a.a(this.f37328d, bVar.e(), bVar.d());
                            a(f37324f, 1, null, true, bVar.e(), bVar.d(), -1, this.f37328d);
                        }
                    }
                }
            } catch (Exception e10) {
                q0.a(f37323e, e10);
            }
        }
    }

    public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str, int i10, String str2, int i11, double d10) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        CampaignEx campaignEx = list.get(i12);
                        campaignEx.setReadyState(0);
                        if (cVar != null) {
                            campaignEx.setNLRid(cVar.t());
                        }
                        campaignEx.setNRid(str);
                        campaignEx.setReasond(str2);
                        campaignEx.setTyped(i10);
                        String strB = k0.b(d10 + "");
                        campaignEx.setNoticeUrl(a(campaignEx.getNoticeUrl(), i11, str, strB));
                        campaignEx.setClickURL(a(campaignEx.getClickURL(), i11, str, strB));
                        campaignEx.setImpressionURL(a(campaignEx.getImpressionURL(), i11, str, strB));
                        campaignEx.setOnlyImpressionURL(a(campaignEx.getOnlyImpressionURL(), i11, str, strB));
                        campaignEx.setAdvImp(a(campaignEx.getAdvImpList(), i11, str, strB));
                        j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                        if (nativeVideoTracking != null) {
                            nativeVideoTracking.d(a(nativeVideoTracking.i(), i11, str, strB));
                            nativeVideoTracking.c(a(nativeVideoTracking.h(), i11, str, strB));
                            nativeVideoTracking.k(a(nativeVideoTracking.p(), i11, str, strB));
                            nativeVideoTracking.s(a(nativeVideoTracking.y(), i11, str, strB));
                            nativeVideoTracking.a(a(nativeVideoTracking.d(), i11, str, strB));
                            nativeVideoTracking.b(a(nativeVideoTracking.g(), i11, str, strB));
                            nativeVideoTracking.e(a(nativeVideoTracking.j(), i11, str, strB));
                            nativeVideoTracking.t(a(nativeVideoTracking.z(), i11, str, strB));
                            nativeVideoTracking.u(a(nativeVideoTracking.z(), i11, str, strB));
                            nativeVideoTracking.v(a(nativeVideoTracking.B(), i11, str, strB));
                            nativeVideoTracking.f(a(nativeVideoTracking.k(), i11, str, strB));
                            nativeVideoTracking.g(a(nativeVideoTracking.l(), i11, str, strB));
                            nativeVideoTracking.h(a(nativeVideoTracking.m(), i11, str, strB));
                            nativeVideoTracking.i(a(nativeVideoTracking.n(), i11, str, strB));
                            nativeVideoTracking.j(a(nativeVideoTracking.o(), i11, str, strB));
                            nativeVideoTracking.l(a(nativeVideoTracking.q(), i11, str, strB));
                            nativeVideoTracking.q(a(nativeVideoTracking.w(), i11, str, strB));
                            nativeVideoTracking.m(a(nativeVideoTracking.r(), i11, str, strB));
                            nativeVideoTracking.r(a(nativeVideoTracking.x(), i11, str, strB));
                            nativeVideoTracking.n(a(nativeVideoTracking.s(), i11, str, strB));
                            nativeVideoTracking.a(b(nativeVideoTracking.t(), i11, str, strB));
                            nativeVideoTracking.p(a(nativeVideoTracking.v(), i11, str, strB));
                            nativeVideoTracking.o(a(nativeVideoTracking.u(), i11, str, strB));
                            campaignEx.setNativeVideoTracking(nativeVideoTracking);
                            campaignEx.setNativeVideoTrackingString(CampaignEx.object2TrackingStr(nativeVideoTracking));
                        }
                        campaignEx.setPv_urls(a(campaignEx.getPv_urls(), i11, str, strB));
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public void a(JSONArray jSONArray) {
        this.f37326b = jSONArray;
    }

    public double b(String str) {
        c cVarA = a(str);
        if (cVarA != null && cVarA.g() != c.f37344k && cVarA.g() != c.f37342i) {
            try {
                String[] strArrSplit = k0.a(str.split("_")[3]).split("\\|");
                if (strArrSplit.length > 0) {
                    return Double.parseDouble(strArrSplit[0]);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return -1.0d;
    }

    public JSONObject c(String str) {
        JSONArray jSONArray = this.f37326b;
        if (jSONArray == null) {
            return null;
        }
        if (jSONArray.length() <= 1) {
            return this.f37326b.optJSONObject(0);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (int i10 = 0; i10 < this.f37326b.length(); i10++) {
            try {
                JSONObject jSONObjectOptJSONObject = this.f37326b.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null && str.equals(jSONObjectOptJSONObject.getString("g"))) {
                    this.f37327c = jSONObjectOptJSONObject;
                    return jSONObjectOptJSONObject;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    public String d(String str) {
        c cVarA = a(str);
        if (cVarA != null && cVarA.g() != c.f37344k && cVarA.g() != c.f37342i) {
            String[] strArrSplit = k0.a(str.split("_")[3]).split("\\|");
            if (strArrSplit.length > 1) {
                return strArrSplit[1];
            }
        }
        return "";
    }

    public void e(String str) {
        this.f37328d = str;
    }
}
