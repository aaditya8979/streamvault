package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class j2 {
    public final k2 a() {
        k2 k2Var = k2.f91464c;
        if (k2Var == null) {
            synchronized (this) {
                k2Var = k2.f91464c;
                if (k2Var == null) {
                    k2Var = new k2();
                    k2.f91464c = k2Var;
                }
            }
        }
        return k2Var;
    }
}
