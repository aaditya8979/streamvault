package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ue, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4289ue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ne f34212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4322wd f34213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Ad f34214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final U3 f34215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Q5 f34216e;

    public C4289ue(@NotNull Ne ne2) {
        tn.p.k(ne2, "fullResponse");
        this.f34212a = ne2;
        JSONObject jSONObjectOptJSONObject = ne2.j().optJSONObject("providerOrder");
        this.f34213b = new C4322wd(jSONObjectOptJSONObject == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObjectOptJSONObject);
        JSONObject jSONObjectOptJSONObject2 = ne2.j().optJSONObject("providerSettings");
        this.f34214c = new Ad(jSONObjectOptJSONObject2 == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObjectOptJSONObject2);
        JSONObject jSONObjectOptJSONObject3 = ne2.j().optJSONObject("configurations");
        this.f34215d = new U3(jSONObjectOptJSONObject3 == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObjectOptJSONObject3);
        JSONObject jSONObjectOptJSONObject4 = ne2.j().optJSONObject(C4306ve.f34270d);
        this.f34216e = new Q5(jSONObjectOptJSONObject4 == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObjectOptJSONObject4);
    }

    @NotNull
    public final U3 a() {
        return this.f34215d;
    }

    @NotNull
    public final Q5 b() {
        return this.f34216e;
    }

    @NotNull
    public final Ne c() {
        return this.f34212a;
    }

    @NotNull
    public final C4322wd d() {
        return this.f34213b;
    }

    @NotNull
    public final Ad e() {
        return this.f34214c;
    }
}
