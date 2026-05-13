package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.io.Serializable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.An, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public class C1674An<K, V> extends AbstractC2941kJ<K, V> implements Serializable {
    public static final long serialVersionUID = 0;

    @ParametricNullness
    public final K A00;

    @ParametricNullness
    public final V A01;

    public C1674An(@ParametricNullness K k10, @ParametricNullness V v10) {
        this.A00 = k10;
        this.A01 = v10;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2941kJ, java.util.Map.Entry
    @ParametricNullness
    public final K getKey() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2941kJ, java.util.Map.Entry
    @ParametricNullness
    public final V getValue() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2941kJ, java.util.Map.Entry
    @ParametricNullness
    public final V setValue(@ParametricNullness V v10) {
        throw new UnsupportedOperationException();
    }
}
