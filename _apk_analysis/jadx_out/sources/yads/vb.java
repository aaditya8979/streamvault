package yads;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class vb implements kk3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l12 f96049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gv f96050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final if1 f96051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hl3 f96052d;

    public vb(l12 l12Var, gv gvVar, if1 if1Var, hl3 hl3Var) {
        this.f96049a = l12Var;
        this.f96050b = gvVar;
        this.f96051c = if1Var;
        this.f96052d = hl3Var;
    }

    @Override // yads.kk3
    public final void a(View view, oi oiVar) {
        if (view.getTag() == null) {
            hl3 hl3Var = this.f96052d;
            String str = oiVar.f93229a;
            hl3Var.getClass();
            view.setTag(hl3.a(str));
        }
    }

    @Override // yads.kk3
    public final void a(oi oiVar, fv fvVar) {
        if1 if1Var = oiVar.f93232d;
        if (if1Var == null) {
            if1Var = this.f96051c;
        }
        gv gvVar = this.f96050b;
        l12 l12Var = this.f96049a;
        gvVar.getClass();
        if (!oiVar.f93233e || if1Var == null) {
            return;
        }
        fvVar.a(if1Var, new hv(oiVar, gvVar.f90125a, l12Var, gvVar.f90126b, gvVar.f90127c));
    }
}
