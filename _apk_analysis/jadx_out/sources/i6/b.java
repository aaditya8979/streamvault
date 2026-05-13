package i6;

/* JADX INFO: compiled from: CeaUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b {
    public static void a(long j10, s7.a0 a0Var, b0[] b0VarArr) {
        while (true) {
            if (a0Var.a() <= 1) {
                return;
            }
            int iC = c(a0Var);
            int iC2 = c(a0Var);
            int iE = a0Var.e() + iC2;
            if (iC2 == -1 || iC2 > a0Var.a()) {
                s7.q.i("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iE = a0Var.f();
            } else if (iC == 4 && iC2 >= 8) {
                int iD = a0Var.D();
                int iJ = a0Var.J();
                int iN = iJ == 49 ? a0Var.n() : 0;
                int iD2 = a0Var.D();
                if (iJ == 47) {
                    a0Var.Q(1);
                }
                boolean z10 = iD == 181 && (iJ == 49 || iJ == 47) && iD2 == 3;
                if (iJ == 49) {
                    z10 &= iN == 1195456820;
                }
                if (z10) {
                    b(j10, a0Var, b0VarArr);
                }
            }
            a0Var.P(iE);
        }
    }

    public static void b(long j10, s7.a0 a0Var, b0[] b0VarArr) {
        int iD = a0Var.D();
        if ((iD & 64) != 0) {
            a0Var.Q(1);
            int i10 = (iD & 31) * 3;
            int iE = a0Var.e();
            for (b0 b0Var : b0VarArr) {
                a0Var.P(iE);
                b0Var.e(a0Var, i10);
                if (j10 != -9223372036854775807L) {
                    b0Var.c(j10, 1, i10, 0, null);
                }
            }
        }
    }

    public static int c(s7.a0 a0Var) {
        int i10 = 0;
        while (a0Var.a() != 0) {
            int iD = a0Var.D();
            i10 += iD;
            if (iD != 255) {
                return i10;
            }
        }
        return -1;
    }
}
