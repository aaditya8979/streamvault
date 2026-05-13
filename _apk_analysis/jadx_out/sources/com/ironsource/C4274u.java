package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C4274u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final EnumC4025ff f34136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f34137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f34138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f34139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final W7 f34140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f34141f;

    public C4274u(@NotNull EnumC4025ff enumC4025ff, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull W7 w72, @NotNull String str4) {
        tn.p.k(enumC4025ff, "recordType");
        tn.p.k(str, "advertiserBundleId");
        tn.p.k(str2, "networkInstanceId");
        tn.p.k(str3, "adUnitId");
        tn.p.k(w72, "adProvider");
        tn.p.k(str4, "adInstanceId");
        this.f34136a = enumC4025ff;
        this.f34137b = str;
        this.f34138c = str2;
        this.f34139d = str3;
        this.f34140e = w72;
        this.f34141f = str4;
    }

    @NotNull
    public final F0 a(@NotNull Kb<C4274u, F0> kb2) {
        tn.p.k(kb2, "mapper");
        return kb2.a(this);
    }

    @NotNull
    public final String a() {
        return this.f34141f;
    }

    @NotNull
    public final W7 b() {
        return this.f34140e;
    }

    @NotNull
    public final String c() {
        return this.f34139d;
    }

    @NotNull
    public final String d() {
        return this.f34137b;
    }

    @NotNull
    public final String e() {
        return this.f34138c;
    }

    @NotNull
    public final EnumC4025ff f() {
        return this.f34136a;
    }
}
