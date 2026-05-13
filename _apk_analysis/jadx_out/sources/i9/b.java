package i9;

import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.List;
import k8.k;

/* JADX INFO: compiled from: AlignmentPatternFinder.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o8.b f64012a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f64014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f64015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f64016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f64017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f64018g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k f64020i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<a> f64013b = new ArrayList(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f64019h = new int[3];

    public b(o8.b bVar, int i10, int i11, int i12, int i13, float f10, k kVar) {
        this.f64012a = bVar;
        this.f64014c = i10;
        this.f64015d = i11;
        this.f64016e = i12;
        this.f64017f = i13;
        this.f64018g = f10;
        this.f64020i = kVar;
    }

    public static float a(int[] iArr, int i10) {
        return (i10 - iArr[2]) - (iArr[1] / 2.0f);
    }

    public final float b(int i10, int i11, int i12, int i13) {
        o8.b bVar = this.f64012a;
        int iG = bVar.g();
        int[] iArr = this.f64019h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i14 = i10;
        while (i14 >= 0 && bVar.d(i11, i14)) {
            int i15 = iArr[1];
            if (i15 > i12) {
                break;
            }
            iArr[1] = i15 + 1;
            i14--;
        }
        if (i14 >= 0 && iArr[1] <= i12) {
            while (i14 >= 0 && !bVar.d(i11, i14)) {
                int i16 = iArr[0];
                if (i16 > i12) {
                    break;
                }
                iArr[0] = i16 + 1;
                i14--;
            }
            if (iArr[0] > i12) {
                return Float.NaN;
            }
            int i17 = i10 + 1;
            while (i17 < iG && bVar.d(i11, i17)) {
                int i18 = iArr[1];
                if (i18 > i12) {
                    break;
                }
                iArr[1] = i18 + 1;
                i17++;
            }
            if (i17 != iG && iArr[1] <= i12) {
                while (i17 < iG && !bVar.d(i11, i17)) {
                    int i19 = iArr[2];
                    if (i19 > i12) {
                        break;
                    }
                    iArr[2] = i19 + 1;
                    i17++;
                }
                int i20 = iArr[2];
                if (i20 <= i12 && Math.abs(((iArr[0] + iArr[1]) + i20) - i13) * 5 < i13 * 2 && d(iArr)) {
                    return a(iArr, i17);
                }
            }
        }
        return Float.NaN;
    }

    public a c() throws NotFoundException {
        a aVarE;
        a aVarE2;
        int i10 = this.f64014c;
        int i11 = this.f64017f;
        int i12 = this.f64016e + i10;
        int i13 = this.f64015d + (i11 / 2);
        int[] iArr = new int[3];
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = ((i14 & 1) == 0 ? (i14 + 1) / 2 : -((i14 + 1) / 2)) + i13;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i16 = i10;
            while (i16 < i12 && !this.f64012a.d(i16, i15)) {
                i16++;
            }
            int i17 = 0;
            while (i16 < i12) {
                if (!this.f64012a.d(i16, i15)) {
                    if (i17 == 1) {
                        i17++;
                    }
                    iArr[i17] = iArr[i17] + 1;
                } else if (i17 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i17 != 2) {
                    i17++;
                    iArr[i17] = iArr[i17] + 1;
                } else {
                    if (d(iArr) && (aVarE2 = e(iArr, i15, i16)) != null) {
                        return aVarE2;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i17 = 1;
                }
                i16++;
            }
            if (d(iArr) && (aVarE = e(iArr, i15, i12)) != null) {
                return aVarE;
            }
        }
        if (this.f64013b.isEmpty()) {
            throw NotFoundException.getNotFoundInstance();
        }
        return this.f64013b.get(0);
    }

    public final boolean d(int[] iArr) {
        float f10 = this.f64018g;
        float f11 = f10 / 2.0f;
        for (int i10 = 0; i10 < 3; i10++) {
            if (Math.abs(f10 - iArr[i10]) >= f11) {
                return false;
            }
        }
        return true;
    }

    public final a e(int[] iArr, int i10, int i11) {
        int i12 = iArr[0] + iArr[1] + iArr[2];
        float fA = a(iArr, i11);
        float fB = b(i10, (int) fA, iArr[1] * 2, i12);
        if (Float.isNaN(fB)) {
            return null;
        }
        float f10 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        for (a aVar : this.f64013b) {
            if (aVar.f(f10, fB, fA)) {
                return aVar.g(fB, fA, f10);
            }
        }
        a aVar2 = new a(fA, fB, f10);
        this.f64013b.add(aVar2);
        k kVar = this.f64020i;
        if (kVar == null) {
            return null;
        }
        kVar.a(aVar2);
        return null;
    }
}
