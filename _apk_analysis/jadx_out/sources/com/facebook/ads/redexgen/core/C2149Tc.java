package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2149Tc implements InterfaceC2182Uk {
    public WeakReference<C2072Qc> A00;

    public C2149Tc(C2072Qc c2072Qc) {
        this.A00 = new WeakReference<>(c2072Qc);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2182Uk
    public final void AEW(boolean z10) {
        if (this.A00.get() != null) {
            this.A00.get().A1f(z10, false);
        }
    }
}
