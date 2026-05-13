package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public abstract class xk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f96796a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f96797b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f96798c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static mx0 a(byte[] bArr, String str, String str2) {
        ib2 ib2Var;
        if (bArr[0] == 127) {
            ib2Var = new ib2(bArr.length, bArr);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            byte b10 = bArrCopyOf[0];
            if (b10 == -2 || b10 == -1) {
                for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                    byte b11 = bArrCopyOf[i10];
                    int i11 = i10 + 1;
                    bArrCopyOf[i10] = bArrCopyOf[i11];
                    bArrCopyOf[i11] = b11;
                }
            }
            ib2Var = new ib2(bArrCopyOf.length, bArrCopyOf);
            if (bArrCopyOf[0] == 31) {
                ib2 ib2Var2 = new ib2(bArrCopyOf.length, bArrCopyOf);
                while (ib2Var2.b() >= 16) {
                    ib2Var2.c(2);
                    int iA = ib2Var2.a(14) & 16383;
                    int iMin = Math.min(8 - ib2Var.f90735c, 14);
                    int i12 = ib2Var.f90735c;
                    int i13 = (8 - i12) - iMin;
                    byte[] bArr2 = ib2Var.f90733a;
                    int i14 = ib2Var.f90734b;
                    byte b12 = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr2[i14]);
                    bArr2[i14] = b12;
                    int i15 = 14 - iMin;
                    bArr2[i14] = (byte) (b12 | ((iA >>> i15) << i13));
                    int i16 = i14 + 1;
                    while (i15 > 8) {
                        ib2Var.f90733a[i16] = (byte) (iA >>> (i15 - 8));
                        i15 -= 8;
                        i16++;
                    }
                    int i17 = 8 - i15;
                    byte[] bArr3 = ib2Var.f90733a;
                    byte b13 = (byte) (bArr3[i16] & ((1 << i17) - 1));
                    bArr3[i16] = b13;
                    bArr3[i16] = (byte) (((iA & ((1 << i15) - 1)) << i17) | b13);
                    ib2Var.c(14);
                    ib2Var.a();
                }
            }
            ib2Var.a(bArrCopyOf.length, bArrCopyOf);
        }
        ib2Var.c(60);
        int i18 = f96796a[ib2Var.a(6)];
        int i19 = f96797b[ib2Var.a(4)];
        int iA2 = ib2Var.a(5);
        int i20 = iA2 < 29 ? (f96798c[iA2] * 1000) / 2 : -1;
        ib2Var.c(10);
        int i21 = i18 + (ib2Var.a(2) > 0 ? 1 : 0);
        lx0 lx0Var = new lx0();
        lx0Var.f92138a = str;
        lx0Var.f92148k = "audio/vnd.dts";
        lx0Var.f92143f = i20;
        lx0Var.f92161x = i21;
        lx0Var.f92162y = i19;
        lx0Var.f92151n = null;
        lx0Var.f92140c = str2;
        return new mx0(lx0Var);
    }
}
