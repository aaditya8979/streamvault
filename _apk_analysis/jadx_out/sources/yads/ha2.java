package yads;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import yads.ha2;

/* JADX INFO: loaded from: classes4.dex */
public final class ha2 implements fa2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f90334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f90335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OnBackInvokedCallback f90336c = new OnBackInvokedCallback() { // from class: bt.j2
        @Override // android.window.OnBackInvokedCallback
        public final void onBackInvoked() {
            ha2.a(this.f6094a);
        }
    };

    public ha2(Activity activity, w1 w1Var) {
        this.f90334a = activity;
        this.f90335b = w1Var;
    }

    public static final void a(ha2 ha2Var) {
        w1 w1Var = ha2Var.f90335b;
        if (w1Var == null || !w1Var.f96251c.d()) {
            return;
        }
        ha2Var.f90334a.finish();
    }

    @Override // yads.fa2
    public final void a() {
        this.f90334a.getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f90336c);
    }

    @Override // yads.fa2
    public final void destroy() {
        this.f90334a.getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f90336c);
    }
}
