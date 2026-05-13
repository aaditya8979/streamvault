package com.ironsource;

import com.ironsource.C3978d4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ra, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C4234ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f33418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f33419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f33420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f33421d;

    public C4234ra(JSONObject jSONObject) {
        this.f33418a = jSONObject.optString(C3978d4.g.f31290b);
        this.f33419b = jSONObject.optJSONObject(C3978d4.g.f31291c);
        this.f33420c = jSONObject.optString("success");
        this.f33421d = jSONObject.optString(C3978d4.g.f31293e);
    }

    public String a() {
        return this.f33421d;
    }

    public String b() {
        return this.f33418a;
    }

    public JSONObject c() {
        return this.f33419b;
    }

    public String d() {
        return this.f33420c;
    }

    public JSONObject e() {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put(C3978d4.g.f31290b, this.f33418a);
            jSONObjectJsonObjectInit.put(C3978d4.g.f31291c, this.f33419b);
            jSONObjectJsonObjectInit.put("success", this.f33420c);
            jSONObjectJsonObjectInit.put(C3978d4.g.f31293e, this.f33421d);
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return jSONObjectJsonObjectInit;
    }
}
