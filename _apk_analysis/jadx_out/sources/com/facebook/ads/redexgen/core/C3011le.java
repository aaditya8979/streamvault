package com.facebook.ads.redexgen.core;

import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.le, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3011le implements InterfaceC1765Ed {
    public final int A00;

    public C3011le() {
        this(-1);
    }

    public C3011le(int i10) {
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1765Ed
    public final int A8R(int i10) {
        return this.A00 == -1 ? i10 == 7 ? 6 : 3 : this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1765Ed
    public final long A8m(C1764Ec c1764Ec) {
        IOException iOException = c1764Ec.A03;
        if ((iOException instanceof C14742i) || (iOException instanceof FileNotFoundException) || (iOException instanceof C16429h) || (iOException instanceof C1775En) || C15434z.A00(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((c1764Ec.A00 - 1) * 1000, 5000);
    }
}
