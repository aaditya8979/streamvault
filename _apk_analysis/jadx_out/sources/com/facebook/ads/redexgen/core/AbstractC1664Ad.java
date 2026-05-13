package com.facebook.ads.redexgen.core;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1664Ad<K, V> extends AbstractC3205oq<Map.Entry<K, V>> {
    public abstract Map<K, V> A00();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        A00().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return A00().isEmpty();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3205oq, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        try {
            return super.removeAll((Collection) AbstractC2871jA.A04(collection));
        } catch (UnsupportedOperationException unused) {
            return AbstractC3209ou.A0B(this, collection.iterator());
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3205oq, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        try {
            return super.retainAll((Collection) AbstractC2871jA.A04(collection));
        } catch (UnsupportedOperationException unused) {
            HashSet hashSetA06 = AbstractC3209ou.A06(collection.size());
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSetA06.add(((Map.Entry) obj).getKey());
                }
            }
            return A00().keySet().retainAll(hashSetA06);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return A00().size();
    }
}
