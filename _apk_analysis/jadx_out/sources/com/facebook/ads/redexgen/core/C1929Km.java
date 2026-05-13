package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Km, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1929Km {
    public final int A00;
    public final long A01;

    public C1929Km(int i10, long j10) {
        this.A00 = i10;
        this.A01 = j10;
    }

    public static C1929Km A00(InterfaceC2995lN interfaceC2995lN, C4J c4j) throws IOException {
        interfaceC2995lN.AG9(c4j.A0l(), 0, 8);
        c4j.A0f(0);
        return new C1929Km(c4j.A0C(), c4j.A0O());
    }
}
