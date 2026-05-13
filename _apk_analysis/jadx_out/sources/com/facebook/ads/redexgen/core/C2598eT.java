package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2598eT implements InterfaceC2108Rm {
    public static byte[] A02;
    public static String[] A03 = {"frztuTbk90jgHBlm3zQJyLa", "1t5yWCu7Rr8GJSKN0jLr3suU4yLwpLao", "qy8Ulx", "lpakeOCplwfUbPlWH1mKRjN93sjJNeLK", "9U38xP8piwyhajLb0oPtN8g0SrDQbMul", "5doBkCOudtbbit2jQfjyLRk0HEXNCLN", "an6q6r3Pxi3Yd1Uxl34WEMAekK7mvAv", "C2viYzQ805EsgOX4y3n8lLHcCQmdv4Bq"};
    public final EnumC2109Rn A00;
    public final String A01;

    static {
        A02();
    }

    public C2598eT(EnumC2109Rn enumC2109Rn, String str) {
        this.A00 = enumC2109Rn;
        this.A01 = str;
    }

    public static C2598eT A00(JSONObject jSONObject) {
        EnumC2109Rn enumC2109RnA00 = EnumC2109Rn.A00(jSONObject.optString(A01(0, 4, 77)));
        String strOptString = jSONObject.optString(A01(4, 3, 8));
        if (enumC2109RnA00 == null || strOptString == null) {
            return null;
        }
        return new C2598eT(enumC2109RnA00, strOptString);
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A03;
            if (strArr[7].charAt(16) == strArr[3].charAt(16)) {
                throw new RuntimeException();
            }
            A03[1] = "szQ1vN1s54Hk3y1OQ1NRUBnkClWieIjw";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 62);
            i13++;
        }
    }

    public static void A02() {
        A02 = new byte[]{-1, 4, -5, -16, -69, -72, -78};
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2108Rm
    public final EnumC2109Rn A9G() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class<?> cls = getClass();
            if (A03[1].charAt(30) == 'F') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[6] = "4HA6u4Nz4keiLa8sOcHfyEhD3wtH4bT";
            strArr[5] = "zctnvSkfK8HVemf9ezG6OofbW6HL5VM";
            if (cls == obj.getClass()) {
                C2598eT c2598eT = (C2598eT) obj;
                if (this.A00 != c2598eT.A00) {
                    return false;
                }
                return this.A01.equals(c2598eT.A01);
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2108Rm
    public final String getUrl() {
        return this.A01;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }
}
