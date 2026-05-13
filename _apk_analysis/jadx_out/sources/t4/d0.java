package t4;

import a6.k0;
import java.io.IOException;
import k4.a;

/* JADX INFO: compiled from: TsBinarySearchSeeker.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d0 extends k4.a {

    /* JADX INFO: compiled from: TsBinarySearchSeeker.java */
    public static final class a implements a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a6.g0 f84674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a6.t f84675b = new a6.t();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f84676c;

        public a(int i10, a6.g0 g0Var) {
            this.f84676c = i10;
            this.f84674a = g0Var;
        }

        @Override // k4.a.f
        public a.e a(k4.h hVar, long j10) throws InterruptedException, IOException {
            long position = hVar.getPosition();
            int iMin = (int) Math.min(112800L, hVar.getLength() - position);
            this.f84675b.H(iMin);
            hVar.peekFully(this.f84675b.f3620a, 0, iMin);
            return b(this.f84675b, j10, position);
        }

        public final a.e b(a6.t tVar, long j10, long j11) {
            int iA;
            int iA2;
            int iD = tVar.d();
            long j12 = -1;
            long j13 = -1;
            long j14 = -9223372036854775807L;
            while (tVar.a() >= 188 && (iA2 = (iA = i0.a(tVar.f3620a, tVar.c(), iD)) + 188) <= iD) {
                long jB = i0.b(tVar, iA, this.f84676c);
                if (jB != -9223372036854775807L) {
                    long jB2 = this.f84674a.b(jB);
                    if (jB2 > j10) {
                        return j14 == -9223372036854775807L ? a.e.d(jB2, j11) : a.e.e(j11 + j13);
                    }
                    if (100000 + jB2 > j10) {
                        return a.e.e(j11 + ((long) iA));
                    }
                    j13 = iA;
                    j14 = jB2;
                }
                tVar.L(iA2);
                j12 = iA2;
            }
            return j14 != -9223372036854775807L ? a.e.f(j14, j11 + j12) : a.e.f72863d;
        }

        @Override // k4.a.f
        public void onSeekFinished() {
            this.f84675b.I(k0.f3579f);
        }
    }

    public d0(a6.g0 g0Var, long j10, long j11, int i10) {
        super(new a.b(), new a(i10, g0Var), j10, 0L, j10 + 1, 0L, j11, 188L, 940);
    }
}
