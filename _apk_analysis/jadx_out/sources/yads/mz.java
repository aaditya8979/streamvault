package yads;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes12.dex */
public final class mz implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f92649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f92650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z3 f92651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d42 f92652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k63 f92653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gi0 f92654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nz f92655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hf1 f92656h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ay0 f92657i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public lz f92658j;

    public /* synthetic */ mz(v9 v9Var, b2 b2Var, z3 z3Var, d42 d42Var, k63 k63Var, gi0 gi0Var) {
        this(v9Var, b2Var, z3Var, d42Var, k63Var, gi0Var, new nz(), new hf1());
    }

    public mz(v9 v9Var, b2 b2Var, z3 z3Var, d42 d42Var, k63 k63Var, gi0 gi0Var, nz nzVar, hf1 hf1Var) {
        this.f92649a = v9Var;
        this.f92650b = b2Var;
        this.f92651c = z3Var;
        this.f92652d = d42Var;
        this.f92653e = k63Var;
        this.f92654f = gi0Var;
        this.f92655g = nzVar;
        this.f92656h = hf1Var;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        lz lzVar = new lz(this);
        this.f92650b.f87878b.add(lzVar);
        this.f92658j = lzVar;
        hf1 hf1Var = this.f92656h;
        hf1Var.f90397a.getClass();
        View viewFindViewWithTag = viewGroup.findViewWithTag("linear_progress_view");
        ProgressBar progressBar = viewFindViewWithTag instanceof ProgressBar ? (ProgressBar) viewFindViewWithTag : null;
        lm2 lm2Var = hf1Var.f90399c;
        KProperty kProperty = hf1.f90396d[0];
        lm2Var.getClass();
        lm2Var.f92035a = new WeakReference(progressBar);
        nz nzVar = this.f92655g;
        v9 v9Var = this.f92649a;
        z3 z3Var = this.f92651c;
        d42 d42Var = this.f92652d;
        k63 k63Var = this.f92653e;
        gi0 gi0Var = this.f92654f;
        hf1 hf1Var2 = this.f92656h;
        nzVar.getClass();
        d62 d62Var = d42Var.f88757a;
        o72 o72Var = d42Var.f88758b;
        String str = gi0Var != null ? gi0Var.f89988a : null;
        fg0[] fg0VarArr = fg0.f89568b;
        ay0 e32Var = tn.p.f(str, "pack_shot") ? new e32(z3Var, k63Var, hf1Var2) : d62Var != null ? new c62(d62Var, z3Var, hf1Var2, v9Var.f96008s) : o72Var != null ? new n72(o72Var, z3Var) : new e32(z3Var, k63Var, hf1Var2);
        e32Var.start();
        this.f92657i = e32Var;
    }

    @Override // yads.zf0
    public final void c() {
        lz lzVar = this.f92658j;
        if (lzVar != null) {
            this.f92650b.f87878b.remove(lzVar);
        }
        ay0 ay0Var = this.f92657i;
        if (ay0Var != null) {
            ay0Var.invalidate();
        }
        lm2 lm2Var = this.f92656h.f90399c;
        KProperty kProperty = hf1.f90396d[0];
        lm2Var.getClass();
        lm2Var.f92035a = new WeakReference(null);
    }
}
