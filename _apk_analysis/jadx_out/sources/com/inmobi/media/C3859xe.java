package com.inmobi.media;

import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;

/* JADX INFO: renamed from: com.inmobi.media.xe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3859xe implements InterfaceC3338cj, InterfaceC3712rh, I, InterfaceC3421g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fc f28516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3844x f28517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PublisherCallbacks f28518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC3415fj f28519d;

    public C3859xe(Fc fc2, C3844x c3844x, PublisherCallbacks publisherCallbacks, AbstractC3415fj abstractC3415fj) {
        tn.p.k(fc2, "adUnit");
        tn.p.k(c3844x, "adComponent");
        tn.p.k(publisherCallbacks, "publisherCallbacks");
        tn.p.k(abstractC3415fj, "stateMachine");
        this.f28516a = fc2;
        this.f28517b = c3844x;
        this.f28518c = publisherCallbacks;
        this.f28519d = abstractC3415fj;
    }

    @Override // com.inmobi.media.InterfaceC3338cj
    public final void a() {
        C3605n9 c3605n9 = this.f28517b.f28472a.f27735c;
        if (c3605n9 != null) {
            c3605n9.a("AUM-NativeUnTrackedState", "Initialize Called");
        }
        this.f28516a.f25435b.d();
    }

    @Override // com.inmobi.media.InterfaceC3712rh
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        tn.p.k(inMobiNativeViewData, "inMobiNativeViewData");
        C3605n9 c3605n9 = this.f28517b.f28472a.f27735c;
        if (c3605n9 != null) {
            c3605n9.a("AUM-NativeUnTrackedState", "registerViewForTracking");
        }
        Fc fc2 = this.f28516a;
        fc2.getClass();
        tn.p.k(inMobiNativeViewData, "inMobiNativeViewData");
        fc2.f25435b.a(inMobiNativeViewData);
    }

    @Override // com.inmobi.media.InterfaceC3338cj
    public final void c() {
    }

    @Override // com.inmobi.media.I
    public final void g() {
        C3605n9 c3605n9 = this.f28517b.f28472a.f27735c;
        if (c3605n9 != null) {
            c3605n9.a("AUM-NativeUnTrackedState", "onAdDisplayed");
        }
        this.f28519d.a(new C3734se(this.f28516a, this.f28517b, this.f28518c, this.f28519d), this);
    }

    @Override // com.inmobi.media.InterfaceC3421g
    public final void j() {
        this.f28519d.a(new C3700r5(this.f28516a, null, this.f28517b), this);
    }
}
