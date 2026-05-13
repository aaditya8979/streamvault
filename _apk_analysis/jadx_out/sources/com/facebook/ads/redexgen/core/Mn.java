package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Mn extends AbstractC2320Zv {
    public final TextView A00;
    public final TextView A01;
    public static final int A02 = (int) (AbstractC2232Wl.A02 * 36.0f);
    public static final int A05 = (int) (AbstractC2232Wl.A02 * 4.0f);
    public static final int A03 = (int) (AbstractC2232Wl.A02 * 8.0f);
    public static final int A04 = (int) (AbstractC2232Wl.A02 * 4.0f);

    public Mn(C2529dL c2529dL, int i10, C1992My c1992My, boolean z10, String str, US us2, InterfaceC2260Xn interfaceC2260Xn, C2602eX c2602eX, XH xh2, N3 n32) {
        super(c2529dL, null, i10, c1992My, z10, str, us2, interfaceC2260Xn, c2602eX, xh2, n32, false, "");
        setOrientation(0);
        setPadding(A05, A05, A05, A05);
        this.A01 = A01(-16448251, 13, true);
        this.A00 = A01(-10131605, 12, false);
        this.A06.addView(A00(i10), new LinearLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        addView(this.A06, layoutParams);
        this.A08.setPadding(A03, 0, A03, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, A02);
        layoutParams2.gravity = 17;
        addView(this.A08, layoutParams2);
    }

    private LinearLayout A00(int i10) {
        LinearLayout linearLayout = new LinearLayout(this.A07);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A04, 0, A04, 0);
        linearLayout.addView(this.A01, AbstractC2320Zv.A0B);
        linearLayout.addView(this.A00, AbstractC2320Zv.A0B);
        LinearLayout linearLayout2 = new LinearLayout(this.A07);
        linearLayout2.setOrientation(0);
        linearLayout2.addView(this.A09, new LinearLayout.LayoutParams(i10, i10));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        linearLayout2.addView(linearLayout, layoutParams);
        return linearLayout2;
    }

    private TextView A01(int i10, int i11, boolean z10) {
        TextView textView = new TextView(this.A07);
        textView.setTextColor(i10);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        XP.A0W(textView, z10, i11);
        return textView;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2320Zv
    public final void A0g() {
        super.A0g();
        setOnClickListener(this.A05);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2320Zv
    public final void A0h(int i10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2320Zv
    public void setInfo(C1990Mw c1990Mw, C1993Mz c1993Mz, String str, String str2, InterfaceC2242Wv interfaceC2242Wv, InterfaceC2329a4 interfaceC2329a4) {
        super.setInfo(c1990Mw, c1993Mz, str, str2, interfaceC2242Wv, interfaceC2329a4);
        this.A01.setText(c1990Mw.A0F());
        this.A00.setText(c1990Mw.A0E());
        if (TextUtils.isEmpty(c1993Mz.A04())) {
            XP.A0F(this.A08);
        }
    }
}
