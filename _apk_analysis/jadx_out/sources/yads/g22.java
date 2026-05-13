package yads;

/* JADX INFO: loaded from: classes.dex */
public abstract class g22 {
    public static h22 a() {
        h22 h22Var;
        h22 h22Var2 = h22.f90205b;
        if (h22Var2 != null) {
            return h22Var2;
        }
        synchronized (h22.f90204a) {
            h22Var = h22.f90205b;
            if (h22Var == null) {
                h22Var = new h22();
                h22.f90205b = h22Var;
            }
        }
        return h22Var;
    }
}
