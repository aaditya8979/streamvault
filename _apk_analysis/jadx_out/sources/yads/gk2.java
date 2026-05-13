package yads;

import yads.cr;
import yads.gk2;
import yads.ye2;

/* JADX INFO: loaded from: classes2.dex */
public final class gk2 implements xm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o30 f90018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yj2 f90019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public hd0 f90020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ae0 f90021d;

    public gk2(o30 o30Var, final rq0 rq0Var) {
        this(o30Var, new yj2() { // from class: bt.c2
            @Override // yads.yj2
            public final cr a(ye2 ye2Var) {
                return gk2.a(rq0Var, ye2Var);
            }
        });
    }

    public gk2(o30 o30Var, yj2 yj2Var) {
        this(o30Var, yj2Var, new hd0(), new ae0());
    }

    public gk2(o30 o30Var, yj2 yj2Var, hd0 hd0Var, ae0 ae0Var) {
        this.f90018a = o30Var;
        this.f90019b = yj2Var;
        this.f90020c = hd0Var;
        this.f90021d = ae0Var;
    }

    public static /* synthetic */ cr a(rq0 rq0Var, ye2 ye2Var) {
        return new cr(rq0Var);
    }

    @Override // yads.xm1
    public final mo a(fm1 fm1Var) {
        fm1Var.f89625c.getClass();
        Object obj = fm1Var.f89625c.f97659g;
        return new hk2(fm1Var, this.f90018a, this.f90019b, this.f90020c.a(fm1Var), this.f90021d, 1048576);
    }

    @Override // yads.xm1
    public final xm1 a(ae0 ae0Var) {
        if (ae0Var == null) {
            throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        }
        this.f90021d = ae0Var;
        return this;
    }

    @Override // yads.xm1
    public final xm1 a(hd0 hd0Var) {
        if (hd0Var == null) {
            throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        }
        this.f90020c = hd0Var;
        return this;
    }
}
