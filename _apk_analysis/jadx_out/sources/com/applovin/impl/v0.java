package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.applovin.impl.sdk.k f10519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f10520b;

    public enum a {
        NONE(0),
        IS_AL_GDPR(1000),
        IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT(1001),
        HAS_TERMS_OF_SERVICE_URI(1002);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f10526a;

        a(int i10) {
            this.f10526a = i10;
        }

        public int b() {
            return this.f10526a;
        }
    }

    public enum b {
        ALERT,
        POST_ALERT,
        EVENT,
        REINIT,
        CMP_LOAD,
        CMP_SHOW,
        DECISION
    }

    public v0(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        this.f10519a = kVar;
        this.f10520b = jSONObject;
    }

    private static a a(String str) {
        return "is_al_gdpr".equalsIgnoreCase(str) ? a.IS_AL_GDPR : "is_eligible_for_terms_and_privacy_policy_alert".equalsIgnoreCase(str) ? a.IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT : "has_terms_of_service_uri".equalsIgnoreCase(str) ? a.HAS_TERMS_OF_SERVICE_URI : a.NONE;
    }

    public static v0 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        b bVarC = c(JsonUtils.getString(jSONObject, "type", null));
        return bVarC == b.ALERT ? new w0(jSONObject, kVar) : bVarC == b.EVENT ? new y0(jSONObject, kVar) : new v0(jSONObject, kVar);
    }

    private static b c(String str) {
        if ("alert".equalsIgnoreCase(str)) {
            return b.ALERT;
        }
        if ("post_alert".equalsIgnoreCase(str)) {
            return b.POST_ALERT;
        }
        if ("event".equalsIgnoreCase(str)) {
            return b.EVENT;
        }
        if ("cmp_load".equalsIgnoreCase(str)) {
            return b.CMP_LOAD;
        }
        if ("cmp_show".equalsIgnoreCase(str)) {
            return b.CMP_SHOW;
        }
        if ("decision".equalsIgnoreCase(str)) {
            return b.DECISION;
        }
        if ("reinit".equalsIgnoreCase(str)) {
            return b.REINIT;
        }
        throw new IllegalArgumentException("Invalid type provided: " + str);
    }

    public int a(Boolean bool) {
        int i10 = JsonUtils.getInt(this.f10520b, "destination_state_id", -1);
        if (i10 > 0) {
            return i10;
        }
        if (bool != null) {
            return bool.booleanValue() ? JsonUtils.getInt(this.f10520b, "destination_state_id_true", -1) : JsonUtils.getInt(this.f10520b, "destination_state_id_false", -1);
        }
        throw new IllegalStateException("Decision needed for state: " + i10);
    }

    public a a() {
        return a(b());
    }

    public String b() {
        return JsonUtils.getString(this.f10520b, "decision_type", null);
    }

    public String b(String str) {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f10520b, str, (JSONObject) null);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "replacements", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = JsonUtils.getObjectAtIndex(jSONArray, i10, "").toString();
            if ("<APP_NAME>".equalsIgnoreCase(string)) {
                String str2 = (String) this.f10519a.A().M().get("app_name");
                if (StringUtils.isValidString(str2)) {
                    arrayList.add(str2);
                } else {
                    arrayList.add(com.applovin.impl.sdk.k.a("THIS_APP"));
                }
            } else {
                arrayList.add(string);
            }
        }
        return com.applovin.impl.sdk.k.a(JsonUtils.getString(jSONObject, "key", null), arrayList);
    }

    public int c() {
        return JsonUtils.getInt(this.f10520b, "id", -1);
    }

    public b d() {
        return c(e());
    }

    public String e() {
        return JsonUtils.getString(this.f10520b, "type", null);
    }

    public String toString() {
        return "ConsentFlowState{id=" + c() + ", type=" + d() + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52302e;
    }
}
