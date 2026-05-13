package e9;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import k8.j;

/* JADX INFO: compiled from: Detector.java */
/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f60940a = {0, 4, 1, 5};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f60941b = {6, 2, 7, 3};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f60942c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f60943d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    public static void a(j[] jVarArr, j[] jVarArr2, int[] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            jVarArr[iArr[i10]] = jVarArr2[i10];
        }
    }

    public static b b(k8.b bVar, Map<DecodeHintType, ?> map, boolean z10) throws NotFoundException {
        o8.b bVarA = bVar.a();
        List<j[]> listC = c(z10, bVarA);
        if (listC.isEmpty()) {
            bVarA = bVarA.clone();
            bVarA.k();
            listC = c(z10, bVarA);
        }
        return new b(bVarA, listC);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r5 == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (r4.hasNext() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r5 = (k8.j[]) r4.next();
        r7 = r5[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r7 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        r3 = (int) java.lang.Math.max(r3, r7.d());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        r5 = r5[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (r5 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        r3 = java.lang.Math.max(r3, (int) r5.d());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<k8.j[]> c(boolean r8, o8.b r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            r2 = 0
            r3 = r2
            r4 = r3
        L9:
            r5 = r4
        La:
            int r6 = r9.g()
            if (r3 >= r6) goto L77
            k8.j[] r4 = f(r9, r3, r4)
            r6 = r4[r2]
            if (r6 != 0) goto L4f
            r6 = 3
            r7 = r4[r6]
            if (r7 != 0) goto L4f
            if (r5 == 0) goto L77
            java.util.Iterator r4 = r0.iterator()
        L23:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4b
            java.lang.Object r5 = r4.next()
            k8.j[] r5 = (k8.j[]) r5
            r7 = r5[r1]
            if (r7 == 0) goto L3d
            float r3 = (float) r3
            float r7 = r7.d()
            float r3 = java.lang.Math.max(r3, r7)
            int r3 = (int) r3
        L3d:
            r5 = r5[r6]
            if (r5 == 0) goto L23
            float r5 = r5.d()
            int r5 = (int) r5
            int r3 = java.lang.Math.max(r3, r5)
            goto L23
        L4b:
            int r3 = r3 + 5
            r4 = r2
            goto L9
        L4f:
            r0.add(r4)
            if (r8 == 0) goto L77
            r3 = 2
            r5 = r4[r3]
            if (r5 == 0) goto L65
            float r5 = r5.c()
            int r5 = (int) r5
            r3 = r4[r3]
            float r3 = r3.d()
            goto L73
        L65:
            r3 = 4
            r5 = r4[r3]
            float r5 = r5.c()
            int r5 = (int) r5
            r3 = r4[r3]
            float r3 = r3.d()
        L73:
            int r3 = (int) r3
            r4 = r5
            r5 = r1
            goto La
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.a.c(boolean, o8.b):java.util.List");
    }

    public static int[] d(o8.b bVar, int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i13 = 0;
        while (bVar.d(i10, i11) && i10 > 0) {
            int i14 = i13 + 1;
            if (i13 >= 3) {
                break;
            }
            i10--;
            i13 = i14;
        }
        int length = iArr.length;
        int i15 = i10;
        int i16 = 0;
        boolean z10 = false;
        while (i10 < i12) {
            if (bVar.d(i10, i11) != z10) {
                iArr2[i16] = iArr2[i16] + 1;
            } else {
                if (i16 != length - 1) {
                    i16++;
                } else {
                    if (g(iArr2, iArr) < 0.42f) {
                        return new int[]{i15, i10};
                    }
                    i15 += iArr2[0] + iArr2[1];
                    int i17 = i16 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i17);
                    iArr2[i17] = 0;
                    iArr2[i16] = 0;
                    i16--;
                }
                iArr2[i16] = 1;
                z10 = !z10;
            }
            i10++;
        }
        if (i16 != length - 1 || g(iArr2, iArr) >= 0.42f) {
            return null;
        }
        return new int[]{i15, i10 - 1};
    }

    public static j[] e(o8.b bVar, int i10, int i11, int i12, int i13, int[] iArr) {
        boolean z10;
        int i14;
        int i15;
        j[] jVarArr = new j[4];
        int[] iArr2 = new int[iArr.length];
        int i16 = i12;
        while (true) {
            if (i16 >= i10) {
                z10 = false;
                break;
            }
            int[] iArrD = d(bVar, i13, i16, i11, iArr, iArr2);
            if (iArrD != null) {
                int i17 = i16;
                int[] iArr3 = iArrD;
                int i18 = i17;
                while (true) {
                    if (i18 <= 0) {
                        i15 = i18;
                        break;
                    }
                    int i19 = i18 - 1;
                    int[] iArrD2 = d(bVar, i13, i19, i11, iArr, iArr2);
                    if (iArrD2 == null) {
                        i15 = i19 + 1;
                        break;
                    }
                    iArr3 = iArrD2;
                    i18 = i19;
                }
                float f10 = i15;
                jVarArr[0] = new j(iArr3[0], f10);
                jVarArr[1] = new j(iArr3[1], f10);
                z10 = true;
                i16 = i15;
            } else {
                i16 += 5;
            }
        }
        int i20 = i16 + 1;
        if (z10) {
            int[] iArr4 = {(int) jVarArr[0].c(), (int) jVarArr[1].c()};
            int i21 = i20;
            int i22 = 0;
            while (true) {
                if (i21 >= i10) {
                    i14 = i22;
                    break;
                }
                i14 = i22;
                int[] iArrD3 = d(bVar, iArr4[0], i21, i11, iArr, iArr2);
                if (iArrD3 != null && Math.abs(iArr4[0] - iArrD3[0]) < 5 && Math.abs(iArr4[1] - iArrD3[1]) < 5) {
                    iArr4 = iArrD3;
                    i22 = 0;
                } else {
                    if (i14 > 25) {
                        break;
                    }
                    i22 = i14 + 1;
                }
                i21++;
            }
            i20 = i21 - (i14 + 1);
            float f11 = i20;
            jVarArr[2] = new j(iArr4[0], f11);
            jVarArr[3] = new j(iArr4[1], f11);
        }
        if (i20 - i16 < 10) {
            Arrays.fill(jVarArr, (Object) null);
        }
        return jVarArr;
    }

    public static j[] f(o8.b bVar, int i10, int i11) {
        int iG = bVar.g();
        int iJ = bVar.j();
        j[] jVarArr = new j[8];
        a(jVarArr, e(bVar, iG, iJ, i10, i11, f60942c), f60940a);
        j jVar = jVarArr[4];
        if (jVar != null) {
            i11 = (int) jVar.c();
            i10 = (int) jVarArr[4].d();
        }
        a(jVarArr, e(bVar, iG, iJ, i10, i11, f60943d), f60941b);
        return jVarArr;
    }

    public static float g(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i10 += iArr[i12];
            i11 += iArr2[i12];
        }
        if (i10 < i11) {
            return Float.POSITIVE_INFINITY;
        }
        float f10 = i10;
        float f11 = f10 / i11;
        float f12 = 0.8f * f11;
        float f13 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            float f14 = iArr2[i13] * f11;
            float f15 = iArr[i13];
            float f16 = f15 > f14 ? f15 - f14 : f14 - f15;
            if (f16 > f12) {
                return Float.POSITIVE_INFINITY;
            }
            f13 += f16;
        }
        return f13 / f10;
    }
}
