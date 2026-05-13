package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.i4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C4068i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f31930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f31931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f31932d;

    public C4068i4(String str) {
        this.f31929a = str;
    }

    public C4068i4(String str, String str2, String str3) {
        this.f31929a = str;
        this.f31931c = str2;
        this.f31932d = str3;
    }

    public C4068i4(String str, JSONObject jSONObject) {
        this.f31929a = str;
        this.f31930b = jSONObject;
    }

    public C4068i4(String str, JSONObject jSONObject, String str2, String str3) {
        this.f31929a = str;
        this.f31930b = jSONObject;
        this.f31931c = str2;
        this.f31932d = str3;
    }

    public String a() {
        return this.f31932d;
    }

    public String b() {
        return this.f31929a;
    }

    public JSONObject c() {
        return this.f31930b;
    }

    public String d() {
        return this.f31931c;
    }
}
