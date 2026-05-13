package com.fyber.inneractive.sdk.config;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import com.fyber.inneractive.sdk.util.t1;
import com.fyber.inneractive.sdk.util.v1;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v1 f16004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x0 f16005d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f16007f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f16002a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16003b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f16006e = new Handler(Looper.getMainLooper(), new b(this));

    public e(x0 x0Var) {
        c cVar = new c(this);
        this.f16007f = new d(this);
        this.f16005d = x0Var;
        Application application = com.fyber.inneractive.sdk.util.o.f19548a;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(cVar);
        }
    }

    public final void a() {
        s sVar = IAConfigManager.O.f15975u;
        if (!sVar.f16146d) {
            sVar.f16145c.add(this);
        }
        v1 v1Var = new v1(TimeUnit.MINUTES, r0.f15975u.f16144b.a("session_duration", 30, 1));
        this.f16004c = v1Var;
        v1Var.f19580e = this.f16007f;
    }

    @Override // com.fyber.inneractive.sdk.config.r
    public final void onGlobalConfigChanged(s sVar, o oVar) {
        v1 v1Var = this.f16004c;
        if (v1Var != null) {
            v1Var.f19579d = false;
            v1Var.f19581f = 0L;
            t1 t1Var = v1Var.f19578c;
            if (t1Var != null) {
                t1Var.removeMessages(1932593528);
            }
            v1 v1Var2 = new v1(TimeUnit.MINUTES, oVar.a("session_duration", 30, 1), this.f16004c.f19581f);
            this.f16004c = v1Var2;
            v1Var2.f19580e = this.f16007f;
        }
        sVar.f16145c.remove(this);
    }
}
