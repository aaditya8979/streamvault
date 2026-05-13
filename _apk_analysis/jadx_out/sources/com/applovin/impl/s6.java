package com.applovin.impl;

import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u4;
import com.applovin.impl.v;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class s6 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p2 f9835g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Exception f9836h;

    public class a extends l6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.b(this.f8506b, "Failed to validate license: ");
            }
            if (!this.f8505a.c(x4.A).contains(String.valueOf(i10))) {
                a5.b(z4.f11044i, Boolean.FALSE, com.applovin.impl.sdk.k.o());
            }
            Map map = CollectionUtils.map("error_code", String.valueOf(i10));
            CollectionUtils.putStringIfValid("error_message", str2, map);
            CollectionUtils.putStringIfValid("url", str, map);
            this.f8505a.v0().d(d2.f8017m, map);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.a(this.f8506b, "License Validation successful");
            }
            a5.b(z4.f11044i, Boolean.FALSE, com.applovin.impl.sdk.k.o());
            Map map = CollectionUtils.map("code", String.valueOf(i10));
            CollectionUtils.putStringIfValid("url", str, map);
            this.f8505a.v0().d(d2.f8015l, map);
        }
    }

    public s6(com.applovin.impl.sdk.k kVar, p2 p2Var, Exception exc) {
        super("TaskValidateLicense", kVar);
        this.f9835g = p2Var;
        this.f9836h = exc;
    }

    private String e() {
        return r0.a((String) this.f8505a.a(x4.f10854v0), (String) this.f8505a.a(x4.f10862w0), this.f8505a);
    }

    private JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        v.a aVarF = this.f8505a.A().f();
        JsonUtils.putBoolean(jSONObject, "dnt", aVarF.c());
        JsonUtils.putString(jSONObject, "dnt_code", aVarF.b().b());
        if (((Boolean) this.f8505a.a(x4.f10881y3)).booleanValue() && StringUtils.isValidString(aVarF.a())) {
            JsonUtils.putString(jSONObject, "idfa", aVarF.a());
        }
        l.b bVarH = this.f8505a.A().H();
        if (((Boolean) this.f8505a.a(x4.f10889z3)).booleanValue() && bVarH != null) {
            JsonUtils.putString(jSONObject, "idfv", bVarH.f10167a);
            JsonUtils.putInt(jSONObject, "idfv_scope", bVarH.f10168b);
        }
        String strE = this.f8505a.w0().e();
        if (((Boolean) this.f8505a.a(x4.A3)).booleanValue() && StringUtils.isValidString(strE)) {
            JsonUtils.putString(jSONObject, "cuid", strE);
        }
        if (((Boolean) this.f8505a.a(x4.D3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f8505a.u());
        }
        if (((Boolean) this.f8505a.a(x4.F3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f8505a.h0());
        }
        JsonUtils.putAll(jSONObject, (Map<String, ?>) this.f8505a.A().e());
        JSONObject jSONObject2 = new JSONObject();
        p2 p2Var = this.f9835g;
        if (p2Var != null) {
            JsonUtils.putString(jSONObject2, "lsig", p2Var.d());
            JsonUtils.putString(jSONObject2, "lsigd", this.f9835g.e());
            JsonUtils.putInt(jSONObject2, "r_code", this.f9835g.c());
            JsonUtils.putInt(jSONObject2, "n", this.f9835g.b());
        }
        Exception exc = this.f9836h;
        if (exc != null) {
            JsonUtils.putStringIfValid(jSONObject2, "lvfr", exc.toString());
        }
        JsonUtils.putObject(jSONObject, "lvd", jSONObject2);
        return jSONObject;
    }

    private String g() {
        return r0.a((String) this.f8505a.a(x4.f10846u0), (String) this.f8505a.a(x4.f10862w0), this.f8505a);
    }

    @Override // java.lang.Runnable
    public void run() {
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f8505a).b(g()).a(e()).a(f()).c("POST").b(((Boolean) this.f8505a.a(x4.Q5)).booleanValue()).a((Object) new JSONObject()).a(((Integer) this.f8505a.a(x4.f10841t3)).intValue()).a(u4.a.a(((Integer) this.f8505a.a(x4.f10883y5)).intValue())).a(), this.f8505a);
        aVar.c(x4.f10846u0);
        aVar.b(x4.f10854v0);
        this.f8505a.q0().a(aVar);
    }
}
