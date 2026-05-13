package com.mbridge.msdk.setting;

import org.json.JSONObject;

/* JADX INFO: compiled from: EventLibMonitorSetting.java */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f39694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f39695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f39696h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39689a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39690b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39691c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f39692d = 30;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f39693e = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f39697i = 0;

    public static d a(String str) {
        Exception e10;
        d dVar;
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
            dVar = new d();
        } catch (Exception e11) {
            e10 = e11;
            dVar = null;
        }
        try {
            dVar.b(jSONObject.optString("h_d", com.mbridge.msdk.foundation.same.net.utils.d.h().f37835f));
            dVar.c(jSONObject.optString("t_d", com.mbridge.msdk.foundation.same.net.utils.d.h().f37841k));
            dVar.c(jSONObject.optInt("t_p", com.mbridge.msdk.foundation.same.net.utils.d.h().f37845o));
            dVar.d(jSONObject.optInt("type", 1));
            dVar.b(jSONObject.optInt("d_t", 30));
            dVar.a(jSONObject.optInt("d_a", 0));
        } catch (Exception e12) {
            e10 = e12;
            e10.printStackTrace();
        }
        return dVar;
    }

    public int a() {
        return this.f39691c;
    }

    public void a(int i10) {
        this.f39691c = i10;
    }

    public int b() {
        return this.f39692d;
    }

    public void b(int i10) {
        this.f39692d = i10;
    }

    public void b(String str) {
        this.f39694f = str;
    }

    public String c() {
        return this.f39694f;
    }

    public void c(int i10) {
        this.f39696h = i10;
    }

    public void c(String str) {
        this.f39695g = str;
    }

    public String d() {
        return this.f39695g;
    }

    public void d(int i10) {
        this.f39697i = i10;
    }

    public int e() {
        return this.f39696h;
    }
}
