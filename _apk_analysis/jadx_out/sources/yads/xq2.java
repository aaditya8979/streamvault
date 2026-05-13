package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class xq2 implements ly0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f96854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f96855b;

    public xq2(Context context, lu2 lu2Var) {
        this.f96854a = context;
        this.f96855b = lu2Var;
    }

    @Override // yads.ly0
    public final qy0 a(v9 v9Var, d4 d4Var, by0 by0Var) {
        Context context = this.f96854a;
        lu2 lu2Var = this.f96855b;
        wk2 wk2Var = new wk2();
        return new wq2(context, v9Var, d4Var, lu2Var, by0Var, wk2Var, new pr2(wk2Var), new i12(d4Var), new zs2(d4Var, lu2Var));
    }
}
