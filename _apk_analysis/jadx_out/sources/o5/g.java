package o5;

import a6.m;
import a6.t;
import k4.u;

/* JADX INFO: compiled from: CeaUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public final class g {
    public static void a(long j10, t tVar, u[] uVarArr) {
        while (true) {
            if (tVar.a() <= 1) {
                return;
            }
            int iC = c(tVar);
            int iC2 = c(tVar);
            int iC3 = tVar.c() + iC2;
            if (iC2 == -1 || iC2 > tVar.a()) {
                m.h("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iC3 = tVar.d();
            } else if (iC == 4 && iC2 >= 8) {
                int iY = tVar.y();
                int iE = tVar.E();
                int iJ = iE == 49 ? tVar.j() : 0;
                int iY2 = tVar.y();
                if (iE == 47) {
                    tVar.M(1);
                }
                boolean z10 = iY == 181 && (iE == 49 || iE == 47) && iY2 == 3;
                if (iE == 49) {
                    z10 &= iJ == 1195456820;
                }
                if (z10) {
                    b(j10, tVar, uVarArr);
                }
            }
            tVar.L(iC3);
        }
    }

    public static void b(long j10, t tVar, u[] uVarArr) {
        int iY = tVar.y();
        if ((iY & 64) != 0) {
            tVar.M(1);
            int i10 = (iY & 31) * 3;
            int iC = tVar.c();
            for (u uVar : uVarArr) {
                tVar.L(iC);
                uVar.a(tVar, i10);
                uVar.c(j10, 1, i10, 0, null);
            }
        }
    }

    public static int c(t tVar) {
        int i10 = 0;
        while (tVar.a() != 0) {
            int iY = tVar.y();
            i10 += iY;
            if (iY != 255) {
                return i10;
            }
        }
        return -1;
    }
}
