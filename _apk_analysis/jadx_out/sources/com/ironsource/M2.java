package com.ironsource;

import com.ironsource.AbstractC4309w0;
import com.ironsource.O0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class M2 extends AbstractC4309w0 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public static final a f29823z = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final J2 f29824t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f29825u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final C4292v0 f29826v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final U2 f29827w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private final String f29828x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    private final String f29829y;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final M2 a(@NotNull J2 j22, @Nullable C3931ab c3931ab, boolean z10) {
            List<C4355yc> listM;
            Ne neD;
            tn.p.k(j22, "adProperties");
            AbstractC4309w0.a aVar = AbstractC4309w0.f34299r;
            T3 t3C = (c3931ab == null || (neD = c3931ab.d()) == null) ? null : neD.c();
            U2 u2C = t3C != null ? t3C.c() : null;
            if (u2C == null) {
                throw new IllegalStateException("Error getting " + j22.a() + " configurations");
            }
            if (c3931ab == null || (listM = c3931ab.d(j22.e(), j22.c())) == null) {
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
            return new M2(j22, z10, new C4292v0(strF, arrayList, c4201paB), u2C);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public M2(@NotNull J2 j22, boolean z10, @NotNull C4292v0 c4292v0, @NotNull U2 u22) {
        tn.p.k(j22, "adProperties");
        tn.p.k(c4292v0, "adUnitCommonData");
        tn.p.k(u22, C4089j8.f32059p);
        String strF = c4292v0.f();
        List<NetworkSettings> listD = c4292v0.d();
        C4201pa c4201paE = c4292v0.e();
        C4193p2 c4193p2D = u22.d();
        tn.p.j(c4193p2D, "configs.bannerAuctionSettings");
        super(j22, z10, strF, listD, c4201paE, c4193p2D, u22.a(), (int) (u22.b() / ((long) 1000)), u22.c(), u22.f(), -1, new O0(O0.a.MANUAL_WITH_AUTOMATIC_RELOAD, u22.d().j(), u22.d().b(), 1000 * ((long) u22.h())), u22.e(), u22.l(), u22.n(), u22.m(), false, 65536, null);
        this.f29824t = j22;
        this.f29825u = z10;
        this.f29826v = c4292v0;
        this.f29827w = u22;
        this.f29828x = "BN";
        this.f29829y = C3949bb.f31029d;
    }

    public static /* synthetic */ M2 a(M2 m22, J2 j22, boolean z10, C4292v0 c4292v0, U2 u22, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j22 = m22.f29824t;
        }
        if ((i10 & 2) != 0) {
            z10 = m22.f29825u;
        }
        if ((i10 & 4) != 0) {
            c4292v0 = m22.f29826v;
        }
        if ((i10 & 8) != 0) {
            u22 = m22.f29827w;
        }
        return m22.a(j22, z10, c4292v0, u22);
    }

    @Override // com.ironsource.AbstractC4309w0
    @NotNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public J2 b() {
        return this.f29824t;
    }

    @NotNull
    public final C4292v0 B() {
        return this.f29826v;
    }

    @NotNull
    public final U2 C() {
        return this.f29827w;
    }

    @NotNull
    public final M2 a(@NotNull J2 j22, boolean z10, @NotNull C4292v0 c4292v0, @NotNull U2 u22) {
        tn.p.k(j22, "adProperties");
        tn.p.k(c4292v0, "adUnitCommonData");
        tn.p.k(u22, C4089j8.f32059p);
        return new M2(j22, z10, c4292v0, u22);
    }

    @Override // com.ironsource.AbstractC4309w0
    @NotNull
    public AdData a(@NotNull NetworkSettings networkSettings) {
        tn.p.k(networkSettings, "providerSettings");
        AdData adDataCreateAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(b(networkSettings), b().a(), r(), new com.ironsource.mediationsdk.q(ContextProvider.getInstance().getApplicationContext(), new C4117l0().b(b().h())));
        tn.p.j(adDataCreateAdDataForNetworkAdapter, "createAdDataForNetworkAd…ze(adProperties.adSize)))");
        return adDataCreateAdDataForNetworkAdapter;
    }

    @Override // com.ironsource.AbstractC4309w0
    @NotNull
    public JSONObject b(@NotNull NetworkSettings networkSettings) {
        tn.p.k(networkSettings, "providerSettings");
        JSONObject bannerSettings = networkSettings.getBannerSettings();
        tn.p.j(bannerSettings, "providerSettings.bannerSettings");
        return bannerSettings;
    }

    @Override // com.ironsource.AbstractC4309w0
    @NotNull
    public String c() {
        return this.f29828x;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M2)) {
            return false;
        }
        M2 m22 = (M2) obj;
        return tn.p.f(this.f29824t, m22.f29824t) && this.f29825u == m22.f29825u && tn.p.f(this.f29826v, m22.f29826v) && tn.p.f(this.f29827w, m22.f29827w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.f29824t.hashCode() * 31;
        boolean z10 = this.f29825u;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return ((((iHashCode + r12) * 31) + this.f29826v.hashCode()) * 31) + this.f29827w.hashCode();
    }

    @Override // com.ironsource.AbstractC4309w0
    @NotNull
    public String j() {
        return this.f29829y;
    }

    @NotNull
    public String toString() {
        return "BannerAdUnitData(adProperties=" + this.f29824t + ", isPublisherLoad=" + this.f29825u + ", adUnitCommonData=" + this.f29826v + ", configs=" + this.f29827w + ")";
    }

    @Override // com.ironsource.AbstractC4309w0
    public boolean u() {
        return this.f29825u;
    }

    @NotNull
    public final J2 w() {
        return this.f29824t;
    }

    public final boolean x() {
        return this.f29825u;
    }

    @NotNull
    public final C4292v0 y() {
        return this.f29826v;
    }

    @NotNull
    public final U2 z() {
        return this.f29827w;
    }
}
