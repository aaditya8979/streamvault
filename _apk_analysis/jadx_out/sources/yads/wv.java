package yads;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class wv extends ry {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final mo f96501k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f96502l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f96503m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f96504n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f96505o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f96506p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f96507q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r63 f96508r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public uv f96509s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public vv f96510t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f96511u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f96512v;

    public wv(mo moVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        ni.a(j10 >= 0);
        this.f96501k = (mo) ni.a(moVar);
        this.f96502l = j10;
        this.f96503m = j11;
        this.f96504n = z10;
        this.f96505o = z11;
        this.f96506p = z12;
        this.f96507q = new ArrayList();
        this.f96508r = new r63();
    }

    @Override // yads.mo
    public final pm1 a(ym1 ym1Var, qe qeVar, long j10) {
        tv tvVar = new tv(this.f96501k.a(ym1Var, qeVar, j10), this.f96504n, this.f96511u, this.f96512v);
        this.f96507q.add(tvVar);
        return tvVar;
    }

    @Override // yads.mo
    public final void a(pm1 pm1Var) {
        if (!this.f96507q.remove(pm1Var)) {
            throw new IllegalStateException();
        }
        this.f96501k.a(((tv) pm1Var).f95362b);
        if (!this.f96507q.isEmpty() || this.f96505o) {
            return;
        }
        uv uvVar = this.f96509s;
        uvVar.getClass();
        b(uvVar.f93823c);
    }

    @Override // yads.mo
    public final void a(r83 r83Var) {
        this.f94645j = r83Var;
        this.f94644i = ib3.a((Handler.Callback) null);
        a((Object) null, this.f96501k);
    }

    @Override // yads.ry
    /* JADX INFO: renamed from: b */
    public final void a(Object obj, mo moVar, s63 s63Var) {
        if (this.f96510t != null) {
            return;
        }
        b(s63Var);
    }

    public final void b(s63 s63Var) {
        long j10;
        long j11;
        long j12;
        s63Var.a(0, this.f96508r, 0L);
        long j13 = this.f96508r.f94315r;
        if (this.f96509s == null || this.f96507q.isEmpty() || this.f96505o) {
            long j14 = this.f96502l;
            long j15 = this.f96503m;
            if (this.f96506p) {
                long j16 = this.f96508r.f94311n;
                j14 += j16;
                j10 = j16 + j15;
            } else {
                j10 = j15;
            }
            this.f96511u = j13 + j14;
            this.f96512v = j15 != Long.MIN_VALUE ? j13 + j10 : Long.MIN_VALUE;
            int size = this.f96507q.size();
            for (int i10 = 0; i10 < size; i10++) {
                tv tvVar = (tv) this.f96507q.get(i10);
                long j17 = this.f96511u;
                long j18 = this.f96512v;
                tvVar.f95366f = j17;
                tvVar.f95367g = j18;
            }
            j11 = j14;
            j12 = j10;
        } else {
            j11 = this.f96511u - j13;
            j12 = this.f96503m != Long.MIN_VALUE ? this.f96512v - j13 : Long.MIN_VALUE;
        }
        try {
            uv uvVar = new uv(s63Var, j11, j12);
            this.f96509s = uvVar;
            a(uvVar);
        } catch (vv e10) {
            this.f96510t = e10;
            for (int i11 = 0; i11 < this.f96507q.size(); i11++) {
                ((tv) this.f96507q.get(i11)).f95368h = this.f96510t;
            }
        }
    }

    @Override // yads.mo
    public final fm1 c() {
        return this.f96501k.c();
    }

    @Override // yads.ry, yads.mo
    public final void d() throws vv {
        vv vvVar = this.f96510t;
        if (vvVar != null) {
            throw vvVar;
        }
        super.d();
    }

    @Override // yads.ry, yads.mo
    public final void e() {
        super.e();
        this.f96510t = null;
        this.f96509s = null;
    }
}
