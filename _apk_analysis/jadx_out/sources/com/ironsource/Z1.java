package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class Z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f30753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f30754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f30755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private String f30756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private Map<String, ? extends Object> f30757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private com.ironsource.mediationsdk.h f30758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private Map<String, Object> f30759g;

    public Z1(@NotNull String str, boolean z10) {
        tn.p.k(str, "name");
        this.f30753a = str;
        this.f30754b = z10;
        this.f30756d = "";
        this.f30757e = kotlin.collections.a.j();
        this.f30759g = new HashMap();
    }

    public static /* synthetic */ Z1 a(Z1 z12, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = z12.f30753a;
        }
        if ((i10 & 2) != 0) {
            z10 = z12.f30754b;
        }
        return z12.a(str, z10);
    }

    @NotNull
    public final Z1 a(@NotNull String str, boolean z10) {
        tn.p.k(str, "name");
        return new Z1(str, z10);
    }

    @NotNull
    public final String a() {
        return this.f30753a;
    }

    public final void a(@Nullable com.ironsource.mediationsdk.h hVar) {
        this.f30758f = hVar;
    }

    public final void a(@NotNull String str) {
        tn.p.k(str, "<set-?>");
        this.f30756d = str;
    }

    public final void a(@NotNull Map<String, Object> map) {
        tn.p.k(map, "<set-?>");
        this.f30759g = map;
    }

    public final void a(boolean z10) {
        this.f30755c = z10;
    }

    public final void b(@NotNull Map<String, ? extends Object> map) {
        tn.p.k(map, "<set-?>");
        this.f30757e = map;
    }

    public final boolean b() {
        return this.f30754b;
    }

    @NotNull
    public final Map<String, Object> c() {
        return this.f30759g;
    }

    @Nullable
    public final com.ironsource.mediationsdk.h d() {
        return this.f30758f;
    }

    public final boolean e() {
        return this.f30754b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z1)) {
            return false;
        }
        Z1 z12 = (Z1) obj;
        return tn.p.f(this.f30753a, z12.f30753a) && this.f30754b == z12.f30754b;
    }

    @NotNull
    public final Map<String, Object> f() {
        return this.f30757e;
    }

    @NotNull
    public final String g() {
        return this.f30753a;
    }

    @NotNull
    public final String h() {
        return this.f30756d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.f30753a.hashCode() * 31;
        boolean z10 = this.f30754b;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iHashCode + r12;
    }

    public final boolean i() {
        return this.f30755c;
    }

    @NotNull
    public String toString() {
        return "AuctionInstanceInfo(name=" + this.f30753a + ", bidder=" + this.f30754b + ")";
    }
}
