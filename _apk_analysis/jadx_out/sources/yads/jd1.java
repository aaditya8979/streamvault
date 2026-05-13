package yads;

import android.app.Activity;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import yads.jd1;

/* JADX INFO: loaded from: classes6.dex */
public final class jd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cd1 f91180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tk2 f91181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rh1 f91182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mh1 f91183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f91184e = new AtomicBoolean(false);

    public jd1(cd1 cd1Var, tk2 tk2Var, rh1 rh1Var, mh1 mh1Var) {
        this.f91180a = cd1Var;
        this.f91181b = tk2Var;
        this.f91182c = rh1Var;
        this.f91183d = mh1Var;
        cd1Var.a(tk2Var);
    }

    public static final void a(jd1 jd1Var, Activity activity) {
        if (jd1Var.f91184e.getAndSet(true)) {
            jd1Var.f91181b.a(o7.f93134a);
            return;
        }
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(jd1Var.f91180a.a(activity));
        if (thM7537exceptionOrNullimpl != null) {
            jd1Var.f91181b.a(new n7(String.valueOf(thM7537exceptionOrNullimpl.getMessage())));
        }
    }

    public final void a(final Activity activity) {
        this.f91182c.a();
        this.f91183d.a(new Runnable() { // from class: bt.j3
            @Override // java.lang.Runnable
            public final void run() {
                jd1.a(this.f6095b, activity);
            }
        });
    }
}
