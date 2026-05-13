package t4;

import a6.k0;
import java.io.IOException;

/* JADX INFO: compiled from: PsDurationReader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f84953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f84954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f84955e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a6.g0 f84951a = new a6.g0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f84956f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f84957g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f84958h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a6.t f84952b = new a6.t();

    public static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    public static long l(a6.t tVar) {
        int iC = tVar.c();
        if (tVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        tVar.h(bArr, 0, 9);
        tVar.L(iC);
        if (a(bArr)) {
            return m(bArr);
        }
        return -9223372036854775807L;
    }

    public static long m(byte[] bArr) {
        byte b10 = bArr[0];
        long j10 = (((((long) b10) & 56) >> 3) << 30) | ((((long) b10) & 3) << 28) | ((((long) bArr[1]) & 255) << 20);
        byte b11 = bArr[2];
        return j10 | (((((long) b11) & 248) >> 3) << 15) | ((((long) b11) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public final int b(k4.h hVar) {
        this.f84952b.I(k0.f3579f);
        this.f84953c = true;
        hVar.resetPeekPosition();
        return 0;
    }

    public long c() {
        return this.f84958h;
    }

    public a6.g0 d() {
        return this.f84951a;
    }

    public boolean e() {
        return this.f84953c;
    }

    public final int f(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public int g(k4.h hVar, k4.r rVar) throws InterruptedException, IOException {
        if (!this.f84955e) {
            return j(hVar, rVar);
        }
        if (this.f84957g == -9223372036854775807L) {
            return b(hVar);
        }
        if (!this.f84954d) {
            return h(hVar, rVar);
        }
        long j10 = this.f84956f;
        if (j10 == -9223372036854775807L) {
            return b(hVar);
        }
        this.f84958h = this.f84951a.b(this.f84957g) - this.f84951a.b(j10);
        return b(hVar);
    }

    public final int h(k4.h hVar, k4.r rVar) throws InterruptedException, IOException {
        int iMin = (int) Math.min(20000L, hVar.getLength());
        long j10 = 0;
        if (hVar.getPosition() != j10) {
            rVar.f72918a = j10;
            return 1;
        }
        this.f84952b.H(iMin);
        hVar.resetPeekPosition();
        hVar.peekFully(this.f84952b.f3620a, 0, iMin);
        this.f84956f = i(this.f84952b);
        this.f84954d = true;
        return 0;
    }

    public final long i(a6.t tVar) {
        int iD = tVar.d();
        for (int iC = tVar.c(); iC < iD - 3; iC++) {
            if (f(tVar.f3620a, iC) == 442) {
                tVar.L(iC + 4);
                long jL = l(tVar);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final int j(k4.h hVar, k4.r rVar) throws InterruptedException, IOException {
        long length = hVar.getLength();
        int iMin = (int) Math.min(20000L, length);
        long j10 = length - ((long) iMin);
        if (hVar.getPosition() != j10) {
            rVar.f72918a = j10;
            return 1;
        }
        this.f84952b.H(iMin);
        hVar.resetPeekPosition();
        hVar.peekFully(this.f84952b.f3620a, 0, iMin);
        this.f84957g = k(this.f84952b);
        this.f84955e = true;
        return 0;
    }

    public final long k(a6.t tVar) {
        int iC = tVar.c();
        for (int iD = tVar.d() - 4; iD >= iC; iD--) {
            if (f(tVar.f3620a, iD) == 442) {
                tVar.L(iD + 4);
                long jL = l(tVar);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }
}
