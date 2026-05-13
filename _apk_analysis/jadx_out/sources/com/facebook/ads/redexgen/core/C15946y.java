package com.facebook.ads.redexgen.core;

import com.facebook.ads.CacheFlag;
import java.util.EnumSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C15946y extends AbstractC2775hQ {
    public C15946y(C2529dL c2529dL, NT nt) {
        super(c2529dL, nt);
    }

    private C2773hO A00(Runnable runnable) {
        return new C2773hO(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2775hQ
    public final AbstractC1982Mo A0I() {
        C2830iS c2830iS = (C2830iS) this.A01;
        if (c2830iS != null) {
            return c2830iS.A09();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2775hQ
    public final void A0P() {
        ((C2830iS) this.A01).A0B();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2775hQ
    public final void A0R(MP mp2, TE te2, TC tc2, NU nu) {
        C2830iS c2830iS = (C2830iS) mp2;
        C2774hP c2774hP = new C2774hP(this, nu, c2830iS);
        A0H().postDelayed(c2774hP, te2.A05().A05());
        EnumSet<CacheFlag> enumSet = this.A08.A0B;
        if (enumSet == null) {
            enumSet = CacheFlag.ALL;
        }
        c2830iS.A0A(this.A0B, A00(c2774hP), nu, enumSet, this.A08.A04, this.A08.A05, this.A08.A02);
    }
}
