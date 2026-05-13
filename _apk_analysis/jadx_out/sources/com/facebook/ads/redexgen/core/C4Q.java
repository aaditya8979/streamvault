package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4Q, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C4Q<V> {
    public int A00;
    public int A01;
    public long[] A02;
    public V[] A03;

    public C4Q() {
        this(10);
    }

    public C4Q(int i10) {
        this.A02 = new long[i10];
        this.A03 = (V[]) A00(i10);
    }

    public static <V> V[] A00(int i10) {
        return (V[]) new Object[i10];
    }

    public final synchronized int A01() {
        return this.A01;
    }

    public final synchronized void A02() {
        this.A00 = 0;
        this.A01 = 0;
        Arrays.fill(this.A03, (Object) null);
    }
}
