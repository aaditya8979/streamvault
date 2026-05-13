package yads;

import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
public final class hs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f90520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TreeSet f90522c = new TreeSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f90523d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public jc0 f90524e;

    public hs(int i10, String str, jc0 jc0Var) {
        this.f90520a = i10;
        this.f90521b = str;
        this.f90524e = jc0Var;
    }

    public final long a(long j10, long j11) {
        if (j10 < 0) {
            throw new IllegalArgumentException();
        }
        if (j11 < 0) {
            throw new IllegalArgumentException();
        }
        yy2 yy2VarB = b(j10, j11);
        if (!yy2VarB.f97754e) {
            long j12 = yy2VarB.f97753d;
            return -Math.min(j12 != -1 ? j12 : Long.MAX_VALUE, j11);
        }
        long j13 = j10 + j11;
        long j14 = j13 >= 0 ? j13 : Long.MAX_VALUE;
        long jMax = yy2VarB.f97752c + yy2VarB.f97753d;
        if (jMax < j14) {
            for (yy2 yy2Var : this.f90522c.tailSet(yy2VarB, false)) {
                long j15 = yy2Var.f97752c;
                if (j15 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j15 + yy2Var.f97753d);
                if (jMax >= j14) {
                    break;
                }
            }
        }
        return Math.min(jMax - j10, j11);
    }

    public final yy2 b(long j10, long j11) {
        long j12;
        yy2 yy2Var = new yy2(this.f90521b, j10, -1L, -9223372036854775807L, null);
        yy2 yy2Var2 = (yy2) this.f90522c.floor(yy2Var);
        if (yy2Var2 != null && yy2Var2.f97752c + yy2Var2.f97753d > j10) {
            return yy2Var2;
        }
        yy2 yy2Var3 = (yy2) this.f90522c.ceiling(yy2Var);
        if (yy2Var3 != null) {
            long j13 = yy2Var3.f97752c - j10;
            if (j11 == -1) {
                j12 = j13;
            } else {
                j11 = Math.min(j13, j11);
                j12 = j11;
            }
        } else {
            j12 = j11;
        }
        return new yy2(this.f90521b, j10, j12, -9223372036854775807L, null);
    }

    public final boolean c(long j10, long j11) {
        for (int i10 = 0; i10 < this.f90523d.size(); i10++) {
            gs gsVar = (gs) this.f90523d.get(i10);
            long j12 = gsVar.f90096b;
            if (j12 == -1) {
                if (j10 >= gsVar.f90095a) {
                    return true;
                }
            } else if (j11 == -1) {
                continue;
            } else {
                long j13 = gsVar.f90095a;
                if (j13 <= j10 && j10 + j11 <= j13 + j12) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hs.class != obj.getClass()) {
            return false;
        }
        hs hsVar = (hs) obj;
        return this.f90520a == hsVar.f90520a && this.f90521b.equals(hsVar.f90521b) && this.f90522c.equals(hsVar.f90522c) && this.f90524e.equals(hsVar.f90524e);
    }

    public final int hashCode() {
        return this.f90524e.hashCode() + k4.a(this.f90521b, this.f90520a * 31, 31);
    }
}
