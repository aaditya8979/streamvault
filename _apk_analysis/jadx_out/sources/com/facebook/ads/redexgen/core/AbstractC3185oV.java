package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC3185oV<T> implements Comparator<T> {
    public static <C extends Comparable> AbstractC3185oV<C> A03() {
        return AQ.A02;
    }

    public static <T> AbstractC3185oV<T> A04(Comparator<T> comparator) {
        return comparator instanceof AbstractC3185oV ? (AbstractC3185oV) comparator : new B2(comparator);
    }

    public final <F> AbstractC3185oV<F> A05(InterfaceC2851ip<F, ? extends T> interfaceC2851ip) {
        return new BA(interfaceC2851ip, this);
    }

    public <S extends T> AbstractC3185oV<S> A06() {
        return new AJ(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(@ParametricNullness T t10, @ParametricNullness T t11);
}
