package u4;

import a6.k0;
import k4.s;
import k4.t;

/* JADX INFO: compiled from: WavSeekMap.java */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f85482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f85483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f85484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f85485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f85486e;

    public e(c cVar, int i10, long j10, long j11) {
        this.f85482a = cVar;
        this.f85483b = i10;
        this.f85484c = j10;
        long j12 = (j11 - j10) / ((long) cVar.f85477e);
        this.f85485d = j12;
        this.f85486e = a(j12);
    }

    public final long a(long j10) {
        return k0.y0(j10 * ((long) this.f85483b), 1000000L, this.f85482a.f85475c);
    }

    @Override // k4.s
    public long getDurationUs() {
        return this.f85486e;
    }

    @Override // k4.s
    public s.a getSeekPoints(long j10) {
        long jR = k0.r((((long) this.f85482a.f85475c) * j10) / (((long) this.f85483b) * 1000000), 0L, this.f85485d - 1);
        long j11 = this.f85484c + (((long) this.f85482a.f85477e) * jR);
        long jA = a(jR);
        t tVar = new t(jA, j11);
        if (jA >= j10 || jR == this.f85485d - 1) {
            return new s.a(tVar);
        }
        long j12 = jR + 1;
        return new s.a(tVar, new t(a(j12), this.f85484c + (((long) this.f85482a.f85477e) * j12)));
    }

    @Override // k4.s
    public boolean isSeekable() {
        return true;
    }
}
