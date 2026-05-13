package com.facebook.ads.redexgen.core;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.k7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2929k7 implements J7 {
    public final long[] A00;
    public final C3157o2[] A01;

    public C2929k7(C3157o2[] c3157o2Arr, long[] jArr) {
        this.A01 = c3157o2Arr;
        this.A00 = jArr;
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final List<C3157o2> A7P(long j10) {
        int iA0L = AbstractC15184a.A0L(this.A00, j10, true, false);
        return (iA0L == -1 || this.A01[iA0L] == C3157o2.A0J) ? Collections.emptyList() : Collections.singletonList(this.A01[iA0L]);
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final long A7v(int i10) {
        C3M.A07(i10 >= 0);
        C3M.A07(i10 < this.A00.length);
        return this.A00[i10];
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final int A7w() {
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final int A8S(long j10) {
        int iA0K = AbstractC15184a.A0K(this.A00, j10, false, false);
        if (iA0K < this.A00.length) {
            return iA0K;
        }
        return -1;
    }
}
