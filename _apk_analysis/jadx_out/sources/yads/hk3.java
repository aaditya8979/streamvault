package yads;

import android.view.View;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hk3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f90452b = {wb.a(hk3.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lm2 f90453a;

    public hk3(View view) {
        this.f90453a = mm2.a(view);
    }

    public void a() {
    }

    public void a(View view) {
        view.setVisibility(8);
        view.setOnClickListener(null);
        view.setOnTouchListener(null);
        view.setSelected(false);
    }

    public void a(oi oiVar, kk3 kk3Var, Object obj) {
        View viewB = b();
        if (viewB == null) {
            return;
        }
        kk3Var.a(viewB, oiVar);
        kk3Var.a(oiVar, new jk3(viewB));
    }

    public abstract boolean a(View view, Object obj);

    public final View b() {
        lm2 lm2Var = this.f90453a;
        KProperty kProperty = f90452b[0];
        return (View) lm2Var.f92035a.get();
    }

    public abstract void b(View view, Object obj);

    public final boolean c() {
        View viewB = b();
        return viewB != null && !kl3.b(viewB) && viewB.getWidth() >= 1 && viewB.getHeight() >= 1;
    }
}
