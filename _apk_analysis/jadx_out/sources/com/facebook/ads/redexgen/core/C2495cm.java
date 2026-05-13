package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2495cm extends LinearLayout {
    public static final int A04 = (int) (AbstractC2232Wl.A02 * 32.0f);
    public static final int A05 = (int) (AbstractC2232Wl.A02 * 8.0f);
    public TextView A00;
    public TextView A01;
    public C2343aK A02;
    public final C2529dL A03;

    public C2495cm(C2529dL c2529dL) {
        super(c2529dL);
        this.A03 = c2529dL;
        A00(c2529dL);
    }

    private final void A00(C2529dL c2529dL) {
        setGravity(16);
        this.A02 = new C2343aK(c2529dL);
        this.A02.setFullCircleCorners(true);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A04, A04);
        layoutParams.setMargins(0, 0, A05, 0);
        addView(this.A02, layoutParams);
        LinearLayout linearLayout = new LinearLayout(c2529dL);
        linearLayout.setOrientation(1);
        this.A00 = new TextView(c2529dL);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        XP.A0W(this.A00, true, 16);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setSingleLine(true);
        this.A01 = new TextView(c2529dL);
        XP.A0W(this.A01, false, 14);
        linearLayout.addView(this.A00);
        linearLayout.addView(this.A01);
        addView(linearLayout, layoutParams2);
    }

    public final void A01() {
        this.A02.setImageBitmap(null);
        this.A00.setText("");
        this.A01.setText("");
    }

    public final void A02(int i10, int i11) {
        this.A00.setTextColor(i10);
        this.A01.setTextColor(i11);
    }

    public void setPageDetails(N9 n92) {
        KZ kz = new KZ(this.A02, this.A03);
        kz.A05(A04, A04);
        kz.A07(n92.A01());
        this.A00.setText(n92.A02());
        this.A01.setText(n92.A03());
    }
}
