package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.util.c1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f16093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f16094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l0 f16095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o0 f16096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p0 f16097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t0 f16098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u0 f16099g;

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        c1.a(jSONObject, "id", this.f16093a);
        c1.a(jSONObject, "spotId", this.f16094b);
        c1.a(jSONObject, "display", this.f16095c);
        c1.a(jSONObject, "monitor", this.f16096d);
        c1.a(jSONObject, "native", this.f16097e);
        c1.a(jSONObject, "video", this.f16098f);
        c1.a(jSONObject, "viewability", this.f16099g);
        return jSONObject.toString();
    }
}
