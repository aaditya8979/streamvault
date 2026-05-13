package yads;

/* JADX INFO: loaded from: classes5.dex */
public final class eq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pd3 f89354a;

    public eq1(pd3 pd3Var) {
        this.f89354a = pd3Var;
    }

    public final boolean a(String str, String str2) {
        if (str2 == null || bo.d0.u0(str2)) {
            return true;
        }
        this.f89354a.getClass();
        od3 od3VarA = pd3.a(str);
        if (od3VarA == null) {
            return true;
        }
        this.f89354a.getClass();
        od3 od3VarA2 = pd3.a(str2);
        return od3VarA2 == null || od3VarA.compareTo(od3VarA2) >= 0;
    }
}
