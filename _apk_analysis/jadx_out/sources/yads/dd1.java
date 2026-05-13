package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class dd1 implements ly0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f88822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f88823b;

    public dd1(Context context, lu2 lu2Var) {
        this.f88822a = context;
        this.f88823b = lu2Var;
    }

    @Override // yads.ly0
    public final qy0 a(v9 v9Var, d4 d4Var, by0 by0Var) {
        return new cd1(this.f88822a, v9Var, d4Var, this.f88823b, by0Var, new i12(d4Var));
    }
}
