package s6;

import java.io.IOException;
import s7.m0;

/* JADX INFO: compiled from: PsDurationReader.java */
/* JADX INFO: loaded from: classes10.dex */
public final class y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f79432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f79433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f79434e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s7.j0 f79430a = new s7.j0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f79435f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f79436g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f79437h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s7.a0 f79431b = new s7.a0();

    public static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    public static long l(s7.a0 a0Var) {
        int iE = a0Var.e();
        if (a0Var.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        a0Var.j(bArr, 0, 9);
        a0Var.P(iE);
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

    public final int b(i6.l lVar) {
        this.f79431b.M(m0.f79492f);
        this.f79432c = true;
        lVar.resetPeekPosition();
        return 0;
    }

    public long c() {
        return this.f79437h;
    }

    public s7.j0 d() {
        return this.f79430a;
    }

    public boolean e() {
        return this.f79432c;
    }

    public final int f(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public int g(i6.l lVar, i6.y yVar) throws IOException {
        if (!this.f79434e) {
            return j(lVar, yVar);
        }
        if (this.f79436g == -9223372036854775807L) {
            return b(lVar);
        }
        if (!this.f79433d) {
            return h(lVar, yVar);
        }
        long j10 = this.f79435f;
        if (j10 == -9223372036854775807L) {
            return b(lVar);
        }
        long jB = this.f79430a.b(this.f79436g) - this.f79430a.b(j10);
        this.f79437h = jB;
        if (jB < 0) {
            s7.q.i("PsDurationReader", "Invalid duration: " + this.f79437h + ". Using TIME_UNSET instead.");
            this.f79437h = -9223372036854775807L;
        }
        return b(lVar);
    }

    public final int h(i6.l lVar, i6.y yVar) throws IOException {
        int iMin = (int) Math.min(20000L, lVar.getLength());
        long j10 = 0;
        if (lVar.getPosition() != j10) {
            yVar.f63944a = j10;
            return 1;
        }
        this.f79431b.L(iMin);
        lVar.resetPeekPosition();
        lVar.peekFully(this.f79431b.d(), 0, iMin);
        this.f79435f = i(this.f79431b);
        this.f79433d = true;
        return 0;
    }

    public final long i(s7.a0 a0Var) {
        int iF = a0Var.f();
        for (int iE = a0Var.e(); iE < iF - 3; iE++) {
            if (f(a0Var.d(), iE) == 442) {
                a0Var.P(iE + 4);
                long jL = l(a0Var);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final int j(i6.l lVar, i6.y yVar) throws IOException {
        long length = lVar.getLength();
        int iMin = (int) Math.min(20000L, length);
        long j10 = length - ((long) iMin);
        if (lVar.getPosition() != j10) {
            yVar.f63944a = j10;
            return 1;
        }
        this.f79431b.L(iMin);
        lVar.resetPeekPosition();
        lVar.peekFully(this.f79431b.d(), 0, iMin);
        this.f79436g = k(this.f79431b);
        this.f79434e = true;
        return 0;
    }

    public final long k(s7.a0 a0Var) {
        int iE = a0Var.e();
        for (int iF = a0Var.f() - 4; iF >= iE; iF--) {
            if (f(a0Var.d(), iF) == 442) {
                a0Var.P(iF + 4);
                long jL = l(a0Var);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }
}
