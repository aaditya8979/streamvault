package com.ironsource;

import com.ironsource.AbstractC4309w0;
import com.ironsource.O0;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class Td extends AbstractC4309w0 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public static final a f30507z = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final C4028g0 f30508t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f30509u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final C4292v0 f30510v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final Zd f30511w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private final String f30512x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    private final String f30513y;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final Td a(@NotNull C4028g0 c4028g0, @Nullable C3931ab c3931ab, boolean z10) {
            List<C4355yc> listM;
            Ne neD;
            tn.p.k(c4028g0, "adProperties");
            AbstractC4309w0.a aVar = AbstractC4309w0.f34299r;
            T3 t3C = (c3931ab == null || (neD = c3931ab.d()) == null) ? null : neD.c();
            Zd zdF = t3C != null ? t3C.f() : null;
            if (zdF == null) {
                throw new IllegalStateException("Error getting " + c4028g0.a() + " configurations");
            }
            if (c3931ab == null || (listM = c3931ab.d(c4028g0.e(), c4028g0.c())) == null) {
                listM = cn.w.m();
            }
            String strF = IronSourceUtils.f();
            ArrayList arrayList = new ArrayList(cn.x.x(listM, 10));
            Iterator<T> it = listM.iterator();
            while (it.hasNext()) {
                arrayList.add(((C4355yc) it.next()).f());
            }
            C4201pa c4201paB = C4201pa.b();
            tn.p.j(c4201paB, "getInstance()");
            return new Td(c4028g0, z10, new C4292v0(strF, arrayList, c4201paB), zdF);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Td(@NotNull C4028g0 c4028g0, boolean z10, @NotNull C4292v0 c4292v0, @NotNull Zd zd2) {
        tn.p.k(c4028g0, "adProperties");
        tn.p.k(c4292v0, "adUnitCommonData");
        tn.p.k(zd2, C4089j8.f32059p);
        String strF = c4292v0.f();
        List<NetworkSettings> listD = c4292v0.d();
        C4201pa c4201paE = c4292v0.e();
        C4193p2 c4193p2K = zd2.k();
        tn.p.j(c4193p2K, "configs.rewardedVideoAuctionSettings");
        super(c4028g0, z10, strF, listD, c4201paE, c4193p2K, zd2.g(), zd2.h(), zd2.j(), zd2.b(), zd2.c(), new O0(O0.a.MANUAL, zd2.k().j(), zd2.k().b(), -1L), zd2.l(), zd2.f(), zd2.o(), zd2.n(), false, 65536, null);
        this.f30508t = c4028g0;
        this.f30509u = z10;
        this.f30510v = c4292v0;
        this.f30511w = zd2;
        this.f30512x = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.f30513y = C3949bb.f31027b;
    }

    public static /* synthetic */ Td a(Td td2, C4028g0 c4028g0, boolean z10, C4292v0 c4292v0, Zd zd2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c4028g0 = td2.f30508t;
        }
        if ((i10 & 2) != 0) {
            z10 = td2.f30509u;
        }
        if ((i10 & 4) != 0) {
            c4292v0 = td2.f30510v;
        }
        if ((i10 & 8) != 0) {
            zd2 = td2.f30511w;
        }
        return td2.a(c4028g0, z10, c4292v0, zd2);
    }

    @NotNull
    public final C4292v0 A() {
        return this.f30510v;
    }

    @NotNull
    public final Zd B() {
        return this.f30511w;
    }

    @NotNull
    public final Td a(@NotNull C4028g0 c4028g0, boolean z10, @NotNull C4292v0 c4292v0, @NotNull Zd zd2) {
        tn.p.k(c4028g0, "adProperties");
        tn.p.k(c4292v0, "adUnitCommonData");
        tn.p.k(zd2, C4089j8.f32059p);
        return new Td(c4028g0, z10, c4292v0, zd2);
    }

    @Override // com.ironsource.AbstractC4309w0
    @NotNull
    public C4028g0 b() {
        return this.f30508t;
    }

    @Override // com.ironsource.AbstractC4309w0
    @NotNull
    public JSONObject b(@NotNull NetworkSettings networkSettings) {
        tn.p.k(networkSettings, "providerSettings");
        JSONObject rewardedVideoSettings = networkSettings.getRewardedVideoSettings();
        tn.p.j(rewardedVideoSettings, "providerSettings.rewardedVideoSettings");
        return rewardedVideoSettings;
    }

    @Override // com.ironsource.AbstractC4309w0
    @NotNull
    public String c() {
        return this.f30512x;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Td)) {
            return false;
        }
        Td td2 = (Td) obj;
        return tn.p.f(this.f30508t, td2.f30508t) && this.f30509u == td2.f30509u && tn.p.f(this.f30510v, td2.f30510v) && tn.p.f(this.f30511w, td2.f30511w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.f30508t.hashCode() * 31;
        boolean z10 = this.f30509u;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return ((((iHashCode + r12) * 31) + this.f30510v.hashCode()) * 31) + this.f30511w.hashCode();
    }

    @Override // com.ironsource.AbstractC4309w0
    @NotNull
    public String j() {
        return this.f30513y;
    }

    @NotNull
    public String toString() {
        return "RewardedAdUnitData(adProperties=" + this.f30508t + ", isPublisherLoad=" + this.f30509u + ", adUnitCommonData=" + this.f30510v + ", configs=" + this.f30511w + ")";
    }

    @Override // com.ironsource.AbstractC4309w0
    public boolean u() {
        return this.f30509u;
    }

    @NotNull
    public final C4028g0 w() {
        return this.f30508t;
    }

    public final boolean x() {
        return this.f30509u;
    }

    @NotNull
    public final C4292v0 y() {
        return this.f30510v;
    }

    @NotNull
    public final Zd z() {
        return this.f30511w;
    }
}
