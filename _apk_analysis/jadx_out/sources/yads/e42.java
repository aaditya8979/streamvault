package yads;

import com.ironsource.C3978d4;

/* JADX INFO: loaded from: classes4.dex */
public final class e42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cj f89095a;

    public e42(cj cjVar) {
        this.f89095a = cjVar;
    }

    public final d42 a() {
        o72 o72Var;
        Object obj = this.f89095a.f88467a.get(C3978d4.i.I0);
        d62 d62Var = null;
        on1 on1Var = obj instanceof on1 ? (on1) obj : null;
        if (on1Var != null) {
            d62 d62Var2 = on1Var.f93292b != null ? new d62() : null;
            o72Var = on1Var.f93291a != null ? new o72() : null;
            d62Var = d62Var2;
        } else {
            o72Var = null;
        }
        return new d42(d62Var, o72Var);
    }
}
