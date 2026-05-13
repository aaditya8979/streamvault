package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import yads.x92;

/* JADX INFO: loaded from: classes8.dex */
public final class x92 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v92 f96680g = new v92();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f96681h = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile x92 f96682i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u92 f96685c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f96687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f96688f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f96683a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f96684b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s92 f96686d = new s92();

    public x92(Context context) {
        this.f96685c = new u92(context);
    }

    public static final void a(x92 x92Var) {
        u92 u92Var = x92Var.f96685c;
        xo2 xo2Var = u92Var.f95582c;
        Context context = u92Var.f95580a;
        xo2Var.getClass();
        xo2.a(context, "om_sdk_js_request_tag");
        synchronized (x92Var.f96683a) {
            x92Var.f96688f = true;
            bn.r rVar = bn.r.f5635a;
        }
        x92Var.c();
        x92Var.f96686d.b();
    }

    public final void a() {
        boolean z10;
        synchronized (this.f96683a) {
            z10 = true;
            if (this.f96687e) {
                z10 = false;
            } else {
                this.f96687e = true;
            }
            bn.r rVar = bn.r.f5635a;
        }
        if (z10) {
            b();
            this.f96685c.a(new w92(this));
        }
    }

    public final void a(ld3 ld3Var) {
        synchronized (this.f96683a) {
            this.f96686d.b(ld3Var);
            if (!this.f96686d.a()) {
                u92 u92Var = this.f96685c;
                xo2 xo2Var = u92Var.f95582c;
                Context context = u92Var.f95580a;
                xo2Var.getClass();
                xo2.a(context, "om_sdk_js_request_tag");
            }
            bn.r rVar = bn.r.f5635a;
        }
    }

    public final void b() {
        this.f96684b.postDelayed(new Runnable() { // from class: bt.oc
            @Override // java.lang.Runnable
            public final void run() {
                x92.a(this.f6206b);
            }
        }, f96681h);
    }

    public final void b(ld3 ld3Var) {
        boolean z10;
        synchronized (this.f96683a) {
            z10 = !this.f96688f;
            if (z10) {
                this.f96686d.a(ld3Var);
            }
            bn.r rVar = bn.r.f5635a;
        }
        if (z10) {
            a();
        } else {
            ld3Var.a();
        }
    }

    public final void c() {
        synchronized (this.f96683a) {
            this.f96684b.removeCallbacksAndMessages(null);
            this.f96687e = false;
            bn.r rVar = bn.r.f5635a;
        }
    }
}
