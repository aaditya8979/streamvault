package yads;

import android.view.View;

/* JADX INFO: loaded from: classes12.dex */
public final class ob implements kk3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l12 f93165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gv f93166b;

    public ob(l12 l12Var, gv gvVar) {
        this.f93165a = l12Var;
        this.f93166b = gvVar;
    }

    @Override // yads.kk3
    public final void a(View view, oi oiVar) {
    }

    @Override // yads.kk3
    public final void a(oi oiVar, fv fvVar) {
        if1 if1Var = oiVar.f93232d;
        gv gvVar = this.f93166b;
        l12 l12Var = this.f93165a;
        gvVar.getClass();
        if (!oiVar.f93233e || if1Var == null) {
            return;
        }
        fvVar.a(if1Var, new hv(oiVar, gvVar.f90125a, l12Var, gvVar.f90126b, gvVar.f90127c));
    }
}
