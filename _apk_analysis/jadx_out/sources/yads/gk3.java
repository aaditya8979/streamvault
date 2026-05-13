package yads;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class gk3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ek3 f90022a;

    public gk3(ek3 ek3Var) {
        this.f90022a = ek3Var;
    }

    public final boolean a() {
        View view = this.f90022a.getView();
        return (view == null || kl3.b(view) || kl3.a(view) < 50) ? false : true;
    }
}
