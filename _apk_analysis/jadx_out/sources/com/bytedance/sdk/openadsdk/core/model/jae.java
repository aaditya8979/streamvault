package com.bytedance.sdk.openadsdk.core.model;

import android.content.Intent;
import android.text.TextUtils;
import com.safedk.android.internal.partials.PangleVideoBridge;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class jae {
    private int bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private int f13663cf;
    public int fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public String f13664le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public String f13665lh;
    public int ouw;
    private String pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private String f13666ra;
    private String tlj;
    public String vt;
    public String yu;

    public static jae ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        jae jaeVar = new jae();
        try {
            jaeVar.f13666ra = jSONObject.optString("market_dpl", "");
            jaeVar.pno = jSONObject.optString("market_dpl_auto", "");
            jaeVar.bly = jSONObject.optInt("exec_type", 0);
            jaeVar.ouw = jSONObject.optInt("oem_vendor_type", 0);
            jaeVar.vt = jSONObject.optString("market_pkg", "");
            jaeVar.f13665lh = jSONObject.optString("regex", "");
            jaeVar.fkw = jSONObject.optInt("overlay", 1);
            jaeVar.f13664le = jSONObject.optString("caller_id", "");
            jaeVar.tlj = jSONObject.optString("ext_map", null);
            jaeVar.f13663cf = jSONObject.optInt("gp_card", 0);
            jaeVar.yu = jSONObject.optString("app_pkg", "");
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("OemModel", th2.getMessage());
        }
        return jaeVar;
    }

    public final JSONObject fkw() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f13666ra)) {
                jSONObject.put("market_dpl", this.f13666ra);
            }
            if (!TextUtils.isEmpty(this.pno)) {
                jSONObject.put("market_dpl_auto", this.pno);
            }
            if (!TextUtils.isEmpty(this.vt)) {
                jSONObject.put("market_pkg", this.vt);
            }
            if (!TextUtils.isEmpty(this.yu)) {
                jSONObject.put("app_pkg", this.yu);
            }
            if (!TextUtils.isEmpty(this.f13665lh)) {
                jSONObject.put("regex", this.f13665lh);
            }
            jSONObject.put("exec_type", this.bly);
            jSONObject.put("oem_vendor_type", this.ouw);
            jSONObject.put("overlay", this.fkw);
            jSONObject.put("gp_card", this.f13663cf);
            if (!TextUtils.isEmpty(this.f13664le)) {
                jSONObject.put("caller_id", this.f13664le);
            }
            if (!TextUtils.isEmpty(this.tlj)) {
                jSONObject.put("ext_map", this.tlj);
            }
            return jSONObject;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("OemModel", th2.getMessage());
            return null;
        }
    }

    public final boolean lh() {
        return this.f13663cf == 1;
    }

    public final void ouw(Intent intent) {
        if (TextUtils.isEmpty(this.tlj)) {
            return;
        }
        try {
            JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(this.tlj);
            Iterator<String> itKeys = jSONObjectJsonObjectInit.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObjectJsonObjectInit.get(next);
                if (obj instanceof String) {
                    intent.putExtra(next, (String) obj);
                } else if (obj instanceof Integer) {
                    intent.putExtra(next, (Integer) obj);
                } else if (obj instanceof Boolean) {
                    intent.putExtra(next, (Boolean) obj);
                } else if (obj instanceof Long) {
                    intent.putExtra(next, (Long) obj);
                } else if (obj instanceof Double) {
                    intent.putExtra(next, (Double) obj);
                } else if (obj instanceof Float) {
                    intent.putExtra(next, (Float) obj);
                } else {
                    com.bytedance.sdk.component.utils.ko.lh("OemModel", "Unsupported type ", next, obj);
                }
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ko.yu("OemModel", th2);
        }
    }

    public final boolean ouw() {
        return this.ouw == 1;
    }

    public final boolean vt() {
        return this.ouw == 2;
    }

    public final String yu() {
        return this.bly == 2 ? this.pno : this.f13666ra;
    }
}
