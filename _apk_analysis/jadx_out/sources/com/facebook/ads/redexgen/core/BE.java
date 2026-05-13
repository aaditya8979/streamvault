package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.CheckForNull;

/* JADX INFO: Add missing generic type declarations: [V] */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class BE<V> extends AbstractC14501i<K, V>.WrappedCollection implements List<V> {
    public final /* synthetic */ AbstractC14501i A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect inner types in method signature: (TK;Ljava/util/List<TV;>;Lcom/facebook/ads/redexgen/X/1i<TK;TV;>.WrappedCollection;)V */
    public BE(@ParametricNullness AbstractC14501i abstractC14501i, @CheckForNull Object obj, List list, C2939kH c2939kH) {
        super(abstractC14501i, obj, list, c2939kH);
        this.A00 = abstractC14501i;
    }

    public final List<V> A06() {
        return (List) A02();
    }

    @Override // java.util.List
    public final void add(@ParametricNullness int i10, V v10) {
        A04();
        boolean zIsEmpty = A02().isEmpty();
        A06().add(i10, v10);
        AbstractC14501i.A00(this.A00);
        if (zIsEmpty) {
            A03();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection<? extends V> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = A06().addAll(i10, collection);
        if (zAddAll) {
            AbstractC14501i.A02(this.A00, A02().size() - size);
            if (size == 0) {
                A03();
            }
        }
        return zAddAll;
    }

    @Override // java.util.List
    @ParametricNullness
    public final V get(int i10) {
        A04();
        return A06().get(i10);
    }

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        A04();
        return A06().indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        A04();
        return A06().lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<V> listIterator() {
        A04();
        return new BF(this);
    }

    @Override // java.util.List
    public final ListIterator<V> listIterator(int i10) {
        A04();
        return new BF(this, i10);
    }

    @Override // java.util.List
    @ParametricNullness
    public final V remove(int i10) {
        A04();
        V vRemove = A06().remove(i10);
        AbstractC14501i.A01(this.A00);
        A05();
        return vRemove;
    }

    @Override // java.util.List
    @ParametricNullness
    public final V set(@ParametricNullness int i10, V v10) {
        A04();
        return A06().set(i10, v10);
    }

    @Override // java.util.List
    public final List<V> subList(int i10, int i11) {
        A04();
        return this.A00.A0H(A01(), A06().subList(i10, i11), A00() == null ? this : A00());
    }
}
