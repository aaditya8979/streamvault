package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class K0 implements InterfaceC2313Zo {
    public final WeakReference<C15515h> A00;

    public K0(C15515h c15515h) {
        this.A00 = new WeakReference<>(c15515h);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2313Zo
    public final void ADT(C2312Zn c2312Zn) {
        C15515h c15515h = this.A00.get();
        if (c15515h != null) {
            c15515h.A04 = c2312Zn.A00() != null;
            c15515h.A02();
        }
    }
}
