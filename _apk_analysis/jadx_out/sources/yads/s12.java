package yads;

import java.util.Iterator;
import java.util.List;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class s12 implements j72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fy1 f94674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l12 f94675b;

    public s12(fy1 fy1Var) {
        this.f94674a = fy1Var;
    }

    @Override // yads.j72
    public final void a() {
        l12 l12Var = this.f94675b;
        if (l12Var != null) {
            for (oi oiVar : this.f94674a.f89727b) {
                pi piVarA = l12Var.a(oiVar);
                if (piVarA instanceof pf0) {
                    ((pf0) piVarA).b(oiVar.f93231c);
                }
            }
        }
    }

    @Override // yads.j72
    public final void a(l12 l12Var) {
        l12Var.a();
    }

    @Override // yads.j72
    public final void a(l12 l12Var, gv gvVar) {
        this.f94675b = l12Var;
        fy1 fy1Var = this.f94674a;
        vb vbVar = new vb(l12Var, gvVar, fy1Var.f89730e, new hl3());
        for (oi oiVar : fy1Var.f89727b) {
            pi piVarA = l12Var.a(oiVar);
            if (!(piVarA instanceof pi)) {
                piVarA = null;
            }
            if (piVarA != null) {
                piVarA.c(oiVar.f93231c);
                tn.p.i(oiVar, "null cannot be cast to non-null type com.monetization.ads.network.model.Asset<kotlin.Any?>");
                piVarA.a(oiVar, vbVar);
            }
        }
        lm2 lm2Var = l12Var.f91863c.f96976e;
        KProperty kProperty = y12.f96971g[4];
        List list = (List) lm2Var.f92035a.get();
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }
}
