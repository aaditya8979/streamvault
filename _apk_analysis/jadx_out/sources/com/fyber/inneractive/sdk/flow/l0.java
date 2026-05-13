package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.t1;
import com.fyber.inneractive.sdk.util.v1;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f16427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f16428b;

    public l0(p0 p0Var, long j10) {
        this.f16428b = p0Var;
        this.f16427a = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f16428b.K()) {
            p0 p0Var = this.f16428b;
            p0Var.f16518n = new k0(this);
            long jA = p0Var.a(this.f16427a);
            p0 p0Var2 = this.f16428b;
            p0Var2.getClass();
            v1 v1Var = new v1(TimeUnit.MILLISECONDS, jA);
            p0Var2.f16519o = v1Var;
            v1Var.f19580e = new o0(p0Var2);
            t1 t1Var = new t1(v1Var);
            v1Var.f19578c = t1Var;
            v1Var.f19579d = false;
            t1Var.sendEmptyMessage(1932593528);
            p0 p0Var3 = this.f16428b;
            p0Var3.getClass();
            IAlog.a("%sad contains custom close. Will show transparent x in %d", IAlog.a(p0Var3), Long.valueOf(jA));
            this.f16428b.f16516l = null;
        } else {
            p0 p0Var4 = this.f16428b;
            p0Var4.getClass();
            IAlog.a("%sad does not contain custom close. Showing close button", IAlog.a(p0Var4));
            this.f16428b.d(false);
        }
        Runnable runnable = this.f16428b.f16516l;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.r.f19556b.removeCallbacks(runnable);
            this.f16428b.f16516l = null;
        }
    }
}
