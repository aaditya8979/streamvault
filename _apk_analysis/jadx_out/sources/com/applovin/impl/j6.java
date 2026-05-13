package com.applovin.impl;

import com.applovin.impl.d6;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class j6 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JSONObject f8561g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JSONObject f8562h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AppLovinAdLoadListener f8563i;

    public j6(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskRenderAppLovinAd", kVar);
        this.f8561g = jSONObject;
        this.f8562h = jSONObject2;
        this.f8563i = appLovinAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "Rendering ad...");
        }
        com.applovin.impl.sdk.ad.a aVar = new com.applovin.impl.sdk.ad.a(this.f8561g, this.f8562h, this.f8505a);
        boolean zBooleanValue = JsonUtils.getBoolean(this.f8561g, "gs_load_immediately", Boolean.FALSE).booleanValue();
        boolean zBooleanValue2 = JsonUtils.getBoolean(this.f8561g, "vs_load_immediately", Boolean.TRUE).booleanValue();
        m5 m5Var = new m5(aVar, this.f8505a, this.f8563i);
        m5Var.c(zBooleanValue2);
        m5Var.b(zBooleanValue);
        this.f8505a.q0().a((i5) m5Var, d6.b.CACHING);
    }
}
