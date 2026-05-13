package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ce1 implements mq0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public pq0 f88420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f88421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f88422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f88423e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public hv1 f88425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public nq0 f88426h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m33 f88427i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public kv1 f88428j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jb2 f88419a = new jb2(6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f88424f = -1;

    /* JADX WARN: Removed duplicated region for block: B:102:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019c  */
    @Override // yads.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(yads.nq0 r26, yads.gg2 r27) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ce1.a(yads.nq0, yads.gg2):int");
    }

    public final void a() {
        pq0 pq0Var = this.f88420b;
        pq0Var.getClass();
        m73 m73VarA = pq0Var.a(1024, 4);
        lx0 lx0Var = new lx0();
        lx0Var.f92147j = "image/jpeg";
        lx0Var.f92146i = new ts1(new ss1[0]);
        m73VarA.a(new mx0(lx0Var));
        pq0 pq0Var2 = this.f88420b;
        pq0Var2.getClass();
        pq0Var2.a();
        this.f88420b.a(new uw2(-9223372036854775807L, 0L));
        this.f88421c = 6;
    }

    @Override // yads.mq0
    public final void a(pq0 pq0Var) {
        this.f88420b = pq0Var;
    }

    @Override // yads.mq0
    public final boolean a(nq0 nq0Var) throws EOFException, InterruptedIOException {
        ld0 ld0Var = (ld0) nq0Var;
        this.f88419a.c(2);
        ld0Var.b(this.f88419a.f91147a, 0, 2, false);
        if (this.f88419a.r() != 65496) {
            return false;
        }
        this.f88419a.c(2);
        ld0Var.b(this.f88419a.f91147a, 0, 2, false);
        int iR = this.f88419a.r();
        this.f88422d = iR;
        if (iR == 65504) {
            this.f88419a.c(2);
            ld0Var.b(this.f88419a.f91147a, 0, 2, false);
            ld0Var.a(false, this.f88419a.r() - 2);
            this.f88419a.c(2);
            ld0Var.b(this.f88419a.f91147a, 0, 2, false);
            this.f88422d = this.f88419a.r();
        }
        if (this.f88422d != 65505) {
            return false;
        }
        ld0Var.a(false, 2);
        this.f88419a.c(6);
        ld0Var.b(this.f88419a.f91147a, 0, 6, false);
        return this.f88419a.n() == 1165519206 && this.f88419a.r() == 0;
    }

    @Override // yads.mq0
    public final void release() {
    }

    @Override // yads.mq0
    public final void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f88421c = 0;
            this.f88428j = null;
        } else if (this.f88421c == 5) {
            kv1 kv1Var = this.f88428j;
            kv1Var.getClass();
            kv1Var.seek(j10, j11);
        }
    }
}
