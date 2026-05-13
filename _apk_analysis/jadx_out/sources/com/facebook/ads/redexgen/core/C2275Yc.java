package com.facebook.ads.redexgen.core;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2275Yc extends RelativeLayout {
    public final int A00;
    public final int A01;
    public final O2 A02;
    public final C2529dL A03;
    public final InterfaceC2278Yf A04;
    public final boolean A05;
    public static final int A09 = (int) (AbstractC2232Wl.A02 * 16.0f);
    public static final int A0A = (int) (AbstractC2232Wl.A02 * 8.0f);
    public static final int A0D = (int) (AbstractC2232Wl.A02 * 44.0f);
    public static final int A08 = (int) (AbstractC2232Wl.A02 * 10.0f);
    public static final int A07 = A09 - A08;
    public static final int A0E = (int) (AbstractC2232Wl.A02 * 75.0f);
    public static final int A0B = (int) (AbstractC2232Wl.A02 * 25.0f);
    public static final int A0F = (int) (AbstractC2232Wl.A02 * 45.0f);
    public static final int A0C = (int) (AbstractC2232Wl.A02 * 15.0f);
    public static final int A06 = (int) (AbstractC2232Wl.A02 * 16.0f);

    public C2275Yc(C2274Yb c2274Yb) {
        super(c2274Yb.A0C);
        this.A03 = c2274Yb.A0C;
        this.A02 = O3.A00(this.A03.A02());
        this.A04 = c2274Yb.A02;
        this.A01 = c2274Yb.A0B ? A0E : A0F;
        this.A00 = c2274Yb.A0B ? A0B : A0C;
        this.A05 = c2274Yb.A07;
        setFocusable(true);
        View viewA01 = A01(c2274Yb);
        View viewA00 = A00(c2274Yb);
        View footerView = getFooterView();
        XP.A0I(viewA01);
        XP.A0I(viewA00);
        XP.A0I(footerView);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(13);
        layoutParams2.addRule(3, viewA01.getId());
        layoutParams2.addRule(2, footerView.getId());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(12);
        layoutParams3.setMargins(A09, 0, A09, A09);
        addView(viewA01, layoutParams);
        addView(viewA00, layoutParams2);
        addView(footerView, layoutParams3);
        footerView.setVisibility(c2274Yb.A08 ? 0 : 8);
    }

    public /* synthetic */ C2275Yc(C2274Yb c2274Yb, YZ yz) {
        this(c2274Yb);
    }

    private View A00(C2274Yb c2274Yb) {
        ImageView imageView = new ImageView(getContext());
        imageView.setPadding(this.A00, this.A00, this.A00, this.A00);
        imageView.setImageBitmap(XY.A01(c2274Yb.A01));
        imageView.setColorFilter(-1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.A01, this.A01);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(c2274Yb.A00);
        XP.A0Q(imageView, gradientDrawable);
        layoutParams.gravity = 17;
        layoutParams.setMargins(A09, 0, A09, A09);
        TextView textView = new TextView(getContext());
        XP.A0W(textView, true, 20);
        textView.setTextColor(-14934495);
        textView.setText(c2274Yb.A06);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(A09, 0, A09, A09);
        TextView textView2 = new TextView(getContext());
        XP.A0W(textView2, false, 16);
        textView2.setTextColor(-10459280);
        textView2.setText(c2274Yb.A05);
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(A09, 0, A09, A09);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        linearLayout.addView(textView2, layoutParams3);
        if (c2274Yb.A09) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            if (!TextUtils.isEmpty(c2274Yb.A04)) {
                C2343aK c2343aK = new C2343aK(this.A03);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(A0F, A0F);
                layoutParams4.setMargins(0, 0, A0A, 0);
                c2343aK.setFullCircleCorners(true);
                new KZ(c2343aK, this.A03).A05(A0F, A0F).A07(c2274Yb.A04);
                linearLayout2.addView(c2343aK, layoutParams4);
            }
            C2280Yh c2280Yh = new C2280Yh(this.A03);
            c2280Yh.setData(c2274Yb.A03, XX.CHECKMARK);
            c2280Yh.setSelected(true);
            linearLayout2.addView(c2280Yh, new LinearLayout.LayoutParams(-2, -2));
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    private View A01(C2274Yb c2274Yb) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        if (c2274Yb.A0A) {
            ImageView imageView = new ImageView(getContext());
            imageView.setPadding(A08, A08, A08, A08);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageBitmap(XY.A01(XX.CROSS));
            imageView.setOnClickListener(new YZ(this));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A0D, A0D);
            layoutParams.setMargins(A07, A07, A07, A07);
            linearLayout.addView(imageView, layoutParams);
        }
        return linearLayout;
    }

    private View getFooterView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(XY.A01(XX.SETTINGS));
        imageView.setColorFilter(-13272859);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A06, A06);
        layoutParams.gravity = 17;
        TextView textView = new TextView(getContext());
        XP.A0W(textView, false, 16);
        textView.setTextColor(-13272859);
        textView.setPadding(A0A, A0A, A0A, A0A);
        textView.setText(this.A02.A0J());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new ViewOnClickListenerC2273Ya(this));
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }
}
