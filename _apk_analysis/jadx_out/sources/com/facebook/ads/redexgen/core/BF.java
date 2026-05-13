package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.ListIterator;

/* JADX INFO: Add missing generic type declarations: [V] */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class BF<V> extends AbstractC14501i<K, V>.WrappedCollection.WrappedIterator implements ListIterator<V> {
    public final /* synthetic */ BE A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BF(BE be2) {
        super(be2);
        this.A00 = be2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BF(BE be2, int i10) {
        super(be2, be2.A06().listIterator(i10));
        this.A00 = be2;
    }

    private ListIterator<V> A00() {
        return (ListIterator) A02();
    }

    @Override // java.util.ListIterator
    public final void add(@ParametricNullness V v10) {
        boolean zIsEmpty = this.A00.isEmpty();
        A00().add(v10);
        AbstractC14501i.A00(this.A00.A00);
        if (zIsEmpty) {
            this.A00.A03();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return A00().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return A00().nextIndex();
    }

    @Override // java.util.ListIterator
    @ParametricNullness
    public final V previous() {
        return A00().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return A00().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(@ParametricNullness V v10) {
        A00().set(v10);
    }
}
