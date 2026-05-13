package com.ironsource;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4175o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f33132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.ironsource.mediationsdk.d f33133b;

    public C4175o2(@NotNull String str) {
        tn.p.k(str, C4157n2.f33010s);
        this.f33132a = str;
        this.f33133b = com.ironsource.mediationsdk.d.b();
    }

    public static /* synthetic */ C4175o2 a(C4175o2 c4175o2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c4175o2.f33132a;
        }
        return c4175o2.a(str);
    }

    private final String c() {
        return this.f33132a;
    }

    @NotNull
    public final C4175o2 a(@NotNull String str) {
        tn.p.k(str, C4157n2.f33010s);
        return new C4175o2(str);
    }

    @NotNull
    public final String a() {
        String strA = this.f33133b.a(this.f33132a);
        tn.p.j(strA, "auctionDataUtils.getAdmFromServerData(serverData)");
        return strA;
    }

    @NotNull
    public final Map<String, String> b() {
        Map<String, String> mapB = this.f33133b.b(this.f33132a);
        tn.p.j(mapB, "auctionDataUtils.getAuct…verDataParams(serverData)");
        return mapB;
    }

    @NotNull
    public final String d() {
        String strC = this.f33133b.c(this.f33132a);
        tn.p.j(strC, "auctionDataUtils.getDyna…romServerData(serverData)");
        return strC;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4175o2) && tn.p.f(this.f33132a, ((C4175o2) obj).f33132a);
    }

    public int hashCode() {
        return this.f33132a.hashCode();
    }

    @NotNull
    public String toString() {
        return "AuctionServerData(serverData=" + this.f33132a + ")";
    }
}
