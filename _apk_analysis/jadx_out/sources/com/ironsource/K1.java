package com.ironsource;

import com.ironsource.C3978d4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class K1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final JSONObject f29699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f29700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f29701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f29702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f29703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f29704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f29705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f29706h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f29707i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f29708j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f29709k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private final JSONObject f29710l;

    public K1(@NotNull JSONObject jSONObject) {
        tn.p.k(jSONObject, "config");
        this.f29699a = jSONObject;
        this.f29700b = jSONObject.optBoolean("isExternalArmEventsEnabled", true);
        String strOptString = jSONObject.optString("externalArmEventsUrl", T5.f30475j);
        tn.p.j(strOptString, "config.optString(EXTERNA…AL_EVENTS_IMPRESSION_URL)");
        this.f29701c = strOptString;
        this.f29702d = jSONObject.optBoolean("sid", true);
        this.f29703e = jSONObject.optBoolean("radvid", false);
        this.f29704f = jSONObject.optInt("uaeh", 0);
        this.f29705g = jSONObject.optBoolean("sharedThreadPool", false);
        this.f29706h = jSONObject.optBoolean("sharedThreadPoolADP", true);
        this.f29707i = jSONObject.optInt(Q6.T0, -1);
        this.f29708j = jSONObject.optBoolean("axal", false);
        this.f29709k = jSONObject.optBoolean("psrt", false);
        this.f29710l = jSONObject.optJSONObject(C3978d4.a.f31207c);
    }

    public static /* synthetic */ K1 a(K1 k12, JSONObject jSONObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jSONObject = k12.f29699a;
        }
        return k12.a(jSONObject);
    }

    private final JSONObject a() {
        return this.f29699a;
    }

    @NotNull
    public final K1 a(@NotNull JSONObject jSONObject) {
        tn.p.k(jSONObject, "config");
        return new K1(jSONObject);
    }

    public final int b() {
        return this.f29707i;
    }

    @Nullable
    public final JSONObject c() {
        return this.f29710l;
    }

    @NotNull
    public final String d() {
        return this.f29701c;
    }

    public final boolean e() {
        return this.f29709k;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof K1) && tn.p.f(this.f29699a, ((K1) obj).f29699a);
    }

    public final boolean f() {
        return this.f29703e;
    }

    public final boolean g() {
        return this.f29702d;
    }

    public final boolean h() {
        return this.f29705g;
    }

    public int hashCode() {
        return this.f29699a.hashCode();
    }

    public final boolean i() {
        return this.f29706h;
    }

    public final int j() {
        return this.f29704f;
    }

    public final boolean k() {
        return this.f29708j;
    }

    public final boolean l() {
        return this.f29700b;
    }

    @NotNull
    public String toString() {
        return "ApplicationGeneralSettings(config=" + this.f29699a + ")";
    }
}
