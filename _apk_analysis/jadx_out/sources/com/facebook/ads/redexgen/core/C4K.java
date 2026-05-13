package com.facebook.ads.redexgen.core;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4K, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C4K extends AbstractC1856Hr {
    public static byte[] A0k;
    public static String[] A0l = {"PW", "VMuxnsAFAgr5cT24vzltLNiVzxTvarbU", "jq4GRSBqKMr4rGHs6WabqGWnms1UYtFJ", "ha", "80KuzsseMGT5f9rKVuNW3ow7LLk13v1X", "uG1OElCv3xaCg8aDr811TJkNgBcTan1c", "YwXHrw3Tlq3bJQZfooudgwuoCwRnfSi1", "LVHFB8bkqwAuG3vKzwVN0RmVN3FHwXeF"};
    public static final int A0m;
    public static final int A0n;
    public static final int A0o;
    public static final int A0p;
    public static final int A0q;
    public static final int A0r;
    public static final int A0s;
    public static final int A0t;
    public static final int A0u;
    public static final int A0v;
    public float A00;
    public int A01;
    public ImageView A02;
    public LinearLayout A03;
    public ZH A04;
    public ZP A05;
    public LJ A06;
    public KE A07;
    public C2379au A08;
    public EnumC2545db A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final float A0K;
    public final int A0L;
    public final Handler A0M;
    public final Handler A0N;
    public final MH A0O;
    public final C1992My A0P;
    public final C2529dL A0Q;
    public final C2172Ua A0R;
    public final AbstractC2259Xm A0S;
    public final KL A0T;
    public final InterfaceC2329a4 A0U;
    public final InterfaceC2476cT A0V;
    public final EG A0W;
    public final E1 A0X;
    public final C15003i A0Y;
    public final DX A0Z;
    public final DV A0a;
    public final DR A0b;
    public final DP A0c;
    public final DN A0d;
    public final DM A0e;
    public final D0 A0f;
    public final C1732Cw A0g;
    public final Runnable A0h;
    public final boolean A0i;
    public final boolean A0j;

    static {
        A0U();
        A0m = (int) (AbstractC2232Wl.A02 * 4.0f);
        A0s = (int) (AbstractC2232Wl.A02 * 32.0f);
        A0r = (int) (AbstractC2232Wl.A02 * 8.0f);
        A0n = (int) (AbstractC2232Wl.A02 * 12.0f);
        A0o = (int) (AbstractC2232Wl.A02 * 16.0f);
        A0p = (int) (AbstractC2232Wl.A02 * 48.0f);
        A0q = (int) (AbstractC2232Wl.A02 * 64.0f);
        A0t = OP.A02(-1, 77);
        A0u = (int) (AbstractC2232Wl.A02 * 26.0f);
        A0v = (int) (AbstractC2232Wl.A02 * 12.0f);
    }

    public C4K(C2529dL c2529dL, US us2, AbstractC2259Xm abstractC2259Xm, AbstractC2804hy abstractC2804hy, SF sf2, YY yy, int i10, InterfaceC2260Xn interfaceC2260Xn, C2172Ua c2172Ua, int i11, boolean z10, boolean z11, InterfaceC2476cT interfaceC2476cT, int i12, int i13) {
        super(c2529dL, yy, us2, abstractC2804hy, i10, z10, z11, interfaceC2260Xn, i13);
        this.A0F = false;
        this.A0E = false;
        this.A0D = false;
        this.A01 = 0;
        this.A0H = true;
        this.A0J = false;
        this.A0G = false;
        this.A0N = new Handler(Looper.getMainLooper());
        this.A0h = new RunnableC2470cN(this);
        this.A0C = false;
        this.A00 = 0.0f;
        this.A0A = true;
        this.A0d = new DN() { // from class: com.facebook.ads.redexgen.X.4X
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC2152Tf
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DO r10) {
                if (this.A00.A0J) {
                    return;
                }
                this.A00.A0J = true;
                this.A00.A0Q.A0F().AJw(AbstractC2223Wa.A00((float) ((AbstractC1856Hr) this.A00).A06.A0h()), this.A00.getResources().getConfiguration().orientation, true, true, MH.A0A());
                this.A00.A0V(this.A00.getResources().getConfiguration().orientation);
                this.A00.A0T.setVisibility(0);
                this.A00.A0T.A0q(this.A00.getResources().getConfiguration().orientation);
                this.A00.A0T.bringToFront();
                this.A00.A0T();
            }
        };
        this.A0c = new DP() { // from class: com.facebook.ads.redexgen.X.4W
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC2152Tf
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DQ dq2) {
                if (((AbstractC1856Hr) this.A00).A0A.A07()) {
                    return;
                }
                this.A00.A1C();
            }
        };
        this.A0b = new DR() { // from class: com.facebook.ads.redexgen.X.4V
            @Override // com.facebook.ads.redexgen.core.AbstractC2152Tf
            public final /* bridge */ /* synthetic */ void A03(C2150Td c2150Td) {
            }
        };
        this.A0e = new DM() { // from class: com.facebook.ads.redexgen.X.4U
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC2152Tf
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3Q c3q) {
                this.A00.A0k(c3q);
                this.A00.A0V.ADI((this.A00.A00 * this.A00.A0X.getDuration()) + c3q.A00());
            }
        };
        this.A0Z = new DX() { // from class: com.facebook.ads.redexgen.X.4T
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC2152Tf
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C14953d c14953d) {
                this.A00.A0V.ACy(this.A00.A0X.getDuration());
                C4K.A01(this.A00, 1.0f);
                this.A00.A0X.A0h(EnumC2545db.A02, 28);
            }
        };
        this.A0a = new C4L(this);
        this.A0U = new G9(this);
        this.A0S = abstractC2259Xm;
        this.A0L = i12;
        this.A0M = new Handler(Looper.getMainLooper());
        this.A0O = MI.A01(c2529dL, us2, abstractC2804hy.A25(), WQ.A00(abstractC2804hy.A20().A0J().A05()), new HashMap(), false, true, abstractC2804hy.A21());
        this.A0Q = c2529dL;
        this.A0R = c2172Ua;
        this.A0f = new D0(this.A0Q, this.A0R);
        this.A0g = new C1732Cw(this.A0Q, i12);
        this.A0V = interfaceC2476cT;
        this.A0P = i11 == 1 ? super.A06.A1z().A01() : super.A06.A1z().A00();
        AbstractC2350aR.A00(this.A0Q, this, abstractC2804hy.A20().A0H().A08());
        this.A0X = new E1(this.A0Q);
        this.A0X.getEventBus().A03(this.A0d, this.A0c, this.A0b, this.A0e, this.A0Z, this.A0a);
        this.A0Y = new C15003i(c2529dL, us2, this.A0X, abstractC2804hy.A25());
        A0S();
        this.A0X.setVideoURI(sf2.A0T(super.A06.A20().A0H().A09()));
        this.A0K = (float) abstractC2804hy.A0h();
        A0P();
        A0L();
        A0K();
        this.A0T = A0D();
        addView(this.A0T);
        XP.A0I(this.A0T);
        A0R();
        A0Q();
        this.A0T.getProgressBarAnimation().setShouldClearAnimationWhenVideoCompleted(false);
        if (U7.A1u(this.A0Q)) {
            this.A0Q.A0B().AK2(this.A0X, super.A06.A25(), true);
        }
        if (U7.A1v(this.A0Q)) {
            this.A0W = new EG(this.A0Q, us2, this.A0X, super.A06.A25(), false, this.A0Y, null);
        } else {
            this.A0W = null;
        }
        A0a(abstractC2804hy.A20());
        this.A0i = super.A06.A1e();
        this.A0j = super.A06.A1p();
        A0O();
        c2529dL.A0F().ABe(this.A0i, this.A0j, true);
        this.A0f.bringToFront();
    }

    public static /* synthetic */ float A01(C4K c4k, float f10) {
        float f11 = c4k.A00 + f10;
        c4k.A00 = f11;
        return f11;
    }

    public static /* synthetic */ int A03(C4K c4k) {
        int i10 = c4k.A01;
        c4k.A01 = i10 + 1;
        return i10;
    }

    private KL A0D() {
        String strA03 = super.A06.A0v().equals(A0I(49, 14, 78)) ? EnumC2551dh.A04.A03() : A0I(12, 37, 68);
        KL c15605q = A0t(this.A0K) ? new C15605q(this.A0Q, this.A07, AbstractC1856Hr.A0G, false, getColors(), strA03, super.A08, super.A0B, super.A0D, super.A0A, super.A06, this.A0g, this.A0R, true) : A0u(this.A0K) ? new C15595p(this.A0Q, this.A07, AbstractC1856Hr.A0G, false, getColors(), strA03, super.A08, super.A0B, super.A0D, super.A0A, super.A06, this.A0g, this.A0R, true) : new C15615r(this.A0Q, this.A07, AbstractC1856Hr.A0G, false, getColors(), strA03, super.A08, super.A0B, super.A0D, super.A0A, super.A06, this.A0g, this.A0R, true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(12);
        c15605q.setVisibility(8);
        c15605q.setChainedAdInfo(super.A00);
        c15605q.setLayoutParams(layoutParams);
        return c15605q;
    }

    public static String A0I(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0k, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 29);
        }
        return new String(bArrCopyOfRange);
    }

    private void A0J() {
        this.A08 = new C2379au(this.A0Q, super.A06, this.A0R, this.A0N, super.A0B);
        this.A08.A0D(false);
        addView(this.A08.A09(getRegularCtaForEndCard()));
    }

    private void A0K() {
        this.A0g.A08(-1, A0t, false);
        this.A0g.setPadding(A0v, A0v, A0v, A0v);
    }

    private void A0L() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0s, A0s);
        layoutParams.setMargins(A0o, A0p, A0o, A0n);
        layoutParams.addRule(9);
        layoutParams.addRule(10);
        addView(this.A0X, new RelativeLayout.LayoutParams(-1, -1));
        addView(this.A0f, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M() {
        if (super.A06.A1W() && this.A0C) {
            this.A0C = false;
            A0m(A0I(63, 18, 85));
        }
    }

    private void A0N() {
        if (super.A06.A1W() && this.A0C) {
            this.A0C = false;
            Map<String, String> mapA05 = new C2314Zp().A03(null).A02(null).A05();
            mapA05.put(A0I(0, 12, 95), A0I(63, 18, 85));
            super.A08.AAs(super.A06.A25(), mapA05);
        }
    }

    private void A0O() {
        if (super.A06.A20().A0K().A04()) {
            this.A02 = new ImageView(this.A0Q);
            addView(this.A02);
            this.A02.setVisibility(4);
            new KZ(this.A02, this.A0Q).A04().A06(new GD(this)).A07(super.A06.A20().A0H().A08());
        }
    }

    private void A0P() {
        postDelayed(new GO(this), U7.A0P(this.A0Q));
    }

    private void A0Q() {
        XP.A0H(this.A03);
        this.A03 = new LinearLayout(this.A0Q);
        this.A03.setOrientation(1);
        XP.A0I(this.A03);
        this.A03.setBackgroundColor(-1);
        addView(this.A03);
    }

    private void A0R() {
        if (super.A06.A1W()) {
            this.A0X.setOnClickListener(new ViewOnClickListenerC2472cP(this));
        }
        XP.A0H(this.A0X);
        XP.A0I(this.A0X);
        addView(this.A0X, new RelativeLayout.LayoutParams(-1, -2));
        this.A07 = new KE(this.A0Q, super.A06, this.A0P, super.A08, super.A0B, super.A0D, super.A0A, (InterfaceC2242Wv) null);
        XP.A0E(1001, this.A07);
        if (U7.A17(this.A0Q)) {
            this.A0T.setCTAClickListener(new ViewOnClickListenerC2465cI(this));
            if (this.A0S != null) {
                this.A0S.setCTAClickListener(new ViewOnClickListenerC2466cJ(this));
            }
        }
    }

    private void A0S() {
        this.A0X.A0i(this.A0g);
        this.A0X.A0i(this.A0f);
        if (!TextUtils.isEmpty(super.A06.A20().A0H().A08())) {
            C14812p c14812p = new C14812p(this.A0Q, true);
            this.A0X.A0i(c14812p);
            c14812p.setImage(super.A06.A20().A0H().A08());
        }
        this.A0X.A0i(new C2Y(this.A0Q));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0T() {
        int duration = this.A0X.getDuration();
        if (this.A0g.getCustomDuration() > duration) {
            this.A0g.setCustomDuration(duration);
        }
    }

    public static void A0U() {
        A0k = new byte[]{33, 46, 43, 33, 41, 29, 49, 45, 55, 48, 33, 39, 58, 54, 52, 119, 63, 56, 58, 60, 59, 54, 54, 50, 119, 56, 61, ExifInterface.START_CODE, 119, 48, 55, 45, 60, 43, ExifInterface.START_CODE, 45, 48, 45, 48, 56, 53, 119, 58, 53, 48, 58, 50, 60, 61, 33, 54, 36, 50, 33, 55, 54, 55, 12, 37, 58, 55, 54, 60, 61, 59, 45, 58, 43, 36, 33, 43, 35, 23, 46, 33, 36, 60, 45, 58, 45, 44, 9};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0V(int i10) {
        if (this.A0J) {
            E1 e12 = this.A0X;
            RelativeLayout relativeLayout = (RelativeLayout) this.A0X.getVideoView();
            this.A0X.A0c(i10);
            A0W(i10, e12, relativeLayout);
        }
    }

    private void A0W(int i10, ViewGroup viewGroup, RelativeLayout relativeLayout) {
        if (relativeLayout == null) {
            return;
        }
        XP.A0H(this.A0T);
        if ((this.A0T instanceof C15615r) || (this.A0T instanceof C15605q)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            if (getResources().getConfiguration().orientation == 2) {
                layoutParams.addRule(1, relativeLayout.getId());
                this.A0T.setLayoutParams(layoutParams);
                viewGroup.addView(this.A0T);
            } else {
                View view = this.A0T;
                String[] strArr = A0l;
                if (strArr[1].charAt(10) != strArr[2].charAt(10)) {
                    throw new RuntimeException();
                }
                A0l[4] = "hNSRRdlixh2gw3rjMoVJbJnBOeMmg8Zc";
                addView(view, layoutParams);
            }
        } else if (this.A0T instanceof C15595p) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(12);
            this.A0T.setLayoutParams(layoutParams2);
            addView(this.A0T, layoutParams2);
        }
        this.A0T.A0h(i10);
        this.A0T.A0s(viewGroup, relativeLayout, i10);
    }

    private void A0X(ViewGroup viewGroup, View view, int i10) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        if (i10 == 1) {
            layoutParams2.width = -1;
            layoutParams2.height = -2;
        } else {
            layoutParams2.width = -2;
            layoutParams2.height = -1;
        }
        layoutParams2.removeRule(14);
        viewGroup.setLayoutParams(layoutParams);
        view.setLayoutParams(layoutParams2);
        A0V(i10);
    }

    private void A0Y(ViewGroup viewGroup, View view, AbstractC2259Xm abstractC2259Xm, int i10) {
        XP.A0Z(this.A03);
        XP.A0H(abstractC2259Xm);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, abstractC2259Xm.getToolbarHeight());
        layoutParams.addRule(10);
        layoutParams.setMargins(A0q, A0p, 0, 0);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        if (i10 == 1) {
            layoutParams3.width = -1;
            layoutParams3.height = -2;
        } else {
            layoutParams3.width = -2;
            layoutParams3.height = -1;
        }
        layoutParams3.removeRule(14);
        viewGroup.setLayoutParams(layoutParams2);
        view.setLayoutParams(layoutParams3);
        this.A0T.A0t(viewGroup, false, false, this.A03.getId());
        A0V(i10);
        viewGroup.addView(abstractC2259Xm, layoutParams);
    }

    private void A0Z(ViewGroup viewGroup, View view, AbstractC2259Xm abstractC2259Xm, int i10) {
        XP.A0H(this.A03);
        XP.A0H(abstractC2259Xm);
        XP.A0H(this.A0T);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        layoutParams.setMargins(A0q, A0p, 0, 0);
        boolean zA0u = A0u(this.A0K);
        boolean z10 = i10 == 1;
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams3.removeRule(14);
        layoutParams3.removeRule(9);
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.A03.getLayoutParams();
        layoutParams4.removeRule(3);
        layoutParams4.removeRule(1);
        boolean z11 = z10 || zA0u;
        if (z11) {
            layoutParams2.height = getHeightPixels() / 4;
            layoutParams3.height = getHeightPixels() / 4;
            layoutParams3.addRule(14);
            layoutParams4.addRule(3, viewGroup.getId());
        } else {
            this.A0X.A0c(i10);
            layoutParams2.height = -1;
            layoutParams3.height = -1;
            layoutParams3.addRule(9);
            layoutParams4.addRule(1, view.getId());
        }
        layoutParams2.addRule(9);
        String[] strArr = A0l;
        if (strArr[3].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        A0l[5] = "5Z0aNPRQigyxlbiqHgRS6C1obCW9NP1F";
        layoutParams2.addRule(10);
        viewGroup.setLayoutParams(layoutParams2);
        layoutParams3.width = -2;
        view.setLayoutParams(layoutParams3);
        layoutParams4.width = -1;
        layoutParams4.height = -1;
        layoutParams4.setMargins(0, 0, 0, 0);
        this.A03.setLayoutParams(layoutParams4);
        if (z11) {
            addView(this.A03);
            addView(abstractC2259Xm, layoutParams);
        } else {
            viewGroup.addView(this.A03);
            layoutParams.addRule(0, this.A03.getId());
            viewGroup.addView(abstractC2259Xm, layoutParams);
        }
        this.A0T.A0t(viewGroup, true, zA0u, this.A03.getId());
    }

    private void A0a(C1983Mp c1983Mp) {
        this.A0T.setInfo(c1983Mp.A0I(), c1983Mp.A0J(), super.A06.A25(), super.A06.A23().A01(), null, this.A0U);
        this.A0T.getCTAButton().setIsInAppBrowser(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0k(C3Q c3q) {
        if (this.A0X.getState() == EnumC2599eU.A02 && U7.A1Z(this.A0Q)) {
            postDelayed(new GM(this, c3q), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0l(String str) {
        XP.A0H(this.A06);
        H0 h02 = new H0(this);
        if (this.A0Q.A0E() == null) {
            this.A0Q.A0F().A9n();
        }
        this.A06 = (U8.A02(this.A0Q) || this.A0Q.A0E() == null) ? new LJ(this.A0Q, h02) : new LJ(this.A0Q, this.A0Q.A0E(), h02);
        setUpBrowserControls(this.A06);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 0.9f;
        this.A03.addView(this.A06, layoutParams);
        this.A06.loadUrl(str);
    }

    private void A0m(String str) {
        Map<String, String> mapA05 = new C2314Zp().A03(null).A02(null).A05();
        mapA05.put(A0I(0, 12, 95), str);
        this.A0R.A04(UZ.A0J, mapA05);
        super.A0B.A4b(super.A06.A0r());
        super.A08.AB8(super.A06.A25(), mapA05);
        if (U7.A2N(this.A0Q)) {
            HashMap map = new HashMap();
            map.put(AbstractC2848im.A04, Boolean.TRUE.toString());
            map.put(AbstractC2848im.A05, Boolean.TRUE.toString());
            map.put(AbstractC2848im.A06, Boolean.TRUE.toString());
            super.A08.ABH(super.A06.A25(), map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0n(String str) {
        if (super.A06.A1w() <= 0) {
            if (super.A06.A1V()) {
                A0M();
            }
        } else {
            if (super.A06.A2E() && this.A0D) {
                return;
            }
            this.A0D = true;
            A0m(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0o(String str) {
        if (this.A0B) {
            return;
        }
        this.A0T.getCTAButton().A0E(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0p(boolean z10) {
        if (z10 || !this.A0i || this.A0H) {
            this.A0B = z10;
            if (z10) {
                this.A01 = 0;
                this.A0E = false;
                this.A0D = false;
            } else {
                this.A0M.removeCallbacksAndMessages(null);
            }
            LinearLayout linearLayout = this.A03;
            float y10 = this.A03.getY();
            float heightPixels = getHeightPixels();
            if (z10) {
                heightPixels /= 4.0f;
            }
            String strA0I = A0I(81, 1, 109);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout, strA0I, y10, heightPixels);
            objectAnimatorOfFloat.setDuration(500L);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.A0X, strA0I, this.A0X.getY(), 0.0f);
            objectAnimatorOfFloat2.setDuration(500L);
            int height = this.A0X.getHeight();
            int heightPixels2 = getHeightPixels();
            String[] strArr = A0l;
            if (strArr[6].charAt(0) != strArr[7].charAt(0)) {
                A0l[5] = "hP3GfijwEBNiA0lImhN0Ztc18yymbB1X";
                if (z10) {
                    heightPixels2 /= 4;
                }
                ValueAnimator duration = ValueAnimator.ofInt(height, heightPixels2).setDuration(500L);
                duration.addUpdateListener(new C2467cK(this));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
                animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, duration);
                animatorSet.addListener(new C2468cL(this, z10));
                if (this.A0j) {
                    this.A0X.A0f(animatorSet, z10);
                }
                A0r(this.A0B, true);
                if (z10 || this.A06 == null) {
                    return;
                }
                LJ lj2 = this.A06;
                String[] strArr2 = A0l;
                if (strArr2[1].charAt(10) == strArr2[2].charAt(10)) {
                    A0l[5] = "eIqgt8tvAdbgJnV9sUYYUdNCze8JLL17";
                    lj2.destroy();
                    return;
                }
            }
            throw new RuntimeException();
        }
    }

    private void A0q(boolean z10, int i10) {
        this.A0Q.A0F().ABc(!z10, i10);
        if (this.A04 != null) {
            ZH zh2 = this.A04;
            if (A0l[5].charAt(30) != '1') {
                throw new RuntimeException();
            }
            String[] strArr = A0l;
            strArr[1] = "o7aXPQIkUGrcx1dZHr3fchF7eoR8nmh6";
            strArr[2] = "r1oqCm6AtkrDXyXzUZY25jylGRvSX4IA";
            zh2.setCloseButtonVisibility(z10 ? 0 : 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0r(boolean z10, boolean z11) {
        if (this.A0J) {
            int i10 = getResources().getConfiguration().orientation;
            if (z10) {
                A0Z(this.A0X, this.A0X.getVideoView(), this.A0S, i10);
                return;
            }
            if (!z11) {
                A0X(this.A0X, this.A0X.getVideoView(), i10);
                return;
            }
            E1 e12 = this.A0X;
            E1 e13 = this.A0X;
            String[] strArr = A0l;
            if (strArr[6].charAt(0) == strArr[7].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0l;
            strArr2[6] = "obEiGvqtCCvFNuJUlwIyPJMxkodqaQ5K";
            strArr2[7] = "nJocAzrRDHwRQikLytOPP2BE8QGdYkmy";
            A0Y(e12, e13.getVideoView(), this.A0S, i10);
        }
    }

    private final boolean A0s() {
        return this.A0B;
    }

    public static boolean A0t(float f10) {
        return f10 <= 0.7f;
    }

    public static boolean A0u(float f10) {
        return f10 >= 1.2f;
    }

    private int getHeightPixels() {
        return getResources().getDisplayMetrics().heightPixels;
    }

    private KE getRegularCtaForEndCard() {
        KE ke2 = new KE(this.A0Q, super.A06.A0r(), super.A06.A1z().A01(), super.A08, super.A0B, (C2602eX) null, super.A0A, super.A06.A21());
        ke2.setViewShowsOverMedia(true);
        XP.A0I(ke2);
        ke2.setText(super.A06.A20().A0J().A04());
        XP.A0E(1001, ke2);
        ke2.setCta(super.A06.A20().A0J(), super.A06.A25(), new HashMap(), null);
        return ke2;
    }

    private void setUpBrowserControls(LJ lj2) {
        if (this.A04 != null) {
            XP.A0H(this.A04);
        }
        this.A04 = new ZH(this.A0Q, lj2, true);
        if (this.A0i) {
            A0q(this.A0H, 1);
        }
        lj2.setBrowserNavigationListener(this.A04.getBrowserNavigationListener());
        XP.A0I(this.A04);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(A0r, A0r, A0r, A0r);
        this.A04.setListener(new C1834Gu(this));
        this.A03.addView(this.A04, layoutParams);
        if (this.A05 != null) {
            XP.A0H(this.A05);
        }
        this.A05 = new ZP(this.A0Q, null, R.attr.progressBarStyleHorizontal);
        this.A03.addView(this.A05, new LinearLayout.LayoutParams(-1, A0m));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1856Hr
    public final ME A1A(String str) {
        return !A0s() ? this.A08 != null ? this.A08.A0B().A0E(str) : this.A0T.getCTAButton().A0E(str) : ME.A09;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1856Hr
    public final void A1B() {
        A0N();
        this.A0N.removeCallbacksAndMessages(null);
        if (U7.A1u(this.A0Q)) {
            this.A0Q.A0B().AJj(this.A0X);
        }
        if (this.A0W != null) {
            this.A0W.A07();
        }
        if (this.A0X != null) {
            this.A0X.getEventBus().A04(this.A0d, this.A0c, this.A0b, this.A0e, this.A0Z, this.A0a);
            XP.A0F(this.A0X);
            this.A0X.A0Z();
        }
        this.A0Y.A0p();
        View[] viewArr = {this.A0X, this.A0g, this.A0f};
        if (A0l[4].charAt(14) != 'r') {
            throw new RuntimeException();
        }
        A0l[5] = "x5K1WC5ur1IImcKdsfSp5hTLdY49e91C";
        XP.A0Z(viewArr);
        super.A0D.A0V();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1856Hr
    public final void A1D() {
        this.A0G = true;
        this.A0T.A0j();
        XP.A0Z(this.A0X, this.A0T, this.A0g, this.A04, this.A0f, this.A03, this.A0S);
        XP.A0R(this);
        if (this.A02 != null) {
            this.A02.setVisibility(0);
        }
        A0J();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        layoutParams.setMargins(A0q, A0p, 0, 0);
        addView(this.A0S, layoutParams);
        this.A0S.bringToFront();
        this.A0A = true;
        this.A0V.AFE(true);
        if (this.A0S == null || getAdDataBundle().A20().A0K().A00() <= 0) {
            return;
        }
        this.A0A = false;
        if (getAdDataBundle().A2G()) {
            this.A0S.setToolbarActionMode(8);
        } else {
            this.A0S.setToolbarActionMode(2);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC2469cM(this), getAdDataBundle().A20().A0K().A00());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1856Hr
    public final void A1E() {
        this.A0X.setVolume(super.A06.A20().A0H().A0A() ? 0.0f : 1.0f);
        this.A0X.A0h(EnumC2545db.A02, 20);
        int iA02 = super.A06.A20().A0H().A02();
        if (iA02 == 0 || iA02 >= this.A0L) {
            this.A0S.setToolbarActionMode(8);
        } else if (iA02 > 0) {
            this.A0S.setProgressSpinnerInvisible(true);
            new C2226Wd(iA02, new GW(this)).A07();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1856Hr
    public final void A1F(boolean z10) {
        this.A0H = z10;
        A0q(z10, 4);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1856Hr
    public final void A1G(boolean z10) {
        if (this.A0X.A0q()) {
            return;
        }
        this.A09 = this.A0X.getVideoStartReason();
        this.A0I = z10;
        this.A0X.A0l(false, 13);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1856Hr
    public final void A1H(boolean z10) {
        if (this.A0X.getState() == EnumC2599eU.A06 || this.A09 == null) {
            return;
        }
        if (!this.A0I || z10) {
            E1 e12 = this.A0X;
            EnumC2545db enumC2545db = this.A09;
            String[] strArr = A0l;
            if (strArr[3].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0l;
            strArr2[1] = "9WZdaf1ZSKrkBdUpSM4gGNVox8spVJjj";
            strArr2[2] = "I46V5u0Uk9rGg82Mpkl9CB9pMmc46Jha";
            e12.A0h(enumC2545db, 19);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1856Hr
    public final boolean A1I() {
        if (super.A06.A20().A0V() && super.A06.A20().A0K().A04()) {
            boolean z10 = this.A0G;
            if (A0l[4].charAt(14) != 'r') {
                throw new RuntimeException();
            }
            String[] strArr = A0l;
            strArr[1] = "C2SzQuWg94rP8CljhRH7nkSf4iQhtgDx";
            strArr[2] = "CARYfrdNq1rie86wRQdSwAxjb6sfTLqG";
            if (!z10) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1856Hr
    public final boolean A1J() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1856Hr
    public final boolean A1K() {
        return this.A0A;
    }

    public final boolean A1L() {
        return !A0s();
    }

    public C1992My getColors() {
        return this.A0P;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1856Hr
    public C2474cR getFullScreenAdStyle() {
        return new C2474cR(true, C2474cR.A06, super.A06.A1z().A01(), KE.A05(super.A06), super.A06.A1z().A01().A08(true), super.A06.A20().A0H().A08());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1856Hr, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A0G) {
            return;
        }
        A0V(configuration.orientation);
        A0r(this.A0B, false);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            A1H(false);
        } else {
            A1G(false);
        }
    }
}
