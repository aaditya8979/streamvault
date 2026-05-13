package com.ironsource.adqualitysdk.sdk.i;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class di extends cz implements cl {

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private static int f1745 = 1;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static char[] f1746 = {'t', 226, 226, 208, 200, 204, 204, '!', 'R', 'g', 'n', 'h', 'e', 'h', 'j', 'a', 'f', 't', 'j', 'l', 'l', 'l', 143, 141, 152, 161, '|', 150, 143, 145, 137, 152, 149, 137, 'k', 156, 141, 146, 278, 285, 299, 300, 302, 302, 307, 299, 301, 301, 274, 282, 300, 300, 261, 274, 227, 276, 261, 275, 260, 233, 261, 278, 265, 276, 257, 156, 304, 283, 289, 311, 311, 309, 289, 290, 305, 'V', 165, 165, 156, 148, 164, 172, 166, 165, 172, 151, 143, 's', 163, 148, 162, 147, 'x', 159, 162, 134, 262, 262, 246, 245, 267, 243, 236, 257, 264, 258, 255, 258, 260, 245, 240, '2', 'd', 'f', 'm', 'a', 'Z', 'f', 'U', '[', 'l', 'l', '2', 'd', 'f', 'm', 'a', 'Z', 'f', 'U', '[', 'l', 'f', 157, 311, 301, 301, 284, 278, 295, 276, 285, 308, 307, 300, 298, 297};

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static long f1747 = 5147170450295727915L;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f1748;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private String f1749;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private String f1750;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private String f1751;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String f1752;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String f1753;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String f1754;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String f1755;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1756;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f1757;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1758;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1759;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1760;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private Object m6000() {
        int i10 = f1748 + 69;
        int i11 = i10 % 128;
        f1745 = i11;
        int i12 = i10 % 2;
        String str = this.f1750;
        int i13 = i11 + 101;
        f1748 = i13 % 128;
        if (!(i13 % 2 != 0)) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private JSONObject m6001() {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.putOpt(ih.f2536, this.f1756);
            jSONObjectJsonObjectInit.putOpt(ih.f2535, this.f1759);
            jSONObjectJsonObjectInit.putOpt(ih.f2541, this.f1760);
            jSONObjectJsonObjectInit.putOpt(ih.f2540, this.f1757);
            jSONObjectJsonObjectInit.putOpt(ih.f2539, this.f1753);
            jSONObjectJsonObjectInit.putOpt(ih.f2534, this.f1752);
            jSONObjectJsonObjectInit.putOpt(ih.f2533, this.f1754);
            jSONObjectJsonObjectInit.putOpt(ih.f2532, this.f1751);
            jSONObjectJsonObjectInit.putOpt(ih.f2527, this.f1755);
        } catch (JSONException unused) {
        }
        int i10 = f1745 + 71;
        f1748 = i10 % 128;
        int i11 = i10 % 2;
        return jSONObjectJsonObjectInit;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private void m6002(String str) {
        int i10 = f1748;
        int i11 = i10 + 25;
        f1745 = i11 % 128;
        char c10 = i11 % 2 == 0 ? '.' : '\n';
        this.f1749 = str;
        if (c10 != '\n') {
            throw null;
        }
        int i12 = i10 + 77;
        f1745 = i12 % 128;
        if ((i12 % 2 == 0 ? '/' : 'D') != 'D') {
            int i13 = 74 / 0;
        }
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private Object m6003() {
        int i10 = f1748;
        int i11 = i10 + 5;
        f1745 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        String str = this.f1749;
        int i12 = i10 + 27;
        f1745 = i12 % 128;
        int i13 = i12 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private void m6004(String str) {
        int i10 = f1745 + 67;
        f1748 = i10 % 128;
        char c10 = i10 % 2 != 0 ? '#' : 'O';
        this.f1750 = str;
        if (c10 != 'O') {
            int i11 = 65 / 0;
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private String m6005() {
        int i10 = f1745;
        int i11 = i10 + 7;
        f1748 = i11 % 128;
        if ((i11 % 2 != 0 ? '3' : 'Y') != 'Y') {
            throw null;
        }
        String str = this.f1752;
        int i12 = i10 + 121;
        f1748 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private void m6006(String str) {
        int i10 = f1748 + 31;
        f1745 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        this.f1754 = str;
        if (z10) {
            return;
        }
        int i11 = 76 / 0;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String m6007() {
        int i10 = f1748 + 91;
        int i11 = i10 % 128;
        f1745 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        String str = this.f1754;
        int i12 = i11 + 49;
        f1748 = i12 % 128;
        if ((i12 % 2 != 0 ? 'I' : (char) 20) != 'I') {
            return str;
        }
        int i13 = 86 / 0;
        return str;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private void m6008(String str) {
        int i10 = f1748 + 93;
        int i11 = i10 % 128;
        f1745 = i11;
        int i12 = i10 % 2;
        this.f1753 = str;
        int i13 = i11 + 89;
        f1748 = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String m6009() {
        int i10 = f1745;
        int i11 = i10 + 15;
        f1748 = i11 % 128;
        int i12 = i11 % 2;
        String str = this.f1753;
        int i13 = i10 + 91;
        f1748 = i13 % 128;
        if ((i13 % 2 != 0 ? ')' : '\'') == '\'') {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private void m6010(String str) {
        int i10 = f1748;
        int i11 = i10 + 1;
        f1745 = i11 % 128;
        char c10 = i11 % 2 == 0 ? (char) 29 : (char) 16;
        this.f1752 = str;
        if (c10 == 29) {
            int i12 = 46 / 0;
        }
        int i13 = i10 + 63;
        f1745 = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String m6011() {
        int i10 = f1745 + 83;
        int i11 = i10 % 128;
        f1748 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        String str = this.f1755;
        int i12 = i11 + 5;
        f1745 = i12 % 128;
        int i13 = i12 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private void m6012(String str) {
        int i10 = f1748;
        int i11 = i10 + 75;
        f1745 = i11 % 128;
        int i12 = i11 % 2;
        this.f1751 = str;
        int i13 = i10 + 65;
        f1745 = i13 % 128;
        if ((i13 % 2 == 0 ? '\"' : 'E') != '\"') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String m6013() {
        int i10 = f1745 + 87;
        int i11 = i10 % 128;
        f1748 = i11;
        if (!(i10 % 2 == 0)) {
            throw null;
        }
        String str = this.f1751;
        int i12 = i11 + 87;
        f1745 = i12 % 128;
        if ((i12 % 2 == 0 ? '2' : '_') == '_') {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private void m6014(String str) {
        int i10 = f1748;
        int i11 = i10 + 55;
        f1745 = i11 % 128;
        int i12 = i11 % 2;
        this.f1755 = str;
        int i13 = i10 + 111;
        f1745 = i13 % 128;
        if (!(i13 % 2 == 0)) {
            return;
        }
        int i14 = 38 / 0;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String m6015() {
        int i10 = f1745 + 53;
        int i11 = i10 % 128;
        f1748 = i11;
        int i12 = i10 % 2;
        String str = this.f1759;
        int i13 = i11 + 87;
        f1745 = i13 % 128;
        if (i13 % 2 != 0) {
            return str;
        }
        int i14 = 6 / 0;
        return str;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6016(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2306) {
            char[] cArrM6319 = h.m6319(f1747, cArr, i10);
            h.f2307 = 4;
            while (true) {
                int i11 = h.f2307;
                if (i11 < cArrM6319.length) {
                    h.f2305 = i11 - 4;
                    cArrM6319[h.f2307] = (char) (((long) (cArrM6319[r1] ^ cArrM6319[r1 % 4])) ^ (((long) h.f2305) * f1747));
                    h.f2307++;
                } else {
                    str2 = new String(cArrM6319, 4, cArrM6319.length - 4);
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m6017(String str) {
        int i10 = f1745;
        int i11 = i10 + 103;
        f1748 = i11 % 128;
        int i12 = i11 % 2;
        this.f1757 = str;
        int i13 = i10 + 99;
        f1748 = i13 % 128;
        if ((i13 % 2 != 0 ? (char) 26 : 'D') != 26) {
            return;
        }
        int i14 = 70 / 0;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String m6018() {
        int i10 = f1745 + 39;
        int i11 = i10 % 128;
        f1748 = i11;
        int i12 = i10 % 2;
        String str = this.f1757;
        int i13 = i11 + 91;
        f1745 = i13 % 128;
        if (i13 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m6019(String str) {
        int i10 = f1745 + 1;
        int i11 = i10 % 128;
        f1748 = i11;
        boolean z10 = i10 % 2 != 0;
        this.f1758 = str;
        if (z10) {
            throw null;
        }
        int i12 = i11 + 103;
        f1745 = i12 % 128;
        if (i12 % 2 != 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String m6020() {
        int i10 = f1745 + 1;
        f1748 = i10 % 128;
        if ((i10 % 2 != 0 ? 'M' : (char) 16) == 16) {
            return this.f1760;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m6021(String str) {
        int i10 = f1745 + 105;
        f1748 = i10 % 128;
        char c10 = i10 % 2 != 0 ? '\f' : 'T';
        this.f1760 = str;
        if (c10 == 'T') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String m6022() {
        int i10 = f1748 + 107;
        f1745 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1756;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m6023(String str) {
        int i10 = f1748 + 113;
        int i11 = i10 % 128;
        f1745 = i11;
        int i12 = i10 % 2;
        this.f1756 = str;
        int i13 = i11 + 63;
        f1748 = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Object m6024() {
        String str;
        int i10 = f1745;
        int i11 = i10 + 63;
        f1748 = i11 % 128;
        if ((i11 % 2 != 0 ? '4' : (char) 15) != '4') {
            str = this.f1758;
        } else {
            str = this.f1758;
            int i12 = 54 / 0;
        }
        int i13 = i10 + 35;
        f1748 = i13 % 128;
        if ((i13 % 2 != 0 ? 'S' : (char) 19) != 'S') {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6025(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (i.f2470) {
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            int i13 = iArr[3];
            char[] cArr = new char[i11];
            System.arraycopy(f1746, i10, cArr, 0, i11);
            if (bArr != null) {
                char[] cArr2 = new char[i11];
                i.f2469 = 0;
                char c10 = 0;
                while (true) {
                    int i14 = i.f2469;
                    if (i14 >= i11) {
                        break;
                    }
                    if (bArr[i14] == 1) {
                        cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                    } else {
                        cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                    }
                    c10 = cArr2[i14];
                    i.f2469 = i14 + 1;
                }
                cArr = cArr2;
            }
            if (i13 > 0) {
                char[] cArr3 = new char[i11];
                System.arraycopy(cArr, 0, cArr3, 0, i11);
                int i15 = i11 - i13;
                System.arraycopy(cArr3, 0, cArr, i15, i13);
                System.arraycopy(cArr3, i13, cArr, 0, i15);
            }
            if (z10) {
                char[] cArr4 = new char[i11];
                i.f2469 = 0;
                while (true) {
                    int i16 = i.f2469;
                    if (i16 >= i11) {
                        break;
                    }
                    cArr4[i16] = cArr[(i11 - i16) - 1];
                    i.f2469 = i16 + 1;
                }
                cArr = cArr4;
            }
            if (i12 > 0) {
                i.f2469 = 0;
                while (true) {
                    int i17 = i.f2469;
                    if (i17 >= i11) {
                        break;
                    }
                    cArr[i17] = (char) (cArr[i17] - iArr[2]);
                    i.f2469 = i17 + 1;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m6026(String str) {
        int i10 = f1748 + 99;
        f1745 = i10 % 128;
        char c10 = i10 % 2 == 0 ? 'T' : (char) 26;
        this.f1759 = str;
        if (c10 == 26) {
        } else {
            throw null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0326  */
    @Override // com.ironsource.adqualitysdk.sdk.i.cl
    /* JADX INFO: renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo4888(java.lang.String r19, java.util.List<java.lang.Object> r20, com.ironsource.adqualitysdk.sdk.i.ch r21) {
        /*
            Method dump skipped, instruction units count: 1302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.di.mo4888(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
    }
}
