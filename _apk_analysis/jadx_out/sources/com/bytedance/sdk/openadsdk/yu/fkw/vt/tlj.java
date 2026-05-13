package com.bytedance.sdk.openadsdk.yu.fkw.vt;

import com.bytedance.sdk.component.utils.qbp;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class tlj extends lh {
    public String fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public String f14424le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public long f14425lh;
    public String ouw;
    public long vt;
    public int yu;

    @Override // com.bytedance.sdk.openadsdk.yu.fkw.vt.lh
    public final void ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.ouw);
            jSONObject.put("preload_size", this.vt);
            jSONObject.put("load_time", this.f14425lh);
            jSONObject.put("error_code", this.yu);
            jSONObject.put("error_message", this.fkw);
            jSONObject.put("error_message_server", this.f14424le);
        } catch (Throwable th2) {
            qbp.lh("LoadVideoErrorModel", th2.getMessage());
        }
    }
}
