package c9;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.pdf417.decoder.DecodedBitStreamParser;
import java.lang.reflect.Array;
import java.util.ArrayList;
import k8.j;

/* JADX INFO: compiled from: PDF417ScanningDecoder.java */
/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d9.a f6545a = new d9.a();

    public static c a(g gVar) throws NotFoundException {
        int[] iArrJ;
        if (gVar == null || (iArrJ = gVar.j()) == null) {
            return null;
        }
        int iP = p(iArrJ);
        int i10 = 0;
        int i11 = 0;
        for (int i12 : iArrJ) {
            i11 += iP - i12;
            if (i12 > 0) {
                break;
            }
        }
        d[] dVarArrD = gVar.d();
        for (int i13 = 0; i11 > 0 && dVarArrD[i13] == null; i13++) {
            i11--;
        }
        for (int length = iArrJ.length - 1; length >= 0; length--) {
            int i14 = iArrJ[length];
            i10 += iP - i14;
            if (i14 > 0) {
                break;
            }
        }
        for (int length2 = dVarArrD.length - 1; i10 > 0 && dVarArrD[length2] == null; length2--) {
            i10--;
        }
        return gVar.a().a(i11, i10, gVar.k());
    }

    public static void b(e eVar, b[][] bVarArr) throws NotFoundException {
        b bVar = bVarArr[0][1];
        int[] iArrA = bVar.a();
        int iJ = (eVar.j() * eVar.l()) - r(eVar.k());
        if (iArrA.length == 0) {
            if (iJ <= 0 || iJ > 928) {
                throw NotFoundException.getNotFoundInstance();
            }
            bVar.b(iJ);
            return;
        }
        if (iArrA[0] == iJ || iJ <= 0 || iJ > 928) {
            return;
        }
        bVar.b(iJ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0022, code lost:
    
        r0 = -r0;
        r8 = !r8;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(o8.b r5, int r6, int r7, boolean r8, int r9, int r10) {
        /*
            if (r8 == 0) goto L4
            r0 = -1
            goto L5
        L4:
            r0 = 1
        L5:
            r1 = 0
            r2 = r9
        L7:
            r3 = 2
            if (r1 >= r3) goto L28
        La:
            if (r8 == 0) goto Lf
            if (r2 < r6) goto L22
            goto L11
        Lf:
            if (r2 >= r7) goto L22
        L11:
            boolean r4 = r5.d(r2, r10)
            if (r8 != r4) goto L22
            int r4 = r9 - r2
            int r4 = java.lang.Math.abs(r4)
            if (r4 <= r3) goto L20
            return r9
        L20:
            int r2 = r2 + r0
            goto La
        L22:
            int r0 = -r0
            r8 = r8 ^ 1
            int r1 = r1 + 1
            goto L7
        L28:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.i.c(o8.b, int, int, boolean, int, int):int");
    }

    public static boolean d(int i10, int i11, int i12) {
        return i11 + (-2) <= i10 && i10 <= i12 + 2;
    }

    public static int e(int[] iArr, int[] iArr2, int i10) throws ChecksumException {
        if ((iArr2 == null || iArr2.length <= (i10 / 2) + 3) && i10 >= 0 && i10 <= 512) {
            return f6545a.a(iArr, i10, iArr2);
        }
        throw ChecksumException.getChecksumInstance();
    }

    public static b[][] f(e eVar) {
        int iC;
        b[][] bVarArr = (b[][]) Array.newInstance((Class<?>) b.class, eVar.l(), eVar.j() + 2);
        for (b[] bVarArr2 : bVarArr) {
            int i10 = 0;
            while (true) {
                if (i10 < bVarArr2.length) {
                    bVarArr2[i10] = new b();
                    i10++;
                }
            }
        }
        int i11 = 0;
        for (f fVar : eVar.o()) {
            if (fVar != null) {
                for (d dVar : fVar.d()) {
                    if (dVar != null && (iC = dVar.c()) >= 0 && iC < bVarArr.length) {
                        bVarArr[iC][i11].b(dVar.e());
                    }
                }
            }
            i11++;
        }
        return bVarArr;
    }

    public static o8.d g(e eVar) throws NotFoundException, ChecksumException, FormatException {
        b[][] bVarArrF = f(eVar);
        b(eVar, bVarArrF);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[eVar.l() * eVar.j()];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i10 = 0; i10 < eVar.l(); i10++) {
            int i11 = 0;
            while (i11 < eVar.j()) {
                int i12 = i11 + 1;
                int[] iArrA = bVarArrF[i10][i12].a();
                int iJ = (eVar.j() * i10) + i11;
                if (iArrA.length == 0) {
                    arrayList.add(Integer.valueOf(iJ));
                } else if (iArrA.length == 1) {
                    iArr[iJ] = iArrA[0];
                } else {
                    arrayList3.add(Integer.valueOf(iJ));
                    arrayList2.add(iArrA);
                }
                i11 = i12;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i13 = 0; i13 < size; i13++) {
            iArr2[i13] = (int[]) arrayList2.get(i13);
        }
        return h(eVar.k(), iArr, b9.a.b(arrayList), b9.a.b(arrayList3), iArr2);
    }

    public static o8.d h(int i10, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) throws ChecksumException, FormatException {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i11 = 100;
        while (true) {
            int i12 = i11 - 1;
            if (i11 <= 0) {
                throw ChecksumException.getChecksumInstance();
            }
            for (int i13 = 0; i13 < length; i13++) {
                iArr[iArr3[i13]] = iArr4[i13][iArr5[i13]];
            }
            try {
                return j(iArr, i10, iArr2);
            } catch (ChecksumException unused) {
                if (length == 0) {
                    throw ChecksumException.getChecksumInstance();
                }
                int i14 = 0;
                while (true) {
                    if (i14 >= length) {
                        break;
                    }
                    int i15 = iArr5[i14];
                    if (i15 < iArr4[i14].length - 1) {
                        iArr5[i14] = i15 + 1;
                        break;
                    }
                    iArr5[i14] = 0;
                    if (i14 == length - 1) {
                        throw ChecksumException.getChecksumInstance();
                    }
                    i14++;
                }
                i11 = i12;
            }
        }
    }

    public static o8.d i(o8.b bVar, j jVar, j jVar2, j jVar3, j jVar4, int i10, int i11) throws NotFoundException, ChecksumException, FormatException {
        c cVar;
        e eVarV;
        int i12;
        int i13;
        int i14;
        int i15;
        c cVar2 = new c(bVar, jVar, jVar2, jVar3, jVar4);
        g gVarS = null;
        g gVarS2 = null;
        boolean z10 = true;
        while (true) {
            cVar = cVar2;
            if (jVar != null) {
                gVarS = s(bVar, cVar, jVar, true, i10, i11);
            }
            if (jVar3 != null) {
                gVarS2 = s(bVar, cVar, jVar3, false, i10, i11);
            }
            eVarV = v(gVarS, gVarS2);
            if (eVarV == null) {
                throw NotFoundException.getNotFoundInstance();
            }
            cVar2 = eVarV.m();
            if (!z10 || cVar2 == null || (cVar2.g() >= cVar.g() && cVar2.e() <= cVar.e())) {
                break;
            }
            z10 = false;
        }
        eVarV.p(cVar);
        int iJ = eVarV.j() + 1;
        eVarV.q(0, gVarS);
        eVarV.q(iJ, gVarS2);
        boolean z11 = gVarS != null;
        int iMin = i10;
        int iMax = i11;
        for (int i16 = 1; i16 <= iJ; i16++) {
            int i17 = z11 ? i16 : iJ - i16;
            if (eVarV.n(i17) == null) {
                f gVar = (i17 == 0 || i17 == iJ) ? new g(cVar, i17 == 0) : new f(cVar);
                eVarV.q(i17, gVar);
                int i18 = -1;
                int iG = cVar.g();
                int i19 = -1;
                while (iG <= cVar.e()) {
                    int iT = t(eVarV, i17, iG, z11);
                    if (iT >= 0 && iT <= cVar.d()) {
                        i15 = iT;
                    } else if (i19 != i18) {
                        i15 = i19;
                    } else {
                        i12 = i19;
                        i13 = iG;
                        i14 = i18;
                        i19 = i12;
                        iG = i13 + 1;
                        i18 = i14;
                    }
                    i12 = i19;
                    int i20 = iG;
                    i14 = i18;
                    d dVarK = k(bVar, cVar.f(), cVar.d(), z11, i15, i20, iMin, iMax);
                    i13 = i20;
                    if (dVarK != null) {
                        gVar.f(i13, dVarK);
                        iMin = Math.min(iMin, dVarK.f());
                        iMax = Math.max(iMax, dVarK.f());
                        i19 = i15;
                    } else {
                        i19 = i12;
                    }
                    iG = i13 + 1;
                    i18 = i14;
                }
            }
        }
        return g(eVarV);
    }

    public static o8.d j(int[] iArr, int i10, int[] iArr2) throws ChecksumException, FormatException {
        if (iArr.length == 0) {
            throw FormatException.getFormatInstance();
        }
        int i11 = 1 << (i10 + 1);
        int iE = e(iArr, iArr2, i11);
        w(iArr, i11);
        o8.d dVarB = DecodedBitStreamParser.b(iArr, String.valueOf(i10));
        dVarB.k(Integer.valueOf(iE));
        dVarB.j(Integer.valueOf(iArr2.length));
        return dVarB;
    }

    public static d k(o8.b bVar, int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
        int i16;
        int iD;
        int iA;
        int iC = c(bVar, i10, i11, z10, i12, i13);
        int[] iArrQ = q(bVar, i10, i11, z10, iC, i13);
        if (iArrQ == null) {
            return null;
        }
        int iD2 = p8.a.d(iArrQ);
        if (z10) {
            i16 = iC + iD2;
        } else {
            for (int i17 = 0; i17 < iArrQ.length / 2; i17++) {
                int i18 = iArrQ[i17];
                iArrQ[i17] = iArrQ[(iArrQ.length - 1) - i17];
                iArrQ[(iArrQ.length - 1) - i17] = i18;
            }
            iC -= iD2;
            i16 = iC;
        }
        if (d(iD2, i14, i15) && (iA = b9.a.a((iD = h.d(iArrQ)))) != -1) {
            return new d(iC, i16, n(iD), iA);
        }
        return null;
    }

    public static a l(g gVar, g gVar2) {
        a aVarI;
        a aVarI2;
        if (gVar == null || (aVarI = gVar.i()) == null) {
            if (gVar2 == null) {
                return null;
            }
            return gVar2.i();
        }
        if (gVar2 == null || (aVarI2 = gVar2.i()) == null || aVarI.a() == aVarI2.a() || aVarI.b() == aVarI2.b() || aVarI.c() == aVarI2.c()) {
            return aVarI;
        }
        return null;
    }

    public static int[] m(int i10) {
        int[] iArr = new int[8];
        int i11 = 0;
        int i12 = 7;
        while (true) {
            int i13 = i10 & 1;
            if (i13 != i11) {
                i12--;
                if (i12 < 0) {
                    return iArr;
                }
                i11 = i13;
            }
            iArr[i12] = iArr[i12] + 1;
            i10 >>= 1;
        }
    }

    public static int n(int i10) {
        return o(m(i10));
    }

    public static int o(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    public static int p(int[] iArr) {
        int iMax = -1;
        for (int i10 : iArr) {
            iMax = Math.max(iMax, i10);
        }
        return iMax;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] q(o8.b r7, int r8, int r9, boolean r10, int r11, int r12) {
        /*
            r0 = 8
            int[] r1 = new int[r0]
            r2 = 1
            if (r10 == 0) goto L9
            r3 = r2
            goto La
        L9:
            r3 = -1
        La:
            r4 = 0
            r5 = r10
        Lc:
            if (r10 == 0) goto L11
            if (r11 >= r9) goto L27
            goto L13
        L11:
            if (r11 < r8) goto L27
        L13:
            if (r4 >= r0) goto L27
            boolean r6 = r7.d(r11, r12)
            if (r6 != r5) goto L22
            r6 = r1[r4]
            int r6 = r6 + r2
            r1[r4] = r6
            int r11 = r11 + r3
            goto Lc
        L22:
            int r4 = r4 + 1
            r5 = r5 ^ 1
            goto Lc
        L27:
            if (r4 == r0) goto L34
            if (r10 == 0) goto L2c
            r8 = r9
        L2c:
            if (r11 != r8) goto L32
            r7 = 7
            if (r4 != r7) goto L32
            goto L34
        L32:
            r7 = 0
            return r7
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.i.q(o8.b, int, int, boolean, int, int):int[]");
    }

    public static int r(int i10) {
        return 2 << i10;
    }

    public static g s(o8.b bVar, c cVar, j jVar, boolean z10, int i10, int i11) {
        g gVar = new g(cVar, z10);
        int i12 = 0;
        while (i12 < 2) {
            int i13 = i12 == 0 ? 1 : -1;
            int iC = (int) jVar.c();
            for (int iD = (int) jVar.d(); iD <= cVar.e() && iD >= cVar.g(); iD += i13) {
                d dVarK = k(bVar, 0, bVar.j(), z10, iC, iD, i10, i11);
                if (dVarK != null) {
                    gVar.f(iD, dVarK);
                    iC = z10 ? dVarK.d() : dVarK.b();
                }
            }
            i12++;
        }
        return gVar;
    }

    public static int t(e eVar, int i10, int i11, boolean z10) {
        int i12 = z10 ? 1 : -1;
        int i13 = i10 - i12;
        d dVarB = u(eVar, i13) ? eVar.n(i13).b(i11) : null;
        if (dVarB != null) {
            return z10 ? dVarB.b() : dVarB.d();
        }
        d dVarC = eVar.n(i10).c(i11);
        if (dVarC != null) {
            return z10 ? dVarC.d() : dVarC.b();
        }
        if (u(eVar, i13)) {
            dVarC = eVar.n(i13).c(i11);
        }
        if (dVarC != null) {
            return z10 ? dVarC.b() : dVarC.d();
        }
        int i14 = 0;
        while (true) {
            i10 -= i12;
            if (!u(eVar, i10)) {
                c cVarM = eVar.m();
                return z10 ? cVarM.f() : cVarM.d();
            }
            for (d dVar : eVar.n(i10).d()) {
                if (dVar != null) {
                    return (z10 ? dVar.b() : dVar.d()) + (i12 * i14 * (dVar.b() - dVar.d()));
                }
            }
            i14++;
        }
    }

    public static boolean u(e eVar, int i10) {
        return i10 >= 0 && i10 <= eVar.j() + 1;
    }

    public static e v(g gVar, g gVar2) throws NotFoundException {
        a aVarL;
        if ((gVar == null && gVar2 == null) || (aVarL = l(gVar, gVar2)) == null) {
            return null;
        }
        return new e(aVarL, c.j(a(gVar), a(gVar2)));
    }

    public static void w(int[] iArr, int i10) throws FormatException {
        if (iArr.length < 4) {
            throw FormatException.getFormatInstance();
        }
        int i11 = iArr[0];
        if (i11 > iArr.length) {
            throw FormatException.getFormatInstance();
        }
        if (i11 == 0) {
            if (i10 >= iArr.length) {
                throw FormatException.getFormatInstance();
            }
            iArr[0] = iArr.length - i10;
        }
    }
}
