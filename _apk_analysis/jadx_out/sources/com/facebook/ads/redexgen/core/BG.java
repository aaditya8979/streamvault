package com.facebook.ads.redexgen.core;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class BG<K, V> extends AbstractC3153ny<K, Collection<V>> {
    public final transient Map<K, Collection<V>> A00;
    public final /* synthetic */ AbstractC14501i A01;

    public BG(AbstractC14501i abstractC14501i, Map<K, Collection<V>> map) {
        this.A01 = abstractC14501i;
        this.A00 = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    /* JADX INFO: renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final Collection<V> get(@CheckForNull Object obj) {
        Collection<V> collection = (Collection) AbstractC3154nz.A05(this.A00, obj);
        if (collection == null) {
            return null;
        }
        return this.A01.A0F(obj, collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    /* JADX INFO: renamed from: A08, reason: merged with bridge method [inline-methods] */
    public final Collection<V> remove(@CheckForNull Object obj) {
        Collection<V> collectionRemove = this.A00.remove(obj);
        if (collectionRemove == null) {
            return null;
        }
        Collection<V> collectionA0D = this.A01.A0D();
        collectionA0D.addAll(collectionRemove);
        AbstractC14501i.A03(this.A01, collectionRemove.size());
        collectionRemove.clear();
        return collectionA0D;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3153ny
    public final Set<Map.Entry<K, Collection<V>>> A09() {
        return new AbstractC1664Ad<K, Collection<V>>() { // from class: com.facebook.ads.redexgen.X.1m
            public static String[] A01 = {"c", "Cderzo7kRJnvUqpU20WcBh2OZWVVjooT", "Z", "ZZrF4bQPE17IkUPu05dPNeIYxEP3htEV", "zoL9Bw1Syr4GOxCjTnDxY342EbanM9q3", "GegVcEhGdWXR", "86lf1o9WQgzrbD", "NgZwPtD5hXQhY3eRyOKbKp0yAyP86bbs"};

            @Override // com.facebook.ads.redexgen.core.AbstractC1664Ad
            public final Map<K, Collection<V>> A00() {
                return this.A00;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(@CheckForNull Object obj) {
                return AbstractC3023lq.A03(this.A00.A00.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C2935kD(this.A00);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(@CheckForNull Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) Objects.requireNonNull((Map.Entry) obj);
                BG bg2 = this.A00;
                if (A01[2].length() == 19) {
                    throw new RuntimeException();
                }
                A01[3] = "G2qcJwlII5HIikaXRsYLysr3qmkTj7oM";
                bg2.A01.A0A(entry.getKey());
                return true;
            }
        };
    }

    public final Map.Entry<K, Collection<V>> A0A(Map.Entry<K, Collection<V>> entry) {
        K key = entry.getKey();
        return AbstractC3154nz.A01(key, this.A01.A0F(key, entry.getValue()));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (this.A00 == this.A01.A01) {
            this.A01.clear();
        } else {
            AbstractC3115nL.A0A(new C2935kD(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        return AbstractC3154nz.A0C(this.A00, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        return this == obj || this.A00.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        return this.A01.A01();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.A00.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.A00.toString();
    }
}
