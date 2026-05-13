package yads;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ip0 {
    public static kp0 a() {
        kp0 kp0Var;
        kp0 kp0Var2 = kp0.f91701c;
        if (kp0Var2 != null) {
            return kp0Var2;
        }
        synchronized (kp0.f91700b) {
            kp0Var = kp0.f91701c;
            if (kp0Var == null) {
                kp0Var = new kp0();
                kp0.f91701c = kp0Var;
            }
        }
        return kp0Var;
    }
}
