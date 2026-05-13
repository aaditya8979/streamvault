package com.facebook.ads.redexgen.core;

import android.util.AttributeSet;
import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0L, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0L extends AbstractViewOnTouchListenerC14190d implements InterfaceC2493ck {
    public static byte[] A07;
    public static String[] A08 = {"J7yX0QGw9CwhbXJlOgK1AZPNtt2UF0On", "oXMSY1TARkqssgt6s8jHvILUEU9", "ivvOLLZvAzFcQQYEM", "46hEJr0dkjUa2YxjnqHHZtVzHBYgDtfX", "qOyhICr4SrTKnx9gG6JsVKrXp45uLK", "kbgvhlczlSdLn8qANYfrfCagYhnCySOb", "Z6RoLzaVoBLmlhzvAeWOPUTl5laN13sF", "YB9cTMd7bVO"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public InterfaceC2271Xy A04;
    public boolean A05;
    public final C6F A06;

    static {
        A03();
    }

    public C0L(C2529dL c2529dL) {
        super(c2529dL);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C6F(c2529dL, new C2490ch(), new C2489cg());
        A02();
    }

    public C0L(C2529dL c2529dL, AttributeSet attributeSet) {
        super(c2529dL, attributeSet);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C6F(c2529dL, new C2490ch(), new C2489cg());
        A02();
    }

    public C0L(C2529dL c2529dL, AttributeSet attributeSet, int i10) {
        super(c2529dL, attributeSet, i10);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C6F(c2529dL, new C2490ch(), new C2489cg());
        A02();
    }

    private int A00(int i10) {
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - (this.A00 * 2);
        int iA0B = getAdapter().A0B();
        int i11 = 0;
        int i12 = Integer.MAX_VALUE;
        while (i12 > i10) {
            i11++;
            if (i11 >= iA0B) {
                return i10;
            }
            i12 = (int) ((measuredWidth - (i11 * r6)) / (i11 + 0.333f));
        }
        return i12;
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 46);
            if (A08[0].charAt(21) != 'Z') {
                throw new RuntimeException();
            }
            A08[3] = "76s3uTgYoGqvxE8PFJZmOuk3NB8C1jhQ";
        }
        return new String(bArrCopyOfRange);
    }

    private void A02() {
        this.A06.A2C(0);
        setLayoutManager(this.A06);
        setSaveEnabled(false);
        setSnapDelegate(this);
        XP.A0I(this);
    }

    public static void A03() {
        A07 = new byte[]{-68, -69, -99, -82, -76, -78, -112, -75, -82, -69, -76, -78, -79};
    }

    private void A04(int i10, int i11) {
        if (i10 == this.A03 && i11 == this.A02) {
            return;
        }
        this.A03 = i10;
        this.A02 = i11;
        if (A08[3].charAt(25) != 'B') {
            throw new RuntimeException();
        }
        A08[2] = "arB2ao";
        if (0 != 0) {
            throw new NullPointerException(A01(0, 13, 31));
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractViewOnTouchListenerC14190d
    public final void A20(int i10, boolean z10) {
        super.A20(i10, z10);
        A04(i10, 0);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2493ck
    public final int A8g(int i10) {
        int iAbs = Math.abs(i10);
        if (iAbs <= ((AbstractViewOnTouchListenerC14190d) this).A06) {
            return 0;
        }
        if (this.A01 == 0) {
            return 1;
        }
        return 1 + (iAbs / this.A01);
    }

    public int getChildSpacing() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.C15766g, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int iA0F = this.A05 ? (((int) AbstractC2232Wl.A02) * U7.A0F(getContext())) + paddingTop : Math.round(getMeasuredWidth() / 1.91f);
        switch (View.MeasureSpec.getMode(i11)) {
            case Integer.MIN_VALUE:
                iA0F = Math.min(View.MeasureSpec.getSize(i11), iA0F);
                break;
            case 1073741824:
                iA0F = View.MeasureSpec.getSize(i11);
                break;
        }
        int i12 = iA0F - paddingTop;
        int iMin = this.A05 ? Math.min(C2266Xt.A09, i12) : A00(i12);
        setMeasuredDimension(getMeasuredWidth(), iMin + paddingTop);
        if (this.A05) {
            return;
        }
        setChildWidth((this.A00 * 2) + iMin);
    }

    @Override // com.facebook.ads.redexgen.core.C15766g
    public void setAdapter(QC qc2) {
        this.A06.A2J(qc2 == null ? -1 : qc2.hashCode());
        super.setAdapter(qc2);
    }

    public void setChildSpacing(int i10) {
        this.A00 = i10;
    }

    public void setChildWidth(int i10) {
        this.A01 = i10;
        int measuredWidth = getMeasuredWidth();
        this.A06.A2K((((measuredWidth - getPaddingLeft()) - getPaddingRight()) - this.A01) / 2);
        this.A06.A2I(((double) this.A01) / ((double) measuredWidth));
    }

    public void setCurrentPosition(int i10) {
        A20(i10, false);
    }

    public void setOnPageChangedListener(InterfaceC2271Xy interfaceC2271Xy) {
        this.A04 = interfaceC2271Xy;
    }

    public void setShowTextInCarousel(boolean z10) {
        this.A05 = z10;
    }
}
