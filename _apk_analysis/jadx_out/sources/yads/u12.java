package yads;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes10.dex */
public final class u12 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f95506e = {wb.a(u12.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o32 f95507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p12 f95508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o12 f95509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lm2 f95510d;

    public u12(View view, o32 o32Var, p12 p12Var) {
        this.f95507a = o32Var;
        this.f95508b = p12Var;
        this.f95510d = mm2.a(view);
    }

    public final void a() {
        ViewTreeObserver viewTreeObserver;
        lm2 lm2Var = this.f95510d;
        KProperty[] kPropertyArr = f95506e;
        KProperty kProperty = kPropertyArr[0];
        View view = (View) lm2Var.f92035a.get();
        if (view != null) {
            view.addOnAttachStateChangeListener(this);
        }
        lm2 lm2Var2 = this.f95510d;
        KProperty kProperty2 = kPropertyArr[0];
        View view2 = (View) lm2Var2.f92035a.get();
        if (view2 != null && view2.isAttachedToWindow()) {
            p12 p12Var = this.f95508b;
            o32 o32Var = this.f95507a;
            p12Var.getClass();
            o12 o12Var = new o12(view2, o32Var);
            this.f95509c = o12Var;
            lm2 lm2Var3 = o12Var.f93073b;
            KProperty kProperty3 = o12.f93071d[0];
            View view3 = (View) lm2Var3.f92035a.get();
            if (view3 == null || (viewTreeObserver = view3.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnGlobalLayoutListener(o12Var);
        }
    }

    public final void b() {
        o12 o12Var = this.f95509c;
        if (o12Var != null) {
            o12Var.a();
        }
        this.f95509c = null;
        lm2 lm2Var = this.f95510d;
        KProperty kProperty = f95506e[0];
        View view = (View) lm2Var.f92035a.get();
        if (view != null) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ViewTreeObserver viewTreeObserver;
        this.f95507a.f93106a.g();
        lm2 lm2Var = this.f95510d;
        KProperty kProperty = f95506e[0];
        View view2 = (View) lm2Var.f92035a.get();
        if (view2 != null && view2.isAttachedToWindow()) {
            p12 p12Var = this.f95508b;
            o32 o32Var = this.f95507a;
            p12Var.getClass();
            o12 o12Var = new o12(view2, o32Var);
            this.f95509c = o12Var;
            lm2 lm2Var2 = o12Var.f93073b;
            KProperty kProperty2 = o12.f93071d[0];
            View view3 = (View) lm2Var2.f92035a.get();
            if (view3 == null || (viewTreeObserver = view3.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnGlobalLayoutListener(o12Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        o12 o12Var = this.f95509c;
        if (o12Var != null) {
            o12Var.a();
        }
        this.f95509c = null;
        this.f95507a.f93106a.h();
    }
}
