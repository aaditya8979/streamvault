package yads;

import android.content.Context;
import android.content.Intent;
import com.safedk.android.utils.Logger;
import kotlin.Result;

/* JADX INFO: loaded from: classes2.dex */
public final class ky0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io2 f91803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jy0 f91804b;

    public ky0(io2 io2Var, jy0 jy0Var) {
        this.f91803a = io2Var;
        this.f91804b = jy0Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ky0(lu2 lu2Var) {
        iu3 iu3Var = (iu3) lu2Var;
        this(iu3Var.a(), new jy0(iu3Var.c()));
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        context.startActivity(intent);
    }

    public final Object a(Context context, x1 x1Var) {
        Object objM7534constructorimpl;
        long jA = y21.a();
        Intent intentA = this.f91804b.a(context, jA);
        Object obj = z1.f97354b;
        z1 z1VarA = y1.a();
        z1VarA.a(jA, x1Var);
        try {
            Result.a aVar = Result.Companion;
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intentA);
            objM7534constructorimpl = Result.m7534constructorimpl(bn.r.f5635a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
        if (thM7537exceptionOrNullimpl != null) {
            z1VarA.a(jA);
            lc1.a("Failed to show Fullscreen Ad. Exception: " + thM7537exceptionOrNullimpl, new Object[0]);
            this.f91803a.reportError("Failed to show Fullscreen Ad", thM7537exceptionOrNullimpl);
        }
        return objM7534constructorimpl;
    }
}
