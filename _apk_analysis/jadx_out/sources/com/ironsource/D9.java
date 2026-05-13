package com.ironsource;

import com.ironsource.O0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class D9 extends V {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private final String f29126s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private final List<NetworkSettings> f29127t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private final H9 f29128u;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public D9(@Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull H9 h92) {
        tn.p.k(h92, C4089j8.f32059p);
        IronSource.a aVar = IronSource.a.INTERSTITIAL;
        C4193p2 c4193p2G = h92.g();
        tn.p.j(c4193p2G, "configs.interstitialAuctionSettings");
        super(aVar, str, list, c4193p2G, h92.c(), h92.d(), h92.f(), h92.b(), -1, new O0(O0.a.MANUAL, h92.g().j(), h92.g().b(), -1L), new I0(-1L), h92.h(), h92.k(), h92.m(), h92.l(), false, 32768, null);
        this.f29126s = str;
        this.f29127t = list;
        this.f29128u = h92;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ D9 a(D9 d92, String str, List list, H9 h92, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = d92.f29126s;
        }
        if ((i10 & 2) != 0) {
            list = d92.f29127t;
        }
        if ((i10 & 4) != 0) {
            h92 = d92.f29128u;
        }
        return d92.a(str, list, h92);
    }

    @NotNull
    public final D9 a(@Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull H9 h92) {
        tn.p.k(h92, C4089j8.f32059p);
        return new D9(str, list, h92);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D9)) {
            return false;
        }
        D9 d92 = (D9) obj;
        return tn.p.f(this.f29126s, d92.f29126s) && tn.p.f(this.f29127t, d92.f29127t) && tn.p.f(this.f29128u, d92.f29128u);
    }

    public int hashCode() {
        String str = this.f29126s;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.f29127t;
        return ((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + this.f29128u.hashCode();
    }

    @Override // com.ironsource.V
    @Nullable
    public List<NetworkSettings> j() {
        return this.f29127t;
    }

    @Override // com.ironsource.V
    @Nullable
    public String o() {
        return this.f29126s;
    }

    @Nullable
    public final String s() {
        return this.f29126s;
    }

    @Nullable
    public final List<NetworkSettings> t() {
        return this.f29127t;
    }

    @NotNull
    public String toString() {
        return "InterstitialAdManagerData(userId=" + this.f29126s + ", providerList=" + this.f29127t + ", configs=" + this.f29128u + ")";
    }

    @NotNull
    public final H9 u() {
        return this.f29128u;
    }

    @NotNull
    public final H9 v() {
        return this.f29128u;
    }
}
