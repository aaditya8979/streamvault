package yads;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class fw2 implements a83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f92 f89708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final in2 f89709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l61 f89710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wc2 f89711d;

    public fw2(tw1 tw1Var, in2 in2Var, l61 l61Var, wc2 wc2Var) {
        this.f89708a = tw1Var;
        this.f89709b = in2Var;
        this.f89710c = l61Var;
        this.f89711d = wc2Var;
    }

    @Override // yads.a83
    public final void a(Context context, m32 m32Var, l12 l12Var) {
        boolean z10;
        in2 in2Var = this.f89709b;
        if (!in2Var.f90924f) {
            in2Var.f90924f = true;
            fn2 fn2Var = in2Var.f90923e;
            fn2Var.f89643c.post(new en2(fn2Var, fn2Var.f89641a));
        }
        ((tw1) this.f89708a).a();
        this.f89711d.a(m32Var);
        if (l12Var != null) {
            l61 l61Var = this.f89710c;
            l61Var.f91890c.getClass();
            Object obj = dw2.f89000j;
            dw2 dw2VarA = cw2.a();
            nt2 nt2VarA = dw2VarA.a(context);
            Boolean bool = nt2VarA != null ? nt2VarA.N : null;
            synchronized (dw2.f89000j) {
                z10 = dw2VarA.f89005d;
            }
            boolean zC = dw2VarA.c();
            if (bool != null) {
                if (!bool.booleanValue()) {
                    return;
                }
            } else if ((!z10 || !ub.a(context)) && !zC) {
                return;
            }
            l61Var.f91889b.post(new k61(l61Var, l12Var));
        }
    }

    @Override // yads.a83
    public final void a(d61 d61Var) {
        ((tw1) this.f89708a).f95406j = d61Var;
    }

    @Override // yads.a83
    public final void a(l12 l12Var) {
        l61 l61Var = this.f89710c;
        l61Var.f91889b.removeCallbacksAndMessages(null);
        View viewA = l12Var.f91863c.a();
        if (viewA instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) viewA;
            n61 n61Var = l61Var.f91888a.f92273a;
            WeakReference weakReference = (WeakReference) n61Var.f92751d.get(frameLayout);
            mq mqVar = weakReference != null ? (mq) weakReference.get() : null;
            if (mqVar != null) {
                n61Var.f92751d.remove(frameLayout);
                frameLayout.removeView(mqVar);
            }
            WeakReference weakReference2 = (WeakReference) n61Var.f92752e.get(frameLayout);
            p61 p61Var = weakReference2 != null ? (p61) weakReference2.get() : null;
            if (p61Var != null) {
                n61Var.f92752e.remove(frameLayout);
                frameLayout.removeView(p61Var);
            }
        }
    }

    @Override // yads.a83
    public final void a(m32 m32Var) {
        in2 in2Var = this.f89709b;
        in2Var.f90924f = false;
        in2Var.f90923e.f89643c.removeCallbacksAndMessages(null);
        ((tw1) this.f89708a).b();
        this.f89711d.b(m32Var);
        this.f89710c.f91889b.removeCallbacksAndMessages(null);
    }

    @Override // yads.a83
    public final void a(m42 m42Var) {
        this.f89709b.f90922d.f90471c.f90052g = m42Var;
    }

    @Override // yads.a83
    public final void a(v9 v9Var, List list) {
        ((tw1) this.f89708a).a(v9Var, list);
    }
}
