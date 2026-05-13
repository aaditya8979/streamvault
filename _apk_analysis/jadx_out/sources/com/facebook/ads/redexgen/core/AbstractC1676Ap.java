package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ap, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC1676Ap<K, V> extends AbstractC3057mP implements Map<K, V> {
    public final int A04() {
        return AbstractC3209ou.A00(entrySet());
    }

    public abstract Map<K, V> A05();

    public final boolean A06(@CheckForNull Object obj) {
        return AbstractC3154nz.A0A(this, obj);
    }

    public final boolean A07(@CheckForNull Object obj) {
        return AbstractC3154nz.A0B(this, obj);
    }

    @Override // java.util.Map
    public void clear() {
        A05().clear();
    }

    public boolean containsKey(@CheckForNull Object obj) {
        return A05().containsKey(obj);
    }

    public abstract boolean containsValue(@CheckForNull Object obj);

    public Set<Map.Entry<K, V>> entrySet() {
        return A05().entrySet();
    }

    @CheckForNull
    public V get(@CheckForNull Object obj) {
        return A05().get(obj);
    }

    public boolean isEmpty() {
        return A05().isEmpty();
    }

    public Set<K> keySet() {
        return A05().keySet();
    }

    @Override // java.util.Map
    @CheckForNull
    public V put(@ParametricNullness K k10, @ParametricNullness V v10) {
        return A05().put(k10, v10);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        A05().putAll(map);
    }

    @Override // java.util.Map
    @CheckForNull
    public V remove(@CheckForNull Object obj) {
        return A05().remove(obj);
    }

    public int size() {
        return A05().size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return A05().values();
    }
}
