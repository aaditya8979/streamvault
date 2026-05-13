package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public final class o4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xo2 f93109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f93111c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o4(Context context) {
        this(context, wo2.a());
        Object obj = xo2.f96843a;
    }

    public o4(Context context, xo2 xo2Var) {
        this.f93109a = xo2Var;
        this.f93110b = tb.a(this);
        this.f93111c = context.getApplicationContext();
    }

    public final void a(pn pnVar) {
        pnVar.f93684q = this.f93110b;
        xo2 xo2Var = this.f93109a;
        Context context = this.f93111c;
        synchronized (xo2Var) {
            r82.a(context).a(pnVar);
        }
    }
}
