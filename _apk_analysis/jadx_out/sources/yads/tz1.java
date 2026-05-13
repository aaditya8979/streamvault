package yads;

import android.os.SystemClock;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class tz1 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oi f95436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y3 f95437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l12 f95438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kn2 f95439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final if1 f95440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jx0 f95441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p000do.l0 f95442g = z10.b(null);

    public tz1(jx0 jx0Var, kn2 kn2Var, y3 y3Var, l12 l12Var, oi oiVar, if1 if1Var) {
        this.f95436a = oiVar;
        this.f95437b = y3Var;
        this.f95438c = l12Var;
        this.f95439d = kn2Var;
        this.f95440e = if1Var;
        this.f95441f = jx0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jElapsedRealtime;
        Long l10 = this.f95439d.f91667a;
        if (l10 != null) {
            jElapsedRealtime = SystemClock.elapsedRealtime() - l10.longValue();
        } else {
            jElapsedRealtime = 0;
        }
        if1 if1Var = this.f95440e;
        if (if1Var == null || jElapsedRealtime < if1Var.f90806e || !this.f95436a.f93233e) {
            return;
        }
        p000do.i.d(this.f95442g, null, null, new sz1(this, view, null), 3, null);
    }
}
