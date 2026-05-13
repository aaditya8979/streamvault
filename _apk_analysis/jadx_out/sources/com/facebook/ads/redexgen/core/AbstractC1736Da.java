package com.facebook.ads.redexgen.core;

import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Da, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1736Da extends RelativeLayout implements InterfaceC2546dc {
    public E1 A00;

    public AbstractC1736Da(C2529dL c2529dL) {
        super(c2529dL);
    }

    public AbstractC1736Da(C2529dL c2529dL, AttributeSet attributeSet, int i10) {
        super(c2529dL, attributeSet, i10);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2546dc
    public final void AAm(E1 e12) {
        this.A00 = e12;
        A07();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2546dc
    public final void AJk(E1 e12) {
        A08();
        this.A00 = null;
    }

    public E1 getVideoView() {
        return this.A00;
    }
}
