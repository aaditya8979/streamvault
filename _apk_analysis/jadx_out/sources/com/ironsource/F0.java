package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final EnumC4025ff f29282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f29283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f29284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final W7 f29285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f29286e;

    public F0(@NotNull EnumC4025ff enumC4025ff, @NotNull String str, @NotNull String str2, @NotNull W7 w72, @NotNull String str3) {
        tn.p.k(enumC4025ff, "recordType");
        tn.p.k(str, "advertiserBundleId");
        tn.p.k(str2, "networkInstanceId");
        tn.p.k(w72, "adProvider");
        tn.p.k(str3, "adInstanceId");
        this.f29282a = enumC4025ff;
        this.f29283b = str;
        this.f29284c = str2;
        this.f29285d = w72;
        this.f29286e = str3;
    }

    @NotNull
    public final C4236rc a(@NotNull Kb<F0, C4236rc> kb2) {
        tn.p.k(kb2, "mapper");
        return kb2.a(this);
    }

    @NotNull
    public final String a() {
        return this.f29286e;
    }

    @NotNull
    public final W7 b() {
        return this.f29285d;
    }

    @NotNull
    public final String c() {
        return this.f29283b;
    }

    @NotNull
    public final String d() {
        return this.f29284c;
    }

    @NotNull
    public final EnumC4025ff e() {
        return this.f29282a;
    }
}
