package com.facebook.ads.redexgen.core;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C14531l<K, V> extends C1663Ac<K, Collection<V>> {
    public final /* synthetic */ AbstractC14501i A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14531l(AbstractC14501i abstractC14501i, Map<K, Collection<V>> map) {
        super(map);
        this.A00 = abstractC14501i;
    }

    @Override // com.facebook.ads.redexgen.core.C1663Ac, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        AbstractC3115nL.A0A(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        return A00().keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        return this == obj || A00().keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return A00().keySet().hashCode();
    }

    @Override // com.facebook.ads.redexgen.core.C1663Ac, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        return new C2937kF(this, A00().entrySet().iterator());
    }

    @Override // com.facebook.ads.redexgen.core.C1663Ac, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        int size = 0;
        Collection collection = (Collection) A00().remove(obj);
        if (collection != null) {
            size = collection.size();
            collection.clear();
            AbstractC14501i.A03(this.A00, size);
        }
        return size > 0;
    }
}
