package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;

/* JADX INFO: renamed from: com.inmobi.media.pd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3659pd extends AbstractC3869y implements InterfaceC3712rh, InterfaceC3338cj, I, InterfaceC3421g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Fc f27863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3844x f27864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC3721s1 f27865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ac f27866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3307be f27867f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3844x f27868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Fc f27869h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Hc f27870i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Ac f27871j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3659pd(C3307be c3307be, C3844x c3844x, Fc fc2, AbstractC3721s1 abstractC3721s1, Hc hc2, Ac ac2) {
        super(c3844x);
        tn.p.k(c3307be, "nativePubData");
        tn.p.k(c3844x, "adComponent");
        tn.p.k(fc2, "adUnit");
        tn.p.k(abstractC3721s1, "adUnitTimeout");
        tn.p.k(hc2, "nativeCallback");
        tn.p.k(ac2, "stateMachine");
        tn.p.k(fc2, "adUnit");
        tn.p.k(c3844x, "adComponent");
        tn.p.k(abstractC3721s1, "adUnitTimeout");
        tn.p.k(ac2, "stateMachine");
        this.f27863b = fc2;
        this.f27864c = c3844x;
        this.f27865d = abstractC3721s1;
        this.f27866e = ac2;
        this.f27867f = c3307be;
        this.f27868g = c3844x;
        this.f27869h = fc2;
        this.f27870i = hc2;
        this.f27871j = ac2;
    }

    @Override // com.inmobi.media.InterfaceC3338cj
    public final void a() {
        InterfaceC3580m9 interfaceC3580m9L = l();
        if (interfaceC3580m9L != null) {
            ((C3605n9) interfaceC3580m9L).a("AUM-NativeLoadedState", "Initialize Called - ad ready for display");
        }
        InterfaceC3580m9 interfaceC3580m9L2 = l();
        if (interfaceC3580m9L2 != null) {
            ((C3605n9) interfaceC3580m9L2).a("AUM-LoadedState", "Initialize Called");
        }
        this.f27865d.e();
        C3319c0 c3319c0 = this.f28550a.f28472a.f27736d;
        c3319c0.getClass();
        c3319c0.f26904g = SystemClock.elapsedRealtime();
        P4.a(k(), new C3634od(this, null));
    }

    @Override // com.inmobi.media.InterfaceC3712rh
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        tn.p.k(inMobiNativeViewData, "inMobiNativeViewData");
        InterfaceC3580m9 interfaceC3580m9L = l();
        if (interfaceC3580m9L != null) {
            ((C3605n9) interfaceC3580m9L).a("AUM-NativeLoadedState", "registerViewForTracking - delegating to ad unit");
        }
        Fc fc2 = this.f27869h;
        fc2.getClass();
        tn.p.k(inMobiNativeViewData, "inMobiNativeViewData");
        fc2.f25435b.a(inMobiNativeViewData);
    }

    @Override // com.inmobi.media.InterfaceC3338cj
    public final void c() {
    }

    @Override // com.inmobi.media.I
    public final void g() {
        InterfaceC3580m9 interfaceC3580m9L = l();
        if (interfaceC3580m9L != null) {
            ((C3605n9) interfaceC3580m9L).a("AUM-LoadedState", "onAdDisplayed");
        }
        InterfaceC3580m9 interfaceC3580m9L2 = l();
        if (interfaceC3580m9L2 != null) {
            ((C3605n9) interfaceC3580m9L2).a("AUM-NativeLoadedState", "transitionToRenderedState - ad is being displayed");
        }
        this.f27871j.a(new C3734se(this.f27869h, this.f27868g, this.f27870i, this.f27871j), this);
    }

    @Override // com.inmobi.media.InterfaceC3421g
    public final void j() {
        InterfaceC3580m9 interfaceC3580m9L = l();
        if (interfaceC3580m9L != null) {
            ((C3605n9) interfaceC3580m9L).a("AUM-LoadedState", "onDestroy");
        }
        this.f27866e.a(new C3700r5(this.f27863b, this.f27865d, this.f27864c), this);
    }
}
