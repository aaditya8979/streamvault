package com.facebook.ads.redexgen.core;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.material.TextFieldImplKt;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2480cX extends LinearLayout {
    public LinearLayout A00;
    public String A01;
    public boolean A02;
    public final int A03;
    public final C2529dL A04;
    public final C2343aK A05;
    public final C2349aQ A06;
    public static String[] A07 = {"mO6OCzz183u1Bigulq5KeRnnu3UhUErY", "M8wuVwCqg47swjluxOTBwYkXCALJOS1f", "isO3a6yeUrEqJHaKmCFaV", "J8y0fQZRtVpgz1Itec1cmA3ue79eN13N", "z6IigVxY2j2waSprQRCf4749VcxJv5uz", "GG3OTiE6t7MwpY", "UBA0QA1YjTXejDlGkh9vREu7YbW4o1hK", "iNB15eFG13fee2"};
    public static final int A0A = (int) (AbstractC2232Wl.A02 * 16.0f);
    public static final int A0B = (int) (AbstractC2232Wl.A02 * 32.0f);
    public static final int A0C = (int) (AbstractC2232Wl.A02 * 16.0f);
    public static final int A09 = (int) (AbstractC2232Wl.A02 * 4.0f);
    public static final int A08 = (int) (AbstractC2232Wl.A02 * 72.0f);

    public C2480cX(C2478cV c2478cV) {
        super(c2478cV.A08);
        this.A02 = false;
        this.A01 = "";
        this.A04 = c2478cV.A08;
        this.A05 = new C2343aK(this.A04);
        this.A06 = new C2349aQ(this.A04, c2478cV.A01, true, false, true);
        this.A03 = c2478cV.A00;
        this.A02 = c2478cV.A05;
        this.A01 = c2478cV.A04;
        A03(c2478cV);
    }

    public /* synthetic */ C2480cX(C2478cV c2478cV, C1805Fr c1805Fr) {
        this(c2478cV);
    }

    private void A00() {
        A01(this.A05, TextFieldImplKt.AnimationDuration);
        A01(this.A06, 170);
        if (this.A00 != null) {
            A01(this.A00, 190);
        }
    }

    private void A01(View view, int i10) {
        view.setTranslationY(i10);
        view.setScaleY(0.75f);
        view.setScaleX(0.75f);
        view.animate().translationYBy(-i10).scaleX(1.0f).scaleY(1.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator(2.0f));
    }

    private void A02(C2478cV c2478cV) {
        if (TextUtils.isEmpty(c2478cV.A03)) {
            return;
        }
        this.A00 = new LinearLayout(getContext());
        this.A00.setGravity(17);
        int i10 = A0C / 2;
        if (this.A02) {
            i10 = 0;
        }
        this.A00.setPadding(A0C, i10, A0C, A0C / 2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, i10, 0, 0);
        TextView textView = new TextView(getContext());
        textView.setTextColor(-1);
        XP.A0W(textView, false, 16);
        textView.setText(c2478cV.A03);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        ImageView imageView = new ImageView(getContext());
        new KZ(imageView, this.A04).A04().A07(c2478cV.A02);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(A0A, A0A);
        layoutParams3.setMargins(0, 0, A0C / 2, 0);
        if (this.A02) {
            C2337aE c2337aE = new C2337aE(getContext(), 0, -1, XX.PLAYABLE_ICON);
            c2337aE.setLayoutParams(new LinearLayout.LayoutParams(A0B, A0B));
            this.A00.addView(c2337aE);
        } else {
            this.A00.addView(imageView, layoutParams3);
            this.A00.addView(textView, layoutParams2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(100.0f);
            gradientDrawable.setColor(469762047);
            XP.A0Q(this.A00, gradientDrawable);
        }
        View view = this.A00;
        String[] strArr = A07;
        if (strArr[5].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[0] = "6JdK2pyeEPUWkfGuYxPy07w26kgdYt9J";
        strArr2[1] = "5VEwQONd4c8VI19uC0Ib5tVL9YvIxUH6";
        addView(view, layoutParams);
    }

    private void A03(C2478cV c2478cV) {
        XP.A0K(this.A05, 0);
        this.A05.setRadius(50);
        if (this.A02) {
            this.A05.setRadius(A09);
        } else if (c2478cV.A06.A00() == EnumC1988Mu.A05) {
            this.A05.setFullCircleCorners(true);
        } else {
            C2343aK c2343aK = this.A05;
            int i10 = A09;
            String[] strArr = A07;
            if (strArr[5].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A07[2] = "avcxrBXnTsgV2I5Ie1k2l";
            c2343aK.setRadius(i10);
        }
        new KZ(this.A05, this.A04).A04().A07(c2478cV.A07.A01());
        this.A06.A04(c2478cV.A06.A0F(), c2478cV.A07.A03(), null, false, true);
        if (this.A02) {
            this.A06.getDescriptionTextView().setText(this.A01);
        } else {
            this.A06.getDescriptionTextView().setAlpha(0.8f);
        }
        this.A06.setAlignment(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A0C, 0, A0C / 2);
        addView(this.A05, new LinearLayout.LayoutParams(A08, A08));
        addView(this.A06, layoutParams);
        A02(c2478cV);
        XP.A0K(this, -14473425);
        setGravity(17);
        setOrientation(1);
    }

    public final void A04(InterfaceC2479cW interfaceC2479cW) {
        A00();
        postDelayed(new C1805Fr(this, interfaceC2479cW), this.A03);
    }
}
