package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class yl implements mq0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f97206c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zl f97208e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f97211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public iu f97212i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f97216m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f97217n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jb2 f97204a = new jb2(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xl f97205b = new xl();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public pq0 f97207d = new zk0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public iu[] f97210g = new iu[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f97214k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f97215l = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f97213j = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f97209f = -9223372036854775807L;

    /* JADX WARN: Removed duplicated region for block: B:62:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0113  */
    @Override // yads.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(yads.nq0 r22, yads.gg2 r23) throws yads.ob2, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.yl.a(yads.nq0, yads.gg2):int");
    }

    @Override // yads.mq0
    public final void a(pq0 pq0Var) {
        this.f97206c = 0;
        this.f97207d = pq0Var;
        this.f97211h = -1L;
    }

    @Override // yads.mq0
    public final boolean a(nq0 nq0Var) {
        ((ld0) nq0Var).b(this.f97204a.f91147a, 0, 12, false);
        this.f97204a.e(0);
        if (this.f97204a.d() != 1179011410) {
            return false;
        }
        jb2 jb2Var = this.f97204a;
        jb2Var.e(jb2Var.f91148b + 4);
        return this.f97204a.d() == 541677121;
    }

    @Override // yads.mq0
    public final void release() {
    }

    @Override // yads.mq0
    public final void seek(long j10, long j11) {
        this.f97211h = -1L;
        this.f97212i = null;
        for (iu iuVar : this.f97210g) {
            if (iuVar.f90994j == 0) {
                iuVar.f90992h = 0;
            } else {
                iuVar.f90992h = iuVar.f90996l[ib3.b(iuVar.f90995k, j10, true)];
            }
        }
        if (j10 != 0) {
            this.f97206c = 6;
        } else if (this.f97210g.length == 0) {
            this.f97206c = 0;
        } else {
            this.f97206c = 3;
        }
    }
}
