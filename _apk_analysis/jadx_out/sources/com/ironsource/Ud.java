package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class Ud extends V {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private final String f30549s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private final List<NetworkSettings> f30550t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private final Zd f30551u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f30552v;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public Ud(@Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull Zd zd2, boolean z10) {
        tn.p.k(zd2, C4089j8.f32059p);
        IronSource.a aVar = IronSource.a.REWARDED_VIDEO;
        C4193p2 c4193p2K = zd2.k();
        tn.p.j(c4193p2K, "configs.rewardedVideoAuctionSettings");
        super(aVar, str, list, c4193p2K, zd2.g(), zd2.h(), zd2.j(), zd2.b(), zd2.c(), Vd.b(zd2, z10), new I0(-1L), zd2.l(), zd2.f(), zd2.o(), zd2.n(), false, 32768, null);
        this.f30549s = str;
        this.f30550t = list;
        this.f30551u = zd2;
        this.f30552v = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Ud a(Ud ud2, String str, List list, Zd zd2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ud2.f30549s;
        }
        if ((i10 & 2) != 0) {
            list = ud2.f30550t;
        }
        if ((i10 & 4) != 0) {
            zd2 = ud2.f30551u;
        }
        if ((i10 & 8) != 0) {
            z10 = ud2.f30552v;
        }
        return ud2.a(str, list, zd2, z10);
    }

    @NotNull
    public final Ud a(@Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull Zd zd2, boolean z10) {
        tn.p.k(zd2, C4089j8.f32059p);
        return new Ud(str, list, zd2, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ud)) {
            return false;
        }
        Ud ud2 = (Ud) obj;
        return tn.p.f(this.f30549s, ud2.f30549s) && tn.p.f(this.f30550t, ud2.f30550t) && tn.p.f(this.f30551u, ud2.f30551u) && this.f30552v == ud2.f30552v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public int hashCode() {
        String str = this.f30549s;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.f30550t;
        int iHashCode2 = (((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + this.f30551u.hashCode()) * 31;
        boolean z10 = this.f30552v;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iHashCode2 + r12;
    }

    @Override // com.ironsource.V
    @Nullable
    public List<NetworkSettings> j() {
        return this.f30550t;
    }

    @Override // com.ironsource.V
    @Nullable
    public String o() {
        return this.f30549s;
    }

    @Nullable
    public final String s() {
        return this.f30549s;
    }

    @Nullable
    public final List<NetworkSettings> t() {
        return this.f30550t;
    }

    @NotNull
    public String toString() {
        return "RewardedVideoAdDataManager(userId=" + this.f30549s + ", providerList=" + this.f30550t + ", configs=" + this.f30551u + ", isManual=" + this.f30552v + ")";
    }

    @NotNull
    public final Zd u() {
        return this.f30551u;
    }

    public final boolean v() {
        return this.f30552v;
    }

    @NotNull
    public final Zd w() {
        return this.f30551u;
    }

    public final boolean x() {
        return this.f30552v;
    }
}
