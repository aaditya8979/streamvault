package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class B0 extends AbstractC3037m4 {
    public B0() {
        super(null);
    }

    private final AbstractC3037m4 A00(int i10) {
        return i10 < 0 ? AbstractC3037m4.A02 : i10 > 0 ? AbstractC3037m4.A01 : AbstractC3037m4.A00;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3037m4
    public final int A05() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3037m4
    public final AbstractC3037m4 A06(int i10, int i11) {
        return A00(AD.A01(i10, i11));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3037m4
    public final AbstractC3037m4 A07(long j10, long j11) {
        return A00(AbstractC3262q7.A01(j10, j11));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3037m4
    public final <T> AbstractC3037m4 A08(@ParametricNullness T t10, @ParametricNullness T t11, Comparator<T> comparator) {
        return A00(comparator.compare(t10, t11));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3037m4
    public final AbstractC3037m4 A09(boolean z10, boolean z11) {
        return A00(PD.A00(z10, z11));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3037m4
    public final AbstractC3037m4 A0A(boolean z10, boolean z11) {
        return A00(PD.A00(z11, z10));
    }
}
