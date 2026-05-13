package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlay;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Lf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Gf f29807a;

    public static final class a implements InterfaceC4057hb {
        public a() {
        }

        @Override // com.ironsource.InterfaceC4057hb
        public void a(@Nullable AdInfo adInfo) {
            Lf.this.a(Mf.f29847a, LevelPlay.AdFormat.INTERSTITIAL, Pf.f30178a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4057hb
        public void a(@Nullable IronSourceError ironSourceError, @Nullable AdInfo adInfo) {
            Lf.this.a(Mf.f29851e, LevelPlay.AdFormat.INTERSTITIAL, Pf.f30178a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null, adInfo));
        }

        @Override // com.ironsource.InterfaceC4057hb
        public void b(@Nullable AdInfo adInfo) {
            Lf.this.a(Mf.f29853g, LevelPlay.AdFormat.INTERSTITIAL, Pf.f30178a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4057hb
        public void b(@Nullable IronSourceError ironSourceError) {
            Lf.this.a(Mf.f29848b, LevelPlay.AdFormat.INTERSTITIAL, Pf.f30178a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.InterfaceC4057hb
        public void c(@Nullable AdInfo adInfo) {
            Lf.this.a(Mf.f29849c, LevelPlay.AdFormat.INTERSTITIAL, Pf.f30178a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4057hb
        public void d(@Nullable AdInfo adInfo) {
            Lf.this.a(Mf.f29852f, LevelPlay.AdFormat.INTERSTITIAL, Pf.f30178a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4057hb
        public void e(@Nullable AdInfo adInfo) {
            Lf.this.a(Mf.f29850d, LevelPlay.AdFormat.INTERSTITIAL, Pf.f30178a.a(adInfo));
        }
    }

    public static final class b implements InterfaceC4286ub, InterfaceC4269tb {
        public b() {
        }

        @Override // com.ironsource.InterfaceC4269tb
        public void a() {
            Lf.this.a(Mf.f29860n, LevelPlay.AdFormat.REWARDED, Pf.f30178a.a(new Object[0]));
        }

        @Override // com.ironsource.InterfaceC4252sb
        public void a(@Nullable C4041gd c4041gd, @Nullable AdInfo adInfo) {
            Lf.this.a(Mf.f29852f, LevelPlay.AdFormat.REWARDED, Pf.f30178a.a(Kf.f29735a.a(c4041gd), adInfo));
        }

        @Override // com.ironsource.InterfaceC4286ub
        public void a(@Nullable AdInfo adInfo) {
            Lf.this.a(Mf.f29847a, LevelPlay.AdFormat.REWARDED, Pf.f30178a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4252sb
        public void a(@Nullable IronSourceError ironSourceError, @Nullable AdInfo adInfo) {
            Lf.this.a(Mf.f29851e, LevelPlay.AdFormat.REWARDED, Pf.f30178a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null, adInfo));
        }

        @Override // com.ironsource.InterfaceC4252sb
        public void b(@Nullable C4041gd c4041gd, @Nullable AdInfo adInfo) {
            Lf.this.a(Mf.f29855i, LevelPlay.AdFormat.REWARDED, Pf.f30178a.a(Kf.f29735a.a(c4041gd), adInfo));
        }

        @Override // com.ironsource.InterfaceC4252sb
        public void b(@Nullable AdInfo adInfo) {
            Lf.this.a(Mf.f29853g, LevelPlay.AdFormat.REWARDED, Pf.f30178a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4286ub
        public void b(@Nullable IronSourceError ironSourceError) {
            Lf.this.a(Mf.f29848b, LevelPlay.AdFormat.REWARDED, Pf.f30178a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.InterfaceC4252sb
        public void c(@Nullable AdInfo adInfo) {
            Lf.this.a(Mf.f29849c, LevelPlay.AdFormat.REWARDED, Pf.f30178a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC4269tb
        public void d(@Nullable AdInfo adInfo) {
            Lf.this.a(Mf.f29854h, LevelPlay.AdFormat.REWARDED, Pf.f30178a.a(adInfo));
        }
    }

    public static final class c implements Ga {
        public c() {
        }

        @Override // com.ironsource.Ga
        public void b(@Nullable IronSourceError ironSourceError) {
            Lf.this.a(Mf.f29848b, LevelPlay.AdFormat.BANNER, Pf.f30178a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.Ga
        public void d(@Nullable AdInfo adInfo) {
            Lf.this.a(Mf.f29852f, LevelPlay.AdFormat.BANNER, Pf.f30178a.a(adInfo));
        }

        @Override // com.ironsource.Ga
        public void e(@Nullable AdInfo adInfo) {
            Lf.this.a(Mf.f29856j, LevelPlay.AdFormat.BANNER, Pf.f30178a.a(adInfo));
        }

        @Override // com.ironsource.Ga
        public void f(@Nullable AdInfo adInfo) {
            Lf.this.a(Mf.f29859m, LevelPlay.AdFormat.BANNER, Pf.f30178a.a(adInfo));
        }

        @Override // com.ironsource.Ga
        public void g(@Nullable AdInfo adInfo) {
            Lf.this.a(Mf.f29857k, LevelPlay.AdFormat.BANNER, Pf.f30178a.a(adInfo));
        }

        @Override // com.ironsource.Ga
        public void h(@Nullable AdInfo adInfo) {
            Lf.this.a(Mf.f29858l, LevelPlay.AdFormat.BANNER, Pf.f30178a.a(adInfo));
        }
    }

    public Lf(@NotNull Gf gf2) {
        tn.p.k(gf2, "javaScriptEvaluator");
        this.f29807a = gf2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, LevelPlay.AdFormat adFormat, List<? extends Object> list) {
        this.f29807a.a(str, adFormat, list);
    }

    private final void b() {
        Kf kf2 = Kf.f29735a;
        kf2.a((InterfaceC4057hb) null);
        kf2.a((InterfaceC4252sb) null);
        kf2.a((Ga) null);
    }

    private final void c() {
        Kf.f29735a.e();
    }

    public final void a() {
        b();
        c();
    }

    public final void d() {
        Kf kf2 = Kf.f29735a;
        kf2.a(new a());
        kf2.a(new b());
        kf2.a(new c());
    }
}
