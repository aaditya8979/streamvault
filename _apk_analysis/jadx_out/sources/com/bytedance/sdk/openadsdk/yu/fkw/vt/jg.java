package com.bytedance.sdk.openadsdk.yu.fkw.vt;

import com.bytedance.sdk.component.utils.qbp;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class jg extends lh {
    private final String fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final int f14411lh;
    public long ouw;
    public long vt;
    private final int yu;

    public jg(com.bykv.vk.openvk.ouw.ouw.ouw.lh.ouw ouwVar) {
        this.f14411lh = ouwVar.ouw;
        this.yu = ouwVar.vt;
        this.fkw = ouwVar.f11279lh;
    }

    @Override // com.bytedance.sdk.openadsdk.yu.fkw.vt.lh
    public final void ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.ouw);
            jSONObject.put("total_duration", this.vt);
            jSONObject.put("error_code", this.f14411lh);
            jSONObject.put("extra_error_code", this.yu);
            jSONObject.put("error_message", this.fkw);
        } catch (Throwable th2) {
            qbp.lh("PlayErrorModel", th2.getMessage());
        }
    }
}
