package yads;

import android.app.Activity;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import yads.dr2;

/* JADX INFO: loaded from: classes3.dex */
public final class dr2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wq2 f88963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vk2 f88964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rh1 f88965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mh1 f88966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f88967e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c00 f88968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f88969g;

    public dr2(wq2 wq2Var, vk2 vk2Var, rh1 rh1Var, mh1 mh1Var) {
        this.f88963a = wq2Var;
        this.f88964b = vk2Var;
        this.f88965c = rh1Var;
        this.f88966d = mh1Var;
        this.f88968f = wq2Var.d();
        this.f88969g = wq2Var.e();
        wq2Var.a(vk2Var);
    }

    public static final void a(dr2 dr2Var, Activity activity) {
        if (dr2Var.f88967e.getAndSet(true)) {
            dr2Var.f88964b.a(o7.f93134a);
            return;
        }
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(dr2Var.f88963a.a(activity));
        if (thM7537exceptionOrNullimpl != null) {
            dr2Var.f88964b.a(new n7(String.valueOf(thM7537exceptionOrNullimpl.getMessage())));
        }
    }

    public final void a(final Activity activity) {
        this.f88965c.a();
        this.f88966d.a(new Runnable() { // from class: bt.z0
            @Override // java.lang.Runnable
            public final void run() {
                dr2.a(this.f6435b, activity);
            }
        });
    }
}
