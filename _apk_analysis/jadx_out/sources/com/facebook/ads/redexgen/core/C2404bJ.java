package com.facebook.ads.redexgen.core;

import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2404bJ extends FrameLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final KE A02;
    public static final int A05 = (int) (AbstractC2232Wl.A02 * 36.0f);
    public static final int A06 = (int) (AbstractC2232Wl.A02 * 36.0f);
    public static final int A03 = (int) (AbstractC2232Wl.A02 * 23.0f);
    public static final int A04 = (int) (AbstractC2232Wl.A02 * 3.0f);
    public static final int A07 = (int) (AbstractC2232Wl.A02 * 4.0f);

    public C2404bJ(C2529dL c2529dL, KE ke2, AbstractC2804hy abstractC2804hy, US us2, InterfaceC2260Xn interfaceC2260Xn, C2602eX c2602eX, XH xh2, C1992My c1992My, InterfaceC2329a4 interfaceC2329a4) {
        super(c2529dL);
        this.A00 = c1992My.A09(true);
        this.A01 = new RelativeLayout(c2529dL);
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        this.A01.setClickable(false);
        A01(c2529dL, abstractC2804hy.A20().A0J().A04());
        if (ke2 != null) {
            this.A02 = ke2;
        } else {
            this.A02 = new KE(c2529dL, abstractC2804hy.A0r(), (C1992My) null, us2, interfaceC2260Xn, c2602eX, xh2, abstractC2804hy.A21());
        }
        A03();
        this.A02.setCta(abstractC2804hy.A20().A0J(), abstractC2804hy.A25(), new HashMap(), interfaceC2329a4);
        this.A02.setIsInAppBrowser(true);
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
    }

    private void A00(C2529dL c2529dL, View view) {
        ImageView imageView = new ImageView(c2529dL);
        imageView.setImageBitmap(XY.A01(XX.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        imageView.setClickable(false);
        imageView.setColorFilter(this.A00);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A03, A03);
        imageView.setPadding(A04, A04, A04, A04);
        layoutParams.addRule(2, view.getId());
        layoutParams.addRule(14);
        this.A01.addView(imageView, layoutParams);
    }

    private void A01(C2529dL c2529dL, String str) {
        Button button = new Button(c2529dL);
        XP.A0I(button);
        button.setPadding(A06, 0, A06, 0);
        button.setText(str.toUpperCase(Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(Typeface.defaultFromStyle(1));
        XP.A0M(button, this.A00, A07);
        button.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, A05);
        layoutParams.addRule(12);
        layoutParams.addRule(14);
        this.A01.addView(button, layoutParams);
        A00(c2529dL, button);
    }

    public final ME A02(String str) {
        return this.A02.A0E(str);
    }

    public final void A03() {
        this.A02.setBackgroundColor(0);
        this.A02.setTextColor(0);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return this.A02.performClick();
    }

    public void setAutoClickTime(AbstractC2804hy abstractC2804hy, AbstractC2259Xm abstractC2259Xm) {
        this.A02.A0F(abstractC2804hy, abstractC2259Xm);
    }

    public void setCta(C1993Mz c1993Mz, String str, HashMap<String, String> map, InterfaceC2329a4 interfaceC2329a4) {
        this.A02.setCta(c1993Mz, str, map, interfaceC2329a4);
    }
}
