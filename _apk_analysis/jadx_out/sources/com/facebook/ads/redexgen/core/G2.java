package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class G2 extends FrameLayout implements InterfaceC2261Xo {
    public boolean A00;
    public boolean A01;
    public final AbstractC2804hy A02;
    public final SF A03;
    public final C2529dL A04;
    public final US A05;
    public final C2172Ua A06;
    public final XH A07;
    public final AbstractC2259Xm A08;
    public final InterfaceC2260Xn A09;
    public final YY A0A;
    public final C2602eX A0B;
    public final XC A0C;
    public final AbstractC2601eW A0D;
    public static final int A0F = (int) (AbstractC2232Wl.A02 * 48.0f);
    public static final int A0G = (int) (AbstractC2232Wl.A02 * 64.0f);
    public static final RelativeLayout.LayoutParams A0E = new RelativeLayout.LayoutParams(-1, -1);

    public G2(C2529dL c2529dL, YY yy, US us2, AbstractC2804hy abstractC2804hy, SF sf2, InterfaceC2260Xn interfaceC2260Xn) {
        super(c2529dL);
        this.A01 = false;
        this.A0D = new G7(this);
        this.A07 = new XH();
        this.A00 = false;
        this.A04 = c2529dL;
        this.A0A = yy;
        this.A05 = us2;
        this.A02 = abstractC2804hy;
        this.A03 = sf2;
        this.A09 = interfaceC2260Xn;
        this.A06 = new C2172Ua(this.A02.A25(), this.A05);
        this.A0B = new C2602eX(this, 1, new WeakReference(this.A0D), this.A04);
        this.A0B.A0W(this.A02.A0i());
        this.A0B.A0X(this.A02.A0j());
        this.A08 = A0Z();
        this.A0C = new XC(this);
        this.A0C.A05(XB.A02);
        if (A0j() || Build.VERSION.SDK_INT < 35) {
            return;
        }
        setFitsSystemWindows(true);
    }

    private AbstractC2259Xm A0Z() {
        AbstractC2259Xm abstractC2259XmA0b = A0b();
        abstractC2259XmA0b.setFullscreen(true);
        int iA04 = this.A02.A20().A0H().A04();
        abstractC2259XmA0b.setPageDetails(this.A02.A23(), this.A02.A25(), iA04, this.A02.A24());
        abstractC2259XmA0b.A0A(this.A02.A1z().A01(), KE.A05(this.A02));
        if (this.A02.A20().A0H().A02() == 0) {
            this.A01 = true;
            abstractC2259XmA0b.setToolbarActionMode(8);
        } else if (iA04 < 0 && this.A02.A20().A0S()) {
            abstractC2259XmA0b.setToolbarActionMode(4);
        }
        if (this.A02.A20().A0H().A02() >= 0) {
            abstractC2259XmA0b.setProgressSpinnerInvisible(true);
        }
        abstractC2259XmA0b.setToolbarListener(new G3(this));
        return abstractC2259XmA0b;
    }

    private void A0a() {
        if (!this.A02.A20().A0W()) {
            A0f();
            return;
        }
        C2480cX c2480cXA0F = new C2478cV(this.A04, this.A02.A20().A0I(), this.A02.A23()).A0A(this.A02.A1z().A01()).A0F();
        AbstractC2174Uc.A04(c2480cXA0F, this.A06, UZ.A0U);
        addView(c2480cXA0F, A0E);
        c2480cXA0F.A04(new G5(this));
    }

    public abstract AbstractC2259Xm A0b();

    public final void A0c() {
        if (this.A00) {
            return;
        }
        this.A0B.A0U();
        this.A00 = true;
    }

    public final void A0d() {
        if (this.A08.getToolbarActionMode() == 8) {
            this.A08.setToolbarActionMode(2);
        }
        this.A02.A2B(false);
        this.A02.A20().A0M(-1);
    }

    public abstract void A0e();

    public abstract void A0f();

    public final void A0g(int i10, AbstractRunnableC2216Vt abstractRunnableC2216Vt, C1732Cw c1732Cw) {
        new C2226Wd(i10, new G6(this, i10, c1732Cw, abstractRunnableC2216Vt)).A07();
    }

    public abstract void A0h(R0 r02);

    public abstract boolean A0i();

    public abstract boolean A0j();

    @Override // com.facebook.ads.redexgen.core.InterfaceC2261Xo
    public final void AAl(Intent intent, Bundle bundle, R0 r02) {
        this.A09.A3x(this, A0E);
        A0h(r02);
        A0a();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2261Xo
    public final void AIB(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2261Xo
    public String getCurrentClientToken() {
        return this.A02.A25();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2261Xo
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (A0j() || Build.VERSION.SDK_INT < 35) {
            return;
        }
        setFitsSystemWindows(true);
    }

    public void onDestroy() {
        this.A0C.A03();
        if (TextUtils.isEmpty(this.A02.A25())) {
            return;
        }
        this.A05.AAt(this.A02.A25(), new C2314Zp().A03(this.A0B).A02(this.A07).A05());
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A07.A06(this.A04, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC2260Xn interfaceC2260Xn) {
    }

    public void setUpFullscreenMode(boolean z10) {
        this.A0C.A05(z10 ? XB.A03 : XB.A02);
    }
}
