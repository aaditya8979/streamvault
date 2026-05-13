package s7;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: NalUnitUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f79531a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f79532b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f79533c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int[] f79534d = new int[10];

    /* JADX INFO: compiled from: NalUnitUtil.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f79535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f79536b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f79537c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f79538d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f79539e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f79540f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f79541g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f79542h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f79543i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final float f79544j;

        public a(int i10, boolean z10, int i11, int i12, int[] iArr, int i13, int i14, int i15, int i16, float f10) {
            this.f79535a = i10;
            this.f79536b = z10;
            this.f79537c = i11;
            this.f79538d = i12;
            this.f79539e = iArr;
            this.f79540f = i13;
            this.f79541g = i14;
            this.f79542h = i15;
            this.f79543i = i16;
            this.f79544j = f10;
        }
    }

    /* JADX INFO: compiled from: NalUnitUtil.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f79545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f79546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f79547c;

        public b(int i10, int i11, boolean z10) {
            this.f79545a = i10;
            this.f79546b = i11;
            this.f79547c = z10;
        }
    }

    /* JADX INFO: compiled from: NalUnitUtil.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f79548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f79549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f79550c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f79551d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f79552e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f79553f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f79554g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f79555h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f79556i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f79557j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f79558k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f79559l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f79560m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f79561n;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10, boolean z10, boolean z11, int i17, int i18, int i19, boolean z12) {
            this.f79548a = i10;
            this.f79549b = i11;
            this.f79550c = i12;
            this.f79551d = i13;
            this.f79552e = i14;
            this.f79553f = i15;
            this.f79554g = i16;
            this.f79555h = f10;
            this.f79556i = z10;
            this.f79557j = z11;
            this.f79558k = i17;
            this.f79559l = i18;
            this.f79560m = i19;
            this.f79561n = z12;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i10 + 1;
            if (i12 >= iPosition) {
                byteBuffer.clear();
                return;
            }
            int i13 = byteBuffer.get(i10) & 255;
            if (i11 == 3) {
                if (i13 == 1 && (byteBuffer.get(i12) & 31) == 7) {
                    ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                    byteBufferDuplicate.position(i10 - 3);
                    byteBufferDuplicate.limit(iPosition);
                    byteBuffer.position(0);
                    byteBuffer.put(byteBufferDuplicate);
                    return;
                }
            } else if (i13 == 0) {
                i11++;
            }
            if (i13 != 0) {
                i11 = 0;
            }
            i10 = i12;
        }
    }

    public static int c(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        s7.a.g(i12 >= 0);
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

    public static int d(byte[] bArr, int i10, int i11) {
        while (i10 < i11 - 2) {
            if (bArr[i10] == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 3) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int e(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    public static int f(byte[] bArr, int i10) {
        return bArr[i10 + 3] & 31;
    }

    public static boolean g(@Nullable String str, byte b10) {
        if ("video/avc".equals(str) && (b10 & 31) == 6) {
            return true;
        }
        return "video/hevc".equals(str) && ((b10 & 126) >> 1) == 39;
    }

    public static a h(byte[] bArr, int i10, int i11) {
        return i(bArr, i10 + 2, i11);
    }

    public static a i(byte[] bArr, int i10, int i11) {
        b0 b0Var = new b0(bArr, i10, i11);
        b0Var.l(4);
        int iE = b0Var.e(3);
        b0Var.k();
        int iE2 = b0Var.e(2);
        boolean zD = b0Var.d();
        int iE3 = b0Var.e(5);
        int i12 = 0;
        for (int i13 = 0; i13 < 32; i13++) {
            if (b0Var.d()) {
                i12 |= 1 << i13;
            }
        }
        int[] iArr = new int[6];
        for (int i14 = 0; i14 < 6; i14++) {
            iArr[i14] = b0Var.e(8);
        }
        int iE4 = b0Var.e(8);
        int i15 = 0;
        for (int i16 = 0; i16 < iE; i16++) {
            if (b0Var.d()) {
                i15 += 89;
            }
            if (b0Var.d()) {
                i15 += 8;
            }
        }
        b0Var.l(i15);
        if (iE > 0) {
            b0Var.l((8 - iE) * 2);
        }
        int iH = b0Var.h();
        int iH2 = b0Var.h();
        if (iH2 == 3) {
            b0Var.k();
        }
        int iH3 = b0Var.h();
        int iH4 = b0Var.h();
        if (b0Var.d()) {
            int iH5 = b0Var.h();
            int iH6 = b0Var.h();
            int iH7 = b0Var.h();
            int iH8 = b0Var.h();
            iH3 -= ((iH2 == 1 || iH2 == 2) ? 2 : 1) * (iH5 + iH6);
            iH4 -= (iH2 == 1 ? 2 : 1) * (iH7 + iH8);
        }
        b0Var.h();
        b0Var.h();
        int iH9 = b0Var.h();
        for (int i17 = b0Var.d() ? 0 : iE; i17 <= iE; i17++) {
            b0Var.h();
            b0Var.h();
            b0Var.h();
        }
        b0Var.h();
        b0Var.h();
        b0Var.h();
        b0Var.h();
        b0Var.h();
        b0Var.h();
        if (b0Var.d() && b0Var.d()) {
            n(b0Var);
        }
        b0Var.l(2);
        if (b0Var.d()) {
            b0Var.l(8);
            b0Var.h();
            b0Var.h();
            b0Var.k();
        }
        p(b0Var);
        if (b0Var.d()) {
            for (int i18 = 0; i18 < b0Var.h(); i18++) {
                b0Var.l(iH9 + 4 + 1);
            }
        }
        b0Var.l(2);
        float f10 = 1.0f;
        if (b0Var.d()) {
            if (b0Var.d()) {
                int iE5 = b0Var.e(8);
                if (iE5 == 255) {
                    int iE6 = b0Var.e(16);
                    int iE7 = b0Var.e(16);
                    if (iE6 != 0 && iE7 != 0) {
                        f10 = iE6 / iE7;
                    }
                } else {
                    float[] fArr = f79532b;
                    if (iE5 < fArr.length) {
                        f10 = fArr[iE5];
                    } else {
                        q.i("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iE5);
                    }
                }
            }
            if (b0Var.d()) {
                b0Var.k();
            }
            if (b0Var.d()) {
                b0Var.l(4);
                if (b0Var.d()) {
                    b0Var.l(24);
                }
            }
            if (b0Var.d()) {
                b0Var.h();
                b0Var.h();
            }
            b0Var.k();
            if (b0Var.d()) {
                iH4 *= 2;
            }
        }
        return new a(iE2, zD, iE3, i12, iArr, iE4, iH, iH3, iH4, f10);
    }

    public static b j(byte[] bArr, int i10, int i11) {
        return k(bArr, i10 + 1, i11);
    }

    public static b k(byte[] bArr, int i10, int i11) {
        b0 b0Var = new b0(bArr, i10, i11);
        int iH = b0Var.h();
        int iH2 = b0Var.h();
        b0Var.k();
        return new b(iH, iH2, b0Var.d());
    }

    public static c l(byte[] bArr, int i10, int i11) {
        return m(bArr, i10 + 1, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0164 A[PHI: r1
      0x0164: PHI (r1v8 float) = (r1v7 float), (r1v7 float), (r1v7 float), (r1v7 float), (r1v7 float), (r1v10 float) binds: [B:71:0x0121, B:73:0x0127, B:83:0x014e, B:77:0x013d, B:78:0x013f, B:79:0x0141] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static s7.v.c m(byte[] r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.v.m(byte[], int, int):s7.v$c");
    }

    public static void n(b0 b0Var) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (b0Var.d()) {
                    int iMin = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        b0Var.g();
                    }
                    for (int i13 = 0; i13 < iMin; i13++) {
                        b0Var.g();
                    }
                } else {
                    b0Var.h();
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    public static void o(b0 b0Var, int i10) {
        int iG = 8;
        int i11 = 8;
        for (int i12 = 0; i12 < i10; i12++) {
            if (iG != 0) {
                iG = ((b0Var.g() + i11) + 256) % 256;
            }
            if (iG != 0) {
                i11 = iG;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void p(b0 b0Var) {
        int iH = b0Var.h();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i10 = -1;
        int i11 = 0;
        int i12 = -1;
        while (i11 < iH) {
            if ((i11 != 0 && b0Var.d()) == true) {
                int i13 = i10 + i12;
                int iH2 = (1 - ((b0Var.d() ? 1 : 0) * 2)) * (b0Var.h() + 1);
                int i14 = i13 + 1;
                boolean[] zArr = new boolean[i14];
                for (int i15 = 0; i15 <= i13; i15++) {
                    if (b0Var.d()) {
                        zArr[i15] = true;
                    } else {
                        zArr[i15] = b0Var.d();
                    }
                }
                int[] iArr2 = new int[i14];
                int[] iArr3 = new int[i14];
                int i16 = 0;
                for (int i17 = i12 - 1; i17 >= 0; i17--) {
                    int i18 = iArrCopyOf[i17] + iH2;
                    if (i18 < 0 && zArr[i10 + i17]) {
                        iArr2[i16] = i18;
                        i16++;
                    }
                }
                if (iH2 < 0 && zArr[i13]) {
                    iArr2[i16] = iH2;
                    i16++;
                }
                for (int i19 = 0; i19 < i10; i19++) {
                    int i20 = iArr[i19] + iH2;
                    if (i20 < 0 && zArr[i19]) {
                        iArr2[i16] = i20;
                        i16++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr2, i16);
                int i21 = 0;
                for (int i22 = i10 - 1; i22 >= 0; i22--) {
                    int i23 = iArr[i22] + iH2;
                    if (i23 > 0 && zArr[i22]) {
                        iArr3[i21] = i23;
                        i21++;
                    }
                }
                if (iH2 > 0 && zArr[i13]) {
                    iArr3[i21] = iH2;
                    i21++;
                }
                for (int i24 = 0; i24 < i12; i24++) {
                    int i25 = iArrCopyOf[i24] + iH2;
                    if (i25 > 0 && zArr[i10 + i24]) {
                        iArr3[i21] = i25;
                        i21++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr3, i21);
                iArr = iArrCopyOf2;
                i10 = i16;
                i12 = i21;
            } else {
                int iH3 = b0Var.h();
                int iH4 = b0Var.h();
                int[] iArr4 = new int[iH3];
                for (int i26 = 0; i26 < iH3; i26++) {
                    iArr4[i26] = b0Var.h() + 1;
                    b0Var.k();
                }
                int[] iArr5 = new int[iH4];
                for (int i27 = 0; i27 < iH4; i27++) {
                    iArr5[i27] = b0Var.h() + 1;
                    b0Var.k();
                }
                i10 = iH3;
                iArr = iArr4;
                i12 = iH4;
                iArrCopyOf = iArr5;
            }
            i11++;
        }
    }

    public static int q(byte[] bArr, int i10) {
        int i11;
        synchronized (f79533c) {
            int iD = 0;
            int i12 = 0;
            while (iD < i10) {
                try {
                    iD = d(bArr, iD, i10);
                    if (iD < i10) {
                        int[] iArr = f79534d;
                        if (iArr.length <= i12) {
                            f79534d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f79534d[i12] = iD;
                        iD += 3;
                        i12++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i11 = i10 - i12;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = f79534d[i15] - i14;
                System.arraycopy(bArr, i14, bArr, i13, i16);
                int i17 = i13 + i16;
                int i18 = i17 + 1;
                bArr[i17] = 0;
                i13 = i18 + 1;
                bArr[i18] = 0;
                i14 += i16 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i13, i11 - i13);
        }
        return i11;
    }
}
