package bp;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.MobileAds;
import com.yk.e.inf.IComCallback;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IComCallback f5845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f5846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0 f5847d;

    public o(j0 j0Var, IComCallback iComCallback, Context context) {
        this.f5847d = j0Var;
        this.f5845b = iComCallback;
        this.f5846c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j0 j0Var = this.f5847d;
        j0Var.f5789c = true;
        j0Var.f5790d = false;
        if (!j0Var.f5794h) {
            j0Var.f5791e = this.f5845b;
            if (j0Var.f5793g != null) {
                AdLog.i("doInitUmp");
                j0 j0Var2 = this.f5847d;
                j0Var2.f5794h = true;
                j0Var2.c((Activity) j0Var2.f5793g.get(), this.f5847d.f5791e);
                return;
            }
            return;
        }
        AdLog.i("doInitSdk");
        j0 j0Var3 = this.f5847d;
        Context context = this.f5846c;
        IComCallback iComCallback = this.f5845b;
        if (!j0Var3.f5792f) {
            MobileAds.initialize(context, new t0(j0Var3, System.currentTimeMillis(), iComCallback, context));
            return;
        }
        AdLog.i("Admob utils has success");
        j0Var3.h(true, "", iComCallback);
        j0Var3.d(context);
    }
}
