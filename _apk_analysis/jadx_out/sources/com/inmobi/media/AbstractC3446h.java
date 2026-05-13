package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.inmobi.media.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3446h extends AbstractC3415fj implements InterfaceC3572m1, InterfaceC3380ea, InterfaceC3421g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3446h(p000do.l0 l0Var) {
        super(l0Var);
        tn.p.k(l0Var, "coroutineScope");
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus, short s10) {
        tn.p.k(inMobiAdRequestStatus, "status");
        Objects.toString(inMobiAdRequestStatus);
        InterfaceC3338cj interfaceC3338cj = ((Ac) this).f25156c;
        AbstractC3507jb abstractC3507jb = interfaceC3338cj instanceof AbstractC3507jb ? (AbstractC3507jb) interfaceC3338cj : null;
        if (abstractC3507jb != null) {
            tn.p.k(inMobiAdRequestStatus, "status");
            InterfaceC3580m9 interfaceC3580m9L = abstractC3507jb.l();
            if (interfaceC3580m9L != null) {
                ((C3605n9) interfaceC3580m9L).b("AUM-LoadingState", "onLoadFailure");
            }
            abstractC3507jb.a(inMobiAdRequestStatus, s10);
        }
    }

    public final void a(Map map) {
        tn.p.k(map, "params");
        Objects.toString(map);
        InterfaceC3338cj interfaceC3338cj = ((Ac) this).f25156c;
        AbstractC3713ri abstractC3713ri = interfaceC3338cj instanceof AbstractC3713ri ? (AbstractC3713ri) interfaceC3338cj : null;
        if (abstractC3713ri != null) {
            tn.p.k(map, "params");
            InterfaceC3580m9 interfaceC3580m9L = abstractC3713ri.l();
            if (interfaceC3580m9L != null) {
                ((C3605n9) interfaceC3580m9L).a("AUM-RenderedState", com.ironsource.Mf.f29852f);
            }
            P4.a(abstractC3713ri.k(), new C3639oi(abstractC3713ri, map, null));
        }
    }

    public final void a(byte[] bArr) {
        Objects.toString(bArr != null ? Integer.valueOf(bArr.length) : "null");
        InterfaceC3338cj interfaceC3338cj = ((Ac) this).f25156c;
        Y4 y42 = interfaceC3338cj instanceof Y4 ? (Y4) interfaceC3338cj : null;
        if (y42 != null) {
            y42.a(bArr);
        }
    }

    public final void c() {
        InterfaceC3338cj interfaceC3338cj = ((Ac) this).f25156c;
        Y4 y42 = interfaceC3338cj instanceof Y4 ? (Y4) interfaceC3338cj : null;
        if (y42 == null) {
            Kb.a((byte) 1, "InMobi", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            return;
        }
        C3605n9 c3605n9 = y42.f27069e;
        if (c3605n9 != null) {
            c3605n9.a("AUM-CreatedState", "fetch called");
        }
        C3319c0 c3319c0 = y42.f27070f;
        c3319c0.getClass();
        c3319c0.f26898a = SystemClock.elapsedRealtime();
        C3571m0 c3571m0 = y42.f27071g;
        p000do.i.d(c3571m0.f27589a, null, null, new C3396f0(c3571m0, null), 3, null);
        if (y42.b()) {
            C3605n9 c3605n92 = y42.f27069e;
            if (c3605n92 != null) {
                c3605n92.b("AUM-CreatedState", "Missing Dependencies");
                return;
            }
            return;
        }
        C3622o1 c3622o1 = y42.f26612h;
        Ac ac2 = y42.f26614j;
        tn.p.k(c3622o1, "adManagerComponent");
        tn.p.k(ac2, "stateMachine");
        C3304bb c3304bb = new C3304bb(c3622o1, ac2);
        Tc tc2 = (Tc) y42;
        tn.p.k(c3304bb, "adUnitTimeout");
        C3605n9 c3605n93 = tc2.f27069e;
        if (c3605n93 != null) {
            c3605n93.a("AUM-NativeCreatedState", "transitionToFetchingState");
        }
        tc2.f26354m.a(new C3306bd(tc2.f26352k, c3304bb, tc2.f26354m, tc2.f26353l), tc2);
    }

    @Override // com.inmobi.media.InterfaceC3380ea
    public final void e() {
        InterfaceC3338cj interfaceC3338cj = ((Ac) this).f25156c;
        InterfaceC3380ea interfaceC3380ea = interfaceC3338cj instanceof InterfaceC3380ea ? (InterfaceC3380ea) interfaceC3338cj : null;
        if (interfaceC3380ea != null) {
            interfaceC3380ea.e();
        }
    }

    public final void g() {
        InterfaceC3338cj interfaceC3338cj = ((Ac) this).f25156c;
        AbstractC3713ri abstractC3713ri = interfaceC3338cj instanceof AbstractC3713ri ? (AbstractC3713ri) interfaceC3338cj : null;
        if (abstractC3713ri != null) {
            InterfaceC3580m9 interfaceC3580m9L = abstractC3713ri.l();
            if (interfaceC3580m9L != null) {
                ((C3605n9) interfaceC3580m9L).a("AUM-RenderedState", "onAdImpression");
            }
            P4.a(abstractC3713ri.k(), new C3664pi(abstractC3713ri, null));
        }
    }

    @Override // com.inmobi.media.InterfaceC3421g
    public final void j() {
        InterfaceC3338cj interfaceC3338cj = ((Ac) this).f25156c;
        InterfaceC3421g interfaceC3421g = interfaceC3338cj instanceof InterfaceC3421g ? (InterfaceC3421g) interfaceC3338cj : null;
        if (interfaceC3421g != null) {
            interfaceC3421g.j();
        }
    }
}
