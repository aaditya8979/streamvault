package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.text.NumberFormat;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C15475d extends AbstractC1913Jw {
    public static byte[] A0L;
    public static String[] A0M = {"zra6hnpaifP7bxfZB5bQOHnqie2tQjg", "wy9og3M9LeWlDzkU0RS7zgtaq3xQKlMR", "jyAiwm88v9hsYzrfl9gFIABQTfRULZfl", "Wwy1p0nUO1H5ggrsb6VvEsAvpBZyxSvp", "wjN7zQjrZyyYli8cgu97rk5B2y3BycTh", "DSxnyYt0igg0K0GbJ5jSMl2rvJzineXI", "irrLwQMNjn2DglpbBC8hfvG7oGwbzPRC", "9jAewdJckPVrzkqluL1z0QkIRDh51Ovv"};
    public static final int A0N;
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public static final int A0R;
    public static final int A0S;
    public static final int A0T;
    public static final int A0U;
    public static final int A0V;
    public static final int A0W;
    public static final int A0X;
    public static final int A0Y;
    public static final int A0Z;
    public static final int A0a;
    public static final int A0b;
    public static final int A0c;
    public View A00;
    public View A01;
    public ImageView A02;
    public C2529dL A03;
    public C2226Wd A04;
    public AbstractC2259Xm A05;
    public AbstractC2259Xm A06;
    public AbstractC2363ae A07;
    public C2513d4 A08;
    public C2519dA A09;
    public CU A0A;
    public boolean A0B;
    public boolean A0C;
    public final Handler A0D;
    public final Handler A0E;
    public final InterfaceC2260Xn A0F;
    public final InterfaceC2340aH A0G;
    public final C2341aI A0H;
    public final C2367ai A0I;
    public final E1 A0J;
    public final C1732Cw A0K;

    static {
        A0C();
        A0Q = (int) (AbstractC2232Wl.A02 * 16.0f);
        A0b = (int) (AbstractC2232Wl.A02 * 12.0f);
        A0N = (int) (AbstractC2232Wl.A02 * 8.0f);
        A0O = (int) (AbstractC2232Wl.A02 * 10.0f);
        A0W = (int) (AbstractC2232Wl.A02 * 20.0f);
        A0X = (int) (AbstractC2232Wl.A02 * 13.0f);
        A0R = (int) (AbstractC2232Wl.A02 * 48.0f);
        A0a = (int) (AbstractC2232Wl.A02 * 14.0f);
        A0Y = (int) (AbstractC2232Wl.A02 * 12.0f);
        A0P = (int) (AbstractC2232Wl.A02 * 8.0f);
        A0Z = OP.A02(-1, 77);
        A0V = (int) (AbstractC2232Wl.A02 * 16.0f);
        A0c = (int) (AbstractC2232Wl.A02 * 12.0f);
        A0S = (int) (AbstractC2232Wl.A02 * 12.0f);
        A0T = (int) (AbstractC2232Wl.A02 * 16.0f);
        A0U = (int) (AbstractC2232Wl.A02 * 48.0f);
    }

    public C15475d(C2367ai c2367ai) {
        super(c2367ai, false);
        this.A0D = new Handler(Looper.getMainLooper());
        this.A0E = new Handler(Looper.getMainLooper());
        this.A0C = false;
        this.A0B = false;
        this.A03 = c2367ai.A06();
        this.A06 = c2367ai.A0C();
        this.A05 = c2367ai.A0B();
        this.A0I = c2367ai;
        this.A01 = new View(this.A03);
        XP.A0I(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        layoutParams.addRule(13);
        addView(this.A01, layoutParams);
        A09();
        this.A0F = c2367ai.A0D();
        AbstractC2350aR.A00(c2367ai.A06(), this, getAdInfo().A0H().A08());
        this.A0J = A01(c2367ai);
        XP.A0I(this.A0J);
        getAdDetailsView().bringToFront();
        if (A03()) {
            this.A0K = null;
        } else {
            this.A0K = A02(c2367ai);
        }
        if (getAdDataBundle().A1l()) {
            if (this.A0K != null) {
                this.A0K.setVisibility(8);
            }
            getAdDetailsView().setVisibility(8);
            A08();
        }
        A1R();
        this.A08 = new C2513d4(this.A03, c2367ai.A07(), getAdDataBundle());
        this.A0G = new C1909Js(this);
        this.A0H = new C2341aI(c2367ai, getAdDataBundle(), this.A0J, this.A0K, getAdDetailsView(), this.A0F, this.A0G);
        C2227Wg c2227WgA02 = super.A09.A02(getAdDataBundle());
        this.A03.A0H().A00(c2227WgA02.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(super.A09);
        if (c2227WgA02.A00) {
            this.A0J.getVideoImplView().setOnClickListener(new ViewOnClickListenerC2370al(this));
        } else if (U7.A1K(getAdContextWrapper())) {
            AbstractC2317Zs.A00(this.A0J.getVideoImplView(), U7.A1L(getAdContextWrapper()), new ViewOnClickListenerC2371am(this));
        }
        if (c2367ai.A05().A1f()) {
            if (this.A0I.A05().A1i()) {
                this.A07 = new JR(c2367ai);
            } else {
                this.A07 = new JS(c2367ai);
            }
            addView(this.A07, new RelativeLayout.LayoutParams(-1, -1));
            getAdDetailsView().setVisibility(8);
        }
    }

    private E1 A01(C2367ai c2367ai) {
        RelativeLayout.LayoutParams layoutParams;
        E1 e12 = (E1) c2367ai.A02();
        int iA1O = A1O(c2367ai.A0C());
        this.A02 = (ImageView) c2367ai.A03();
        if (A03()) {
            layoutParams = new RelativeLayout.LayoutParams(AbstractC2363ae.A0J, AbstractC2363ae.A0J);
            layoutParams.setMargins(A0T, A0U, A0T, A0S);
            layoutParams.addRule(9);
        } else {
            this.A02.setPadding(AbstractC1913Jw.A0M, AbstractC1913Jw.A0M, AbstractC1913Jw.A0M, AbstractC1913Jw.A0M);
            layoutParams = new RelativeLayout.LayoutParams(AbstractC1913Jw.A0N, AbstractC1913Jw.A0N);
            layoutParams.setMargins(0, iA1O, AbstractC1913Jw.A0L, 0);
            layoutParams.addRule(11);
        }
        layoutParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        if (getAdDataBundle().A1l() && e12 != null) {
            e12.getVideoView().setPadding(e12.getVideoView().getPaddingLeft(), e12.getVideoView().getPaddingTop(), e12.getVideoView().getPaddingRight(), e12.getVideoView().getPaddingBottom() + A0c);
        }
        layoutParams2.addRule(13);
        addView(e12, layoutParams2);
        e12.addView(this.A02, layoutParams);
        return e12;
    }

    private C1732Cw A02(C2367ai c2367ai) {
        C1732Cw c1732CwA0F = c2367ai.A0F();
        c1732CwA0F.A08(-1, AbstractC1913Jw.A0E, false);
        c1732CwA0F.setPadding(AbstractC1913Jw.A0Q, AbstractC1913Jw.A0Q, AbstractC1913Jw.A0Q, AbstractC1913Jw.A0Q);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, AbstractC1913Jw.A0P);
        layoutParams.addRule(12);
        addView(c1732CwA0F, layoutParams);
        return c1732CwA0F;
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0L, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 85);
        }
        return new String(bArrCopyOfRange);
    }

    private void A04() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (this.A09 != null) {
            addView(this.A09.A0T(), layoutParams);
        }
    }

    private void A05() {
        addView(new C2379au(this.A0I.A06(), getAdDataBundle(), this.A0I.A08(), this.A0E, this.A0I.A0D()).A09(getCtaButton()));
    }

    private void A06() {
        XP.A0Z(this.A02, getCtaButton(), getAdDetailsView(), this.A01, this.A0H, this.A0I.A0C());
        for (InterfaceC2546dc interfaceC2546dc : this.A0J.getPlugins()) {
            if (interfaceC2546dc instanceof C2R) {
                this.A0J.A0j(interfaceC2546dc);
                return;
            }
        }
    }

    private void A07() {
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A0H();
            this.A0J.A0j(getAnimationPlugin());
        }
    }

    private void A08() {
        RelativeLayout.LayoutParams layoutParams;
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        A0D(relativeLayout);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, A0Q, 0);
        RelativeLayout relativeLayout2 = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(A0Q, A0b, A0Q, A0b);
        layoutParams3.addRule(12);
        relativeLayout2.addView(relativeLayout, layoutParams2);
        KE ctaButton = getCtaButton();
        ctaButton.setTextSize(14.0f);
        ctaButton.setIncludeFontPadding(false);
        ctaButton.setTextColor(-1);
        layoutParams2.addRule(0, ctaButton.getId());
        if (getAdDataBundle().A1j()) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            XP.A0Q(ctaButton, XP.A06(-16738826, A0N));
            ctaButton.setPadding(A0W, A0X, A0W, A0X);
            ctaButton.setStateListAnimator(null);
            XP.A0V(ctaButton);
        } else {
            ctaButton.setPadding(A0O, A0O, A0O, A0O);
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(6, relativeLayout.getId());
            layoutParams.addRule(8, relativeLayout.getId());
            ctaButton.setBackgroundColor(-12549889);
        }
        layoutParams.addRule(11);
        if (ctaButton.getParent() != null) {
            XP.A0Z(ctaButton);
        }
        relativeLayout2.addView(ctaButton, layoutParams);
        addView(relativeLayout2, layoutParams3);
        relativeLayout2.bringToFront();
    }

    private void A09() {
        if (this.A06 == null) {
            return;
        }
        this.A0A = new CU(this.A06, 400, -this.A06.getToolbarHeight(), 0);
    }

    private void A0A() {
        new C2172Ua(getAdDataBundle().A25(), getAdEventManager()).A04(UZ.A0z, null);
        if (getAdInfo().A0V()) {
            super.A0A.set(true);
            XP.A0R(this);
            XP.A0Z(this.A0K, this.A0H, this.A00);
            XP.A0J(this.A06);
            Pair<EnumC2512d3, View> pairA03 = this.A08.A03(getCtaButton());
            this.A00 = (View) pairA03.second;
            A0E((EnumC2512d3) pairA03.first);
            if (getAdInfo().A0K().A00() >= 0) {
                this.A0B = true;
                if (this.A06 != null) {
                    this.A06.setToolbarActionMode(getAdDataBundle().A2G() ? 8 : 2);
                    this.A06.setProgressImmediate(0.0f);
                }
                this.A04 = new C2226Wd((int) getAdInfo().A0K().A00(), 20.0f, 20L, new Handler(Looper.getMainLooper()), new C1907Jq(this));
                this.A04.A07();
            }
        }
    }

    private void A0B() {
        if (this.A0A != null) {
            this.A0A.A42(true, false);
        }
        if (A03() || getAdDataBundle().A1l() || getAdDetailsAnimation() == null) {
            return;
        }
        CU adDetailsAnimation = getAdDetailsAnimation();
        String[] strArr = A0M;
        if (strArr[3].charAt(21) == strArr[6].charAt(21)) {
            throw new RuntimeException();
        }
        A0M[1] = "NNplzEPPEJhw482VYN3vhqCWu3reteuX";
        adDetailsAnimation.A42(true, false);
    }

    public static void A0C() {
        A0L = new byte[]{-23, -117, 1, -6, 15, -2, 24, 12, 13, -6, 11, 13, 2, 7, 0, 24, -6, 7, 2, 6, -6, 13, 2, 8, 7, 12, 24, 9, 5, -6, 18, -2, -3, 26, 29, 33, 19, 45, 32, 19, 37, 15, 32, 18, 45, 33, 17, 32, 19, 19, 28, 45, 33, 22, 29, 37, 28, -7, -29, -11, 1, -25, -16, -26, 1, -27, -29, -12, -26, 1, -11, -22, -15, -7, -16, -17, -19, -33, -20, -35, -26, -29, -35, -27};
    }

    private void A0D(RelativeLayout relativeLayout) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0R, A0R);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        C2343aK c2343aK = new C2343aK(this.A03);
        XP.A0K(c2343aK, 0);
        XP.A0I(c2343aK);
        new KZ(c2343aK, this.A03).A05(A0R, A0R).A07(getAdDataBundle().A23().A01());
        TextView textView = new TextView(this.A03);
        XP.A0I(textView);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setTextColor(getAdDataBundle().A1z().A01().A07(true));
        textView.setText(getAdDataBundle().A20().A0I().A0F());
        textView.setTextSize(!getAdDataBundle().A1j() ? 16.0f : 17.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        C2345aM c2345aM = new C2345aM(this.A03, !getAdDataBundle().A1j() ? A0a : A0Y, 5, A0Z, -1);
        c2345aM.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        TextView textView2 = new TextView(this.A03);
        textView2.setTextColor(getAdDataBundle().A1z().A01().A07(true));
        textView2.setGravity(16);
        textView2.setIncludeFontPadding(false);
        if (!getAdDataBundle().A1j()) {
            textView2.setTextSize(13.0f);
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams3.leftMargin = A0P;
        LinearLayout linearLayout = new LinearLayout(this.A03);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, A0V);
        layoutParams4.topMargin = A0P / 2;
        layoutParams4.addRule(3, textView.getId());
        linearLayout.addView(c2345aM, layoutParams2);
        linearLayout.addView(textView2, layoutParams3);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.leftMargin = A0P;
        layoutParams5.addRule(1, c2343aK.getId());
        layoutParams5.addRule(15);
        RelativeLayout relativeLayout2 = new RelativeLayout(getContext());
        relativeLayout2.addView(linearLayout, layoutParams4);
        relativeLayout2.addView(textView);
        relativeLayout.addView(relativeLayout2, layoutParams5);
        relativeLayout.addView(c2343aK, layoutParams);
        if (TextUtils.isEmpty(getAdDataBundle().A20().A0I().A0B())) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        c2345aM.setRating(Float.parseFloat(getAdDataBundle().A20().A0I().A0B()));
        if (getAdDataBundle().A20().A0I().A08() != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(A03(0, 1, 108));
            sb2.append(!getAdDataBundle().A1j() ? NumberFormat.getNumberInstance().format(Integer.parseInt(getAdDataBundle().A20().A0I().A08())) : AbstractC2241Wu.A01(Integer.parseInt(getAdDataBundle().A20().A0I().A08())));
            sb2.append(A03(1, 1, 13));
            textView2.setText(sb2.toString());
        }
    }

    private void A0E(EnumC2512d3 enumC2512d3) {
        if (getAdDataBundle().A20().A0K().A02().isEmpty()) {
            if (getAdDataBundle().A20().A0K().A03() || getAdDataBundle().A20().A0K().A04()) {
                A06();
                A05();
                return;
            }
        } else if (getAdDataBundle().A20().A0K().A03()) {
            this.A09 = new C2519dA(this.A03, getAdDataBundle(), this.A0F, getCtaButton(), this.A0E, this.A0I.A08());
            XP.A0Z(this.A06, getAdDetailsView(), this.A02);
            A04();
            return;
        }
        A0F(enumC2512d3);
    }

    private void A0F(EnumC2512d3 enumC2512d3) {
        this.A0J.A0k(false);
        this.A0J.setVisibility(8);
        if (this.A06 instanceof C2011Nr) {
            AbstractC2259Xm abstractC2259Xm = this.A05;
            if (A0M[2].charAt(18) == 'X') {
                throw new RuntimeException();
            }
            String[] strArr = A0M;
            strArr[3] = "VBTxPCVQSRRVVKfJEBHdIagRaEa9moGI";
            strArr[6] = "iS4EeCSjafPAdymtQeFXdNKcyC2MGxGr";
            if (abstractC2259Xm != null) {
                XP.A0F(this.A06);
                this.A06 = this.A05;
                XP.A0J(this.A06);
            }
        }
        switch (enumC2512d3) {
            case A03:
                AbstractC2320Zv oldEndCardAdDetailsView = getOldEndCardAdDetailsView();
                if (A0M[4].charAt(31) == 'A') {
                    throw new RuntimeException();
                }
                A0M[2] = "XFfDcp5VJF8GQaNSTNs87nOmJmOzmbPV";
                if (oldEndCardAdDetailsView == null) {
                    getAdDetailsView().setVisibility(0);
                } else {
                    addView(oldEndCardAdDetailsView);
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(0, A1O(this.A06), 0, 0);
                if (oldEndCardAdDetailsView == null) {
                    layoutParams.addRule(2, getAdDetailsView().getId());
                } else {
                    layoutParams.addRule(2, oldEndCardAdDetailsView.getId());
                }
                addView(this.A00, layoutParams);
                return;
            case A02:
                XP.A0Z(getAdDetailsView());
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.setMargins(AbstractC1913Jw.A0O, AbstractC1913Jw.A0O, AbstractC1913Jw.A0O, AbstractC1913Jw.A0O);
                addView(this.A00, layoutParams2);
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1913Jw, com.facebook.ads.redexgen.core.AbstractC2363ae
    public final void A1B() {
        super.A1B();
        A07();
        getAdDetailsView().A0f();
        this.A0E.removeCallbacksAndMessages(null);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1913Jw, com.facebook.ads.redexgen.core.AbstractC2363ae
    public final void A1G(C1983Mp c1983Mp, String str, double d10, Bundle bundle) {
        super.A1G(c1983Mp, str, d10, bundle);
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!bundle.getBoolean(A03(2, 31, 100), false)) {
            A0B();
        }
        if (bundle.getBoolean(A03(57, 18, 77), false)) {
            A0A();
        }
        if (bundle.getBoolean(A03(33, 24, 121), false)) {
            this.A0H.A07(this);
        }
        if (A03()) {
            boolean z10 = getAdDetailsView() instanceof KL;
            if (A0M[2].charAt(18) == 'X') {
                throw new RuntimeException();
            }
            String[] strArr = A0M;
            strArr[3] = "TYF9Gze5okVE8nAMFw0kZuTKWJAG4GPN";
            strArr[6] = "e5C8lQxoH1vEX5uTYGqpe7vBIorNDTyW";
            if (z10) {
                ((KL) getAdDetailsView()).A0l();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2363ae
    public final void A1H(C14953d c14953d) {
        super.A1H(c14953d);
        if (A03()) {
            AbstractC2320Zv adDetailsView = getAdDetailsView();
            if (A0M[0].length() == 5) {
                throw new RuntimeException();
            }
            A0M[4] = "m5gTgOd0mlzOyrsuIVxaBMecvKjJBXrq";
            removeView(adDetailsView);
        }
        A0A();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2363ae
    public final void A1I(DO r10) {
        super.A1I(r10);
        if (this.A07 == null || this.A07.getVisibility() != 0) {
            if (A03()) {
                this.A03.A0F().AJw(AbstractC2223Wa.A00((float) this.A0I.A05().A0h()), getResources().getConfiguration().orientation, true, false, MH.A0C(this.A0I.A04()));
            }
            A1Z(getResources().getConfiguration().orientation);
            if (getAdDataBundle().A1W()) {
                this.A0J.setOnClickListener(getCtaButton());
            }
            if (A03()) {
                getAdDetailsView().setVisibility(0);
                if (getAdDetailsView() instanceof KL) {
                    ((KL) getAdDetailsView()).A0q(getResources().getConfiguration().orientation);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2363ae
    public final void A1J(C3Q c3q, int i10) {
        super.A1J(c3q, i10);
        int iA00 = c3q.A00();
        int duration = this.A0J.getDuration();
        int i11 = duration - iA00;
        if (getAnimationPlugin() != null && i11 < 3000 && getAnimationPlugin().A0M()) {
            getAnimationPlugin().A0I();
        }
        if (!(getAdDetailsView() instanceof KL) || this.A0I.A05().A1i()) {
            return;
        }
        ((KL) getAdDetailsView()).A0o(((duration * i10) + c3q.A00()) / 1000);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2363ae
    public final boolean A1K() {
        return getAdInfo().A0V();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2363ae
    public final boolean A1M() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2363ae
    public final boolean A1N(boolean z10) {
        if (z10 && !this.A0C && !super.A0A.get()) {
            this.A0H.A07(this);
            return true;
        }
        if (!getAdInfo().A0V()) {
            return false;
        }
        boolean z11 = super.A0A.get();
        if (A0M[4].charAt(31) == 'A') {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[3] = "EPxoCM5ZHywZjaL2iUUSFMk3WFd5m6XL";
        strArr[6] = "lTBjgNJWw5Z4CB7iubQhWZLtOmC1X7yD";
        if (z11) {
            return false;
        }
        this.A0J.A0g(EnumC2537dT.A08);
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1913Jw
    public final AbstractC2320Zv A1P(C2367ai c2367ai, C1983Mp c1983Mp, String str) {
        double dA0h = c2367ai.A05().A0h();
        if (A03()) {
            return E1.A0T((float) dA0h) ? new C15605q(c2367ai.A06(), getCtaButton(), AbstractC1913Jw.A0I, false, getColors(), str, c2367ai.A07(), c2367ai.A0D(), c2367ai.A0G(), c2367ai.A0A(), c2367ai.A05(), c2367ai.A0F(), c2367ai.A08(), false) : E1.A0V((float) dA0h) ? new C15595p(c2367ai.A06(), getCtaButton(), AbstractC1913Jw.A0I, false, getColors(), str, c2367ai.A07(), c2367ai.A0D(), c2367ai.A0G(), c2367ai.A0A(), c2367ai.A05(), c2367ai.A0F(), c2367ai.A08(), false) : new C15615r(c2367ai.A06(), getCtaButton(), AbstractC1913Jw.A0I, false, getColors(), str, c2367ai.A07(), c2367ai.A0D(), c2367ai.A0G(), c2367ai.A0A(), c2367ai.A05(), c2367ai.A0F(), c2367ai.A08(), false);
        }
        return new C1915Jy(c2367ai.A06(), getCtaButton(), AbstractC1913Jw.A0J, c1983Mp.A0I().A00() == EnumC1988Mu.A05, getColors(), c1983Mp.A0J().A06(), str, c2367ai.A07(), c2367ai.A0D(), c2367ai.A0G(), c2367ai.A0A(), c2367ai.A05());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1913Jw
    public final C1915Jy A1Q(C2367ai c2367ai, C1983Mp c1983Mp, String str) {
        return new C1915Jy(c2367ai.A06(), getCtaButton(), AbstractC1913Jw.A0J, c1983Mp.A0I().A00() == EnumC1988Mu.A05, getColors(), c1983Mp.A0J().A06(), str, c2367ai.A07(), c2367ai.A0D(), c2367ai.A0G(), c2367ai.A0A(), c2367ai.A05());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1913Jw
    public final void A1R() {
        super.A1R();
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().AAm(this.A0J);
        }
    }

    public final void A1W() {
        getCtaButton().A0E(A03(75, 9, 37));
    }

    public final void A1X() {
        if (getAdDetailsView() instanceof KL) {
            ((KL) getAdDetailsView()).setPlaceHolderTextForRewardsConversion(getAdDataBundle().A14());
        }
    }

    public final void A1Y() {
        new C2172Ua(this.A0I.A05().A25(), getAdEventManager()).A04(UZ.A0h, null);
        if (this.A0I.A0C() != null) {
            AbstractC2259Xm abstractC2259XmA0C = this.A0I.A0C();
            if (A0M[4].charAt(31) == 'A') {
                throw new RuntimeException();
            }
            A0M[2] = "qVUXWES3bTCAG5k5pbCpCu4g17099rEp";
            abstractC2259XmA0C.setVisibility(8);
            removeView(this.A0I.A0C());
        }
        removeView(this.A07);
        removeView(this.A0J);
        A07();
        removeView(getAdDetailsView());
        removeView(this.A0K);
        removeView(this.A00);
        if (this.A09 != null) {
            removeView(this.A09.A0U());
        }
        if (this.A0I.A05().A1i()) {
            A1T();
        } else {
            A1S();
        }
    }

    public final void A1Z(int i10) {
        if (A03()) {
            this.A03.A0F().AJy(i10);
            this.A0J.A0c(i10);
            A1U(i10, this.A0J, (RelativeLayout) this.A0J.getVideoView());
        }
    }

    public final void A1a(C15003i c15003i) {
        if (this.A07 != null) {
            if (this.A07 instanceof JR) {
                ((JR) this.A07).A1O(c15003i);
            }
            if (this.A07 instanceof JS) {
                ((JS) this.A07).A1O(c15003i);
            }
            this.A07.A1B();
            AbstractC2363ae abstractC2363ae = this.A07;
            String[] strArr = A0M;
            if (strArr[3].charAt(21) == strArr[6].charAt(21)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[3] = "wl3lZ2t8QgZzPvgxh0a22wDB24cvqHL6";
            strArr2[6] = "goKzKnMqtJl7yehw7GAGrdNRW8UKCTH6";
            removeView(abstractC2363ae);
            this.A07 = null;
        }
        getAdDetailsView().setVisibility(0);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2363ae
    public int getCloseButtonStyle() {
        if (this.A0B) {
            return getAdDataBundle().A2G() ? 8 : 2;
        }
        if (!A1K() || super.A0A.get()) {
            return super.getCloseButtonStyle();
        }
        return 1;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1913Jw, com.facebook.ads.redexgen.core.AbstractC2363ae, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A07 != null) {
            AbstractC2363ae abstractC2363ae = this.A07;
            if (A0M[0].length() == 5) {
                throw new RuntimeException();
            }
            A0M[4] = "EpyE2nRNkziEqwhglEeRfTluajKoT9IB";
            if (abstractC2363ae.getVisibility() == 0) {
                getAdDetailsView().setVisibility(8);
                return;
            }
        }
        if (getAdDataBundle().A20().A0K().A03() && this.A09 != null && super.A0A.get()) {
            this.A09.A0W(configuration.orientation);
        }
        if (this.A09 == null && !super.A0A.get()) {
            A1Z(configuration.orientation);
            return;
        }
        AbstractC2320Zv oldEndCardAdDetailsView = getOldEndCardAdDetailsView();
        if (oldEndCardAdDetailsView != null) {
            oldEndCardAdDetailsView.A0h(configuration.orientation);
        }
    }

    public void setVideoAdViewListener(InterfaceC2487ce interfaceC2487ce) {
        if (this.A07 instanceof JR) {
            ((JR) this.A07).setVideoAdViewListener(interfaceC2487ce);
        }
        if (this.A07 instanceof JS) {
            ((JS) this.A07).setVideoAdViewListener(interfaceC2487ce);
        }
    }
}
