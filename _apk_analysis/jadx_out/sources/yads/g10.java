package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class g10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lu2 f89762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f89763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p000do.l0 f89764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o02 f89765d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ g10(Context context, iu3 iu3Var) {
        e00 e00Var = e00.f89043g;
        Context applicationContext = context.getApplicationContext();
        this(iu3Var, applicationContext, z10.a(iu3Var.a()), new o02(applicationContext, iu3Var, e00Var));
    }

    public g10(iu3 iu3Var, Context context, p000do.l0 l0Var, o02 o02Var) {
        this.f89762a = iu3Var;
        this.f89763b = context;
        this.f89764c = l0Var;
        this.f89765d = o02Var;
    }
}
