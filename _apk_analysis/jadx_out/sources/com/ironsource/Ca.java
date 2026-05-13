package com.ironsource;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.InterfaceC4262t4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class Ca extends AbstractC4134m implements O2, Ea {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4173o0 f28883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final J2 f28884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final WeakReference<InterfaceC4311w2> f28885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private LevelPlayAdInfo f28886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Da f28887f;

    public Ca(@NotNull InterfaceC4311w2 interfaceC4311w2, @NotNull C4173o0 c4173o0, @NotNull J2 j22, @NotNull W2 w22) {
        tn.p.k(interfaceC4311w2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        tn.p.k(c4173o0, "adTools");
        tn.p.k(j22, "bannerAdProperties");
        tn.p.k(w22, "bannerViewContainer");
        this.f28883b = c4173o0;
        this.f28884c = j22;
        this.f28885d = new WeakReference<>(interfaceC4311w2);
        this.f28886e = n();
        this.f28887f = Za.f30823a.a(c4173o0, w22, c4173o0.d(j22.c()), j22, this, m(), (64 & 64) != 0 ? new InterfaceC4262t4.a() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L2 a(Ca ca2, boolean z10) {
        tn.p.k(ca2, "this$0");
        return ca2.a(ca2.f28883b, ca2.f28884c, z10);
    }

    private final L2 a(C4173o0 c4173o0, J2 j22, boolean z10) {
        IronLog.INTERNAL.verbose();
        return new L2(c4173o0, M2.f29823z.a(j22, l().a(), z10), this);
    }

    private final N2 m() {
        return new N2() { // from class: com.ironsource.sh
            @Override // com.ironsource.N2
            public final L2 a(boolean z10) {
                return Ca.a(this.f34029a, z10);
            }
        };
    }

    private final LevelPlayAdInfo n() {
        String string = this.f28884c.b().toString();
        tn.p.j(string, "bannerAdProperties.adId.toString()");
        String strC = this.f28884c.c();
        String string2 = this.f28884c.a().toString();
        tn.p.j(string2, "bannerAdProperties.adFormat.toString()");
        return new LevelPlayAdInfo(string, strC, string2, null, null, null, null, 120, null);
    }

    public final void b() {
        this.f28887f.b();
    }

    @Override // com.ironsource.Ea
    public void b(@Nullable IronSourceError ironSourceError) {
        InterfaceC4311w2 interfaceC4311w2 = this.f28885d.get();
        if (interfaceC4311w2 != null) {
            String string = this.f28884c.b().toString();
            tn.p.j(string, "bannerAdProperties.adId.toString()");
            interfaceC4311w2.a(new LevelPlayAdError(ironSourceError, string, this.f28884c.c()));
        }
    }

    public final void c() {
        this.f28887f.c();
    }

    public final void d() {
        this.f28887f.d();
    }

    @Override // com.ironsource.Ea
    public void d(@Nullable IronSourceError ironSourceError) {
        InterfaceC4311w2 interfaceC4311w2 = this.f28885d.get();
        if (interfaceC4311w2 != null) {
            LevelPlayAdInfo levelPlayAdInfo = this.f28886e;
            String string = this.f28884c.b().toString();
            tn.p.j(string, "bannerAdProperties.adId.toString()");
            interfaceC4311w2.a(levelPlayAdInfo, new LevelPlayAdError(ironSourceError, string, this.f28884c.c()));
        }
    }

    @Override // com.ironsource.K0
    public void e() {
        onAdClicked();
    }

    public final void f() {
        this.f28887f.f();
    }

    @Override // com.ironsource.O2
    public /* bridge */ /* synthetic */ bn.r g() {
        o();
        return bn.r.f5635a;
    }

    @Override // com.ironsource.O2
    public /* bridge */ /* synthetic */ bn.r h() {
        q();
        return bn.r.f5635a;
    }

    @Override // com.ironsource.Ea
    public void i() {
        InterfaceC4311w2 interfaceC4311w2 = this.f28885d.get();
        if (interfaceC4311w2 != null) {
            interfaceC4311w2.a(this.f28886e);
        }
    }

    @Override // com.ironsource.O2
    public /* bridge */ /* synthetic */ bn.r j() {
        p();
        return bn.r.f5635a;
    }

    @Override // com.ironsource.Ea
    public void k() {
        InterfaceC4311w2 interfaceC4311w2 = this.f28885d.get();
        if (interfaceC4311w2 != null) {
            interfaceC4311w2.c(this.f28886e);
        }
    }

    public void o() {
        onAdLeftApplication();
    }

    @Override // com.ironsource.Ea
    public void onAdClicked() {
        InterfaceC4311w2 interfaceC4311w2 = this.f28885d.get();
        if (interfaceC4311w2 != null) {
            interfaceC4311w2.d(this.f28886e);
        }
    }

    @Override // com.ironsource.Ea
    public void onAdDisplayed(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f28886e = levelPlayAdInfo;
        InterfaceC4311w2 interfaceC4311w2 = this.f28885d.get();
        if (interfaceC4311w2 != null) {
            interfaceC4311w2.b(this.f28886e);
        }
    }

    @Override // com.ironsource.Ea
    public void onAdLeftApplication() {
        InterfaceC4311w2 interfaceC4311w2 = this.f28885d.get();
        if (interfaceC4311w2 != null) {
            interfaceC4311w2.e(this.f28886e);
        }
    }

    @Override // com.ironsource.Ea
    public void onAdLoaded(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
        this.f28886e = levelPlayAdInfo;
        InterfaceC4311w2 interfaceC4311w2 = this.f28885d.get();
        if (interfaceC4311w2 != null) {
            interfaceC4311w2.a(levelPlayAdInfo, false);
        }
    }

    public void p() {
        k();
    }

    public void q() {
        i();
    }
}
