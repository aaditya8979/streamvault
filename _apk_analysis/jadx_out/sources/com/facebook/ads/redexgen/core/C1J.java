package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1J, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public final class C1J<E> extends AbstractC1672Al<E> {
    public final transient E A00;

    public C1J(E e10) {
        this.A00 = (E) AbstractC2871jA.A04(e10);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3068ma
    public final int A0I(Object[] objArr, int i10) {
        objArr[i10] = this.A00;
        return i10 + 1;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1672Al, com.facebook.ads.redexgen.core.AbstractC3068ma
    public final AbstractC1673Am<E> A0J() {
        return AbstractC1673Am.A04(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3068ma
    public final boolean A0K() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: A0N, reason: merged with bridge method [inline-methods] */
    public final AbstractC3240pg<E> iterator() {
        return AbstractC3115nL.A03(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3068ma, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.A00.equals(obj);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1672Al, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return '[' + this.A00.toString() + ']';
    }
}
