package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0Z, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class C0Z<K, V> extends AbstractC14501i<K, V> implements InterfaceC1668Ah<K, V> {
    public static final long serialVersionUID = 6588350623831699109L;

    public C0Z(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC14501i
    public final Collection<V> A0F(@ParametricNullness K k10, Collection<V> collection) {
        return A0H(k10, (List) collection, null);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC14501i
    public final <E> Collection<E> A0G(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.facebook.ads.redexgen.core.BD, com.facebook.ads.redexgen.core.InterfaceC3169oE
    public Map<K, Collection<V>> A49() {
        return super.A49();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC14501i, com.facebook.ads.redexgen.core.InterfaceC3169oE
    public boolean AGU(@ParametricNullness K k10, @ParametricNullness V v10) {
        return super.AGU(k10, v10);
    }

    @Override // com.facebook.ads.redexgen.core.BD
    public boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }
}
