package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public final class pr2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qr2 f93735a;

    public pr2(wk2 wk2Var) {
        this.f93735a = wk2Var;
    }

    public final or2 a(Context context, v9 v9Var, lu2 lu2Var, d4 d4Var) {
        qq2 qq2Var;
        if (v9Var == null || (qq2Var = v9Var.f96007r) == null) {
            return null;
        }
        if (qq2Var.f94118b) {
            yx2 yx2Var = qq2Var.f94120d;
            if (yx2Var != null) {
                return new wx2(yx2Var, new za(context, lu2Var, d4Var));
            }
            return null;
        }
        rv rvVar = qq2Var.f94119c;
        if (rvVar != null) {
            return new pv(this.f93735a, new bw2(rvVar.f94618b, rvVar.f94619c));
        }
        return null;
    }
}
