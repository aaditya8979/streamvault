package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import yads.u21;

/* JADX INFO: loaded from: classes10.dex */
public final class u21 extends dz2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s21 f95511b = new s21() { // from class: bt.ta
        @Override // yads.s21
        public final boolean a(int i10, int i11, int i12, int i13, int i14) {
            return u21.b(i10, i11, i12, i13, i14);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s21 f95512a;

    public u21(s21 s21Var) {
        this.f95512a = s21Var;
    }

    public static int a(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static int a(byte[] bArr, int i10, int i11) {
        int iB = b(i10, bArr);
        if (i11 == 0 || i11 == 3) {
            return iB;
        }
        while (iB < bArr.length - 1) {
            if ((iB - i10) % 2 == 0 && bArr[iB + 1] == 0) {
                return iB;
            }
            iB = b(iB + 1, bArr);
        }
        return bArr.length;
    }

    public static String a(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static String a(int i10, int i11, String str, byte[] bArr) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, str);
    }

    public static ag a(int i10, int i11, jb2 jb2Var) {
        int iB;
        String strConcat;
        int iM = jb2Var.m();
        String strB = b(iM);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        jb2Var.a(bArr, 0, i12);
        if (i11 == 2) {
            String str = "image/" + ki.a(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            strConcat = str;
            iB = 2;
        } else {
            iB = b(0, bArr);
            String strA = ki.a(new String(bArr, 0, iB, "ISO-8859-1"));
            strConcat = strA.indexOf(47) == -1 ? "image/".concat(strA) : strA;
        }
        int i13 = bArr[iB + 1] & 255;
        int i14 = iB + 2;
        int iA = a(bArr, i14, iM);
        String str2 = new String(bArr, i14, iA - i14, strB);
        int iA2 = a(iM) + iA;
        return new ag(strConcat, str2, i13, i12 <= iA2 ? ib3.f90742f : Arrays.copyOfRange(bArr, iA2, i12));
    }

    public static px a(int i10, jb2 jb2Var) {
        if (i10 < 4) {
            return null;
        }
        int iM = jb2Var.m();
        String strB = b(iM);
        byte[] bArr = new byte[3];
        jb2Var.a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        jb2Var.a(bArr2, 0, i11);
        int iA = a(bArr2, 0, iM);
        String str2 = new String(bArr2, 0, iA, strB);
        int iA2 = a(iM) + iA;
        return new px(str, str2, a(iA2, a(bArr2, iA2, iM), strB, bArr2));
    }

    public static ut a(jb2 jb2Var, int i10, int i11, boolean z10, int i12, s21 s21Var) {
        int i13 = jb2Var.f91148b;
        int iB = b(i13, jb2Var.f91147a);
        String str = new String(jb2Var.f91147a, i13, iB - i13, "ISO-8859-1");
        jb2Var.e(iB + 1);
        int iB2 = jb2Var.b();
        int iB3 = jb2Var.b();
        long jN = jb2Var.n();
        long j10 = jN == 4294967295L ? -1L : jN;
        long jN2 = jb2Var.n();
        long j11 = jN2 == 4294967295L ? -1L : jN2;
        ArrayList arrayList = new ArrayList();
        int i14 = i13 + i10;
        while (jb2Var.f91148b < i14) {
            v21 v21VarA = a(i11, jb2Var, z10, i12, s21Var);
            if (v21VarA != null) {
                arrayList.add(v21VarA);
            }
        }
        return new ut(str, iB2, iB3, j10, j11, (v21[]) arrayList.toArray(new v21[0]));
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ed A[Catch: all -> 0x012d, UnsupportedEncodingException -> 0x0130, TryCatch #1 {UnsupportedEncodingException -> 0x0130, blocks: (B:91:0x011b, B:160:0x01ff, B:93:0x0123, B:103:0x0140, B:105:0x0148, B:113:0x0162, B:122:0x017a, B:133:0x0195, B:140:0x01a7, B:146:0x01b6, B:151:0x01ce, B:157:0x01e8, B:158:0x01ed), top: B:175:0x0111 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static yads.v21 a(int r19, yads.jb2 r20, boolean r21, int r22, yads.s21 r23) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.u21.a(int, yads.jb2, boolean, int, yads.s21):yads.v21");
    }

    public static y53 a(int i10, jb2 jb2Var, String str) {
        if (i10 < 1) {
            return null;
        }
        int iM = jb2Var.m();
        String strB = b(iM);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        jb2Var.a(bArr, 0, i11);
        return new y53(str, null, new String(bArr, 0, a(bArr, 0, iM), strB));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0086 A[PHI: r3
      0x0086: PHI (r3v17 int) = (r3v6 int), (r3v20 int) binds: [B:39:0x0083, B:31:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(yads.jb2 r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f91148b
        L6:
            int r3 = r1.f91149c     // Catch: java.lang.Throwable -> Lb0
            int r4 = r1.f91148b     // Catch: java.lang.Throwable -> Lb0
            int r3 = r3 - r4
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L21
            int r7 = r18.b()     // Catch: java.lang.Throwable -> Lb0
            long r8 = r18.n()     // Catch: java.lang.Throwable -> Lb0
            int r10 = r18.r()     // Catch: java.lang.Throwable -> Lb0
            goto L2b
        L21:
            int r7 = r18.o()     // Catch: java.lang.Throwable -> Lb0
            int r8 = r18.o()     // Catch: java.lang.Throwable -> Lb0
            long r8 = (long) r8
            r10 = r6
        L2b:
            r11 = 0
            if (r7 != 0) goto L39
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L39
            if (r10 != 0) goto L39
            r1.e(r2)
            return r4
        L39:
            r7 = 4
            if (r0 != r7) goto L6a
            if (r21 != 0) goto L6a
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4a
            r1.e(r2)
            return r6
        L4a:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6a:
            if (r0 != r7) goto L78
            r3 = r10 & 64
            if (r3 == 0) goto L72
            r3 = r4
            goto L73
        L72:
            r3 = r6
        L73:
            r7 = r10 & 1
            if (r7 == 0) goto L86
            goto L8a
        L78:
            if (r0 != r3) goto L88
            r3 = r10 & 32
            if (r3 == 0) goto L80
            r3 = r4
            goto L81
        L80:
            r3 = r6
        L81:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L86
            goto L8a
        L86:
            r4 = r6
            goto L8a
        L88:
            r3 = r6
            r4 = r3
        L8a:
            if (r4 == 0) goto L8e
            int r3 = r3 + 4
        L8e:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L97
            r1.e(r2)
            return r6
        L97:
            int r3 = r1.f91149c     // Catch: java.lang.Throwable -> Lb0
            int r4 = r1.f91148b     // Catch: java.lang.Throwable -> Lb0
            int r3 = r3 - r4
            long r10 = (long) r3
            int r3 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r3 >= 0) goto La5
            r1.e(r2)
            return r6
        La5:
            int r3 = (int) r8
            int r4 = r4 + r3
            r1.e(r4)     // Catch: java.lang.Throwable -> Lb0
            goto L6
        Lac:
            r1.e(r2)
            return r4
        Lb0:
            r0 = move-exception
            r1.e(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.u21.a(yads.jb2, int, int, boolean):boolean");
    }

    public static int b(int i10, byte[] bArr) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    public static String b(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : C.UTF16_NAME;
    }

    public static bz0 b(int i10, jb2 jb2Var) {
        int iM = jb2Var.m();
        String strB = b(iM);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        jb2Var.a(bArr, 0, i11);
        int iB = b(0, bArr);
        String str = new String(bArr, 0, iB, "ISO-8859-1");
        int i12 = iB + 1;
        int iA = a(bArr, i12, iM);
        String strA = a(i12, iA, strB, bArr);
        int iA2 = a(iM) + iA;
        int iA3 = a(bArr, iA2, iM);
        String strA2 = a(iA2, iA3, strB, bArr);
        int iA4 = a(iM) + iA3;
        return new bz0(str, strA, strA2, i11 <= iA4 ? ib3.f90742f : Arrays.copyOfRange(bArr, iA4, i11));
    }

    public static ua3 b(int i10, jb2 jb2Var, String str) {
        byte[] bArr = new byte[i10];
        jb2Var.a(bArr, 0, i10);
        return new ua3(str, null, new String(bArr, 0, b(0, bArr), "ISO-8859-1"));
    }

    public static wt b(jb2 jb2Var, int i10, int i11, boolean z10, int i12, s21 s21Var) {
        int i13 = jb2Var.f91148b;
        int iB = b(i13, jb2Var.f91147a);
        String str = new String(jb2Var.f91147a, i13, iB - i13, "ISO-8859-1");
        jb2Var.e(iB + 1);
        int iM = jb2Var.m();
        boolean z11 = (iM & 2) != 0;
        boolean z12 = (iM & 1) != 0;
        int iM2 = jb2Var.m();
        String[] strArr = new String[iM2];
        for (int i14 = 0; i14 < iM2; i14++) {
            int i15 = jb2Var.f91148b;
            int iB2 = b(i15, jb2Var.f91147a);
            strArr[i14] = new String(jb2Var.f91147a, i15, iB2 - i15, "ISO-8859-1");
            jb2Var.e(iB2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i16 = i13 + i10;
        while (jb2Var.f91148b < i16) {
            v21 v21VarA = a(i11, jb2Var, z10, i12, s21Var);
            if (v21VarA != null) {
                arrayList.add(v21VarA);
            }
        }
        return new wt(str, z11, z12, strArr, (v21[]) arrayList.toArray(new v21[0]));
    }

    public static /* synthetic */ boolean b(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    public static kt1 c(int i10, jb2 jb2Var) {
        int iR = jb2Var.r();
        int iO = jb2Var.o();
        int iO2 = jb2Var.o();
        int iM = jb2Var.m();
        int iM2 = jb2Var.m();
        ib2 ib2Var = new ib2();
        ib2Var.a(jb2Var.f91149c, jb2Var.f91147a);
        ib2Var.b(jb2Var.f91148b * 8);
        int i11 = ((i10 - 10) * 8) / (iM + iM2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int iA = ib2Var.a(iM);
            int iA2 = ib2Var.a(iM2);
            iArr[i12] = iA;
            iArr2[i12] = iA2;
        }
        return new kt1(iR, iO, iO2, iArr, iArr2);
    }

    public static vi2 d(int i10, jb2 jb2Var) {
        byte[] bArr = new byte[i10];
        jb2Var.a(bArr, 0, i10);
        int iB = b(0, bArr);
        String str = new String(bArr, 0, iB, "ISO-8859-1");
        int i11 = iB + 1;
        return new vi2(str, i10 <= i11 ? ib3.f90742f : Arrays.copyOfRange(bArr, i11, i10));
    }

    public static y53 e(int i10, jb2 jb2Var) {
        if (i10 < 1) {
            return null;
        }
        int iM = jb2Var.m();
        String strB = b(iM);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        jb2Var.a(bArr, 0, i11);
        int iA = a(bArr, 0, iM);
        String str = new String(bArr, 0, iA, strB);
        int iA2 = a(iM) + iA;
        return new y53("TXXX", str, a(iA2, a(bArr, iA2, iM), strB, bArr));
    }

    public static ua3 f(int i10, jb2 jb2Var) {
        if (i10 < 1) {
            return null;
        }
        int iM = jb2Var.m();
        String strB = b(iM);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        jb2Var.a(bArr, 0, i11);
        int iA = a(bArr, 0, iM);
        String str = new String(bArr, 0, iA, strB);
        int iA2 = a(iM) + iA;
        return new ua3("WXXX", str, a(iA2, b(iA2, bArr), "ISO-8859-1", bArr));
    }

    public static int g(int i10, jb2 jb2Var) {
        byte[] bArr = jb2Var.f91147a;
        int i11 = jb2Var.f91148b;
        int i12 = i11;
        while (true) {
            int i13 = i12 + 1;
            if (i13 >= i11 + i10) {
                return i10;
            }
            if ((bArr[i12] & 255) == 255 && bArr[i13] == 0) {
                System.arraycopy(bArr, i12 + 2, bArr, i13, (i10 - (i12 - i11)) - 2);
                i10--;
            }
            i12 = i13;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yads.ts1 a(int r14, byte[] r15) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.u21.a(int, byte[]):yads.ts1");
    }

    @Override // yads.dz2
    public final ts1 a(ws1 ws1Var, ByteBuffer byteBuffer) {
        return a(byteBuffer.limit(), byteBuffer.array());
    }
}
