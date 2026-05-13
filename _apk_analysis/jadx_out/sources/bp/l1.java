package bp;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class l1 extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f5811b;

    public l1(j0 j0Var) {
        this.f5811b = j0Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f5811b.f5793g = new WeakReference(activity);
        j0 j0Var = this.f5811b;
        if (!j0Var.f5789c || j0Var.f5794h) {
            return;
        }
        j0Var.f5794h = true;
        j0Var.c((Activity) j0Var.f5793g.get(), this.f5811b.f5791e);
    }
}
