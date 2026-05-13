package yads;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes10.dex */
public final class xj2 implements rj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f96785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u30 f96786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rr f96787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bs f96788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public qj0 f96789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile wj2 f96790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f96791g;

    public xj2(fm1 fm1Var, qr qrVar, Executor executor) {
        this.f96785a = (Executor) ni.a(executor);
        ni.a(fm1Var.f89625c);
        u30 u30VarA = new t30().a(fm1Var.f89625c.f97653a).a(fm1Var.f89625c.f97657e).a(4).a();
        this.f96786b = u30VarA;
        rr rrVarA = qrVar.a();
        this.f96787c = rrVarA;
        this.f96788d = new bs(rrVarA, u30VarA, null, new as() { // from class: bt.pc
            @Override // yads.as
            public final void a(long j10, long j11, long j12) {
                this.f6228a.a(j10, j11, j12);
            }
        });
    }

    public final void a(long j10, long j11, long j12) {
        qj0 qj0Var = this.f96789e;
        if (qj0Var == null) {
            return;
        }
        ((lj0) qj0Var).a(j10, j11, (j10 == -1 || j10 == 0) ? -1.0f : (j11 * 100.0f) / j10);
    }

    @Override // yads.rj0
    public final void a(qj0 qj0Var) {
        this.f96789e = qj0Var;
        this.f96790f = new wj2(this);
        try {
            if (!this.f96791g) {
                this.f96785a.execute(this.f96790f);
                try {
                    wj2 wj2Var = this.f96790f;
                    wj2Var.f87795c.a();
                    wj2Var.c();
                } catch (ExecutionException e10) {
                    Throwable cause = e10.getCause();
                    cause.getClass();
                    if (cause instanceof IOException) {
                        throw ((IOException) cause);
                    }
                    int i10 = ib3.f90737a;
                    throw cause;
                }
            }
        } finally {
            this.f96790f.f87795c.b();
        }
    }

    @Override // yads.rj0
    public final void cancel() {
        this.f96791g = true;
        wj2 wj2Var = this.f96790f;
        if (wj2Var != null) {
            wj2Var.cancel(true);
        }
    }

    @Override // yads.rj0
    public final void remove() {
        rr rrVar = this.f96787c;
        ((vy2) rrVar.f94576a).c(rrVar.f94580e.a(this.f96786b));
    }
}
