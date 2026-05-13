package yads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class w03 implements j72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f96248a;

    public w03(List list) {
        this.f96248a = list;
    }

    @Override // yads.j72
    public final void a() {
    }

    @Override // yads.j72
    public final void a(l12 l12Var) {
    }

    @Override // yads.j72
    public final void a(l12 l12Var, gv gvVar) {
        List<oi> list = this.f96248a;
        if (list != null) {
            ob obVar = new ob(l12Var, gvVar);
            for (oi oiVar : list) {
                pi piVarA = l12Var.a(oiVar);
                if (!(piVarA instanceof pi)) {
                    piVarA = null;
                }
                if (piVarA != null) {
                    piVarA.c(oiVar.f93231c);
                    tn.p.i(oiVar, "null cannot be cast to non-null type com.monetization.ads.network.model.Asset<kotlin.Any?>");
                    piVarA.a(oiVar, obVar);
                }
            }
        }
    }
}
