package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.p5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC3219p5 {
    public static byte[] A00;
    public static final C3218p4 A01;
    public static final InterfaceC16549t[] A02;

    static {
        C3218p4 c3218p4;
        try {
            A02();
            c3218p4 = (C3218p4) Class.forName(A00(0, 49, 40)).newInstance();
        } catch (ClassCastException unused) {
            c3218p4 = null;
        } catch (ClassNotFoundException unused2) {
            c3218p4 = null;
        } catch (IllegalAccessException unused3) {
            c3218p4 = null;
        } catch (InstantiationException unused4) {
            c3218p4 = null;
        }
        if (c3218p4 == null) {
            c3218p4 = new C3218p4();
        }
        A01 = c3218p4;
        A02 = new InterfaceC16549t[0];
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 12);
        }
        return new String(bArrCopyOfRange);
    }

    public static String A01(C1C c1c) {
        return A01.A03(c1c);
    }

    public static void A02() {
        A00 = new byte[]{79, 75, 80, 72, 77, 74, 10, 86, 65, 66, 72, 65, 71, 80, 10, 78, 82, 73, 10, 77, 74, 80, 65, 86, 74, 69, 72, 10, 118, 65, 66, 72, 65, 71, 80, 77, 75, 74, 98, 69, 71, 80, 75, 86, 93, 109, 73, 84, 72};
    }
}
