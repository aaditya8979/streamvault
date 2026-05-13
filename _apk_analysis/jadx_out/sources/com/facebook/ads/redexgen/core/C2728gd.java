package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.res.ColorStateList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2728gd implements OG {
    private OH A00(OF of2) {
        return (OH) of2.A76();
    }

    public final void A01(OF of2) {
        if (!of2.A9J()) {
            of2.AJ1(0, 0, 0, 0);
            return;
        }
        float fA8K = A8K(of2);
        float fA8j = A8j(of2);
        int iCeil = (int) Math.ceil(OJ.A00(fA8K, fA8j, of2.A8i()));
        int iCeil2 = (int) Math.ceil(OJ.A01(fA8K, fA8j, of2.A8i()));
        of2.AJ1(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // com.facebook.ads.redexgen.core.OG
    public final ColorStateList A6t(OF of2) {
        return A00(of2).A05();
    }

    @Override // com.facebook.ads.redexgen.core.OG
    public final float A7n(OF of2) {
        return of2.A77().getElevation();
    }

    @Override // com.facebook.ads.redexgen.core.OG
    public final float A8K(OF of2) {
        return A00(of2).A03();
    }

    @Override // com.facebook.ads.redexgen.core.OG
    public final float A8P(OF of2) {
        return A8j(of2) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.core.OG
    public final float A8Q(OF of2) {
        return A8j(of2) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.core.OG
    public final float A8j(OF of2) {
        return A00(of2).A04();
    }

    @Override // com.facebook.ads.redexgen.core.OG
    public final void AA6() {
    }

    @Override // com.facebook.ads.redexgen.core.OG
    public final void AA8(OF of2, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        of2.AIa(new OH(colorStateList, f10));
        OE oeA77 = of2.A77();
        oeA77.setClipToOutline(true);
        oeA77.setElevation(f11);
        AIn(of2, f12);
    }

    @Override // com.facebook.ads.redexgen.core.OG
    public final void ACm(OF of2) {
        AIn(of2, A8K(of2));
    }

    @Override // com.facebook.ads.redexgen.core.OG
    public final void AEl(OF of2) {
        AIn(of2, A8K(of2));
    }

    @Override // com.facebook.ads.redexgen.core.OG
    public final void AIZ(OF of2, ColorStateList colorStateList) {
        A00(of2).A08(colorStateList);
    }

    @Override // com.facebook.ads.redexgen.core.OG
    public final void AIf(OF of2, float f10) {
        of2.A77().setElevation(f10);
    }

    @Override // com.facebook.ads.redexgen.core.OG
    public final void AIn(OF of2, float f10) {
        A00(of2).A07(f10, of2.A9J(), of2.A8i());
        A01(of2);
    }

    @Override // com.facebook.ads.redexgen.core.OG
    public final void AIz(OF of2, float f10) {
        A00(of2).A06(f10);
    }
}
