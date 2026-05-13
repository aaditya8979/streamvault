package com.ironsource;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class Ta implements Da {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4173o0 f30480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final W2 f30481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final N2 f30482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Ea f30483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private Ya f30484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private L2 f30485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final M0 f30486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4343y0 f30487h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final O2 f30488i;

    public static final class a implements O2 {
        public a() {
        }

        public void a() {
            Ea eaM = Ta.this.m();
            if (eaM != null) {
                eaM.onAdLeftApplication();
            }
        }

        public void b() {
            Ea eaM = Ta.this.m();
            if (eaM != null) {
                eaM.k();
            }
        }

        public void c() {
            Ea eaM = Ta.this.m();
            if (eaM != null) {
                eaM.i();
            }
        }

        @Override // com.ironsource.K0
        public void e() {
            Ea eaM = Ta.this.m();
            if (eaM != null) {
                eaM.onAdClicked();
            }
        }

        @Override // com.ironsource.O2
        public /* bridge */ /* synthetic */ bn.r g() {
            a();
            return bn.r.f5635a;
        }

        @Override // com.ironsource.O2
        public /* bridge */ /* synthetic */ bn.r h() {
            c();
            return bn.r.f5635a;
        }

        @Override // com.ironsource.O2
        public /* bridge */ /* synthetic */ bn.r j() {
            b();
            return bn.r.f5635a;
        }
    }

    public static final class b implements M0 {
        public b() {
        }

        @Override // com.ironsource.M0
        public void a(@Nullable IronSourceError ironSourceError) {
            Ta.this.l().a(ironSourceError);
        }

        @Override // com.ironsource.M0
        public void a(@NotNull C4258t0 c4258t0) {
            tn.p.k(c4258t0, "adUnitCallback");
            Ta.this.l().a(c4258t0);
        }
    }

    public static final class c implements InterfaceC4343y0 {
        public c() {
        }

        @Override // com.ironsource.InterfaceC4343y0
        public void a(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
            tn.p.k(levelPlayAdInfo, "adInfo");
            Ea eaM = Ta.this.m();
            if (eaM != null) {
                eaM.onAdDisplayed(levelPlayAdInfo);
            }
        }

        @Override // com.ironsource.InterfaceC4343y0
        public void c(@Nullable IronSourceError ironSourceError) {
            Ea eaM = Ta.this.m();
            if (eaM != null) {
                eaM.d(ironSourceError);
            }
        }
    }

    public Ta(@NotNull C4173o0 c4173o0, @NotNull W2 w22, @NotNull N2 n22) {
        tn.p.k(c4173o0, "adTools");
        tn.p.k(w22, "bannerContainer");
        tn.p.k(n22, "bannerAdUnitFactory");
        this.f30480a = c4173o0;
        this.f30481b = w22;
        this.f30482c = n22;
        this.f30484e = new Ua(this);
        this.f30486g = new b();
        this.f30487h = new c();
        this.f30488i = new a();
    }

    @NotNull
    public final C4173o0 a() {
        return this.f30480a;
    }

    @Override // com.ironsource.Da
    public void a(@NotNull Ea ea2) {
        tn.p.k(ea2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f30483d = ea2;
    }

    public final void a(@Nullable L2 l22) {
        this.f30485f = l22;
    }

    public final void a(@NotNull Ya ya2) {
        tn.p.k(ya2, "<set-?>");
        this.f30484e = ya2;
    }

    public final void a(@Nullable IronSourceError ironSourceError) {
        Ea ea2 = this.f30483d;
        if (ea2 != null) {
            ea2.b(ironSourceError);
        }
    }

    public final void a(@NotNull C4258t0 c4258t0, @NotNull L2 l22) {
        Ea ea2;
        tn.p.k(c4258t0, "adUnitCallback");
        tn.p.k(l22, "adUnit");
        l22.a(this.f30481b.getViewBinder(), this.f30487h);
        LevelPlayAdInfo levelPlayAdInfoC = c4258t0.c();
        if (levelPlayAdInfoC == null || (ea2 = this.f30483d) == null) {
            return;
        }
        ea2.onAdLoaded(levelPlayAdInfoC);
    }

    public final void a(@NotNull String str) {
        tn.p.k(str, "message");
        this.f30480a.e().h().f("Banner Single Ad Unit Strategy - " + str);
    }

    @Override // com.ironsource.Da
    public void b() {
        this.f30484e.b();
    }

    public final void b(@Nullable Ea ea2) {
        this.f30483d = ea2;
    }

    @Override // com.ironsource.Da
    public void c() {
        this.f30484e.c();
    }

    @Override // com.ironsource.Da
    public void d() {
    }

    @NotNull
    public final O2 e() {
        return this.f30488i;
    }

    @Override // com.ironsource.Da
    public void f() {
    }

    @NotNull
    public final M0 g() {
        return this.f30486g;
    }

    @NotNull
    public final InterfaceC4343y0 h() {
        return this.f30487h;
    }

    @NotNull
    public final N2 i() {
        return this.f30482c;
    }

    @NotNull
    public final W2 j() {
        return this.f30481b;
    }

    @Nullable
    public final L2 k() {
        return this.f30485f;
    }

    @NotNull
    public final Ya l() {
        return this.f30484e;
    }

    @Nullable
    public final Ea m() {
        return this.f30483d;
    }
}
