package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.td, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4271td {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f34105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f34106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f34107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f34108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f34109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final Boolean f34110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final JSONObject f34111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final C4342y f34112h;

    public C4271td() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public C4271td(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool, @Nullable JSONObject jSONObject, @Nullable C4342y c4342y) {
        this.f34105a = str;
        this.f34106b = str2;
        this.f34107c = str3;
        this.f34108d = str4;
        this.f34109e = str5;
        this.f34110f = bool;
        this.f34111g = jSONObject;
        this.f34112h = c4342y;
    }

    public /* synthetic */ C4271td(String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, C4342y c4342y, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : bool, (i10 & 64) != 0 ? null : jSONObject, (i10 & 128) == 0 ? c4342y : null);
    }

    @NotNull
    public final C4271td a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool, @Nullable JSONObject jSONObject, @Nullable C4342y c4342y) {
        return new C4271td(str, str2, str3, str4, str5, bool, jSONObject, c4342y);
    }

    @Nullable
    public final String a() {
        return this.f34105a;
    }

    @Nullable
    public final String b() {
        return this.f34106b;
    }

    @Nullable
    public final String c() {
        return this.f34107c;
    }

    @Nullable
    public final String d() {
        return this.f34108d;
    }

    @Nullable
    public final String e() {
        return this.f34109e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4271td)) {
            return false;
        }
        C4271td c4271td = (C4271td) obj;
        return tn.p.f(this.f34105a, c4271td.f34105a) && tn.p.f(this.f34106b, c4271td.f34106b) && tn.p.f(this.f34107c, c4271td.f34107c) && tn.p.f(this.f34108d, c4271td.f34108d) && tn.p.f(this.f34109e, c4271td.f34109e) && tn.p.f(this.f34110f, c4271td.f34110f) && tn.p.f(this.f34111g, c4271td.f34111g) && tn.p.f(this.f34112h, c4271td.f34112h);
    }

    @Nullable
    public final Boolean f() {
        return this.f34110f;
    }

    @Nullable
    public final JSONObject g() {
        return this.f34111g;
    }

    @Nullable
    public final C4342y h() {
        return this.f34112h;
    }

    public int hashCode() {
        String str = this.f34105a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f34106b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f34107c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f34108d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f34109e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.f34110f;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        JSONObject jSONObject = this.f34111g;
        int iHashCode7 = (iHashCode6 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        C4342y c4342y = this.f34112h;
        return iHashCode7 + (c4342y != null ? c4342y.hashCode() : 0);
    }

    @Nullable
    public final C4342y i() {
        return this.f34112h;
    }

    @Nullable
    public final String j() {
        return this.f34105a;
    }

    @Nullable
    public final JSONObject k() {
        return this.f34111g;
    }

    @Nullable
    public final Boolean l() {
        return this.f34110f;
    }

    @Nullable
    public final String m() {
        return this.f34108d;
    }

    @Nullable
    public final String n() {
        return this.f34107c;
    }

    @Nullable
    public final String o() {
        return this.f34106b;
    }

    @Nullable
    public final String p() {
        return this.f34109e;
    }

    @NotNull
    public String toString() {
        return "ProviderConfig2(adSourceName=" + this.f34105a + ", providerNetworkKey=" + this.f34106b + ", providerLoadName=" + this.f34107c + ", providerDefaultInstance=" + this.f34108d + ", spId=" + this.f34109e + ", mpis=" + this.f34110f + ", application=" + this.f34111g + ", adFormats=" + this.f34112h + ")";
    }
}
