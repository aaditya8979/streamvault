package yads;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pm3 {
    public static be3 a(im3 im3Var) {
        if (im3Var instanceof zl0) {
            return ae3.a((zl0) im3Var);
        }
        if (im3Var instanceof lb2) {
            return ae3.a();
        }
        e82 e82Var = im3Var.f90905b;
        if (e82Var == null) {
            return ae3.a(im3Var.getMessage());
        }
        int i10 = e82Var.f89157a;
        if (i10 >= 500) {
            return ae3.b();
        }
        String str = ("Network Error.  Code: " + i10 + ".") + " Data: \n" + new String(e82Var.f89158b, bo.c.f5639b);
        boolean z10 = ad1.f87661a;
        return ae3.b(str);
    }
}
