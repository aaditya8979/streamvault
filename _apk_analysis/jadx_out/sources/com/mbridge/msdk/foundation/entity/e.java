package com.mbridge.msdk.foundation.entity;

import android.text.TextUtils;
import com.ironsource.C3978d4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: ClickTime.java */
/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f37536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f37537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f37538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f37539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f37540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f37541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f37542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f37543h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f37544i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f37545j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f37546k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f37547l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f37548m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f37549n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f37550o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f37551p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f37552q;

    public static ArrayList<JSONObject> a(List<e> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList<JSONObject> arrayList = new ArrayList<>();
        for (e eVar : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ImpressionLog.f51754x, eVar.n());
                jSONObject.put("rid_n", eVar.o());
                jSONObject.put("cid", eVar.a());
                jSONObject.put("click_type", eVar.c());
                jSONObject.put("type", eVar.p());
                jSONObject.put("click_duration", eVar.d());
                jSONObject.put("key", "2000013");
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, eVar.q());
                jSONObject.put("last_url", eVar.j());
                jSONObject.put("content", eVar.f());
                jSONObject.put("code", eVar.e());
                jSONObject.put("exception", eVar.g());
                jSONObject.put("header", eVar.h());
                jSONObject.put(CampaignEx.JSON_KEY_LANDING_TYPE, eVar.i());
                jSONObject.put(CampaignEx.JSON_KEY_LINK_TYPE, eVar.k());
                jSONObject.put("click_time", eVar.b());
                if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_type", eVar.m());
                    jSONObject.put("network_str", eVar.l());
                }
                String strQ = eVar.q();
                if (!TextUtils.isEmpty(strQ)) {
                    String str = com.mbridge.msdk.foundation.controller.a.f37355r.get(strQ);
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put("u_stid", str);
                }
                arrayList.add(jSONObject);
            } catch (Throwable th2) {
                q0.b("ClickTime", th2.getMessage());
            }
        }
        return arrayList;
    }

    public static JSONObject a(e eVar) {
        if (eVar == null) {
            return null;
        }
        String strJ = eVar.j();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ImpressionLog.f51754x, eVar.n());
            jSONObject.put("rid_n", eVar.o());
            jSONObject.put("click_type", eVar.c());
            jSONObject.put("type", eVar.p());
            jSONObject.put("cid", eVar.a());
            jSONObject.put("click_duration", eVar.d());
            jSONObject.put("key", "2000012");
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, eVar.q());
            jSONObject.put("last_url", strJ);
            jSONObject.put("code", eVar.e());
            jSONObject.put("exception", eVar.g());
            jSONObject.put(CampaignEx.JSON_KEY_LANDING_TYPE, eVar.i());
            jSONObject.put(CampaignEx.JSON_KEY_LINK_TYPE, eVar.k());
            jSONObject.put("click_time", eVar.b());
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("network_type", eVar.m());
                jSONObject.put("network_str", eVar.l());
            }
            return jSONObject;
        } catch (Throwable th2) {
            q0.b("ClickTime", th2.getMessage());
            return null;
        }
    }

    public String a() {
        return this.f37536a;
    }

    public void a(int i10) {
        this.f37539d = i10;
    }

    public void a(String str) {
        this.f37536a = str;
    }

    public String b() {
        return this.f37538c;
    }

    public void b(int i10) {
        this.f37540e = i10;
    }

    public void b(String str) {
        this.f37538c = str;
    }

    public int c() {
        return this.f37539d;
    }

    public void c(int i10) {
        this.f37544i = i10;
    }

    public void c(String str) {
        this.f37537b = str;
    }

    public String d() {
        return this.f37537b;
    }

    public void d(int i10) {
        this.f37546k = i10;
    }

    public void d(String str) {
        this.f37541f = str;
    }

    public int e() {
        return this.f37540e;
    }

    public void e(int i10) {
        this.f37548m = i10;
    }

    public void e(String str) {
        this.f37542g = str;
    }

    public String f() {
        return this.f37541f;
    }

    public void f(int i10) {
        this.f37551p = i10;
    }

    public void f(String str) {
        this.f37543h = str;
    }

    public String g() {
        return this.f37542g;
    }

    public void g(String str) {
        this.f37545j = str;
    }

    public String h() {
        return this.f37543h;
    }

    public void h(String str) {
        this.f37547l = str;
    }

    public int i() {
        return this.f37544i;
    }

    public void i(String str) {
        this.f37549n = str;
    }

    public String j() {
        return this.f37545j;
    }

    public void j(String str) {
        this.f37550o = str;
    }

    public int k() {
        return this.f37546k;
    }

    public void k(String str) {
        this.f37552q = str;
    }

    public String l() {
        return this.f37547l;
    }

    public int m() {
        return this.f37548m;
    }

    public String n() {
        return this.f37549n;
    }

    public String o() {
        return this.f37550o;
    }

    public int p() {
        return this.f37551p;
    }

    public String q() {
        return this.f37552q;
    }

    public String toString() {
        return "ClickTime [campaignId=" + this.f37536a + ", click_duration=" + this.f37537b + ", lastUrl=" + this.f37545j + ", code=" + this.f37540e + ", excepiton=" + this.f37542g + ", header=" + this.f37543h + ", content=" + this.f37541f + ", type=" + this.f37551p + ", click_type=" + this.f37539d + C3978d4.j.f31385e;
    }
}
