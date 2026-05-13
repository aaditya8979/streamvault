package com.facebook.ads.redexgen.core;

import android.widget.RelativeLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2330a6 {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.0g] */
    public static C14220g A00(final C2367ai c2367ai, final C2072Qc c2072Qc, final String str, final C15625s c15625s) {
        final boolean z10 = true;
        return new C15515h(c2367ai, c2072Qc, z10, str, c15625s) { // from class: com.facebook.ads.redexgen.X.0g
            public KE A00;
            public C2496cn A01;
            public final US A02 = this.A0I.A06().A02().A0A();
            public final C2072Qc A03;
            public final C15625s A04;
            public final String A05;
            public static String[] A06 = {"q", "A73Xi2G3GXsP7eqOYxzIEC2a49UqAHwv", "tzkKnItTrh", "5yGem34VUXIU78ICazF0QaKYuuceWMlm", "d26mhKEOwDnFCjn", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "vFFUszWLQFPwstqQ2PhnuKwIvdRc", "cQLhl1S6XoLnT945hQssVDVRJiee0FVC"};
            public static final int A08 = (int) (AbstractC2232Wl.A02 * (-4.0f));
            public static final int A07 = (int) (AbstractC2232Wl.A02 * 6.0f);

            {
                this.A03 = c2072Qc;
                this.A05 = str;
                this.A04 = c15625s;
                this.A03.A1L(this);
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC1882Ir
            public void setupNativeCtaExtension(C2496cn c2496cn) {
                this.A01 = c2496cn;
                int iA0Q = U7.A0Q(this.A0I.A06());
                C1992My c1992MyA01 = this.A03.A10().A1z().A01();
                this.A00 = new KE(this.A0I.A06(), this.A03.A10().A0r(), c1992MyA01, this.A02, C2301Zc.getDummyListener(), this.A04.A0b(), this.A03.A1A(), this.A03.A10() == null ? null : this.A03.A10().A21());
                this.A00.setCta(c2496cn.A03().A0J(), this.A05, new HashMap());
                this.A03.A1L(this.A00);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                if (iA0Q != 1) {
                    if (iA0Q == 2) {
                        layoutParams.addRule(3, ((C15515h) this).A06.getId());
                        layoutParams.setMargins(0, A08, 0, 0);
                        addView(this.A00, 0, layoutParams);
                        ((C15515h) this).A06.bringToFront();
                        return;
                    }
                    return;
                }
                layoutParams.addRule(12);
                String[] strArr = A06;
                if (strArr[5].length() != strArr[0].length()) {
                    throw new RuntimeException();
                }
                A06[4] = "cEnNLXyXCc05OsZ";
                XP.A0N(this.A00, A07, 5, c1992MyA01.A0A(false));
                ((C15515h) this).A06.addView(this.A00, layoutParams);
            }
        };
    }
}
