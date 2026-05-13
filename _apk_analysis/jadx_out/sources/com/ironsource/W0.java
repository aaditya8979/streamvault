package com.ironsource;

import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.E0;
import com.ironsource.P8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.sdk.controller.f;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public class W0 extends C4173o0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final C4173o0 f30613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final S0 f30614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private InterfaceC4048h2 f30615i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(@NotNull W0 w02, @NotNull E0.b bVar) {
        super(w02, bVar);
        tn.p.k(w02, "adUnitTools");
        tn.p.k(bVar, AppLovinEventTypes.USER_COMPLETED_LEVEL);
        this.f30613g = w02.f30613g;
        this.f30614h = w02.f30614h;
        this.f30615i = w02.f30615i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(@NotNull C4173o0 c4173o0, @NotNull AbstractC4309w0 abstractC4309w0, @NotNull E0.b bVar) {
        super(c4173o0, bVar);
        tn.p.k(c4173o0, "adTools");
        tn.p.k(abstractC4309w0, "adUnitData");
        tn.p.k(bVar, AppLovinEventTypes.USER_COMPLETED_LEVEL);
        this.f30613g = c4173o0;
        S0 s0A = C4324wf.a(abstractC4309w0, abstractC4309w0.e().c());
        tn.p.j(s0A, "getAdUnitPerformance(\n  …auctionSavedHistoryLimit)");
        this.f30614h = s0A;
    }

    @Nullable
    public final BaseAdAdapter<?, ?> a(@NotNull B b10) {
        tn.p.k(b10, "instanceData");
        return com.ironsource.mediationsdk.c.b().a(b10.u(), b10.h(), b10.i().b().b());
    }

    @Nullable
    public final BaseAdAdapter<?, ?> a(@NotNull NetworkSettings networkSettings, @NotNull IronSource.a aVar, @NotNull UUID uuid) {
        tn.p.k(networkSettings, "providerSettings");
        tn.p.k(aVar, "adFormat");
        tn.p.k(uuid, f.b.f33716c);
        return com.ironsource.mediationsdk.c.b().a(networkSettings, aVar, uuid);
    }

    @NotNull
    public final String a(long j10, @NotNull String str) {
        tn.p.k(str, "instanceName");
        String strA = IronSourceUtils.a(j10, str);
        tn.p.j(strA, "getTransId(timeStamp, instanceName)");
        return strA;
    }

    public final void a(@Nullable InterfaceC4048h2 interfaceC4048h2) {
        this.f30615i = interfaceC4048h2;
    }

    public final void c(@NotNull AbstractRunnableC4078ie abstractRunnableC4078ie) {
        tn.p.k(abstractRunnableC4078ie, "task");
        C4341xf.a(C4341xf.f34397a, abstractRunnableC4078ie, 0L, 2, null);
    }

    @NotNull
    public final String e(@NotNull String str) {
        tn.p.k(str, C4157n2.f33010s);
        String strC = com.ironsource.mediationsdk.d.b().c(str);
        tn.p.j(strC, "getInstance().getDynamic…romServerData(serverData)");
        return strC;
    }

    @NotNull
    public final S0 h() {
        return this.f30614h;
    }

    @Nullable
    public final InterfaceC4048h2 i() {
        return this.f30615i;
    }

    @Nullable
    public final String j() {
        return com.ironsource.mediationsdk.r.m().l();
    }

    @Nullable
    public final C4002ea k() {
        return C4324wf.a();
    }

    @NotNull
    public final P8.a l() {
        return Lb.f29764s.a().h();
    }
}
