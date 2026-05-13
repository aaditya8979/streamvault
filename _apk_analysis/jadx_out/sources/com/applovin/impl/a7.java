package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class a7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f7650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f7651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f7652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f7653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f7654e;

    public enum a {
        TCF_VENDOR,
        ATP_NETWORK,
        OTHER;

        /* JADX INFO: Access modifiers changed from: private */
        public static a b(int i10) {
            return i10 != 0 ? i10 != 1 ? OTHER : ATP_NETWORK : TCF_VENDOR;
        }
    }

    public a7(JSONObject jSONObject, String str) {
        this.f7653d = str;
        this.f7650a = a.b(JsonUtils.getInt(jSONObject, "type", a.OTHER.ordinal()));
        this.f7651b = JsonUtils.getInteger(jSONObject, "id", null);
        this.f7652c = JsonUtils.getString(jSONObject, "name", null);
    }

    public Boolean a() {
        return this.f7654e;
    }

    public void a(Boolean bool) {
        this.f7654e = bool;
    }

    public String b() {
        return this.f7653d;
    }

    public String c() {
        return this.f7652c;
    }

    public Integer d() {
        return this.f7651b;
    }

    public String e() {
        Boolean bool = this.f7654e;
        return "\n" + this.f7653d + " - " + (bool != null ? String.valueOf(bool) : p0.b().a(com.applovin.impl.sdk.k.o()));
    }

    public a f() {
        return this.f7650a;
    }
}
