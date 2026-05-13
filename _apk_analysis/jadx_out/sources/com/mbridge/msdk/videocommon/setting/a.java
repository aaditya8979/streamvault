package com.mbridge.msdk.videocommon.setting;

import android.text.TextUtils;
import com.ironsource.Ne;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: RewardSetting.java */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Integer> f42377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, com.mbridge.msdk.videocommon.entity.c> f42378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f42379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f42380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f42381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f42382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f42383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f42384h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f42386j;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f42385i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f42387k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f42388l = "";

    public static a a(String str) {
        a aVar;
        a aVar2 = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                aVar = new a();
            } catch (Exception e10) {
                e = e10;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("caplist");
                aVar.b(jSONObject.optString("ab_id", ""));
                aVar.c(jSONObject.optString(ImpressionLog.f51754x, ""));
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                    HashMap map = new HashMap();
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys != null && itKeys.hasNext()) {
                        String next = itKeys.next();
                        int iIntValue = Integer.valueOf(jSONObjectOptJSONObject.optInt(next, 1000)).intValue();
                        if (!TextUtils.isEmpty(next)) {
                            if (TextUtils.isEmpty(next) || iIntValue != 0) {
                                map.put(next, Integer.valueOf(iIntValue));
                            } else {
                                map.put(next, 1000);
                            }
                        }
                    }
                    aVar.a(map);
                }
                aVar.b(com.mbridge.msdk.videocommon.entity.c.a(jSONObject.optJSONArray("reward")));
                aVar.c(jSONObject.optLong("getpf", 43200L));
                aVar.e(jSONObject.optLong("ruct", 5400L));
                aVar.d(jSONObject.optLong(CampaignEx.JSON_KEY_PLCT, 3600L));
                aVar.b(jSONObject.optLong("dlct", 3600L));
                aVar.f(jSONObject.optLong("vcct", 5L));
                aVar.a(jSONObject.optLong("current_time"));
                aVar.d(jSONObject.optString("vtag", ""));
                return aVar;
            } catch (Exception e11) {
                e = e11;
                aVar2 = aVar;
                e.printStackTrace();
                return aVar2;
            }
        }
        return aVar2;
    }

    public String a() {
        return this.f42386j;
    }

    public void a(int i10) {
        this.f42385i = i10;
    }

    public void a(long j10) {
        this.f42384h = j10;
    }

    public void a(Map<String, Integer> map) {
        this.f42377a = map;
    }

    public long b() {
        return this.f42384h;
    }

    public void b(long j10) {
        this.f42382f = j10;
    }

    public void b(String str) {
        this.f42386j = str;
    }

    public void b(Map<String, com.mbridge.msdk.videocommon.entity.c> map) {
        this.f42378b = map;
    }

    public long c() {
        return this.f42382f;
    }

    public void c(long j10) {
        this.f42379c = j10;
    }

    public void c(String str) {
        this.f42388l = str;
    }

    public long d() {
        return this.f42379c * 1000;
    }

    public void d(long j10) {
        this.f42381e = j10;
    }

    public void d(String str) {
        this.f42387k = str;
    }

    public long e() {
        return this.f42381e * 1000;
    }

    public void e(long j10) {
        this.f42380d = j10;
    }

    public String f() {
        return this.f42388l;
    }

    public void f(long j10) {
        this.f42383g = j10;
    }

    public Map<String, com.mbridge.msdk.videocommon.entity.c> g() {
        return this.f42378b;
    }

    public long h() {
        return this.f42380d * 1000;
    }

    public long i() {
        return this.f42383g;
    }

    public String j() {
        return this.f42387k;
    }

    public JSONObject k() {
        JSONObject jSONObject = new JSONObject();
        try {
            Map<String, Integer> map = this.f42377a;
            if (map != null && map.size() > 0) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, Integer> entry : this.f42377a.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue().intValue());
                    }
                    jSONObject.put("caplist", jSONObject2);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            Map<String, com.mbridge.msdk.videocommon.entity.c> map2 = this.f42378b;
            if (map2 != null && map2.size() > 0) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, com.mbridge.msdk.videocommon.entity.c> entry2 : this.f42378b.entrySet()) {
                        JSONObject jSONObject3 = new JSONObject();
                        String key = entry2.getKey();
                        com.mbridge.msdk.videocommon.entity.c value = entry2.getValue();
                        if (value != null) {
                            jSONObject3.put("name", value.c());
                            jSONObject3.put("amount", value.a());
                            jSONObject3.put("id", key);
                        }
                        jSONArray.put(jSONObject3);
                    }
                    jSONObject.put("reward", jSONArray);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            jSONObject.put("getpf", this.f42379c);
            jSONObject.put("ruct", this.f42380d);
            jSONObject.put(CampaignEx.JSON_KEY_PLCT, this.f42381e);
            jSONObject.put("dlct", this.f42382f);
            jSONObject.put("vcct", this.f42383g);
            jSONObject.put("current_time", this.f42384h);
            jSONObject.put("vtag", this.f42387k);
            jSONObject.put(Ne.f29933h1, this.f42385i);
            return jSONObject;
        } catch (Exception e12) {
            e12.printStackTrace();
            return jSONObject;
        }
    }
}
