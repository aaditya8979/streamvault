package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class FI implements InterfaceC2420bZ {
    public final /* synthetic */ FH A00;

    public FI(FH fh2) {
        this.A00 = fh2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2420bZ
    public final void AFm(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2420bZ
    public final void AFo(View view) {
        AbstractC1882Ir abstractC1882Ir = (AbstractC1882Ir) view;
        abstractC1882Ir.A1R();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) abstractC1882Ir.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}
