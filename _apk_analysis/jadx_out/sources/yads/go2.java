package yads;

/* JADX INFO: loaded from: classes2.dex */
public abstract class go2 {
    public static final fo2 a(fo2 fo2Var, fo2 fo2Var2) {
        if (fo2Var2 == null) {
            return new fo2(fo2Var.f89652a, fo2Var.f89653b);
        }
        c cVar = fo2Var.f89653b;
        if (cVar == null) {
            cVar = fo2Var2.f89653b;
        }
        return new fo2(kotlin.collections.a.q(fo2Var.f89652a, fo2Var2.f89652a), cVar);
    }
}
