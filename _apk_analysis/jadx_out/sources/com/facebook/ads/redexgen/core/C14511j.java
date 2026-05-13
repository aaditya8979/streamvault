package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.Collection;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C14511j<K, V> extends AbstractC14501i<K, V>.AsMap implements SortedMap<K, Collection<V>> {

    @CheckForNull
    public SortedSet<K> A00;
    public final /* synthetic */ AbstractC14501i A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14511j(AbstractC14501i abstractC14501i, SortedMap<K, Collection<V>> sortedMap) {
        super(abstractC14501i, sortedMap);
        this.A01 = abstractC14501i;
    }

    public SortedMap<K, Collection<V>> A0B() {
        return (SortedMap) this.A00;
    }

    public SortedSet<K> A0C() {
        return new C0X(this.A01, A0B());
    }

    @Override // java.util.SortedMap, java.util.Map
    /* JADX INFO: renamed from: A0D, reason: merged with bridge method [inline-methods] */
    public SortedSet<K> keySet() {
        SortedSet<K> sortedSet = this.A00;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet<K> sortedSetA0C = A0C();
        this.A00 = sortedSetA0C;
        return sortedSetA0C;
    }

    @Override // java.util.SortedMap
    @CheckForNull
    public final Comparator<? super K> comparator() {
        return A0B().comparator();
    }

    @Override // java.util.SortedMap
    @ParametricNullness
    public final K firstKey() {
        return A0B().firstKey();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, Collection<V>> headMap(@ParametricNullness K k10) {
        return new C14511j(this.A01, A0B().headMap(k10));
    }

    @Override // java.util.SortedMap
    @ParametricNullness
    public final K lastKey() {
        return A0B().lastKey();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, Collection<V>> subMap(@ParametricNullness K k10, @ParametricNullness K k11) {
        return new C14511j(this.A01, A0B().subMap(k10, k11));
    }

    @Override // java.util.SortedMap
    public SortedMap<K, Collection<V>> tailMap(@ParametricNullness K k10) {
        return new C14511j(this.A01, A0B().tailMap(k10));
    }
}
