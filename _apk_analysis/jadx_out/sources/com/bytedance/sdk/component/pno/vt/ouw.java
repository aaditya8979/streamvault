package com.bytedance.sdk.component.pno.vt;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class ouw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f12768lh;
    public int ouw;
    public int vt;
    public int yu;

    public ouw(int i10, int i11, int i12, int i13) {
        this.ouw = i10;
        this.vt = i11;
        this.f12768lh = i12;
        this.yu = i13;
    }

    public final JSONObject ouw() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_thread_num", this.ouw);
            jSONObject.put("sdk_max_thread_num", this.vt);
            jSONObject.put("app_thread_num", this.f12768lh);
            jSONObject.put("app_max_thread_num", this.yu);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return jSONObject;
    }
}
