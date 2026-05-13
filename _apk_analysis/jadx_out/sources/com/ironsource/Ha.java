package com.ironsource;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Ha implements Da {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4173o0 f29526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final W2 f29527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f29528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f29529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final J2 f29530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private Ea f29531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final N2 f29532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4307vf f29533h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4262t4 f29534i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private M0 f29535j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private InterfaceC4343y0 f29536k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private O2 f29537l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private Ra f29538m;

    public static final class a implements O2 {
        public a() {
        }

        public void a() {
            Ha.this.n().onAdLeftApplication();
        }

        public void b() {
            Ha.this.n().k();
        }

        public void c() {
            Ha.this.n().i();
        }

        @Override // com.ironsource.K0
        public void e() {
            Ha.this.n().onAdClicked();
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
            Ha.this.m().a(ironSourceError);
        }

        @Override // com.ironsource.M0
        public void a(@NotNull C4258t0 c4258t0) {
            tn.p.k(c4258t0, "adUnitCallback");
            Ha.this.m().a(c4258t0);
        }
    }

    public static final class c implements InterfaceC4343y0 {
        public c() {
        }

        @Override // com.ironsource.InterfaceC4343y0
        public void a(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
            tn.p.k(levelPlayAdInfo, "adInfo");
            Ha.this.n().onAdDisplayed(levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC4343y0
        public void c(@Nullable IronSourceError ironSourceError) {
            Ha.this.n().d(ironSourceError);
        }
    }

    public static final class d extends Lambda implements sn.a<bn.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ L2 f29543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AbstractC4067i3 f29544c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(L2 l22, AbstractC4067i3 abstractC4067i3) {
            super(0);
            this.f29543b = l22;
            this.f29544c = abstractC4067i3;
        }

        public final void a() {
            Ha.this.a(this.f29543b, this.f29544c);
        }

        @Override // sn.a
        public /* bridge */ /* synthetic */ bn.r invoke() {
            a();
            return bn.r.f5635a;
        }
    }

    public static final class e extends Lambda implements sn.a<bn.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ L2 f29546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Long f29547c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(L2 l22, Long l10) {
            super(0);
            this.f29546b = l22;
            this.f29547c = l10;
        }

        public final void a() {
            Ha ha2 = Ha.this;
            ha2.a((Ra) new La(ha2, this.f29546b, this.f29547c));
        }

        @Override // sn.a
        public /* bridge */ /* synthetic */ bn.r invoke() {
            a();
            return bn.r.f5635a;
        }
    }

    public static final class f implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ L2 f29549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AbstractC4067i3 f29550c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Long f29551d;

        public static final class a extends Lambda implements sn.a<bn.r> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Ha f29552a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ L2 f29553b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ AbstractC4067i3 f29554c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Ha ha2, L2 l22, AbstractC4067i3 abstractC4067i3) {
                super(0);
                this.f29552a = ha2;
                this.f29553b = l22;
                this.f29554c = abstractC4067i3;
            }

            public final void a() {
                this.f29552a.a(this.f29553b, this.f29554c);
            }

            @Override // sn.a
            public /* bridge */ /* synthetic */ bn.r invoke() {
                a();
                return bn.r.f5635a;
            }
        }

        public static final class b extends Lambda implements sn.a<bn.r> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Ha f29555a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ L2 f29556b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Long f29557c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Ha ha2, L2 l22, Long l10) {
                super(0);
                this.f29555a = ha2;
                this.f29556b = l22;
                this.f29557c = l10;
            }

            public final void a() {
                Ha ha2 = this.f29555a;
                ha2.a((Ra) new La(ha2, this.f29556b, this.f29557c));
            }

            @Override // sn.a
            public /* bridge */ /* synthetic */ bn.r invoke() {
                a();
                return bn.r.f5635a;
            }
        }

        public f(L2 l22, AbstractC4067i3 abstractC4067i3, Long l10) {
            this.f29549b = l22;
            this.f29550c = abstractC4067i3;
            this.f29551d = l10;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Ha.this.k().getViewTreeObserver().isAlive()) {
                Ha.this.k().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            if (rg.a(Ha.this.k(), new Rect())) {
                C4320wb.a((C4320wb) Ha.this.a(), AbstractRunnableC4078ie.f31961a.a(new a(Ha.this, this.f29549b, this.f29550c)), 0L, 2, (Object) null);
            } else {
                C4320wb.a((C4320wb) Ha.this.a(), AbstractRunnableC4078ie.f31961a.a(new b(Ha.this, this.f29549b, this.f29551d)), 0L, 2, (Object) null);
            }
        }
    }

    public Ha(@NotNull C4173o0 c4173o0, @NotNull W2 w22, long j10, long j11, @NotNull J2 j22, @NotNull Ea ea2, @NotNull N2 n22, @NotNull InterfaceC4307vf interfaceC4307vf, @NotNull InterfaceC4262t4 interfaceC4262t4) {
        tn.p.k(c4173o0, "adTools");
        tn.p.k(w22, "bannerContainer");
        tn.p.k(j22, "bannerAdProperties");
        tn.p.k(ea2, "strategyListener");
        tn.p.k(n22, "bannerAdUnitFactory");
        tn.p.k(interfaceC4307vf, "taskScheduler");
        tn.p.k(interfaceC4262t4, "timeProvider");
        this.f29526a = c4173o0;
        this.f29527b = w22;
        this.f29528c = j10;
        this.f29529d = j11;
        this.f29530e = j22;
        this.f29531f = ea2;
        this.f29532g = n22;
        this.f29533h = interfaceC4307vf;
        this.f29534i = interfaceC4262t4;
        this.f29535j = new b();
        this.f29536k = new c();
        this.f29537l = new a();
        this.f29538m = new Ja(this, false, 2, null);
    }

    public /* synthetic */ Ha(C4173o0 c4173o0, W2 w22, long j10, long j11, J2 j22, Ea ea2, N2 n22, InterfaceC4307vf interfaceC4307vf, InterfaceC4262t4 interfaceC4262t4, int i10, tn.i iVar) {
        this(c4173o0, w22, j10, j11, j22, ea2, n22, (i10 & 128) != 0 ? new W6(X6.a(c4173o0.a())) : interfaceC4307vf, interfaceC4262t4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ha ha2, L2 l22, AbstractC4067i3 abstractC4067i3, Long l10) {
        tn.p.k(ha2, "this$0");
        tn.p.k(l22, "$currentAdUnit");
        tn.p.k(abstractC4067i3, "$reloadReason");
        if (rg.a(ha2.f29527b, new Rect())) {
            C4320wb.a((C4320wb) ha2.f29526a, AbstractRunnableC4078ie.f31961a.a(ha2.new d(l22, abstractC4067i3)), 0L, 2, (Object) null);
        } else if (!ha2.f29527b.getViewTreeObserver().isAlive()) {
            C4320wb.a((C4320wb) ha2.f29526a, AbstractRunnableC4078ie.f31961a.a(ha2.new e(l22, l10)), 0L, 2, (Object) null);
        } else {
            ha2.f29527b.getViewTreeObserver().addOnGlobalLayoutListener(ha2.new f(l22, abstractC4067i3, l10));
        }
    }

    private final void a(AbstractC4067i3 abstractC4067i3) {
        this.f29526a.e().h().a(abstractC4067i3.c(), abstractC4067i3.b(), abstractC4067i3.a());
    }

    @NotNull
    public final C4173o0 a() {
        return this.f29526a;
    }

    @Override // com.ironsource.Da
    public void a(@NotNull Ea ea2) {
        tn.p.k(ea2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f29531f = ea2;
    }

    public final void a(@NotNull L2 l22, @NotNull AbstractC4067i3 abstractC4067i3) {
        tn.p.k(l22, "currentAdUnit");
        tn.p.k(abstractC4067i3, "reloadReason");
        L2 l2A = this.f29532g.a(false);
        Oa oa2 = new Oa(this, l22, l2A, this.f29534i.a());
        a(abstractC4067i3);
        this.f29538m = oa2;
        l2A.a(this.f29535j);
    }

    public final void a(@NotNull final L2 l22, @NotNull final AbstractC4067i3 abstractC4067i3, @Nullable final Long l10) {
        tn.p.k(l22, "currentAdUnit");
        tn.p.k(abstractC4067i3, "reloadReason");
        C4320wb.a(this.f29526a, new Runnable() { // from class: com.ironsource.hi
            @Override // java.lang.Runnable
            public final void run() {
                Ha.a(this.f31896b, l22, abstractC4067i3, l10);
            }
        }, 0L, 2, (Object) null);
    }

    public final void a(@NotNull M0 m02) {
        tn.p.k(m02, "<set-?>");
        this.f29535j = m02;
    }

    public final void a(@NotNull O2 o22) {
        tn.p.k(o22, "<set-?>");
        this.f29537l = o22;
    }

    public final void a(@NotNull Ra ra2) {
        tn.p.k(ra2, "<set-?>");
        this.f29538m = ra2;
    }

    public final void a(@Nullable IronSourceError ironSourceError, @NotNull L2 l22, @NotNull AbstractC4067i3 abstractC4067i3, boolean z10, boolean z11, @Nullable Long l10) {
        tn.p.k(l22, "currentAdUnit");
        tn.p.k(abstractC4067i3, "reloadReason");
        this.f29531f.b(ironSourceError);
        if (z11) {
            this.f29538m = new Na(this, l22);
        } else if (z10) {
            a(l22, abstractC4067i3, l10);
        } else {
            a(l22, abstractC4067i3);
        }
    }

    public final void a(@NotNull C4258t0 c4258t0, @NotNull L2 l22, @Nullable L2 l23, @NotNull AbstractC4067i3 abstractC4067i3, boolean z10, @Nullable Long l10) {
        bn.r rVar;
        tn.p.k(c4258t0, "adUnitCallback");
        tn.p.k(l22, "currentAdUnit");
        tn.p.k(abstractC4067i3, "reloadReason");
        l22.a(this.f29527b.getViewBinder(), this.f29536k);
        LevelPlayAdInfo levelPlayAdInfoC = c4258t0.c();
        if (levelPlayAdInfoC != null) {
            this.f29531f.onAdLoaded(levelPlayAdInfoC);
            rVar = bn.r.f5635a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            IronLog.INTERNAL.error(C4173o0.a(this.f29526a, "adInfo is null in handleLoadSuccess", (String) null, 2, (Object) null));
        }
        if (l23 != null) {
            l23.a(false);
        }
        if (z10) {
            this.f29538m = new Na(this, l22);
        } else {
            a(l22, abstractC4067i3, l10);
        }
    }

    public final void a(@NotNull InterfaceC4343y0 interfaceC4343y0) {
        tn.p.k(interfaceC4343y0, "<set-?>");
        this.f29536k = interfaceC4343y0;
    }

    public final void a(@NotNull String str) {
        tn.p.k(str, "message");
        this.f29526a.e().h().f("Banner Reload Strategy - " + str);
    }

    @Override // com.ironsource.Da
    public void b() {
        this.f29538m.b();
    }

    public final void b(@NotNull Ea ea2) {
        tn.p.k(ea2, "<set-?>");
        this.f29531f = ea2;
    }

    @Override // com.ironsource.Da
    public void c() {
        this.f29538m.c();
    }

    @Override // com.ironsource.Da
    public void d() {
        this.f29538m.d();
    }

    @NotNull
    public final O2 e() {
        return this.f29537l;
    }

    @Override // com.ironsource.Da
    public void f() {
        this.f29538m.f();
    }

    @NotNull
    public final M0 g() {
        return this.f29535j;
    }

    @NotNull
    public final InterfaceC4343y0 h() {
        return this.f29536k;
    }

    @NotNull
    public final J2 i() {
        return this.f29530e;
    }

    @NotNull
    public final N2 j() {
        return this.f29532g;
    }

    @NotNull
    public final W2 k() {
        return this.f29527b;
    }

    public final long l() {
        return this.f29528c;
    }

    @NotNull
    public final Ra m() {
        return this.f29538m;
    }

    @NotNull
    public final Ea n() {
        return this.f29531f;
    }

    @NotNull
    public final InterfaceC4307vf o() {
        return this.f29533h;
    }

    @NotNull
    public final InterfaceC4262t4 p() {
        return this.f29534i;
    }

    public final long q() {
        return this.f29529d;
    }

    public final void r() {
        this.f29526a.e().h().h("Banner view is not visible");
    }
}
