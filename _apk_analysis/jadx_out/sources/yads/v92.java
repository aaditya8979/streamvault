package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class v92 {
    public final x92 a(Context context) {
        x92 x92Var = x92.f96682i;
        if (x92Var == null) {
            synchronized (this) {
                x92Var = x92.f96682i;
                if (x92Var == null) {
                    x92Var = new x92(context);
                    x92.f96682i = x92Var;
                }
            }
        }
        return x92Var;
    }
}
