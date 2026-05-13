package com.bytedance.sdk.component.le.ouw.yu.ouw;

import android.text.TextUtils;
import com.safedk.android.internal.partials.PangleVideoBridge;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ouw implements com.bytedance.sdk.component.le.ouw.yu.ouw {
    private String bly;
    public int fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private vt f12723le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public JSONObject f12724lh;
    public byte ouw;
    private long pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private long f12725ra;
    private String tlj;
    public byte vt;
    public byte yu;

    private ouw() {
    }

    public ouw(String str, vt vtVar) {
        this.tlj = str;
        this.f12723le = vtVar;
    }

    public ouw(String str, JSONObject jSONObject) {
        this.tlj = str;
        this.f12724lh = jSONObject;
    }

    public static com.bytedance.sdk.component.le.ouw.yu.ouw lh(String str) {
        try {
            JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(str);
            int iOptInt = jSONObjectJsonObjectInit.optInt("type");
            int iOptInt2 = jSONObjectJsonObjectInit.optInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            ouw ouwVar = new ouw();
            ouwVar.ouw((byte) iOptInt);
            ouwVar.vt((byte) iOptInt2);
            ouwVar.ouw(jSONObjectJsonObjectInit.optJSONObject("event"));
            ouwVar.ouw(jSONObjectJsonObjectInit.optString("localId"));
            ouwVar.vt(jSONObjectJsonObjectInit.optString("genTime"));
            ouwVar.ouw(jSONObjectJsonObjectInit.optInt("channel"));
            return ouwVar;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw
    public final byte fkw() {
        return this.vt;
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw
    public final String le() {
        if (TextUtils.isEmpty(this.tlj)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("localId", this.tlj);
            jSONObject.put("event", ra());
            jSONObject.put("genTime", this.bly);
            jSONObject.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, (int) this.vt);
            jSONObject.put("type", (int) this.ouw);
            jSONObject.put("channel", this.fkw);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw
    public final String lh() {
        return this.tlj;
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw
    public final vt ouw() {
        return this.f12723le;
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw
    public final void ouw(byte b10) {
        this.ouw = b10;
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw
    public final void ouw(int i10) {
        this.fkw = i10;
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw
    public final void ouw(long j10) {
        this.f12725ra = j10;
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw
    public final void ouw(String str) {
        this.tlj = str;
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw
    public final void ouw(JSONObject jSONObject) {
        this.f12724lh = jSONObject;
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw
    public final int pno() {
        return this.fkw;
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw
    public final synchronized JSONObject ra() {
        vt vtVar;
        if (this.f12724lh == null && (vtVar = this.f12723le) != null) {
            this.f12724lh = vtVar.ouw();
        }
        return this.f12724lh;
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw
    public final byte vt() {
        return this.yu;
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw
    public final void vt(byte b10) {
        this.vt = b10;
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw
    public final void vt(long j10) {
        this.pno = j10;
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw
    public final void vt(String str) {
        this.bly = str;
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw
    public final byte yu() {
        return this.ouw;
    }
}
