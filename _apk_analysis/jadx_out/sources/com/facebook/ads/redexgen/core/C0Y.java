package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import javax.annotation.CheckForNull;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0Y, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0Y<K, V> extends AbstractC14501i<K, V>.SortedAsMap implements NavigableMap<K, Collection<V>> {
    public final /* synthetic */ AbstractC14501i A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y(AbstractC14501i abstractC14501i, NavigableMap<K, Collection<V>> navigableMap) {
        super(abstractC14501i, navigableMap);
        this.A00 = abstractC14501i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final NavigableSet<K> A0C() {
        return new C0I(this.A00, A0B());
    }

    @CheckForNull
    private final Map.Entry<K, Collection<V>> A01(Iterator<Map.Entry<K, Collection<V>>> it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry<K, Collection<V>> next = it.next();
        Collection<V> collectionA0D = this.A00.A0D();
        collectionA0D.addAll(next.getValue());
        it.remove();
        return AbstractC3154nz.A01(next.getKey(), this.A00.A0G(collectionA0D));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final NavigableMap<K, Collection<V>> A0B() {
        return (NavigableMap) super.A0B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.NavigableMap, java.util.SortedMap
    /* JADX INFO: renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final NavigableMap<K, Collection<V>> headMap(@ParametricNullness K k10) {
        return headMap(k10, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.NavigableMap, java.util.SortedMap
    /* JADX INFO: renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final NavigableMap<K, Collection<V>> tailMap(@ParametricNullness K k10) {
        return tailMap(k10, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.NavigableMap, java.util.SortedMap
    /* JADX INFO: renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final NavigableMap<K, Collection<V>> subMap(@ParametricNullness K k10, @ParametricNullness K k11) {
        return subMap(k10, true, k11, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.SortedMap, java.util.Map
    /* JADX INFO: renamed from: A06, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final NavigableSet<K> keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry<K, Collection<V>> ceilingEntry(@ParametricNullness K k10) {
        Map.Entry<K, Collection<V>> entryCeilingEntry = A0B().ceilingEntry(k10);
        if (entryCeilingEntry == null) {
            return null;
        }
        return A0A(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final K ceilingKey(@ParametricNullness K k10) {
        return A0B().ceilingKey(k10);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet<K> descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap<K, Collection<V>> descendingMap() {
        return new C0Y(this.A00, A0B().descendingMap());
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry<K, Collection<V>> firstEntry() {
        Map.Entry<K, Collection<V>> entryFirstEntry = A0B().firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return A0A(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry<K, Collection<V>> floorEntry(@ParametricNullness K k10) {
        Map.Entry<K, Collection<V>> entryFloorEntry = A0B().floorEntry(k10);
        if (entryFloorEntry == null) {
            return null;
        }
        return A0A(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final K floorKey(@ParametricNullness K k10) {
        return A0B().floorKey(k10);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap<K, Collection<V>> headMap(@ParametricNullness K k10, boolean z10) {
        return new C0Y(this.A00, A0B().headMap(k10, z10));
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry<K, Collection<V>> higherEntry(@ParametricNullness K k10) {
        Map.Entry<K, Collection<V>> entryHigherEntry = A0B().higherEntry(k10);
        if (entryHigherEntry == null) {
            return null;
        }
        return A0A(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final K higherKey(@ParametricNullness K k10) {
        return A0B().higherKey(k10);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry<K, Collection<V>> lastEntry() {
        Map.Entry<K, Collection<V>> entryLastEntry = A0B().lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return A0A(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry<K, Collection<V>> lowerEntry(@ParametricNullness K k10) {
        Map.Entry<K, Collection<V>> entryLowerEntry = A0B().lowerEntry(k10);
        if (entryLowerEntry == null) {
            return null;
        }
        return A0A(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final K lowerKey(@ParametricNullness K k10) {
        return A0B().lowerKey(k10);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet<K> navigableKeySet() {
        return keySet();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry<K, Collection<V>> pollFirstEntry() {
        return A01(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry<K, Collection<V>> pollLastEntry() {
        return A01(descendingMap().entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final NavigableMap<K, Collection<V>> subMap(@ParametricNullness K k10, @ParametricNullness boolean z10, K k11, boolean z11) {
        return new C0Y(this.A00, A0B().subMap(k10, z10, k11, z11));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap<K, Collection<V>> tailMap(@ParametricNullness K k10, boolean z10) {
        return new C0Y(this.A00, A0B().tailMap(k10, z10));
    }
}
