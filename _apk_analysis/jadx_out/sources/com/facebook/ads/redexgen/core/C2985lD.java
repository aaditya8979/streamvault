package com.facebook.ads.redexgen.core;

import java.util.Objects;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2985lD extends GQ {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2985lD(final C1821Gh c1821Gh, int i10, long j10, long j11) {
        super(new GL() { // from class: com.facebook.ads.redexgen.X.lF
            @Override // com.facebook.ads.redexgen.core.GL
            public final long AJf(long j12) {
                return c1821Gh.A07(j12);
            }
        }, new C2986lE(c1821Gh, i10), c1821Gh.A06(), 0L, c1821Gh.A09, j10, j11, c1821Gh.A05(), Math.max(6, c1821Gh.A06));
        Objects.requireNonNull(c1821Gh);
    }
}
