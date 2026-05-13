package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class s82 {
    public final w82 a(Context context) {
        w82 w82Var = w82.f96307e;
        if (w82Var == null) {
            synchronized (this) {
                w82Var = w82.f96307e;
                if (w82Var == null) {
                    w82Var = new w82(context, new k31());
                    w82.f96307e = w82Var;
                }
            }
        }
        return w82Var;
    }
}
