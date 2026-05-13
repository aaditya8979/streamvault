package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4030g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f31769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f31770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f31771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private String f31772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private Map<String, ? extends Object> f31773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private com.ironsource.mediationsdk.h f31774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private Map<String, Object> f31775g;

    public C4030g2(@NotNull String str, boolean z10) {
        tn.p.k(str, "name");
        this.f31769a = str;
        this.f31770b = z10;
        this.f31772d = "";
        this.f31773e = kotlin.collections.a.j();
        this.f31775g = new HashMap();
    }

    public static /* synthetic */ C4030g2 a(C4030g2 c4030g2, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c4030g2.f31769a;
        }
        if ((i10 & 2) != 0) {
            z10 = c4030g2.f31770b;
        }
        return c4030g2.a(str, z10);
    }

    @NotNull
    public final C4030g2 a(@NotNull String str, boolean z10) {
        tn.p.k(str, "name");
        return new C4030g2(str, z10);
    }

    @NotNull
    public final String a() {
        return this.f31769a;
    }

    public final void a(@Nullable com.ironsource.mediationsdk.h hVar) {
        this.f31774f = hVar;
    }

    public final void a(@NotNull String str) {
        tn.p.k(str, "<set-?>");
        this.f31772d = str;
    }

    public final void a(@NotNull Map<String, Object> map) {
        tn.p.k(map, "<set-?>");
        this.f31775g = map;
    }

    public final void a(boolean z10) {
        this.f31771c = z10;
    }

    public final void b(@NotNull Map<String, ? extends Object> map) {
        tn.p.k(map, "<set-?>");
        this.f31773e = map;
    }

    public final boolean b() {
        return this.f31770b;
    }

    @NotNull
    public final Map<String, Object> c() {
        return this.f31775g;
    }

    @Nullable
    public final com.ironsource.mediationsdk.h d() {
        return this.f31774f;
    }

    public final boolean e() {
        return this.f31770b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4030g2)) {
            return false;
        }
        C4030g2 c4030g2 = (C4030g2) obj;
        return tn.p.f(this.f31769a, c4030g2.f31769a) && this.f31770b == c4030g2.f31770b;
    }

    @NotNull
    public final Map<String, Object> f() {
        return this.f31773e;
    }

    @NotNull
    public final String g() {
        return this.f31769a;
    }

    @NotNull
    public final String h() {
        return this.f31772d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.f31769a.hashCode() * 31;
        boolean z10 = this.f31770b;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iHashCode + r12;
    }

    public final boolean i() {
        return this.f31771c;
    }

    @NotNull
    public String toString() {
        return "AuctionRequestInstanceInfo(name=" + this.f31769a + ", bidder=" + this.f31770b + ")";
    }
}
