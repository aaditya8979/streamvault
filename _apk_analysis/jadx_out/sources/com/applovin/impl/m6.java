package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class m6 extends o6 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f8778g;

    public m6(com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar) {
        super("TaskReportAppLovinReward", kVar);
        this.f8778g = bVar;
    }

    @Override // com.applovin.impl.q6
    public void a(int i10) {
        super.a(i10);
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.b(this.f8506b, "Failed to report reward for ad: " + this.f8778g + " - error code: " + i10);
        }
        this.f8505a.g().a(d2.H, this.f8778g);
    }

    @Override // com.applovin.impl.q6
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.f8778g.getAdZone().e());
        JsonUtils.putInt(jSONObject, "fire_percent", this.f8778g.P());
        String clCode = this.f8778g.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.o6
    public void b(JSONObject jSONObject) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "Reported reward successfully for ad: " + this.f8778g);
        }
    }

    @Override // com.applovin.impl.q6
    public String f() {
        return "2.0/cr";
    }

    @Override // com.applovin.impl.o6
    public o4 h() {
        return this.f8778g.i();
    }

    @Override // com.applovin.impl.o6
    public void i() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.b(this.f8506b, "No reward result was found for ad: " + this.f8778g);
        }
    }
}
