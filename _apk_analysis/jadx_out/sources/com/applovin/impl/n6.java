package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class n6 extends o6 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c3 f9326g;

    public n6(c3 c3Var, com.applovin.impl.sdk.k kVar) {
        super("TaskReportMaxReward", kVar);
        this.f9326g = c3Var;
    }

    @Override // com.applovin.impl.q6
    public void a(int i10) {
        super.a(i10);
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "Failed to report reward for mediated ad: " + this.f9326g + " - error code: " + i10);
        }
        this.f8505a.P().a(d2.f8034u0, this.f9326g);
    }

    @Override // com.applovin.impl.q6
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f9326g.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f9326g.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f9326g.e());
        String strS0 = this.f9326g.s0();
        if (!StringUtils.isValidString(strS0)) {
            strS0 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", strS0);
        String strB = this.f9326g.B();
        if (!StringUtils.isValidString(strB)) {
            strB = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", strB);
    }

    @Override // com.applovin.impl.o6
    public void b(JSONObject jSONObject) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "Reported reward successfully for mediated ad: " + this.f9326g);
        }
    }

    @Override // com.applovin.impl.q6
    public String f() {
        return "2.0/mcr";
    }

    @Override // com.applovin.impl.o6
    public o4 h() {
        return this.f9326g.o0();
    }

    @Override // com.applovin.impl.o6
    public void i() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.b(this.f8506b, "No reward result was found for mediated ad: " + this.f9326g);
        }
    }
}
