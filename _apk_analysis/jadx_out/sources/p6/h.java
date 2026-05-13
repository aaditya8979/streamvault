package p6;

import androidx.annotation.Nullable;
import f6.u;
import i6.z;
import s7.a0;
import s7.m0;
import s7.q;

/* JADX INFO: compiled from: VbriSeeker.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f77081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f77082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f77083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f77084d;

    public h(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f77081a = jArr;
        this.f77082b = jArr2;
        this.f77083c = j10;
        this.f77084d = j11;
    }

    @Nullable
    public static h a(long j10, long j11, u.a aVar, a0 a0Var) {
        int iD;
        a0Var.Q(10);
        int iN = a0Var.n();
        if (iN <= 0) {
            return null;
        }
        int i10 = aVar.f61552d;
        long jF0 = m0.F0(iN, 1000000 * ((long) (i10 >= 32000 ? 1152 : 576)), i10);
        int iJ = a0Var.J();
        int iJ2 = a0Var.J();
        int iJ3 = a0Var.J();
        a0Var.Q(2);
        long j12 = j11 + ((long) aVar.f61551c);
        long[] jArr = new long[iJ];
        long[] jArr2 = new long[iJ];
        int i11 = 0;
        long j13 = j11;
        while (i11 < iJ) {
            int i12 = iJ2;
            long j14 = j12;
            jArr[i11] = (((long) i11) * jF0) / ((long) iJ);
            jArr2[i11] = Math.max(j13, j14);
            if (iJ3 == 1) {
                iD = a0Var.D();
            } else if (iJ3 == 2) {
                iD = a0Var.J();
            } else if (iJ3 == 3) {
                iD = a0Var.G();
            } else {
                if (iJ3 != 4) {
                    return null;
                }
                iD = a0Var.H();
            }
            j13 += ((long) iD) * ((long) i12);
            i11++;
            jArr = jArr;
            iJ2 = i12;
            j12 = j14;
        }
        long[] jArr3 = jArr;
        if (j10 != -1 && j10 != j13) {
            q.i("VbriSeeker", "VBRI data size mismatch: " + j10 + ", " + j13);
        }
        return new h(jArr3, jArr2, jF0, j13);
    }

    @Override // p6.g
    public long getDataEndPosition() {
        return this.f77084d;
    }

    @Override // i6.z
    public long getDurationUs() {
        return this.f77083c;
    }

    @Override // i6.z
    public z.a getSeekPoints(long j10) {
        int i10 = m0.i(this.f77081a, j10, true, true);
        i6.a0 a0Var = new i6.a0(this.f77081a[i10], this.f77082b[i10]);
        if (a0Var.f63838a >= j10 || i10 == this.f77081a.length - 1) {
            return new z.a(a0Var);
        }
        int i11 = i10 + 1;
        return new z.a(a0Var, new i6.a0(this.f77081a[i11], this.f77082b[i11]));
    }

    @Override // p6.g
    public long getTimeUs(long j10) {
        return this.f77081a[m0.i(this.f77082b, j10, true, true)];
    }

    @Override // i6.z
    public boolean isSeekable() {
        return true;
    }
}
