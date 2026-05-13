package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7645b;

    public a4(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        this.f7644a = JsonUtils.getString(jSONObject, "id", "");
        this.f7645b = JsonUtils.getString(jSONObject, "price", null);
    }

    public String a() {
        return this.f7644a;
    }

    public String b() {
        return this.f7645b;
    }
}
