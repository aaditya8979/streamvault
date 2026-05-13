package lp;

import android.text.TextUtils;
import fp.c;
import fp.l;
import gp.f;
import gp.g;

/* JADX INFO: compiled from: DanmakuUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static f a(c cVar, l lVar, f fVar, int i10) {
        if (fVar == null) {
            fVar = new f();
        }
        fVar.g((int) Math.ceil(cVar.f61788o), (int) Math.ceil(cVar.f61789p), lVar.d(), false, i10);
        g gVar = fVar.get();
        if (gVar != null) {
            ((fp.a) lVar).r(cVar, gVar.f62744a, 0.0f, 0.0f, true);
            if (lVar.isHardwareAccelerated()) {
                gVar.e(lVar.getWidth(), lVar.getHeight(), lVar.n(), lVar.h());
            }
        }
        return fVar;
    }

    public static boolean b(int i10, int i11, float[] fArr, float[] fArr2) {
        if (i10 != i11) {
            return false;
        }
        return i10 == 1 ? fArr2[0] < fArr[2] : i10 == 6 && fArr2[2] > fArr[0];
    }

    public static boolean c(l lVar, c cVar, c cVar2, long j10) {
        float[] fArrH = cVar.h(lVar, j10);
        float[] fArrH2 = cVar2.h(lVar, j10);
        if (fArrH == null || fArrH2 == null) {
            return false;
        }
        return b(cVar.getType(), cVar2.getType(), fArrH, fArrH2);
    }

    public static final int d(c cVar, c cVar2) {
        if (cVar == cVar2) {
            return 0;
        }
        if (cVar == null) {
            return -1;
        }
        if (cVar2 == null) {
            return 1;
        }
        long j10 = cVar.j() - cVar2.j();
        if (j10 > 0) {
            return 1;
        }
        if (j10 < 0) {
            return -1;
        }
        int i10 = cVar.f61791r - cVar2.f61791r;
        return i10 != 0 ? i10 < 0 ? -1 : 1 : cVar.hashCode() - cVar.hashCode();
    }

    public static void e(c cVar, CharSequence charSequence) {
        cVar.f61776c = charSequence;
        if (TextUtils.isEmpty(charSequence) || !charSequence.toString().contains("/n")) {
            return;
        }
        String[] strArrSplit = String.valueOf(cVar.f61776c).split("/n", -1);
        if (strArrSplit.length > 1) {
            cVar.f61777d = strArrSplit;
        }
    }

    public static int f(int i10, int i11, int i12) {
        return i10 * i11 * i12;
    }

    public static final boolean g(c cVar, c cVar2) {
        if (cVar == cVar2) {
            return false;
        }
        CharSequence charSequence = cVar.f61776c;
        CharSequence charSequence2 = cVar2.f61776c;
        if (charSequence == charSequence2) {
            return true;
        }
        return charSequence != null && charSequence.equals(charSequence2);
    }

    public static boolean h(l lVar, c cVar, c cVar2, long j10, long j11) {
        int type = cVar.getType();
        if (type != cVar2.getType() || cVar.r()) {
            return false;
        }
        long jB = cVar2.b() - cVar.b();
        if (jB <= 0) {
            return true;
        }
        if (Math.abs(jB) >= j10 || cVar.v() || cVar2.v()) {
            return false;
        }
        if (type == 5 || type == 4) {
            return true;
        }
        return c(lVar, cVar, cVar2, j11) || c(lVar, cVar, cVar2, cVar.b() + cVar.f());
    }
}
