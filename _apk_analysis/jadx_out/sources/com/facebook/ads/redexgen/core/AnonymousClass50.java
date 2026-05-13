package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.50, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass50 extends AbstractC1856Hr {
    public static String[] A09 = {"48gXxVXafINQx", "X9eHMFtmNxkudREV2ga0mL63IUwpVFyn", "fDHVKSg", "BJ3S", "6p1nQLD", "GwvdfXoW7Tkcgx6xI32", "XjSW5yJHqMwpzXQP1hTrWYHuzeodWOV3", "mLwcnNPCnn6Mi"};
    public static final RelativeLayout.LayoutParams A0A = new RelativeLayout.LayoutParams(-1, -1);
    public C2226Wd A00;
    public AbstractC2363ae A01;
    public C1732Cw A02;
    public final int A03;
    public final ImageView A04;
    public final C2172Ua A05;
    public final AbstractC2259Xm A06;
    public final InterfaceC2476cT A07;
    public final AtomicBoolean A08;

    public AnonymousClass50(C2529dL c2529dL, YY yy, int i10, US us2, AbstractC2804hy abstractC2804hy, InterfaceC2260Xn interfaceC2260Xn, AbstractC2259Xm abstractC2259Xm, C2172Ua c2172Ua, boolean z10, boolean z11, InterfaceC2476cT interfaceC2476cT, int i11, int i12) {
        super(c2529dL, yy, us2, abstractC2804hy, i10, z10, z11, interfaceC2260Xn, i12);
        this.A08 = new AtomicBoolean(false);
        this.A03 = i11;
        this.A07 = interfaceC2476cT;
        this.A04 = new ImageView(getContext());
        this.A06 = abstractC2259Xm;
        this.A05 = c2172Ua;
        if (abstractC2804hy.A1U()) {
            this.A02 = new C1732Cw(c2529dL, this.A03);
        }
        this.A04.setScaleType(ImageView.ScaleType.CENTER);
        this.A04.setAdjustViewBounds(true);
        new KZ(this.A04, c2529dL).A05(abstractC2804hy.A20().A0H().A00(), abstractC2804hy.A20().A0H().A01()).A06(new C1849Hj(this)).A07(abstractC2804hy.A20().A0H().A08());
        A08(c2529dL.getResources().getConfiguration().orientation);
    }

    private AbstractC2363ae A02(int i10) {
        if (this.A04.getParent() != null) {
            XP.A0H(this.A04);
        }
        boolean z10 = i10 != 2;
        C2366ah c2366ah = new C2366ah(super.A07, super.A08, this.A0B, super.A06, this.A04, this.A0D, this.A0A);
        c2366ah.A0K(this.A06.getToolbarHeight()).A0R(this.A06).A0J(i10).A0V(z10).A0U(super.A00).A0N(this.A05);
        if (this.A02 != null) {
            c2366ah.A0T(this.A02);
        }
        c2366ah.A0M(MI.A00(super.A07, super.A08, "", WQ.A00(super.A06.A20().A0J().A05()), new HashMap(), super.A06.A21()));
        c2366ah.A0S(this.A07);
        return AbstractC2364af.A00(c2366ah.A0W(), null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        if (this.A08.get()) {
            A1C();
        }
    }

    private void A08(int i10) {
        XP.A0H(this.A01);
        this.A01 = A02(i10);
        if (this.A01 instanceof JU) {
            ((JU) this.A01).setChildChainedAd(true);
        } else if (this.A01 instanceof C1883Is) {
            AbstractC2363ae abstractC2363ae = this.A01;
            String[] strArr = A09;
            if (strArr[1].charAt(0) != strArr[6].charAt(0)) {
                throw new RuntimeException();
            }
            A09[5] = "Sp2NSSouatJBlog5Q54";
            ((C1883Is) abstractC2363ae).setChildChainedAd(true);
        }
        addView(this.A01, 0, A0A);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1856Hr
    public final ME A1A(String str) {
        return this.A01.A1A(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1856Hr
    public final void A1B() {
        if (U7.A1u(super.A07)) {
            super.A07.A0B().AJj(this.A04);
        }
        if (this.A01 != null) {
            this.A01.A1B();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1856Hr
    public final void A1D() {
        if (!(this.A01 instanceof C1914Jx)) {
            if (this.A01 instanceof C1883Is) {
                ((C1883Is) this.A01).A1R(false);
                return;
            }
            return;
        }
        AbstractC2363ae abstractC2363ae = this.A01;
        String[] strArr = A09;
        if (strArr[7].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        A09[3] = "fHRV";
        ((C1914Jx) abstractC2363ae).A1O();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1856Hr
    public final void A1E() {
        int iA02 = super.A06.A20().A0H().A02();
        if (this.A03 <= 0) {
            this.A07.AFE(false);
            return;
        }
        this.A00 = new C2226Wd(this.A03, 100.0f, 100L, new Handler(Looper.getMainLooper()), new HV(this));
        this.A00.A07();
        if (iA02 >= 0) {
            this.A06.setProgressSpinnerInvisible(true);
        }
        if (iA02 == 0 || iA02 >= this.A03) {
            this.A06.setToolbarActionMode(8);
        } else if (iA02 > 0) {
            new C2226Wd(iA02, new HS(this)).A07();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1856Hr
    public final void A1F(boolean z10) {
        this.A01.setChainedWatchAndBrowseSkippableStatus(z10);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1856Hr
    public final void A1G(boolean z10) {
        if (this.A00 == null || !this.A00.A05()) {
            return;
        }
        this.A00.A06();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1856Hr
    public final void A1H(boolean z10) {
        if (this.A00 == null || this.A00.A04()) {
            return;
        }
        this.A00.A07();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1856Hr
    public final boolean A1I() {
        if (!this.A01.A1K()) {
            return false;
        }
        if (!(this.A01 instanceof C1914Jx) || ((C1914Jx) this.A01).A1P()) {
            return (this.A01 instanceof C1883Is) && !((C1883Is) this.A01).A1T();
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1856Hr
    public final boolean A1J() {
        if (this.A01 instanceof C1914Jx) {
            return ((C1914Jx) this.A01).A1P();
        }
        boolean z10 = this.A01 instanceof C1883Is;
        String[] strArr = A09;
        if (strArr[1].charAt(0) != strArr[6].charAt(0)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[2] = "VUX6Wbk";
        strArr2[4] = "Kq1l7t9";
        if (z10) {
            return ((C1883Is) this.A01).A1T();
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1856Hr
    public final boolean A1K() {
        if (this.A01 instanceof C1914Jx) {
            return ((C1914Jx) this.A01).A1Q();
        }
        if (this.A01 instanceof C1883Is) {
            return ((C1883Is) this.A01).A1U();
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1856Hr
    public C2474cR getFullScreenAdStyle() {
        C1992My colors = this.A01.getColors();
        return new C2474cR(this.A01.A1M(), C2474cR.A07, colors, KE.A05(super.A06), colors.A08(this.A01.A1M() || (this.A01 instanceof AbstractC1913Jw)), null);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1856Hr, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A01 instanceof C1914Jx) {
            this.A01.onConfigurationChanged(configuration);
        } else {
            if (super.A06.A20().A0T()) {
                return;
            }
            A08(configuration.orientation);
        }
    }
}
