package com.facebook.ads.redexgen.core;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2664fY extends AbstractRunnableC2216Vt {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ RS A01;
    public final /* synthetic */ C2072Qc A02;

    public C2664fY(RS rs2, C2072Qc c2072Qc, Drawable drawable) {
        this.A01 = rs2;
        this.A02 = c2072Qc;
        this.A00 = drawable;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2216Vt
    public final void A07() {
        this.A02.A1K(this.A00);
    }
}
