package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import com.unity3d.mediation.LevelPlay;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class U3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4240s f30534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4240s f30535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final T2 f30536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Rb f30537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final C4361z1 f30538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Map<LevelPlay.AdFormat, C4240s> f30539f;

    public U3(@NotNull JSONObject jSONObject) {
        tn.p.k(jSONObject, "configurations");
        C4240s c4240s = new C4240s(a(jSONObject, "rewarded"));
        this.f30534a = c4240s;
        C4240s c4240s2 = new C4240s(a(jSONObject, "interstitial"));
        this.f30535b = c4240s2;
        this.f30536c = new T2(a(jSONObject, "banner"));
        this.f30537d = new Rb(a(jSONObject, "nativeAd"));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("application");
        this.f30538e = new C4361z1(jSONObjectOptJSONObject == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObjectOptJSONObject);
        this.f30539f = kotlin.collections.a.m(bn.h.a(LevelPlay.AdFormat.INTERSTITIAL, c4240s2), bn.h.a(LevelPlay.AdFormat.REWARDED, c4240s));
    }

    private final JSONObject a(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("adFormats");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject(str) : null;
        return jSONObjectOptJSONObject2 == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObjectOptJSONObject2;
    }

    @NotNull
    public final Map<LevelPlay.AdFormat, C4240s> a() {
        return this.f30539f;
    }

    @NotNull
    public final C4361z1 b() {
        return this.f30538e;
    }

    @NotNull
    public final T2 c() {
        return this.f30536c;
    }

    @NotNull
    public final Rb d() {
        return this.f30537d;
    }
}
