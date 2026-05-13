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

/* JADX INFO: loaded from: classes6.dex */
public final class F9 extends AbstractC4309w0 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public static final a f29308z = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final C4028g0 f29309t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f29310u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final C4292v0 f29311v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final H9 f29312w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private final String f29313x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    private final String f29314y;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final F9 a(@NotNull C4028g0 c4028g0, @Nullable C3931ab c3931ab, boolean z10) {
            List<C4355yc> listM;
            Ne neD;
            tn.p.k(c4028g0, "adProperties");
            AbstractC4309w0.a aVar = AbstractC4309w0.f34299r;
            T3 t3C = (c3931ab == null || (neD = c3931ab.d()) == null) ? null : neD.c();
            H9 h9D = t3C != null ? t3C.d() : null;
            if (h9D == null) {
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
            return new F9(c4028g0, z10, new C4292v0(strF, arrayList, c4201paB), h9D);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public F9(@NotNull C4028g0 c4028g0, boolean z10, @NotNull C4292v0 c4292v0, @NotNull H9 h92) {
        tn.p.k(c4028g0, "adProperties");
        tn.p.k(c4292v0, "adUnitCommonData");
        tn.p.k(h92, C4089j8.f32059p);
        String strF = c4292v0.f();
        List<NetworkSettings> listD = c4292v0.d();
        C4201pa c4201paE = c4292v0.e();
        C4193p2 c4193p2G = h92.g();
        tn.p.j(c4193p2G, "configs.interstitialAuctionSettings");
        super(c4028g0, z10, strF, listD, c4201paE, c4193p2G, h92.c(), h92.d(), h92.f(), h92.b(), -1, new O0(O0.a.MANUAL, h92.g().j(), h92.g().b(), -1L), h92.h(), h92.k(), h92.m(), h92.l(), false, 65536, null);
        this.f29309t = c4028g0;
        this.f29310u = z10;
        this.f29311v = c4292v0;
        this.f29312w = h92;
        this.f29313x = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.f29314y = C3949bb.f31028c;
    }

    public static /* synthetic */ F9 a(F9 f92, C4028g0 c4028g0, boolean z10, C4292v0 c4292v0, H9 h92, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c4028g0 = f92.f29309t;
        }
        if ((i10 & 2) != 0) {
            z10 = f92.f29310u;
        }
        if ((i10 & 4) != 0) {
            c4292v0 = f92.f29311v;
        }
        if ((i10 & 8) != 0) {
            h92 = f92.f29312w;
        }
        return f92.a(c4028g0, z10, c4292v0, h92);
    }

    @NotNull
    public final C4292v0 A() {
        return this.f29311v;
    }

    @NotNull
    public final H9 B() {
        return this.f29312w;
    }

    @NotNull
    public final F9 a(@NotNull C4028g0 c4028g0, boolean z10, @NotNull C4292v0 c4292v0, @NotNull H9 h92) {
        tn.p.k(c4028g0, "adProperties");
        tn.p.k(c4292v0, "adUnitCommonData");
        tn.p.k(h92, C4089j8.f32059p);
        return new F9(c4028g0, z10, c4292v0, h92);
    }

    @Override // com.ironsource.AbstractC4309w0
    @NotNull
    public C4028g0 b() {
        return this.f29309t;
    }

    @Override // com.ironsource.AbstractC4309w0
    @NotNull
    public JSONObject b(@NotNull NetworkSettings networkSettings) {
        tn.p.k(networkSettings, "providerSettings");
        JSONObject interstitialSettings = networkSettings.getInterstitialSettings();
        tn.p.j(interstitialSettings, "providerSettings.interstitialSettings");
        return interstitialSettings;
    }

    @Override // com.ironsource.AbstractC4309w0
    @NotNull
    public String c() {
        return this.f29313x;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F9)) {
            return false;
        }
        F9 f92 = (F9) obj;
        return tn.p.f(this.f29309t, f92.f29309t) && this.f29310u == f92.f29310u && tn.p.f(this.f29311v, f92.f29311v) && tn.p.f(this.f29312w, f92.f29312w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.f29309t.hashCode() * 31;
        boolean z10 = this.f29310u;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return ((((iHashCode + r12) * 31) + this.f29311v.hashCode()) * 31) + this.f29312w.hashCode();
    }

    @Override // com.ironsource.AbstractC4309w0
    @NotNull
    public String j() {
        return this.f29314y;
    }

    @NotNull
    public String toString() {
        return "InterstitialAdUnitData(adProperties=" + this.f29309t + ", isPublisherLoad=" + this.f29310u + ", adUnitCommonData=" + this.f29311v + ", configs=" + this.f29312w + ")";
    }

    @Override // com.ironsource.AbstractC4309w0
    public boolean u() {
        return this.f29310u;
    }

    @NotNull
    public final C4028g0 w() {
        return this.f29309t;
    }

    public final boolean x() {
        return this.f29310u;
    }

    @NotNull
    public final C4292v0 y() {
        return this.f29311v;
    }

    @NotNull
    public final H9 z() {
        return this.f29312w;
    }
}
