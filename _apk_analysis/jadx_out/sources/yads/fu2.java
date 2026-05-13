package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class fu2 implements eq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dq2 f89679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mm3 f89680b;

    public /* synthetic */ fu2(at1 at1Var) {
        this(c82.a(at1Var), new mm3());
    }

    public fu2(dq2 dq2Var, mm3 mm3Var) {
        this.f89679a = dq2Var;
        this.f89680b = mm3Var;
    }

    @Override // yads.eq2
    public final Object a(e82 e82Var) {
        this.f89680b.getClass();
        int i10 = e82Var.f89157a;
        xp2 xp2Var = new xp2(e82Var.f89158b);
        Map mapJ = e82Var.f89159c;
        if (mapJ == null) {
            mapJ = kotlin.collections.a.j();
        }
        return (nt2) this.f89679a.a(new wp2(i10, xp2Var, mapJ));
    }
}
