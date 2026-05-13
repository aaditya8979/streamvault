package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.d4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2513d4 {
    public KE A00;
    public final C1980Ml A01;
    public final C1990Mw A02;
    public final N0 A03;
    public final N9 A04;
    public final C2529dL A05;
    public final C2172Ua A06;
    public static final int A09 = (int) (AbstractC2232Wl.A02 * 4.0f);
    public static final int A07 = (int) (AbstractC2232Wl.A02 * 72.0f);
    public static final int A08 = (int) (AbstractC2232Wl.A02 * 8.0f);

    public C2513d4(C2529dL c2529dL, US us2, AbstractC2804hy abstractC2804hy) {
        this.A05 = c2529dL;
        this.A06 = new C2172Ua(abstractC2804hy.A25(), us2);
        this.A01 = abstractC2804hy.A1z();
        this.A02 = abstractC2804hy.A20().A0I();
        this.A04 = abstractC2804hy.A23();
        this.A03 = abstractC2804hy.A20().A0K();
    }

    private View A00(KE ke2) {
        C2349aQ c2349aQ = new C2349aQ(this.A05, this.A01.A01(), true, false, false);
        c2349aQ.A04(this.A02.A0F(), this.A02.A04(), null, false, true);
        c2349aQ.setAlignment(17);
        C2343aK c2343aK = new C2343aK(this.A05);
        XP.A0K(c2343aK, 0);
        c2343aK.setRadius(50);
        new KZ(c2343aK, this.A05).A04().A07(this.A04.A01());
        LinearLayout linearLayout = new LinearLayout(this.A05);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(c2343aK, new LinearLayout.LayoutParams(A07, A07));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A08, 0, A08);
        linearLayout.addView(c2349aQ, layoutParams);
        if (ke2 != null) {
            XP.A0H(ke2);
            linearLayout.addView(ke2, layoutParams);
            if (TextUtils.isEmpty(ke2.getText())) {
                XP.A0F(ke2);
            }
        }
        return linearLayout;
    }

    private C15766g A01() {
        C15766g c15766g = new C15766g(this.A05);
        c15766g.setLayoutManager(new C2709gI(this.A05, 0, false));
        c15766g.setAdapter(new C1763Eb(this.A05, this.A03.A02(), A09, this.A00));
        return c15766g;
    }

    private final EnumC2512d3 A02() {
        return !this.A03.A02().isEmpty() ? EnumC2512d3.A03 : EnumC2512d3.A02;
    }

    public final Pair<EnumC2512d3, View> A03(KE ke2) {
        View viewA01;
        this.A00 = ke2;
        EnumC2512d3 enumC2512d3A02 = A02();
        switch (C2511d2.A00[enumC2512d3A02.ordinal()]) {
            case 1:
                viewA01 = A01();
                break;
            default:
                viewA01 = A00(this.A00);
                break;
        }
        AbstractC2174Uc.A04(viewA01, this.A06, UZ.A0S);
        return new Pair<>(enumC2512d3A02, viewA01);
    }
}
