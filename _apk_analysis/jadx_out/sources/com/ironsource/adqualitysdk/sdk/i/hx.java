package com.ironsource.adqualitysdk.sdk.i;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class hx<T> extends cz implements cl, hv<T> {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2436 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2437 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Field f2438;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private hv f2439;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Map f2440;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Object f2441;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Collection f2442;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char[] f2435 = {'@', 136, 139, 129, 'v', 128, 135, 129, 'e', 195, 195, 188, 178, 189, 199, 196, '3', 'f', 'l', '`', 'W', 'h', ':', 'q', 'i', 'k', 'i', 'X', 'b', 'l', 'f', '9', 's', 'j', 'g', 'h', 'd', 'f', 'f', 'l', '^', '['};

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int[] f2434 = {880806038, -1346773498, 393884870, 1928313090, -1158234337, 2087444272, -1142299011, -1576855235, -2025666139, -1576528800, -891045724, 435791960, 1629575653, -1385996207, -571437608, 532789962, 1203766405, -134582387};

    public hx(Field field, Object obj, hv hvVar) {
        this.f2438 = field;
        this.f2441 = obj;
        this.f2439 = hvVar;
    }

    public hx(Collection collection, Object obj, hv hvVar) {
        this.f2442 = collection;
        this.f2441 = obj;
        this.f2439 = hvVar;
    }

    public hx(Map map, Object obj, hv hvVar) {
        this.f2440 = map;
        this.f2441 = obj;
        this.f2439 = hvVar;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private hv m6440() {
        int i10 = f2437;
        int i11 = i10 + 67;
        f2436 = i11 % 128;
        int i12 = i11 % 2;
        hv hvVar = this.f2439;
        int i13 = i10 + 113;
        f2436 = i13 % 128;
        int i14 = i13 % 2;
        return hvVar;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private Collection m6441() {
        int i10 = f2436 + 87;
        int i11 = i10 % 128;
        f2437 = i11;
        if (!(i10 % 2 != 0)) {
            throw null;
        }
        Collection collection = this.f2442;
        int i12 = i11 + 31;
        f2436 = i12 % 128;
        int i13 = i12 % 2;
        return collection;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private Object m6442() {
        int i10 = f2437;
        int i11 = i10 + 31;
        f2436 = i11 % 128;
        int i12 = i11 % 2;
        Object obj = this.f2441;
        int i13 = i10 + 73;
        f2436 = i13 % 128;
        int i14 = i13 % 2;
        return obj;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private Map m6443() {
        Map map;
        int i10 = f2437;
        int i11 = i10 + 79;
        f2436 = i11 % 128;
        if (i11 % 2 == 0) {
            map = this.f2440;
        } else {
            map = this.f2440;
            int i12 = 80 / 0;
        }
        int i13 = i10 + 45;
        f2436 = i13 % 128;
        int i14 = i13 % 2;
        return map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if ((r7.f2442 != null) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
    
        r1 = r1 + 39;
        com.ironsource.adqualitysdk.sdk.i.hx.f2437 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if ((r1 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        r2 = '=';
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
    
        if (r2 == '=') goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0035, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0038, code lost:
    
        r0 = 48 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if ((r7.f2442 != null ? '=' : '(') != '=') goto L28;
     */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m6444() {
        /*
            r7 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.hx.f2437
            int r0 = r0 + 123
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.hx.f2436 = r1
            r2 = 2
            int r0 = r0 % r2
            r3 = 1
            r4 = 61
            r5 = 0
            if (r0 == 0) goto L20
            java.util.Collection r0 = r7.f2442
            r6 = 65
            int r6 = r6 / r5
            if (r0 == 0) goto L19
            r0 = r4
            goto L1b
        L19:
            r0 = 40
        L1b:
            if (r0 == r4) goto L29
            goto L3c
        L1e:
            r0 = move-exception
            throw r0
        L20:
            java.util.Collection r0 = r7.f2442
            if (r0 == 0) goto L26
            r0 = r3
            goto L27
        L26:
            r0 = r5
        L27:
            if (r0 == 0) goto L3c
        L29:
            int r1 = r1 + 39
            int r0 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.hx.f2437 = r0
            int r1 = r1 % r2
            if (r1 != 0) goto L33
            r2 = r4
        L33:
            if (r2 == r4) goto L36
            return r3
        L36:
            r0 = 48
            int r0 = r0 / r5
            return r3
        L3a:
            r0 = move-exception
            throw r0
        L3c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hx.m6444():boolean");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6445(int[] iArr, int i10) {
        String str;
        synchronized (e.f1934) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2434.clone();
            e.f1935 = 0;
            while (true) {
                int i11 = e.f1935;
                if (i11 < iArr.length) {
                    int i12 = iArr[i11];
                    char c10 = (char) (i12 >> 16);
                    cArr[0] = c10;
                    char c11 = (char) i12;
                    cArr[1] = c11;
                    char c12 = (char) (iArr[i11 + 1] >> 16);
                    cArr[2] = c12;
                    char c13 = (char) iArr[i11 + 1];
                    cArr[3] = c13;
                    e.f1937 = (c10 << 16) + c11;
                    e.f1936 = (c12 << 16) + c13;
                    e.m6211(iArr2);
                    for (int i13 = 0; i13 < 16; i13++) {
                        int i14 = e.f1937 ^ iArr2[i13];
                        e.f1937 = i14;
                        e.f1936 = e.m6210(i14) ^ e.f1936;
                        int i15 = e.f1937;
                        e.f1937 = e.f1936;
                        e.f1936 = i15;
                    }
                    int i16 = e.f1937;
                    e.f1937 = e.f1936;
                    e.f1936 = i16;
                    e.f1936 = i16 ^ iArr2[16];
                    e.f1937 ^= iArr2[17];
                    int i17 = e.f1935;
                    int i18 = e.f1937;
                    cArr[0] = (char) (i18 >>> 16);
                    cArr[1] = (char) i18;
                    int i19 = e.f1936;
                    cArr[2] = (char) (i19 >>> 16);
                    cArr[3] = (char) i19;
                    e.m6211(iArr2);
                    int i20 = e.f1935;
                    cArr2[i20 << 1] = cArr[0];
                    cArr2[(i20 << 1) + 1] = cArr[1];
                    cArr2[(i20 << 1) + 2] = cArr[2];
                    cArr2[(i20 << 1) + 3] = cArr[3];
                    e.f1935 = i20 + 2;
                } else {
                    str = new String(cArr2, 0, i10);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6446(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
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
            System.arraycopy(f2435, i10, cArr, 0, i11);
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m6447(T t10) {
        int i10 = f2436 + 71;
        f2437 = i10 % 128;
        int i11 = i10 % 2;
        if (!(m6449())) {
            return;
        }
        int i12 = f2437 + 19;
        f2436 = i12 % 128;
        try {
            if (i12 % 2 != 0) {
                this.f2438.set(this.f2441, t10);
                throw null;
            }
            this.f2438.set(this.f2441, t10);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean m6448() {
        int i10 = f2437 + 105;
        int i11 = i10 % 128;
        f2436 = i11;
        int i12 = i10 % 2;
        if ((this.f2440 != null ? '+' : 'L') == 'L') {
            return false;
        }
        int i13 = i11 + 21;
        f2437 = i13 % 128;
        int i14 = i13 % 2;
        int i15 = i11 + 89;
        f2437 = i15 % 128;
        int i16 = i15 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean m6449() {
        int i10 = f2436 + 97;
        int i11 = i10 % 128;
        f2437 = i11;
        if (!(i10 % 2 != 0)) {
            throw null;
        }
        if (this.f2438 != null) {
            return true;
        }
        int i12 = i11 + 63;
        f2436 = i12 % 128;
        if (i12 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d6  */
    @Override // com.ironsource.adqualitysdk.sdk.i.cl
    /* JADX INFO: renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo4888(java.lang.String r12, java.util.List<java.lang.Object> r13, com.ironsource.adqualitysdk.sdk.i.ch r14) {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hx.mo4888(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.hv
    /* JADX INFO: renamed from: ﻛ */
    public final Field mo6429() {
        int i10 = f2436;
        int i11 = i10 + 101;
        f2437 = i11 % 128;
        if (!(i11 % 2 != 0)) {
            throw null;
        }
        Field field = this.f2438;
        int i12 = i10 + 55;
        f2437 = i12 % 128;
        int i13 = i12 % 2;
        return field;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if ((m6449() ? '@' : 'Y') != '@') goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        if ((m6449() ? ' ' : 22) != ' ') goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:
    
        if (m6444() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (m6448() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
    
        r0 = (T) r3.f2441;
        r1 = com.ironsource.adqualitysdk.sdk.i.hx.f2437 + 35;
        com.ironsource.adqualitysdk.sdk.i.hx.f2436 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        return (T) r3.f2438.get(r3.f2441);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return null;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.hv
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T mo6430() {
        /*
            r3 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.hx.f2436
            int r0 = r0 + 27
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.hx.f2437 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L21
            boolean r0 = r3.m6449()
            r1 = 53
            int r1 = r1 / 0
            r1 = 64
            if (r0 == 0) goto L1a
            r0 = r1
            goto L1c
        L1a:
            r0 = 89
        L1c:
            if (r0 == r1) goto L48
            goto L2f
        L1f:
            r0 = move-exception
            throw r0
        L21:
            boolean r0 = r3.m6449()
            r1 = 32
            if (r0 == 0) goto L2b
            r0 = r1
            goto L2d
        L2b:
            r0 = 22
        L2d:
            if (r0 == r1) goto L48
        L2f:
            boolean r0 = r3.m6444()
            if (r0 != 0) goto L3b
            boolean r0 = r3.m6448()
            if (r0 == 0) goto L51
        L3b:
            java.lang.Object r0 = r3.f2441
            int r1 = com.ironsource.adqualitysdk.sdk.i.hx.f2437
            int r1 = r1 + 35
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.hx.f2436 = r2
            int r1 = r1 % 2
            return r0
        L48:
            java.lang.reflect.Field r0 = r3.f2438     // Catch: java.lang.Exception -> L51
            java.lang.Object r1 = r3.f2441     // Catch: java.lang.Exception -> L51
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L51
            return r0
        L51:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hx.mo6430():java.lang.Object");
    }
}
