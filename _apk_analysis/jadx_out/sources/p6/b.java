package p6;

import i6.a0;
import i6.z;
import s7.m0;
import s7.r;

/* JADX INFO: compiled from: IndexSeeker.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f77052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f77053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f77054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f77055d;

    public b(long j10, long j11, long j12) {
        this.f77055d = j10;
        this.f77052a = j12;
        r rVar = new r();
        this.f77053b = rVar;
        r rVar2 = new r();
        this.f77054c = rVar2;
        rVar.a(0L);
        rVar2.a(j11);
    }

    public boolean a(long j10) {
        r rVar = this.f77053b;
        return j10 - rVar.b(rVar.c() - 1) < 100000;
    }

    public void b(long j10, long j11) {
        if (a(j10)) {
            return;
        }
        this.f77053b.a(j10);
        this.f77054c.a(j11);
    }

    public void c(long j10) {
        this.f77055d = j10;
    }

    @Override // p6.g
    public long getDataEndPosition() {
        return this.f77052a;
    }

    @Override // i6.z
    public long getDurationUs() {
        return this.f77055d;
    }

    @Override // i6.z
    public z.a getSeekPoints(long j10) {
        int iG = m0.g(this.f77053b, j10, true, true);
        a0 a0Var = new a0(this.f77053b.b(iG), this.f77054c.b(iG));
        if (a0Var.f63838a == j10 || iG == this.f77053b.c() - 1) {
            return new z.a(a0Var);
        }
        int i10 = iG + 1;
        return new z.a(a0Var, new a0(this.f77053b.b(i10), this.f77054c.b(i10)));
    }

    @Override // p6.g
    public long getTimeUs(long j10) {
        return this.f77053b.b(m0.g(this.f77054c, j10, true, true));
    }

    @Override // i6.z
    public boolean isSeekable() {
        return true;
    }
}
