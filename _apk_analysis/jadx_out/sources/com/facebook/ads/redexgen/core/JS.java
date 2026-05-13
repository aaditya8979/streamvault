package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class JS extends AbstractC2363ae {
    public RelativeLayout A00;
    public RelativeLayout A01;
    public InterfaceC2487ce A02;
    public EG A03;
    public E1 A04;
    public C15003i A05;
    public final LinearLayout A06;
    public final LinearLayout A07;
    public final LinearLayout A08;
    public final LinearLayout A09;
    public final RelativeLayout A0A;
    public final C2529dL A0B;
    public final C2367ai A0C;
    public final DX A0D;
    public final DP A0E;
    public static String[] A0F = {"dHduAtxHUODsuZJhGBZCL", "yuyhTKr6448pVSOhbbO3QanDkg1Btrke", "", "Gtku4tEVnL9u23uc2EIXKUUStEslbjmu", "uz", "Ug", "s4BqeuLW7FPjKDKoSZG73iWJUNxNcWet", "kGKRi0uYqdf74JFz2mP0bKfaoGbNkKkY"};
    public static final int A0V = (int) (AbstractC2232Wl.A02 * 24.0f);
    public static final int A0U = (int) (AbstractC2232Wl.A02 * 8.0f);
    public static final int A0N = (int) (AbstractC2232Wl.A02 * 1.0f);
    public static final int A0O = (int) (AbstractC2232Wl.A02 * 24.0f);
    public static final int A0T = (int) (AbstractC2232Wl.A02 * 3.0f);
    public static final int A0I = (int) (AbstractC2232Wl.A02 * 5.0f);
    public static final int A0W = (int) (AbstractC2232Wl.A02 * 8.0f);
    public static final int A0J = (int) (AbstractC2232Wl.A02 * 16.0f);
    public static final int A0L = (int) (AbstractC2232Wl.A02 * 16.0f);
    public static final int A0K = (int) (AbstractC2232Wl.A02 * 8.0f);
    public static final int A0M = (int) (AbstractC2232Wl.A02 * 8.0f);
    public static final int A0P = (int) (AbstractC2232Wl.A02 * 12.0f);
    public static final int A0H = (int) (AbstractC2232Wl.A02 * 40.0f);
    public static final int A0S = (int) (AbstractC2232Wl.A02 * 16.0f);
    public static final int A0R = (int) (AbstractC2232Wl.A02 * 24.0f);
    public static final int A0Q = (int) (AbstractC2232Wl.A02 * 16.0f);
    public static final int A0G = (int) (AbstractC2232Wl.A02 * 6.0f);

    public JS(C2367ai c2367ai) {
        super(c2367ai, false);
        this.A0E = new DP() { // from class: com.facebook.ads.redexgen.X.5c
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC2152Tf
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DQ dq2) {
                if (this.A00.A02 != null) {
                    this.A00.A02.AJT();
                }
            }
        };
        this.A0D = new DX() { // from class: com.facebook.ads.redexgen.X.5b
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC2152Tf
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C14953d c14953d) {
                this.A00.A04.A0h(EnumC2545db.A02, 20);
            }
        };
        this.A0B = c2367ai.A06();
        this.A0C = c2367ai;
        this.A06 = new LinearLayout(this.A0B);
        this.A09 = new LinearLayout(this.A0B);
        this.A0A = new RelativeLayout(this.A0B);
        this.A08 = new LinearLayout(this.A0B);
        this.A07 = new LinearLayout(this.A0B);
        A08();
    }

    private LinearLayout A00() {
        LinearLayout linearLayout = new LinearLayout(this.A0B);
        linearLayout.setOrientation(0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        linearLayout.setWeightSum(3.0f);
        linearLayout.setPadding(A0U, A0U, A0U, A0U);
        String strA0B = this.A0C.A05().A20().A0I().A0B();
        String strA01 = this.A0C.A05().A20().A0I().A01();
        String strA05 = this.A0C.A05().A20().A0I().A05();
        if (!TextUtils.isEmpty(strA0B)) {
            XX xx = XX.RATINGS;
            AbstractC2804hy abstractC2804hyA05 = this.A0C.A05();
            String[] strArr = A0F;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A0F[2] = "";
            linearLayout.addView(A01(xx, abstractC2804hyA05.A20().A0I().A0B()));
        }
        if (!TextUtils.isEmpty(strA05)) {
            linearLayout.addView(A01(XX.APP_DOWNLOAD_ICON, this.A0C.A05().A20().A0I().A05()));
        }
        if (!TextUtils.isEmpty(strA01)) {
            linearLayout.addView(A01(XX.APP_SIZE_ICON, this.A0C.A05().A20().A0I().A01()));
        }
        layoutParams.addRule(12);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(1);
        return linearLayout;
    }

    private LinearLayout A01(XX xx, String str) {
        LinearLayout linearLayout = new LinearLayout(this.A0B);
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, A0V);
        layoutParams.weight = 1.0f;
        linearLayout.setGravity(17);
        layoutParams.setMargins(A0T, A0T, A0T, A0T);
        linearLayout.setLayoutParams(layoutParams);
        XP.A0Q(linearLayout, XP.A06(Integer.MIN_VALUE, A0Q));
        C2337aE c2337aE = new C2337aE(this.A0C.A06(), 0, -1, xx);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(A0P, A0P);
        layoutParams2.gravity = 16;
        c2337aE.setLayoutParams(layoutParams2);
        linearLayout.addView(c2337aE);
        TextView textView = new TextView(this.A0B);
        textView.setText(str);
        textView.setTextColor(-1);
        XP.A0W(textView, false, 12);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 16;
        layoutParams3.setMargins(A0W, 0, 0, 0);
        textView.setLayoutParams(layoutParams3);
        linearLayout.addView(textView);
        return linearLayout;
    }

    private final RelativeLayout A02(String str, int i10, XX xx) {
        RelativeLayout relativeLayout = new RelativeLayout(this.A0B);
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0H);
        relativeLayout.setPadding(A0J, 0, A0J, 0);
        XP.A0Q(relativeLayout, XP.A06(i10, A0G));
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(this.A0B);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(9);
        textView.setText(str);
        textView.setTextColor(-1);
        XP.A0W(textView, true, 15);
        textView.setLayoutParams(layoutParams2);
        relativeLayout.addView(textView);
        C2337aE c2337aE = new C2337aE(this.A0C.A06(), 0, -1, xx);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(A0P, A0P);
        layoutParams3.addRule(11);
        layoutParams3.setMargins(0, A0I, 0, 0);
        c2337aE.setLayoutParams(layoutParams3);
        relativeLayout.addView(c2337aE);
        return relativeLayout;
    }

    private TextView A03(String str, boolean z10, int i10, int i11, int i12) {
        TextView textView = new TextView(this.A0B);
        textView.setText(str);
        textView.setTextColor(i11);
        XP.A0W(textView, z10, i10);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(A0K, 0, A0K, i12);
        textView.setGravity(1);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    private E1 A05() {
        E1 e12 = new E1(this.A0C.A06());
        XP.A0Q(e12, XP.A06(436207616, A0Q));
        e12.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.A05 = new C15003i(this.A0B, getAdEventManager(), e12, this.A0C.A05().A25(), 0, 0, true, null, null);
        if (U7.A1v(this.A0B)) {
            this.A03 = new EG(this.A0B, getAdEventManager(), e12, this.A0C.A05().A25(), false, this.A05, null);
        } else {
            this.A03 = null;
        }
        return e12;
    }

    private void A07() {
        this.A00 = A02(this.A0C.A05().A10(), -14977820, XX.RIGHT_ARROW_ICON);
        this.A01 = A02(this.A0C.A05().A13(), -13816531, XX.SKIP_ARROW);
        View divider = getDivider();
        this.A09.addView(this.A00);
        this.A09.addView(divider);
        this.A09.addView(this.A01);
        this.A00.setOnClickListener(new ViewOnClickListenerC2396bB(this));
        this.A01.setOnClickListener(new ViewOnClickListenerC2397bC(this));
    }

    private void A08() {
        new C2172Ua(this.A0C.A05().A25(), getAdEventManager()).A04(UZ.A0f, null);
        AbstractC2350aR.A00(this.A0C.A06(), this, this.A0C.A05().A20().A0H().A08());
        int iA00 = this.A0C.A00();
        this.A09.setOrientation(1);
        A09();
        A0A(iA00);
        addView(this.A06);
        A0B(iA00);
        XP.A0Q(this.A0A, XP.A06(436207616, A0Q));
        A0C(iA00);
        this.A04 = A05();
        this.A0A.addView(this.A04);
        this.A0A.addView(A00());
        this.A06.addView(this.A0A);
        A07();
        this.A06.addView(this.A09);
        this.A04.setVideoURI(this.A0C.A05().A20().A0H().A09());
        this.A04.A0h(EnumC2545db.A02, 20);
        this.A04.getEventBus().A03(this.A0E, this.A0D);
    }

    private void A09() {
        this.A08.setOrientation(1);
        this.A07.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        this.A08.setLayoutParams(layoutParams);
        layoutParams.weight = 1.0f;
        A0D(this.A08);
        A0D(this.A07);
        this.A06.addView(this.A08);
        this.A09.addView(this.A07);
    }

    private void A0A(int i10) {
        int i11;
        int i12;
        this.A06.setOrientation(i10 == 1 ? 1 : 0);
        if (this.A0B.A0E() == null || this.A0B.A0E().getWindowManager() == null) {
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.A0B.A0E().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i13 = displayMetrics.widthPixels;
        int i14 = displayMetrics.heightPixels;
        if (i10 == 1) {
            i11 = i13 / 6;
            i12 = i14 / 8;
            this.A06.setWeightSum(6.0f);
        } else {
            i11 = i13 / 8;
            i12 = i14 / 6;
            this.A06.setWeightSum(2.0f);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(i11, i12, i11, i12);
        layoutParams.addRule(14);
        this.A06.setLayoutParams(layoutParams);
        setRewardDescContainerVisibility(i10);
    }

    private void A0B(int i10) {
        LinearLayout.LayoutParams layoutParams;
        if (i10 == 1) {
            layoutParams = new LinearLayout.LayoutParams(-1, 0);
            layoutParams.setMargins(0, A0S, 0, 0);
            layoutParams.weight = 2.0f;
            this.A09.setGravity(0);
        } else {
            layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams.setMargins(A0R, 0, 0, 0);
            layoutParams.weight = 1.0f;
            this.A09.setGravity(16);
        }
        this.A09.setLayoutParams(layoutParams);
    }

    private void A0C(int i10) {
        LinearLayout.LayoutParams layoutParams = i10 == 1 ? new LinearLayout.LayoutParams(-1, 0) : new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = i10 == 1 ? 3.0f : 1.0f;
        this.A0A.setLayoutParams(layoutParams);
    }

    private void A0D(LinearLayout linearLayout) {
        TextView textViewA03 = A03(this.A0C.A05().A12(), true, 24, -657931, A0M);
        TextView textViewA032 = A03(this.A0C.A05().A11(), false, 15, -1, A0L);
        linearLayout.addView(textViewA03);
        linearLayout.addView(textViewA032);
    }

    private View getDivider() {
        View view = new View(this.A0B);
        view.setBackgroundColor(-10131605);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0N);
        layoutParams.setMargins(0, A0O, 0, A0O);
        view.setLayoutParams(layoutParams);
        return view;
    }

    private void setRewardDescContainerVisibility(int i10) {
        if (i10 == 1) {
            this.A08.setVisibility(0);
            this.A07.setVisibility(8);
        } else {
            this.A08.setVisibility(8);
            this.A07.setVisibility(0);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2363ae
    public final ME A1A(String str) {
        return ME.A09;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2363ae
    public final void A1B() {
        super.A1B();
        if (this.A03 != null) {
            this.A03.A07();
        }
        if (this.A05 != null) {
            this.A05.A0p();
        }
        this.A04.getEventBus().A04(this.A0E, this.A0D);
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2363ae
    public final boolean A1M() {
        return true;
    }

    public final void A1O(C15003i c15003i) {
        if (this.A05 != null) {
            this.A05.A0o(c15003i);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2363ae, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0A(configuration.orientation);
        A0B(configuration.orientation);
        A0C(configuration.orientation);
        requestLayout();
    }

    public void setVideoAdViewListener(InterfaceC2487ce interfaceC2487ce) {
        this.A02 = interfaceC2487ce;
    }
}
