package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class Oe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f30089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f30091c;

    public Oe(String str, String str2, JSONObject jSONObject) {
        this.f30089a = str;
        this.f30090b = str2;
        this.f30091c = jSONObject;
    }

    public JSONObject a() {
        return this.f30091c;
    }

    public String b() {
        return this.f30090b;
    }

    public String c() {
        return this.f30089a;
    }
}
