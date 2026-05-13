package yads;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ap0 {
    public static cp0 a() {
        cp0 cp0Var;
        cp0 cp0Var2 = cp0.f88560d;
        if (cp0Var2 != null) {
            return cp0Var2;
        }
        synchronized (cp0.f88559c) {
            cp0Var = cp0.f88560d;
            if (cp0Var == null) {
                cp0Var = new cp0();
                cp0.f88560d = cp0Var;
            }
        }
        return cp0Var;
    }
}
