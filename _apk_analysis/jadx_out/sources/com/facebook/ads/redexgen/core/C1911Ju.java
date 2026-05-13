package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ju, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1911Ju extends AbstractC2363ae implements Wf {
    public static byte[] A03;
    public static String[] A04 = {"jViytUMb8W4ggVUJxJM4ipopCTL5", "9aLNfhHGIgyW1yw0lAvb2knTk6C61HAs", "tSRmVjXXTSnTtzrce7INiQjRTYiInlbV", "4hcdJiGUQmFME9vgh87fiTmYWHBJid0b", "Sl93MFe7LYTqHCUKgRBPFfcYUFdC2Wx2", "6CReOOSeiw7R4vGYWPFAi839J8MszZAI", "rkSedGSxOJTtoP7gEY2R8PFp4jzzUrYJ", "HZKY5YyrBfN27m9O42YnVDeAUeo6GkfS"};
    public final AbstractC2804hy A00;
    public final C2228Wh A01;
    public final InterfaceC2260Xn A02;

    static {
        A01();
    }

    public C1911Ju(C2367ai c2367ai, boolean z10) {
        super(c2367ai, true);
        this.A02 = c2367ai.A0D();
        this.A00 = c2367ai.A05();
        RelativeLayout relativeLayout = new RelativeLayout(c2367ai.A06());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        XP.A0P(relativeLayout, getAdContextWrapper());
        LinearLayout linearLayout = new LinearLayout(c2367ai.A06());
        linearLayout.setOrientation(!z10 ? 1 : 0);
        linearLayout.setGravity(80);
        XP.A0I(linearLayout);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(AbstractC2363ae.A07, 0, AbstractC2363ae.A07, AbstractC2363ae.A07);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(z10 ? -2 : -1, -2);
        layoutParams3.setMargins(z10 ? AbstractC2363ae.A07 : 0, z10 ? 0 : AbstractC2363ae.A07, 0, 0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(z10 ? 0 : -1, -2);
        layoutParams4.setMargins(0, 0, 0, 0);
        layoutParams4.weight = 1.0f;
        linearLayout.addView(getTitleDescContainer(), layoutParams4);
        this.A01 = C2228Wh.A00(c2367ai.A06(), this.A00, this);
        C2227Wg c2227WgA02 = this.A01.A02(this.A00);
        c2367ai.A06().A0H().A00(c2227WgA02.A01);
        if (c2367ai.A0I() && !z10) {
            C2495cm c2495cm = new C2495cm(c2367ai.A06());
            c2495cm.setPageDetails(c2367ai.A05().A23());
            int iA05 = this.A06.A05().A1z().A00().A05(true);
            c2495cm.A02(iA05, iA05);
            XP.A0E(1007, c2495cm);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams5.setMargins(0, AbstractC2363ae.A07, 0, 0);
            linearLayout.addView(c2495cm, layoutParams5);
            if (U7.A18(c2367ai.A06())) {
                c2495cm.setOnClickListener(getCtaButton());
            }
        }
        linearLayout.addView(getCtaButton(), layoutParams3);
        relativeLayout.addView(linearLayout, layoutParams2);
        getCtaButton().A0F(c2367ai.A05(), c2367ai.A0C());
        View viewA02 = c2367ai.A02();
        if (viewA02 != null && (c2227WgA02.A00 || U7.A1I(getAdContextWrapper()))) {
            FrameLayout.LayoutParams layoutParams6 = z10 ? new FrameLayout.LayoutParams(-2, -1) : new FrameLayout.LayoutParams(-1, -2);
            layoutParams6.gravity = 17;
            FrameLayout frameLayout = new FrameLayout(c2367ai.A06());
            frameLayout.addView(viewA02, layoutParams6);
            addView(frameLayout, new RelativeLayout.LayoutParams(-1, -1));
            getCtaButton().setCreativeAsCtaLoggingHelper(this.A01);
            if (c2227WgA02.A00) {
                viewA02.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.aa
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.A00.A1O(view);
                    }
                });
            } else {
                AbstractC2317Zs.A00(viewA02, U7.A1J(getAdContextWrapper()), new ViewOnClickListenerC2360ab(this));
            }
        } else if (viewA02 != null) {
            addView(viewA02, new RelativeLayout.LayoutParams(-1, -1));
        }
        addView(relativeLayout, layoutParams);
        if (U7.A17(c2367ai.A06())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            if (c2367ai.A0C() != null) {
                c2367ai.A0C().setCTAClickListener(getCtaButton());
            }
        }
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A04[0].length() != 28) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[1] = "P3g3yiO3ICi92ZTGqQIjITPfAPWFUEMm";
            strArr[2] = "pyBqNmisWoZkDTGCi8bHuToayw1uFlPn";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 78);
            i13++;
        }
    }

    public static void A01() {
        A03 = new byte[]{64, 68, 72, 78, 76};
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2363ae
    public final void A1B() {
        super.A1B();
        this.A01.A03();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2363ae
    public final void A1G(C1983Mp c1983Mp, String str, double d10, Bundle bundle) {
        super.A1G(c1983Mp, str, d10, bundle);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2363ae
    public final boolean A1M() {
        return true;
    }

    public final /* synthetic */ void A1O(View view) {
        getCtaButton().A0E(A00(0, 5, 103));
    }
}
