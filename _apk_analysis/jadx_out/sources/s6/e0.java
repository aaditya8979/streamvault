package s6;

import i6.a;
import java.io.IOException;
import s7.m0;

/* JADX INFO: compiled from: TsBinarySearchSeeker.java */
/* JADX INFO: loaded from: classes6.dex */
public final class e0 extends i6.a {

    /* JADX INFO: compiled from: TsBinarySearchSeeker.java */
    public static final class a implements a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s7.j0 f79124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s7.a0 f79125b = new s7.a0();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f79126c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f79127d;

        public a(int i10, s7.j0 j0Var, int i11) {
            this.f79126c = i10;
            this.f79124a = j0Var;
            this.f79127d = i11;
        }

        @Override // i6.a.f
        public a.e a(i6.l lVar, long j10) throws IOException {
            long position = lVar.getPosition();
            int iMin = (int) Math.min(this.f79127d, lVar.getLength() - position);
            this.f79125b.L(iMin);
            lVar.peekFully(this.f79125b.d(), 0, iMin);
            return b(this.f79125b, j10, position);
        }

        public final a.e b(s7.a0 a0Var, long j10, long j11) {
            int iA;
            int iA2;
            int iF = a0Var.f();
            long j12 = -1;
            long j13 = -1;
            long j14 = -9223372036854775807L;
            while (a0Var.a() >= 188 && (iA2 = (iA = j0.a(a0Var.d(), a0Var.e(), iF)) + 188) <= iF) {
                long jC = j0.c(a0Var, iA, this.f79126c);
                if (jC != -9223372036854775807L) {
                    long jB = this.f79124a.b(jC);
                    if (jB > j10) {
                        return j14 == -9223372036854775807L ? a.e.d(jB, j11) : a.e.e(j11 + j13);
                    }
                    if (100000 + jB > j10) {
                        return a.e.e(j11 + ((long) iA));
                    }
                    j13 = iA;
                    j14 = jB;
                }
                a0Var.P(iA2);
                j12 = iA2;
            }
            return j14 != -9223372036854775807L ? a.e.f(j14, j11 + j12) : a.e.f63833d;
        }

        @Override // i6.a.f
        public void onSeekFinished() {
            this.f79125b.M(m0.f79492f);
        }
    }

    public e0(s7.j0 j0Var, long j10, long j11, int i10, int i11) {
        super(new a.b(), new a(i10, j0Var, i11), j10, 0L, j10 + 1, 0L, j11, 188L, 940);
    }
}
