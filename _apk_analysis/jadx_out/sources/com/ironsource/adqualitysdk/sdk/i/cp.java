package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.i.cn;
import com.ironsource.adqualitysdk.sdk.i.hy;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class cp {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private int f1404;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private List<String> f1405;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private hy.c f1406;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private cn f1407;

    public static class e extends cz implements cl {

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f1408 = 0;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f1409 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static char f1410 = 6;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static char[] f1411 = {'s', 'e', 't', 'M', 'i', 'n', 'D', 'p', 'h', 'F', 'o', 'r', 'S', 'u', 'C', 'l', 'a', 'c', 'W', 'k', 'R', 'f', 'w', 'I', 'A', 'y', 'O', 'b', 'j', 'g', 'm', 'v', 'x', 'z', '{', '|'};

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f1412 = 57;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private cn.e f1413;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private cp f1414;

        public e(List<String> list, int i10) {
            cp cpVar = new cp();
            this.f1414 = cpVar;
            cpVar.f1406 = new hy.c();
            this.f1414.f1405 = list;
            this.f1414.f1404 = i10;
            this.f1413 = new cn.e();
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private cp m5710() {
            int i10 = f1409 + 37;
            f1408 = i10 % 128;
            int i11 = i10 % 2;
            this.f1414.f1407 = this.f1413.m5696();
            cp cpVar = this.f1414;
            int i12 = f1408 + 91;
            f1409 = i12 % 128;
            int i13 = i12 % 2;
            return cpVar;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m5711(String str, int i10, byte b10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (g.f2151) {
                char[] cArr2 = f1411;
                char c10 = f1410;
                char[] cArr3 = new char[i10];
                if (i10 % 2 != 0) {
                    i10--;
                    cArr3[i10] = (char) (cArr[i10] - b10);
                }
                if (i10 > 1) {
                    g.f2156 = 0;
                    while (true) {
                        int i11 = g.f2156;
                        if (i11 >= i10) {
                            break;
                        }
                        g.f2155 = cArr[i11];
                        g.f2153 = cArr[g.f2156 + 1];
                        if (g.f2155 == g.f2153) {
                            cArr3[g.f2156] = (char) (g.f2155 - b10);
                            cArr3[g.f2156 + 1] = (char) (g.f2153 - b10);
                        } else {
                            g.f2154 = g.f2155 / c10;
                            g.f2152 = g.f2155 % c10;
                            g.f2157 = g.f2153 / c10;
                            g.f2150 = g.f2153 % c10;
                            if (g.f2152 == g.f2150) {
                                g.f2154 = ((g.f2154 + c10) - 1) % c10;
                                g.f2157 = ((g.f2157 + c10) - 1) % c10;
                                int i12 = (g.f2154 * c10) + g.f2152;
                                int i13 = (g.f2157 * c10) + g.f2150;
                                int i14 = g.f2156;
                                cArr3[i14] = cArr2[i12];
                                cArr3[i14 + 1] = cArr2[i13];
                            } else if (g.f2154 == g.f2157) {
                                g.f2152 = ((g.f2152 + c10) - 1) % c10;
                                g.f2150 = ((g.f2150 + c10) - 1) % c10;
                                int i15 = (g.f2154 * c10) + g.f2152;
                                int i16 = (g.f2157 * c10) + g.f2150;
                                int i17 = g.f2156;
                                cArr3[i17] = cArr2[i15];
                                cArr3[i17 + 1] = cArr2[i16];
                            } else {
                                int i18 = (g.f2154 * c10) + g.f2150;
                                int i19 = (g.f2157 * c10) + g.f2152;
                                int i20 = g.f2156;
                                cArr3[i20] = cArr2[i18];
                                cArr3[i20 + 1] = cArr2[i19];
                            }
                        }
                        g.f2156 += 2;
                    }
                }
                str2 = new String(cArr3);
            }
            return str2;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m5712(String str, int i10, boolean z10, int i11, int i12) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (b.f728) {
                char[] cArr2 = new char[i10];
                b.f726 = 0;
                while (true) {
                    int i13 = b.f726;
                    if (i13 >= i10) {
                        break;
                    }
                    b.f727 = cArr[i13];
                    cArr2[b.f726] = (char) (b.f727 + i12);
                    int i14 = b.f726;
                    cArr2[i14] = (char) (cArr2[i14] - f1412);
                    b.f726 = i14 + 1;
                }
                if (i11 > 0) {
                    b.f729 = i11;
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr2, 0, cArr3, 0, i10);
                    int i15 = b.f729;
                    System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                    int i16 = b.f729;
                    System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i10];
                    b.f726 = 0;
                    while (true) {
                        int i17 = b.f726;
                        if (i17 >= i10) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i10 - i17) - 1];
                        b.f726 = i17 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            }
            return str2;
        }

        /* JADX WARN: Removed duplicated region for block: B:102:0x0335  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0148  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0173  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x01a9  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x01d6  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0200  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x022c  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0255  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x027a  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x02a0  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x02a3  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x02d7  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0304  */
        @Override // com.ironsource.adqualitysdk.sdk.i.cl
        /* JADX INFO: renamed from: ﻐ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object mo4888(java.lang.String r24, java.util.List<java.lang.Object> r25, com.ironsource.adqualitysdk.sdk.i.ch r26) {
            /*
                Method dump skipped, instruction units count: 1404
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cp.e.mo4888(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final cn m5708() {
        return this.f1407;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final hy m5709(ia iaVar) {
        return this.f1406.m6501(iaVar, this.f1405, this.f1404);
    }
}
