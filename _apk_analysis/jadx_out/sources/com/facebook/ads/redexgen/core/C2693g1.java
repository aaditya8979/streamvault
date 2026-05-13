package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2693g1 extends AbstractC2025Oh {
    public final AbstractC2025Oh A00 = new C2694g2(this);
    public final C15766g A01;

    public C2693g1(C15766g c15766g) {
        this.A01 = c15766g;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2025Oh
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(C15766g.class.getName());
        if (!(view instanceof C15766g) || A0B()) {
            return;
        }
        C15766g c15766g = (C15766g) view;
        if (c15766g.getLayoutManager() != null) {
            c15766g.getLayoutManager().A1v(accessibilityEvent);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2025Oh
    public final void A08(View view, PS ps2) {
        super.A08(view, ps2);
        ps2.A0O(C15766g.class.getName());
        if (A0B() || this.A01.getLayoutManager() == null) {
            return;
        }
        this.A01.getLayoutManager().A1H(ps2);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2025Oh
    public final boolean A09(View view, int i10, Bundle bundle) {
        if (super.A09(view, i10, bundle)) {
            return true;
        }
        if (A0B() || this.A01.getLayoutManager() == null) {
            return false;
        }
        return this.A01.getLayoutManager().A1X(i10, bundle);
    }

    public final AbstractC2025Oh A0A() {
        return this.A00;
    }

    public final boolean A0B() {
        return this.A01.A1r();
    }
}
