package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C4135m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IronSource.a f32246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private NetworkSettings f32248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f32250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private JSONObject f32251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f32252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f32253h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f32254i;

    public C4135m0(IronSource.a aVar, String str, int i10, JSONObject jSONObject, String str2, int i11, String str3, NetworkSettings networkSettings, int i12) {
        this.f32246a = aVar;
        this.f32247b = str;
        this.f32250e = i10;
        this.f32251f = jSONObject;
        this.f32252g = str2;
        this.f32253h = i11;
        this.f32254i = str3;
        this.f32248c = networkSettings;
        this.f32249d = i12;
    }

    public IronSource.a a() {
        return this.f32246a;
    }

    public String b() {
        return this.f32254i;
    }

    public String c() {
        return this.f32252g;
    }

    public int d() {
        return this.f32253h;
    }

    public JSONObject e() {
        return this.f32251f;
    }

    public int f() {
        return this.f32249d;
    }

    public NetworkSettings g() {
        return this.f32248c;
    }

    public int h() {
        return this.f32250e;
    }

    public String i() {
        return this.f32247b;
    }
}
