package yads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes12.dex */
public final class qw implements zf0, c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f94181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f94182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cw f94183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kz f94184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final cz1 f94185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z30 f94186f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k63 f94187g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ew f94188h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final sj2 f94189i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final yv f94190j;

    public qw(v9 v9Var, b2 b2Var, cw cwVar, kz kzVar, cz1 cz1Var, z30 z30Var, k63 k63Var) {
        this.f94181a = v9Var;
        this.f94182b = b2Var;
        this.f94183c = cwVar;
        this.f94184d = kzVar;
        this.f94185e = cz1Var;
        this.f94186f = z30Var;
        this.f94187g = k63Var;
        this.f94189i = k63Var.d();
        this.f94190j = k63Var.a();
    }

    @Override // yads.c2
    public final void a() {
        ew ewVar = this.f94188h;
        if (ewVar != null) {
            ewVar.a();
        }
    }

    public final void a(View view, ProgressBar progressBar) {
        Long l10 = this.f94181a.f95999j;
        long jLongValue = l10 != null ? l10.longValue() : 0L;
        ew lj2Var = progressBar != null ? new lj2(view, progressBar, new am0(), new kw(new ff()), this.f94186f, this.f94189i, jLongValue) : this.f94190j.a() ? new gc0(view, this.f94183c, this.f94186f, jLongValue, this.f94187g.f91501e, vb2.a(true)) : null;
        this.f94188h = lj2Var;
        if (lj2Var != null) {
            lj2Var.c();
        }
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        View viewC = this.f94185e.c(viewGroup);
        ProgressBar progressBarA = this.f94185e.a(viewGroup);
        if (viewC != null) {
            this.f94182b.f87878b.add(this);
            Context context = viewC.getContext();
            Object obj = dw2.f89000j;
            nt2 nt2VarA = cw2.a().a(context);
            boolean z10 = false;
            boolean z11 = nt2VarA != null && nt2VarA.D;
            eg0[] eg0VarArr = eg0.f89242b;
            if (tn.p.f("divkit", this.f94181a.f96000k) && z11) {
                z10 = true;
            }
            if (!z10) {
                viewC.setOnClickListener(new pw(this.f94184d, this.f94186f));
            }
            a(viewC, progressBarA);
            if (viewC.getTag() == null) {
                viewC.setTag("close");
            }
        }
    }

    @Override // yads.c2
    public final void b() {
        ew ewVar = this.f94188h;
        if (ewVar != null) {
            ewVar.b();
        }
    }

    @Override // yads.zf0
    public final void c() {
        this.f94182b.f87878b.remove(this);
        ew ewVar = this.f94188h;
        if (ewVar != null) {
            ewVar.invalidate();
        }
    }
}
