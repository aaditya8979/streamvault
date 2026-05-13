package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.safedk.android.internal.partials.PangleVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ex {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public JSONObject f13650cf;
    public int fkw;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public pd f13652ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public int f13653le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f13654lh;
    public int mwh;
    public int ouw;
    public String pno;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public vt f13656rn;
    public int ryl;
    public boolean tlj;
    public int yu;
    private JSONObject zih;
    public int vt = 10;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public int f13655ra = 1;
    public ouw bly = new ouw();

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public int f13651jg = 1;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private String f13658vm = "Next Ad";

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private String f13657th = "Next ad in %1$ds";

    public static class ouw {
        public int fkw;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public int f13659lh;
        public int ouw;
        public int vt;
        public int yu;

        public final JSONObject ouw() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("padding_left", this.ouw);
                jSONObject.put("padding_right", this.vt);
                jSONObject.put("padding_top", this.f13659lh);
                jSONObject.put("padding_bottom", this.yu);
                jSONObject.put("card_spacing", this.fkw);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    public static class vt {
        public float fkw;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public String f13660lh;
        public int ouw;
        public String vt;
        public float yu;
    }

    public static ex ouw(String str) {
        ex exVar = new ex();
        if (str == null) {
            return exVar;
        }
        try {
            JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(str);
            exVar.ouw = jSONObjectJsonObjectInit.optInt("auto_switch");
            exVar.vt = jSONObjectJsonObjectInit.optInt("playable_preload_count");
            exVar.f13654lh = jSONObjectJsonObjectInit.optInt("disable_on_interaction");
            exVar.yu = jSONObjectJsonObjectInit.optInt("ceiling_type");
            exVar.fkw = jSONObjectJsonObjectInit.optInt("can_loop");
            exVar.f13653le = jSONObjectJsonObjectInit.optInt("multi_skip_time", -1);
            exVar.f13655ra = jSONObjectJsonObjectInit.optInt("load_more_strategy");
            exVar.f13651jg = jSONObjectJsonObjectInit.optInt("report_show_by_percent", 1);
            JSONObject jSONObjectOptJSONObject = jSONObjectJsonObjectInit.optJSONObject("gesture_tpl_info");
            exVar.zih = jSONObjectOptJSONObject;
            if (jSONObjectOptJSONObject != null) {
                pd pdVarOuw = pd.ouw(jSONObjectOptJSONObject);
                exVar.f13652ko = pdVarOuw;
                if (pdVarOuw != null && !TextUtils.isEmpty(pdVarOuw.f13703lh)) {
                    com.bytedance.sdk.openadsdk.core.cf.pno.ouw ouwVar = new com.bytedance.sdk.openadsdk.core.cf.pno.ouw();
                    pd pdVar = exVar.f13652ko;
                    ouwVar.ouw = pdVar.ouw;
                    ouwVar.vt = pdVar.vt;
                    ouwVar.f13554lh = pdVar.f13703lh;
                    ouwVar.yu = pdVar.yu;
                    com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw().ouw(ouwVar, "guide");
                }
                int iOptInt = exVar.zih.optInt("delay_show_time", 5);
                exVar.ryl = iOptInt;
                if (iOptInt < 0) {
                    exVar.ryl = 5;
                }
                int iOptInt2 = exVar.zih.optInt("dismiss_after_idle_time", 3);
                exVar.mwh = iOptInt2;
                if (iOptInt2 <= 0) {
                    exVar.mwh = 3;
                }
            }
            exVar.pno = jSONObjectJsonObjectInit.optString("agg_endcard_url");
            exVar.tlj = jSONObjectJsonObjectInit.optBoolean("has_more");
            exVar.f13650cf = jSONObjectJsonObjectInit.optJSONObject("session_params");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectJsonObjectInit.optJSONObject("layout_config");
            ouw ouwVar2 = new ouw();
            if (jSONObjectOptJSONObject2 != null) {
                ouwVar2.ouw = Math.max(0, jSONObjectOptJSONObject2.optInt("padding_left", 0));
                ouwVar2.vt = Math.max(0, jSONObjectOptJSONObject2.optInt("padding_right", 0));
                ouwVar2.f13659lh = Math.max(0, jSONObjectOptJSONObject2.optInt("padding_top", 0));
                ouwVar2.yu = Math.max(0, jSONObjectOptJSONObject2.optInt("padding_bottom", 0));
                ouwVar2.fkw = Math.max(0, jSONObjectOptJSONObject2.optInt("card_spacing", 0));
            }
            exVar.bly = ouwVar2;
            JSONObject jSONObjectOptJSONObject3 = jSONObjectJsonObjectInit.optJSONObject("progress_config");
            vt vtVar = new vt();
            if (jSONObjectOptJSONObject3 != null) {
                vtVar.ouw = jSONObjectOptJSONObject3.optInt("progress_type", 0);
                vtVar.vt = jSONObjectOptJSONObject3.optString("progress_color");
                vtVar.f13660lh = jSONObjectOptJSONObject3.optString("progress_background_color");
                vtVar.yu = jSONObjectOptJSONObject3.optInt("progress_size", 0);
                vtVar.fkw = jSONObjectOptJSONObject3.optInt("bar_radius", 0);
            }
            exVar.f13656rn = vtVar;
        } catch (JSONException unused) {
        }
        return exVar;
    }

    public final JSONObject ouw() {
        pd pdVar = this.f13652ko;
        if (pdVar == null) {
            return null;
        }
        try {
            String str = pdVar.yu;
            if (!TextUtils.isEmpty(str)) {
                return PangleVideoBridge.jsonObjectInit(str);
            }
            com.bytedance.sdk.openadsdk.core.cf.ouw.vt vtVarOuw = com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw();
            pd pdVar2 = this.f13652ko;
            String strOuw = vtVarOuw.ouw("guide", pdVar2.ouw, pdVar2.vt);
            if (TextUtils.isEmpty(strOuw)) {
                return null;
            }
            return PangleVideoBridge.jsonObjectInit(strOuw);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final JSONObject vt() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("auto_switch", this.ouw);
            jSONObject.put("playable_preload_count", this.vt);
            jSONObject.put("disable_on_interaction", this.f13654lh);
            jSONObject.put("ceiling_type", this.yu);
            jSONObject.put("can_loop", this.fkw);
            jSONObject.put("multi_skip_time", this.f13653le);
            jSONObject.put("load_more_strategy", this.f13655ra);
            jSONObject.put("report_show_by_percent", this.f13651jg);
            jSONObject.put("gesture_tpl_info", this.zih);
            jSONObject.put("agg_endcard_url", this.pno);
            jSONObject.put("layoutConfig", this.bly.ouw());
            jSONObject.put("has_more", this.tlj);
            jSONObject.put("session_params", this.f13650cf);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
