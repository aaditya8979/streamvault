package com.inmobi.media;

import android.content.ComponentName;
import android.content.Intent;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.hd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3460hd implements Ma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3509jd f27299a;

    public C3460hd(C3509jd c3509jd) {
        this.f27299a = c3509jd;
    }

    @Override // com.inmobi.media.Ma
    public final void a() {
        InterfaceC3580m9 interfaceC3580m9 = this.f27299a.f27398a.f27471g;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("PublisherViewClickHandler", "User left application");
        }
        AbstractC3446h abstractC3446h = (AbstractC3446h) this.f27299a.f27398a.f27470f;
        abstractC3446h.getClass();
        InterfaceC3338cj interfaceC3338cj = ((Ac) abstractC3446h).f25156c;
        AbstractC3713ri abstractC3713ri = interfaceC3338cj instanceof AbstractC3713ri ? (AbstractC3713ri) interfaceC3338cj : null;
        if (abstractC3713ri != null) {
            InterfaceC3580m9 interfaceC3580m9L = abstractC3713ri.l();
            if (interfaceC3580m9L != null) {
                ((C3605n9) interfaceC3580m9L).a("AUM-RenderedState", "onUserLeftApplication");
            }
            P4.a(abstractC3713ri.k(), new C3689qi(abstractC3713ri, null));
        }
    }

    @Override // com.inmobi.media.Ma
    public final void a(Intent intent) {
        tn.p.k(intent, "intent");
        InterfaceC3580m9 interfaceC3580m9 = this.f27299a.f27398a.f27471g;
        if (interfaceC3580m9 != null) {
            ComponentName component = intent.getComponent();
            ((C3605n9) interfaceC3580m9).a("PublisherViewClickHandler", "Starting activity: " + (component != null ? component.getClassName() : null));
        }
        this.f27299a.a(intent);
    }

    @Override // com.inmobi.media.Ma
    public final void a(String str, String str2, String str3) {
        tn.p.k(str2, "message");
        InterfaceC3580m9 interfaceC3580m9 = this.f27299a.f27398a.f27471g;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).b("PublisherViewClickHandler", "Landing page error: " + str2 + com.ironsource.Z7.f30794r + str3);
        }
    }

    @Override // com.inmobi.media.Ma
    public final void a(String str, Map map) {
        tn.p.k(str, "trackerName");
        tn.p.k(map, "macros");
    }

    @Override // com.inmobi.media.Ma
    public final void b(String str, String str2, String str3) {
    }
}
