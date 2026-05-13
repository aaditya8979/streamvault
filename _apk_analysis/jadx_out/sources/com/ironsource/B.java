package com.ironsource;

import com.ironsource.C4208q0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC4309w0 f28743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final NetworkSettings f28744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final C4101k2 f28745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final C3957c1 f28746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final C4157n2 f28747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f28748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final I f28749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final IronSource.a f28750h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final JSONObject f28751i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final String f28752j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f28753k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final String f28754l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private final C4157n2 f28755m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final String f28756n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final String f28757o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f28758p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final AdData f28759q;

    public B(@NotNull AbstractC4309w0 abstractC4309w0, @NotNull NetworkSettings networkSettings, @NotNull C4101k2 c4101k2, @NotNull C3957c1 c3957c1, @NotNull C4157n2 c4157n2, int i10) {
        tn.p.k(abstractC4309w0, "adUnitData");
        tn.p.k(networkSettings, "providerSettings");
        tn.p.k(c4101k2, Ne.E1);
        tn.p.k(c3957c1, "adapterConfig");
        tn.p.k(c4157n2, "auctionResponseItem");
        this.f28743a = abstractC4309w0;
        this.f28744b = networkSettings;
        this.f28745c = c4101k2;
        this.f28746d = c3957c1;
        this.f28747e = c4157n2;
        this.f28748f = i10;
        this.f28749g = new I(C4208q0.a.DidntAttemptToLoad);
        IronSource.a aVarA = abstractC4309w0.b().a();
        this.f28750h = aVarA;
        this.f28751i = c4101k2.h();
        this.f28752j = c4101k2.g();
        this.f28753k = c4101k2.i();
        this.f28754l = c4101k2.f();
        this.f28755m = c4101k2.j();
        String strF = c3957c1.f();
        tn.p.j(strF, "adapterConfig.providerName");
        this.f28756n = strF;
        tn.x xVar = tn.x.f85368a;
        String str = String.format("%s %s", Arrays.copyOf(new Object[]{strF, Integer.valueOf(hashCode())}, 2));
        tn.p.j(str, "format(format, *args)");
        this.f28757o = str;
        this.f28758p = c3957c1.d();
        String strK = c4157n2.k();
        Map<String, Object> mapA = C4127la.a(c4157n2.a());
        tn.p.j(mapA, "jsonObjectToMap(auctionResponseItem.adData)");
        mapA.put("adUnit", aVarA);
        HashMap map = new HashMap();
        Map<String, Object> mapA2 = C4127la.a(c3957c1.c());
        tn.p.j(mapA2, "jsonObjectToMap(adapterConfig.adUnitSettings)");
        map.putAll(mapA2);
        mapA.put("userId", abstractC4309w0.r());
        mapA.put("adUnitId", abstractC4309w0.b().c());
        mapA.put("isMultipleAdUnits", Boolean.TRUE);
        this.f28759q = new AdData(strK, map, mapA);
    }

    public static /* synthetic */ B a(B b10, AbstractC4309w0 abstractC4309w0, NetworkSettings networkSettings, C4101k2 c4101k2, C3957c1 c3957c1, C4157n2 c4157n2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            abstractC4309w0 = b10.f28743a;
        }
        if ((i11 & 2) != 0) {
            networkSettings = b10.f28744b;
        }
        NetworkSettings networkSettings2 = networkSettings;
        if ((i11 & 4) != 0) {
            c4101k2 = b10.f28745c;
        }
        C4101k2 c4101k22 = c4101k2;
        if ((i11 & 8) != 0) {
            c3957c1 = b10.f28746d;
        }
        C3957c1 c3957c12 = c3957c1;
        if ((i11 & 16) != 0) {
            c4157n2 = b10.f28747e;
        }
        C4157n2 c4157n22 = c4157n2;
        if ((i11 & 32) != 0) {
            i10 = b10.f28748f;
        }
        return b10.a(abstractC4309w0, networkSettings2, c4101k22, c3957c12, c4157n22, i10);
    }

    @NotNull
    public final B a(@NotNull AbstractC4309w0 abstractC4309w0, @NotNull NetworkSettings networkSettings, @NotNull C4101k2 c4101k2, @NotNull C3957c1 c3957c1, @NotNull C4157n2 c4157n2, int i10) {
        tn.p.k(abstractC4309w0, "adUnitData");
        tn.p.k(networkSettings, "providerSettings");
        tn.p.k(c4101k2, Ne.E1);
        tn.p.k(c3957c1, "adapterConfig");
        tn.p.k(c4157n2, "auctionResponseItem");
        return new B(abstractC4309w0, networkSettings, c4101k2, c3957c1, c4157n2, i10);
    }

    @NotNull
    public final AbstractC4309w0 a() {
        return this.f28743a;
    }

    public final void a(@NotNull C4208q0.a aVar) {
        tn.p.k(aVar, "performance");
        this.f28749g.b(aVar);
    }

    @NotNull
    public final NetworkSettings b() {
        return this.f28744b;
    }

    @NotNull
    public final C4101k2 c() {
        return this.f28745c;
    }

    @NotNull
    public final C3957c1 d() {
        return this.f28746d;
    }

    @NotNull
    public final C4157n2 e() {
        return this.f28747e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b10 = (B) obj;
        return tn.p.f(this.f28743a, b10.f28743a) && tn.p.f(this.f28744b, b10.f28744b) && tn.p.f(this.f28745c, b10.f28745c) && tn.p.f(this.f28746d, b10.f28746d) && tn.p.f(this.f28747e, b10.f28747e) && this.f28748f == b10.f28748f;
    }

    public final int f() {
        return this.f28748f;
    }

    @NotNull
    public final AdData g() {
        return this.f28759q;
    }

    @NotNull
    public final IronSource.a h() {
        return this.f28750h;
    }

    public int hashCode() {
        return (((((((((this.f28743a.hashCode() * 31) + this.f28744b.hashCode()) * 31) + this.f28745c.hashCode()) * 31) + this.f28746d.hashCode()) * 31) + this.f28747e.hashCode()) * 31) + Integer.hashCode(this.f28748f);
    }

    @NotNull
    public final AbstractC4309w0 i() {
        return this.f28743a;
    }

    @NotNull
    public final C3957c1 j() {
        return this.f28746d;
    }

    @NotNull
    public final C4101k2 k() {
        return this.f28745c;
    }

    @NotNull
    public final String l() {
        return this.f28754l;
    }

    @NotNull
    public final String m() {
        return this.f28752j;
    }

    @NotNull
    public final C4157n2 n() {
        return this.f28747e;
    }

    public final int o() {
        return this.f28753k;
    }

    @Nullable
    public final C4157n2 p() {
        return this.f28755m;
    }

    @Nullable
    public final JSONObject q() {
        return this.f28751i;
    }

    @NotNull
    public final String r() {
        return this.f28756n;
    }

    public final int s() {
        return this.f28758p;
    }

    @NotNull
    public final I t() {
        return this.f28749g;
    }

    @NotNull
    public String toString() {
        return "AdInstanceData(adUnitData=" + this.f28743a + ", providerSettings=" + this.f28744b + ", auctionData=" + this.f28745c + ", adapterConfig=" + this.f28746d + ", auctionResponseItem=" + this.f28747e + ", sessionDepth=" + this.f28748f + ")";
    }

    @NotNull
    public final NetworkSettings u() {
        return this.f28744b;
    }

    public final int v() {
        return this.f28748f;
    }

    @NotNull
    public final String w() {
        return this.f28757o;
    }
}
