package com.facebook.ads.redexgen.core;

import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractViewOnTouchListenerC14190d extends C15766g implements View.OnTouchListener {
    public static byte[] A07;
    public static String[] A08 = {"ySOBxSJ7y2GELC2cR9WRTK6hAhZYocJS", "8dRmuXbfMCidMDGiSpjEcbCkPgx3mm8G", "li61zS9WhZTBvI47lvKtLPcqAcNkij1S", "lH5BfkXLxOyhi", "q0Ccq4Fbg7VKO8sxkIKNcZgKtjQ1fZ14", "ep7ggC7RKpg7Ol5cXUmXF8JhcfOkgUip", "fpgtpMAGWAVh3a0xLZP1kWTjCGk3An57", "s5"};
    public int A00;

    @Nullable
    public C2709gI A01;
    public InterfaceC2493ck A02;
    public boolean A03;
    public boolean A04;
    public int A05;
    public final int A06;

    static {
        A0A();
    }

    public AbstractViewOnTouchListenerC14190d(C2529dL c2529dL) {
        super(c2529dL);
        this.A05 = 0;
        this.A00 = 0;
        this.A03 = true;
        this.A04 = false;
        this.A06 = A05();
        setOnTouchListener(this);
    }

    public AbstractViewOnTouchListenerC14190d(C2529dL c2529dL, AttributeSet attributeSet) {
        super(c2529dL, attributeSet);
        this.A05 = 0;
        this.A00 = 0;
        this.A03 = true;
        this.A04 = false;
        this.A06 = A05();
        setOnTouchListener(this);
    }

    public AbstractViewOnTouchListenerC14190d(C2529dL c2529dL, AttributeSet attributeSet, int i10) {
        super(c2529dL, attributeSet, i10);
        this.A05 = 0;
        this.A00 = 0;
        this.A03 = true;
        this.A04 = false;
        this.A06 = A05();
        setOnTouchListener(this);
    }

    private int A05() {
        return ((int) getContext().getResources().getDisplayMetrics().density) * 10;
    }

    private int A06(int i10) {
        int i11 = this.A00 - i10;
        int iA8g = this.A02.A8g(i11);
        if (i11 > this.A06) {
            return A08(this.A05, iA8g);
        }
        if (i11 >= (-this.A06)) {
            return this.A05;
        }
        int i12 = this.A05;
        if (A08[6].charAt(24) != 'C') {
            throw new RuntimeException();
        }
        A08[7] = "Vh4";
        return A07(i12, iA8g);
    }

    private int A07(int i10, int i11) {
        return Math.max(i10 - i11, 0);
    }

    private int A08(int i10, int i11) {
        return Math.min(i10 + i11, getItemCount() - 1);
    }

    public static String A09(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 110);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{-4, 23, 10, 25, -5, 14, 12, 34, 12, 21, 14, 27, -1, 18, 14, 32, -55, 24, 23, 21, 34, -55, 28, 30, 25, 25, 24, 27, 29, 28, -55, -11, 18, 23, 14, 10, 27, -11, 10, 34, 24, 30, 29, -10, 10, 23, 10, 16, 14, 27};
    }

    private int getItemCount() {
        if (getAdapter() == null) {
            return 0;
        }
        return getAdapter().A0B();
    }

    public void A20(int i10, boolean z10) {
        if (getAdapter() == null) {
            return;
        }
        this.A05 = i10;
        if (z10) {
            A1Y(i10);
        } else {
            A1X(i10);
        }
    }

    public int getCurrentPosition() {
        return this.A05;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int rawX = (int) motionEvent.getRawX();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1 && actionMasked != 6 && actionMasked != 3) {
            if (A08[7].length() == 18) {
                throw new RuntimeException();
            }
            A08[4] = "tIjSEqZVzrzr7cEE0p57iZetopRejSVd";
            if (actionMasked != 4) {
                if (actionMasked == 0 || actionMasked == 5 || (this.A03 && actionMasked == 2)) {
                    this.A00 = rawX;
                    if (this.A03) {
                        this.A03 = false;
                    }
                    this.A04 = true;
                }
                return false;
            }
        }
        if (this.A04) {
            A20(A06(rawX), true);
        }
        this.A03 = true;
        this.A04 = false;
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.C15766g
    public void setLayoutManager(QO qo2) {
        if (!(qo2 instanceof C2709gI)) {
            throw new IllegalArgumentException(A09(0, 50, 59));
        }
        super.setLayoutManager(qo2);
        this.A01 = (C2709gI) qo2;
    }

    public void setSnapDelegate(InterfaceC2493ck interfaceC2493ck) {
        this.A02 = interfaceC2493ck;
    }
}
