package com.facebook.ads.redexgen.core;

import android.widget.LinearLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2345aM extends LinearLayout {
    public static final int A06 = (int) (AbstractC2232Wl.A02 * 4.0f);
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C2529dL A04;
    public final C2346aN[] A05;

    public C2345aM(C2529dL c2529dL, int i10, int i11, int i12, int i13) {
        super(c2529dL);
        this.A00 = A06;
        this.A04 = c2529dL;
        setOrientation(0);
        this.A03 = i10;
        this.A01 = i12;
        this.A02 = i13;
        this.A05 = new C2346aN[i11];
        for (int i14 = 0; i14 < i11; i14++) {
            this.A05[i14] = A00();
            addView(this.A05[i14]);
        }
        A01();
    }

    private C2346aN A00() {
        C2346aN c2346aN = new C2346aN(this.A04, this.A01, this.A02);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.A03, this.A03);
        layoutParams.gravity = 16;
        c2346aN.setLayoutParams(layoutParams);
        return c2346aN;
    }

    private void A01() {
        int i10 = 0;
        while (i10 < this.A05.length) {
            ((LinearLayout.LayoutParams) this.A05[i10].getLayoutParams()).leftMargin = i10 == 0 ? 0 : this.A00;
            i10++;
        }
        requestLayout();
    }

    private void A02(float f10) {
        for (int i10 = 0; i10 < this.A05.length; i10++) {
            float fMin = Math.min(1.0f, f10 - i10);
            if (fMin < 0.0f) {
                fMin = 0.0f;
            }
            this.A05[i10].setFillRatio(fMin);
        }
    }

    public void setItemSpacing(int i10) {
        this.A00 = i10;
        A01();
    }

    public void setRating(float f10) {
        A02(f10);
    }
}
