package com.bytedance.sdk.component.vt.ouw.vt;

import com.ironsource.C3978d4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.IDN;
import java.net.InetAddress;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class bly {
    public static final Charset ouw = Charset.forName("UTF-8");

    public static int ouw(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (c10 < 'a' || c10 > 'f') {
            c11 = 'A';
            if (c10 < 'A' || c10 > 'F') {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    public static int ouw(String str, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i11;
            }
        }
        return i10;
    }

    public static int ouw(String str, int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            char cCharAt = str.charAt(i12);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i12 + 1;
            }
        }
        return i10;
    }

    public static int ouw(String str, int i10, int i11, char c10) {
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int ouw(String str, int i10, int i11, String str2) {
        while (i10 < i11) {
            if (str2.indexOf(str.charAt(i10)) != -1) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static String ouw(String str) {
        if (!str.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                if (vt(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        int i10 = 0;
        int i11 = 1;
        InetAddress inetAddressVt = (str.startsWith(C3978d4.j.f31383d) && str.endsWith(C3978d4.j.f31385e)) ? vt(str, 1, str.length() - 1) : vt(str, 0, str.length());
        if (inetAddressVt == null) {
            return null;
        }
        byte[] address = inetAddressVt.getAddress();
        int i12 = 16;
        if (address.length != 16) {
            throw new AssertionError("Invalid IPv6 address: '" + str + "'");
        }
        int i13 = -1;
        int i14 = 0;
        int i15 = 0;
        while (i14 < address.length) {
            int i16 = i14;
            while (i16 < 16 && address[i16] == 0 && address[i16 + 1] == 0) {
                i16 += 2;
            }
            int i17 = i16 - i14;
            if (i17 > i15 && i17 >= 4) {
                i13 = i14;
                i15 = i17;
            }
            i14 = i16 + 2;
        }
        ouw ouwVar = new ouw();
        while (i10 < address.length) {
            if (i10 == i13) {
                ouwVar.vt(58);
                i10 += i15;
                if (i10 == i12) {
                    ouwVar.vt(58);
                }
            } else {
                if (i10 > 0) {
                    ouwVar.vt(58);
                }
                long j10 = ((address[i10] & 255) << 8) | (address[i10 + 1] & 255);
                if (j10 == 0) {
                    ouwVar.vt(48);
                } else {
                    int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j10)) / 4) + i11;
                    fkw fkwVarLh = ouwVar.lh(iNumberOfTrailingZeros);
                    byte[] bArr = fkwVarLh.ouw;
                    int i18 = fkwVarLh.f12830lh;
                    for (int i19 = (i18 + iNumberOfTrailingZeros) - i11; i19 >= i18; i19--) {
                        bArr[i19] = ouw.ouw[(int) (j10 & 15)];
                        j10 >>>= 4;
                    }
                    fkwVarLh.f12830lh += iNumberOfTrailingZeros;
                    ouwVar.f12832lh += (long) iNumberOfTrailingZeros;
                }
                i10 += 2;
                i11 = 1;
                i12 = 16;
            }
        }
        return ouwVar.lh();
    }

    public static void ouw(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static boolean ouw(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArr[i13 + i10] != bArr2[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0099, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d7, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.net.InetAddress vt(java.lang.String r16, int r17, int r18) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.vt.ouw.vt.bly.vt(java.lang.String, int, int):java.net.InetAddress");
    }

    private static boolean vt(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                return true;
            }
        }
        return false;
    }
}
