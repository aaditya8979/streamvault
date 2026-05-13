package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4361z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Hb f34481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final G1 f34482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f34483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final D1 f34484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final K1 f34485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final C4327x1 f34486f;

    public C4361z1(@NotNull JSONObject jSONObject) {
        tn.p.k(jSONObject, "applicationConfigurations");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("loggers");
        this.f34481a = new Hb(jSONObjectOptJSONObject == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObjectOptJSONObject);
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("events");
        this.f34482b = new G1(jSONObjectOptJSONObject2 == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObjectOptJSONObject2);
        this.f34483c = jSONObject.optBoolean("integration", false);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("crashReporter");
        this.f34484d = new D1(jSONObjectOptJSONObject3 == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObjectOptJSONObject3);
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("settings");
        this.f34485e = new K1(jSONObjectOptJSONObject4 == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObjectOptJSONObject4);
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("auction");
        this.f34486f = new C4327x1(jSONObjectOptJSONObject5 == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObjectOptJSONObject5);
    }

    @NotNull
    public final C4327x1 a() {
        return this.f34486f;
    }

    @NotNull
    public final D1 b() {
        return this.f34484d;
    }

    @NotNull
    public final G1 c() {
        return this.f34482b;
    }

    @NotNull
    public final K1 d() {
        return this.f34485e;
    }

    public final boolean e() {
        return this.f34483c;
    }

    @NotNull
    public final Hb f() {
        return this.f34481a;
    }
}
