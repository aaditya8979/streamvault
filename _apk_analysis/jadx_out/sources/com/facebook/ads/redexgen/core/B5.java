package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class B5<K, V> extends AbstractC2941kJ<K, V> {
    public int A00;

    @ParametricNullness
    public final K A01;
    public final /* synthetic */ C3028lv A02;

    public B5(C3028lv c3028lv, int i10) {
        this.A02 = c3028lv;
        this.A01 = (K) c3028lv.A0E(i10);
        this.A00 = i10;
    }

    private void A00() {
        if (this.A00 == -1 || this.A00 >= this.A02.size() || !BX.A01(this.A01, this.A02.A0E(this.A00))) {
            this.A00 = this.A02.A07(this.A01);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2941kJ, java.util.Map.Entry
    @ParametricNullness
    public final K getKey() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2941kJ, java.util.Map.Entry
    @ParametricNullness
    public final V getValue() {
        Map<K, V> mapA0h = this.A02.A0h();
        if (mapA0h != null) {
            return (V) AbstractC3180oQ.A01(mapA0h.get(this.A01));
        }
        A00();
        return this.A00 == -1 ? (V) AbstractC3180oQ.A00() : (V) this.A02.A0F(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2941kJ, java.util.Map.Entry
    @ParametricNullness
    public final V setValue(@ParametricNullness V v10) {
        Map<K, V> mapA0h = this.A02.A0h();
        if (mapA0h != null) {
            return (V) AbstractC3180oQ.A01(mapA0h.put(this.A01, v10));
        }
        A00();
        if (this.A00 == -1) {
            this.A02.put(this.A01, v10);
            return (V) AbstractC3180oQ.A00();
        }
        V v11 = (V) this.A02.A0F(this.A00);
        this.A02.A0R(this.A00, v10);
        return v11;
    }
}
