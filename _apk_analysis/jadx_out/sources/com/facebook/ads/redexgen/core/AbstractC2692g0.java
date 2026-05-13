package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2692g0 extends QK {
    public static String[] A01 = {"ofgeN", "GcYePxlnDkyLzFZQt8gXTfFAd", "bIohWxIGlUqKJ41hMBKnFxYrg", "ROugplE3NXuve66PKoPS6E1ZAyp", "eD20R2wAf", "s8oLKbIochRuLWrY7HR296xJjla", "faP6eJ6K6STeOEuOEXCJ6OuUaXzDbpLW", "oXM2gF3tn"};
    public boolean A00 = true;

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0N(AbstractC2076Qg abstractC2076Qg) {
        return !this.A00 || abstractC2076Qg.A0f();
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0O(AbstractC2076Qg abstractC2076Qg, QJ qj2, QJ qj3) {
        return (qj2 == null || (qj2.A01 == qj3.A01 && qj2.A03 == qj3.A03)) ? A0X(abstractC2076Qg) : A0Z(abstractC2076Qg, qj2.A01, qj2.A03, qj3.A01, qj3.A03);
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0P(AbstractC2076Qg abstractC2076Qg, QJ qj2, QJ qj3) {
        int i10 = qj2.A01;
        int i11 = qj2.A03;
        View view = abstractC2076Qg.A0H;
        int left = qj3 == null ? view.getLeft() : qj3.A01;
        String[] strArr = A01;
        if (strArr[7].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "jyZdeafgD";
        strArr2[4] = "NUmje91r8";
        int top2 = qj3 == null ? view.getTop() : qj3.A03;
        if (abstractC2076Qg.A0g() || (i10 == left && i11 == top2)) {
            return A0Y(abstractC2076Qg);
        }
        view.layout(left, top2, view.getWidth() + left, view.getHeight() + top2);
        return A0Z(abstractC2076Qg, i10, i11, left, top2);
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0Q(AbstractC2076Qg abstractC2076Qg, QJ qj2, QJ qj3) {
        if (qj2.A01 != qj3.A01 || qj2.A03 != qj3.A03) {
            return A0Z(abstractC2076Qg, qj2.A01, qj2.A03, qj3.A01, qj3.A03);
        }
        A0U(abstractC2076Qg);
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0R(AbstractC2076Qg abstractC2076Qg, AbstractC2076Qg abstractC2076Qg2, QJ qj2, QJ qj3) {
        int i10;
        int i11;
        int i12 = qj2.A01;
        int i13 = qj2.A03;
        if (abstractC2076Qg2.A0l()) {
            i10 = qj2.A01;
            i11 = qj2.A03;
        } else {
            i10 = qj3.A01;
            i11 = qj3.A03;
        }
        return A0a(abstractC2076Qg, abstractC2076Qg2, i12, i13, i10, i11);
    }

    public final void A0T(AbstractC2076Qg abstractC2076Qg) {
        A0K(abstractC2076Qg);
    }

    public final void A0U(AbstractC2076Qg abstractC2076Qg) {
        A0K(abstractC2076Qg);
    }

    public final void A0V(AbstractC2076Qg abstractC2076Qg) {
        A0K(abstractC2076Qg);
    }

    public final void A0W(AbstractC2076Qg abstractC2076Qg, boolean z10) {
        A0K(abstractC2076Qg);
    }

    public abstract boolean A0X(AbstractC2076Qg abstractC2076Qg);

    public abstract boolean A0Y(AbstractC2076Qg abstractC2076Qg);

    public abstract boolean A0Z(AbstractC2076Qg abstractC2076Qg, int i10, int i11, int i12, int i13);

    public abstract boolean A0a(AbstractC2076Qg abstractC2076Qg, AbstractC2076Qg abstractC2076Qg2, int i10, int i11, int i12, int i13);
}
