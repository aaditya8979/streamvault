package y8;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k8.i;
import k8.j;
import k8.k;
import x8.q;

/* JADX INFO: compiled from: RSS14Reader.java */
/* JADX INFO: loaded from: classes12.dex */
public final class e extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f87375i = {1, 10, 34, 70, 126};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f87376j = {4, 20, 48, 81};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f87377k = {0, 161, 961, 2015, 2715};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f87378l = {0, 336, IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, 1516};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f87379m = {8, 6, 4, 3, 1};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f87380n = {2, 4, 6, 8};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[][] f87381o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<d> f87382g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<d> f87383h = new ArrayList();

    public static void q(Collection<d> collection, d dVar) {
        if (dVar == null) {
            return;
        }
        boolean z10 = false;
        Iterator<d> it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            d next = it.next();
            if (next.b() == dVar.b()) {
                next.e();
                z10 = true;
                break;
            }
        }
        if (z10) {
            return;
        }
        collection.add(dVar);
    }

    public static boolean s(d dVar, d dVar2) {
        int iA = (dVar.a() + (dVar2.a() * 16)) % 79;
        int iC = (dVar.d().c() * 9) + dVar2.d().c();
        if (iC > 72) {
            iC--;
        }
        if (iC > 8) {
            iC--;
        }
        return iA == iC;
    }

    public static i t(d dVar, d dVar2) {
        String strValueOf = String.valueOf((((long) dVar.b()) * 4537077) + ((long) dVar2.b()));
        StringBuilder sb2 = new StringBuilder(14);
        for (int length = 13 - strValueOf.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(strValueOf);
        int i10 = 0;
        for (int i11 = 0; i11 < 13; i11++) {
            int iCharAt = sb2.charAt(i11) - '0';
            if ((i11 & 1) == 0) {
                iCharAt *= 3;
            }
            i10 += iCharAt;
        }
        int i12 = 10 - (i10 % 10);
        if (i12 == 10) {
            i12 = 0;
        }
        sb2.append(i12);
        j[] jVarArrA = dVar.d().a();
        j[] jVarArrA2 = dVar2.d().a();
        return new i(sb2.toString(), null, new j[]{jVarArrA[0], jVarArrA[1], jVarArrA2[0], jVarArrA2[1]}, BarcodeFormat.RSS_14);
    }

    @Override // x8.q
    public i b(int i10, o8.a aVar, Map<DecodeHintType, ?> map) throws NotFoundException {
        q(this.f87382g, v(aVar, false, i10, map));
        aVar.p();
        q(this.f87383h, v(aVar, true, i10, map));
        aVar.p();
        for (d dVar : this.f87382g) {
            if (dVar.c() > 1) {
                for (d dVar2 : this.f87383h) {
                    if (dVar2.c() > 1 && s(dVar, dVar2)) {
                        return t(dVar, dVar2);
                    }
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0041 A[PHI: r6 r7
      0x0041: PHI (r6v5 boolean) = (r6v2 boolean), (r6v10 boolean) binds: [B:24:0x003f, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x0041: PHI (r7v5 boolean) = (r7v2 boolean), (r7v14 boolean) binds: [B:24:0x003f, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044 A[PHI: r6 r7
      0x0044: PHI (r6v7 boolean) = (r6v2 boolean), (r6v10 boolean) binds: [B:24:0x003f, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r7v11 boolean) = (r7v2 boolean), (r7v14 boolean) binds: [B:24:0x003f, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(boolean r10, int r11) throws com.google.zxing.NotFoundException {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.e.r(boolean, int):void");
    }

    @Override // x8.q, k8.h
    public void reset() {
        this.f87382g.clear();
        this.f87383h.clear();
    }

    public final b u(o8.a aVar, c cVar, boolean z10) throws NotFoundException {
        int[] iArrH = h();
        Arrays.fill(iArrH, 0);
        if (z10) {
            q.f(aVar, cVar.b()[0], iArrH);
        } else {
            q.e(aVar, cVar.b()[1], iArrH);
            int i10 = 0;
            for (int length = iArrH.length - 1; i10 < length; length--) {
                int i11 = iArrH[i10];
                iArrH[i10] = iArrH[length];
                iArrH[length] = i11;
                i10++;
            }
        }
        int i12 = z10 ? 16 : 15;
        float fD = p8.a.d(iArrH) / i12;
        int[] iArrL = l();
        int[] iArrJ = j();
        float[] fArrM = m();
        float[] fArrK = k();
        for (int i13 = 0; i13 < iArrH.length; i13++) {
            float f10 = iArrH[i13] / fD;
            int i14 = (int) (0.5f + f10);
            if (i14 <= 0) {
                i14 = 1;
            } else if (i14 > 8) {
                i14 = 8;
            }
            int i15 = i13 / 2;
            if ((i13 & 1) == 0) {
                iArrL[i15] = i14;
                fArrM[i15] = f10 - i14;
            } else {
                iArrJ[i15] = i14;
                fArrK[i15] = f10 - i14;
            }
        }
        r(z10, i12);
        int i16 = 0;
        int i17 = 0;
        for (int length2 = iArrL.length - 1; length2 >= 0; length2--) {
            int i18 = iArrL[length2];
            i16 = (i16 * 9) + i18;
            i17 += i18;
        }
        int i19 = 0;
        int i20 = 0;
        for (int length3 = iArrJ.length - 1; length3 >= 0; length3--) {
            int i21 = iArrJ[length3];
            i19 = (i19 * 9) + i21;
            i20 += i21;
        }
        int i22 = i16 + (i19 * 3);
        if (!z10) {
            if ((i20 & 1) != 0 || i20 > 10 || i20 < 4) {
                throw NotFoundException.getNotFoundInstance();
            }
            int i23 = (10 - i20) / 2;
            int i24 = f87380n[i23];
            return new b((f.b(iArrJ, 9 - i24, false) * f87376j[i23]) + f.b(iArrL, i24, true) + f87378l[i23], i22);
        }
        if ((i17 & 1) != 0 || i17 > 12 || i17 < 4) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i25 = (12 - i17) / 2;
        int i26 = f87379m[i25];
        return new b((f.b(iArrL, i26, false) * f87375i[i25]) + f.b(iArrJ, 9 - i26, true) + f87377k[i25], i22);
    }

    public final d v(o8.a aVar, boolean z10, int i10, Map<DecodeHintType, ?> map) {
        try {
            c cVarX = x(aVar, i10, z10, w(aVar, z10));
            k kVar = map == null ? null : (k) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
            if (kVar != null) {
                int[] iArrB = cVarX.b();
                float fL = ((iArrB[0] + iArrB[1]) - 1) / 2.0f;
                if (z10) {
                    fL = (aVar.l() - 1) - fL;
                }
                kVar.a(new j(fL, i10));
            }
            b bVarU = u(aVar, cVarX, true);
            b bVarU2 = u(aVar, cVarX, false);
            return new d((bVarU.b() * 1597) + bVarU2.b(), bVarU.a() + (bVarU2.a() * 4), cVarX);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    public final int[] w(o8.a aVar, boolean z10) throws NotFoundException {
        int[] iArrI = i();
        iArrI[0] = 0;
        iArrI[1] = 0;
        iArrI[2] = 0;
        iArrI[3] = 0;
        int iL = aVar.l();
        int i10 = 0;
        boolean z11 = false;
        while (i10 < iL) {
            z11 = !aVar.g(i10);
            if (z10 == z11) {
                break;
            }
            i10++;
        }
        int i11 = 0;
        int i12 = i10;
        while (i10 < iL) {
            if (aVar.g(i10) != z11) {
                iArrI[i11] = iArrI[i11] + 1;
            } else {
                if (i11 != 3) {
                    i11++;
                } else {
                    if (a.o(iArrI)) {
                        return new int[]{i12, i10};
                    }
                    i12 += iArrI[0] + iArrI[1];
                    iArrI[0] = iArrI[2];
                    iArrI[1] = iArrI[3];
                    iArrI[2] = 0;
                    iArrI[3] = 0;
                    i11--;
                }
                iArrI[i11] = 1;
                z11 = !z11;
            }
            i10++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final c x(o8.a aVar, int i10, boolean z10, int[] iArr) throws NotFoundException {
        int iL;
        int i11;
        boolean zG = aVar.g(iArr[0]);
        int i12 = iArr[0] - 1;
        while (i12 >= 0 && zG != aVar.g(i12)) {
            i12--;
        }
        int i13 = i12 + 1;
        int i14 = iArr[0] - i13;
        int[] iArrI = i();
        System.arraycopy(iArrI, 0, iArrI, 1, iArrI.length - 1);
        iArrI[0] = i14;
        int iP = a.p(iArrI, f87381o);
        int i15 = iArr[1];
        if (z10) {
            int iL2 = (aVar.l() - 1) - i13;
            iL = (aVar.l() - 1) - i15;
            i11 = iL2;
        } else {
            iL = i15;
            i11 = i13;
        }
        return new c(iP, new int[]{i13, iArr[1]}, i11, iL, i10);
    }
}
