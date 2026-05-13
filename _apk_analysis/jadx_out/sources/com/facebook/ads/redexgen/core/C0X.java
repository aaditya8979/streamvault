package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.Collection;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: Add missing generic type declarations: [K] */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0X, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0X<K> extends AbstractC14501i<K, V>.KeySet implements SortedSet<K> {
    public final /* synthetic */ AbstractC14501i A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0X(AbstractC14501i abstractC14501i, SortedMap<K, Collection<V>> sortedMap) {
        super(abstractC14501i, sortedMap);
        this.A00 = abstractC14501i;
    }

    public SortedMap<K, Collection<V>> A04() {
        return (SortedMap) super.A00();
    }

    @Override // java.util.SortedSet
    @CheckForNull
    public final Comparator<? super K> comparator() {
        return A04().comparator();
    }

    @Override // java.util.SortedSet
    @ParametricNullness
    public final K first() {
        return A04().firstKey();
    }

    @Override // java.util.SortedSet
    public SortedSet<K> headSet(@ParametricNullness K k10) {
        return new C0X(this.A00, A04().headMap(k10));
    }

    @Override // java.util.SortedSet
    @ParametricNullness
    public final K last() {
        return A04().lastKey();
    }

    @Override // java.util.SortedSet
    public SortedSet<K> subSet(@ParametricNullness K k10, @ParametricNullness K k11) {
        return new C0X(this.A00, A04().subMap(k10, k11));
    }

    @Override // java.util.SortedSet
    public SortedSet<K> tailSet(@ParametricNullness K k10) {
        return new C0X(this.A00, A04().tailMap(k10));
    }
}
