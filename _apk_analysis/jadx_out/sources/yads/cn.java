package yads;

import android.content.Context;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class cn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bn f88507a;

    public cn(bn bnVar) {
        this.f88507a = bnVar;
    }

    public final void a(nv0 nv0Var, rm rmVar) {
        Object next;
        RelativeLayout.LayoutParams layoutParams;
        bn bnVar = this.f88507a;
        we1 we1Var = bnVar.f88086c;
        Context context = bnVar.f88084a;
        Iterator it = we1Var.f96360a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((se1) next).f94806d.a(context)) {
                    break;
                }
            }
        }
        se1 se1Var = (se1) next;
        if (se1Var != null) {
            ue1 ue1Var = bnVar.f88087d;
            ViewGroup viewGroup = bnVar.f88085b;
            ue1Var.getClass();
            Context context2 = viewGroup.getContext();
            int i10 = se1Var.f94803a;
            Class cls = se1Var.f94804b;
            ue1Var.f95624a.getClass();
            ViewGroup viewGroup2 = (ViewGroup) es2.a(context2, cls, i10, viewGroup);
            if (viewGroup2 != null) {
                an anVar = bnVar.f88088e;
                ViewGroup viewGroup3 = bnVar.f88085b;
                lm2 lm2Var = anVar.f87751c;
                KProperty kProperty = an.f87748d[0];
                lm2Var.getClass();
                lm2Var.f92035a = new WeakReference(viewGroup2);
                viewGroup3.setVisibility(0);
                viewGroup3.removeAllViews();
                Context context3 = viewGroup3.getContext();
                ViewTreeObserver.OnPreDrawListener onPreDrawListener = anVar.f87749a;
                bn.g gVar = mk3.f92423a;
                if (viewGroup3.indexOfChild(viewGroup2) == -1) {
                    if (nv0Var != null) {
                        layoutParams = new RelativeLayout.LayoutParams(kl3.a(context3, nv0Var.c(context3)), vn.c.d(TypedValue.applyDimension(1, nv0Var.a(context3), context3.getResources().getDisplayMetrics())));
                    } else {
                        layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    }
                    layoutParams.addRule(13);
                    viewGroup3.setVisibility(0);
                    viewGroup2.setVisibility(0);
                    viewGroup3.addView(viewGroup2, layoutParams);
                    if (onPreDrawListener != null) {
                        wl3 wl3Var = kl3.f91651a;
                        viewGroup2.getViewTreeObserver().addOnPreDrawListener(new jl3(viewGroup2, onPreDrawListener));
                    }
                }
                zf0 zf0Var = se1Var.f94805c;
                anVar.f87750b = zf0Var;
                if (zf0Var != null) {
                    zf0Var.a(viewGroup2);
                }
                rmVar.a();
                return;
            }
        }
        rmVar.a(h9.f90287f);
    }
}
