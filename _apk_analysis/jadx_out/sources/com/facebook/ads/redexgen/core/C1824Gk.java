package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Metadata;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1824Gk {
    public final C4J A00 = new C4J(10);

    public final Metadata A00(InterfaceC2995lN interfaceC2995lN, InterfaceC1842Hc interfaceC1842Hc) throws IOException {
        int i10 = 0;
        Metadata metadataA0S = null;
        while (true) {
            try {
                interfaceC2995lN.AG9(this.A00.A0l(), 0, 10);
                this.A00.A0f(0);
                if (this.A00.A0K() != 4801587) {
                    break;
                }
                this.A00.A0g(3);
                int iA0H = this.A00.A0H();
                int i11 = iA0H + 10;
                if (metadataA0S == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.A00.A0l(), 0, bArr, 0, 10);
                    interfaceC2995lN.AG9(bArr, 10, iA0H);
                    metadataA0S = new C16268i(interfaceC1842Hc).A0S(bArr, i11);
                } else {
                    interfaceC2995lN.A3z(iA0H);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        interfaceC2995lN.AI1();
        interfaceC2995lN.A3z(i10);
        return metadataA0S;
    }
}
