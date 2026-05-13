package yads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class qg3 implements to2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final to2 f94030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f94031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rg3 f94032c;

    public qg3(rg3 rg3Var, to2 to2Var, Object obj) {
        this.f94032c = rg3Var;
        this.f94030a = to2Var;
        this.f94031b = obj;
    }

    public final void a() {
        if (!this.f94032c.f94448d.isEmpty()) {
            this.f94030a.onSuccess(this.f94032c.f94448d);
            return;
        }
        zl0 zl0Var = new zl0();
        to2 to2Var = this.f94030a;
        String message = zl0Var.getMessage();
        if (message == null) {
            message = "Ad request completed successfully, but there are no ads available.";
        }
        to2Var.a(new be3(message));
    }

    @Override // yads.to2
    public final void a(be3 be3Var) {
        a();
    }

    @Override // yads.to2
    public final void onSuccess(Object obj) {
        this.f94032c.f94447c.getClass();
        og3 og3VarA = pg3.a((List) obj);
        this.f94032c.f94448d.addAll(og3VarA.f93217a);
        List list = og3VarA.f93218b;
        if (list.isEmpty()) {
            a();
        } else {
            rg3 rg3Var = this.f94032c;
            rg3Var.f94446b.a(rg3Var.f94445a, list, this, this.f94031b);
        }
    }
}
