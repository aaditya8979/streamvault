package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public final class u92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f95580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y92 f95581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xo2 f95582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dw2 f95583d;

    public u92(Context context) {
        this.f95580a = context.getApplicationContext();
        this.f95581b = z92.a(context);
        Object obj = xo2.f96843a;
        this.f95582c = wo2.a();
        Object obj2 = dw2.f89000j;
        this.f95583d = cw2.a();
    }

    public final void a(w92 w92Var) {
        nt2 nt2VarA = this.f95583d.a(this.f95580a);
        String str = nt2VarA != null ? nt2VarA.Q : null;
        String strC = ((tg1) this.f95581b.f97047a).c("YmadOmSdkJsUrl");
        if (str == null || str.length() <= 0 || tn.p.f(str, strC)) {
            w92Var.a();
            return;
        }
        t92 t92Var = new t92(this, str, w92Var);
        h43 h43Var = new h43(str, t92Var, t92Var);
        h43Var.f93684q = "om_sdk_js_request_tag";
        xo2 xo2Var = this.f95582c;
        Context context = this.f95580a;
        synchronized (xo2Var) {
            r82.a(context).a(h43Var);
        }
    }
}
