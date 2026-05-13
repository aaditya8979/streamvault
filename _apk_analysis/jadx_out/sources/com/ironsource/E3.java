package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class E3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private String f29229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private String f29230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private String f29231c;

    public E3(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        tn.p.k(str, "cachedAppKey");
        tn.p.k(str2, "cachedUserId");
        tn.p.k(str3, "cachedSettings");
        this.f29229a = str;
        this.f29230b = str2;
        this.f29231c = str3;
    }

    public static /* synthetic */ E3 a(E3 e32, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = e32.f29229a;
        }
        if ((i10 & 2) != 0) {
            str2 = e32.f29230b;
        }
        if ((i10 & 4) != 0) {
            str3 = e32.f29231c;
        }
        return e32.a(str, str2, str3);
    }

    @NotNull
    public final E3 a(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        tn.p.k(str, "cachedAppKey");
        tn.p.k(str2, "cachedUserId");
        tn.p.k(str3, "cachedSettings");
        return new E3(str, str2, str3);
    }

    @NotNull
    public final String a() {
        return this.f29229a;
    }

    public final void a(@NotNull String str) {
        tn.p.k(str, "<set-?>");
        this.f29229a = str;
    }

    @NotNull
    public final String b() {
        return this.f29230b;
    }

    public final void b(@NotNull String str) {
        tn.p.k(str, "<set-?>");
        this.f29231c = str;
    }

    @NotNull
    public final String c() {
        return this.f29231c;
    }

    public final void c(@NotNull String str) {
        tn.p.k(str, "<set-?>");
        this.f29230b = str;
    }

    @NotNull
    public final String d() {
        return this.f29229a;
    }

    @NotNull
    public final String e() {
        return this.f29231c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E3)) {
            return false;
        }
        E3 e32 = (E3) obj;
        return tn.p.f(this.f29229a, e32.f29229a) && tn.p.f(this.f29230b, e32.f29230b) && tn.p.f(this.f29231c, e32.f29231c);
    }

    @NotNull
    public final String f() {
        return this.f29230b;
    }

    public int hashCode() {
        return (((this.f29229a.hashCode() * 31) + this.f29230b.hashCode()) * 31) + this.f29231c.hashCode();
    }

    @NotNull
    public String toString() {
        return "CachedResponse(cachedAppKey=" + this.f29229a + ", cachedUserId=" + this.f29230b + ", cachedSettings=" + this.f29231c + ")";
    }
}
