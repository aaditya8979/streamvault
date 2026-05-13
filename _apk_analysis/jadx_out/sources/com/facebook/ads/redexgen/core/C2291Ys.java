package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ys, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2291Ys extends LinearLayout {
    public final ImageView A00;
    public final LinearLayout A01;
    public final TextView A02;
    public static final int A05 = (int) (AbstractC2232Wl.A02 * 8.0f);
    public static final int A06 = (int) (((double) AbstractC2232Wl.A02) * 14.5d);
    public static final int A04 = (int) (AbstractC2232Wl.A02 * 20.0f);
    public static final LinearLayout.LayoutParams A03 = new LinearLayout.LayoutParams(-1, -2);

    public C2291Ys(C2529dL c2529dL) {
        super(c2529dL);
        this.A00 = new ImageView(c2529dL);
        this.A00.setColorFilter(-10459280);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A04, A04);
        layoutParams.gravity = 16;
        this.A00.setLayoutParams(layoutParams);
        this.A01 = new LinearLayout(c2529dL);
        this.A01.setOrientation(1);
        this.A01.setPadding(A05 * 2, 0, 0, 0);
        this.A01.setLayoutParams(A03);
        this.A02 = new TextView(c2529dL);
        XP.A0W(this.A02, true, 16);
        this.A02.setTextColor(-14934495);
        this.A01.addView(this.A02, A03);
        setOrientation(0);
        addView(this.A00);
        addView(this.A01);
    }

    public void setInfo(XX xx, String str, String str2) {
        this.A00.setImageBitmap(XY.A01(xx));
        this.A02.setText(str);
        if (TextUtils.isEmpty(str2)) {
            setPadding(0, A06, 0, A06);
            return;
        }
        TextView textView = new TextView(getContext());
        XP.A0W(textView, false, 14);
        textView.setTextColor(-10459280);
        textView.setText(str2);
        this.A01.addView(textView, A03);
        setPadding(0, A05, 0, A05);
    }
}
