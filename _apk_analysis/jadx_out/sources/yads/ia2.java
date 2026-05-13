package yads;

import android.app.Activity;
import android.os.Build;
import kotlin.Result;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ia2 {
    public static fa2 a(Activity activity, w1 w1Var) {
        Object objM7534constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(Build.VERSION.SDK_INT >= 33 ? new ha2(activity, w1Var) : new ga2());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m7537exceptionOrNullimpl(objM7534constructorimpl) != null) {
            boolean z10 = ad1.f87661a;
            objM7534constructorimpl = new ga2();
        }
        return (fa2) objM7534constructorimpl;
    }
}
