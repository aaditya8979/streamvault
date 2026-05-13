package com.facebook.ads.redexgen.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class J3 implements InterfaceC2313Zo {
    public final /* synthetic */ C1883Is A00;

    public J3(C1883Is c1883Is) {
        this.A00 = c1883Is;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2313Zo
    public final void ADT(C2312Zn c2312Zn) {
        if (this.A00.A02 == null || c2312Zn.A00() == null) {
            return;
        }
        this.A00.A02.setImageBitmap(c2312Zn.A00());
        this.A00.A02.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.A00.A02.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    }
}
