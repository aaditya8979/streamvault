package com.facebook.ads.redexgen.core;

import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2301Zc extends RelativeLayout {
    public static InterfaceC2260Xn A05;
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public AbstractC2690fy A00;
    public C2529dL A01;
    public C0K A02;
    public LE A03;
    public C2342aJ A04;

    static {
        A02();
        A08 = (int) (AbstractC2232Wl.A02 * 8.0f);
        A07 = A08 * 10;
        A09 = (int) (AbstractC2232Wl.A02 * 15.0f);
        A05 = new LD();
    }

    public C2301Zc(C2529dL c2529dL) {
        super(c2529dL);
        this.A01 = c2529dL;
        this.A02 = new C0K(c2529dL);
        XP.A0I(this.A02);
        this.A00 = new C15776h();
        this.A00.A0G(this.A02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 60);
        }
        return new String(bArrCopyOfRange);
    }

    private ArrayList<C2496cn> A01(AbstractC2804hy abstractC2804hy) {
        if (abstractC2804hy == null) {
            return new ArrayList<>();
        }
        List<C1983Mp> listA27 = abstractC2804hy.A27();
        ArrayList<C2496cn> arrayList = new ArrayList<>(listA27.size());
        for (int i10 = 0; i10 < listA27.size(); i10++) {
            arrayList.add(new C2496cn(i10, listA27.size(), listA27.get(i10)));
        }
        return arrayList;
    }

    public static void A02() {
        A06 = new byte[]{2, 32, 51, 46, 52, 50, 36, 45, 97, 15, 32, 53, 40, 55, 36, 97, 55, 40, 36, 54, 97, 32, 37, 36, 49, 53, 36, 51, 97, 40, 50, 47, 102, 53, 97, 34, 51, 36, 32, 53, 36, 37, 97, 49, 51, 46, 49, 36, 51, 45, 56, 67, 65, 74, 65, 86, 77, 71};
    }

    public static InterfaceC2260Xn getDummyListener() {
        return A05;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpLayoutForCardAtIndex(int i10) {
        if (this.A04 != null) {
            this.A04.A00(i10);
        }
    }

    private void setupDotsLayout(C2072Qc c2072Qc, ArrayList<C2496cn> arrayList) {
        this.A02.getCarouselCardBehaviorHelper().A0Y(new L5(this));
        this.A04 = new C2342aJ(this.A01, c2072Qc.A10().A1z().A01(), arrayList.size());
        XP.A0I(this.A04);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.A02.getId());
        layoutParams.setMargins(0, A09, 0, 0);
        addView(this.A04, layoutParams);
    }

    public final void A04() {
        this.A02.setAdapter(null);
    }

    public final void A05(C2072Qc c2072Qc, int i10) {
        ArrayList<C2496cn> arrayListA01 = A01(c2072Qc.A10());
        this.A02.setCardsInfo(arrayListA01);
        this.A03 = new LE(this.A01, arrayListA01, c2072Qc.A10(), this.A01.A02().A0A(), c2072Qc, A05, c2072Qc.A10().A25(), this.A02.getCarouselCardBehaviorHelper(), null);
        this.A02.setAdapter(this.A03);
        if (i10 == 0) {
            i10 = AbstractC2232Wl.A04.widthPixels;
        }
        this.A03.A0O(i10 - A07, 16, 0);
        this.A03.A0G();
        setupDotsLayout(c2072Qc, arrayListA01);
    }

    public final void A06(C2602eX c2602eX) {
        if (this.A03 != null) {
            this.A03.A0P(c2602eX);
        } else {
            this.A01.A08().AAy(A00(51, 7, 24), AbstractC2142Sv.A1v, new C2143Sw(A00(0, 51, 125)));
        }
        this.A02.A20(c2602eX);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (z10 && this.A03 != null) {
            this.A03.A0O((i12 - i10) - A07, 16, 0);
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }
}
