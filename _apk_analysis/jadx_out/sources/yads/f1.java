package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f89439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f89440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9 f89441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g1 f89442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f89443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e1 f89444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i22 f89445g;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ f1(Context context, d4 d4Var, lu2 lu2Var, v9 v9Var, wz1 wz1Var) {
        Context applicationContext = context.getApplicationContext();
        this(d4Var, lu2Var, v9Var, wz1Var, applicationContext, new e1(applicationContext, d4Var, lu2Var, v9Var, wz1Var, null));
    }

    public f1(d4 d4Var, lu2 lu2Var, v9 v9Var, wz1 wz1Var, Context context, e1 e1Var) {
        this.f89439a = d4Var;
        this.f89440b = lu2Var;
        this.f89441c = v9Var;
        this.f89442d = wz1Var;
        this.f89443e = context;
        this.f89444f = e1Var;
    }
}
