package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile y92 f97437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f97438b = new Object();

    public static final y92 a(Context context) {
        if (f97437a == null) {
            synchronized (f97438b) {
                if (f97437a == null) {
                    f97437a = new y92(ug1.a(context, "YadPreferenceFile"));
                }
                bn.r rVar = bn.r.f5635a;
            }
        }
        y92 y92Var = f97437a;
        if (y92Var != null) {
            return y92Var;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
