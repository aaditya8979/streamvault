package com.ironsource.adqualitysdk.sdk.i;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class df extends cz {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f1701 = 54888;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f1702 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1703 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1704 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1705 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m5953(String str, char c10, String str2, int i10, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (j.f2695) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c10 ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i10));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            j.f2697 = 0;
            while (true) {
                int i11 = j.f2697;
                if (i11 < length) {
                    int i12 = (i11 + 2) % 4;
                    int i13 = (i11 + 3) % 4;
                    int i14 = cArr4[i11 % 4] * 32718;
                    char c11 = cArr5[i12];
                    char c12 = (char) ((i14 + c11) % 65535);
                    j.f2696 = c12;
                    cArr5[i13] = (char) (((cArr4[i13] * 32718) + c11) / 65535);
                    cArr4[i13] = c12;
                    int i15 = j.f2697;
                    cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f1702) ^ ((long) f1704)) ^ ((long) f1701));
                    j.f2697 = i15 + 1;
                } else {
                    str4 = new String(cArr6);
                }
            }
        }
        return str4;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f A[PHI: r6
      0x002f: PHI (r6v2 long) = (r6v0 long), (r6v3 long) binds: [B:15:0x002d, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040 A[PHI: r6
      0x0040: PHI (r6v1 long) = (r6v0 long), (r6v2 long), (r6v3 long) binds: [B:15:0x002d, B:17:0x0033, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long m5954(java.util.List<java.lang.Object> r8) {
        /*
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            int r1 = com.ironsource.adqualitysdk.sdk.i.df.f1705
            int r1 = r1 + 5
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.df.f1703 = r2
            r2 = 2
            int r1 = r1 % r2
            r3 = 23
            if (r1 == 0) goto L12
            r1 = r3
            goto L13
        L12:
            r1 = r2
        L13:
            r4 = 16
            r5 = 1
            if (r1 == r3) goto L27
            r6 = 0
            int r1 = r8.size()
            if (r1 <= r5) goto L22
            r1 = r4
            goto L24
        L22:
            r1 = 60
        L24:
            if (r1 == r4) goto L2f
            goto L40
        L27:
            r6 = 1
            int r1 = r8.size()
            if (r1 <= 0) goto L40
        L2f:
            boolean r1 = com.ironsource.adqualitysdk.sdk.i.cz.m5926(r8, r5, r0)
            if (r1 == 0) goto L40
            java.lang.Object r8 = com.ironsource.adqualitysdk.sdk.i.cz.m5927(r8, r5, r0)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            goto L5e
        L40:
            int r1 = r8.size()
            r3 = 21
            if (r1 <= r2) goto L49
            goto L4a
        L49:
            r4 = r3
        L4a:
            if (r4 == r3) goto L60
            int r1 = com.ironsource.adqualitysdk.sdk.i.df.f1705
            int r1 = r1 + r3
            int r3 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.df.f1703 = r3
            int r1 = r1 % r2
            java.lang.Object r8 = com.ironsource.adqualitysdk.sdk.i.cz.m5927(r8, r2, r0)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
        L5e:
            long r0 = (long) r8
            goto L61
        L60:
            r0 = r6
        L61:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.df.m5954(java.util.List):long");
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final Object m5955(cq cqVar, List<Object> list, du duVar) {
        int i10 = f1705 + 109;
        f1703 = i10 % 128;
        int i11 = i10 % 2;
        t.m7072(m5960(cqVar, list, duVar), m5954(list));
        int i12 = f1705 + 63;
        f1703 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 31 : (char) 29) == 29) {
            return null;
        }
        int i13 = 70 / 0;
        return null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final Object m5956(cq cqVar, List<Object> list, du duVar) {
        int i10 = f1703 + 45;
        f1705 = i10 % 128;
        if ((i10 % 2 == 0 ? 'V' : '@') == '@') {
            t.m7071(m5960(cqVar, list, duVar));
            return null;
        }
        t.m7071(m5960(cqVar, list, duVar));
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final Object m5957(cq cqVar, List<Object> list, du duVar) {
        int i10 = f1705 + 123;
        f1703 = i10 % 128;
        int i11 = i10 % 2;
        t.m7076(m5960(cqVar, list, duVar));
        int i12 = f1703 + 41;
        f1705 = i12 % 128;
        if ((i12 % 2 == 0 ? 'M' : 'U') != 'M') {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final Object m5958(cq cqVar, List<Object> list, du duVar) {
        int i10 = f1703 + 9;
        f1705 = i10 % 128;
        int i11 = i10 % 2;
        t.m7070(m5960(cqVar, list, duVar), m5954(list));
        int i12 = f1705 + 113;
        f1703 = i12 % 128;
        if (i12 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Object m5959(cq cqVar, List<Object> list, du duVar) {
        int i10 = f1703 + 63;
        f1705 = i10 % 128;
        int i11 = i10 % 2;
        t.m7069(m5960(cqVar, list, duVar));
        int i12 = f1703 + 89;
        f1705 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 27 : 'T') == 'T') {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if ((com.ironsource.adqualitysdk.sdk.i.cz.m5926(r8, 0, com.ironsource.adqualitysdk.sdk.i.ir.class)) != true) goto L18;
     */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ironsource.adqualitysdk.sdk.i.ir m5960(final com.ironsource.adqualitysdk.sdk.i.cq r7, java.util.List<java.lang.Object> r8, final com.ironsource.adqualitysdk.sdk.i.du r9) {
        /*
            r6 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.df.f1703
            int r0 = r0 + 43
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.df.f1705 = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 92
            if (r0 != 0) goto L10
            r0 = r2
            goto L12
        L10:
            r0 = 57
        L12:
            r3 = 1
            r4 = 0
            if (r0 == r2) goto L21
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.ir> r0 = com.ironsource.adqualitysdk.sdk.i.ir.class
            boolean r0 = com.ironsource.adqualitysdk.sdk.i.cz.m5926(r8, r4, r0)     // Catch: java.lang.Exception -> L1f
            if (r0 == 0) goto L2e
            goto L64
        L1f:
            r8 = move-exception
            goto L6d
        L21:
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.ir> r0 = com.ironsource.adqualitysdk.sdk.i.ir.class
            boolean r0 = com.ironsource.adqualitysdk.sdk.i.cz.m5926(r8, r4, r0)     // Catch: java.lang.Exception -> L1f
            if (r0 == 0) goto L2b
            r0 = r3
            goto L2c
        L2b:
            r0 = r4
        L2c:
            if (r0 == r3) goto L64
        L2e:
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.ds> r0 = com.ironsource.adqualitysdk.sdk.i.ds.class
            java.lang.Object r0 = com.ironsource.adqualitysdk.sdk.i.cz.m5927(r8, r4, r0)     // Catch: java.lang.Exception -> L1f
            com.ironsource.adqualitysdk.sdk.i.ds r0 = (com.ironsource.adqualitysdk.sdk.i.ds) r0     // Catch: java.lang.Exception -> L1f
            int r2 = r8.size()     // Catch: java.lang.Exception -> L1f
            if (r2 <= r1) goto L5a
            int r2 = com.ironsource.adqualitysdk.sdk.i.df.f1705
            int r2 = r2 + 39
            int r5 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.df.f1703 = r5
            int r2 = r2 % r1
            if (r2 == 0) goto L4d
            r2 = 5
            java.util.List r8 = com.ironsource.adqualitysdk.sdk.i.cz.m5929(r8, r2)     // Catch: java.lang.Exception -> L1f
            goto L51
        L4d:
            java.util.List r8 = com.ironsource.adqualitysdk.sdk.i.cz.m5929(r8, r1)     // Catch: java.lang.Exception -> L1f
        L51:
            int r2 = com.ironsource.adqualitysdk.sdk.i.df.f1705
            int r2 = r2 + r3
            int r3 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.df.f1703 = r3
            int r2 = r2 % r1
            goto L5e
        L5a:
            java.util.List r8 = com.ironsource.adqualitysdk.sdk.i.cz.m5929(r8, r3)     // Catch: java.lang.Exception -> L1f
        L5e:
            com.ironsource.adqualitysdk.sdk.i.df$3 r1 = new com.ironsource.adqualitysdk.sdk.i.df$3     // Catch: java.lang.Exception -> L1f
            r1.<init>()     // Catch: java.lang.Exception -> L1f
            return r1
        L64:
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.ir> r9 = com.ironsource.adqualitysdk.sdk.i.ir.class
            java.lang.Object r8 = com.ironsource.adqualitysdk.sdk.i.cz.m5927(r8, r4, r9)     // Catch: java.lang.Exception -> L1f
            com.ironsource.adqualitysdk.sdk.i.ir r8 = (com.ironsource.adqualitysdk.sdk.i.ir) r8     // Catch: java.lang.Exception -> L1f
            return r8
        L6d:
            java.lang.String r7 = r7.m5759()
            r9 = 54805(0xd615, float:7.6798E-41)
            r0 = 48
            java.lang.String r1 = ""
            int r0 = android.text.TextUtils.indexOf(r1, r0, r4)
            int r9 = r9 - r0
            char r9 = (char) r9
            int r0 = android.text.TextUtils.indexOf(r1, r1, r4)
            java.lang.String r1 = "蒶䘪䀶ᐏ�짖ᕁ曜闆蟿㝀Ꮀꤦ塭륃\u0dbcಮ郝鲥ꛆ\ue95f\ua879ϱ낶螾钅㋒䮢ä빊"
            java.lang.String r2 = "\u0000\u0000\u0000\u0000"
            java.lang.String r3 = "㨬癐\u169f\ue1d6"
            java.lang.String r9 = m5953(r1, r9, r2, r0, r3)
            java.lang.String r9 = r9.intern()
            com.ironsource.adqualitysdk.sdk.i.co.m5699(r7, r9, r8)
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.df.m5960(com.ironsource.adqualitysdk.sdk.i.cq, java.util.List, com.ironsource.adqualitysdk.sdk.i.du):com.ironsource.adqualitysdk.sdk.i.ir");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Object m5961(cq cqVar, List<Object> list, du duVar) {
        int i10 = f1705 + 77;
        f1703 = i10 % 128;
        int i11 = i10 % 2;
        t.m7067(m5960(cqVar, list, duVar));
        int i12 = f1703 + 125;
        f1705 = i12 % 128;
        int i13 = i12 % 2;
        return null;
    }
}
