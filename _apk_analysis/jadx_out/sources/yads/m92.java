package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import yads.m92;
import yads.mq0;

/* JADX INFO: loaded from: classes2.dex */
public final class m92 implements mq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pq0 f92311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z33 f92312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f92313c;

    static {
        new rq0() { // from class: bt.i6
            @Override // yads.rq0
            public final mq0[] createExtractors() {
                return m92.a();
            }
        };
    }

    public static /* synthetic */ mq0[] a() {
        return new mq0[]{new m92()};
    }

    @Override // yads.mq0
    public final int a(nq0 nq0Var, gg2 gg2Var) throws ob2, EOFException, InterruptedIOException {
        int i10;
        if (this.f92311a == null) {
            throw new IllegalStateException();
        }
        if (this.f92312b == null) {
            ld0 ld0Var = (ld0) nq0Var;
            if (!a(ld0Var)) {
                throw new ob2("Failed to determine bitstream type", null, true, 1);
            }
            ld0Var.f91940f = 0;
        }
        if (!this.f92313c) {
            m73 m73VarA = this.f92311a.a(0, 1);
            this.f92311a.a();
            z33 z33Var = this.f92312b;
            z33Var.f97378c = this.f92311a;
            z33Var.f97377b = m73VarA;
            z33Var.a(true);
            this.f92313c = true;
        }
        z33 z33Var2 = this.f92312b;
        if (z33Var2.f97377b == null) {
            throw new IllegalStateException();
        }
        int i11 = ib3.f90737a;
        int i12 = z33Var2.f97383h;
        if (i12 == 0) {
            while (true) {
                ld0 ld0Var2 = (ld0) nq0Var;
                if (!z33Var2.f97376a.a(ld0Var2)) {
                    z33Var2.f97383h = 3;
                    break;
                }
                long j10 = ld0Var2.f91938d;
                long j11 = z33Var2.f97381f;
                z33Var2.f97386k = j10 - j11;
                if (!z33Var2.a(z33Var2.f97376a.f92789b, j11, z33Var2.f97385j)) {
                    mx0 mx0Var = z33Var2.f97385j.f96626a;
                    z33Var2.f97384i = mx0Var.A;
                    if (!z33Var2.f97388m) {
                        z33Var2.f97377b.a(mx0Var);
                        z33Var2.f97388m = true;
                    }
                    xv0 xv0Var = z33Var2.f97385j.f96627b;
                    if (xv0Var != null) {
                        z33Var2.f97379d = xv0Var;
                    } else {
                        long j12 = ld0Var2.f91937c;
                        if (j12 != -1) {
                            o92 o92Var = z33Var2.f97376a.f92788a;
                            i10 = 2;
                            z33Var2.f97379d = new me0(z33Var2, z33Var2.f97381f, j12, o92Var.f93160d + o92Var.f93161e, o92Var.f93158b, (o92Var.f93157a & 4) != 0);
                            z33Var2.f97383h = i10;
                            z33Var2.f97376a.a();
                            return 0;
                        }
                        z33Var2.f97379d = new y33();
                    }
                    i10 = 2;
                    z33Var2.f97383h = i10;
                    z33Var2.f97376a.a();
                    return 0;
                }
                z33Var2.f97381f = ld0Var2.f91938d;
            }
        } else {
            if (i12 == 1) {
                ((ld0) nq0Var).a((int) z33Var2.f97381f);
                z33Var2.f97383h = 2;
                return 0;
            }
            if (i12 == 2) {
                ld0 ld0Var3 = (ld0) nq0Var;
                long jA = z33Var2.f97379d.a(ld0Var3);
                if (jA >= 0) {
                    gg2Var.f89980a = jA;
                    return 1;
                }
                if (jA < -1) {
                    z33Var2.a(-(jA + 2));
                }
                if (!z33Var2.f97387l) {
                    vw2 vw2VarA = z33Var2.f97379d.a();
                    if (vw2VarA == null) {
                        throw new IllegalStateException();
                    }
                    z33Var2.f97378c.a(vw2VarA);
                    z33Var2.f97387l = true;
                }
                if (z33Var2.f97386k > 0 || z33Var2.f97376a.a(ld0Var3)) {
                    z33Var2.f97386k = 0L;
                    jb2 jb2Var = z33Var2.f97376a.f92789b;
                    long jA2 = z33Var2.a(jb2Var);
                    if (jA2 >= 0) {
                        long j13 = z33Var2.f97382g;
                        if (j13 + jA2 >= z33Var2.f97380e) {
                            long j14 = (j13 * 1000000) / ((long) z33Var2.f97384i);
                            z33Var2.f97377b.a(jb2Var.f91149c, jb2Var);
                            z33Var2.f97377b.a(j14, 1, jb2Var.f91149c, 0, null);
                            z33Var2.f97380e = -1L;
                        }
                    }
                    z33Var2.f97382g += jA2;
                    return 0;
                }
                z33Var2.f97383h = 3;
            } else if (i12 != 3) {
                throw new IllegalStateException();
            }
        }
        return -1;
    }

    @Override // yads.mq0
    public final void a(pq0 pq0Var) {
        this.f92311a = pq0Var;
    }

    public final boolean a(ld0 ld0Var) {
        o92 o92Var = new o92();
        if (o92Var.a(ld0Var, true) && (o92Var.f93157a & 2) == 2) {
            int iMin = Math.min(o92Var.f93161e, 8);
            jb2 jb2Var = new jb2(iMin);
            ld0Var.b(jb2Var.f91147a, 0, iMin, false);
            jb2Var.e(0);
            if (jb2Var.f91149c - jb2Var.f91148b >= 5 && jb2Var.m() == 127 && jb2Var.n() == 1179402563) {
                this.f92312b = new yv0();
            } else {
                jb2Var.e(0);
                if (dn3.a(1, jb2Var, true)) {
                    this.f92312b = new zm3();
                } else {
                    jb2Var.e(0);
                    if (qa2.a(jb2Var, qa2.f93961o)) {
                        this.f92312b = new qa2();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // yads.mq0
    public final boolean a(nq0 nq0Var) {
        try {
            return a((ld0) nq0Var);
        } catch (ob2 unused) {
            return false;
        }
    }

    @Override // yads.mq0
    public final void release() {
    }

    @Override // yads.mq0
    public final void seek(long j10, long j11) {
        z33 z33Var = this.f92312b;
        if (z33Var != null) {
            n92 n92Var = z33Var.f97376a;
            o92 o92Var = n92Var.f92788a;
            o92Var.f93157a = 0;
            o92Var.f93158b = 0L;
            o92Var.f93159c = 0;
            o92Var.f93160d = 0;
            o92Var.f93161e = 0;
            n92Var.f92789b.c(0);
            n92Var.f92790c = -1;
            n92Var.f92792e = false;
            if (j10 == 0) {
                z33Var.a(!z33Var.f97387l);
                return;
            }
            if (z33Var.f97383h != 0) {
                long j12 = (((long) z33Var.f97384i) * j11) / 1000000;
                z33Var.f97380e = j12;
                p92 p92Var = z33Var.f97379d;
                int i10 = ib3.f90737a;
                p92Var.a(j12);
                z33Var.f97383h = 2;
            }
        }
    }
}
