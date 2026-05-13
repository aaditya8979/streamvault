package n8;

/* JADX INFO: compiled from: Encoder.java */
/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f75262a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    public static int[] a(o8.a aVar, int i10, int i11) {
        int[] iArr = new int[i11];
        int iL = aVar.l() / i10;
        for (int i12 = 0; i12 < iL; i12++) {
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                i13 |= aVar.g((i12 * i10) + i14) ? 1 << ((i10 - i14) - 1) : 0;
            }
            iArr[i12] = i13;
        }
        return iArr;
    }

    public static void b(o8.b bVar, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12 += 2) {
            int i13 = i10 - i12;
            int i14 = i13;
            while (true) {
                int i15 = i10 + i12;
                if (i14 <= i15) {
                    bVar.l(i14, i13);
                    bVar.l(i14, i15);
                    bVar.l(i13, i14);
                    bVar.l(i15, i14);
                    i14++;
                }
            }
        }
        int i16 = i10 - i11;
        bVar.l(i16, i16);
        int i17 = i16 + 1;
        bVar.l(i17, i16);
        bVar.l(i16, i17);
        int i18 = i10 + i11;
        bVar.l(i18, i16);
        bVar.l(i18, i17);
        bVar.l(i18, i18 - 1);
    }

    public static void c(o8.b bVar, boolean z10, int i10, o8.a aVar) {
        int i11 = i10 / 2;
        int i12 = 0;
        if (z10) {
            while (i12 < 7) {
                int i13 = (i11 - 3) + i12;
                if (aVar.g(i12)) {
                    bVar.l(i13, i11 - 5);
                }
                if (aVar.g(i12 + 7)) {
                    bVar.l(i11 + 5, i13);
                }
                if (aVar.g(20 - i12)) {
                    bVar.l(i13, i11 + 5);
                }
                if (aVar.g(27 - i12)) {
                    bVar.l(i11 - 5, i13);
                }
                i12++;
            }
            return;
        }
        while (i12 < 10) {
            int i14 = (i11 - 5) + i12 + (i12 / 5);
            if (aVar.g(i12)) {
                bVar.l(i14, i11 - 7);
            }
            if (aVar.g(i12 + 10)) {
                bVar.l(i11 + 7, i14);
            }
            if (aVar.g(29 - i12)) {
                bVar.l(i14, i11 + 7);
            }
            if (aVar.g(39 - i12)) {
                bVar.l(i11 - 7, i14);
            }
            i12++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a d(byte[] bArr, int i10, int i11) {
        o8.a aVarH;
        int i12;
        boolean z10;
        int iAbs;
        int i13;
        int i14;
        o8.a aVarA = new d(bArr).a();
        int iL = ((aVarA.l() * i10) / 100) + 11;
        int iL2 = aVarA.l() + iL;
        int i15 = 0;
        int i16 = 1;
        if (i11 == 0) {
            o8.a aVarH2 = null;
            int i17 = 0;
            int i18 = 0;
            while (i17 <= 32) {
                boolean z11 = i17 <= 3 ? i16 : i15;
                int i19 = z11 != 0 ? i17 + 1 : i17;
                int i20 = i(i19, z11);
                if (iL2 <= i20) {
                    if (aVarH2 == null || i18 != f75262a[i19]) {
                        int i21 = f75262a[i19];
                        i18 = i21;
                        aVarH2 = h(aVarA, i21);
                    }
                    int i22 = i20 - (i20 % i18);
                    if ((z11 == 0 || aVarH2.l() <= (i18 << 6)) && aVarH2.l() + iL <= i22) {
                        aVarH = aVarH2;
                        i12 = i18;
                        z10 = z11;
                        iAbs = i19;
                        i13 = i20;
                    }
                }
                i17++;
                i16 = i16;
                i15 = 0;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        boolean z12 = i11 < 0;
        iAbs = Math.abs(i11);
        if (iAbs > (z12 ? 4 : 32)) {
            throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i11)));
        }
        i13 = i(iAbs, z12);
        i12 = f75262a[iAbs];
        int i23 = i13 - (i13 % i12);
        aVarH = h(aVarA, i12);
        z10 = z12;
        if (aVarH.l() + iL > i23) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        if (z12) {
            z10 = z12;
            if (aVarH.l() > (i12 << 6)) {
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
        }
        o8.a aVarE = e(aVarH, i13, i12);
        int iL3 = aVarH.l() / i12;
        o8.a aVarF = f(z10, iAbs, iL3);
        int i24 = (z10 ? 11 : 14) + (iAbs << 2);
        int[] iArr = new int[i24];
        int i25 = 2;
        if (z10) {
            for (int i26 = i15; i26 < i24; i26++) {
                iArr[i26] = i26;
            }
            i14 = i24;
        } else {
            int i27 = i24 / 2;
            i14 = i24 + 1 + (((i27 - 1) / 15) * 2);
            int i28 = i14 / 2;
            for (int i29 = i15; i29 < i27; i29++) {
                iArr[(i27 - i29) - i16] = (i28 - r14) - 1;
                iArr[i27 + i29] = (i29 / 15) + i29 + i28 + i16;
            }
        }
        o8.b bVar = new o8.b(i14);
        int i30 = i15;
        int i31 = i30;
        while (i30 < iAbs) {
            int i32 = ((iAbs - i30) << i25) + (z10 ? 9 : 12);
            int i33 = i15;
            while (i33 < i32) {
                int i34 = i33 << 1;
                while (i15 < i25) {
                    if (aVarE.g(i31 + i34 + i15)) {
                        int i35 = i30 << 1;
                        bVar.l(iArr[i35 + i15], iArr[i35 + i33]);
                    }
                    if (aVarE.g((i32 << 1) + i31 + i34 + i15)) {
                        int i36 = i30 << 1;
                        bVar.l(iArr[i36 + i33], iArr[((i24 - 1) - i36) - i15]);
                    }
                    if (aVarE.g((i32 << 2) + i31 + i34 + i15)) {
                        int i37 = (i24 - 1) - (i30 << 1);
                        bVar.l(iArr[i37 - i15], iArr[i37 - i33]);
                    }
                    if (aVarE.g((i32 * 6) + i31 + i34 + i15)) {
                        int i38 = i30 << 1;
                        bVar.l(iArr[((i24 - 1) - i38) - i33], iArr[i38 + i15]);
                    }
                    i15++;
                    i25 = 2;
                }
                i33++;
                i15 = 0;
                i25 = 2;
            }
            i31 += i32 << 3;
            i30++;
            i15 = 0;
            i25 = 2;
        }
        c(bVar, z10, i14, aVarF);
        if (z10) {
            b(bVar, i14 / 2, 5);
        } else {
            int i39 = i14 / 2;
            b(bVar, i39, 7);
            int i40 = 0;
            int i41 = 0;
            while (i41 < (i24 / 2) - 1) {
                for (int i42 = i39 & 1; i42 < i14; i42 += 2) {
                    int i43 = i39 - i40;
                    bVar.l(i43, i42);
                    int i44 = i39 + i40;
                    bVar.l(i44, i42);
                    bVar.l(i42, i43);
                    bVar.l(i42, i44);
                }
                i41 += 15;
                i40 += 16;
            }
        }
        a aVar = new a();
        aVar.c(z10);
        aVar.f(i14);
        aVar.d(iAbs);
        aVar.b(iL3);
        aVar.e(bVar);
        return aVar;
    }

    public static o8.a e(o8.a aVar, int i10, int i11) {
        int iL = aVar.l() / i11;
        q8.d dVar = new q8.d(g(i11));
        int i12 = i10 / i11;
        int[] iArrA = a(aVar, i11, i12);
        dVar.b(iArrA, i12 - iL);
        o8.a aVar2 = new o8.a();
        aVar2.c(0, i10 % i11);
        for (int i13 : iArrA) {
            aVar2.c(i13, i11);
        }
        return aVar2;
    }

    public static o8.a f(boolean z10, int i10, int i11) {
        o8.a aVar = new o8.a();
        if (z10) {
            aVar.c(i10 - 1, 2);
            aVar.c(i11 - 1, 6);
            return e(aVar, 28, 4);
        }
        aVar.c(i10 - 1, 5);
        aVar.c(i11 - 1, 11);
        return e(aVar, 40, 4);
    }

    public static q8.a g(int i10) {
        if (i10 == 4) {
            return q8.a.f78182k;
        }
        if (i10 == 6) {
            return q8.a.f78181j;
        }
        if (i10 == 8) {
            return q8.a.f78185n;
        }
        if (i10 == 10) {
            return q8.a.f78180i;
        }
        if (i10 == 12) {
            return q8.a.f78179h;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i10)));
    }

    public static o8.a h(o8.a aVar, int i10) {
        o8.a aVar2 = new o8.a();
        int iL = aVar.l();
        int i11 = (1 << i10) - 2;
        int i12 = 0;
        while (i12 < iL) {
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                int i15 = i12 + i14;
                if (i15 >= iL || aVar.g(i15)) {
                    i13 |= 1 << ((i10 - 1) - i14);
                }
            }
            int i16 = i13 & i11;
            if (i16 == i11) {
                aVar2.c(i16, i10);
            } else if (i16 == 0) {
                aVar2.c(i13 | 1, i10);
            } else {
                aVar2.c(i13, i10);
                i12 += i10;
            }
            i12--;
            i12 += i10;
        }
        return aVar2;
    }

    public static int i(int i10, boolean z10) {
        return ((z10 ? 88 : 112) + (i10 << 4)) * i10;
    }
}
