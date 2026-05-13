package com.applovin.impl;

import com.applovin.impl.q0;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u4;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class q6 extends i5 {

    public class a extends l6 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ q0.e f9666m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, q0.e eVar) {
            super(aVar, kVar);
            this.f9666m = eVar;
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            this.f9666m.a(str, i10, str2, jSONObject);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            this.f9666m.a(str, jSONObject, i10);
        }
    }

    public q6(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    public void a(int i10) {
        r0.a(i10, this.f8505a);
    }

    public abstract void a(JSONObject jSONObject);

    public void a(JSONObject jSONObject, q0.e eVar) {
        Map mapC = r0.c(this.f8505a);
        if (((Boolean) this.f8505a.a(x4.G5)).booleanValue() || ((Boolean) this.f8505a.a(x4.f10891z5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) mapC);
            mapC = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f8505a).b(r0.b(f(), this.f8505a)).a(r0.a(f(), this.f8505a)).b(mapC).a(jSONObject).c("POST").b(((Boolean) this.f8505a.a(x4.P5)).booleanValue()).a((Object) new JSONObject()).a(g()).a(u4.a.a(((Integer) this.f8505a.a(x4.f10875x5)).intValue())).a(), this.f8505a, eVar);
        aVar.c(x4.f10790n0);
        aVar.b(x4.f10798o0);
        this.f8505a.q0().a(aVar);
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        String strE = this.f8505a.w0().e();
        if (((Boolean) this.f8505a.a(x4.B3)).booleanValue() && StringUtils.isValidString(strE)) {
            JsonUtils.putString(jSONObject, "cuid", strE);
        }
        if (((Boolean) this.f8505a.a(x4.D3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f8505a.u());
        }
        if (((Boolean) this.f8505a.a(x4.F3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f8505a.h0());
        }
        a(jSONObject);
        return jSONObject;
    }

    public abstract String f();

    public abstract int g();
}
