package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.b9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3947b9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f31019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f31020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private W f31021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f31022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private String f31023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private String f31024f;

    public C3947b9(@NotNull String str, @NotNull String str2) {
        tn.p.k(str, "appKey");
        tn.p.k(str2, "userId");
        this.f31019a = str;
        this.f31020b = str2;
    }

    public static /* synthetic */ C3947b9 a(C3947b9 c3947b9, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c3947b9.f31019a;
        }
        if ((i10 & 2) != 0) {
            str2 = c3947b9.f31020b;
        }
        return c3947b9.a(str, str2);
    }

    @NotNull
    public final C3947b9 a(@NotNull String str, @NotNull String str2) {
        tn.p.k(str, "appKey");
        tn.p.k(str2, "userId");
        return new C3947b9(str, str2);
    }

    public final <T> T a(@NotNull Kb<C3947b9, T> kb2) {
        tn.p.k(kb2, "mapper");
        return kb2.a(this);
    }

    @NotNull
    public final String a() {
        return this.f31019a;
    }

    public final void a(@Nullable W w10) {
        this.f31021c = w10;
    }

    public final void a(@Nullable String str) {
        this.f31024f = str;
    }

    public final void a(boolean z10) {
        this.f31022d = z10;
    }

    @NotNull
    public final String b() {
        return this.f31020b;
    }

    public final void b(@Nullable String str) {
        this.f31023e = str;
    }

    public final boolean c() {
        return this.f31022d;
    }

    @NotNull
    public final String d() {
        return this.f31019a;
    }

    @Nullable
    public final W e() {
        return this.f31021c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3947b9)) {
            return false;
        }
        C3947b9 c3947b9 = (C3947b9) obj;
        return tn.p.f(this.f31019a, c3947b9.f31019a) && tn.p.f(this.f31020b, c3947b9.f31020b);
    }

    @Nullable
    public final String f() {
        return this.f31024f;
    }

    @Nullable
    public final String g() {
        return this.f31023e;
    }

    @NotNull
    public final String h() {
        return this.f31020b;
    }

    public int hashCode() {
        return (this.f31019a.hashCode() * 31) + this.f31020b.hashCode();
    }

    @NotNull
    public String toString() {
        return "InitConfig(appKey=" + this.f31019a + ", userId=" + this.f31020b + ")";
    }
}
