package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.animation.AlphaAnimation;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.26, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass26 extends AbstractC2035Or<C2602eX> implements SM {
    public C2529dL A00;
    public boolean A01;

    public AnonymousClass26(C2602eX c2602eX, C2529dL c2529dL) {
        super(c2602eX);
        this.A00 = c2529dL;
        this.A01 = false;
    }

    private void A00(int i10) {
        if (!this.A01) {
            this.A00.A0F().A3n(i10);
        }
        this.A01 = true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2216Vt
    public final void A07() {
        C2602eX c2602eXA08 = A08();
        if (c2602eXA08 == null) {
            A00(0);
            return;
        }
        View view = c2602eXA08.A0C;
        AbstractC2601eW abstractC2601eW = (AbstractC2601eW) c2602eXA08.A0E.get();
        boolean z10 = view == null;
        if (z10 || abstractC2601eW == null) {
            if (c2602eXA08.A07) {
                A00(z10 ? 1 : 2);
                return;
            }
            return;
        }
        C2603eY c2603eYA0E = C2602eX.A0E(view, c2602eXA08.A0A, this.A00);
        if (c2603eYA0E.A04()) {
            C2602eX.A05(c2602eXA08);
        } else {
            c2602eXA08.A00 = 0;
        }
        boolean z11 = c2602eXA08.A00 > c2602eXA08.A09;
        boolean z12 = c2602eXA08.A05 != null && c2602eXA08.A05.A04();
        if (z11 || !c2603eYA0E.A04()) {
            c2602eXA08.A05 = c2603eYA0E;
        }
        String strValueOf = String.valueOf(c2603eYA0E.A01());
        synchronized (c2602eXA08) {
            c2602eXA08.A06.put(strValueOf, Integer.valueOf((c2602eXA08.A06.containsKey(strValueOf) ? ((Integer) c2602eXA08.A06.get(strValueOf)).intValue() : 0) + 1));
        }
        if (z11 && !z12) {
            this.A01 = true;
            c2602eXA08.A03 = System.currentTimeMillis();
            if (c2602eXA08.A07) {
                this.A00.A0F().A3o();
            }
            abstractC2601eW.A03();
            if (BuildConfigApi.isDebug() && AdInternalSettings.isVisibleAnimation()) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(500L);
                view.startAnimation(alphaAnimation);
            }
            if (!c2602eXA08.A0F) {
                return;
            }
        } else if (z11 || !z12) {
            abstractC2601eW.A02();
            if (!this.A01 && c2602eXA08.A07) {
                this.A00.A0F().A3m(c2603eYA0E.A02());
            }
            this.A01 = true;
        } else {
            this.A01 = true;
            if (c2602eXA08.A07) {
                this.A00.A0F().A3K(c2603eYA0E.A02());
            }
            abstractC2601eW.A00();
        }
        if (c2602eXA08.A08 || c2602eXA08.A04 == null) {
            return;
        }
        c2602eXA08.A0B.postDelayed(c2602eXA08.A04, c2602eXA08.A02);
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final C2529dL A6e() {
        return this.A00;
    }
}
