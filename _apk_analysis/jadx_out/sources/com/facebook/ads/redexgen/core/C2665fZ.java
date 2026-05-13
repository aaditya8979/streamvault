package com.facebook.ads.redexgen.core;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2665fZ implements RQ {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ RS A01;
    public final /* synthetic */ C2072Qc A02;

    public C2665fZ(RS rs2, ImageView imageView, C2072Qc c2072Qc) {
        this.A01 = rs2;
        this.A00 = imageView;
        this.A02 = c2072Qc;
    }

    @Override // com.facebook.ads.redexgen.core.RQ
    public final void ADU(Drawable drawable) {
        C2072Qc.A0f(drawable, this.A00);
        this.A02.A1K(drawable);
    }
}
