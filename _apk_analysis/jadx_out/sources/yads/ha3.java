package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class ha3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f90337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f90338b = new Object();

    public static void a(Context context, at1 at1Var) {
        if (f90337a) {
            return;
        }
        synchronized (f90338b) {
            if (!f90337a) {
                Object obj = dw2.f89000j;
                nt2 nt2VarA = cw2.a().a(context);
                if (nt2VarA != null && nt2VarA.f92943d0) {
                    Thread.setDefaultUncaughtExceptionHandler(new ga3(at1Var, Thread.getDefaultUncaughtExceptionHandler(), nt2VarA));
                    f90337a = true;
                }
            }
            bn.r rVar = bn.r.f5635a;
        }
    }
}
