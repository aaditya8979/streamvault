package yads;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class gc0 implements ew {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f89909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cw f89910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z30 f89911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f89912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lw f89913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wb2 f89914f;

    public gc0(View view, cw cwVar, z30 z30Var, long j10, lw lwVar, wb2 wb2Var) {
        this.f89909a = view;
        this.f89910b = cwVar;
        this.f89911c = z30Var;
        this.f89912d = j10;
        this.f89913e = lwVar;
        this.f89914f = wb2Var;
        cwVar.a(d());
    }

    @Override // yads.ew
    public final void a() {
        ((zb2) this.f89914f).d();
    }

    @Override // yads.ew
    public final void b() {
        ((zb2) this.f89914f).b();
    }

    @Override // yads.ew
    public final void c() {
        fc0 fc0Var = new fc0(this.f89909a, this.f89910b, this.f89911c);
        long jMax = (long) Math.max(0.0d, this.f89912d - this.f89913e.f92129a);
        if (jMax == 0) {
            this.f89910b.b(this.f89909a);
            return;
        }
        zb2 zb2Var = (zb2) this.f89914f;
        zb2Var.f97486e = this.f89913e;
        zb2Var.a(jMax, fc0Var);
        this.f89911c.a(y30.f96981d);
    }

    public final View d() {
        return this.f89909a;
    }

    @Override // yads.ew
    public final void invalidate() {
        ((zb2) this.f89914f).a();
    }
}
