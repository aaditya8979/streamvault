package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class k8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f8619c;

    public k8(JSONObject jSONObject) {
        this.f8617a = JsonUtils.getString(jSONObject, "user_type", "all");
        this.f8618b = JsonUtils.getString(jSONObject, CommonUrlParts.DEVICE_TYPE, "all");
        this.f8619c = JsonUtils.getStringList(jSONObject, "segments", null);
    }

    public String a() {
        return this.f8617a;
    }

    public String b() {
        return this.f8618b;
    }

    public List c() {
        return this.f8619c;
    }
}
