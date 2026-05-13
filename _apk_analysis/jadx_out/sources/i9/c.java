package i9;

import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.qrcode.detector.FinderPatternFinder;
import java.util.Map;
import k8.j;
import k8.k;
import o8.f;
import o8.h;

/* JADX INFO: compiled from: Detector.java */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o8.b f64021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f64022b;

    public c(o8.b bVar) {
        this.f64021a = bVar;
    }

    public static int c(j jVar, j jVar2, j jVar3, float f10) throws NotFoundException {
        int iC = ((p8.a.c(j.b(jVar, jVar2) / f10) + p8.a.c(j.b(jVar, jVar3) / f10)) / 2) + 7;
        int i10 = iC & 3;
        if (i10 == 0) {
            return iC + 1;
        }
        if (i10 == 2) {
            return iC - 1;
        }
        if (i10 != 3) {
            return iC;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static o8.j d(j jVar, j jVar2, j jVar3, j jVar4, int i10) {
        float fC;
        float fD;
        float f10;
        float f11 = i10 - 3.5f;
        if (jVar4 != null) {
            fC = jVar4.c();
            fD = jVar4.d();
            f10 = f11 - 3.0f;
        } else {
            fC = (jVar2.c() - jVar.c()) + jVar3.c();
            fD = (jVar2.d() - jVar.d()) + jVar3.d();
            f10 = f11;
        }
        return o8.j.b(3.5f, 3.5f, f11, 3.5f, f10, f10, 3.5f, f11, jVar.c(), jVar.d(), jVar2.c(), jVar2.d(), fC, fD, jVar3.c(), jVar3.d());
    }

    public static o8.b h(o8.b bVar, o8.j jVar, int i10) throws NotFoundException {
        return h.b().d(bVar, i10, i10, jVar);
    }

    public final float a(j jVar, j jVar2, j jVar3) {
        return (b(jVar, jVar2) + b(jVar, jVar3)) / 2.0f;
    }

    public final float b(j jVar, j jVar2) {
        float fJ = j((int) jVar.c(), (int) jVar.d(), (int) jVar2.c(), (int) jVar2.d());
        float fJ2 = j((int) jVar2.c(), (int) jVar2.d(), (int) jVar.c(), (int) jVar.d());
        return Float.isNaN(fJ) ? fJ2 / 7.0f : Float.isNaN(fJ2) ? fJ / 7.0f : (fJ + fJ2) / 14.0f;
    }

    public final f e(Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        this.f64022b = map == null ? null : (k) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        return g(new FinderPatternFinder(this.f64021a, this.f64022b).g(map));
    }

    public final a f(float f10, int i10, int i11, float f11) throws NotFoundException {
        int i12 = (int) (f11 * f10);
        int iMax = Math.max(0, i10 - i12);
        int iMin = Math.min(this.f64021a.j() - 1, i10 + i12) - iMax;
        float f12 = 3.0f * f10;
        if (iMin < f12) {
            throw NotFoundException.getNotFoundInstance();
        }
        int iMax2 = Math.max(0, i11 - i12);
        int iMin2 = Math.min(this.f64021a.g() - 1, i11 + i12) - iMax2;
        if (iMin2 >= f12) {
            return new b(this.f64021a, iMax, iMax2, iMin, iMin2, f10, this.f64022b).c();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final f g(e eVar) throws NotFoundException, FormatException {
        d dVarB = eVar.b();
        d dVarC = eVar.c();
        d dVarA = eVar.a();
        float fA = a(dVarB, dVarC, dVarA);
        if (fA < 1.0f) {
            throw NotFoundException.getNotFoundInstance();
        }
        int iC = c(dVarB, dVarC, dVarA, fA);
        h9.f fVarG = h9.f.g(iC);
        int iE = fVarG.e() - 7;
        a aVarF = null;
        if (fVarG.d().length > 0) {
            float fC = (dVarC.c() - dVarB.c()) + dVarA.c();
            float fD = (dVarC.d() - dVarB.d()) + dVarA.d();
            float f10 = 1.0f - (3.0f / iE);
            int iC2 = (int) (dVarB.c() + ((fC - dVarB.c()) * f10));
            int iD = (int) (dVarB.d() + (f10 * (fD - dVarB.d())));
            for (int i10 = 4; i10 <= 16; i10 <<= 1) {
                try {
                    aVarF = f(fA, iC2, iD, i10);
                    break;
                } catch (NotFoundException unused) {
                }
            }
        }
        return new f(h(this.f64021a, d(dVarB, dVarC, dVarA, aVarF, iC), iC), aVarF == null ? new j[]{dVarA, dVarB, dVarC} : new j[]{dVarA, dVarB, dVarC, aVarF});
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0087, code lost:
    
        if (r15 != r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008f, code lost:
    
        return p8.a.b(r19, r6, r1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0090, code lost:
    
        return Float.NaN;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float i(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            int r0 = r21 - r19
            int r0 = java.lang.Math.abs(r0)
            int r1 = r20 - r18
            int r1 = java.lang.Math.abs(r1)
            r3 = 1
            if (r0 <= r1) goto L11
            r0 = r3
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L1d
            r4 = r18
            r1 = r19
            r6 = r20
            r5 = r21
            goto L25
        L1d:
            r1 = r18
            r4 = r19
            r5 = r20
            r6 = r21
        L25:
            int r7 = r5 - r1
            int r7 = java.lang.Math.abs(r7)
            int r8 = r6 - r4
            int r8 = java.lang.Math.abs(r8)
            int r9 = -r7
            r10 = 2
            int r9 = r9 / r10
            r11 = -1
            if (r1 >= r5) goto L39
            r12 = r3
            goto L3a
        L39:
            r12 = r11
        L3a:
            if (r4 >= r6) goto L3d
            r11 = r3
        L3d:
            int r5 = r5 + r12
            r13 = r1
            r14 = r4
            r15 = 0
        L41:
            if (r13 == r5) goto L82
            if (r0 == 0) goto L47
            r2 = r14
            goto L48
        L47:
            r2 = r13
        L48:
            if (r0 == 0) goto L4c
            r10 = r13
            goto L4d
        L4c:
            r10 = r14
        L4d:
            if (r15 != r3) goto L57
            r16 = r0
            r0 = r3
            r19 = r5
            r3 = r17
            goto L5e
        L57:
            r3 = r17
            r16 = r0
            r19 = r5
            r0 = 0
        L5e:
            o8.b r5 = r3.f64021a
            boolean r2 = r5.d(r2, r10)
            if (r0 != r2) goto L70
            r0 = 2
            if (r15 != r0) goto L6e
            float r0 = p8.a.b(r13, r14, r1, r4)
            return r0
        L6e:
            int r15 = r15 + 1
        L70:
            int r9 = r9 + r8
            if (r9 <= 0) goto L7a
            if (r14 == r6) goto L78
            int r14 = r14 + r11
            int r9 = r9 - r7
            goto L7a
        L78:
            r0 = 2
            goto L87
        L7a:
            int r13 = r13 + r12
            r5 = r19
            r0 = r16
            r3 = 1
            r10 = 2
            goto L41
        L82:
            r3 = r17
            r19 = r5
            r0 = r10
        L87:
            if (r15 != r0) goto L90
            r5 = r19
            float r0 = p8.a.b(r5, r6, r1, r4)
            return r0
        L90:
            r0 = 2143289344(0x7fc00000, float:NaN)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.c.i(int, int, int, int):float");
    }

    public final float j(int i10, int i11, int i12, int i13) {
        float fJ;
        float fG;
        float fI = i(i10, i11, i12, i13);
        int iJ = i10 - (i12 - i10);
        int iG = 0;
        if (iJ < 0) {
            fJ = i10 / (i10 - iJ);
            iJ = 0;
        } else if (iJ >= this.f64021a.j()) {
            fJ = ((this.f64021a.j() - 1) - i10) / (iJ - i10);
            iJ = this.f64021a.j() - 1;
        } else {
            fJ = 1.0f;
        }
        float f10 = i11;
        int i14 = (int) (f10 - ((i13 - i11) * fJ));
        if (i14 < 0) {
            fG = f10 / (i11 - i14);
        } else if (i14 >= this.f64021a.g()) {
            fG = ((this.f64021a.g() - 1) - i11) / (i14 - i11);
            iG = this.f64021a.g() - 1;
        } else {
            iG = i14;
            fG = 1.0f;
        }
        return (fI + i(i10, i11, (int) (i10 + ((iJ - i10) * fG)), iG)) - 1.0f;
    }
}
