package com.inmobi.media;

import android.os.SystemClock;
import androidx.browser.customtabs.CustomTabsClient;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.squareup.picasso.Picasso;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Y4 extends AbstractC3370e0 implements InterfaceC3338cj {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3622o1 f26612h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Hc f26613i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Ac f26614j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y4(C3622o1 c3622o1, Hc hc2, Ac ac2) {
        super(c3622o1);
        tn.p.k(c3622o1, "adManagerComponent");
        tn.p.k(hc2, "publisherCallbacks");
        tn.p.k(ac2, "stateMachine");
        this.f26612h = c3622o1;
        this.f26613i = hc2;
        this.f26614j = ac2;
    }

    @Override // com.inmobi.media.InterfaceC3338cj
    public final void a() {
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus) {
        C3605n9 c3605n9 = this.f27069e;
        if (c3605n9 != null) {
            c3605n9.b("AUM-CreatedState", "transitionToLoadDroppedState 2007");
        }
        this.f26614j.a(new C3356db((short) 2007, inMobiAdRequestStatus, this.f26612h, this.f26613i, this.f26614j), this);
    }

    public final void a(byte[] bArr) {
        C3605n9 c3605n9 = this.f27069e;
        if (c3605n9 != null) {
            c3605n9.a("AUM-CreatedState", "load called: " + (bArr != null ? new String(bArr, bo.c.f5639b) : null));
        }
        C3319c0 c3319c0 = this.f27070f;
        c3319c0.getClass();
        c3319c0.f26898a = SystemClock.elapsedRealtime();
        C3571m0 c3571m0 = this.f27071g;
        p000do.i.d(c3571m0.f27589a, null, null, new C3396f0(c3571m0, null), 3, null);
        if (b()) {
            C3605n9 c3605n92 = this.f27069e;
            if (c3605n92 != null) {
                c3605n92.b("AUM-CreatedState", "Missing Dependencies");
                return;
            }
            return;
        }
        C3622o1 c3622o1 = this.f26612h;
        Ac ac2 = this.f26614j;
        tn.p.k(c3622o1, "adManagerComponent");
        tn.p.k(ac2, "stateMachine");
        C3304bb c3304bb = new C3304bb(c3622o1, ac2);
        Tc tc2 = (Tc) this;
        tn.p.k(c3304bb, "adUnitTimeout");
        C3605n9 c3605n93 = tc2.f27069e;
        if (c3605n93 != null) {
            c3605n93.a("AUM-NativeCreatedState", "transitionToLoadResponseState");
        }
        tc2.f26354m.a(new C3609nd(bArr, tc2.f26352k, c3304bb, tc2.f26353l, tc2.f26354m), tc2);
    }

    public final boolean b() {
        try {
            tn.t.b(Picasso.class).getSimpleName();
            try {
                tn.t.b(CustomTabsClient.class).getSimpleName();
                return false;
            } catch (NoClassDefFoundError unused) {
                a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES));
                return true;
            }
        } catch (Exception unused2) {
            return false;
        }
    }

    @Override // com.inmobi.media.InterfaceC3338cj
    public final void c() {
    }
}
