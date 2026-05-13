package com.bytedance.sdk.openadsdk.multipro.vt;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class ouw {
    public long fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public long f14195le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public boolean f14196lh;
    public boolean ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public long f14197ra;
    public boolean vt;
    public boolean yu;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.multipro.vt.ouw$ouw, reason: collision with other inner class name */
    public interface InterfaceC0252ouw {
        ouw ra();
    }

    public static ouw ouw(JSONObject jSONObject) {
        ouw ouwVar = new ouw();
        ouwVar.ouw = jSONObject.optBoolean("isCompleted");
        ouwVar.vt = jSONObject.optBoolean("isFromVideoDetailPage");
        ouwVar.f14196lh = jSONObject.optBoolean("isFromDetailPage");
        ouwVar.fkw = jSONObject.optLong("duration");
        ouwVar.f14195le = jSONObject.optLong("totalPlayDuration");
        ouwVar.f14197ra = jSONObject.optLong("currentPlayPosition");
        ouwVar.yu = jSONObject.optBoolean("isAutoPlay");
        return ouwVar;
    }

    public final JSONObject ouw() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isCompleted", this.ouw);
            jSONObject.put("isFromVideoDetailPage", this.vt);
            jSONObject.put("isFromDetailPage", this.f14196lh);
            jSONObject.put("duration", this.fkw);
            jSONObject.put("totalPlayDuration", this.f14195le);
            jSONObject.put("currentPlayPosition", this.f14197ra);
            jSONObject.put("isAutoPlay", this.yu);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
