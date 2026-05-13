package com.ironsource;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class Sb extends AbstractC4134m implements InterfaceC4040gc, M0, InterfaceC4343y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Vb f30412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final C4173o0 f30413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final C3968cc f30414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C4004ec f30415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private LevelPlayAdInfo f30416f;

    public Sb(@NotNull Vb vb2, @NotNull C4173o0 c4173o0, @NotNull C3968cc c3968cc) {
        tn.p.k(vb2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        tn.p.k(c4173o0, "adTools");
        tn.p.k(c3968cc, "nativeAdProperties");
        this.f30412b = vb2;
        this.f30413c = c4173o0;
        this.f30414d = c3968cc;
        this.f30416f = m();
    }

    private final C4004ec a(C4173o0 c4173o0, C3968cc c3968cc) {
        IronLog.INTERNAL.verbose();
        return new C4004ec(c4173o0, C4022fc.f31696y.a(c3968cc, l().a()), this);
    }

    private final LevelPlayAdInfo m() {
        String string = this.f30414d.b().toString();
        tn.p.j(string, "nativeAdProperties.adId.toString()");
        String strC = this.f30414d.c();
        String string2 = this.f30414d.a().toString();
        tn.p.j(string2, "nativeAdProperties.adFormat.toString()");
        return new LevelPlayAdInfo(string, strC, string2, null, null, null, null, 120, null);
    }

    public final void a(@NotNull Pb pb2) {
        tn.p.k(pb2, "nativeAdBinder");
        C4004ec c4004ec = this.f30415e;
        if (c4004ec == null) {
            tn.p.C("nativeAdUnit");
            c4004ec = null;
        }
        c4004ec.a(new Xb(pb2), this);
    }

    @Override // com.ironsource.M0
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f30412b.onNativeAdLoadFailed(ironSourceError);
    }

    @Override // com.ironsource.M0
    public void a(@NotNull C4258t0 c4258t0) {
        tn.p.k(c4258t0, "adUnitCallback");
        LevelPlayAdInfo levelPlayAdInfoC = c4258t0.c();
        if (levelPlayAdInfoC != null) {
            this.f30416f = levelPlayAdInfoC;
            this.f30412b.a(levelPlayAdInfoC);
        }
    }

    @Override // com.ironsource.InterfaceC4343y0
    public void a(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.ironsource.InterfaceC4343y0
    public void c(@Nullable IronSourceError ironSourceError) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.ironsource.K0
    public void e() {
        this.f30412b.b(this.f30416f);
    }

    public final void n() {
        this.f30416f = m();
        C4004ec c4004ec = this.f30415e;
        if (c4004ec == null) {
            tn.p.C("nativeAdUnit");
            c4004ec = null;
        }
        c4004ec.a(true);
    }

    public final void o() {
        C4004ec c4004ecA = a(this.f30413c, this.f30414d);
        this.f30415e = c4004ecA;
        if (c4004ecA == null) {
            tn.p.C("nativeAdUnit");
            c4004ecA = null;
        }
        c4004ecA.a((M0) this);
    }
}
