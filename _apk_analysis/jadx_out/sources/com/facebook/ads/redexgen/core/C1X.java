package com.facebook.ads.redexgen.core;

import java.util.Objects;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1X, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1X extends AbstractC1673Am<Object> {
    public final transient int A00;
    public final transient int A01;
    public final transient Object[] A02;

    public C1X(Object[] objArr, int i10, int i11) {
        this.A02 = objArr;
        this.A00 = i10;
        this.A01 = i11;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3068ma
    public final boolean A0K() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC2871jA.A00(i10, this.A01);
        return Objects.requireNonNull(this.A02[(i10 * 2) + this.A00]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A01;
    }
}
