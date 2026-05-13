package com.inmobi.media;

import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes10.dex */
public final class Ym implements go.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3316bn f26668a;

    public Ym(p000do.l0 l0Var, C3316bn c3316bn) {
        this.f26668a = c3316bn;
    }

    @Override // go.e
    public final Object emit(Object obj, hn.c cVar) {
        ProgressBar progressBar;
        Rl rl2 = (Rl) obj;
        C3316bn c3316bn = this.f26668a;
        c3316bn.getClass();
        if (rl2 instanceof C3544kn) {
            ProgressBar progressBar2 = c3316bn.f26888e;
            if (progressBar2 != null) {
                progressBar2.setVisibility(0);
            }
        } else if (rl2 instanceof Xm) {
            int i10 = ((Xm) rl2).f26603b;
            ProgressBar progressBar3 = c3316bn.f26888e;
            if (progressBar3 != null) {
                H6.a(c3316bn.f26889f);
                c3316bn.f26889f = P4.a(c3316bn.f26884a, new C3290an(progressBar3, c3316bn, i10, null));
            }
        } else if ((rl2 instanceof Pl) && c3316bn.f26886c.f25445b && (progressBar = c3316bn.f26888e) != null) {
            progressBar.setVisibility(8);
        }
        return bn.r.f5635a;
    }
}
