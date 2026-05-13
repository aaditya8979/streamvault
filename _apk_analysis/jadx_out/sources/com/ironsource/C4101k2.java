package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.k2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4101k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f32114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final JSONObject f32115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final C4157n2 f32116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f32117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f32118e;

    public C4101k2(@NotNull String str, @Nullable JSONObject jSONObject, @Nullable C4157n2 c4157n2, int i10, @NotNull String str2) {
        tn.p.k(str, "auctionId");
        tn.p.k(str2, IronSourceConstants.AUCTION_FALLBACK);
        this.f32114a = str;
        this.f32115b = jSONObject;
        this.f32116c = c4157n2;
        this.f32117d = i10;
        this.f32118e = str2;
    }

    public static /* synthetic */ C4101k2 a(C4101k2 c4101k2, String str, JSONObject jSONObject, C4157n2 c4157n2, int i10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = c4101k2.f32114a;
        }
        if ((i11 & 2) != 0) {
            jSONObject = c4101k2.f32115b;
        }
        JSONObject jSONObject2 = jSONObject;
        if ((i11 & 4) != 0) {
            c4157n2 = c4101k2.f32116c;
        }
        C4157n2 c4157n22 = c4157n2;
        if ((i11 & 8) != 0) {
            i10 = c4101k2.f32117d;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            str2 = c4101k2.f32118e;
        }
        return c4101k2.a(str, jSONObject2, c4157n22, i12, str2);
    }

    @NotNull
    public final C4101k2 a(@NotNull String str, @Nullable JSONObject jSONObject, @Nullable C4157n2 c4157n2, int i10, @NotNull String str2) {
        tn.p.k(str, "auctionId");
        tn.p.k(str2, IronSourceConstants.AUCTION_FALLBACK);
        return new C4101k2(str, jSONObject, c4157n2, i10, str2);
    }

    @NotNull
    public final String a() {
        return this.f32114a;
    }

    @Nullable
    public final JSONObject b() {
        return this.f32115b;
    }

    @Nullable
    public final C4157n2 c() {
        return this.f32116c;
    }

    public final int d() {
        return this.f32117d;
    }

    @NotNull
    public final String e() {
        return this.f32118e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4101k2)) {
            return false;
        }
        C4101k2 c4101k2 = (C4101k2) obj;
        return tn.p.f(this.f32114a, c4101k2.f32114a) && tn.p.f(this.f32115b, c4101k2.f32115b) && tn.p.f(this.f32116c, c4101k2.f32116c) && this.f32117d == c4101k2.f32117d && tn.p.f(this.f32118e, c4101k2.f32118e);
    }

    @NotNull
    public final String f() {
        return this.f32118e;
    }

    @NotNull
    public final String g() {
        return this.f32114a;
    }

    @Nullable
    public final JSONObject h() {
        return this.f32115b;
    }

    public int hashCode() {
        int iHashCode = this.f32114a.hashCode() * 31;
        JSONObject jSONObject = this.f32115b;
        int iHashCode2 = (iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        C4157n2 c4157n2 = this.f32116c;
        return ((((iHashCode2 + (c4157n2 != null ? c4157n2.hashCode() : 0)) * 31) + Integer.hashCode(this.f32117d)) * 31) + this.f32118e.hashCode();
    }

    public final int i() {
        return this.f32117d;
    }

    @Nullable
    public final C4157n2 j() {
        return this.f32116c;
    }

    @NotNull
    public String toString() {
        return "AuctionResponseData(auctionId=" + this.f32114a + ", auctionResponseGenericParam=" + this.f32115b + ", genericNotifications=" + this.f32116c + ", auctionTrial=" + this.f32117d + ", auctionFallback=" + this.f32118e + ")";
    }
}
