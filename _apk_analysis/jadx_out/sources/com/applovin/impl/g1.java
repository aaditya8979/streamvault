package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f8326a;

    public g1(JSONObject jSONObject) {
        this.f8326a = jSONObject;
    }

    public Integer a() {
        return JsonUtils.getInteger(this.f8326a, "dark_mode_toolbar_color", null);
    }

    public String b() {
        return JsonUtils.getString(this.f8326a, "digital_asset_link_url", null);
    }

    public Boolean c() {
        return JsonUtils.getBoolean(this.f8326a, "instant_apps_enabled", null);
    }

    public String d() {
        return JsonUtils.getString(this.f8326a, "referrer", null);
    }

    public Integer e() {
        return JsonUtils.getInteger(this.f8326a, "session_url_relation", null);
    }

    public Integer f() {
        return JsonUtils.getInteger(this.f8326a, "share_state", null);
    }

    public Boolean g() {
        return JsonUtils.getBoolean(this.f8326a, "should_show_title", null);
    }

    public Integer h() {
        return JsonUtils.getInteger(this.f8326a, "toolbar_color", null);
    }

    public Boolean i() {
        return JsonUtils.getBoolean(this.f8326a, "url_bar_hiding_enabled", null);
    }
}
