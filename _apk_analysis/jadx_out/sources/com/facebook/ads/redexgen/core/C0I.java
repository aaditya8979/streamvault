package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import javax.annotation.CheckForNull;

/* JADX INFO: Add missing generic type declarations: [K] */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0I, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0I<K> extends AbstractC14501i<K, V>.SortedKeySet implements NavigableSet<K> {
    public final /* synthetic */ AbstractC14501i A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0I(AbstractC14501i abstractC14501i, NavigableMap<K, Collection<V>> navigableMap) {
        super(abstractC14501i, navigableMap);
        this.A00 = abstractC14501i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final NavigableMap<K, Collection<V>> A04() {
        return (NavigableMap) super.A04();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final NavigableSet<K> headSet(@ParametricNullness K k10) {
        return headSet(k10, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final NavigableSet<K> tailSet(@ParametricNullness K k10) {
        return tailSet(k10, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final NavigableSet<K> subSet(@ParametricNullness K k10, @ParametricNullness K k11) {
        return subSet(k10, true, k11, false);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final K ceiling(@ParametricNullness K k10) {
        return A04().ceilingKey(k10);
    }

    @Override // java.util.NavigableSet
    public final Iterator<K> descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet<K> descendingSet() {
        return new C0I(this.A00, A04().descendingMap());
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final K floor(@ParametricNullness K k10) {
        return A04().floorKey(k10);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet<K> headSet(@ParametricNullness K k10, boolean z10) {
        return new C0I(this.A00, A04().headMap(k10, z10));
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final K higher(@ParametricNullness K k10) {
        return A04().higherKey(k10);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final K lower(@ParametricNullness K k10) {
        return A04().lowerKey(k10);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final K pollFirst() {
        return (K) AbstractC3115nL.A05(iterator());
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public final K pollLast() {
        return (K) AbstractC3115nL.A05(descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet<K> subSet(@ParametricNullness K k10, @ParametricNullness boolean z10, K k11, boolean z11) {
        return new C0I(this.A00, A04().subMap(k10, z10, k11, z11));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet<K> tailSet(@ParametricNullness K k10, boolean z10) {
        return new C0I(this.A00, A04().tailMap(k10, z10));
    }
}
