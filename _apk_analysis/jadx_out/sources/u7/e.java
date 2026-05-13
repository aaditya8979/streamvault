package u7;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.zip.Inflater;
import s7.a0;
import s7.m0;
import s7.z;
import u7.d;

/* JADX INFO: compiled from: ProjectionDecoder.java */
/* JADX INFO: loaded from: classes8.dex */
public final class e {
    @Nullable
    public static d a(byte[] bArr, int i10) {
        ArrayList<d.a> arrayListF;
        a0 a0Var = new a0(bArr);
        try {
            arrayListF = c(a0Var) ? f(a0Var) : e(a0Var);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayListF = null;
        }
        if (arrayListF == null) {
            return null;
        }
        int size = arrayListF.size();
        if (size == 1) {
            return new d(arrayListF.get(0), i10);
        }
        if (size != 2) {
            return null;
        }
        return new d(arrayListF.get(0), arrayListF.get(1), i10);
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >> 1);
    }

    public static boolean c(a0 a0Var) {
        a0Var.Q(4);
        int iN = a0Var.n();
        a0Var.P(0);
        return iN == 1886547818;
    }

    @Nullable
    public static d.a d(a0 a0Var) {
        int iN = a0Var.n();
        if (iN > 10000) {
            return null;
        }
        float[] fArr = new float[iN];
        for (int i10 = 0; i10 < iN; i10++) {
            fArr[i10] = a0Var.m();
        }
        int iN2 = a0Var.n();
        if (iN2 > 32000) {
            return null;
        }
        double d10 = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(((double) iN) * 2.0d) / dLog);
        z zVar = new z(a0Var.d());
        int i11 = 8;
        zVar.p(a0Var.e() * 8);
        float[] fArr2 = new float[iN2 * 5];
        int i12 = 5;
        int[] iArr = new int[5];
        int i13 = 0;
        int i14 = 0;
        while (i13 < iN2) {
            int i15 = 0;
            while (i15 < i12) {
                int iB = iArr[i15] + b(zVar.h(iCeil));
                if (iB >= iN || iB < 0) {
                    return null;
                }
                fArr2[i14] = fArr[iB];
                iArr[i15] = iB;
                i15++;
                i14++;
                i12 = 5;
            }
            i13++;
            i12 = 5;
        }
        zVar.p((zVar.e() + 7) & (-8));
        int i16 = 32;
        int iH = zVar.h(32);
        d.b[] bVarArr = new d.b[iH];
        int i17 = 0;
        while (i17 < iH) {
            int iH2 = zVar.h(i11);
            int iH3 = zVar.h(i11);
            int iH4 = zVar.h(i16);
            if (iH4 > 128000) {
                return null;
            }
            int iCeil2 = (int) Math.ceil(Math.log(((double) iN2) * d10) / dLog);
            float[] fArr3 = new float[iH4 * 3];
            float[] fArr4 = new float[iH4 * 2];
            int iB2 = 0;
            for (int i18 = 0; i18 < iH4; i18++) {
                iB2 += b(zVar.h(iCeil2));
                if (iB2 < 0 || iB2 >= iN2) {
                    return null;
                }
                int i19 = i18 * 3;
                int i20 = iB2 * 5;
                fArr3[i19] = fArr2[i20];
                fArr3[i19 + 1] = fArr2[i20 + 1];
                fArr3[i19 + 2] = fArr2[i20 + 2];
                int i21 = i18 * 2;
                fArr4[i21] = fArr2[i20 + 3];
                fArr4[i21 + 1] = fArr2[i20 + 4];
            }
            bVarArr[i17] = new d.b(iH2, fArr3, fArr4, iH3);
            i17++;
            i16 = 32;
            d10 = 2.0d;
            i11 = 8;
        }
        return new d.a(bVarArr);
    }

    @Nullable
    public static ArrayList<d.a> e(a0 a0Var) {
        if (a0Var.D() != 0) {
            return null;
        }
        a0Var.Q(7);
        int iN = a0Var.n();
        if (iN == 1684433976) {
            a0 a0Var2 = new a0();
            Inflater inflater = new Inflater(true);
            try {
                if (!m0.l0(a0Var, a0Var2, inflater)) {
                    return null;
                }
                inflater.end();
                a0Var = a0Var2;
            } finally {
                inflater.end();
            }
        } else if (iN != 1918990112) {
            return null;
        }
        return g(a0Var);
    }

    @Nullable
    public static ArrayList<d.a> f(a0 a0Var) {
        int iN;
        a0Var.Q(8);
        int iE = a0Var.e();
        int iF = a0Var.f();
        while (iE < iF && (iN = a0Var.n() + iE) > iE && iN <= iF) {
            int iN2 = a0Var.n();
            if (iN2 == 2037673328 || iN2 == 1836279920) {
                a0Var.O(iN);
                return e(a0Var);
            }
            a0Var.P(iN);
            iE = iN;
        }
        return null;
    }

    @Nullable
    public static ArrayList<d.a> g(a0 a0Var) {
        ArrayList<d.a> arrayList = new ArrayList<>();
        int iE = a0Var.e();
        int iF = a0Var.f();
        while (iE < iF) {
            int iN = a0Var.n() + iE;
            if (iN <= iE || iN > iF) {
                return null;
            }
            if (a0Var.n() == 1835365224) {
                d.a aVarD = d(a0Var);
                if (aVarD == null) {
                    return null;
                }
                arrayList.add(aVarD);
            }
            a0Var.P(iN);
            iE = iN;
        }
        return arrayList;
    }
}
