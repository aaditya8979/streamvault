package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public final class ky implements ag0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ag0[] f91802a;

    public ky(ag0... ag0VarArr) {
        this.f91802a = ag0VarArr;
    }

    @Override // yads.ag0
    public final boolean a(Context context) {
        for (ag0 ag0Var : this.f91802a) {
            if (!ag0Var.a(context)) {
                return false;
            }
        }
        return true;
    }
}
