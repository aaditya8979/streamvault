package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0K, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0K extends C14230h {
    public C15625s A00;
    public List<C2496cn> A01;

    public C0K(C2529dL c2529dL) {
        super(c2529dL);
        this.A00 = new C15625s(this, 1, null, null, null);
    }

    public final void A20(C2602eX c2602eX) {
        if (this.A00 != null) {
            this.A00.A0c(c2602eX);
        }
    }

    public C15625s getCarouselCardBehaviorHelper() {
        return this.A00;
    }

    public void setCardsInfo(ArrayList arrayList) {
        this.A01 = arrayList;
        this.A00.A0d(this.A01);
    }
}
