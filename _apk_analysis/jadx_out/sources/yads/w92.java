package yads;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w92 implements ld3, tn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x92 f96312a;

    public w92(x92 x92Var) {
        this.f96312a = x92Var;
    }

    @Override // yads.ld3
    public final void a() {
        x92 x92Var = this.f96312a;
        synchronized (x92Var.f96683a) {
            x92Var.f96688f = true;
            bn.r rVar = bn.r.f5635a;
        }
        x92Var.c();
        x92Var.f96686d.b();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ld3) && (obj instanceof tn.l)) {
            return tn.p.f(getFunctionDelegate(), ((tn.l) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // tn.l
    public final bn.e getFunctionDelegate() {
        return new FunctionReferenceImpl(0, this.f96312a, x92.class, "onOmSdkJsControllerLoaded", "onOmSdkJsControllerLoaded()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
