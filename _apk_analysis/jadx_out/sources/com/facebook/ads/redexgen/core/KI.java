package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class KI extends OE {
    public static byte[] A07;
    public static String[] A08 = {"YL1yLKFo15UZj59z8sTirpPX5rRsAE8", "O", "O6aHciR8nIcXgMvSQpLVacnv7HWgT320", "WCwGMxKVAM83NNo23MC3P4tNfApW0jy", "jLj4WTNtvai9N9Pzwov0sYarXBGRxB6J", "t8UiaIyNKCcrJZePb4XsdzT37H29Zzi", "ckjPU6sQ4thPoQS3sFeS4HnUH", ""};
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public final LinearLayout A00;
    public final RelativeLayout A01;
    public final AbstractC2804hy A02;
    public final C2529dL A03;
    public final US A04;
    public final XH A05;
    public final InterfaceC2260Xn A06;

    static {
        A03();
        A0C = (int) (OE.A08 * 12.0f);
        A0D = (int) (OE.A08 * 84.0f);
        A0B = (int) (OE.A08 * 14.0f);
        A09 = (int) (OE.A08 * 8.0f);
        A0A = OP.A02(-1, 77);
    }

    public KI(C2529dL c2529dL, AbstractC2804hy abstractC2804hy, US us2, InterfaceC2260Xn interfaceC2260Xn) {
        super(c2529dL);
        this.A05 = new XH();
        this.A03 = c2529dL;
        this.A02 = abstractC2804hy;
        this.A04 = us2;
        this.A06 = interfaceC2260Xn;
        this.A05.A05();
        setRadius(20.0f);
        setMaxCardElevation(75.0f);
        this.A01 = new RelativeLayout(c2529dL);
        AbstractC2350aR.A00(c2529dL, this.A01, abstractC2804hy.A20().A0H().A08());
        this.A00 = new LinearLayout(this.A03);
        this.A00.setOrientation(1);
        A02();
        A01();
        this.A01.addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 65);
        }
        return new String(bArrCopyOfRange);
    }

    private void A01() {
        KE ke2 = new KE(this.A03, EnumC2551dh.A04.A03(), this.A02.A1z().A01(), this.A02.A20().A0J().A06(), this.A04, this.A06, null, this.A05, this.A02.A21());
        ke2.setViewShowsOverMedia(true);
        XP.A0E(1001, ke2);
        ke2.setCta(this.A02.A20().A0J(), this.A02.A25(), new HashMap(), null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        ke2.setPadding(A0C, A0C, A0C, A0C);
        layoutParams.setMargins(A0C, A0C, A0C, A0C * 2);
        this.A00.addView(ke2, layoutParams);
    }

    private void A02() {
        RelativeLayout relativeLayout = new RelativeLayout(this.A03);
        C2343aK c2343aK = new C2343aK(this.A03);
        new KZ(c2343aK, this.A03).A05(A0D, A0D).A07(this.A02.A23().A01());
        c2343aK.setFullCircleCorners(true);
        XP.A0K(c2343aK, 0);
        XP.A0I(c2343aK);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0D, A0D);
        layoutParams.setMargins(A0C, A0C, A0C, A0C);
        layoutParams.addRule(14);
        relativeLayout.addView(c2343aK, layoutParams);
        TextView textView = new TextView(this.A03);
        XP.A0I(textView);
        textView.setTextColor(this.A02.A1z().A01().A07(true));
        textView.setText(this.A02.A20().A0I().A0F());
        textView.setGravity(17);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(14);
        layoutParams2.addRule(3, c2343aK.getId());
        relativeLayout.addView(textView, layoutParams2);
        LinearLayout linearLayout = new LinearLayout(this.A03);
        XP.A0I(linearLayout);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(A0C, 0, A0C, A0C);
        layoutParams3.addRule(14);
        layoutParams3.addRule(3, textView.getId());
        relativeLayout.addView(linearLayout, layoutParams3);
        C2345aM c2345aM = new C2345aM(this.A03, A0B, 5, A0A, -1);
        c2345aM.setGravity(16);
        linearLayout.addView(c2345aM, new LinearLayout.LayoutParams(-2, -1));
        TextView textView2 = new TextView(this.A03);
        textView2.setTextColor(this.A02.A1z().A01().A07(true));
        textView2.setGravity(16);
        textView2.setIncludeFontPadding(false);
        XP.A0W(textView2, false, 14);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams4.leftMargin = A09;
        linearLayout.addView(textView2, layoutParams4);
        if (TextUtils.isEmpty(this.A02.A20().A0I().A0B())) {
            String[] strArr = A08;
            if (strArr[3].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[4] = "pDxc6WlcrgExZnzDlKhHZoNjTSnAqRc0";
            strArr2[2] = "JfppCwNpdT1PFGKwLRSAK2lJbowaAIWW";
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            c2345aM.setRating(Float.parseFloat(this.A02.A20().A0I().A0B()));
            if (this.A02.A20().A0I().A08() != null) {
                textView2.setText(A00(0, 1, 116) + NumberFormat.getNumberInstance().format(Integer.parseInt(this.A02.A20().A0I().A08())) + A00(1, 1, 1));
            }
        }
        TextView textView3 = new TextView(this.A03);
        textView3.setTextColor(this.A02.A1z().A01().A07(true));
        textView3.setText(this.A02.A20().A0I().A04());
        textView3.setGravity(17);
        textView3.setPadding(A0C, A0C, A0C, A0C);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(14);
        layoutParams5.addRule(3, linearLayout.getId());
        relativeLayout.addView(textView3, layoutParams5);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams6.gravity = 4;
        layoutParams6.weight = 0.8f;
        this.A00.addView(relativeLayout, layoutParams6);
    }

    public static void A03() {
        A07 = new byte[]{29, 105};
    }
}
