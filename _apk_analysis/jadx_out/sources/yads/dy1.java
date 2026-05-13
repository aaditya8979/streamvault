package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public abstract class dy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f89024a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f89025b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f89026c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int[] f89027d = new int[10];

    public static int a(int i10, byte[] bArr) {
        int i11;
        synchronized (f89026c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    if (i12 >= i10 - 2) {
                        i12 = i10;
                        break;
                    }
                    try {
                        if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12++;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = f89027d;
                    if (iArr.length <= i13) {
                        f89027d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f89027d[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f89027d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i18 + 2;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }

    public static int a(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        if (i12 < 0) {
            throw new IllegalStateException();
        }
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            a(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            a(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            a(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    a(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    public static ay1 a(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        boolean z10;
        int[] iArrCopyOf;
        kb2 kb2Var = new kb2(bArr, i10 + 2, i11);
        int i16 = 4;
        kb2Var.d(4);
        int iB = kb2Var.b(3);
        kb2Var.f();
        int iB2 = kb2Var.b(2);
        boolean zC = kb2Var.c();
        int iB3 = kb2Var.b(5);
        int i17 = 0;
        for (int i18 = 0; i18 < 32; i18++) {
            if (kb2Var.c()) {
                i17 |= 1 << i18;
            }
        }
        int i19 = 6;
        int[] iArr2 = new int[6];
        for (int i20 = 0; i20 < 6; i20++) {
            iArr2[i20] = kb2Var.b(8);
        }
        int iB4 = kb2Var.b(8);
        int i21 = 0;
        for (int i22 = 0; i22 < iB; i22++) {
            if (kb2Var.c()) {
                i21 += 89;
            }
            if (kb2Var.c()) {
                i21 += 8;
            }
        }
        kb2Var.d(i21);
        if (iB > 0) {
            kb2Var.d((8 - iB) * 2);
        }
        kb2Var.d();
        int iD = kb2Var.d();
        if (iD == 3) {
            kb2Var.f();
        }
        int iD2 = kb2Var.d();
        int iD3 = kb2Var.d();
        if (kb2Var.c()) {
            int iD4 = kb2Var.d();
            int iD5 = kb2Var.d();
            int iD6 = kb2Var.d();
            int iD7 = kb2Var.d();
            iD2 -= (iD4 + iD5) * ((iD == 1 || iD == 2) ? 2 : 1);
            iD3 -= (iD6 + iD7) * (iD == 1 ? 2 : 1);
        }
        int i23 = iD3;
        int i24 = iD2;
        kb2Var.d();
        kb2Var.d();
        int iD8 = kb2Var.d();
        for (int i25 = kb2Var.c() ? 0 : iB; i25 <= iB; i25++) {
            kb2Var.d();
            kb2Var.d();
            kb2Var.d();
        }
        kb2Var.d();
        kb2Var.d();
        kb2Var.d();
        kb2Var.d();
        kb2Var.d();
        kb2Var.d();
        if (kb2Var.c() && kb2Var.c()) {
            int i26 = 0;
            while (i26 < i16) {
                int i27 = 0;
                while (i27 < i19) {
                    if (kb2Var.c()) {
                        int iMin = Math.min(64, 1 << ((i26 << 1) + 4));
                        if (i26 > 1) {
                            kb2Var.e();
                        }
                        for (int i28 = 0; i28 < iMin; i28++) {
                            kb2Var.e();
                        }
                    } else {
                        kb2Var.d();
                    }
                    i27 += i26 == 3 ? 3 : 1;
                    i19 = 6;
                }
                i26++;
                i16 = 4;
                i19 = 6;
            }
        }
        kb2Var.d(2);
        if (kb2Var.c()) {
            kb2Var.d(8);
            kb2Var.d();
            kb2Var.d();
            kb2Var.f();
        }
        int iD9 = kb2Var.d();
        int[] iArr3 = new int[0];
        int[] iArr4 = new int[0];
        int i29 = -1;
        int i30 = 0;
        int iD10 = -1;
        while (i30 < iD9) {
            if (i30 == 0 || !kb2Var.c()) {
                i12 = iD9;
                i13 = iB3;
                i14 = i17;
                iArr = iArr2;
                i15 = iB4;
                int iD11 = kb2Var.d();
                iD10 = kb2Var.d();
                iArr3 = new int[iD11];
                for (int i31 = 0; i31 < iD11; i31++) {
                    iArr3[i31] = kb2Var.d() + 1;
                    kb2Var.f();
                }
                z10 = true;
                int[] iArr5 = new int[iD10];
                for (int i32 = 0; i32 < iD10; i32++) {
                    iArr5[i32] = kb2Var.d() + 1;
                    kb2Var.f();
                }
                i29 = iD11;
                iArrCopyOf = iArr5;
            } else {
                int i33 = i29 + iD10;
                int iD12 = (1 - ((kb2Var.c() ? 1 : 0) * 2)) * (kb2Var.d() + 1);
                i12 = iD9;
                int i34 = i33 + 1;
                i15 = iB4;
                boolean[] zArr = new boolean[i34];
                iArr = iArr2;
                for (int i35 = 0; i35 <= i33; i35++) {
                    if (kb2Var.c()) {
                        zArr[i35] = true;
                    } else {
                        zArr[i35] = kb2Var.c();
                    }
                }
                int[] iArr6 = new int[i34];
                int[] iArr7 = new int[i34];
                int i36 = 0;
                for (int i37 = iD10 - 1; i37 >= 0; i37--) {
                    int i38 = iArr4[i37] + iD12;
                    if (i38 < 0 && zArr[i29 + i37]) {
                        iArr6[i36] = i38;
                        i36++;
                    }
                }
                if (iD12 < 0 && zArr[i33]) {
                    iArr6[i36] = iD12;
                    i36++;
                }
                i14 = i17;
                int i39 = i36;
                i13 = iB3;
                for (int i40 = 0; i40 < i29; i40++) {
                    int i41 = iArr3[i40] + iD12;
                    if (i41 < 0 && zArr[i40]) {
                        iArr6[i39] = i41;
                        i39++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr6, i39);
                int i42 = 0;
                for (int i43 = i29 - 1; i43 >= 0; i43--) {
                    int i44 = iArr3[i43] + iD12;
                    if (i44 > 0 && zArr[i43]) {
                        iArr7[i42] = i44;
                        i42++;
                    }
                }
                if (iD12 > 0 && zArr[i33]) {
                    iArr7[i42] = iD12;
                    i42++;
                }
                int i45 = i42;
                for (int i46 = 0; i46 < iD10; i46++) {
                    int i47 = iArr4[i46] + iD12;
                    if (i47 > 0 && zArr[i29 + i46]) {
                        iArr7[i45] = i47;
                        i45++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr7, i45);
                iD10 = i45;
                iArr3 = iArrCopyOf2;
                i29 = i39;
                z10 = true;
            }
            i30++;
            iB4 = i15;
            iArr2 = iArr;
            i17 = i14;
            iB3 = i13;
            iArr4 = iArrCopyOf;
            iD9 = i12;
        }
        int i48 = iB3;
        int i49 = i17;
        int[] iArr8 = iArr2;
        int i50 = iB4;
        if (kb2Var.c()) {
            for (int i51 = 0; i51 < kb2Var.d(); i51++) {
                kb2Var.d(iD8 + 5);
            }
        }
        kb2Var.d(2);
        float f10 = 1.0f;
        if (kb2Var.c()) {
            if (kb2Var.c()) {
                int iB5 = kb2Var.b(8);
                if (iB5 == 255) {
                    int iB6 = kb2Var.b(16);
                    int iB7 = kb2Var.b(16);
                    if (iB6 != 0 && iB7 != 0) {
                        f10 = iB6 / iB7;
                    }
                } else {
                    float[] fArr = f89025b;
                    if (iB5 < 17) {
                        f10 = fArr[iB5];
                    } else {
                        kf1.a("Unexpected aspect_ratio_idc value: ", iB5, "NalUnitUtil");
                    }
                }
            }
            if (kb2Var.c()) {
                kb2Var.f();
            }
            if (kb2Var.c()) {
                kb2Var.d(4);
                if (kb2Var.c()) {
                    kb2Var.d(24);
                }
            }
            if (kb2Var.c()) {
                kb2Var.d();
                kb2Var.d();
            }
            kb2Var.f();
            if (kb2Var.c()) {
                i23 *= 2;
            }
        }
        return new ay1(iB2, zC, i48, i49, iArr8, i50, i24, i23, f10);
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static yads.cy1 b(byte[] r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.dy1.b(byte[], int, int):yads.cy1");
    }
}
