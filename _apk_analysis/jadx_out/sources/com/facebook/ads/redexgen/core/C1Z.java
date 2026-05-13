package com.facebook.ads.redexgen.core;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1Z, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1Z<K, V> extends AbstractC1672Al<Map.Entry<K, V>> {
    public final transient int A00;
    public final transient int A01;
    public final transient AbstractC3077mj<K, V> A02;
    public final transient Object[] A03;

    public C1Z(AbstractC3077mj<K, V> abstractC3077mj, Object[] objArr, int i10, int i11) {
        this.A02 = abstractC3077mj;
        this.A03 = objArr;
        this.A00 = i10;
        this.A01 = i11;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3068ma
    public final int A0I(Object[] objArr, int i10) {
        return A0J().A0I(objArr, i10);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3068ma
    public final boolean A0K() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1672Al
    public final AbstractC1673Am<Map.Entry<K, V>> A0M() {
        return new AbstractC1673Am<Map.Entry<K, V>>() { // from class: com.facebook.ads.redexgen.X.1a
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.List
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final Map.Entry<K, V> get(int i10) {
                AbstractC2871jA.A00(i10, this.A00.A01);
                return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(this.A00.A03[(i10 * 2) + this.A00.A00]), Objects.requireNonNull(this.A00.A03[(i10 * 2) + (this.A00.A00 ^ 1)]));
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC3068ma
            public final boolean A0K() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return this.A00.A01;
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: A0N */
    public final AbstractC3240pg<Map.Entry<K, V>> iterator() {
        return A0J().iterator();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3068ma, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.A02.get(key));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A01;
    }
}
