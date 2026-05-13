package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class MZ extends Y3 {
    public final C2310Zl A00;

    public MZ(C2529dL c2529dL, View.OnClickListener onClickListener) {
        super(c2529dL, onClickListener);
        this.A00 = new C2310Zl(c2529dL);
        addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
    }

    public final MZ A0F(String str) {
        new KZ(this.A00, this.A01).A05(this.A00.getHeight(), this.A00.getWidth()).A06(new C1981Mm(this)).A07(str);
        A0C();
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.Y3
    public int getMediaViewId() {
        return this.A00.getId();
    }
}
