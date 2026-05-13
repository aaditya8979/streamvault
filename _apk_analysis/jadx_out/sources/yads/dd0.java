package yads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class dd0 implements rk0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ok0 f88818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public mk0 f88819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f88820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gd0 f88821e;

    public dd0(gd0 gd0Var, ok0 ok0Var) {
        this.f88821e = gd0Var;
        this.f88818b = ok0Var;
    }

    public final /* synthetic */ void a() {
        if (this.f88820d) {
            return;
        }
        mk0 mk0Var = this.f88819c;
        if (mk0Var != null) {
            mk0Var.a(this.f88818b);
        }
        this.f88821e.f89934n.remove(this);
        this.f88820d = true;
    }

    public final void a(final mx0 mx0Var) {
        Handler handler = this.f88821e.f89941u;
        handler.getClass();
        handler.post(new Runnable() { // from class: bt.v0
            @Override // java.lang.Runnable
            public final void run() {
                this.f6333b.b(mx0Var);
            }
        });
    }

    public final void b(mx0 mx0Var) {
        gd0 gd0Var = this.f88821e;
        if (gd0Var.f89936p == 0 || this.f88820d) {
            return;
        }
        Looper looper = gd0Var.f89940t;
        looper.getClass();
        this.f88819c = gd0Var.a(looper, this.f88818b, mx0Var, false);
        this.f88821e.f89934n.add(this);
    }

    @Override // yads.rk0
    public final void release() {
        Handler handler = this.f88821e.f89941u;
        handler.getClass();
        ib3.a(handler, new Runnable() { // from class: bt.w0
            @Override // java.lang.Runnable
            public final void run() {
                this.f6359b.a();
            }
        });
    }
}
