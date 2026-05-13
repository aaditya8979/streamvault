package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class g6 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JSONObject f8346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f8347h;

    public g6(JSONObject jSONObject, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessNativeAdResponse", kVar);
        this.f8346g = jSONObject;
        this.f8347h = appLovinNativeAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f8346g, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray());
        if (jSONArray.length() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.a(this.f8506b, "Processing ad...");
            }
            this.f8505a.q0().a(new com.applovin.impl.sdk.nativeAd.b(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()), this.f8346g, this.f8347h, this.f8505a));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.k(this.f8506b, "No ads were returned from the server");
        }
        n7.a("native_native", MaxAdFormat.NATIVE, this.f8346g, this.f8505a);
        this.f8347h.onNativeAdLoadFailed(AppLovinError.NO_FILL);
    }
}
