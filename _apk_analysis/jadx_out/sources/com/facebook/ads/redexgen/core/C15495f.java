package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C15495f extends AbstractC1913Jw {
    public static byte[] A09;
    public static String[] A0A = {"nMDGU2nxSEuwqviL2VMZS1cV20s8AaeR", "qyrjSMh", "FYVwSD308Vq2J6Pd1wLxSNaB8Ewk", "LGl0Dyzmn7PlBKL5rOaUh0PbBfsCX6f3", "ZVJSN", "nXNa5aghoVBzvvHD5xAqaEYm1u0bLWjI", "m4Dqbt0aWRjh5FvtlMaj2POC", "Ux3XUTAXbpH3d88rNaPFFKJHhvK1Uu5c"};
    public float A00;
    public C2519dA A01;
    public boolean A02;
    public final Handler A03;
    public final View A04;
    public final RelativeLayout A05;
    public final RelativeLayout A06;
    public final AbstractC2259Xm A07;
    public final InterfaceC2260Xn A08;

    static {
        A06();
    }

    public C15495f(C2367ai c2367ai) {
        super(c2367ai, true);
        this.A03 = new Handler(Looper.getMainLooper());
        this.A02 = false;
        this.A08 = c2367ai.A0D();
        this.A07 = c2367ai.A0C();
        this.A06 = new RelativeLayout(c2367ai.A06());
        this.A05 = new RelativeLayout(c2367ai.A06());
        XP.A0I(this.A05);
        XP.A0I(this.A06);
        this.A04 = c2367ai.A02();
        A04();
        this.A06.addView(this.A05, new RelativeLayout.LayoutParams(-2, -2));
        addView(this.A06, new RelativeLayout.LayoutParams(-1, -1));
        AbstractC2350aR.A00(c2367ai.A06(), this.A06, getAdInfo().A0H().A08());
        A03();
        ((AbstractC2363ae) this).A06.A06().A0F().AJw(AbstractC2223Wa.A00(this.A00), getResources().getConfiguration().orientation, false, false, MH.A0C(((AbstractC2363ae) this).A06.A04()));
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 106);
        }
        return new String(bArrCopyOfRange);
    }

    private void A02() {
        XP.A0Z(this.A07, getAdDetailsView(), getCtaButton());
        this.A01 = new C2519dA(((AbstractC2363ae) this).A06.A06(), getAdDataBundle(), this.A08, getCtaButton(), this.A03, ((AbstractC2363ae) this).A06.A08());
        addView(this.A01.A0T(), new RelativeLayout.LayoutParams(-1, -1));
    }

    private void A03() {
        XP.A0H(getAdDetailsView());
        addView(getAdDetailsView(), new RelativeLayout.LayoutParams(-1, -1));
        getAdDetailsView().setVisibility(0);
        A07(getResources().getConfiguration().orientation);
        if (getAdDetailsView() instanceof KL) {
            ((KL) getAdDetailsView()).A0q(getResources().getConfiguration().orientation);
        }
    }

    private void A04() {
        if (this.A04 == null) {
            return;
        }
        this.A05.addView(this.A04, new RelativeLayout.LayoutParams(-2, -2));
        XP.A0I(this.A04);
        C2227Wg c2227WgA02 = this.A09.A02(getAdDataBundle());
        ((AbstractC2363ae) this).A06.A06().A0H().A00(c2227WgA02.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(this.A09);
        if (c2227WgA02.A00) {
            this.A04.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.ac
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.A00.A1W(view);
                }
            });
        } else if (U7.A1I(getAdContextWrapper())) {
            AbstractC2317Zs.A00(this.A04, U7.A1J(getAdContextWrapper()), new ViewOnClickListenerC2362ad(this));
        }
    }

    private void A05() {
        this.A0A.set(true);
        XP.A0R(this);
        XP.A0Z(this.A05, getAdDetailsView());
        XP.A0J(this.A07);
        A02();
        if (getAdInfo().A0K().A00() >= 0) {
            this.A02 = true;
            if (this.A07 != null) {
                this.A07.setToolbarActionMode(getAdDataBundle().A2G() ? 8 : 2);
                this.A07.setProgressImmediate(0.0f);
            }
            new C2226Wd((int) getAdInfo().A0K().A00(), 20.0f, 20L, new Handler(Looper.getMainLooper()), new C1910Jt(this)).A07();
        }
    }

    public static void A06() {
        A09 = new byte[]{112, 116, 120, 126, 124};
    }

    private void A07(int i10) {
        A08(i10);
        A1U(i10, this.A06, this.A05);
    }

    private void A08(int i10) {
        if (this.A04 == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A04.getLayoutParams();
        layoutParams.removeRule(13);
        layoutParams.removeRule(10);
        layoutParams.removeRule(9);
        if (i10 == 1) {
            layoutParams.width = -1;
            layoutParams.height = -2;
            layoutParams.addRule(10);
        } else {
            layoutParams.width = -2;
            layoutParams.height = -1;
            if (A0A(this.A00)) {
                layoutParams.addRule(13);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.A05.getLayoutParams();
                layoutParams2.addRule(14);
                this.A05.setLayoutParams(layoutParams2);
            } else {
                layoutParams.addRule(9);
            }
        }
        this.A04.setLayoutParams(layoutParams);
    }

    public static boolean A09(float f10) {
        return f10 <= 0.7f;
    }

    public static boolean A0A(float f10) {
        return f10 >= 1.2f;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2363ae
    public final boolean A0C() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2363ae
    public final boolean A0D() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1913Jw, com.facebook.ads.redexgen.core.AbstractC2363ae
    public final void A1B() {
        super.A1B();
        this.A03.removeCallbacksAndMessages(null);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1913Jw, com.facebook.ads.redexgen.core.AbstractC2363ae
    public final void A1G(C1983Mp c1983Mp, String str, double d10, Bundle bundle) {
        super.A1G(c1983Mp, str, d10, bundle);
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
        if (!getAdInfo().A0V() || this.A0A.get()) {
            return false;
        }
        A05();
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1913Jw
    public final AbstractC2320Zv A1P(C2367ai c2367ai, C1983Mp c1983Mp, String str) {
        this.A00 = new SF(c2367ai.A06()).A0M(c1983Mp.A0H().A08());
        if (A09(this.A00)) {
            return new C15605q(c2367ai.A06(), getCtaButton(), AbstractC1913Jw.A0I, false, getColors(), str, c2367ai.A07(), c2367ai.A0D(), c2367ai.A0G(), c2367ai.A0A(), c2367ai.A05(), c2367ai.A0F(), c2367ai.A08(), false);
        }
        float f10 = this.A00;
        if (A0A[7].charAt(11) == 'b') {
            throw new RuntimeException();
        }
        String[] strArr = A0A;
        strArr[4] = "qnLfq";
        strArr[1] = "ISSv4uo";
        return A0A(f10) ? new C15595p(c2367ai.A06(), getCtaButton(), AbstractC1913Jw.A0I, false, getColors(), str, c2367ai.A07(), c2367ai.A0D(), c2367ai.A0G(), c2367ai.A0A(), c2367ai.A05(), c2367ai.A0F(), c2367ai.A08(), false) : new C15615r(c2367ai.A06(), getCtaButton(), AbstractC1913Jw.A0I, false, getColors(), str, c2367ai.A07(), c2367ai.A0D(), c2367ai.A0G(), c2367ai.A0A(), c2367ai.A05(), c2367ai.A0F(), c2367ai.A08(), false);
    }

    public final /* synthetic */ void A1W(View view) {
        getCtaButton().A0E(A01(0, 5, 115));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2363ae
    public int getCloseButtonStyle() {
        if (this.A02) {
            return getAdDataBundle().A2G() ? 8 : 2;
        }
        if (!A1K() || this.A0A.get()) {
            return super.getCloseButtonStyle();
        }
        return 1;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1913Jw, com.facebook.ads.redexgen.core.AbstractC2363ae, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A01 == null || !this.A0A.get()) {
            A07(configuration.orientation);
        } else {
            this.A01.A0W(configuration.orientation);
        }
    }
}
