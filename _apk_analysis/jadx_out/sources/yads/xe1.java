package yads;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class xe1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f96739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f96740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final we1 f96741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ue1 f96742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final te1 f96743e;

    public xe1(Context context, ViewGroup viewGroup, we1 we1Var, ue1 ue1Var, te1 te1Var) {
        this.f96739a = context;
        this.f96740b = viewGroup;
        this.f96741c = we1Var;
        this.f96742d = ue1Var;
        this.f96743e = te1Var;
    }

    public final boolean a() {
        Object next;
        we1 we1Var = this.f96741c;
        Context context = this.f96739a;
        Iterator it = we1Var.f96360a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((se1) next).f94806d.a(context)) {
                break;
            }
        }
        se1 se1Var = (se1) next;
        if (se1Var != null) {
            ue1 ue1Var = this.f96742d;
            ViewGroup viewGroup = this.f96740b;
            ue1Var.getClass();
            Context context2 = viewGroup.getContext();
            int i10 = se1Var.f94803a;
            Class cls = se1Var.f94804b;
            ue1Var.f95624a.getClass();
            ViewGroup viewGroup2 = (ViewGroup) es2.a(context2, cls, i10, viewGroup);
            if (viewGroup2 != null) {
                te1 te1Var = this.f96743e;
                ViewGroup viewGroup3 = this.f96740b;
                te1Var.getClass();
                try {
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    viewGroup3.removeAllViews();
                    viewGroup3.addView(viewGroup2, layoutParams);
                } catch (Throwable unused) {
                }
                zf0 zf0Var = se1Var.f94805c;
                te1Var.f95182a = zf0Var;
                if (zf0Var != null) {
                    zf0Var.a(viewGroup2);
                }
                return true;
            }
        }
        return false;
    }

    public final void b() {
        te1 te1Var = this.f96743e;
        ViewGroup viewGroup = this.f96740b;
        te1Var.getClass();
        try {
            viewGroup.removeAllViews();
            zf0 zf0Var = te1Var.f95182a;
            if (zf0Var != null) {
                zf0Var.c();
            }
        } catch (Throwable unused) {
        }
    }
}
