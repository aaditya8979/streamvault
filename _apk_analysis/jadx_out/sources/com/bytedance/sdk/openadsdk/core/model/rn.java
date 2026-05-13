package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class rn {
    public ouw ouw;
    public ouw vt;

    public static class ouw {
        public C0234ouw ouw;
        public C0234ouw vt;

        /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.rn$ouw$ouw, reason: collision with other inner class name */
        public static class C0234ouw {
            public String ouw;

            public C0234ouw(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return;
                }
                this.ouw = jSONObject.optString("entry");
            }

            public final boolean ouw() {
                return !TextUtils.isEmpty(this.ouw);
            }
        }

        public ouw(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            if (jSONObject.has("vertical")) {
                this.ouw = new C0234ouw(jSONObject.optJSONObject("vertical"));
            }
            if (jSONObject.has("horizontal")) {
                this.vt = new C0234ouw(jSONObject.optJSONObject("horizontal"));
            }
        }

        public final String ouw(boolean z10) {
            if (z10) {
                C0234ouw c0234ouw = this.ouw;
                return c0234ouw != null ? c0234ouw.ouw : "";
            }
            C0234ouw c0234ouw2 = this.vt;
            return c0234ouw2 != null ? c0234ouw2.ouw : "";
        }

        public final boolean ouw() {
            C0234ouw c0234ouw = this.vt;
            if (c0234ouw != null && c0234ouw.ouw()) {
                return true;
            }
            C0234ouw c0234ouw2 = this.ouw;
            return c0234ouw2 != null && c0234ouw2.ouw();
        }
    }

    public rn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("easy_playable");
        if (jSONObjectOptJSONObject != null) {
            this.ouw = new ouw(jSONObjectOptJSONObject.optJSONObject("components"));
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("popup");
        if (jSONObjectOptJSONObject2 != null) {
            this.vt = new ouw(jSONObjectOptJSONObject2.optJSONObject("components"));
        }
    }

    public static boolean ouw(vpp vppVar, boolean z10) {
        rn rnVar;
        if (vppVar == null || (rnVar = vppVar.f13751ak) == null) {
            return false;
        }
        if (z10) {
            ouw ouwVar = rnVar.vt;
            return ouwVar != null && ouwVar.ouw();
        }
        ouw ouwVar2 = rnVar.ouw;
        return ouwVar2 != null && ouwVar2.ouw();
    }
}
