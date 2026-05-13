package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ko, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1931Ko extends AbstractRunnableC2216Vt {
    public final WeakReference<C2602eX> A00;

    public C1931Ko(C2602eX c2602eX) {
        this.A00 = new WeakReference<>(c2602eX);
    }

    public C1931Ko(WeakReference<C2602eX> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2216Vt
    public final void A07() {
        C2602eX c2602eX = this.A00.get();
        if (c2602eX != null) {
            c2602eX.A0U();
        }
    }
}
