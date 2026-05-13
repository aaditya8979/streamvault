package com.bytedance.sdk.openadsdk.ryl.ouw;

import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.yu.ouw;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class rn extends com.bytedance.sdk.component.ouw.yu<JSONObject, JSONObject> {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private bs f14267lh;

    public rn(bs bsVar) {
        this.f14267lh = bsVar;
    }

    @Override // com.bytedance.sdk.component.ouw.yu
    public final /* synthetic */ JSONObject ouw(String str, JSONObject jSONObject) throws Exception {
        final JSONObject jSONObject2 = jSONObject;
        com.bytedance.sdk.component.utils.ko.ouw("Android_jsb", "SendLogV3Method, params is:", jSONObject2);
        final bs bsVar = this.f14267lh;
        if (jSONObject2 == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.yu.lh.ouw(new com.bytedance.sdk.component.pno.pno("sendLogV3") { // from class: com.bytedance.sdk.openadsdk.core.bs.3
            public final /* synthetic */ JSONObject ouw;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(String str2, final JSONObject jSONObject22) {
                super(str2);
                jSONObject = jSONObject22;
            }

            @Override // java.lang.Runnable
            public final void run() {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extJson");
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("category") && jSONObjectOptJSONObject.has("tag") && jSONObjectOptJSONObject.has("label")) {
                    String strOptString = jSONObjectOptJSONObject.optString("category");
                    String strOptString2 = jSONObjectOptJSONObject.optString("tag");
                    String strOptString3 = jSONObjectOptJSONObject.optString("label");
                    long jOptLong = jSONObject.optLong("value");
                    long jOptLong2 = jSONObject.optLong("extValue");
                    try {
                        jSONObjectOptJSONObject.put("ua_policy", bs.this.pno);
                    } catch (Exception unused) {
                    }
                    com.bytedance.sdk.component.utils.ko.ouw("Android_jsb", "trigger sendLogV3, extJson is:", jSONObjectOptJSONObject);
                    ouw.C0266ouw c0266ouw = new ouw.C0266ouw(System.currentTimeMillis(), bs.this.bly);
                    c0266ouw.yu = strOptString;
                    c0266ouw.vt = strOptString2;
                    c0266ouw.f14503lh = strOptString3;
                    c0266ouw.f14504ra = String.valueOf(jOptLong);
                    c0266ouw.pno = String.valueOf(jOptLong2);
                    c0266ouw.ouw(jSONObjectOptJSONObject).ouw((com.bytedance.sdk.openadsdk.yu.vt.ouw) null);
                }
            }
        });
        return null;
    }
}
