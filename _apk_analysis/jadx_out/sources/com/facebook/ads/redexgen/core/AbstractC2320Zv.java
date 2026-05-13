package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2320Zv extends LinearLayout {
    public static byte[] A0A;
    public static final LinearLayout.LayoutParams A0B;
    public LinearLayout A00;
    public TextView A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final View.OnClickListener A05;
    public final RelativeLayout A06;
    public final C2529dL A07;
    public final KE A08;
    public final C2343aK A09;

    static {
        A0e();
        A0B = new LinearLayout.LayoutParams(-2, -2);
    }

    public AbstractC2320Zv(C2529dL c2529dL, KE ke2, int i10, C1992My c1992My, boolean z10, String str, US us2, InterfaceC2260Xn interfaceC2260Xn, C2602eX c2602eX, XH xh2, N3 n32, boolean z11, String str2) {
        super(c2529dL);
        this.A02 = A0d(0, 0, 37);
        XP.A0I(this);
        this.A07 = c2529dL;
        this.A04 = i10;
        this.A03 = z11;
        this.A02 = str2;
        this.A09 = new C2343aK(c2529dL);
        XP.A0K(this.A09, 0);
        XP.A0I(this.A09);
        if (z11) {
            this.A00 = new LinearLayout(c2529dL);
            this.A01 = new TextView(c2529dL);
            XP.A0I(this.A01);
        }
        if (ke2 != null) {
            this.A08 = ke2;
        } else {
            this.A08 = new KE(c2529dL, str, c1992My, z10, us2, interfaceC2260Xn, c2602eX, xh2, n32);
        }
        XP.A0E(1001, this.A08);
        this.A05 = AbstractC2354aV.A03(this.A08, A0d(0, 9, 52));
        this.A06 = new RelativeLayout(c2529dL);
        this.A06.setLayoutParams(A0B);
        XP.A0I(this.A06);
    }

    public static String A0d(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 11);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0e() {
        A0A = new byte[]{-96, -93, -93, -92, -77, -96, -88, -85, -78};
    }

    public void A0f() {
    }

    public void A0g() {
        this.A09.setOnClickListener(this.A05);
    }

    public abstract void A0h(int i10);

    public final KE getCTAButton() {
        return this.A08;
    }

    public View getExpandableLayout() {
        return null;
    }

    public final ImageView getIconView() {
        return this.A09;
    }

    public void setInfo(C1990Mw c1990Mw, C1993Mz c1993Mz, String str, String str2, InterfaceC2242Wv interfaceC2242Wv, InterfaceC2329a4 interfaceC2329a4) {
        this.A08.setCta(c1993Mz, str, new HashMap(), interfaceC2242Wv, interfaceC2329a4);
        new KZ(this.A09, this.A07).A05(this.A04, this.A04).A07(str2);
    }

    public void setTitleMaxLines(int i10) {
    }
}
