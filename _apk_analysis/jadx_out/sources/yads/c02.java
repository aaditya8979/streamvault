package yads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes12.dex */
public abstract class c02 {
    public static d02 a() {
        if (d02.f88679d == null) {
            synchronized (d02.f88678c) {
                if (d02.f88679d == null) {
                    d02.f88679d = new d02(new Handler(Looper.getMainLooper()));
                }
                bn.r rVar = bn.r.f5635a;
            }
        }
        d02 d02Var = d02.f88679d;
        if (d02Var != null) {
            return d02Var;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
