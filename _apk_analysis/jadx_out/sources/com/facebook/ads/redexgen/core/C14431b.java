package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.Objects;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public final class C14431b<E> extends AbstractC1673Am<E> {
    public static final AbstractC1673Am<Object> A02 = new C14431b(new Object[0], 0);
    public final transient Object[] A00;
    public final transient int A01;

    public C14431b(Object[] objArr, int i10) {
        this.A00 = objArr;
        this.A01 = i10;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3068ma
    public final int A0G() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3068ma
    public final int A0H() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1673Am, com.facebook.ads.redexgen.core.AbstractC3068ma
    public final int A0I(Object[] objArr, int i10) {
        System.arraycopy(this.A00, 0, objArr, i10, this.A01);
        return this.A01 + i10;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3068ma
    public final boolean A0K() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3068ma
    public final Object[] A0L() {
        return this.A00;
    }

    @Override // java.util.List
    public final E get(int i10) {
        AbstractC2871jA.A00(i10, this.A01);
        return (E) Objects.requireNonNull(this.A00[i10]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A01;
    }
}
