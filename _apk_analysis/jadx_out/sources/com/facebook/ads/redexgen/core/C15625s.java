package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C15625s extends FH {
    public static String[] A00 = {"f1NrkMLFHAOxAk1WYXb4ZQBI9BQGMxNf", "ieQbYkP9qXWhodiL", "FasCpRA2RHhykdlBGUblwYUAQMGKU0mS", "sjzKgK2sh59qhJK5Sm5NCXrbKyy", "73hXtYSYooo4yypUFlMlXcqu25ITYI9G", "jFG3gQjXUuH0GALbmhZbm14pHMTfeDNL", "AB4YZhA3BNaHUCHwFjy4bae76Yz8EFa9", "dMMrkYyDXzmdfTW8HhUzXkOm8W"};

    public C15625s(C14230h c14230h, int i10, List<C2496cn> list, C2602eX c2602eX, Bundle bundle) {
        super(c14230h, i10, list, c2602eX, bundle);
        c14230h.A1h(this);
        this.A03 = new LG(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00() {
        int iA25 = this.A0C.A25();
        if (this.A05 == null || iA25 == -1 || iA25 >= this.A05.size() - 1) {
            return;
        }
        int i10 = iA25 + 1;
        if (A00[2].charAt(8) != 'R') {
            throw new RuntimeException();
        }
        A00[2] = "QoZYEwWSRtnMYn7R6MgH1oBp1kGEXSrp";
        A0U(i10);
    }

    private void A01(int i10) {
        int iA26 = this.A0C.A26();
        int iA27 = this.A0C.A27();
        int iA25 = this.A0C.A25();
        if (iA25 != iA26) {
            A0S(iA26);
        }
        if (iA25 != iA27) {
            A0S(iA27);
        }
        A0T(iA25);
        A0V(iA26, iA27, i10);
    }

    @Override // com.facebook.ads.redexgen.core.FH, com.facebook.ads.redexgen.core.QT
    public final void A0L(C15766g c15766g, int i10) {
    }

    @Override // com.facebook.ads.redexgen.core.FH, com.facebook.ads.redexgen.core.QT
    public final void A0M(C15766g c15766g, int i10, int i11) {
        if (this.A0C.A25() != -1) {
            AbstractC1882Ir abstractC1882Ir = (AbstractC1882Ir) this.A0C.A1o(this.A0C.A25());
            if (abstractC1882Ir != null && abstractC1882Ir.A1T() && !abstractC1882Ir.A1S()) {
                abstractC1882Ir.A1Q();
            }
            A01(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.FH
    public final void A0X(View view, boolean z10) {
        view.setAlpha(z10 ? 1.0f : 0.8f);
    }

    @Override // com.facebook.ads.redexgen.core.FH
    public final void A0Z(AbstractC1882Ir abstractC1882Ir, boolean z10) {
        A0X(abstractC1882Ir, z10);
        if (z10 || !abstractC1882Ir.A1S()) {
            return;
        }
        abstractC1882Ir.A1P();
    }

    @Override // com.facebook.ads.redexgen.core.FH
    public final boolean A0a(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.75f;
    }

    public final C2602eX A0b() {
        return this.A04;
    }

    public final void A0c(C2602eX c2602eX) {
        this.A04 = c2602eX;
    }

    public final void A0d(List<C2496cn> list) {
        this.A05 = list;
    }
}
