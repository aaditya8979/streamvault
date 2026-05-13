package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Db, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1737Db implements InterfaceC2543dZ {
    public final View A00;
    public final C2529dL A01;

    public C1737Db(C2529dL c2529dL, View view) {
        this.A01 = c2529dL;
        this.A00 = view;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2543dZ
    public final double A9N() {
        return C2602eX.A0E(this.A00, 0, this.A01).A00();
    }
}
