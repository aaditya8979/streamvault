package no;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Buffers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class c {
    public static final long a(@NotNull a aVar, byte b10, long j10, long j11) {
        long j12;
        int iA;
        tn.p.k(aVar, "<this>");
        long jMin = Math.min(j11, aVar.n());
        u.a(aVar.n(), j10, jMin);
        if (j10 == jMin || aVar.m() == null) {
            return -1L;
        }
        if (aVar.n() - j10 < j10) {
            m mVarT = aVar.t();
            j12 = aVar.n();
            while (mVarT != null && j12 > j10) {
                j12 -= (long) (mVarT.d() - mVarT.f());
                if (j12 <= j10) {
                    break;
                }
                mVarT = mVarT.g();
            }
            if (j12 == -1) {
                return -1L;
            }
            do {
                if (!(jMin > j12)) {
                    throw new IllegalStateException("Check failed.");
                }
                tn.p.h(mVarT);
                iA = o.a(mVarT, b10, Math.max((int) (j10 - j12), 0), Math.min(mVarT.j(), (int) (jMin - j12)));
                if (iA == -1) {
                    j12 += (long) mVarT.j();
                    mVarT = mVarT.e();
                    if (mVarT == null) {
                        break;
                    }
                }
            } while (j12 < jMin);
            return -1L;
        }
        m mVarM = aVar.m();
        j12 = 0;
        while (mVarM != null) {
            long jD = ((long) (mVarM.d() - mVarM.f())) + j12;
            if (jD > j10) {
                break;
            }
            mVarM = mVarM.e();
            j12 = jD;
        }
        if (j12 == -1) {
            return -1L;
        }
        do {
            if (!(jMin > j12)) {
                throw new IllegalStateException("Check failed.");
            }
            tn.p.h(mVarM);
            iA = o.a(mVarM, b10, Math.max((int) (j10 - j12), 0), Math.min(mVarM.j(), (int) (jMin - j12)));
            if (iA == -1) {
                j12 += (long) mVarM.j();
                mVarM = mVarM.e();
                if (mVarM == null) {
                    break;
                }
            }
        } while (j12 < jMin);
        return -1L;
        return j12 + ((long) iA);
    }
}
