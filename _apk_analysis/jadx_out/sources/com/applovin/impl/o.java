package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k8 f9364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f9365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f9366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f9367f = false;

    public o(JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.k kVar) {
        this.f9362a = JsonUtils.getString(jSONObject, "name", "");
        this.f9363b = JsonUtils.getString(jSONObject, "experiment", null);
        this.f9364c = a(jSONObject);
        this.f9365d = a("bidders", jSONObject, map, maxAdFormat, kVar);
        this.f9366e = a(com.ironsource.mediationsdk.d.f32393h, jSONObject, map, maxAdFormat, kVar);
    }

    private k8 a(JSONObject jSONObject) {
        return new k8(JsonUtils.getJSONObject(jSONObject, "targeting"));
    }

    private List a(String str, JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.k kVar) {
        e3 e3Var;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null && (e3Var = (e3) map.get(JsonUtils.getString(jSONObject2, "adapter_class", ""))) != null) {
                if (e3Var.C()) {
                    this.f9367f = true;
                }
                arrayList.add(new i8(jSONObject2, maxAdFormat, e3Var, kVar));
            }
        }
        return arrayList;
    }

    public List a() {
        return this.f9365d;
    }

    public String b() {
        return this.f9363b;
    }

    public String c() {
        return this.f9362a;
    }

    public k8 d() {
        return this.f9364c;
    }

    public List e() {
        return this.f9366e;
    }

    public boolean f() {
        return this.f9367f;
    }
}
