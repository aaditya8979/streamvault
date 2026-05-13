package yads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j1 f91068a = new j1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static k1 f91069b;

    public static final Activity a() {
        Activity activityA;
        synchronized (f91068a) {
            k1 k1Var = f91069b;
            activityA = k1Var != null ? k1Var.a() : null;
        }
        return activityA;
    }

    public static final void a(Context context) {
        synchronized (f91068a) {
            if (f91069b == null) {
                Context applicationContext = context.getApplicationContext();
                Activity activity = null;
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application != null) {
                    Activity activity2 = context instanceof Activity ? (Activity) context : null;
                    if (activity2 != null && !activity2.isFinishing() && !activity2.isDestroyed()) {
                        activity = activity2;
                    }
                    k1 k1Var = new k1(new o1(activity));
                    f91069b = k1Var;
                    application.registerActivityLifecycleCallbacks(k1Var);
                }
            }
            bn.r rVar = bn.r.f5635a;
        }
    }
}
