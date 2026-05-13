package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.u4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4279u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f34192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f34193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f34194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f34195d;

    public C4279u4() {
        this(null, null, null, null, 15, null);
    }

    public C4279u4(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        tn.p.k(str, "customNetworkAdapterName");
        tn.p.k(str2, "customRewardedVideoAdapterName");
        tn.p.k(str3, "customInterstitialAdapterName");
        tn.p.k(str4, "customBannerAdapterName");
        this.f34192a = str;
        this.f34193b = str2;
        this.f34194c = str3;
        this.f34195d = str4;
    }

    public /* synthetic */ C4279u4(String str, String str2, String str3, String str4, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4);
    }

    public static /* synthetic */ C4279u4 a(C4279u4 c4279u4, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c4279u4.f34192a;
        }
        if ((i10 & 2) != 0) {
            str2 = c4279u4.f34193b;
        }
        if ((i10 & 4) != 0) {
            str3 = c4279u4.f34194c;
        }
        if ((i10 & 8) != 0) {
            str4 = c4279u4.f34195d;
        }
        return c4279u4.a(str, str2, str3, str4);
    }

    @NotNull
    public final C4279u4 a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        tn.p.k(str, "customNetworkAdapterName");
        tn.p.k(str2, "customRewardedVideoAdapterName");
        tn.p.k(str3, "customInterstitialAdapterName");
        tn.p.k(str4, "customBannerAdapterName");
        return new C4279u4(str, str2, str3, str4);
    }

    @NotNull
    public final String a() {
        return this.f34192a;
    }

    @NotNull
    public final String b() {
        return this.f34193b;
    }

    @NotNull
    public final String c() {
        return this.f34194c;
    }

    @NotNull
    public final String d() {
        return this.f34195d;
    }

    @NotNull
    public final String e() {
        return this.f34195d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4279u4)) {
            return false;
        }
        C4279u4 c4279u4 = (C4279u4) obj;
        return tn.p.f(this.f34192a, c4279u4.f34192a) && tn.p.f(this.f34193b, c4279u4.f34193b) && tn.p.f(this.f34194c, c4279u4.f34194c) && tn.p.f(this.f34195d, c4279u4.f34195d);
    }

    @NotNull
    public final String f() {
        return this.f34194c;
    }

    @NotNull
    public final String g() {
        return this.f34192a;
    }

    @NotNull
    public final String h() {
        return this.f34193b;
    }

    public int hashCode() {
        return (((((this.f34192a.hashCode() * 31) + this.f34193b.hashCode()) * 31) + this.f34194c.hashCode()) * 31) + this.f34195d.hashCode();
    }

    @NotNull
    public String toString() {
        return "CustomAdapterSettings(customNetworkAdapterName=" + this.f34192a + ", customRewardedVideoAdapterName=" + this.f34193b + ", customInterstitialAdapterName=" + this.f34194c + ", customBannerAdapterName=" + this.f34195d + ")";
    }
}
