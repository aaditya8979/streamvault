package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class fc1 implements rm3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dq2 f89527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xo.a f89528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mm3 f89529c;

    public fc1(i43 i43Var, xo.a aVar, mm3 mm3Var) {
        this.f89527a = i43Var;
        this.f89528b = aVar;
        this.f89529c = mm3Var;
    }

    @Override // yads.rm3
    public final Object a(e82 e82Var) {
        this.f89529c.getClass();
        int i10 = e82Var.f89157a;
        xp2 xp2Var = new xp2(e82Var.f89158b);
        Map mapJ = e82Var.f89159c;
        if (mapJ == null) {
            mapJ = kotlin.collections.a.j();
        }
        String str = (String) this.f89527a.a(new wp2(i10, xp2Var, mapJ));
        if (str == null || bo.d0.u0(str)) {
            return null;
        }
        xo.a aVar = this.f89528b;
        aVar.a();
        return (j80) aVar.c(j80.Companion.serializer(), str);
    }
}
