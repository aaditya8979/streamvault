package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class n implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MaxAdFormat f9292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f9293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f9294e;

    public n(JSONObject jSONObject, Map map, com.applovin.impl.sdk.k kVar) {
        this.f9290a = JsonUtils.getString(jSONObject, "name", "");
        this.f9291b = JsonUtils.getString(jSONObject, "display_name", "");
        this.f9292c = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "format", null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "waterfalls", new JSONArray());
        this.f9294e = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                this.f9294e.add(new o(jSONObject2, map, this.f9292c, kVar));
            }
        }
        this.f9293d = this.f9294e.isEmpty() ? null : (o) this.f9294e.get(0);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(n nVar) {
        return this.f9291b.compareToIgnoreCase(nVar.f9291b);
    }

    public MaxAdFormat a() {
        return this.f9292c;
    }

    public String b() {
        MaxAdFormat maxAdFormat = this.f9292c;
        return maxAdFormat != null ? maxAdFormat.getLabel() : "Unknown";
    }

    public String c() {
        return this.f9290a;
    }

    public String d() {
        return this.f9291b;
    }

    public String e() {
        return "\n---------- " + this.f9291b + " ----------\nIdentifier - " + this.f9290a + "\nFormat     - " + b();
    }

    public o f() {
        return this.f9293d;
    }

    public List g() {
        return this.f9294e;
    }
}
