package com.facebook.ads.redexgen.core;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1906Jp extends AbstractC2363ae implements Wf {
    public static byte[] A05;
    public static final int A06;
    public final AbstractC2804hy A00;
    public final C2228Wh A01;
    public final InterfaceC2260Xn A02;
    public final C2395bA A03;
    public final C2495cm A04;

    static {
        A01();
        A06 = Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public C1906Jp(C2367ai c2367ai, boolean z10) {
        int id2;
        int iA01;
        super(c2367ai, z10);
        this.A02 = c2367ai.A0D();
        this.A00 = c2367ai.A05();
        this.A03 = new C2395bA(c2367ai.A06(), c2367ai.A02());
        this.A03.A01(getTitleDescContainer(), z10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(AbstractC2363ae.A07, AbstractC2363ae.A07, AbstractC2363ae.A07, AbstractC2363ae.A07);
        getCtaButton().setLayoutParams(layoutParams);
        if (c2367ai.A0I()) {
            this.A04 = new C2495cm(c2367ai.A06());
            this.A04.setPageDetails(c2367ai.A05().A23());
            XP.A0E(1007, this.A04);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(2, getCtaButton().getId());
            layoutParams2.setMargins(AbstractC2363ae.A07, AbstractC2363ae.A07 - (AbstractC2363ae.A07 / 2), AbstractC2363ae.A07, 0);
            this.A04.setLayoutParams(layoutParams2);
            id2 = this.A04.getId();
            iA01 = c2367ai.A01() - (AbstractC2363ae.A07 / 2);
        } else {
            id2 = getCtaButton().getId();
            iA01 = c2367ai.A01();
            this.A04 = null;
        }
        FrameLayout frameLayout = new FrameLayout(c2367ai.A06());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.addRule(10);
        layoutParams3.addRule(2, id2);
        layoutParams3.setMargins(0, iA01, 0, 0);
        frameLayout.setLayoutParams(layoutParams3);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams4.gravity = 17;
        layoutParams4.setMargins(AbstractC2363ae.A07, 0, AbstractC2363ae.A07, 0);
        frameLayout.addView(this.A03, layoutParams4);
        addView(frameLayout);
        if (this.A04 != null) {
            addView(this.A04);
        }
        addView(getCtaButton());
        getCtaButton().A0F(c2367ai.A05(), c2367ai.A0C());
        View viewA02 = c2367ai.A02();
        this.A01 = C2228Wh.A00(c2367ai.A06(), this.A00, this);
        C2227Wg c2227WgA02 = this.A01.A02(this.A00);
        c2367ai.A06().A0H().A00(c2227WgA02.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(this.A01);
        if (viewA02 != null && c2227WgA02.A00) {
            viewA02.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.ao
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.A00.A1O(view);
                }
            });
        } else if (viewA02 != null && U7.A1I(getAdContextWrapper())) {
            AbstractC2317Zs.A00(viewA02, U7.A1J(getAdContextWrapper()), new ViewOnClickListenerC2374ap(this));
        }
        if (U7.A17(c2367ai.A06())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            if (c2367ai.A0C() != null) {
                c2367ai.A0C().setCTAClickListener(getCtaButton());
            }
        }
        if (this.A04 == null || !U7.A18(c2367ai.A06())) {
            return;
        }
        this.A04.setOnClickListener(getCtaButton());
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 86);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{38, ExifInterface.START_CODE, 30, 36, 34};
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2363ae
    public final boolean A0C() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2363ae
    public final boolean A0D() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2363ae
    public final void A1B() {
        super.A1B();
        this.A01.A03();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2363ae
    public final void A1G(C1983Mp c1983Mp, String str, double d10, Bundle bundle) {
        super.A1G(c1983Mp, str, d10, bundle);
        if (d10 > 0.0d) {
            this.A03.A00((int) (((double) (A06 - (AbstractC2363ae.A07 * 2))) / d10));
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2363ae
    public final boolean A1M() {
        return false;
    }

    public final /* synthetic */ void A1O(View view) {
        getCtaButton().A0E(A00(0, 5, 103));
    }
}
