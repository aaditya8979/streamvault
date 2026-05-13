package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public final class nw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kb3 f93025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mb3 f93026b;

    public /* synthetic */ nw2(Context context) {
        this(new kb3(context), new mb3(context));
    }

    public nw2(kb3 kb3Var, mb3 mb3Var) {
        this.f93025a = kb3Var;
        this.f93026b = mb3Var;
    }

    public final void a() {
        boolean z10;
        mb3 mb3Var = this.f93026b;
        rd3 rd3Var = mb3Var.f92316a;
        Context context = mb3Var.f92318c;
        rd3Var.getClass();
        if (ub.a(context)) {
            lb3 lb3Var = mb3Var.f92317b;
            nt2 nt2VarA = lb3Var.f91923a.a(mb3Var.f92318c);
            if (nt2VarA != null && nt2VarA.f92970r) {
                mb3Var.f92319d.getClass();
                nb3.b();
            }
        }
        kb3 kb3Var = this.f93025a;
        rd3 rd3Var2 = kb3Var.f91545c;
        Context context2 = kb3Var.f91547e;
        rd3Var2.getClass();
        if (ub.a(context2)) {
            dw2 dw2Var = kb3Var.f91544b;
            dw2Var.getClass();
            synchronized (dw2.f89000j) {
                z10 = dw2Var.f89007f;
            }
            if (z10) {
                jb3 jb3Var = kb3Var.f91546d;
                nt2 nt2VarA2 = jb3Var.f91150a.a(kb3Var.f91547e);
                if (nt2VarA2 == null || !nt2VarA2.f92968q) {
                    return;
                }
                kb3Var.f91543a.a();
            }
        }
    }
}
