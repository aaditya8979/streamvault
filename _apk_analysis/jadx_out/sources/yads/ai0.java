package yads;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class ai0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zh0 f87706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ci0 f87707b;

    public ai0(zh0 zh0Var, ci0 ci0Var) {
        this.f87706a = zh0Var;
        this.f87707b = ci0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view != null) {
            this.f87706a.a(this.f87707b.f88466a, view);
        }
    }
}
