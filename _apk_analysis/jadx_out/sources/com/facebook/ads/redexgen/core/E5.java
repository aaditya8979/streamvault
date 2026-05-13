package com.facebook.ads.redexgen.core;

import com.facebook.ads.redexgen.core.E5;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class E5<T extends E5<T>> {
    public final int A00;
    public final int A01;
    public final C3206or A02;
    public final C3172oH A03;

    public E5(int i10, C3172oH c3172oH, int i11) {
        this.A00 = i10;
        this.A03 = c3172oH;
        this.A01 = i11;
        this.A02 = c3172oH.A08(i11);
    }

    public abstract int A08();

    public abstract boolean A09(T t10);
}
