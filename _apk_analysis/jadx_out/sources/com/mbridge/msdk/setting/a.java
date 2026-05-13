package com.mbridge.msdk.setting;

import org.json.JSONObject;

/* JADX INFO: compiled from: BCP.java */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f39592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f39593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f39594g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39588a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39589b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39590c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f39591d = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f39595h = 0;

    public static a a(String str) {
        Exception e10;
        a aVar;
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
            aVar = new a();
        } catch (Exception e11) {
            e10 = e11;
            aVar = null;
        }
        try {
            aVar.b(jSONObject.optString("http_domain", com.mbridge.msdk.foundation.same.net.utils.d.h().f37838h));
            aVar.c(jSONObject.optString("tcp_domain", com.mbridge.msdk.foundation.same.net.utils.d.h().f37842l));
            aVar.e(jSONObject.optInt("tcp_port", com.mbridge.msdk.foundation.same.net.utils.d.h().f37846p));
            aVar.f(jSONObject.optInt("type", 0));
            aVar.a(jSONObject.optInt("batch_size", 1));
            aVar.c(jSONObject.optInt("duration", 0));
            aVar.b(jSONObject.optInt("disable", 0));
            aVar.d(jSONObject.optInt("e_t_l", 0));
        } catch (Exception e12) {
            e10 = e12;
            e10.printStackTrace();
        }
        return aVar;
    }

    public int a() {
        return this.f39588a;
    }

    public void a(int i10) {
        if (i10 < 1) {
            i10 = 1;
        }
        this.f39588a = i10;
    }

    public int b() {
        return this.f39589b;
    }

    public void b(int i10) {
        this.f39589b = i10;
    }

    public void b(String str) {
        this.f39592e = str;
    }

    public int c() {
        return this.f39590c;
    }

    public void c(int i10) {
        this.f39590c = i10;
    }

    public void c(String str) {
        this.f39593f = str;
    }

    public int d() {
        return this.f39591d;
    }

    public void d(int i10) {
        this.f39591d = i10;
    }

    public String e() {
        return this.f39592e;
    }

    public void e(int i10) {
        this.f39594g = i10;
    }

    public String f() {
        return this.f39593f;
    }

    public void f(int i10) {
        this.f39595h = i10;
    }

    public int g() {
        return this.f39594g;
    }

    public int h() {
        return this.f39595h;
    }
}
