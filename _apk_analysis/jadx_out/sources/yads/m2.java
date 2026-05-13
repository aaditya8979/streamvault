package yads;

import android.app.Activity;
import android.content.Intent;
import com.safedk.android.utils.Logger;
import java.util.Map;
import kotlin.Result;

/* JADX INFO: loaded from: classes2.dex */
public final class m2 implements h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f92211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x1 f92212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q1 f92213c;

    public m2(Activity activity, x1 x1Var, q1 q1Var) {
        this.f92211a = activity;
        this.f92212b = x1Var;
        this.f92213c = q1Var;
    }

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity activity, Intent intent, int i10) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (intent == null) {
            return;
        }
        activity.startActivityForResult(intent, i10);
    }

    @Override // yads.h2
    public final void a() {
    }

    @Override // yads.h2
    public final void b() {
    }

    @Override // yads.h2
    public final void c() {
        Object objM7534constructorimpl;
        q1 q1Var = this.f92213c;
        Activity activity = this.f92211a;
        x1 x1Var = this.f92212b;
        q1Var.getClass();
        qf0 qf0Var = x1Var.f96591g;
        if (qf0Var == null) {
            return;
        }
        try {
            Result.a aVar = Result.Companion;
            safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(activity, qf0Var.f94025a, 0);
            bn.r rVar = bn.r.f5635a;
            r1 r1Var = q1Var.f93856a;
            fo2 fo2VarA = r1Var.f94249b.a(x1Var.f96585a, x1Var.f96586b);
            co2 co2Var = co2.H;
            Map map = fo2VarA.f89652a;
            r1Var.f94248a.a(new eo2(co2Var.a(), kotlin.collections.a.C(map), fo2VarA.f89653b));
            qf0Var.f94026b.invoke();
            activity.finish();
            objM7534constructorimpl = Result.m7534constructorimpl(rVar);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
        if (thM7537exceptionOrNullimpl != null) {
            activity.finish();
            q1Var.f93856a.f94248a.reportError("Failed to register ActivityResult", thM7537exceptionOrNullimpl);
            qf0Var.f94027c.invoke(thM7537exceptionOrNullimpl);
        }
    }

    @Override // yads.h2
    public final boolean d() {
        return true;
    }

    @Override // yads.h2
    public final void f() {
    }

    @Override // yads.h2
    public final void g() {
    }

    @Override // yads.h2
    public final void onAdClosed() {
    }
}
