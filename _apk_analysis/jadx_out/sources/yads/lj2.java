package yads;

import android.view.View;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes2.dex */
public final class lj2 implements ew {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f91999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProgressBar f92000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cw f92001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kw f92002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z30 f92003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sj2 f92004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f92005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zb2 f92006h = vb2.a(true);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final kj2 f92007i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jj2 f92008j;

    public lj2(View view, ProgressBar progressBar, am0 am0Var, kw kwVar, z30 z30Var, sj2 sj2Var, long j10) {
        this.f91999a = view;
        this.f92000b = progressBar;
        this.f92001c = am0Var;
        this.f92002d = kwVar;
        this.f92003e = z30Var;
        this.f92004f = sj2Var;
        this.f92005g = j10;
        this.f92007i = new kj2(d(), am0Var, z30Var);
        this.f92008j = new jj2(progressBar, kwVar, j10);
    }

    @Override // yads.ew
    public final void a() {
        this.f92006h.d();
    }

    @Override // yads.ew
    public final void b() {
        this.f92006h.b();
    }

    @Override // yads.ew
    public final void c() {
        kw kwVar = this.f92002d;
        ProgressBar progressBar = this.f92000b;
        int i10 = (int) this.f92005g;
        int i11 = (int) this.f92004f.f94850a;
        kwVar.getClass();
        progressBar.setMax(i10);
        progressBar.setVisibility(0);
        progressBar.setProgress(i11);
        long jMax = Math.max(0L, this.f92005g - this.f92004f.f94850a);
        if (jMax != 0) {
            this.f92001c.a(this.f91999a);
            zb2 zb2Var = this.f92006h;
            zb2Var.f97486e = this.f92008j;
            zb2Var.a(jMax, this.f92007i);
            this.f92003e.a(y30.f96981d);
        }
    }

    public final View d() {
        return this.f91999a;
    }

    @Override // yads.ew
    public final void invalidate() {
        this.f92006h.a();
    }
}
