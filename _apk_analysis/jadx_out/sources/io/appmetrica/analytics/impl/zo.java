package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class zo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Co f68092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Co f68093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ao f68094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public JSONObject f68095d;

    public zo(Co co2, Co co3, Ao ao2) {
        this.f68092a = co2;
        this.f68093b = co3;
        this.f68094c = ao2;
    }

    public static JSONObject a(Co co2) {
        try {
            String strA = co2.a();
            return strA != null ? new JSONObject(strA) : new JSONObject();
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public final synchronized JSONObject a() {
        JSONObject jSONObject;
        if (this.f68095d == null) {
            JSONObject jSONObjectA = this.f68094c.a(a(this.f68092a), a(this.f68093b));
            this.f68095d = jSONObjectA;
            a(jSONObjectA);
        }
        jSONObject = this.f68095d;
        if (jSONObject == null) {
            tn.p.C("fileContents");
            jSONObject = null;
        }
        return jSONObject;
    }

    public final synchronized void a(JSONObject jSONObject) {
        String string = jSONObject.toString();
        try {
            this.f68092a.a(string);
        } catch (Throwable unused) {
        }
        try {
            this.f68093b.a(string);
        } catch (Throwable unused2) {
        }
    }
}
