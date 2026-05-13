package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4H, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C4H extends G2 {
    public static byte[] A07;
    public static String[] A08 = {"opNTFb7MfNeLnBf1OFt8H8u3IMVbRu1d", "IWQCWQwp5ID5RPcOdaIzYqbwlbVDrClG", "KvkPuVSJhScWrt17epNc", "F0ODCmRg5uMMagWpVfR8fmvJ1OUGt5pq", "F5r", "wG3QjEZJL94bFBL8PiZK", "A8E1xGSXICDDUeWE8x490gS0hcqgXwJC", "2T9PYA9x4VF1QbksNYikemvLXt0jGXOu"};
    public AbstractC2363ae A00;
    public C1732Cw A01;
    public final ImageView A02;
    public final R6 A03;
    public final AtomicBoolean A04;
    public final AtomicBoolean A05;
    public final AtomicBoolean A06;

    static {
        A07();
    }

    public C4H(C2529dL c2529dL, YY yy, US us2, AbstractC2804hy abstractC2804hy, SF sf2, InterfaceC2260Xn interfaceC2260Xn) {
        super(c2529dL, yy, us2, abstractC2804hy, sf2, interfaceC2260Xn);
        this.A03 = new C1810Fw(this);
        this.A05 = new AtomicBoolean(false);
        this.A04 = new AtomicBoolean(false);
        this.A06 = new AtomicBoolean(false);
        this.A02 = new ImageView(getContext());
        if (abstractC2804hy.A20().A0H().A04() > 0) {
            this.A01 = new C1732Cw(c2529dL, abstractC2804hy.A20().A0H().A04() * 1000);
        }
        this.A02.setScaleType(ImageView.ScaleType.CENTER);
        this.A02.setAdjustViewBounds(true);
        new KZ(this.A02, super.A04).A05(super.A02.A20().A0H().A00(), super.A02.A20().A0H().A01()).A06(new C1809Fv(this)).A07(super.A02.A20().A0H().A08());
    }

    private AbstractC2363ae A01(int i10) {
        if (this.A02.getParent() != null) {
            XP.A0H(this.A02);
        }
        C2366ah c2366ahA0N = new C2366ah(super.A04, super.A05, this.A09, super.A02, this.A02, this.A0B, this.A07).A0K(this.A08.getToolbarHeight()).A0R(this.A08).A0J(i10).A0N(super.A06);
        if (this.A01 != null) {
            c2366ahA0N.A0T(this.A01);
        }
        c2366ahA0N.A0M(MI.A00(super.A04, super.A05, A03(0, 0, 52), WQ.A00(super.A02.A20().A0J().A05()), new HashMap(), super.A02.A21()));
        return AbstractC2364af.A00(c2366ahA0N.A0W(), null, true);
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 61);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06() {
        if (this.A05.get() && this.A04.get()) {
            A0c();
        }
    }

    public static void A07() {
        A07 = new byte[]{-17, -25, -27, -20};
    }

    private void A08(int i10) {
        XP.A0H(this.A00);
        this.A00 = A01(i10);
        this.A00.setAccidentalClickCappingListener(new MF() { // from class: com.facebook.ads.redexgen.X.Fx
            @Override // com.facebook.ads.redexgen.core.MF
            public final void ACB() {
                this.A00.A0k();
            }
        });
        C1992My colors = this.A00.getColors();
        XP.A0K(this, colors.A08(this.A00 != null && (this.A00.A1M() || (this.A00 instanceof AbstractC1913Jw))));
        this.A08.setFullscreen(this.A00.A1M());
        this.A08.A0A(colors, KE.A05(super.A02));
        addView(this.A00, 0, G2.A0E);
        setUpFullscreenMode(this.A00 != null && this.A00.A1M());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCloseButtonStyle() {
        if (this.A00 != null) {
            return this.A00.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.G2
    public final AbstractC2259Xm A0b() {
        AbstractC2259Xm fullScreenAdToolbar = !A0j() ? new FullScreenAdToolbar(super.A04, this.A09, super.A06, 1, super.A02.A1t(), super.A02.A1j()) : new C2011Nr(super.A04, this.A09, super.A06, 1);
        if (super.A02.A2K()) {
            fullScreenAdToolbar.setOnClickListener(new ViewOnClickListenerC2477cU(this));
        }
        return fullScreenAdToolbar;
    }

    @Override // com.facebook.ads.redexgen.core.G2
    public final void A0e() {
        if (this.A00 != null) {
            super.A06.A04(UZ.A0Y, null);
            ME meA1A = this.A00.A1A(A03(0, 4, 63));
            if (super.A02.A2D() || meA1A == ME.A09 || meA1A == ME.A06) {
                return;
            }
            A0d();
        }
    }

    @Override // com.facebook.ads.redexgen.core.G2
    public final void A0f() {
        XP.A0J(this.A00);
        XP.A0J(this.A08);
        this.A04.set(true);
        A06();
        int iA04 = super.A02.A20().A0H().A04();
        int iA02 = super.A02.A20().A0H().A02();
        if (iA04 <= 0) {
            this.A06.set(true);
            this.A08.setToolbarActionMode(getCloseButtonStyle());
            return;
        }
        if (this.A00 != null) {
            this.A00.A1F();
        }
        A0g(iA04, new C1808Fu(this), this.A01);
        if (iA02 == 0 || iA02 >= iA04) {
            super.A01 = true;
            this.A08.setToolbarActionMode(8);
        } else if (iA02 > 0) {
            this.A08.setProgressSpinnerInvisible(true);
            A0g(iA02, new C1807Ft(this), null);
        }
    }

    @Override // com.facebook.ads.redexgen.core.G2
    public final void A0h(R0 r02) {
        FrameLayout.LayoutParams layoutParams;
        r02.A0A(this.A03);
        A08(r02.A05().getResources().getConfiguration().orientation);
        if (A0j()) {
            XP.A0H(this.A08);
        }
        if (A0j()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, G2.A0F, 0, 0);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-1, this.A08.getToolbarHeight());
        }
        addView(this.A08, layoutParams);
        XP.A0F(this.A00);
        XP.A0F(this.A08);
    }

    @Override // com.facebook.ads.redexgen.core.G2
    public final boolean A0i() {
        if (this.A00 == null) {
            return false;
        }
        AbstractC2363ae abstractC2363ae = this.A00;
        if (A08[4].length() != 3) {
            throw new RuntimeException();
        }
        A08[4] = "kMg";
        return abstractC2363ae.A1N(false);
    }

    @Override // com.facebook.ads.redexgen.core.G2
    public final boolean A0j() {
        return super.A02.A1b() || super.A02.A1o();
    }

    public final /* synthetic */ void A0k() {
        A0d();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2261Xo
    public final void AEV(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2261Xo
    public final void AF0(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.core.G2, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (super.A02.A20().A0T() || A0j()) {
            return;
        }
        A08(configuration.orientation);
    }

    @Override // com.facebook.ads.redexgen.core.G2, com.facebook.ads.redexgen.core.InterfaceC2261Xo
    public final void onDestroy() {
        if (U7.A1u(super.A04)) {
            super.A04.A0B().AJj(this.A02);
        }
        if (this.A00 != null) {
            AbstractC2363ae abstractC2363ae = this.A00;
            String[] strArr = A08;
            if (strArr[6].charAt(10) != strArr[1].charAt(10)) {
                throw new RuntimeException();
            }
            A08[4] = "hIQ";
            abstractC2363ae.A1B();
        }
        super.onDestroy();
    }
}
