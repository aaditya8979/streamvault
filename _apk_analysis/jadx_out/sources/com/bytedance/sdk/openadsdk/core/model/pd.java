package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class pd {
    public JSONObject fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public ouw f13702le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public String f13703lh;
    public String ouw;
    public String vt;
    public String yu;

    public static class ouw {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public JSONArray f13704lh;
        public JSONArray ouw;
        public JSONArray vt;

        public static ouw ouw(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("image");
            ouw ouwVar = new ouw();
            ouwVar.ouw = jSONArrayOptJSONArray;
            ouwVar.vt = jSONObject.optJSONArray("fetch");
            ouwVar.f13704lh = jSONObject.optJSONArray("script");
            return ouwVar;
        }

        public final JSONObject ouw() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("image", this.ouw);
                jSONObject.put("fetch", this.vt);
                jSONObject.put("script", this.f13704lh);
            } catch (JSONException e10) {
                com.bytedance.sdk.component.utils.ko.fkw("PreloadModel", e10.getMessage());
            }
            return jSONObject;
        }
    }

    public static pd ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        pd pdVar = new pd();
        pdVar.ouw = jSONObject.optString("id");
        pdVar.yu = jSONObject.optString("data");
        pdVar.f13703lh = jSONObject.optString("url");
        pdVar.vt = jSONObject.optString("md5");
        pdVar.fkw = jSONObject.optJSONObject("custom_components");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preload");
        if (jSONObjectOptJSONObject != null) {
            pdVar.f13702le = ouw.ouw(jSONObjectOptJSONObject);
        }
        return pdVar;
    }

    public final JSONObject ouw() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.ouw);
            jSONObject.put("md5", this.vt);
            jSONObject.put("url", this.f13703lh);
            jSONObject.put("data", this.yu);
            jSONObject.put("custom_components", this.fkw);
            ouw ouwVar = this.f13702le;
            if (ouwVar != null) {
                jSONObject.put("preload", ouwVar.ouw());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
