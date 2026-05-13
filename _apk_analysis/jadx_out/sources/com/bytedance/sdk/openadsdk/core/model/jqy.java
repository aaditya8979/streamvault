package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class jqy {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final int f13667lh;
    public final int ouw;
    public final int vt;
    private final int yu;

    public jqy(JSONObject jSONObject) {
        this.ouw = jSONObject.optInt("max_time", 0);
        this.yu = jSONObject.optInt("auto_skip_time", -1);
        this.vt = jSONObject.optInt("show_after_inactivity", 10);
        this.f13667lh = jSONObject.optInt("user_wait_time", 10);
    }

    public final JSONObject ouw() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("max_time", this.ouw);
            jSONObject.put("auto_skip_time", this.yu);
            jSONObject.put("show_after_inactivity", this.vt);
            jSONObject.put("user_wait_time", this.f13667lh);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
