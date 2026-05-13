package yads;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gb3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f89905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m73[] f89906b;

    public gb3(List list) {
        this.f89905a = list;
        this.f89906b = new m73[list.size()];
    }

    public final void a(pq0 pq0Var, l93 l93Var) {
        for (int i10 = 0; i10 < this.f89906b.length; i10++) {
            l93Var.a();
            l93Var.b();
            m73 m73VarA = pq0Var.a(l93Var.f91914d, 3);
            mx0 mx0Var = (mx0) this.f89905a.get(i10);
            String str = mx0Var.f92610m;
            ni.a("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            lx0 lx0Var = new lx0();
            l93Var.b();
            lx0Var.f92138a = l93Var.f91915e;
            lx0Var.f92148k = str;
            lx0Var.f92141d = mx0Var.f92602e;
            lx0Var.f92140c = mx0Var.f92601d;
            lx0Var.C = mx0Var.E;
            lx0Var.f92150m = mx0Var.f92612o;
            m73VarA.a(new mx0(lx0Var));
            this.f89906b[i10] = m73VarA;
        }
    }
}
