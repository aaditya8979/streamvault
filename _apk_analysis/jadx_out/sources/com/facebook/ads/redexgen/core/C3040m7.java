package com.facebook.ads.redexgen.core;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.m7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3040m7 implements J7 {
    public final long A00;
    public final AbstractC1673Am<C3157o2> A01;

    public C3040m7(long j10, AbstractC1673Am<C3157o2> abstractC1673Am) {
        this.A00 = j10;
        this.A01 = abstractC1673Am;
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final List<C3157o2> A7P(long j10) {
        return j10 >= this.A00 ? this.A01 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final long A7v(int i10) {
        C3M.A07(i10 == 0);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final int A7w() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final int A8S(long j10) {
        return this.A00 > j10 ? 0 : -1;
    }
}
