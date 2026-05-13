package m8;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import k8.j;
import o8.b;
import o8.h;
import q8.c;

/* JADX INFO: compiled from: Detector.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f74009g = {3808, 476, 2107, 1799};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f74010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f74011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f74012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f74013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f74014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f74015f;

    /* JADX INFO: renamed from: m8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Detector.java */
    public static final class C0878a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f74016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f74017b;

        public C0878a(int i10, int i11) {
            this.f74016a = i10;
            this.f74017b = i11;
        }

        public int a() {
            return this.f74016a;
        }

        public int b() {
            return this.f74017b;
        }

        public j c() {
            return new j(this.f74016a, this.f74017b);
        }

        public String toString() {
            return "<" + this.f74016a + ' ' + this.f74017b + '>';
        }
    }

    public a(b bVar) {
        this.f74010a = bVar;
    }

    public static float b(j jVar, j jVar2) {
        return p8.a.a(jVar.c(), jVar.d(), jVar2.c(), jVar2.d());
    }

    public static float c(C0878a c0878a, C0878a c0878a2) {
        return p8.a.b(c0878a.a(), c0878a.b(), c0878a2.a(), c0878a2.b());
    }

    public static j[] d(j[] jVarArr, int i10, int i11) {
        float f10 = i11 / (i10 * 2.0f);
        float fC = jVarArr[0].c() - jVarArr[2].c();
        float fD = jVarArr[0].d() - jVarArr[2].d();
        float fC2 = (jVarArr[0].c() + jVarArr[2].c()) / 2.0f;
        float fD2 = (jVarArr[0].d() + jVarArr[2].d()) / 2.0f;
        float f11 = fC * f10;
        float f12 = fD * f10;
        j jVar = new j(fC2 + f11, fD2 + f12);
        j jVar2 = new j(fC2 - f11, fD2 - f12);
        float fC3 = jVarArr[1].c() - jVarArr[3].c();
        float fD3 = jVarArr[1].d() - jVarArr[3].d();
        float fC4 = (jVarArr[1].c() + jVarArr[3].c()) / 2.0f;
        float fD4 = (jVarArr[1].d() + jVarArr[3].d()) / 2.0f;
        float f13 = fC3 * f10;
        float f14 = f10 * fD3;
        return new j[]{jVar, new j(fC4 + f13, fD4 + f14), jVar2, new j(fC4 - f13, fD4 - f14)};
    }

    public static int h(long j10, boolean z10) throws NotFoundException {
        int i10;
        int i11;
        if (z10) {
            i10 = 7;
            i11 = 2;
        } else {
            i10 = 10;
            i11 = 4;
        }
        int i12 = i10 - i11;
        int[] iArr = new int[i10];
        for (int i13 = i10 - 1; i13 >= 0; i13--) {
            iArr[i13] = ((int) j10) & 15;
            j10 >>= 4;
        }
        try {
            new c(q8.a.f78182k).a(iArr, i12);
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                i14 = (i14 << 4) + iArr[i15];
            }
            return i14;
        } catch (ReedSolomonException unused) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    public static int m(int[] iArr, int i10) throws NotFoundException {
        int i11 = 0;
        for (int i12 : iArr) {
            i11 = (i11 << 3) + ((i12 >> (i10 - 2)) << 1) + (i12 & 1);
        }
        int i13 = ((i11 & 1) << 11) + (i11 >> 1);
        for (int i14 = 0; i14 < 4; i14++) {
            if (Integer.bitCount(f74009g[i14] ^ i13) <= 2) {
                return i14;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public l8.a a(boolean z10) throws NotFoundException {
        j[] jVarArrF = f(k());
        if (z10) {
            j jVar = jVarArrF[0];
            jVarArrF[0] = jVarArrF[2];
            jVarArrF[2] = jVar;
        }
        e(jVarArrF);
        b bVar = this.f74010a;
        int i10 = this.f74015f;
        return new l8.a(q(bVar, jVarArrF[i10 % 4], jVarArrF[(i10 + 1) % 4], jVarArrF[(i10 + 2) % 4], jVarArrF[(i10 + 3) % 4]), l(jVarArrF), this.f74011b, this.f74013d, this.f74012c);
    }

    public final void e(j[] jVarArr) throws NotFoundException {
        long j10;
        long j11;
        if (!o(jVarArr[0]) || !o(jVarArr[1]) || !o(jVarArr[2]) || !o(jVarArr[3])) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i10 = this.f74014e * 2;
        int[] iArr = {r(jVarArr[0], jVarArr[1], i10), r(jVarArr[1], jVarArr[2], i10), r(jVarArr[2], jVarArr[3], i10), r(jVarArr[3], jVarArr[0], i10)};
        this.f74015f = m(iArr, i10);
        long j12 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = iArr[(this.f74015f + i11) % 4];
            if (this.f74011b) {
                j10 = j12 << 7;
                j11 = (i12 >> 1) & 127;
            } else {
                j10 = j12 << 10;
                j11 = ((i12 >> 2) & 992) + ((i12 >> 1) & 31);
            }
            j12 = j10 + j11;
        }
        int iH = h(j12, this.f74011b);
        if (this.f74011b) {
            this.f74012c = (iH >> 6) + 1;
            this.f74013d = (iH & 63) + 1;
        } else {
            this.f74012c = (iH >> 11) + 1;
            this.f74013d = (iH & 2047) + 1;
        }
    }

    public final j[] f(C0878a c0878a) throws NotFoundException {
        this.f74014e = 1;
        C0878a c0878a2 = c0878a;
        C0878a c0878a3 = c0878a2;
        C0878a c0878a4 = c0878a3;
        boolean z10 = true;
        while (this.f74014e < 9) {
            C0878a c0878aJ = j(c0878a, z10, 1, -1);
            C0878a c0878aJ2 = j(c0878a2, z10, 1, 1);
            C0878a c0878aJ3 = j(c0878a3, z10, -1, 1);
            C0878a c0878aJ4 = j(c0878a4, z10, -1, -1);
            if (this.f74014e > 2) {
                double dC = (c(c0878aJ4, c0878aJ) * this.f74014e) / (c(c0878a4, c0878a) * (this.f74014e + 2));
                if (dC < 0.75d || dC > 1.25d || !p(c0878aJ, c0878aJ2, c0878aJ3, c0878aJ4)) {
                    break;
                }
            }
            z10 = !z10;
            this.f74014e++;
            c0878a4 = c0878aJ4;
            c0878a = c0878aJ;
            c0878a2 = c0878aJ2;
            c0878a3 = c0878aJ3;
        }
        int i10 = this.f74014e;
        if (i10 != 5 && i10 != 7) {
            throw NotFoundException.getNotFoundInstance();
        }
        this.f74011b = i10 == 5;
        j[] jVarArr = {new j(c0878a.a() + 0.5f, c0878a.b() - 0.5f), new j(c0878a2.a() + 0.5f, c0878a2.b() + 0.5f), new j(c0878a3.a() - 0.5f, c0878a3.b() + 0.5f), new j(c0878a4.a() - 0.5f, c0878a4.b() - 0.5f)};
        int i11 = this.f74014e;
        return d(jVarArr, (i11 * 2) - 3, i11 * 2);
    }

    public final int g(C0878a c0878a, C0878a c0878a2) {
        float fC = c(c0878a, c0878a2);
        float fA = (c0878a2.a() - c0878a.a()) / fC;
        float fB = (c0878a2.b() - c0878a.b()) / fC;
        float fA2 = c0878a.a();
        float fB2 = c0878a.b();
        boolean zD = this.f74010a.d(c0878a.a(), c0878a.b());
        int iCeil = (int) Math.ceil(fC);
        int i10 = 0;
        for (int i11 = 0; i11 < iCeil; i11++) {
            fA2 += fA;
            fB2 += fB;
            if (this.f74010a.d(p8.a.c(fA2), p8.a.c(fB2)) != zD) {
                i10++;
            }
        }
        float f10 = i10 / fC;
        if (f10 <= 0.1f || f10 >= 0.9f) {
            return (f10 <= 0.1f) == zD ? 1 : -1;
        }
        return 0;
    }

    public final int i() {
        if (this.f74011b) {
            return (this.f74012c * 4) + 11;
        }
        int i10 = this.f74012c;
        return i10 <= 4 ? (i10 * 4) + 15 : (i10 * 4) + ((((i10 - 4) / 8) + 1) * 2) + 15;
    }

    public final C0878a j(C0878a c0878a, boolean z10, int i10, int i11) {
        int iA = c0878a.a() + i10;
        int iB = c0878a.b();
        while (true) {
            iB += i11;
            if (!n(iA, iB) || this.f74010a.d(iA, iB) != z10) {
                break;
            }
            iA += i10;
        }
        int i12 = iA - i10;
        int i13 = iB - i11;
        while (n(i12, i13) && this.f74010a.d(i12, i13) == z10) {
            i12 += i10;
        }
        int i14 = i12 - i10;
        while (n(i14, i13) && this.f74010a.d(i14, i13) == z10) {
            i13 += i11;
        }
        return new C0878a(i14, i13 - i11);
    }

    public final C0878a k() {
        j jVarC;
        j jVar;
        j jVar2;
        j jVar3;
        j jVarC2;
        j jVarC3;
        j jVarC4;
        j jVarC5;
        try {
            j[] jVarArrC = new p8.b(this.f74010a).c();
            jVar2 = jVarArrC[0];
            jVar3 = jVarArrC[1];
            jVar = jVarArrC[2];
            jVarC = jVarArrC[3];
        } catch (NotFoundException unused) {
            int iJ = this.f74010a.j() / 2;
            int iG = this.f74010a.g() / 2;
            int i10 = iJ + 7;
            int i11 = iG - 7;
            j jVarC6 = j(new C0878a(i10, i11), false, 1, -1).c();
            int i12 = iG + 7;
            j jVarC7 = j(new C0878a(i10, i12), false, 1, 1).c();
            int i13 = iJ - 7;
            j jVarC8 = j(new C0878a(i13, i12), false, -1, 1).c();
            jVarC = j(new C0878a(i13, i11), false, -1, -1).c();
            jVar = jVarC8;
            jVar2 = jVarC6;
            jVar3 = jVarC7;
        }
        int iC = p8.a.c((((jVar2.c() + jVarC.c()) + jVar3.c()) + jVar.c()) / 4.0f);
        int iC2 = p8.a.c((((jVar2.d() + jVarC.d()) + jVar3.d()) + jVar.d()) / 4.0f);
        try {
            j[] jVarArrC2 = new p8.b(this.f74010a, 15, iC, iC2).c();
            jVarC2 = jVarArrC2[0];
            jVarC3 = jVarArrC2[1];
            jVarC4 = jVarArrC2[2];
            jVarC5 = jVarArrC2[3];
        } catch (NotFoundException unused2) {
            int i14 = iC + 7;
            int i15 = iC2 - 7;
            jVarC2 = j(new C0878a(i14, i15), false, 1, -1).c();
            int i16 = iC2 + 7;
            jVarC3 = j(new C0878a(i14, i16), false, 1, 1).c();
            int i17 = iC - 7;
            jVarC4 = j(new C0878a(i17, i16), false, -1, 1).c();
            jVarC5 = j(new C0878a(i17, i15), false, -1, -1).c();
        }
        return new C0878a(p8.a.c((((jVarC2.c() + jVarC5.c()) + jVarC3.c()) + jVarC4.c()) / 4.0f), p8.a.c((((jVarC2.d() + jVarC5.d()) + jVarC3.d()) + jVarC4.d()) / 4.0f));
    }

    public final j[] l(j[] jVarArr) {
        return d(jVarArr, this.f74014e * 2, i());
    }

    public final boolean n(int i10, int i11) {
        return i10 >= 0 && i10 < this.f74010a.j() && i11 > 0 && i11 < this.f74010a.g();
    }

    public final boolean o(j jVar) {
        return n(p8.a.c(jVar.c()), p8.a.c(jVar.d()));
    }

    public final boolean p(C0878a c0878a, C0878a c0878a2, C0878a c0878a3, C0878a c0878a4) {
        C0878a c0878a5 = new C0878a(c0878a.a() - 3, c0878a.b() + 3);
        C0878a c0878a6 = new C0878a(c0878a2.a() - 3, c0878a2.b() - 3);
        C0878a c0878a7 = new C0878a(c0878a3.a() + 3, c0878a3.b() - 3);
        C0878a c0878a8 = new C0878a(c0878a4.a() + 3, c0878a4.b() + 3);
        int iG = g(c0878a8, c0878a5);
        return iG != 0 && g(c0878a5, c0878a6) == iG && g(c0878a6, c0878a7) == iG && g(c0878a7, c0878a8) == iG;
    }

    public final b q(b bVar, j jVar, j jVar2, j jVar3, j jVar4) throws NotFoundException {
        h hVarB = h.b();
        int i10 = i();
        float f10 = i10 / 2.0f;
        int i11 = this.f74014e;
        float f11 = f10 - i11;
        float f12 = f10 + i11;
        return hVarB.c(bVar, i10, i10, f11, f11, f12, f11, f12, f12, f11, f12, jVar.c(), jVar.d(), jVar2.c(), jVar2.d(), jVar3.c(), jVar3.d(), jVar4.c(), jVar4.d());
    }

    public final int r(j jVar, j jVar2, int i10) {
        float fB = b(jVar, jVar2);
        float f10 = fB / i10;
        float fC = jVar.c();
        float fD = jVar.d();
        float fC2 = ((jVar2.c() - jVar.c()) * f10) / fB;
        float fD2 = (f10 * (jVar2.d() - jVar.d())) / fB;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            float f11 = i12;
            if (this.f74010a.d(p8.a.c((f11 * fC2) + fC), p8.a.c((f11 * fD2) + fD))) {
                i11 |= 1 << ((i10 - i12) - 1);
            }
        }
        return i11;
    }
}
