package s6;

import i6.a;
import java.io.IOException;
import s7.m0;

/* JADX INFO: compiled from: PsBinarySearchSeeker.java */
/* JADX INFO: loaded from: classes10.dex */
public final class x extends i6.a {

    /* JADX INFO: compiled from: PsBinarySearchSeeker.java */
    public static final class b implements a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s7.j0 f79428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s7.a0 f79429b;

        public b(s7.j0 j0Var) {
            this.f79428a = j0Var;
            this.f79429b = new s7.a0();
        }

        public static void c(s7.a0 a0Var) {
            int iK;
            int iF = a0Var.f();
            if (a0Var.a() < 10) {
                a0Var.P(iF);
                return;
            }
            a0Var.Q(9);
            int iD = a0Var.D() & 7;
            if (a0Var.a() < iD) {
                a0Var.P(iF);
                return;
            }
            a0Var.Q(iD);
            if (a0Var.a() < 4) {
                a0Var.P(iF);
                return;
            }
            if (x.k(a0Var.d(), a0Var.e()) == 443) {
                a0Var.Q(4);
                int iJ = a0Var.J();
                if (a0Var.a() < iJ) {
                    a0Var.P(iF);
                    return;
                }
                a0Var.Q(iJ);
            }
            while (a0Var.a() >= 4 && (iK = x.k(a0Var.d(), a0Var.e())) != 442 && iK != 441 && (iK >>> 8) == 1) {
                a0Var.Q(4);
                if (a0Var.a() < 2) {
                    a0Var.P(iF);
                    return;
                }
                a0Var.P(Math.min(a0Var.f(), a0Var.e() + a0Var.J()));
            }
        }

        @Override // i6.a.f
        public a.e a(i6.l lVar, long j10) throws IOException {
            long position = lVar.getPosition();
            int iMin = (int) Math.min(20000L, lVar.getLength() - position);
            this.f79429b.L(iMin);
            lVar.peekFully(this.f79429b.d(), 0, iMin);
            return b(this.f79429b, j10, position);
        }

        public final a.e b(s7.a0 a0Var, long j10, long j11) {
            int iE = -1;
            int iE2 = -1;
            long j12 = -9223372036854775807L;
            while (a0Var.a() >= 4) {
                if (x.k(a0Var.d(), a0Var.e()) != 442) {
                    a0Var.Q(1);
                } else {
                    a0Var.Q(4);
                    long jL = y.l(a0Var);
                    if (jL != -9223372036854775807L) {
                        long jB = this.f79428a.b(jL);
                        if (jB > j10) {
                            return j12 == -9223372036854775807L ? a.e.d(jB, j11) : a.e.e(j11 + ((long) iE2));
                        }
                        if (100000 + jB > j10) {
                            return a.e.e(j11 + ((long) a0Var.e()));
                        }
                        iE2 = a0Var.e();
                        j12 = jB;
                    }
                    c(a0Var);
                    iE = a0Var.e();
                }
            }
            return j12 != -9223372036854775807L ? a.e.f(j12, j11 + ((long) iE)) : a.e.f63833d;
        }

        @Override // i6.a.f
        public void onSeekFinished() {
            this.f79429b.M(m0.f79492f);
        }
    }

    public x(s7.j0 j0Var, long j10, long j11) {
        super(new a.b(), new b(j0Var), j10, 0L, j10 + 1, 0L, j11, 188L, 1000);
    }

    public static int k(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
