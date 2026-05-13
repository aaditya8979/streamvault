package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class Tk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f65948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f65949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f65950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f65951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f65952g;

    public Tk(JSONObject jSONObject) {
        this.f65946a = jSONObject.optString("analyticsSdkVersionName", "");
        this.f65947b = jSONObject.optString("kitBuildNumber", "");
        this.f65948c = jSONObject.optString("appVer", "");
        this.f65949d = jSONObject.optString("appBuild", "");
        this.f65950e = jSONObject.optString("osVer", "");
        this.f65951f = jSONObject.optInt("osApiLev", -1);
        this.f65952g = jSONObject.optInt("attribution_id", 0);
    }

    public final String toString() {
        return "SessionRequestParams(kitVersionName='" + this.f65946a + "', kitBuildNumber='" + this.f65947b + "', appVersion='" + this.f65948c + "', appBuild='" + this.f65949d + "', osVersion='" + this.f65950e + "', apiLevel=" + this.f65951f + ", attributionId=" + this.f65952g + ')';
    }
}
