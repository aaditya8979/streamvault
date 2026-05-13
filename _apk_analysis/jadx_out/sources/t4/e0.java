package t4;

import a6.k0;
import java.io.IOException;

/* JADX INFO: compiled from: TsDurationReader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f84683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f84684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f84685e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a6.g0 f84681a = new a6.g0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f84686f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f84687g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f84688h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a6.t f84682b = new a6.t();

    public final int a(k4.h hVar) {
        this.f84682b.I(k0.f3579f);
        this.f84683c = true;
        hVar.resetPeekPosition();
        return 0;
    }

    public long b() {
        return this.f84688h;
    }

    public a6.g0 c() {
        return this.f84681a;
    }

    public boolean d() {
        return this.f84683c;
    }

    public int e(k4.h hVar, k4.r rVar, int i10) throws InterruptedException, IOException {
        if (i10 <= 0) {
            return a(hVar);
        }
        if (!this.f84685e) {
            return h(hVar, rVar, i10);
        }
        if (this.f84687g == -9223372036854775807L) {
            return a(hVar);
        }
        if (!this.f84684d) {
            return f(hVar, rVar, i10);
        }
        long j10 = this.f84686f;
        if (j10 == -9223372036854775807L) {
            return a(hVar);
        }
        this.f84688h = this.f84681a.b(this.f84687g) - this.f84681a.b(j10);
        return a(hVar);
    }

    public final int f(k4.h hVar, k4.r rVar, int i10) throws InterruptedException, IOException {
        int iMin = (int) Math.min(112800L, hVar.getLength());
        long j10 = 0;
        if (hVar.getPosition() != j10) {
            rVar.f72918a = j10;
            return 1;
        }
        this.f84682b.H(iMin);
        hVar.resetPeekPosition();
        hVar.peekFully(this.f84682b.f3620a, 0, iMin);
        this.f84686f = g(this.f84682b, i10);
        this.f84684d = true;
        return 0;
    }

    public final long g(a6.t tVar, int i10) {
        int iD = tVar.d();
        for (int iC = tVar.c(); iC < iD; iC++) {
            if (tVar.f3620a[iC] == 71) {
                long jB = i0.b(tVar, iC, i10);
                if (jB != -9223372036854775807L) {
                    return jB;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final int h(k4.h hVar, k4.r rVar, int i10) throws InterruptedException, IOException {
        long length = hVar.getLength();
        int iMin = (int) Math.min(112800L, length);
        long j10 = length - ((long) iMin);
        if (hVar.getPosition() != j10) {
            rVar.f72918a = j10;
            return 1;
        }
        this.f84682b.H(iMin);
        hVar.resetPeekPosition();
        hVar.peekFully(this.f84682b.f3620a, 0, iMin);
        this.f84687g = i(this.f84682b, i10);
        this.f84685e = true;
        return 0;
    }

    public final long i(a6.t tVar, int i10) {
        int iC = tVar.c();
        int iD = tVar.d();
        while (true) {
            iD--;
            if (iD < iC) {
                return -9223372036854775807L;
            }
            if (tVar.f3620a[iD] == 71) {
                long jB = i0.b(tVar, iD, i10);
                if (jB != -9223372036854775807L) {
                    return jB;
                }
            }
        }
    }
}
