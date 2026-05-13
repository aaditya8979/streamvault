package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.ib, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC3483ib extends AbstractC3370e0 implements InterfaceC3338cj, InterfaceC3380ea, InterfaceC3421g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f27344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C3622o1 f27345i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AbstractC3721s1 f27346j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Hc f27347k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Ac f27348l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final X f27349m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p000do.l0 f27350n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3483ib(byte[] bArr, C3622o1 c3622o1, AbstractC3721s1 abstractC3721s1, Hc hc2, Ac ac2) {
        super(c3622o1);
        tn.p.k(c3622o1, "adManagerComponent");
        tn.p.k(abstractC3721s1, "adUnitTimeout");
        tn.p.k(hc2, "publisherCallbacks");
        tn.p.k(ac2, "stateMachine");
        this.f27344h = bArr;
        this.f27345i = c3622o1;
        this.f27346j = abstractC3721s1;
        this.f27347k = hc2;
        this.f27348l = ac2;
        this.f27349m = new X(this.f27070f, this.f27071g);
        this.f27350n = P4.a(this.f27066b);
    }

    @Override // com.inmobi.media.InterfaceC3338cj
    public final void a() {
        C3605n9 c3605n9 = this.f27069e;
        if (c3605n9 != null) {
            c3605n9.a("AUM-LoadResponseState", "Initialize Called");
        }
        byte[] bArr = this.f27344h;
        if (bArr != null && bArr.length != 0) {
            C3266a c3266a = new C3266a(bArr, this.f27068d.f25731a, this.f27069e);
            this.f27346j.d();
            p000do.i.d(this.f27350n, null, null, new C3458hb(c3266a, this, null), 3, null);
        } else {
            C3605n9 c3605n92 = this.f27069e;
            if (c3605n92 != null) {
                c3605n92.b("AUM-LoadResponseState", "Empty response on Load");
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus) {
        C3605n9 c3605n9 = this.f27069e;
        if (c3605n9 != null) {
            c3605n9.b("AUM-LoadResponseState", "transitionToLoadDroppedState 2143");
        }
        this.f27348l.a(new C3356db((short) 2143, inMobiAdRequestStatus, this.f27345i, this.f27347k, this.f27348l), this);
    }

    public abstract void a(AdResponse adResponse);

    public final void a(Map map, InMobiAdRequestStatus inMobiAdRequestStatus) {
        C3605n9 c3605n9 = this.f27069e;
        if (c3605n9 != null) {
            c3605n9.b("AUM-LoadResponseState", "transitionToLoadDroppedState " + map);
        }
        this.f27348l.a(new M6(map, inMobiAdRequestStatus, this.f27346j, this.f27345i, this.f27347k, this.f27348l), this);
    }

    @Override // com.inmobi.media.InterfaceC3338cj
    public final void c() {
        F3.a(this.f27350n);
    }

    @Override // com.inmobi.media.InterfaceC3380ea
    public final void e() {
        a(kotlin.collections.a.o(bn.h.a(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2138)), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT));
    }

    @Override // com.inmobi.media.InterfaceC3421g
    public final void j() {
        C3605n9 c3605n9 = this.f27069e;
        if (c3605n9 != null) {
            c3605n9.b("AUM-LoadResponseState", "onDestroy");
        }
        this.f27348l.a(new C3700r5(null, this.f27346j, this.f27345i), this);
    }
}
