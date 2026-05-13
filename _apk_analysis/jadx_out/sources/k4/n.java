package k4;

import a6.j;
import a6.k0;
import k4.s;

/* JADX INFO: compiled from: FlacSeekTableSeekMap.java */
/* JADX INFO: loaded from: classes.dex */
public final class n implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a6.j f72898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f72899b;

    public n(a6.j jVar, long j10) {
        this.f72898a = jVar;
        this.f72899b = j10;
    }

    public final t a(long j10, long j11) {
        return new t((j10 * 1000000) / ((long) this.f72898a.f3563e), this.f72899b + j11);
    }

    @Override // k4.s
    public long getDurationUs() {
        return this.f72898a.h();
    }

    @Override // k4.s
    public s.a getSeekPoints(long j10) {
        a6.a.e(this.f72898a.f3569k);
        a6.j jVar = this.f72898a;
        j.a aVar = jVar.f3569k;
        long[] jArr = aVar.f3571a;
        long[] jArr2 = aVar.f3572b;
        int iH = k0.h(jArr, jVar.k(j10), true, false);
        t tVarA = a(iH == -1 ? 0L : jArr[iH], iH != -1 ? jArr2[iH] : 0L);
        if (tVarA.f72924a == j10 || iH == jArr.length - 1) {
            return new s.a(tVarA);
        }
        int i10 = iH + 1;
        return new s.a(tVarA, a(jArr[i10], jArr2[i10]));
    }

    @Override // k4.s
    public boolean isSeekable() {
        return true;
    }
}
