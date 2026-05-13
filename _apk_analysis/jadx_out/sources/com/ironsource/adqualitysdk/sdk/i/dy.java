package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes8.dex */
public final class dy {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1913 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1914 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f1915 = -4020653531021365266L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f1916 = {':'};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1917;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private d f1918;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private int f1919;

    public enum d {
        f1930,
        f1932,
        f1928,
        f1931,
        f1929,
        f1927,
        f1924,
        f1926;


        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private static long f1920 = 0;

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private static int f1921 = 0;

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private static int f1922 = 1;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static char[] f1925;

        static {
            m6207();
            int i10 = f1922 + 47;
            f1921 = i10 % 128;
            int i11 = i10 % 2;
        }

        public static d valueOf(String str) {
            int i10 = f1922 + 63;
            f1921 = i10 % 128;
            if ((i10 % 2 != 0 ? (char) 20 : (char) 21) == 21) {
                return (d) Enum.valueOf(d.class, str);
            }
            Enum.valueOf(d.class, str);
            throw null;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            int i10 = f1922 + 3;
            f1921 = i10 % 128;
            int i11 = i10 % 2;
            d[] dVarArr = (d[]) values().clone();
            int i12 = f1922 + 29;
            f1921 = i12 % 128;
            int i13 = i12 % 2;
            return dVarArr;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public static void m6207() {
            f1925 = new char[]{'K', 27119, 54029, 15529, 42727, 4096, 31160, 'I', 27118, 54033, 15536, 42748, 4123, 31162, 58351, 19733, 46760, 'O', 27130, 54033, 15532, 42729, 4102, 31155, 58356, 35968, 58669, 24533, 45156, 10805, 40134, 'I', 27108, 54016, 15547, 42735, 4119, 31150, 'D', 27109, 54017, 15548, 42724, 4119, 10707, 16500, 64138, 5411, 36732, 14722, 20515, 12478, 22811, 58344, 3152, 38406};
            f1920 = 5818881436904352170L;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m6208(int i10, char c10, int i11) {
            String str;
            synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1675) {
                char[] cArr = new char[i11];
                com.ironsource.adqualitysdk.sdk.i.d.f1674 = 0;
                while (true) {
                    int i12 = com.ironsource.adqualitysdk.sdk.i.d.f1674;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f1925[i10 + i12]) ^ (((long) i12) * f1920)) ^ ((long) c10));
                        com.ironsource.adqualitysdk.sdk.i.d.f1674 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            }
            return str;
        }
    }

    public dy(d dVar, String str, int i10) {
        this.f1918 = dVar;
        this.f1917 = str;
        this.f1919 = i10;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6193(int i10, char c10, int i11) {
        String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1675) {
            char[] cArr = new char[i11];
            com.ironsource.adqualitysdk.sdk.i.d.f1674 = 0;
            while (true) {
                int i12 = com.ironsource.adqualitysdk.sdk.i.d.f1674;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f1916[i10 + i12]) ^ (((long) i12) * f1915)) ^ ((long) c10));
                    com.ironsource.adqualitysdk.sdk.i.d.f1674 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1918);
        sb2.append(m6193(ViewConfiguration.getTapTimeout() >> 16, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1 - View.resolveSize(0, 0)).intern());
        sb2.append(this.f1917);
        String string = sb2.toString();
        int i10 = f1913 + 87;
        f1914 = i10 % 128;
        int i11 = i10 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public final boolean m6194() {
        int i10 = f1913 + 69;
        f1914 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            m6202();
            d dVar = d.f1930;
            throw null;
        }
        if (m6202() == d.f1930) {
            return true;
        }
        int i11 = f1914 + 49;
        f1913 = i11 % 128;
        if (i11 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public final boolean m6195() {
        int i10 = f1914 + 79;
        f1913 = i10 % 128;
        if (i10 % 2 == 0) {
            m6202();
            d dVar = d.f1930;
            throw null;
        }
        if (!(m6202() == d.f1932)) {
            return false;
        }
        int i11 = f1913 + 7;
        f1914 = i11 % 128;
        int i12 = i11 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final boolean m6196() {
        if (m6202() != d.f1924) {
            return false;
        }
        int i10 = f1914 + 7;
        int i11 = i10 % 128;
        f1913 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 29;
        f1914 = i13 % 128;
        int i14 = i13 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final boolean m6197() {
        int i10 = f1913 + 77;
        f1914 = i10 % 128;
        int i11 = i10 % 2;
        if ((m6202() == d.f1928 ? (char) 7 : '@') != '@') {
            int i12 = f1914 + 59;
            f1913 = i12 % 128;
            int i13 = i12 % 2;
            return true;
        }
        int i14 = f1914 + 33;
        f1913 = i14 % 128;
        int i15 = i14 % 2;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        if ((m6202() != com.ironsource.adqualitysdk.sdk.i.dy.d.f1927) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
    
        if (m6202() == com.ironsource.adqualitysdk.sdk.i.dy.d.f1927) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.i.dy.f1914 + 9;
        com.ironsource.adqualitysdk.sdk.i.dy.f1913 = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m6198() {
        /*
            r5 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.dy.f1914
            int r0 = r0 + 105
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.dy.f1913 = r1
            int r0 = r0 % 2
            r1 = 79
            if (r0 != 0) goto L11
            r0 = 49
            goto L12
        L11:
            r0 = r1
        L12:
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L29
            com.ironsource.adqualitysdk.sdk.i.dy$d r0 = r5.m6202()
            com.ironsource.adqualitysdk.sdk.i.dy$d r1 = com.ironsource.adqualitysdk.sdk.i.dy.d.f1927
            r4 = 87
            int r4 = r4 / r3
            if (r0 != r1) goto L23
            r0 = r3
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 == 0) goto L31
            goto L3c
        L27:
            r0 = move-exception
            throw r0
        L29:
            com.ironsource.adqualitysdk.sdk.i.dy$d r0 = r5.m6202()
            com.ironsource.adqualitysdk.sdk.i.dy$d r1 = com.ironsource.adqualitysdk.sdk.i.dy.d.f1927
            if (r0 != r1) goto L3c
        L31:
            int r0 = com.ironsource.adqualitysdk.sdk.i.dy.f1914
            int r0 = r0 + 9
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.dy.f1913 = r1
            int r0 = r0 % 2
            return r2
        L3c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dy.m6198():boolean");
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final boolean m6199() {
        int i10 = f1914 + 21;
        f1913 = i10 % 128;
        if (i10 % 2 == 0) {
            m6202();
            d dVar = d.f1930;
            throw null;
        }
        if ((m6202() == d.f1926 ? ']' : (char) 26) != ']') {
            return false;
        }
        int i11 = f1914 + 19;
        f1913 = i11 % 128;
        return i11 % 2 != 0;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final boolean m6200() {
        int i10 = f1914 + 99;
        f1913 = i10 % 128;
        int i11 = i10 % 2;
        if (!(m6202() != d.f1929)) {
            return true;
        }
        int i12 = f1913 + 11;
        f1914 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 14 : '\r') != 14) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m6201() {
        int i10 = f1913 + 105;
        f1914 = i10 % 128;
        int i11 = i10 % 2;
        if (!m6205()) {
            int i12 = f1914 + 73;
            f1913 = i12 % 128;
            int i13 = i12 % 2;
            if (!(m6200())) {
                if ((!m6198() ? '\r' : (char) 27) == '\r') {
                    int i14 = f1913 + 19;
                    f1914 = i14 % 128;
                    if (i14 % 2 != 0) {
                        m6196();
                        throw null;
                    }
                    if ((m6196() ? (char) 25 : (char) 26) == 26) {
                        return false;
                    }
                }
            }
        }
        int i15 = f1914 + 19;
        f1913 = i15 % 128;
        int i16 = i15 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final d m6202() {
        int i10 = f1914;
        int i11 = i10 + 105;
        f1913 = i11 % 128;
        if (!(i11 % 2 != 0)) {
            throw null;
        }
        d dVar = this.f1918;
        int i12 = i10 + 81;
        f1913 = i12 % 128;
        if ((i12 % 2 == 0 ? '+' : '`') == '`') {
            return dVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m6203() {
        int i10 = f1914 + 69;
        int i11 = i10 % 128;
        f1913 = i11;
        int i12 = i10 % 2;
        String str = this.f1917;
        int i13 = i11 + 97;
        f1914 = i13 % 128;
        if ((i13 % 2 != 0 ? '@' : ' ') == ' ') {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final int m6204() {
        int i10 = f1914;
        int i11 = i10 + 13;
        f1913 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = this.f1919;
        int i14 = i10 + 107;
        f1913 = i14 % 128;
        if (i14 % 2 != 0) {
            return i13;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m6205() {
        int i10 = f1913 + 71;
        f1914 = i10 % 128;
        int i11 = i10 % 2;
        if ((m6202() == d.f1931 ? 'R' : 'L') == 'R') {
            int i12 = f1913 + 125;
            f1914 = i12 % 128;
            return i12 % 2 == 0;
        }
        int i13 = f1914 + 27;
        f1913 = i13 % 128;
        if (i13 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m6206(String str) {
        int i10 = f1914 + 13;
        f1913 = i10 % 128;
        int i11 = i10 % 2;
        boolean zEquals = this.f1917.equals(str);
        int i12 = f1913 + 95;
        f1914 = i12 % 128;
        if ((i12 % 2 != 0 ? 'O' : 'T') != 'O') {
            return zEquals;
        }
        throw null;
    }
}
