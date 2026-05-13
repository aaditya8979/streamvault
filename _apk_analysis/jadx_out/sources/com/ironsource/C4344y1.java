package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4344y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f34413a;

    /* JADX WARN: Multi-variable type inference failed */
    public C4344y1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C4344y1(@NotNull String str) {
        tn.p.k(str, Ne.E1);
        this.f34413a = str;
    }

    public /* synthetic */ C4344y1(String str, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? "" : str);
    }

    public static /* synthetic */ C4344y1 a(C4344y1 c4344y1, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c4344y1.f34413a;
        }
        return c4344y1.a(str);
    }

    @NotNull
    public final C4344y1 a(@NotNull String str) {
        tn.p.k(str, Ne.E1);
        return new C4344y1(str);
    }

    @NotNull
    public final String a() {
        return this.f34413a;
    }

    @NotNull
    public final String b() {
        return this.f34413a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4344y1) && tn.p.f(this.f34413a, ((C4344y1) obj).f34413a);
    }

    public int hashCode() {
        return this.f34413a.hashCode();
    }

    @NotNull
    public String toString() {
        return "ApplicationAuctionSettings(auctionData=" + this.f34413a + ")";
    }
}
