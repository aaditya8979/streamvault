package com.inmobi.media;

import com.inmobi.ads.controllers.PublisherCallbacks;

/* JADX INFO: renamed from: com.inmobi.media.se, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3734se extends AbstractC3713ri implements Sl, Ck {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Fc f28117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3844x f28118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PublisherCallbacks f28119h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AbstractC3415fj f28120i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3734se(Fc fc2, C3844x c3844x, PublisherCallbacks publisherCallbacks, AbstractC3415fj abstractC3415fj) {
        super(fc2, c3844x, publisherCallbacks, abstractC3415fj);
        tn.p.k(fc2, "adUnit");
        tn.p.k(c3844x, "adComponent");
        tn.p.k(publisherCallbacks, "publisherCallbacks");
        tn.p.k(abstractC3415fj, "stateMachine");
        this.f28117f = fc2;
        this.f28118g = c3844x;
        this.f28119h = publisherCallbacks;
        this.f28120i = abstractC3415fj;
    }

    @Override // com.inmobi.media.Sl
    public final void a(boolean z10) {
        InterfaceC3580m9 interfaceC3580m9L = l();
        if (interfaceC3580m9L != null) {
            ((C3605n9) interfaceC3580m9L).a("AUM-NativeRenderedState", "onAudioStateChanged " + z10);
        }
        P4.a(k(), new C3436ge(this, z10, null));
    }

    @Override // com.inmobi.media.Sl
    public final void b() {
        InterfaceC3580m9 interfaceC3580m9L = l();
        if (interfaceC3580m9L != null) {
            ((C3605n9) interfaceC3580m9L).a("AUM-NativeRenderedState", "onVideoPaused");
        }
        P4.a(k(), new C3510je(this, null));
    }

    @Override // com.inmobi.media.Ck
    public final void d() {
        InterfaceC3580m9 interfaceC3580m9L = l();
        if (interfaceC3580m9L != null) {
            ((C3605n9) interfaceC3580m9L).a("AUM-NativeRenderedState", "unTrackViews - stopping view tracking");
        }
        this.f28120i.a(new C3859xe(this.f28117f, this.f28118g, this.f28119h, this.f28120i), this);
    }

    @Override // com.inmobi.media.Sl
    public final void f() {
        InterfaceC3580m9 interfaceC3580m9L = l();
        if (interfaceC3580m9L != null) {
            ((C3605n9) interfaceC3580m9L).a("AUM-NativeRenderedState", "onVideoStarted");
        }
        P4.a(k(), new C3560le(this, null));
    }

    @Override // com.inmobi.media.Sl
    public final void h() {
        InterfaceC3580m9 interfaceC3580m9L = l();
        if (interfaceC3580m9L != null) {
            ((C3605n9) interfaceC3580m9L).a("AUM-NativeRenderedState", "onVideoCompleted");
        }
        P4.a(k(), new C3486ie(this, null));
    }

    @Override // com.inmobi.media.Sl
    public final void i() {
        InterfaceC3580m9 interfaceC3580m9L = l();
        if (interfaceC3580m9L != null) {
            ((C3605n9) interfaceC3580m9L).a("AUM-NativeRenderedState", "onVideoResumed");
        }
        P4.a(k(), new C3535ke(this, null));
    }
}
