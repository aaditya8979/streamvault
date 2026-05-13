package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ua, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2172Ua {
    public static byte[] A02;
    public final US A00;
    public final String A01;

    static {
        A01();
    }

    public C2172Ua(String str, US us2) {
        this.A01 = str;
        this.A00 = us2;
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 45);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-15, -13, -32, -14, -9, -18, -29};
    }

    public static void A02(UZ uz, Map<String, String> map, String str, US us2) {
        A03(uz.A03(), map, str, us2);
    }

    public static void A03(String str, Map<String, String> map, String str2, US us2) {
        if (AbstractC2174Uc.A0B(str2, str)) {
            if (map == null) {
                map = new HashMap<>();
            }
            map.put(A00(0, 7, 81), str);
            us2.AB1(str2, map);
        }
    }

    public final void A04(UZ uz, Map<String, String> map) {
        A05(uz.A03(), map);
    }

    public final void A05(String str, Map<String, String> map) {
        A03(str, map, this.A01, this.A00);
    }
}
