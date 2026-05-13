package com.facebook.ads.redexgen.core;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2726gb<K, V> extends C2020Ob<K, V> implements Map<K, V> {
    public OY<K, V> A00;

    private OY<K, V> A00() {
        if (this.A00 == null) {
            this.A00 = new C2727gc(this);
        }
        return this.A00;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return A00().A08();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return A00().A09();
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        A0D(super.A00 + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return A00().A0A();
    }
}
