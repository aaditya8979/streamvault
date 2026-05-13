package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class BD<K, V> implements InterfaceC3169oE<K, V> {

    @CheckForNull
    @LazyInit
    public transient Collection<V> A00;

    @CheckForNull
    @LazyInit
    public transient Map<K, Collection<V>> A01;

    @CheckForNull
    @LazyInit
    public transient Set<K> A02;

    public abstract Map<K, Collection<V>> A00();

    public Set<K> A01() {
        Set<K> set = this.A02;
        if (set != null) {
            return set;
        }
        Set<K> setA02 = A02();
        this.A02 = setA02;
        return setA02;
    }

    public abstract Set<K> A02();

    public boolean A03(@CheckForNull Object obj) {
        Iterator<Collection<V>> it = A49().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Collection<V> A0B();

    public abstract Iterator<V> A0C();

    @Override // com.facebook.ads.redexgen.core.InterfaceC3169oE
    public Map<K, Collection<V>> A49() {
        Map<K, Collection<V>> map = this.A01;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapA00 = A00();
        this.A01 = mapA00;
        return mapA00;
    }

    public boolean equals(@CheckForNull Object obj) {
        return AbstractC3174oJ.A01(this, obj);
    }

    public int hashCode() {
        return A49().hashCode();
    }

    public String toString() {
        return A49().toString();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3169oE
    public Collection<V> values() {
        Collection<V> collection = this.A00;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionA0B = A0B();
        this.A00 = collectionA0B;
        return collectionA0B;
    }
}
