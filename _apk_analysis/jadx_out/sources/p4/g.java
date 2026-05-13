package p4;

import a6.k0;
import a6.m;
import a6.t;
import androidx.annotation.Nullable;
import k4.q;
import k4.s;

/* JADX INFO: compiled from: VbriSeeker.java */
/* JADX INFO: loaded from: classes10.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f76984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f76985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f76986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f76987d;

    public g(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f76984a = jArr;
        this.f76985b = jArr2;
        this.f76986c = j10;
        this.f76987d = j11;
    }

    @Nullable
    public static g a(long j10, long j11, q qVar, t tVar) {
        int iY;
        tVar.M(10);
        int iJ = tVar.j();
        if (iJ <= 0) {
            return null;
        }
        int i10 = qVar.f72914d;
        long jY0 = k0.y0(iJ, 1000000 * ((long) (i10 >= 32000 ? 1152 : 576)), i10);
        int iE = tVar.E();
        int iE2 = tVar.E();
        int iE3 = tVar.E();
        tVar.M(2);
        long j12 = j11 + ((long) qVar.f72913c);
        long[] jArr = new long[iE];
        long[] jArr2 = new long[iE];
        int i11 = 0;
        long j13 = j11;
        while (i11 < iE) {
            int i12 = iE2;
            long j14 = j12;
            jArr[i11] = (((long) i11) * jY0) / ((long) iE);
            jArr2[i11] = Math.max(j13, j14);
            if (iE3 == 1) {
                iY = tVar.y();
            } else if (iE3 == 2) {
                iY = tVar.E();
            } else if (iE3 == 3) {
                iY = tVar.B();
            } else {
                if (iE3 != 4) {
                    return null;
                }
                iY = tVar.C();
            }
            j13 += (long) (iY * i12);
            i11++;
            j12 = j14;
            iE2 = i12;
        }
        if (j10 != -1 && j10 != j13) {
            m.h("VbriSeeker", "VBRI data size mismatch: " + j10 + ", " + j13);
        }
        return new g(jArr, jArr2, jY0, j13);
    }

    @Override // p4.f
    public long getDataEndPosition() {
        return this.f76987d;
    }

    @Override // k4.s
    public long getDurationUs() {
        return this.f76986c;
    }

    @Override // k4.s
    public s.a getSeekPoints(long j10) {
        int iH = k0.h(this.f76984a, j10, true, true);
        k4.t tVar = new k4.t(this.f76984a[iH], this.f76985b[iH]);
        if (tVar.f72924a >= j10 || iH == this.f76984a.length - 1) {
            return new s.a(tVar);
        }
        int i10 = iH + 1;
        return new s.a(tVar, new k4.t(this.f76984a[i10], this.f76985b[i10]));
    }

    @Override // p4.f
    public long getTimeUs(long j10) {
        return this.f76984a[k0.h(this.f76985b, j10, true, true)];
    }

    @Override // k4.s
    public boolean isSeekable() {
        return true;
    }
}
