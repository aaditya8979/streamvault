package com.ironsource.adqualitysdk.sdk.i;

/* JADX INFO: loaded from: classes11.dex */
public enum hn {
    f2379(-1),
    f2383(0),
    f2382(1),
    f2380(2),
    f2381(3),
    f2377(4),
    f2375(5),
    f2378(6);


    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f2372 = 0;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f2373 = 1;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int[] f2374;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private final int f2384;

    static {
        m6342();
        int i10 = f2373 + 33;
        f2372 = i10 % 128;
        if ((i10 % 2 != 0 ? '5' : '8') != '5') {
        } else {
            throw null;
        }
    }

    hn(int i10) {
        this.f2384 = i10;
    }

    public static hn valueOf(String str) {
        int i10 = f2372 + 27;
        f2373 = i10 % 128;
        if ((i10 % 2 == 0 ? 'D' : '+') != '+') {
            Enum.valueOf(hn.class, str);
            throw null;
        }
        hn hnVar = (hn) Enum.valueOf(hn.class, str);
        int i11 = f2372 + 19;
        f2373 = i11 % 128;
        if (i11 % 2 != 0) {
            return hnVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static hn[] valuesCustom() {
        int i10 = f2373 + 19;
        f2372 = i10 % 128;
        int i11 = i10 % 2;
        hn[] hnVarArr = (hn[]) values().clone();
        int i12 = f2372 + 75;
        f2373 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 26 : 'a') == 'a') {
            return hnVarArr;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6341(int[] iArr, int i10) {
        String str;
        synchronized (e.f1934) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2374.clone();
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m6342() {
        f2374 = new int[]{-598830901, 1989314260, -1901562280, 467925058, -723660769, 296365004, -2092547361, -1483207319, 532367964, -1998172150, -134091479, -1794188114, -2132346635, 1022009424, -1087064520, -177743133, -2045544004, -2038714072};
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static hn m6343(int i10) {
        switch (i10) {
            case -1:
                return f2379;
            case 0:
                return f2383;
            case 1:
                return f2382;
            case 2:
                return f2380;
            case 3:
                hn hnVar = f2381;
                int i11 = f2372 + 91;
                f2373 = i11 % 128;
                int i12 = i11 % 2;
                return hnVar;
            case 4:
                hn hnVar2 = f2377;
                int i13 = f2372 + 37;
                f2373 = i13 % 128;
                if ((i13 % 2 == 0 ? ']' : '*') == '*') {
                    return hnVar2;
                }
                throw null;
            case 5:
                return f2375;
            case 6:
                return f2378;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final int m6344() {
        int i10 = f2372 + 97;
        f2373 = i10 % 128;
        if ((i10 % 2 == 0 ? '-' : '>') == '>') {
            return this.f2384;
        }
        throw null;
    }
}
