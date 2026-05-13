package com.inmobi.media;

import android.view.ViewGroup;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.te, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3759te extends AbstractC3869y implements InterfaceC3338cj, Ck, InterfaceC3395f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3784ue f28184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Jc f28185c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3759te(C3784ue c3784ue, Jc jc2) {
        super(c3784ue.f28265g.f25379a);
        tn.p.k(c3784ue, IronSourceConstants.EVENTS_PROVIDER);
        tn.p.k(jc2, "stateMachine");
        this.f28184b = c3784ue;
        this.f28185c = jc2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0122, code lost:
    
        if (r9.a(r2, r8, r0) == r1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.inmobi.media.InterfaceC3395f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(hn.c r9) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3759te.a(hn.c):java.lang.Object");
    }

    @Override // com.inmobi.media.InterfaceC3338cj
    public final void a() {
        InterfaceC3580m9 interfaceC3580m9L = l();
        if (interfaceC3580m9L != null) {
            ((C3605n9) interfaceC3580m9L).a("NativeRenderedState", "Initialize Called");
        }
        InterfaceC3338cj interfaceC3338cj = this.f28184b.f28265g.f25381c.f25156c;
        I i10 = interfaceC3338cj instanceof I ? (I) interfaceC3338cj : null;
        if (i10 != null) {
            i10.g();
        }
        C3784ue c3784ue = this.f28184b;
        C3738si c3738si = c3784ue.f28260b;
        if (!c3738si.f28135a) {
            c3738si.f28135a = true;
            AbstractC3371e1 abstractC3371e1 = c3784ue.f28263e;
            if (abstractC3371e1.f27075c == null) {
                InterfaceC3580m9 interfaceC3580m9 = abstractC3371e1.f27074b;
                if (interfaceC3580m9 != null) {
                    ((C3605n9) interfaceC3580m9).a(AbstractC3371e1.f27072f, "Failed to startAdSession. adSession is null");
                }
            } else {
                InterfaceC3580m9 interfaceC3580m92 = abstractC3371e1.f27074b;
                if (interfaceC3580m92 != null) {
                    ((C3605n9) interfaceC3580m92).a(AbstractC3371e1.f27072f, "startAdSession");
                }
                P4.a(abstractC3371e1.f27073a, new C3294b1(abstractC3371e1, null));
            }
            C3784ue c3784ue2 = this.f28184b;
            AbstractC3371e1 abstractC3371e12 = c3784ue2.f28263e;
            ViewGroup parentView$media_release = c3784ue2.f28261c.f26319a.getParentView$media_release();
            abstractC3371e12.getClass();
            tn.p.k(parentView$media_release, "adView");
            if (abstractC3371e12.f27075c == null) {
                InterfaceC3580m9 interfaceC3580m93 = abstractC3371e12.f27074b;
                if (interfaceC3580m93 != null) {
                    ((C3605n9) interfaceC3580m93).a(AbstractC3371e1.f27072f, "Failed to registerAdView. adSession is null");
                }
            } else {
                InterfaceC3580m9 interfaceC3580m94 = abstractC3371e12.f27074b;
                if (interfaceC3580m94 != null) {
                    ((C3605n9) interfaceC3580m94).a(AbstractC3371e1.f27072f, "registerAdView");
                }
                P4.a(abstractC3371e12.f27073a, new Y0(abstractC3371e12, parentView$media_release, null));
            }
            G g10 = this.f28550a.f28473b;
            tn.p.k(g10, "<this>");
            MetaInfo metaInfo = g10.f25491d;
            if (tn.p.f(metaInfo != null ? metaInfo.getCreativeType() : null, "video")) {
                this.f28184b.f28263e.a(true);
            } else {
                this.f28184b.f28263e.a();
            }
        }
        InterfaceC3580m9 interfaceC3580m9L2 = l();
        if (interfaceC3580m9L2 != null) {
            ((C3605n9) interfaceC3580m9L2).a("NativeRenderedState", "listenMediaEvents - setting up media event listener");
        }
        p000do.i.d(this.f28184b.f28266h, null, null, new C3410fe(((C3558lc) this.f28184b.f28265g.f25385g.getValue()).f27564e, null, this), 3, null);
        P4.a(this.f28184b.f28266h, new C3333ce(this, null));
        C3784ue c3784ue3 = this.f28184b;
        if (c3784ue3.f28260b.f28136b) {
            InterfaceC3580m9 interfaceC3580m9L3 = l();
            if (interfaceC3580m9L3 != null) {
                ((C3605n9) interfaceC3580m9L3).a("NativeRenderedState", "Track Views Attached to Telemetry - Already triggered, skipping");
            }
        } else {
            p000do.i.d(c3784ue3.f28266h, null, null, new C3709re(this, null), 3, null);
        }
        if (this.f28184b.f28260b.f28137c) {
            InterfaceC3580m9 interfaceC3580m9L4 = l();
            if (interfaceC3580m9L4 != null) {
                ((C3605n9) interfaceC3580m9L4).a("NativeRenderedState", "Impression Tracking - Already triggered, skipping");
            }
        } else {
            G g11 = this.f28550a.f28473b;
            tn.p.k(g11, "<this>");
            if (g11.f25500m.f25407a == 0) {
                InterfaceC3580m9 interfaceC3580m9L5 = l();
                if (interfaceC3580m9L5 != null) {
                    ((C3605n9) interfaceC3580m9L5).a("NativeRenderedState", "Impression Event Occurred - Load (immediate fire)");
                }
                m();
            } else {
                p000do.i.d(this.f28184b.f28266h, null, null, new C3610ne(this, null), 3, null);
            }
        }
        if (!this.f28184b.f28260b.f28138d) {
            if (AbstractC3899z4.a(this.f28550a.f28473b, "mrc50").isEmpty()) {
                InterfaceC3580m9 interfaceC3580m9L6 = l();
                if (interfaceC3580m9L6 != null) {
                    ((C3605n9) interfaceC3580m9L6).a("NativeRenderedState", "MRC50 Trackers unavailable");
                }
            } else {
                Map mapA = AbstractC3491ik.a(((Dc) this.f28184b.f28265g.f25384f.getValue()).f25313a);
                Wj wj2 = Wj.f26549a;
                Wj.b("MRCViewable50Started", mapA, EnumC3287ak.f26805a);
                p000do.i.d(this.f28184b.f28266h, null, null, new C3660pe(this, null), 3, null);
            }
        }
        C3558lc c3558lc = (C3558lc) this.f28184b.f28265g.f25385g.getValue();
        go.l lVar = ((yo) this.f28184b.f28270l.getValue()).f28614b;
        c3558lc.getClass();
        tn.p.k(lVar, "windowFlow");
        C3605n9 c3605n9 = c3558lc.f27560a;
        if (c3605n9 != null) {
            c3605n9.a("MediaViewManager", "attachWindowLifecycleObserver called");
        }
        AbstractC3498j2 abstractC3498j2 = c3558lc.f27561b;
        if (abstractC3498j2 != null) {
            abstractC3498j2.a(lVar);
        }
    }

    @Override // com.inmobi.media.InterfaceC3338cj
    public final void c() {
        InterfaceC3580m9 interfaceC3580m9L = l();
        if (interfaceC3580m9L != null) {
            ((C3605n9) interfaceC3580m9L).a("NativeRenderedState", "Finalize Called");
        }
        P4.a(this.f28184b.k(), new C3359de(this, null));
        F3.a(this.f28184b.f28266h);
        ((Fd) this.f28184b.f28269k.getValue()).f25436a.a();
        ((C3409fd) this.f28184b.f28268j.getValue()).a();
        H6.a(((yo) this.f28184b.f28270l.getValue()).f28613a);
    }

    @Override // com.inmobi.media.Ck
    public final void d() {
        InterfaceC3580m9 interfaceC3580m9L = l();
        if (interfaceC3580m9L != null) {
            ((C3605n9) interfaceC3580m9L).a("NativeRenderedState", "unTrackViews");
        }
        C3558lc c3558lc = (C3558lc) this.f28184b.f28265g.f25385g.getValue();
        C3605n9 c3605n9 = c3558lc.f27560a;
        if (c3605n9 != null) {
            c3605n9.a("MediaViewManager", "detachObserversAndPause called");
        }
        AbstractC3498j2 abstractC3498j2 = c3558lc.f27561b;
        if (abstractC3498j2 != null) {
            abstractC3498j2.b();
        }
        C3784ue c3784ue = this.f28184b;
        Sg sg2 = c3784ue.f28261c;
        this.f28185c.a(new C3884ye(sg2.f26321c, sg2.f26320b, c3784ue.f28260b, c3784ue.f28263e, c3784ue.f28262d, c3784ue.f28264f, c3784ue.f28265g, this.f28185c), this);
    }

    public final void m() {
        InterfaceC3580m9 interfaceC3580m9L = l();
        if (interfaceC3580m9L != null) {
            ((C3605n9) interfaceC3580m9L).a("NativeRenderedState", "fireNativeImpression - Starting impression fire");
        }
        C3784ue c3784ue = this.f28184b;
        c3784ue.f28260b.f28137c = true;
        Map mapA = AbstractC3491ik.a(((Dc) c3784ue.f28265g.f25384f.getValue()).f25313a);
        Wj wj2 = Wj.f26549a;
        Wj.b("AdImpressionSuccessful", mapA, EnumC3287ak.f26805a);
        this.f28184b.f28265g.f25381c.g();
        this.f28184b.f28264f.f26034b.f25872f.a(Te.f26356a);
        AbstractC3371e1 abstractC3371e1 = this.f28184b.f28263e;
        if (abstractC3371e1.f27077e == null) {
            InterfaceC3580m9 interfaceC3580m9 = abstractC3371e1.f27074b;
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).a(AbstractC3371e1.f27072f, "Failed to registerImpression: AdEvent is null");
                return;
            }
            return;
        }
        InterfaceC3580m9 interfaceC3580m92 = abstractC3371e1.f27074b;
        if (interfaceC3580m92 != null) {
            ((C3605n9) interfaceC3580m92).a(AbstractC3371e1.f27072f, "registerImpression");
        }
        P4.a(abstractC3371e1.f27073a, new Z0(abstractC3371e1, null));
    }
}
