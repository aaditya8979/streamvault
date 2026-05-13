package yads;

import java.util.Iterator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes12.dex */
public final class gv0 implements zg3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f90128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g62 f90129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z52 f90130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Iterator f90131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z30 f90132e;

    public gv0(w5 w5Var, g62 g62Var, z52 z52Var, Iterator it, z30 z30Var) {
        this.f90128a = w5Var;
        this.f90129b = g62Var;
        this.f90130c = z52Var;
        this.f90131d = it;
        this.f90132e = z30Var;
    }

    @Override // yads.zg3
    public final void a() {
        if (this.f90131d.hasNext()) {
            Pair pair = (Pair) this.f90131d.next();
            String str = (String) pair.component1();
            String str2 = (String) pair.component2();
            w5 w5Var = this.f90128a;
            g62 g62Var = this.f90129b;
            z52 z52Var = this.f90130c;
            z52Var.a(str, new gv0(w5Var, g62Var, z52Var, this.f90131d, this.f90132e), str2);
        }
    }

    @Override // yads.zg3
    public final void b() {
        this.f90132e.a(y30.f96983f);
    }

    @Override // yads.zg3
    public final void c() {
        a();
    }
}
