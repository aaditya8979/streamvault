package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.u4;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
class j5 extends i5 {

    public class a extends l6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            r0.a(i10, this.f8505a);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            j5.this.a(jSONObject);
        }
    }

    public j5(com.applovin.impl.sdk.k kVar) {
        super("TaskApiSubmitData", kVar);
    }

    private void a(Map map, JSONObject jSONObject) {
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f8505a).b(r0.b("2.0/device", this.f8505a)).a(r0.a("2.0/device", this.f8505a)).b(map).a(jSONObject).c("POST").b(((Boolean) this.f8505a.a(x4.M5)).booleanValue()).a((Object) new JSONObject()).a(((Integer) this.f8505a.a(x4.Z2)).intValue()).a(u4.a.a(((Integer) this.f8505a.a(x4.f10867w5)).intValue())).a(), this.f8505a);
        aVar.c(x4.f10790n0);
        aVar.b(x4.f10798o0);
        this.f8505a.q0().a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject, "results", new JSONArray()), 0, new JSONObject());
        this.f8505a.o0().a(x4.f10718f, JsonUtils.getString(jSONObject2, "device_id", ""));
        this.f8505a.o0().a(x4.f10754j, JsonUtils.getString(jSONObject2, "device_token", ""));
        r0.a(jSONObject2, this.f8505a);
    }

    private void b(JSONObject jSONObject) {
        com.applovin.impl.sdk.l lVarA = this.f8505a.A();
        Map mapP = lVarA.p();
        n7.a("platform", "type", mapP);
        n7.a("api_level", "sdk_version", mapP);
        JsonUtils.putObject(jSONObject, "device_info", new JSONObject(mapP));
        Map mapG = lVarA.G();
        n7.a("sdk_version", "applovin_sdk_version", mapG);
        n7.a("ia", "installed_at", mapG);
        JsonUtils.putObject(jSONObject, "app_info", new JSONObject(mapG));
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.d(this.f8506b, "Submitting user data...");
        }
        Map mapC = r0.c(this.f8505a);
        JSONObject jSONObject = new JSONObject();
        b(jSONObject);
        if (((Boolean) this.f8505a.a(x4.F5)).booleanValue() || ((Boolean) this.f8505a.a(x4.f10891z5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) mapC);
            mapC = null;
        }
        a(mapC, jSONObject);
    }
}
