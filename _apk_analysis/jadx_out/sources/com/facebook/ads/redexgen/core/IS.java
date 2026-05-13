package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class IS {
    public static String[] A00 = {"oZj5aoX1KvbFHq33YkjSnnR9n2", "YrN4", "d5f6mUL", "wzC2np4aQz", "bSG0VkmAa5PTnnRqB4khFtTiUFve1XQW", "Qyz6G41qMcU917EtFwNhHmzpy", "Reep", "5AjdKovxhleFLdRt3FcvPVZSBJ"};

    public static IR A00(int i10, long[] jArr, int[] iArr, long j10) {
        int i11 = 8192 / i10;
        int iA05 = 0;
        for (int i12 : iArr) {
            iA05 += AbstractC15184a.A05(i12, i11);
        }
        long[] jArr2 = new long[iA05];
        int[] iArr2 = new int[iA05];
        int iMax = 0;
        long[] jArr3 = new long[iA05];
        int[] iArr3 = new int[iA05];
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        String[] strArr = A00;
        if (strArr[2].length() != strArr[3].length()) {
            String[] strArr2 = A00;
            strArr2[2] = "OG99HZu";
            strArr2[3] = "ptKGW28cJb";
            while (true) {
                int length = iArr.length;
                String[] strArr3 = A00;
                if (strArr3[2].length() == strArr3[3].length()) {
                    break;
                }
                A00[5] = "uTdlUcyBkPhiZ9U2ydDZL";
                if (i15 >= length) {
                    return new IR(jArr2, iArr2, iMax, jArr3, iArr3, j10 * ((long) i13));
                }
                int i16 = iArr[i15];
                if (A00[5].length() == 5) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A00;
                strArr4[2] = "PmQbGcH";
                strArr4[3] = "fT2ewQCR49";
                long j11 = jArr[i15];
                while (i16 > 0) {
                    int iMin = Math.min(i11, i16);
                    jArr2[i14] = j11;
                    iArr2[i14] = i10 * iMin;
                    iMax = Math.max(iMax, iArr2[i14]);
                    jArr3[i14] = ((long) i13) * j10;
                    iArr3[i14] = 1;
                    j11 += (long) iArr2[i14];
                    i13 += iMin;
                    i16 -= iMin;
                    i14++;
                }
                i15++;
            }
        }
        throw new RuntimeException();
    }
}
