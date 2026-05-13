package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class BK implements InterfaceC2877jG {
    public final /* synthetic */ BZ A00;

    public BK(BZ bz) {
        this.A00 = bz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.1o] */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2877jG
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C14561o AAc(final C2878jH c2878jH, final CharSequence charSequence) {
        return new BJ(c2878jH, charSequence) { // from class: com.facebook.ads.redexgen.X.1o
            @Override // com.facebook.ads.redexgen.core.BJ
            public final int A04(int i10) {
                return i10 + 1;
            }

            @Override // com.facebook.ads.redexgen.core.BJ
            public final int A05(int i10) {
                return this.A00.A00.A08(this.A03, i10);
            }
        };
    }
}
