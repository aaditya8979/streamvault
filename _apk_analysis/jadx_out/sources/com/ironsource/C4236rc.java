package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.rc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4236rc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final EnumC4025ff f33423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f33424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final W7 f33425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f33426d;

    public C4236rc(@NotNull EnumC4025ff enumC4025ff, @NotNull String str, @NotNull W7 w72, @NotNull String str2) {
        tn.p.k(enumC4025ff, "recordType");
        tn.p.k(str, "advertiserBundleId");
        tn.p.k(w72, "adProvider");
        tn.p.k(str2, "adInstanceId");
        this.f33423a = enumC4025ff;
        this.f33424b = str;
        this.f33425c = w72;
        this.f33426d = str2;
    }

    @NotNull
    public final C4029g1 a(@NotNull Kb<C4236rc, C4029g1> kb2) {
        tn.p.k(kb2, "mapper");
        return kb2.a(this);
    }

    @NotNull
    public final String a() {
        return this.f33426d;
    }

    @NotNull
    public final W7 b() {
        return this.f33425c;
    }

    @NotNull
    public final String c() {
        return this.f33424b;
    }

    @NotNull
    public final EnumC4025ff d() {
        return this.f33423a;
    }
}
