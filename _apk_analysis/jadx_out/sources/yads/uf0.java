package yads;

import android.content.Context;
import android.content.Intent;
import com.safedk.android.utils.Logger;
import com.yandex.mobile.ads.common.AdActivity;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: loaded from: classes4.dex */
public final class uf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io2 f95635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1 f95636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l2 f95637c;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ uf0(d4 d4Var, lu2 lu2Var, v9 v9Var) {
        iu3 iu3Var = (iu3) lu2Var;
        this(iu3Var.a(), new p1(d4Var, lu2Var, v9Var), new l2(iu3Var.c()));
    }

    public uf0(io2 io2Var, p1 p1Var, l2 l2Var) {
        this.f95635a = io2Var;
        this.f95636b = p1Var;
        this.f95637c = l2Var;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        context.startActivity(intent);
    }

    public final Object a(Context context, Intent intent, wg2 wg2Var) {
        Object objM7534constructorimpl;
        kotlinx.coroutines.c cVar = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.d(wg2Var), 1);
        cVar.K();
        long andIncrement = y21.f96978a.getAndIncrement();
        this.f95637c.f91870a.getClass();
        Intent intent2 = new Intent(context, (Class<?>) AdActivity.class);
        intent2.putExtra("window_type", "window_type_activity_result");
        intent2.putExtra("data_identifier", andIncrement);
        p1 p1Var = this.f95636b;
        sf0 sf0Var = new sf0(cVar);
        tf0 tf0Var = new tf0(cVar);
        p1Var.getClass();
        x1 x1Var = new x1(p1Var.f93383c, p1Var.f93381a, new z9(), p1Var.f93382b, null, 0, new qf0(intent, sf0Var, tf0Var), 48);
        Object obj = z1.f97354b;
        z1 z1VarA = y1.a();
        z1VarA.a(andIncrement, x1Var);
        cVar.P(new rf0(z1VarA, andIncrement));
        try {
            Result.a aVar = Result.Companion;
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent2);
            objM7534constructorimpl = Result.m7534constructorimpl(bn.r.f5635a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
        if (thM7537exceptionOrNullimpl != null) {
            z1VarA.a(andIncrement);
            this.f95635a.reportError("Failed to launch AdActivity for result", thM7537exceptionOrNullimpl);
            if (cVar.isActive()) {
                cVar.resumeWith(Result.m7534constructorimpl(kotlin.c.a(thM7537exceptionOrNullimpl)));
            }
        }
        Object objB = cVar.B();
        if (objB == in.a.g()) {
            jn.f.c(wg2Var);
        }
        return objB == in.a.g() ? objB : bn.r.f5635a;
    }
}
