package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class YN implements InterfaceC2606eb {
    public static byte[] A01;
    public final C2503cu A00;

    static {
        A01();
    }

    public YN(C2503cu c2503cu) {
        this.A00 = c2503cu;
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 74);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{82, 39, 76, 72, 39, 90, 101, 101, 102, 39, 88, 101, 127, 126, 99, 100, 109, 39, 94, 101, 97, 111, 100, 12, 10, 28, 11, 84, 24, 30, 28, 23, 13};
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2606eb
    public final Map<String, String> A6Y(boolean z10) {
        HashMap map = new HashMap();
        if (!AbstractC2113Rr.A00().A04()) {
            map.put(A00(0, 23, 64), TY.A00().A01(this.A00, true).A04());
        }
        map.put(A00(23, 10, 51), AbstractC2148Tb.A06(new T6(this.A00), this.A00, z10));
        return map;
    }
}
