package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Q7 {
    public static byte[] A01;
    public final Q6 A00;

    static {
        A02();
    }

    public Q7(Q6 q62) {
        this.A00 = q62;
    }

    private int A00(List<C2053Pj> list) {
        int size = list.size() - 1;
        if (size < 0) {
            return -1;
        }
        list.get(size);
        throw new NullPointerException(A01(0, 3, 72));
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 22);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{61, 51, 58};
    }

    private void A03(List<C2053Pj> list, int i10, int i11) {
        list.get(i10);
        list.get(i11);
        throw new NullPointerException(A01(0, 3, 72));
    }

    public final void A04(List<C2053Pj> list) {
        int iA00 = A00(list);
        if (iA00 != -1) {
            A03(list, iA00, iA00 + 1);
            throw null;
        }
    }
}
