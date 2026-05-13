package com.ironsource.adqualitysdk.sdk.i;

/* JADX INFO: loaded from: classes11.dex */
public enum hl {
    f2367(-1),
    f2366(0),
    f2369(1),
    f2368(2),
    f2370(3),
    f2365(4),
    f2362(5),
    f2364(6),
    f2363(7);


    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f2358 = 1;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int[] f2360;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f2361;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private final int f2371;

    static {
        m6337();
        int i10 = f2358 + 125;
        f2361 = i10 % 128;
        int i11 = i10 % 2;
    }

    hl(int i10) {
        this.f2371 = i10;
    }

    public static hl valueOf(String str) {
        int i10 = f2361 + 111;
        f2358 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        hl hlVar = (hl) Enum.valueOf(hl.class, str);
        if (z10) {
            int i11 = 48 / 0;
        }
        int i12 = f2358 + 87;
        f2361 = i12 % 128;
        int i13 = i12 % 2;
        return hlVar;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static hl[] valuesCustom() {
        int i10 = f2358 + 15;
        f2361 = i10 % 128;
        int i11 = i10 % 2;
        hl[] hlVarArr = (hl[]) values().clone();
        int i12 = f2361 + 41;
        f2358 = i12 % 128;
        if ((i12 % 2 == 0 ? 'L' : '+') == '+') {
            return hlVarArr;
        }
        int i13 = 83 / 0;
        return hlVarArr;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static hl m6336(int i10) {
        int i11 = f2361 + 97;
        int i12 = i11 % 128;
        f2358 = i12;
        int i13 = i11 % 2;
        switch (i10) {
            case -1:
                return f2367;
            case 0:
                return f2366;
            case 1:
                return f2369;
            case 2:
                return f2368;
            case 3:
                hl hlVar = f2370;
                int i14 = i12 + 121;
                f2361 = i14 % 128;
                if ((i14 % 2 != 0 ? 'K' : (char) 7) == 7) {
                    return hlVar;
                }
                throw null;
            case 4:
                return f2365;
            case 5:
                return f2362;
            case 6:
                return f2364;
            case 7:
                return f2363;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m6337() {
        f2360 = new int[]{67978153, 1678506698, 1602214626, -387060140, -1144243397, 891040089, 1050767598, -1522593851, 764895373, 248285869, 1933620196, -394887603, 997376652, 1439982257, -26799701, 1103817601, -1984906157, -1649952337};
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6338(int[] iArr, int i10) {
        String str;
        synchronized (e.f1934) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2360.clone();
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final int m6339() {
        int i10 = f2361 + 53;
        int i11 = i10 % 128;
        f2358 = i11;
        if ((i10 % 2 == 0 ? '\"' : (char) 0) == '\"') {
            throw null;
        }
        int i12 = this.f2371;
        int i13 = i11 + 59;
        f2361 = i13 % 128;
        int i14 = i13 % 2;
        return i12;
    }
}
