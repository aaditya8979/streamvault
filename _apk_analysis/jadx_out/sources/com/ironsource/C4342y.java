package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C4342y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final JSONObject f34409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final JSONObject f34410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final JSONObject f34411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final JSONObject f34412d;

    public C4342y() {
        this(null, null, null, null, 15, null);
    }

    public C4342y(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable JSONObject jSONObject3, @Nullable JSONObject jSONObject4) {
        this.f34409a = jSONObject;
        this.f34410b = jSONObject2;
        this.f34411c = jSONObject3;
        this.f34412d = jSONObject4;
    }

    public /* synthetic */ C4342y(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : jSONObject, (i10 & 2) != 0 ? null : jSONObject2, (i10 & 4) != 0 ? null : jSONObject3, (i10 & 8) != 0 ? null : jSONObject4);
    }

    public static /* synthetic */ C4342y a(C4342y c4342y, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jSONObject = c4342y.f34409a;
        }
        if ((i10 & 2) != 0) {
            jSONObject2 = c4342y.f34410b;
        }
        if ((i10 & 4) != 0) {
            jSONObject3 = c4342y.f34411c;
        }
        if ((i10 & 8) != 0) {
            jSONObject4 = c4342y.f34412d;
        }
        return c4342y.a(jSONObject, jSONObject2, jSONObject3, jSONObject4);
    }

    @NotNull
    public final C4342y a(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable JSONObject jSONObject3, @Nullable JSONObject jSONObject4) {
        return new C4342y(jSONObject, jSONObject2, jSONObject3, jSONObject4);
    }

    @Nullable
    public final JSONObject a() {
        return this.f34409a;
    }

    @Nullable
    public final JSONObject b() {
        return this.f34410b;
    }

    @Nullable
    public final JSONObject c() {
        return this.f34411c;
    }

    @Nullable
    public final JSONObject d() {
        return this.f34412d;
    }

    @Nullable
    public final JSONObject e() {
        return this.f34411c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4342y)) {
            return false;
        }
        C4342y c4342y = (C4342y) obj;
        return tn.p.f(this.f34409a, c4342y.f34409a) && tn.p.f(this.f34410b, c4342y.f34410b) && tn.p.f(this.f34411c, c4342y.f34411c) && tn.p.f(this.f34412d, c4342y.f34412d);
    }

    @Nullable
    public final JSONObject f() {
        return this.f34410b;
    }

    @Nullable
    public final JSONObject g() {
        return this.f34412d;
    }

    @Nullable
    public final JSONObject h() {
        return this.f34409a;
    }

    public int hashCode() {
        JSONObject jSONObject = this.f34409a;
        int iHashCode = (jSONObject == null ? 0 : jSONObject.hashCode()) * 31;
        JSONObject jSONObject2 = this.f34410b;
        int iHashCode2 = (iHashCode + (jSONObject2 == null ? 0 : jSONObject2.hashCode())) * 31;
        JSONObject jSONObject3 = this.f34411c;
        int iHashCode3 = (iHashCode2 + (jSONObject3 == null ? 0 : jSONObject3.hashCode())) * 31;
        JSONObject jSONObject4 = this.f34412d;
        return iHashCode3 + (jSONObject4 != null ? jSONObject4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AdFormatsConfig2(rewarded=" + this.f34409a + ", interstitial=" + this.f34410b + ", banner=" + this.f34411c + ", nativeAd=" + this.f34412d + ")";
    }
}
