package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class u6 extends v6 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c3 f10484g;

    public u6(c3 c3Var, com.applovin.impl.sdk.k kVar) {
        super("TaskValidateMaxReward", kVar);
        this.f10484g = c3Var;
    }

    @Override // com.applovin.impl.q6
    public void a(int i10) {
        super.a(i10);
        String str = (i10 < 400 || i10 >= 500) ? "network_timeout" : "rejected";
        this.f10484g.a(o4.a(str));
        this.f8505a.P().a(d2.f8036v0, this.f10484g, CollectionUtils.hashMap("error_message", str));
    }

    @Override // com.applovin.impl.v6
    public void a(o4 o4Var) {
        this.f10484g.a(o4Var);
    }

    @Override // com.applovin.impl.q6
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f10484g.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f10484g.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f10484g.e());
        JsonUtils.putString(jSONObject, "ad_format", this.f10484g.getFormat().getLabel());
        String strS0 = this.f10484g.s0();
        if (!StringUtils.isValidString(strS0)) {
            strS0 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", strS0);
        String strB = this.f10484g.B();
        if (!StringUtils.isValidString(strB)) {
            strB = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", strB);
    }

    @Override // com.applovin.impl.q6
    public String f() {
        return "2.0/mvr";
    }

    @Override // com.applovin.impl.v6
    public boolean h() {
        return this.f10484g.w0();
    }
}
