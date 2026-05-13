package yads;

import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public final class fk3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ek3 f89606a;

    public fk3(ek3 ek3Var) {
        this.f89606a = ek3Var;
    }

    public final boolean a() {
        View view = this.f89606a.getView();
        return (view == null || kl3.b(view) || kl3.f91651a.a(view).f96809a < 1) ? false : true;
    }
}
