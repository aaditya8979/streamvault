package a6;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: NalUnitUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f3596a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f3597b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f3598c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int[] f3599d = new int[10];

    /* JADX INFO: compiled from: NalUnitUtil.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f3601b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f3602c;

        public a(int i10, int i11, boolean z10) {
            this.f3600a = i10;
            this.f3601b = i11;
            this.f3602c = z10;
        }
    }

    /* JADX INFO: compiled from: NalUnitUtil.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f3604b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f3605c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f3606d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f3607e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f3608f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f3609g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f3610h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f3611i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f3612j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f3613k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f3614l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f3615m;

        public b(int i10, int i11, int i12, int i13, int i14, int i15, float f10, boolean z10, boolean z11, int i16, int i17, int i18, boolean z12) {
            this.f3603a = i10;
            this.f3604b = i11;
            this.f3605c = i12;
            this.f3606d = i13;
            this.f3607e = i14;
            this.f3608f = i15;
            this.f3609g = f10;
            this.f3610h = z10;
            this.f3611i = z11;
            this.f3612j = i16;
            this.f3613k = i17;
            this.f3614l = i18;
            this.f3615m = z12;
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

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0095, code lost:
    
        r9 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(byte[] r8, int r9, int r10, boolean[] r11) {
        /*
            int r0 = r10 - r9
            r1 = 0
            r2 = 1
            if (r0 < 0) goto L8
            r3 = r2
            goto L9
        L8:
            r3 = r1
        L9:
            a6.a.f(r3)
            if (r0 != 0) goto Lf
            return r10
        Lf:
            r3 = 2
            if (r11 == 0) goto L40
            boolean r4 = r11[r1]
            if (r4 == 0) goto L1c
            a(r11)
            int r9 = r9 + (-3)
            return r9
        L1c:
            if (r0 <= r2) goto L2b
            boolean r4 = r11[r2]
            if (r4 == 0) goto L2b
            r4 = r8[r9]
            if (r4 != r2) goto L2b
            a(r11)
            int r9 = r9 - r3
            return r9
        L2b:
            if (r0 <= r3) goto L40
            boolean r4 = r11[r3]
            if (r4 == 0) goto L40
            r4 = r8[r9]
            if (r4 != 0) goto L40
            int r4 = r9 + 1
            r4 = r8[r4]
            if (r4 != r2) goto L40
            a(r11)
            int r9 = r9 - r2
            return r9
        L40:
            int r4 = r10 + (-1)
            int r9 = r9 + r3
        L43:
            if (r9 >= r4) goto L65
            r5 = r8[r9]
            r6 = r5 & 254(0xfe, float:3.56E-43)
            if (r6 == 0) goto L4c
            goto L62
        L4c:
            int r6 = r9 + (-2)
            r7 = r8[r6]
            if (r7 != 0) goto L60
            int r7 = r9 + (-1)
            r7 = r8[r7]
            if (r7 != 0) goto L60
            if (r5 != r2) goto L60
            if (r11 == 0) goto L5f
            a(r11)
        L5f:
            return r6
        L60:
            int r9 = r9 + (-2)
        L62:
            int r9 = r9 + 3
            goto L43
        L65:
            if (r11 == 0) goto Lb9
            if (r0 <= r3) goto L7c
            int r9 = r10 + (-3)
            r9 = r8[r9]
            if (r9 != 0) goto L7a
            int r9 = r10 + (-2)
            r9 = r8[r9]
            if (r9 != 0) goto L7a
            r9 = r8[r4]
            if (r9 != r2) goto L7a
            goto L95
        L7a:
            r9 = r1
            goto L96
        L7c:
            if (r0 != r3) goto L8d
            boolean r9 = r11[r3]
            if (r9 == 0) goto L7a
            int r9 = r10 + (-2)
            r9 = r8[r9]
            if (r9 != 0) goto L7a
            r9 = r8[r4]
            if (r9 != r2) goto L7a
            goto L95
        L8d:
            boolean r9 = r11[r2]
            if (r9 == 0) goto L7a
            r9 = r8[r4]
            if (r9 != r2) goto L7a
        L95:
            r9 = r2
        L96:
            r11[r1] = r9
            if (r0 <= r2) goto La5
            int r9 = r10 + (-2)
            r9 = r8[r9]
            if (r9 != 0) goto Laf
            r9 = r8[r4]
            if (r9 != 0) goto Laf
            goto Lad
        La5:
            boolean r9 = r11[r3]
            if (r9 == 0) goto Laf
            r9 = r8[r4]
            if (r9 != 0) goto Laf
        Lad:
            r9 = r2
            goto Lb0
        Laf:
            r9 = r1
        Lb0:
            r11[r2] = r9
            r8 = r8[r4]
            if (r8 != 0) goto Lb7
            r1 = r2
        Lb7:
            r11[r3] = r1
        Lb9:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.q.c(byte[], int, int, boolean[]):int");
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

    public static boolean g(String str, byte b10) {
        if ("video/avc".equals(str) && (b10 & 31) == 6) {
            return true;
        }
        return "video/hevc".equals(str) && ((b10 & 126) >> 1) == 39;
    }

    public static a h(byte[] bArr, int i10, int i11) {
        u uVar = new u(bArr, i10, i11);
        uVar.l(8);
        int iH = uVar.h();
        int iH2 = uVar.h();
        uVar.k();
        return new a(iH, iH2, uVar.d());
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0162 A[PHI: r1
      0x0162: PHI (r1v8 float) = (r1v7 float), (r1v7 float), (r1v7 float), (r1v7 float), (r1v7 float), (r1v10 float) binds: [B:71:0x011f, B:73:0x0125, B:83:0x014c, B:77:0x013b, B:78:0x013d, B:79:0x013f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static a6.q.b i(byte[] r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.q.i(byte[], int, int):a6.q$b");
    }

    public static void j(u uVar, int i10) {
        int iG = 8;
        int i11 = 8;
        for (int i12 = 0; i12 < i10; i12++) {
            if (iG != 0) {
                iG = ((uVar.g() + i11) + 256) % 256;
            }
            if (iG != 0) {
                i11 = iG;
            }
        }
    }

    public static int k(byte[] bArr, int i10) {
        int i11;
        synchronized (f3598c) {
            int iD = 0;
            int i12 = 0;
            while (iD < i10) {
                try {
                    iD = d(bArr, iD, i10);
                    if (iD < i10) {
                        int[] iArr = f3599d;
                        if (iArr.length <= i12) {
                            f3599d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f3599d[i12] = iD;
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
                int i16 = f3599d[i15] - i14;
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
