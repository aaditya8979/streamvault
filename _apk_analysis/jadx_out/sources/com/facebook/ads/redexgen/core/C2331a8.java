package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2331a8 extends RelativeLayout {
    public static String[] A06 = {"5SHdRwFrRc5I045mD2ED8hkR", "u607MEARHNz8UhlPP1yTj4t381pEaF91", "vukf6ONNN7udfcALTJGLQQCjk2MRvNqz", "", "LcpvFkzcfh74Tt7JU5VGWxCVkX9ufVQR", "0vcUNZ0oTZNrvLONhpGozykOOsxw8rlk", "", "YDZhxKGTPmLilHONF7GF9MvjPIJLKPZP"};
    public final int A00;
    public final LinearLayout A01;
    public final C2802hw A02;
    public final C2529dL A03;
    public final US A04;
    public final InterfaceC2260Xn A05;

    public C2331a8(C2529dL c2529dL, C2802hw c2802hw, US us2, InterfaceC2260Xn interfaceC2260Xn, int i10, int i11) {
        super(c2529dL);
        this.A03 = c2529dL;
        this.A02 = c2802hw;
        this.A04 = us2;
        this.A05 = interfaceC2260Xn;
        this.A00 = i10;
        this.A01 = new LinearLayout(c2529dL);
        A00();
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        setLayoutOrientation(i11);
    }

    private void A00() {
        int i10 = 0;
        while (true) {
            int iA1u = this.A02.A1u();
            String[] strArr = A06;
            if (strArr[2].charAt(18) == strArr[4].charAt(18)) {
                throw new RuntimeException();
            }
            A06[7] = "iNncIzrUEB4NW29LDzlz6YUCQOx5Utak";
            if (i10 >= iA1u) {
                return;
            }
            KI ki2 = new KI(this.A03, this.A02.A1x(i10), this.A04, this.A05);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            layoutParams.setMargins(KI.A0C, KI.A0C, KI.A0C, KI.A0C);
            ki2.setLayoutParams(layoutParams);
            this.A01.addView(ki2);
            i10++;
        }
    }

    private void setLayoutOrientation(int i10) {
        if (i10 == 1) {
            this.A01.setOrientation(1);
            this.A01.setPadding(0, (int) (((double) this.A00) * 1.5d), 0, this.A00);
        } else {
            this.A01.setOrientation(0);
            this.A01.setPadding(0, this.A00, 0, (int) (((double) this.A00) * 0.25d));
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setLayoutOrientation(configuration.orientation);
    }
}
