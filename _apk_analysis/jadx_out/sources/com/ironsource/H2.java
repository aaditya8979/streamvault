package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class H2 extends V {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private final String f29497s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private final List<NetworkSettings> f29498t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private final U2 f29499u;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public H2(@Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull U2 u22) {
        tn.p.k(u22, C4089j8.f32059p);
        IronSource.a aVar = IronSource.a.BANNER;
        C4193p2 c4193p2D = u22.d();
        tn.p.j(c4193p2D, "configs.bannerAuctionSettings");
        super(aVar, str, list, c4193p2D, u22.a(), (int) (u22.b() / ((long) 1000)), u22.c(), u22.f(), -1, I2.b(u22), new I0(u22.j()), u22.e(), u22.l(), u22.n(), u22.m(), false, 32768, null);
        this.f29497s = str;
        this.f29498t = list;
        this.f29499u = u22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ H2 a(H2 h22, String str, List list, U2 u22, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = h22.f29497s;
        }
        if ((i10 & 2) != 0) {
            list = h22.f29498t;
        }
        if ((i10 & 4) != 0) {
            u22 = h22.f29499u;
        }
        return h22.a(str, list, u22);
    }

    @NotNull
    public final H2 a(@Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull U2 u22) {
        tn.p.k(u22, C4089j8.f32059p);
        return new H2(str, list, u22);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H2)) {
            return false;
        }
        H2 h22 = (H2) obj;
        return tn.p.f(this.f29497s, h22.f29497s) && tn.p.f(this.f29498t, h22.f29498t) && tn.p.f(this.f29499u, h22.f29499u);
    }

    public int hashCode() {
        String str = this.f29497s;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.f29498t;
        return ((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + this.f29499u.hashCode();
    }

    @Override // com.ironsource.V
    @Nullable
    public List<NetworkSettings> j() {
        return this.f29498t;
    }

    @Override // com.ironsource.V
    @Nullable
    public String o() {
        return this.f29497s;
    }

    @Nullable
    public final String s() {
        return this.f29497s;
    }

    @Nullable
    public final List<NetworkSettings> t() {
        return this.f29498t;
    }

    @NotNull
    public String toString() {
        return "BannerAdManagerData(userId=" + this.f29497s + ", providerList=" + this.f29498t + ", configs=" + this.f29499u + ")";
    }

    @NotNull
    public final U2 u() {
        return this.f29499u;
    }

    @NotNull
    public final U2 v() {
        return this.f29499u;
    }
}
