package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class gm2 {
    public final hm2 a() {
        hm2 hm2Var = hm2.f90467d;
        if (hm2Var == null) {
            synchronized (this) {
                hm2Var = hm2.f90467d;
                if (hm2Var == null) {
                    hm2Var = new hm2();
                    hm2.f90467d = hm2Var;
                }
            }
        }
        return hm2Var;
    }
}
