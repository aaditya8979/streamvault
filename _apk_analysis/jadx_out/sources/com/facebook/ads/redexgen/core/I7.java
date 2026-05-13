package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class I7 extends AbstractRunnableC2216Vt {
    public static byte[] A02;
    public final /* synthetic */ C2432bl A00;
    public final /* synthetic */ C3Q A01;

    static {
        A01();
    }

    public I7(C2432bl c2432bl, C3Q c3q) {
        this.A00 = c2432bl;
        this.A01 = c3q;
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 40);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-103, -52, -67, -67, -68, -55, -64, -59, -66, 119, -64, -59, -69, -68, -67, -64, -59, -64, -53, -68, -61, -48};
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2216Vt
    public final void A07() {
        if (this.A00.A0D.getState() == EnumC2599eU.A02 && this.A00.A0D.getCurrentPositionInMillis() == A00()) {
            this.A00.A0I(A00(0, 22, 47));
        }
    }
}
