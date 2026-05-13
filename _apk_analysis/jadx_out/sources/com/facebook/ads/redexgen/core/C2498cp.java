package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2498cp extends FrameLayout {
    public static final int A08 = (int) (AbstractC2232Wl.A02 * 16.0f);
    public C15685y A00;
    public EG A01;
    public C15003i A02;
    public D1 A03;
    public C14812p A04;
    public C2R A05;
    public final C2529dL A06;
    public final C2172Ua A07;

    public C2498cp(C2529dL c2529dL, C2172Ua c2172Ua) {
        super(c2529dL);
        this.A07 = c2172Ua;
        this.A06 = c2529dL;
        setUpView(c2529dL);
    }

    private void setUpPlugins(C2529dL c2529dL) {
        A0b();
        this.A04 = new C14812p(c2529dL);
        A0i(this.A04);
        this.A03 = new D1(c2529dL, this.A07);
        A0i(new C3D(c2529dL));
        A0i(this.A03);
        this.A05 = new C2R(c2529dL, true, this.A07);
        A0i(this.A05);
        A0i(new D4(this.A05, EnumC2560dr.A02, true, true));
        if (A0n()) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            layoutParams.setMargins(A08, A08, A08, A08);
            this.A03.setLayoutParams(layoutParams);
            addView(this.A03);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.5y] */
    private void setUpVideo(final C2529dL c2529dL) {
        this.A00 = new E1(c2529dL) { // from class: com.facebook.ads.redexgen.X.5y
            @Override // android.widget.RelativeLayout, android.view.View
            public final void onMeasure(int i10, int i11) {
                if (View.MeasureSpec.getMode(i10) == 1073741824) {
                    i11 = i10;
                } else if (View.MeasureSpec.getMode(i11) == 1073741824) {
                    i10 = i11;
                }
                super.onMeasure(i10, i11);
            }
        };
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        XP.A0I(this.A00);
        addView(this.A00);
        setOnClickListener(new ViewOnClickListenerC2497co(this));
    }

    private void setUpView(C2529dL c2529dL) {
        setUpVideo(c2529dL);
        setUpPlugins(c2529dL);
    }

    public final void A01() {
        A0l(true, 10);
    }

    public final void A02() {
        if (this.A01 != null) {
            this.A01.A07();
            this.A01 = null;
        }
        if (this.A02 != null) {
            this.A02.A0p();
            this.A02 = null;
        }
    }

    public final void A03(AbstractC2152Tf abstractC2152Tf) {
        getEventBus().A05(abstractC2152Tf);
    }

    public final void A04(US us2, String str, Map<String, String> map) {
        A02();
        this.A02 = new C15003i(this.A06, us2, this.A00, str, null, map);
        if (U7.A1v(this.A06)) {
            this.A01 = new EG(this.A06, us2, this.A00, str, false, this.A02, map);
        } else {
            this.A01 = null;
        }
    }

    public final void A05(EnumC2545db enumC2545db) {
        A0h(enumC2545db, 13);
    }

    public final boolean A06() {
        return A0s();
    }

    public E1 getSimpleVideoView() {
        return this.A00;
    }

    public float getVolume() {
        return getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.A04.setImage(str);
    }

    public void setVideoURI(String str) {
        setVideoURI(str);
    }

    public void setVolume(float f10) {
        setVolume(f10);
        this.A03.A09();
    }
}
