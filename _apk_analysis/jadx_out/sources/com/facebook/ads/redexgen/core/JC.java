package com.facebook.ads.redexgen.core;

import android.text.Layout;
import java.util.Comparator;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class JC {
    public static final Comparator<JC> A02 = new Comparator() { // from class: com.facebook.ads.redexgen.X.JB
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((JC) obj2).A00, ((JC) obj).A00);
        }
    };
    public final int A00;
    public final C3157o2 A01;

    public JC(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
        C3C c3cA06 = new C3C().A0G(charSequence).A0F(alignment).A07(f10, i10).A09(i11).A04(f11).A0A(i12).A06(f12);
        if (z10) {
            c3cA06.A0C(i13);
        }
        this.A01 = c3cA06.A0H();
        this.A00 = i14;
    }
}
