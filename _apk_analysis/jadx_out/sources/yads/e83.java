package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class e83 implements c92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c61 f89162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e61 f89163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f89164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f89165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f89166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f89167f;

    public e83(c61 c61Var, e61 e61Var) {
        this.f89162a = c61Var;
        this.f89163b = e61Var;
    }

    public final Map a(rb3 rb3Var) {
        Map mapD = cn.p0.d();
        mapD.put("failure_tracked", Boolean.valueOf(this.f89166e));
        if (!rb3Var.f94357a.isEmpty()) {
            List list = rb3Var.f94357a;
            ArrayList arrayList = new ArrayList(cn.x.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((sb3) it.next()).f94771b);
            }
            mapD.put("warnings", arrayList);
        }
        return cn.p0.c(mapD);
    }

    @Override // yads.c92
    public final void a(List list) {
        h92 h92Var = (h92) cn.f0.v0(list);
        if (h92Var == null) {
            return;
        }
        c61 c61Var = this.f89162a;
        c61Var.a(this.f89163b.f89120d, c61Var.a(h92Var.f90307b));
    }

    @Override // yads.c92
    public final void a(qy2 qy2Var, List list, rb3 rb3Var) {
        if (this.f89167f) {
            return;
        }
        this.f89167f = true;
        Map mapA = a(rb3Var);
        c61 c61Var = this.f89162a;
        co2 co2Var = this.f89163b.f89117a;
        fo2 fo2VarA = c61Var.a();
        fo2VarA.f89652a.putAll(mapA);
        c61Var.a(co2Var, fo2VarA);
    }

    @Override // yads.c92
    public final void a(qy2 qy2Var, qb3 qb3Var) {
        int i10 = this.f89165d + 1;
        this.f89165d = i10;
        if (i10 == 20) {
            this.f89166e = true;
            c61 c61Var = this.f89162a;
            c61Var.a(this.f89163b.f89119c, c61Var.a(qb3Var));
        }
    }

    @Override // yads.c92
    public final void a(qy2 qy2Var, rb3 rb3Var) {
        if (this.f89164c) {
            return;
        }
        this.f89164c = true;
        Map mapA = a(rb3Var);
        c61 c61Var = this.f89162a;
        co2 co2Var = this.f89163b.f89118b;
        fo2 fo2VarA = c61Var.a();
        fo2VarA.f89652a.putAll(mapA);
        c61Var.a(co2Var, fo2VarA);
    }

    @Override // yads.c92
    public final void a(v9 v9Var) {
        this.f89162a.f88359a = v9Var;
    }

    @Override // yads.c92
    public final void invalidate() {
        this.f89164c = false;
        this.f89165d = 0;
        this.f89166e = false;
        this.f89167f = false;
    }
}
