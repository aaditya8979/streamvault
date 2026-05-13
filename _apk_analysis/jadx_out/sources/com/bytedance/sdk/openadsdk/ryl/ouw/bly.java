package com.bytedance.sdk.openadsdk.ryl.ouw;

import com.bytedance.sdk.openadsdk.core.bs;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class bly extends com.bytedance.sdk.component.ouw.yu<JSONObject, JSONObject> {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final bs f14254lh;
    private String yu;

    public bly(bs bsVar, String str) {
        this.f14254lh = bsVar;
        this.yu = str;
    }

    @Override // com.bytedance.sdk.component.ouw.yu
    public final /* synthetic */ JSONObject ouw(String str, JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2 = jSONObject;
        if ("endcardDynamicCreatives".equals(this.yu)) {
            return this.f14254lh.fkw();
        }
        if ("multiOpenCovert".equals(this.yu)) {
            this.f14254lh.yu(jSONObject2);
            return null;
        }
        if ("skipToNextAd".equals(this.yu)) {
            this.f14254lh.ouw(jSONObject2, this.yu);
            return null;
        }
        if ("speedVideoOrTimer".equals(this.yu)) {
            return this.f14254lh.lh(jSONObject2);
        }
        if ("openPlayable".equals(this.yu)) {
            return this.f14254lh.yu();
        }
        return null;
    }
}
