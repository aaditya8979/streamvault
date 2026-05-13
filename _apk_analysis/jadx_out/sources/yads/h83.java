package yads;

import android.app.Activity;
import android.content.Context;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes10.dex */
public final class h83 implements l1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f90278d = {wb.a(h83.class, "contextReference", "getContextReference()Landroid/content/Context;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o32 f90279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f90280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lm2 f90281c;

    public h83(Activity activity, o32 o32Var, w0 w0Var) {
        this.f90279a = o32Var;
        this.f90280b = w0Var;
        this.f90281c = mm2.a(activity);
    }

    @Override // yads.l1
    public final void a(Activity activity) {
        lm2 lm2Var = this.f90281c;
        KProperty kProperty = f90278d[0];
        Context context = (Context) lm2Var.f92035a.get();
        if (context == null || !tn.p.f(context, activity)) {
            return;
        }
        this.f90279a.f93106a.h();
    }

    @Override // yads.l1
    public final void b(Activity activity) {
        lm2 lm2Var = this.f90281c;
        KProperty kProperty = f90278d[0];
        Context context = (Context) lm2Var.f92035a.get();
        if (context == null || !tn.p.f(context, activity)) {
            return;
        }
        this.f90279a.f93106a.g();
    }
}
