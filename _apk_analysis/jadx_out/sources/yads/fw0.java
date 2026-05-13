package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import yads.fw0;
import yads.mq0;

/* JADX INFO: loaded from: classes10.dex */
public final class fw0 implements mq0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pq0 f89697f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f89699h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f89700i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f89701j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f89702k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f89703l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f89704m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f89705n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public kl f89706o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public uj3 f89707p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jb2 f89692a = new jb2(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb2 f89693b = new jb2(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jb2 f89694c = new jb2(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jb2 f89695d = new jb2();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final us2 f89696e = new us2();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f89698g = 1;

    static {
        new rq0() { // from class: bt.a2
            @Override // yads.rq0
            public final mq0[] createExtractors() {
                return fw0.a();
            }
        };
    }

    public static /* synthetic */ mq0[] a() {
        return new mq0[]{new fw0()};
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0005 A[SYNTHETIC] */
    @Override // yads.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(yads.nq0 r16, yads.gg2 r17) throws yads.ob2, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.fw0.a(yads.nq0, yads.gg2):int");
    }

    public final jb2 a(ld0 ld0Var) throws EOFException, InterruptedIOException {
        int i10 = this.f89703l;
        jb2 jb2Var = this.f89695d;
        byte[] bArr = jb2Var.f91147a;
        if (i10 > bArr.length) {
            jb2Var.f91147a = new byte[Math.max(bArr.length * 2, i10)];
            jb2Var.f91149c = 0;
            jb2Var.f91148b = 0;
        } else {
            jb2Var.e(0);
        }
        this.f89695d.d(this.f89703l);
        ld0Var.a(this.f89695d.f91147a, 0, this.f89703l, false);
        return this.f89695d;
    }

    @Override // yads.mq0
    public final void a(pq0 pq0Var) {
        this.f89697f = pq0Var;
    }

    @Override // yads.mq0
    public final boolean a(nq0 nq0Var) throws EOFException, InterruptedIOException {
        ld0 ld0Var = (ld0) nq0Var;
        ld0Var.b(this.f89692a.f91147a, 0, 3, false);
        this.f89692a.e(0);
        if (this.f89692a.o() != 4607062) {
            return false;
        }
        ld0Var.b(this.f89692a.f91147a, 0, 2, false);
        this.f89692a.e(0);
        if ((this.f89692a.r() & 250) != 0) {
            return false;
        }
        ld0Var.b(this.f89692a.f91147a, 0, 4, false);
        this.f89692a.e(0);
        int iB = this.f89692a.b();
        ld0Var.f91940f = 0;
        ld0Var.a(false, iB);
        ld0Var.b(this.f89692a.f91147a, 0, 4, false);
        this.f89692a.e(0);
        return this.f89692a.b() == 0;
    }

    @Override // yads.mq0
    public final void release() {
    }

    @Override // yads.mq0
    public final void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f89698g = 1;
            this.f89699h = false;
        } else {
            this.f89698g = 3;
        }
        this.f89701j = 0;
    }
}
