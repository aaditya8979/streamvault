package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r82 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f94325a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile cp2 f94326b;

    public static final cp2 a(Context context) {
        cp2 cp2VarA;
        cp2 cp2Var = f94326b;
        if (cp2Var != null) {
            return cp2Var;
        }
        synchronized (f94325a) {
            cp2 cp2Var2 = f94326b;
            if (cp2Var2 == null) {
                cp2VarA = dp2.a(context, j82.a(context));
                f94326b = cp2VarA;
                cp2VarA.a();
            } else {
                cp2VarA = cp2Var2;
            }
        }
        return cp2VarA;
    }
}
