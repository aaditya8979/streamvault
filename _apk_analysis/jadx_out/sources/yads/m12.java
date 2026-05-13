package yads;

import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m12 {
    public static n12 a() {
        n12 n12Var;
        n12 n12Var2 = n12.f92692c;
        if (n12Var2 != null) {
            return n12Var2;
        }
        synchronized (n12.f92691b) {
            n12Var = n12.f92692c;
            if (n12Var == null) {
                n12Var = new n12(new WeakHashMap());
                n12.f92692c = n12Var;
            }
        }
        return n12Var;
    }
}
