package com.bytedance.sdk.openadsdk.yu.fkw.vt;

import com.bytedance.sdk.openadsdk.core.model.vpp;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ouw {
    private JSONObject fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private JSONObject f14420le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public lh f14421lh;
    public vpp ouw;
    public String vt;
    public boolean yu = false;

    public ouw(vpp vppVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        this.ouw = vppVar;
        this.vt = str;
        this.fkw = jSONObject;
        this.f14420le = jSONObject2;
    }

    public final JSONObject ouw() {
        if (this.fkw == null) {
            this.fkw = new JSONObject();
        }
        return this.fkw;
    }

    public final JSONObject vt() {
        if (this.f14420le == null) {
            this.f14420le = new JSONObject();
        }
        return this.f14420le;
    }
}
