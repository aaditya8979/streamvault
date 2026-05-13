package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public abstract class R6 extends AbstractC3370e0 implements InterfaceC3338cj, InterfaceC3380ea, InterfaceC3421g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3622o1 f26229h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Ac f26230i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AbstractC3721s1 f26231j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Hc f26232k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p000do.l0 f26233l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C3608nc f26234m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Z f26235n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R6(C3622o1 c3622o1, AbstractC3721s1 abstractC3721s1, Ac ac2, Hc hc2) {
        super(c3622o1);
        tn.p.k(c3622o1, "adManagerComponent");
        tn.p.k(ac2, "stateMachine");
        tn.p.k(abstractC3721s1, "adUnitTimeout");
        tn.p.k(hc2, "publisherCallbacks");
        this.f26229h = c3622o1;
        this.f26230i = ac2;
        this.f26231j = abstractC3721s1;
        this.f26232k = hc2;
        this.f26233l = P4.a(this.f27066b);
        TimeoutConfigurations.MediationConfig mediationConfigX = this.f27067c.getTimeouts().X();
        String str = this.f27068d.f25737g;
        this.f27065a.getClass();
        C3608nc c3608ncA = AbstractC3583mc.a(mediationConfigX, str, "native", Ki.f25816b);
        this.f26234m = c3608ncA;
        this.f26235n = new Z(c3622o1, c3608ncA);
    }

    @Override // com.inmobi.media.InterfaceC3338cj
    public final void a() {
        C3605n9 c3605n9 = this.f27069e;
        if (c3605n9 != null) {
            c3605n9.a("AUM-FetchingState", "Initialize Called");
        }
        AbstractC3915zk.b();
        this.f26231j.b();
        p000do.i.d(this.f26233l, null, null, new Q6(this, null), 3, null);
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus, short s10) {
        a(kotlin.collections.a.o(bn.h.a(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10))), inMobiAdRequestStatus);
    }

    public final void a(Y y10) {
        V v10 = y10.f26608b;
        InMobiAdRequestStatus inMobiAdRequestStatus = y10.f26607a;
        Objects.toString(v10);
        Objects.toString(inMobiAdRequestStatus);
        V v11 = y10.f26608b;
        if (v11 instanceof Pi) {
            C3571m0 c3571m0 = this.f27071g;
            p000do.i.d(c3571m0.f27589a, null, null, new C3546l0(c3571m0, null), 3, null);
            a(y10.f26607a, ((Pi) y10.f26608b).f26138a);
            return;
        }
        if (v11 instanceof J6) {
            a(y10.f26607a, ((J6) v11).f25698a);
        } else if (v11 instanceof K6) {
            a(y10.f26607a, (short) ((K6) v11).f25800a);
        } else {
            if (!(v11 instanceof Ni)) {
                throw new NoWhenBranchMatchedException();
            }
            a(((Ni) v11).f26047a, y10.f26607a);
        }
    }

    public abstract void a(AdResponse adResponse);

    public final void a(Map map, InMobiAdRequestStatus inMobiAdRequestStatus) {
        C3605n9 c3605n9 = this.f27069e;
        if (c3605n9 != null) {
            c3605n9.b("AUM-FetchingState", "transitionToFetchFailedState " + map);
        }
        this.f26230i.a(new M6(map, inMobiAdRequestStatus, this.f26231j, this.f26229h, this.f26232k, this.f26230i), this);
    }

    @Override // com.inmobi.media.InterfaceC3338cj
    public final void c() {
        F3.a(this.f26233l);
    }

    @Override // com.inmobi.media.InterfaceC3380ea
    public final void e() {
        a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), (short) 2138);
    }

    @Override // com.inmobi.media.InterfaceC3421g
    public final void j() {
        this.f26230i.a(new C3700r5(this.f26229h), this);
    }
}
