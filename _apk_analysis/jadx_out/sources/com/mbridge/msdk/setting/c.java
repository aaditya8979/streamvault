package com.mbridge.msdk.setting;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: BaseUnitSetting.java */
/* JADX INFO: loaded from: classes3.dex */
public class c {
    private String A;
    private int D;
    private int E;
    private int I;
    private String K;
    private int N;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Integer> f39664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Integer> f39665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f39666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f39667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f39668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f39669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f39670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f39671i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f39673k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f39674l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f39675m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f39676n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f39677o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f39678p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f39679q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f39680r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f39681s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f39682t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f39683u;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f39688z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f39663a = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f39672j = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f39684v = 30;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f39685w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f39686x = 10;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f39687y = 60;
    private int B = 1;
    private String C = "";
    private int F = 100;
    private int G = 60;
    private int H = 5000;
    private int J = 1;
    private String L = "";
    private String M = "";

    public static l a(JSONObject jSONObject) {
        l lVar;
        l lVar2 = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            lVar = new l();
        } catch (Exception e10) {
            e = e10;
        }
        try {
            lVar.e(jSONObject.optString("unitId"));
            lVar.a(jSONObject.optString("ab_id"));
            lVar.f(jSONObject.optString(ImpressionLog.f51754x));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("adSourceList");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.optInt(i10)));
                }
                lVar.a(arrayList);
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("ad_source_timeout");
            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                ArrayList arrayList2 = new ArrayList();
                for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                    arrayList2.add(Integer.valueOf(jSONArrayOptJSONArray2.optInt(i11)));
                }
                lVar.b(arrayList2);
            }
            lVar.x(jSONObject.optInt("tpqn"));
            lVar.c(jSONObject.optInt("aqn"));
            lVar.b(jSONObject.optInt("acn"));
            lVar.z(jSONObject.optInt("wt"));
            int i12 = 1;
            lVar.o(jSONObject.optInt("iscasf", 1));
            lVar.w(jSONObject.optInt("spmxrt", 5000));
            lVar.c(jSONObject.optLong("current_time"));
            lVar.r(jSONObject.optInt(TypedValues.CycleType.S_WAVE_OFFSET));
            lVar.d(jSONObject.optLong("dlct", 3600L));
            lVar.d(jSONObject.optInt("autoplay", 0));
            lVar.k(jSONObject.optInt("dlnet", 2));
            lVar.c(jSONObject.optString("no_offer"));
            lVar.f(jSONObject.optInt("cb_type"));
            lVar.b(jSONObject.optLong("clct", 86400L));
            lVar.a(jSONObject.optLong("clcq", 300L));
            lVar.u(jSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100));
            lVar.g(jSONObject.optInt("cd_rate", 0));
            lVar.i(jSONObject.optInt("content", 1));
            lVar.m(jSONObject.optInt("impt", 0));
            lVar.l(jSONObject.optInt("icon_type", 1));
            lVar.b(jSONObject.optString("no_ads_url", ""));
            lVar.t(jSONObject.optInt("playclosebtn_tm", -1));
            lVar.s(jSONObject.optInt("play_ctdown", 0));
            lVar.h(jSONObject.optInt("close_alert", 0));
            lVar.n(jSONObject.optInt("intershowlimit", 30));
            lVar.v(jSONObject.optInt("refreshFq", 60));
            lVar.e(jSONObject.optInt("closeBtn", 0));
            int iOptInt = jSONObject.optInt("tmorl", 1);
            if (iOptInt <= 2 && iOptInt > 0) {
                i12 = iOptInt;
            }
            lVar.y(i12);
            lVar.d(jSONObject.optString("placementid", ""));
            lVar.p(jSONObject.optInt("ltafemty", 10));
            lVar.q(jSONObject.optInt("ltorwc", 60));
            lVar.g(jSONObject.optString("vtag", ""));
            return lVar;
        } catch (Exception e11) {
            e = e11;
            lVar2 = lVar;
            e.printStackTrace();
            return lVar2;
        }
    }

    public int A() {
        return this.D;
    }

    public int B() {
        return this.E;
    }

    public int C() {
        return this.F;
    }

    public int D() {
        return this.G;
    }

    public int E() {
        return this.H;
    }

    public int F() {
        return this.I;
    }

    public int G() {
        return this.J;
    }

    public String H() {
        return this.K;
    }

    public String I() {
        return this.L;
    }

    public String J() {
        return this.M;
    }

    public int K() {
        return this.N;
    }

    public int L() {
        return this.f39669g;
    }

    public JSONObject M() {
        JSONObject jSONObject = new JSONObject();
        try {
            List<Integer> listB = b();
            if (listB != null && listB.size() > 0) {
                int size = listB.size();
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < size; i10++) {
                    jSONArray.put(listB.get(i10));
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            List<Integer> listC = c();
            if (listC != null && listC.size() > 0) {
                int size2 = listC.size();
                JSONArray jSONArray2 = new JSONArray();
                for (int i11 = 0; i11 < size2; i11++) {
                    jSONArray2.put(listC.get(i11));
                }
                jSONObject.put("ad_source_timeout", jSONArray2);
            }
            jSONObject.put("tpqn", F());
            jSONObject.put("aqn", f());
            jSONObject.put("acn", e());
            jSONObject.put("wt", K());
            jSONObject.put("current_time", o());
            jSONObject.put(TypedValues.CycleType.S_WAVE_OFFSET, y());
            jSONObject.put("dlct", p());
            jSONObject.put("autoplay", L());
            jSONObject.put("dlnet", q());
            jSONObject.put("no_offer", x());
            jSONObject.put("cb_type", h());
            jSONObject.put("clct", k());
            jSONObject.put("clcq", j());
            jSONObject.put(CampaignEx.JSON_KEY_READY_RATE, C());
            jSONObject.put("content", m());
            jSONObject.put("impt", s());
            jSONObject.put("icon_type", r());
            jSONObject.put("no_ads_url", w());
            jSONObject.put("playclosebtn_tm", B());
            jSONObject.put("play_ctdown", A());
            jSONObject.put("close_alert", l());
            jSONObject.put("closeBtn", g());
            jSONObject.put("refreshFq", D());
            jSONObject.put("countdown", n());
            jSONObject.put("allowSkip", d());
            jSONObject.put("tmorl", G());
            jSONObject.put("unitId", H());
            jSONObject.put("placementid", z());
            jSONObject.put("ltafemty", u());
            jSONObject.put("ltorwc", v());
            jSONObject.put("vtag", J());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }

    public String a() {
        return this.f39663a;
    }

    public void a(int i10) {
        this.f39666d = i10;
    }

    public void a(long j10) {
        this.f39673k = j10;
    }

    public void a(String str) {
        this.f39663a = str;
        com.mbridge.msdk.foundation.controller.a.f37355r.put(this.K, str);
    }

    public void a(List<Integer> list) {
        this.f39664b = list;
    }

    public List<Integer> b() {
        return this.f39664b;
    }

    public void b(int i10) {
        this.f39667e = i10;
    }

    public void b(long j10) {
        this.f39674l = j10;
    }

    public void b(String str) {
        this.f39688z = str;
    }

    public void b(List<Integer> list) {
        this.f39665c = list;
    }

    public List<Integer> c() {
        return this.f39665c;
    }

    public void c(int i10) {
        this.f39668f = i10;
    }

    public void c(long j10) {
        this.f39678p = j10;
    }

    public void c(String str) {
        this.A = str;
    }

    public int d() {
        return this.f39666d;
    }

    public void d(int i10) {
        this.f39669g = i10;
    }

    public void d(long j10) {
        this.f39679q = j10;
    }

    public void d(String str) {
        this.C = str;
    }

    public int e() {
        return this.f39667e;
    }

    public void e(int i10) {
        this.f39670h = i10;
    }

    public void e(String str) {
        this.K = str;
    }

    public int f() {
        return this.f39668f;
    }

    public void f(int i10) {
        this.f39671i = i10;
    }

    public void f(String str) {
        this.L = str;
    }

    public int g() {
        return this.f39670h;
    }

    public void g(int i10) {
        this.f39672j = i10;
    }

    public void g(String str) {
        this.M = str;
    }

    public int h() {
        return this.f39671i;
    }

    public void h(int i10) {
        this.f39675m = i10;
    }

    public int i() {
        return this.f39672j;
    }

    public void i(int i10) {
        this.f39676n = i10;
    }

    public long j() {
        return this.f39673k;
    }

    public void j(int i10) {
        this.f39677o = i10;
    }

    public long k() {
        return this.f39674l;
    }

    public void k(int i10) {
        this.f39680r = i10;
    }

    public int l() {
        return this.f39675m;
    }

    public void l(int i10) {
        this.f39682t = i10;
    }

    public int m() {
        return this.f39676n;
    }

    public void m(int i10) {
        this.f39683u = i10;
    }

    public int n() {
        return this.f39677o;
    }

    public void n(int i10) {
        this.f39684v = i10;
    }

    public long o() {
        return this.f39678p;
    }

    public void o(int i10) {
        this.f39685w = i10;
    }

    public long p() {
        return this.f39679q;
    }

    public void p(int i10) {
        this.f39686x = i10;
    }

    public int q() {
        return this.f39680r;
    }

    public void q(int i10) {
        this.f39687y = i10;
    }

    public int r() {
        return this.f39682t;
    }

    public void r(int i10) {
        this.B = i10;
    }

    public int s() {
        return this.f39683u;
    }

    public void s(int i10) {
        this.D = i10;
    }

    public int t() {
        return this.f39685w;
    }

    public void t(int i10) {
        this.E = i10;
    }

    public String toString() {
        List<Integer> list = this.f39664b;
        String str = "";
        if (list != null && list.size() > 0) {
            Iterator<Integer> it = this.f39664b.iterator();
            while (it.hasNext()) {
                str = str + it.next() + StringUtils.COMMA;
            }
        }
        return "offset = " + y() + " unitId = " + this.K + " fbPlacementId = " + this.f39681s + str;
    }

    public int u() {
        return this.f39686x;
    }

    public void u(int i10) {
        this.F = i10;
    }

    public int v() {
        return this.f39687y;
    }

    public void v(int i10) {
        this.G = i10;
    }

    public String w() {
        return this.f39688z;
    }

    public void w(int i10) {
        this.H = i10;
    }

    public String x() {
        return this.A;
    }

    public void x(int i10) {
        this.I = i10;
    }

    public int y() {
        return this.B;
    }

    public void y(int i10) {
        this.J = i10;
    }

    public String z() {
        return this.C;
    }

    public void z(int i10) {
        this.N = i10;
    }
}
