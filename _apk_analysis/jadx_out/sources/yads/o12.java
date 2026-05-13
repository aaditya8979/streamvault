package yads;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes9.dex */
public final class o12 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f93071d = {wb.a(o12.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o32 f93072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lm2 f93073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f93074c;

    public o12(View view, o32 o32Var) {
        this.f93072a = o32Var;
        this.f93073b = mm2.a(view);
    }

    public final void a() {
        ViewTreeObserver viewTreeObserver;
        lm2 lm2Var = this.f93073b;
        KProperty kProperty = f93071d[0];
        View view = (View) lm2Var.f92035a.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        lm2 lm2Var = this.f93073b;
        KProperty kProperty = f93071d[0];
        View view = (View) lm2Var.f92035a.get();
        if (view != null) {
            int visibility = view.getVisibility();
            Integer num = this.f93074c;
            if (num != null && visibility == num.intValue()) {
                return;
            }
            this.f93074c = Integer.valueOf(visibility);
            if (visibility == 0) {
                this.f93072a.f93106a.g();
            } else {
                this.f93072a.f93106a.h();
            }
        }
    }
}
