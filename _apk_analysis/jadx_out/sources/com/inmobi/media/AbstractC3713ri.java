package com.inmobi.media;

import com.inmobi.ads.controllers.PublisherCallbacks;

/* JADX INFO: renamed from: com.inmobi.media.ri, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC3713ri extends AbstractC3869y implements InterfaceC3338cj, InterfaceC3421g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Fc f28064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3844x f28065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PublisherCallbacks f28066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC3415fj f28067e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3713ri(Fc fc2, C3844x c3844x, PublisherCallbacks publisherCallbacks, AbstractC3415fj abstractC3415fj) {
        super(c3844x);
        tn.p.k(fc2, "adUnit");
        tn.p.k(c3844x, "adComponent");
        tn.p.k(publisherCallbacks, "publisherCallbacks");
        tn.p.k(abstractC3415fj, "stateMachine");
        this.f28064b = fc2;
        this.f28065c = c3844x;
        this.f28066d = publisherCallbacks;
        this.f28067e = abstractC3415fj;
    }

    @Override // com.inmobi.media.InterfaceC3338cj
    public final void a() {
        InterfaceC3580m9 interfaceC3580m9L = l();
        if (interfaceC3580m9L != null) {
            ((C3605n9) interfaceC3580m9L).a("AUM-RenderedState", "Initialize Called");
        }
    }

    @Override // com.inmobi.media.InterfaceC3338cj
    public final void c() {
    }

    @Override // com.inmobi.media.InterfaceC3421g
    public final void j() {
        InterfaceC3580m9 interfaceC3580m9L = l();
        if (interfaceC3580m9L != null) {
            ((C3605n9) interfaceC3580m9L).a("AUM-RenderedState", "onDestroy");
        }
        this.f28067e.a(new C3700r5(this.f28064b, null, this.f28065c), this);
    }
}
