package com.ironsource.mediationsdk.logger;

import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.C4228r4;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IronSourceLogger.IronSourceTag f32664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f32666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32667d;

    public b(IronSourceLogger.IronSourceTag ironSourceTag, String str, String str2, int i10) {
        this.f32664a = ironSourceTag;
        this.f32665b = str;
        this.f32666c = str2;
        this.f32667d = i10;
    }

    public int a() {
        return this.f32667d;
    }

    public JSONObject b() {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put("timestamp", this.f32665b);
            jSONObjectJsonObjectInit.put("tag", this.f32664a);
            jSONObjectJsonObjectInit.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, this.f32667d);
            jSONObjectJsonObjectInit.put("message", this.f32666c);
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return jSONObjectJsonObjectInit;
    }
}
