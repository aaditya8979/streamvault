package yads;

import android.app.Activity;
import android.content.Intent;
import android.view.Window;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class d2 implements i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lu2 f88700a;

    public d2(lu2 lu2Var) {
        this.f88700a = lu2Var;
    }

    @Override // yads.i2
    public final h2 a(Activity activity, RelativeLayout relativeLayout, q2 q2Var, b2 b2Var, Intent intent, Window window, x1 x1Var) {
        if (x1Var != null) {
            v9 v9Var = x1Var.f96585a;
            d4 d4Var = x1Var.f96586b;
            w02 w02Var = x1Var.f96589e;
            Object obj = dw2.f89000j;
            nt2 nt2VarA = cw2.a().a(window.getContext());
            if (w02Var != null) {
                return new g2(activity, relativeLayout, window, w02Var, v9Var, q2Var, b2Var, d4Var, this.f88700a, x1Var.f96590f, nt2VarA, new zx0(activity), new ey0(d4Var.f88740a));
            }
        }
        return null;
    }
}
