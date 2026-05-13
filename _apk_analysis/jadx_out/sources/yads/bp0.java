package yads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bp0 {
    public static dp0 a() {
        dp0 dp0Var;
        dp0 dp0Var2 = dp0.f88947d;
        if (dp0Var2 != null) {
            return dp0Var2;
        }
        synchronized (dp0.f88946c) {
            dp0Var = dp0.f88947d;
            if (dp0Var == null) {
                dp0Var = new dp0();
                dp0.f88947d = dp0Var;
            }
        }
        return dp0Var;
    }
}
